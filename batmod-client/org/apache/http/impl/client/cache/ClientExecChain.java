package org.apache.http.impl.client.cache;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.client.cache.CacheResponseStatus;
import org.apache.http.client.cache.HttpCacheEntry;
import org.apache.http.client.cache.HttpCacheStorage;
import org.apache.http.client.cache.ResourceFactory;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.DateUtils;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.VersionInfo;

@ThreadSafe
public class CachingExec implements ClientExecChain {
   private static final boolean SUPPORTS_RANGE_AND_CONTENT_RANGE_HEADERS = false;
   private final AtomicLong cacheHits = new AtomicLong();
   private final AtomicLong cacheMisses = new AtomicLong();
   private final AtomicLong cacheUpdates = new AtomicLong();
   private final Map<ProtocolVersion, String> viaHeaders = new HashMap<>(4);
   private final CacheConfig cacheConfig;
   private final ClientExecChain backend;
   private final HttpCache responseCache;
   private final CacheValidityPolicy validityPolicy;
   private final CachedHttpResponseGenerator responseGenerator;
   private final CacheableRequestPolicy cacheableRequestPolicy;
   private final CachedResponseSuitabilityChecker suitabilityChecker;
   private final ConditionalRequestBuilder conditionalRequestBuilder;
   private final ResponseProtocolCompliance responseCompliance;
   private final RequestProtocolCompliance requestCompliance;
   private final ResponseCachingPolicy responseCachingPolicy;
   private final AsynchronousValidator asynchRevalidator;
   private final Log log = LogFactory.getLog(this.getClass());

   public CachingExec(ClientExecChain backend, HttpCache cache, CacheConfig config) {
      this(backend, cache, config, null);
   }

   public CachingExec(ClientExecChain backend, HttpCache cache, CacheConfig config, AsynchronousValidator asynchRevalidator) {
      Args.notNull(backend, "HTTP backend");
      Args.notNull(cache, "HttpCache");
      this.cacheConfig = config != null ? config : CacheConfig.DEFAULT;
      this.backend = backend;
      this.responseCache = cache;
      this.validityPolicy = new CacheValidityPolicy();
      this.responseGenerator = new CachedHttpResponseGenerator(this.validityPolicy);
      this.cacheableRequestPolicy = new CacheableRequestPolicy();
      this.suitabilityChecker = new CachedResponseSuitabilityChecker(this.validityPolicy, config);
      this.conditionalRequestBuilder = new ConditionalRequestBuilder();
      this.responseCompliance = new ResponseProtocolCompliance();
      this.requestCompliance = new RequestProtocolCompliance(config.isWeakETagOnPutDeleteAllowed());
      this.responseCachingPolicy = new ResponseCachingPolicy(
         this.cacheConfig.getMaxObjectSize(),
         this.cacheConfig.isSharedCache(),
         this.cacheConfig.isNeverCacheHTTP10ResponsesWithQuery(),
         this.cacheConfig.is303CachingEnabled()
      );
      this.asynchRevalidator = asynchRevalidator;
   }

   public CachingExec(ClientExecChain backend, ResourceFactory resourceFactory, HttpCacheStorage storage, CacheConfig config) {
      this(backend, new BasicHttpCache(resourceFactory, storage, config), config);
   }

   public CachingExec(ClientExecChain backend) {
      this(backend, new BasicHttpCache(), CacheConfig.DEFAULT);
   }

