package org.apache.http.impl.client.cache;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.cache.HttpCacheEntry;
import org.apache.http.client.cache.HttpCacheInvalidator;
import org.apache.http.client.cache.HttpCacheStorage;
import org.apache.http.client.utils.DateUtils;

@Immutable
class CacheInvalidator implements HttpCacheInvalidator {
   private final HttpCacheStorage storage;
   private final CacheKeyGenerator cacheKeyGenerator;
   private final Log log = LogFactory.getLog(this.getClass());

   public CacheInvalidator(CacheKeyGenerator uriExtractor, HttpCacheStorage storage) {
      this.cacheKeyGenerator = uriExtractor;
      this.storage = storage;
   }

   @Override
   public void flushInvalidatedCacheEntries(HttpHost host, HttpRequest req) {
      if (this.requestShouldNotBeCached(req)) {
         this.log.debug("Request should not be cached");
         String theUri = this.cacheKeyGenerator.getURI(host, req);
         HttpCacheEntry parent = this.getEntry(theUri);
         this.log.debug("parent entry: " + parent);
         if (parent != null) {
            for (String variantURI : parent.getVariantMap().values()) {
               this.flushEntry(variantURI);
            }

            this.flushEntry(theUri);
         }

         URL reqURL = this.getAbsoluteURL(theUri);
         if (reqURL == null) {
            this.log.error("Couldn't transform request into valid URL");
            return;
         }

         Header clHdr = req.getFirstHeader("Content-Location");
         if (clHdr != null) {
            String contentLocation = clHdr.getValue();
            if (!this.flushAbsoluteUriFromSameHost(reqURL, contentLocation)) {
               this.flushRelativeUriFromSameHost(reqURL, contentLocation);
            }
         }

         Header lHdr = req.getFirstHeader("Location");
         if (lHdr != null) {
            this.flushAbsoluteUriFromSameHost(reqURL, lHdr.getValue());
         }
      }
   }

   private void flushEntry(String uri) {
      try {
         this.storage.removeEntry(uri);
      } catch (IOException ioe) {
         this.log.warn("unable to flush cache entry", ioe);
      }
   }

   private HttpCacheEntry getEntry(String theUri) {
      try {
         return this.storage.getEntry(theUri);
      } catch (IOException ioe) {
         this.log.warn("could not retrieve entry from storage", ioe);
         return null;
      }
   }

   protected void flushUriIfSameHost(URL requestURL, URL targetURL) {
      URL canonicalTarget = this.getAbsoluteURL(this.cacheKeyGenerator.canonicalizeUri(targetURL.toString()));
      if (canonicalTarget != null) {
         if (canonicalTarget.getAuthority().equalsIgnoreCase(requestURL.getAuthority())) {
            this.flushEntry(canonicalTarget.toString());
         }
      }
   }

   protected void flushRelativeUriFromSameHost(URL reqURL, String relUri) {
      URL relURL = this.getRelativeURL(reqURL, relUri);
      if (relURL != null) {
         this.flushUriIfSameHost(reqURL, relURL);
      }
   }

   protected boolean flushAbsoluteUriFromSameHost(URL reqURL, String uri) {
      URL absURL = this.getAbsoluteURL(uri);
      if (absURL == null) {
         return false;
      }

      this.flushUriIfSameHost(reqURL, absURL);
      return true;
   }

   private URL getAbsoluteURL(String uri) {
      URL absURL = null;

      try {
         absURL = new URL(uri);
      } catch (MalformedURLException mue) {
      }

      return absURL;
   }

   private URL getRelativeURL(URL reqURL, String relUri) {
      URL relURL = null;

      try {
         relURL = new URL(reqURL, relUri);
      } catch (MalformedURLException e) {
      }

      return relURL;
   }

   protected boolean requestShouldNotBeCached(HttpRequest req) {
      String method = req.getRequestLine().getMethod();
      return this.notGetOrHeadRequest(method);
   }

   private boolean notGetOrHeadRequest(String method) {
      return !"GET".equals(method) && !"HEAD".equals(method);
   }

   @Override
   public void flushInvalidatedCacheEntries(HttpHost host, HttpRequest request, HttpResponse response) {
      int status = response.getStatusLine().getStatusCode();
      if (status >= 200 && status <= 299) {
         URL reqURL = this.getAbsoluteURL(this.cacheKeyGenerator.getURI(host, request));
         if (reqURL != null) {
            URL contentLocation = this.getContentLocationURL(reqURL, response);
            if (contentLocation != null) {
               this.flushLocationCacheEntry(reqURL, response, contentLocation);
            }

            URL location = this.getLocationURL(reqURL, response);
            if (location != null) {
               this.flushLocationCacheEntry(reqURL, response, location);
            }
         }
      }
   }

   private void flushLocationCacheEntry(URL reqURL, HttpResponse response, URL location) {
      String cacheKey = this.cacheKeyGenerator.canonicalizeUri(location.toString());
      HttpCacheEntry entry = this.getEntry(cacheKey);
      if (entry != null) {
         if (!this.responseDateOlderThanEntryDate(response, entry)) {
            if (this.responseAndEntryEtagsDiffer(response, entry)) {
               this.flushUriIfSameHost(reqURL, location);
            }
         }
      }
   }

   private URL getContentLocationURL(URL reqURL, HttpResponse response) {
      Header clHeader = response.getFirstHeader("Content-Location");
      if (clHeader == null) {
         return null;
      }

      String contentLocation = clHeader.getValue();
      URL canonURL = this.getAbsoluteURL(contentLocation);
      return canonURL != null ? canonURL : this.getRelativeURL(reqURL, contentLocation);
   }

   private URL getLocationURL(URL reqURL, HttpResponse response) {
      Header clHeader = response.getFirstHeader("Location");
      if (clHeader == null) {
         return null;
      }

      String location = clHeader.getValue();
      URL canonURL = this.getAbsoluteURL(location);
      return canonURL != null ? canonURL : this.getRelativeURL(reqURL, location);
   }

   private boolean responseAndEntryEtagsDiffer(HttpResponse response, HttpCacheEntry entry) {
      Header entryEtag = entry.getFirstHeader("ETag");
      Header responseEtag = response.getFirstHeader("ETag");
      return entryEtag != null && responseEtag != null ? !entryEtag.getValue().equals(responseEtag.getValue()) : false;
   }

   private boolean responseDateOlderThanEntryDate(HttpResponse response, HttpCacheEntry entry) {
      Header entryDateHeader = entry.getFirstHeader("Date");
      Header responseDateHeader = response.getFirstHeader("Date");
      if (entryDateHeader != null && responseDateHeader != null) {
         Date entryDate = DateUtils.parseDate(entryDateHeader.getValue());
         Date responseDate = DateUtils.parseDate(responseDateHeader.getValue());
         return entryDate != null && responseDate != null ? responseDate.before(entryDate) : false;
      } else {
         return false;
      }
   }
}