   CachingExec(
      ClientExecChain backend,
      HttpCache responseCache,
      CacheValidityPolicy validityPolicy,
      ResponseCachingPolicy responseCachingPolicy,
      CachedHttpResponseGenerator responseGenerator,
      CacheableRequestPolicy cacheableRequestPolicy,
      CachedResponseSuitabilityChecker suitabilityChecker,
      ConditionalRequestBuilder conditionalRequestBuilder,
      ResponseProtocolCompliance responseCompliance,
      RequestProtocolCompliance requestCompliance,
      CacheConfig config,
      AsynchronousValidator asynchRevalidator
   ) {
      this.cacheConfig = config != null ? config : CacheConfig.DEFAULT;
      this.backend = backend;
      this.responseCache = responseCache;
      this.validityPolicy = validityPolicy;
      this.responseCachingPolicy = responseCachingPolicy;
      this.responseGenerator = responseGenerator;
      this.cacheableRequestPolicy = cacheableRequestPolicy;
      this.suitabilityChecker = suitabilityChecker;
      this.conditionalRequestBuilder = conditionalRequestBuilder;
      this.responseCompliance = responseCompliance;
      this.requestCompliance = requestCompliance;
      this.asynchRevalidator = asynchRevalidator;
   }

   public long getCacheHits() {
      return this.cacheHits.get();
   }

   public long getCacheMisses() {
      return this.cacheMisses.get();
   }

   public long getCacheUpdates() {
      return this.cacheUpdates.get();
   }

   public CloseableHttpResponse execute(HttpRoute route, HttpRequestWrapper request) throws IOException, HttpException {
      return this.execute(route, request, HttpClientContext.create(), null);
   }

   public CloseableHttpResponse execute(HttpRoute route, HttpRequestWrapper request, HttpClientContext context) throws IOException, HttpException {
      return this.execute(route, request, context, null);
   }

   public CloseableHttpResponse execute(HttpRoute route, HttpRequestWrapper request, HttpClientContext context, HttpExecutionAware execAware) throws IOException, HttpException {
      HttpHost target = context.getTargetHost();
      String via = this.generateViaHeader(request.getOriginal());
      this.setResponseStatus(context, CacheResponseStatus.CACHE_MISS);
      if (this.clientRequestsOurOptions(request)) {
         this.setResponseStatus(context, CacheResponseStatus.CACHE_MODULE_RESPONSE);
         return Proxies.enhanceResponse(new OptionsHttp11Response());
      } else {
         HttpResponse fatalErrorResponse = this.getFatallyNoncompliantResponse(request, context);
         if (fatalErrorResponse != null) {
            return Proxies.enhanceResponse(fatalErrorResponse);
         } else {
            this.requestCompliance.makeRequestCompliant(request);
            request.addHeader("Via", via);
            this.flushEntriesInvalidatedByRequest(context.getTargetHost(), request);
            if (!this.cacheableRequestPolicy.isServableFromCache(request)) {
               this.log.debug("Request is not servable from cache");
               return this.callBackend(route, request, context, execAware);
            } else {
               HttpCacheEntry entry = this.satisfyFromCache(target, request);
               if (entry == null) {
                  this.log.debug("Cache miss");
                  return this.handleCacheMiss(route, request, context, execAware);
               } else {
                  return this.handleCacheHit(route, request, context, execAware, entry);
               }
            }
         }
      }
   }

   private CloseableHttpResponse handleCacheHit(
      HttpRoute route, HttpRequestWrapper request, HttpClientContext context, HttpExecutionAware execAware, HttpCacheEntry entry
   ) throws IOException, HttpException {
      HttpHost target = context.getTargetHost();
      this.recordCacheHit(target, request);
      CloseableHttpResponse out = null;
      Date now = this.getCurrentDate();
      if (this.suitabilityChecker.canCachedResponseBeUsed(target, request, entry, now)) {
         this.log.debug("Cache hit");
         out = this.generateCachedResponse(request, context, entry, now);
      } else {
         if (this.mayCallBackend(request)) {
            if (entry.getStatusCode() == 304 && !this.suitabilityChecker.isConditional(request)) {
               this.log.debug("Cache entry not usable; calling backend");
               return this.callBackend(route, request, context, execAware);
            }

            this.log.debug("Revalidating cache entry");
            return this.revalidateCacheEntry(route, request, context, execAware, entry, now);
         }

         this.log.debug("Cache entry not suitable but only-if-cached requested");
         out = this.generateGatewayTimeout(context);
      }

      context.setAttribute("http.route", route);
      context.setAttribute("http.target_host", target);
      context.setAttribute("http.request", request);
      context.setAttribute("http.response", out);
      context.setAttribute("http.request_sent", Boolean.TRUE);
      return out;
   }

   private CloseableHttpResponse revalidateCacheEntry(
      HttpRoute route, HttpRequestWrapper request, HttpClientContext context, HttpExecutionAware execAware, HttpCacheEntry entry, Date now
   ) throws HttpException {
      try {
         if (this.asynchRevalidator != null
            && !this.staleResponseNotAllowed(request, entry, now)
            && this.validityPolicy.mayReturnStaleWhileRevalidating(entry, now)) {
            this.log.trace("Serving stale with asynchronous revalidation");
            CloseableHttpResponse resp = this.generateCachedResponse(request, context, entry, now);
            this.asynchRevalidator.revalidateCacheEntry(this, route, request, context, execAware, entry);
            return resp;
         } else {
            return this.revalidateCacheEntry(route, request, context, execAware, entry);
         }
      } catch (IOException ioex) {
         return this.handleRevalidationFailure(request, context, entry, now);
      }
   }

   private CloseableHttpResponse handleCacheMiss(HttpRoute route, HttpRequestWrapper request, HttpClientContext context, HttpExecutionAware execAware) throws IOException, HttpException {
      HttpHost target = context.getTargetHost();
      this.recordCacheMiss(target, request);
      if (!this.mayCallBackend(request)) {
         return Proxies.enhanceResponse(new BasicHttpResponse(HttpVersion.HTTP_1_1, 504, "Gateway Timeout"));
      }

      Map<String, Variant> variants = this.getExistingCacheVariants(target, request);
      return variants != null && variants.size() > 0
         ? this.negotiateResponseFromVariants(route, request, context, execAware, variants)
         : this.callBackend(route, request, context, execAware);
   }

   private HttpCacheEntry satisfyFromCache(HttpHost target, HttpRequestWrapper request) {
      HttpCacheEntry entry = null;

      try {
         entry = this.responseCache.getCacheEntry(target, request);
      } catch (IOException ioe) {
         this.log.warn("Unable to retrieve entries from cache", ioe);
      }

      return entry;
   }

   private HttpResponse getFatallyNoncompliantResponse(HttpRequestWrapper request, HttpContext context) {
      HttpResponse fatalErrorResponse = null;

      for (RequestProtocolError error : this.requestCompliance.requestIsFatallyNonCompliant(request)) {
         this.setResponseStatus(context, CacheResponseStatus.CACHE_MODULE_RESPONSE);
         fatalErrorResponse = this.requestCompliance.getErrorForRequest(error);
      }

      return fatalErrorResponse;
   }

   private Map<String, Variant> getExistingCacheVariants(HttpHost target, HttpRequestWrapper request) {
      Map<String, Variant> variants = null;

      try {
         variants = this.responseCache.getVariantCacheEntriesWithEtags(target, request);
      } catch (IOException ioe) {
         this.log.warn("Unable to retrieve variant entries from cache", ioe);
      }

      return variants;
   }

   private void recordCacheMiss(HttpHost target, HttpRequestWrapper request) {
      this.cacheMisses.getAndIncrement();
      if (this.log.isTraceEnabled()) {
         RequestLine rl = request.getRequestLine();
         this.log.trace("Cache miss [host: " + target + "; uri: " + rl.getUri() + "]");
      }
   }

   private void recordCacheHit(HttpHost target, HttpRequestWrapper request) {
      this.cacheHits.getAndIncrement();
      if (this.log.isTraceEnabled()) {
         RequestLine rl = request.getRequestLine();
         this.log.trace("Cache hit [host: " + target + "; uri: " + rl.getUri() + "]");
      }
   }

   private void recordCacheUpdate(HttpContext context) {
      this.cacheUpdates.getAndIncrement();
      this.setResponseStatus(context, CacheResponseStatus.VALIDATED);
   }

   private void flushEntriesInvalidatedByRequest(HttpHost target, HttpRequestWrapper request) {
      try {
         this.responseCache.flushInvalidatedCacheEntriesFor(target, request);
      } catch (IOException ioe) {
         this.log.warn("Unable to flush invalidated entries from cache", ioe);
      }
   }

   private CloseableHttpResponse generateCachedResponse(HttpRequestWrapper request, HttpContext context, HttpCacheEntry entry, Date now) {
      CloseableHttpResponse cachedResponse;
      if (!request.containsHeader("If-None-Match") && !request.containsHeader("If-Modified-Since")) {
         cachedResponse = this.responseGenerator.generateResponse(entry);
      } else {
         cachedResponse = this.responseGenerator.generateNotModifiedResponse(entry);
      }

      this.setResponseStatus(context, CacheResponseStatus.CACHE_HIT);
      if (this.validityPolicy.getStalenessSecs(entry, now) > 0L) {
         cachedResponse.addHeader("Warning", "110 localhost \"Response is stale\"");
      }

      return cachedResponse;
   }

   private CloseableHttpResponse handleRevalidationFailure(HttpRequestWrapper request, HttpContext context, HttpCacheEntry entry, Date now) {
      return this.staleResponseNotAllowed(request, entry, now) ? this.generateGatewayTimeout(context) : this.unvalidatedCacheHit(context, entry);
   }

   private CloseableHttpResponse generateGatewayTimeout(HttpContext context) {
      this.setResponseStatus(context, CacheResponseStatus.CACHE_MODULE_RESPONSE);
      return Proxies.enhanceResponse(new BasicHttpResponse(HttpVersion.HTTP_1_1, 504, "Gateway Timeout"));
   }

   private CloseableHttpResponse unvalidatedCacheHit(HttpContext context, HttpCacheEntry entry) {
      CloseableHttpResponse cachedResponse = this.responseGenerator.generateResponse(entry);
      this.setResponseStatus(context, CacheResponseStatus.CACHE_HIT);
      cachedResponse.addHeader("Warning", "111 localhost \"Revalidation failed\"");
      return cachedResponse;
   }

   private boolean staleResponseNotAllowed(HttpRequestWrapper request, HttpCacheEntry entry, Date now) {
      return this.validityPolicy.mustRevalidate(entry)
         || this.cacheConfig.isSharedCache() && this.validityPolicy.proxyRevalidate(entry)
         || this.explicitFreshnessRequest(request, entry, now);
   }

   private boolean mayCallBackend(HttpRequestWrapper request) {
      for (Header h : request.getHeaders("Cache-Control")) {
         for (HeaderElement elt : h.getElements()) {
            if ("only-if-cached".equals(elt.getName())) {
               this.log.trace("Request marked only-if-cached");
               return false;
            }
         }
      }

      return true;
   }

   private boolean explicitFreshnessRequest(HttpRequestWrapper request, HttpCacheEntry entry, Date now) {
      for (Header h : request.getHeaders("Cache-Control")) {
         for (HeaderElement elt : h.getElements()) {
            if ("max-stale".equals(elt.getName())) {
               try {
                  int maxstale = Integer.parseInt(elt.getValue());
                  long age = this.validityPolicy.getCurrentAgeSecs(entry, now);
                  long lifetime = this.validityPolicy.getFreshnessLifetimeSecs(entry);
                  if (age - lifetime > maxstale) {
                     return true;
                  }
               } catch (NumberFormatException nfe) {
                  return true;
               }
            } else if ("min-fresh".equals(elt.getName()) || "max-age".equals(elt.getName())) {
               return true;
            }
         }
      }

      return false;
   }

   private String generateViaHeader(HttpMessage msg) {
      ProtocolVersion pv = msg.getProtocolVersion();
      String existingEntry = this.viaHeaders.get(pv);
      if (existingEntry != null) {
         return existingEntry;
      }

      VersionInfo vi = VersionInfo.loadVersionInfo("org.apache.http.client", this.getClass().getClassLoader());
      String release = vi != null ? vi.getRelease() : "UNAVAILABLE";
      String value;
      if ("http".equalsIgnoreCase(pv.getProtocol())) {
         value = String.format("%d.%d localhost (Apache-HttpClient/%s (cache))", pv.getMajor(), pv.getMinor(), release);
      } else {
         value = String.format("%s/%d.%d localhost (Apache-HttpClient/%s (cache))", pv.getProtocol(), pv.getMajor(), pv.getMinor(), release);
      }

      this.viaHeaders.put(pv, value);
      return value;
   }

   private void setResponseStatus(HttpContext context, CacheResponseStatus value) {
      if (context != null) {
         context.setAttribute("http.cache.response.status", value);
      }
   }

   public boolean supportsRangeAndContentRangeHeaders() {
      return false;
   }

   Date getCurrentDate() {
      return new Date();
   }

   boolean clientRequestsOurOptions(HttpRequest request) {
      RequestLine line = request.getRequestLine();
      if (!"OPTIONS".equals(line.getMethod())) {
         return false;
      } else {
         return !"*".equals(line.getUri()) ? false : "0".equals(request.getFirstHeader("Max-Forwards").getValue());
      }
   }

   CloseableHttpResponse callBackend(HttpRoute route, HttpRequestWrapper request, HttpClientContext context, HttpExecutionAware execAware) throws IOException, HttpException {
      Date requestDate = this.getCurrentDate();
      this.log.trace("Calling the backend");
      CloseableHttpResponse backendResponse = this.backend.execute(route, request, context, execAware);

      try {
         backendResponse.addHeader("Via", this.generateViaHeader(backendResponse));
         return this.handleBackendResponse(route, request, context, execAware, requestDate, this.getCurrentDate(), backendResponse);
      } catch (IOException ex) {
         backendResponse.close();
         throw ex;
      } catch (RuntimeException ex) {
         backendResponse.close();
         throw ex;
      }
   }

   private boolean revalidationResponseIsTooOld(HttpResponse backendResponse, HttpCacheEntry cacheEntry) {
      Header entryDateHeader = cacheEntry.getFirstHeader("Date");
      Header responseDateHeader = backendResponse.getFirstHeader("Date");
      if (entryDateHeader != null && responseDateHeader != null) {
         Date entryDate = DateUtils.parseDate(entryDateHeader.getValue());
         Date respDate = DateUtils.parseDate(responseDateHeader.getValue());
         if (entryDate == null || respDate == null) {
            return false;
         }

         if (respDate.before(entryDate)) {
            return true;
         }
      }

      return false;
   }

   CloseableHttpResponse negotiateResponseFromVariants(
      HttpRoute route, HttpRequestWrapper request, HttpClientContext context, HttpExecutionAware execAware, Map<String, Variant> variants
   ) throws IOException, HttpException {
      HttpRequestWrapper conditionalRequest = this.conditionalRequestBuilder.buildConditionalRequestFromVariants(request, variants);
      Date requestDate = this.getCurrentDate();
      CloseableHttpResponse backendResponse = this.backend.execute(route, conditionalRequest, context, execAware);

      try {
         Date responseDate = this.getCurrentDate();
         backendResponse.addHeader("Via", this.generateViaHeader(backendResponse));
         if (backendResponse.getStatusLine().getStatusCode() != 304) {
            return this.handleBackendResponse(route, request, context, execAware, requestDate, responseDate, backendResponse);
         } else {
            Header resultEtagHeader = backendResponse.getFirstHeader("ETag");
            if (resultEtagHeader == null) {
               this.log.warn("304 response did not contain ETag");
               IOUtils.consume(backendResponse.getEntity());
               backendResponse.close();
               return this.callBackend(route, request, context, execAware);
            } else {
               String resultEtag = resultEtagHeader.getValue();
               Variant matchingVariant = variants.get(resultEtag);
               if (matchingVariant == null) {
                  this.log.debug("304 response did not contain ETag matching one sent in If-None-Match");
                  IOUtils.consume(backendResponse.getEntity());
                  backendResponse.close();
                  return this.callBackend(route, request, context, execAware);
               } else {
                  HttpCacheEntry matchedEntry = matchingVariant.getEntry();
                  if (this.revalidationResponseIsTooOld(backendResponse, matchedEntry)) {
                     IOUtils.consume(backendResponse.getEntity());
                     backendResponse.close();
                     return this.retryRequestUnconditionally(route, request, context, execAware, matchedEntry);
                  } else {
                     this.recordCacheUpdate(context);
                     HttpCacheEntry responseEntry = this.getUpdatedVariantEntry(
                        context.getTargetHost(), conditionalRequest, requestDate, responseDate, backendResponse, matchingVariant, matchedEntry
                     );
                     backendResponse.close();
                     CloseableHttpResponse resp = this.responseGenerator.generateResponse(responseEntry);
                     this.tryToUpdateVariantMap(context.getTargetHost(), request, matchingVariant);
                     return this.shouldSendNotModifiedResponse(request, responseEntry)
                        ? this.responseGenerator.generateNotModifiedResponse(responseEntry)
                        : resp;
                  }
               }
            }
         }
      } catch (IOException ex) {
         backendResponse.close();
         throw ex;
      } catch (RuntimeException ex) {
         backendResponse.close();
         throw ex;
      }
   }

   private CloseableHttpResponse retryRequestUnconditionally(
      HttpRoute route, HttpRequestWrapper request, HttpClientContext context, HttpExecutionAware execAware, HttpCacheEntry matchedEntry
   ) throws IOException, HttpException {
      HttpRequestWrapper unconditional = this.conditionalRequestBuilder.buildUnconditionalRequest(request, matchedEntry);
      return this.callBackend(route, unconditional, context, execAware);
   }

   private HttpCacheEntry getUpdatedVariantEntry(
      HttpHost target,
      HttpRequestWrapper conditionalRequest,
      Date requestDate,
      Date responseDate,
      CloseableHttpResponse backendResponse,
      Variant matchingVariant,
      HttpCacheEntry matchedEntry
   ) throws IOException {
      HttpCacheEntry responseEntry = matchedEntry;

      try {
         responseEntry = this.responseCache
            .updateVariantCacheEntry(target, conditionalRequest, matchedEntry, backendResponse, requestDate, responseDate, matchingVariant.getCacheKey());
      } catch (IOException ioe) {
         this.log.warn("Could not update cache entry", ioe);
      } finally {
         backendResponse.close();
      }

      return responseEntry;
   }

   private void tryToUpdateVariantMap(HttpHost target, HttpRequestWrapper request, Variant matchingVariant) {
      try {
         this.responseCache.reuseVariantEntryFor(target, request, matchingVariant);
      } catch (IOException ioe) {
         this.log.warn("Could not update cache entry to reuse variant", ioe);
      }
   }

   private boolean shouldSendNotModifiedResponse(HttpRequestWrapper request, HttpCacheEntry responseEntry) {
      return this.suitabilityChecker.isConditional(request) && this.suitabilityChecker.allConditionalsMatch(request, responseEntry, new Date());
   }

   CloseableHttpResponse revalidateCacheEntry(
      HttpRoute route, HttpRequestWrapper request, HttpClientContext context, HttpExecutionAware execAware, HttpCacheEntry cacheEntry
   ) throws IOException, HttpException {
      HttpRequestWrapper conditionalRequest = this.conditionalRequestBuilder.buildConditionalRequest(request, cacheEntry);
      Date requestDate = this.getCurrentDate();
      CloseableHttpResponse backendResponse = this.backend.execute(route, conditionalRequest, context, execAware);
      Date responseDate = this.getCurrentDate();
      if (this.revalidationResponseIsTooOld(backendResponse, cacheEntry)) {
         backendResponse.close();
         HttpRequestWrapper unconditional = this.conditionalRequestBuilder.buildUnconditionalRequest(request, cacheEntry);
         requestDate = this.getCurrentDate();
         backendResponse = this.backend.execute(route, unconditional, context, execAware);
         responseDate = this.getCurrentDate();
      }

      backendResponse.addHeader("Via", this.generateViaHeader(backendResponse));
      int statusCode = backendResponse.getStatusLine().getStatusCode();
      if (statusCode == 304 || statusCode == 200) {
         this.recordCacheUpdate(context);
      }

      if (statusCode == 304) {
         HttpCacheEntry updatedEntry = this.responseCache
            .updateCacheEntry(context.getTargetHost(), request, cacheEntry, backendResponse, requestDate, responseDate);
         return this.suitabilityChecker.isConditional(request) && this.suitabilityChecker.allConditionalsMatch(request, updatedEntry, new Date())
            ? this.responseGenerator.generateNotModifiedResponse(updatedEntry)
            : this.responseGenerator.generateResponse(updatedEntry);
      }

      if (this.staleIfErrorAppliesTo(statusCode)
         && !this.staleResponseNotAllowed(request, cacheEntry, this.getCurrentDate())
         && this.validityPolicy.mayReturnStaleIfError(request, cacheEntry, responseDate)) {
         try {
            CloseableHttpResponse cachedResponse = this.responseGenerator.generateResponse(cacheEntry);
            cachedResponse.addHeader("Warning", "110 localhost \"Response is stale\"");
            return cachedResponse;
         } finally {
            backendResponse.close();
         }
      } else {
         return this.handleBackendResponse(route, conditionalRequest, context, execAware, requestDate, responseDate, backendResponse);
      }
   }

   private boolean staleIfErrorAppliesTo(int statusCode) {
      return statusCode == 500 || statusCode == 502 || statusCode == 503 || statusCode == 504;
   }

   CloseableHttpResponse handleBackendResponse(
      HttpRoute route,
      HttpRequestWrapper request,
      HttpClientContext context,
      HttpExecutionAware execAware,
      Date requestDate,
      Date responseDate,
      CloseableHttpResponse backendResponse
   ) throws IOException {
      this.log.trace("Handling Backend response");
      this.responseCompliance.ensureProtocolCompliance(request, backendResponse);
      HttpHost target = context.getTargetHost();
      boolean cacheable = this.responseCachingPolicy.isResponseCacheable(request, backendResponse);
      this.responseCache.flushInvalidatedCacheEntriesFor(target, request, backendResponse);
      if (cacheable && !this.alreadyHaveNewerCacheEntry(target, request, backendResponse)) {
         this.storeRequestIfModifiedSinceFor304Response(request, backendResponse);
         return this.responseCache.cacheAndReturnResponse(target, request, backendResponse, requestDate, responseDate);
      }

      if (!cacheable) {
         try {
            this.responseCache.flushCacheEntriesFor(target, request);
         } catch (IOException ioe) {
            this.log.warn("Unable to flush invalid cache entries", ioe);
         }
      }

      return backendResponse;
   }

   private void storeRequestIfModifiedSinceFor304Response(HttpRequest request, HttpResponse backendResponse) {
      if (backendResponse.getStatusLine().getStatusCode() == 304) {
         Header h = request.getFirstHeader("If-Modified-Since");
         if (h != null) {
            backendResponse.addHeader("Last-Modified", h.getValue());
         }
      }
   }

   private boolean alreadyHaveNewerCacheEntry(HttpHost target, HttpRequestWrapper request, HttpResponse backendResponse) {
      HttpCacheEntry existing = null;

      try {
         existing = this.responseCache.getCacheEntry(target, request);
      } catch (IOException ioe) {
      }

      if (existing == null) {
         return false;
      }

      Header entryDateHeader = existing.getFirstHeader("Date");
      if (entryDateHeader == null) {
         return false;
      }

      Header responseDateHeader = backendResponse.getFirstHeader("Date");
      if (responseDateHeader == null) {
         return false;
      }

      Date entryDate = DateUtils.parseDate(entryDateHeader.getValue());
      Date responseDate = DateUtils.parseDate(responseDateHeader.getValue());
      return entryDate != null && responseDate != null ? responseDate.before(entryDate) : false;
   }
}
