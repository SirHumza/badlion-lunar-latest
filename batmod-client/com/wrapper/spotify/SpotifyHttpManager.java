package com.wrapper.spotify;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.exceptions.detailed.BadGatewayException;
import com.wrapper.spotify.exceptions.detailed.BadRequestException;
import com.wrapper.spotify.exceptions.detailed.ForbiddenException;
import com.wrapper.spotify.exceptions.detailed.InternalServerErrorException;
import com.wrapper.spotify.exceptions.detailed.NotFoundException;
import com.wrapper.spotify.exceptions.detailed.ServiceUnavailableException;
import com.wrapper.spotify.exceptions.detailed.TooManyRequestsException;
import com.wrapper.spotify.exceptions.detailed.UnauthorizedException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.cache.CacheResponseStatus;
import org.apache.http.client.cache.HttpCacheContext;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.cache.CacheConfig;
import org.apache.http.impl.client.cache.CachingHttpClients;
import org.apache.http.util.EntityUtils;

public class SpotifyHttpManager implements IHttpManager {
   private static final int DEFAULT_CACHE_MAX_ENTRIES = 1000;
   private static final int DEFAULT_CACHE_MAX_OBJECT_SIZE = 8192;
   private final CloseableHttpClient httpClient;
   private final HttpHost proxy;
   private final UsernamePasswordCredentials proxyCredentials;
   private final Integer cacheMaxEntries;
   private final Integer cacheMaxObjectSize;
   private final Integer connectionRequestTimeout;
   private final Integer connectTimeout;
   private final Integer socketTimeout;

   public SpotifyHttpManager(SpotifyHttpManager.Builder builder) {
      this.proxy = builder.proxy;
      this.proxyCredentials = builder.proxyCredentials;
      this.cacheMaxEntries = builder.cacheMaxEntries;
      this.cacheMaxObjectSize = builder.cacheMaxObjectSize;
      this.connectionRequestTimeout = builder.connectionRequestTimeout;
      this.connectTimeout = builder.connectTimeout;
      this.socketTimeout = builder.socketTimeout;
      CacheConfig cacheConfig = CacheConfig.custom()
         .setMaxCacheEntries(this.cacheMaxEntries != null ? this.cacheMaxEntries : 1000)
         .setMaxObjectSize(this.cacheMaxObjectSize != null ? this.cacheMaxObjectSize.intValue() : 8192L)
         .setSharedCache(false)
         .build();
      ConnectionConfig connectionConfig = ConnectionConfig.custom().setCharset(Charset.forName("UTF-8")).build();
      new BasicCredentialsProvider();
      CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
      if (this.proxy != null) {
         credentialsProvider.setCredentials(
            new AuthScope(this.proxy.getHostName(), this.proxy.getPort(), null, this.proxy.getSchemeName()), this.proxyCredentials
         );
      }

      RequestConfig requestConfig = RequestConfig.custom()
         .setProxy(this.proxy)
         .setConnectionRequestTimeout(
            builder.connectionRequestTimeout != null ? builder.connectionRequestTimeout : RequestConfig.DEFAULT.getConnectionRequestTimeout()
         )
         .setConnectTimeout(builder.connectTimeout != null ? builder.connectTimeout : RequestConfig.DEFAULT.getConnectTimeout())
         .setSocketTimeout(builder.socketTimeout != null ? builder.socketTimeout : RequestConfig.DEFAULT.getSocketTimeout())
         .build();
      this.httpClient = CachingHttpClients.custom()
         .setCacheConfig(cacheConfig)
         .setDefaultConnectionConfig(connectionConfig)
         .setDefaultCredentialsProvider(credentialsProvider)
         .setDefaultRequestConfig(requestConfig)
         .build();
   }

   public static URI makeUri(String uriString) {
      try {
         return new URI(uriString);
      } catch (URISyntaxException e) {
         SpotifyApi.LOGGER.log(Level.SEVERE, "URI Syntax Exception for \"" + uriString + "\"");
         return null;
      }
   }

   public HttpHost getProxy() {
      return this.proxy;
   }

   public UsernamePasswordCredentials getProxyCredentials() {
      return this.proxyCredentials;
   }

   public Integer getCacheMaxEntries() {
      return this.cacheMaxEntries;
   }

   public Integer getCacheMaxObjectSize() {
      return this.cacheMaxObjectSize;
   }

   public Integer getConnectionRequestTimeout() {
      return this.connectionRequestTimeout;
   }

   public Integer getConnectTimeout() {
      return this.connectTimeout;
   }

   public Integer getSocketTimeout() {
      return this.socketTimeout;
   }

   @Override
   public String get(URI uri, Header[] headers) throws IOException, SpotifyWebApiException {
      assert uri != null;
      assert !uri.toString().equals("");
      HttpGet httpGet = new HttpGet();
      httpGet.setURI(uri);
      httpGet.setHeaders(headers);
      String responseBody = this.getResponseBody(this.execute(httpGet));
      httpGet.releaseConnection();
      return responseBody;
   }

   @Override
   public String post(URI uri, Header[] headers, HttpEntity body) throws IOException, SpotifyWebApiException {
      assert uri != null;
      assert !uri.toString().equals("");
      HttpPost httpPost = new HttpPost();
      httpPost.setURI(uri);
      httpPost.setHeaders(headers);
      httpPost.setEntity(body);
      String responseBody = this.getResponseBody(this.execute(httpPost));
      httpPost.releaseConnection();
      return responseBody;
   }

   @Override
   public String put(URI uri, Header[] headers, HttpEntity body) throws IOException, SpotifyWebApiException {
      assert uri != null;
      assert !uri.toString().equals("");
      HttpPut httpPut = new HttpPut();
      httpPut.setURI(uri);
      httpPut.setHeaders(headers);
      httpPut.setEntity(body);
      String responseBody = this.getResponseBody(this.execute(httpPut));
      httpPut.releaseConnection();
      return responseBody;
   }

   @Override
   public String delete(URI uri, Header[] headers, HttpEntity body) throws IOException, SpotifyWebApiException {
      assert uri != null;
      assert !uri.toString().equals("");
      HttpDeleteBody httpDelete = new HttpDeleteBody();
      httpDelete.setURI(uri);
      httpDelete.setHeaders(headers);
      httpDelete.setEntity(body);
      String responseBody = this.getResponseBody(this.execute(httpDelete));
      httpDelete.releaseConnection();
      return responseBody;
   }

   private HttpResponse execute(HttpRequestBase method) throws IOException {
      HttpCacheContext context = HttpCacheContext.create();
      HttpResponse response = this.httpClient.execute(method, context);

      try {
         CacheResponseStatus responseStatus = context.getCacheResponseStatus();
         switch (responseStatus) {
            case CACHE_HIT:
               SpotifyApi.LOGGER.log(Level.CONFIG, "A response was generated from the cache with no requests sent upstream");
               break;
            case CACHE_MODULE_RESPONSE:
               SpotifyApi.LOGGER.log(Level.CONFIG, "The response was generated directly by the caching module");
               break;
            case CACHE_MISS:
               SpotifyApi.LOGGER.log(Level.CONFIG, "The response came from an upstream server");
               break;
            case VALIDATED:
               SpotifyApi.LOGGER.log(Level.CONFIG, "The response was generated from the cache after validating the entry with the origin server");
         }
      } catch (Exception e) {
         SpotifyApi.LOGGER.log(Level.SEVERE, e.getMessage());
      }

      return response;
   }

   private String getResponseBody(HttpResponse httpResponse) throws IOException, SpotifyWebApiException {
      StatusLine statusLine = httpResponse.getStatusLine();
      String responseBody = httpResponse.getEntity() != null ? EntityUtils.toString(httpResponse.getEntity(), "UTF-8") : null;
      String errorMessage = statusLine.getReasonPhrase();
      if (responseBody != null && !responseBody.equals("")) {
         try {
            JsonObject jsonObject = new JsonParser().parse(responseBody).getAsJsonObject();
            if (jsonObject.has("error")) {
               if (jsonObject.has("error_description")) {
                  errorMessage = jsonObject.get("error_description").getAsString();
               } else if (jsonObject.get("error").isJsonObject() && jsonObject.getAsJsonObject("error").has("message")) {
                  errorMessage = jsonObject.getAsJsonObject("error").get("message").getAsString();
               }
            }
         } catch (JsonSyntaxException var6) {
         }
      }

      switch (statusLine.getStatusCode()) {
         case 200:
            return responseBody;
         case 201:
            return responseBody;
         case 202:
            return responseBody;
         case 204:
            return responseBody;
         case 304:
            return responseBody;
         case 400:
            throw new BadRequestException(errorMessage);
         case 401:
            throw new UnauthorizedException(errorMessage);
         case 403:
            throw new ForbiddenException(errorMessage);
         case 404:
            throw new NotFoundException(errorMessage);
         case 429:
            Header header = httpResponse.getFirstHeader("Retry-After");
            if (header != null) {
               throw new TooManyRequestsException(errorMessage, Integer.parseInt(header.getValue()));
            }

            throw new TooManyRequestsException(errorMessage);
         case 500:
            throw new InternalServerErrorException(errorMessage);
         case 502:
            throw new BadGatewayException(errorMessage);
         case 503:
            throw new ServiceUnavailableException(errorMessage);
         default:
            return responseBody;
      }
   }

   public static class Builder {
      private HttpHost proxy;
      private UsernamePasswordCredentials proxyCredentials;
      private Integer cacheMaxEntries;
      private Integer cacheMaxObjectSize;
      private Integer connectionRequestTimeout;
      private Integer connectTimeout;
      private Integer socketTimeout;

      public SpotifyHttpManager.Builder setProxy(HttpHost proxy) {
         this.proxy = proxy;
         return this;
      }

      public SpotifyHttpManager.Builder setProxyCredentials(UsernamePasswordCredentials proxyCredentials) {
         this.proxyCredentials = proxyCredentials;
         return this;
      }

      public SpotifyHttpManager.Builder setCacheMaxEntries(Integer cacheMaxEntries) {
         this.cacheMaxEntries = cacheMaxEntries;
         return this;
      }

      public SpotifyHttpManager.Builder setCacheMaxObjectSize(Integer cacheMaxObjectSize) {
         this.cacheMaxObjectSize = cacheMaxObjectSize;
         return this;
      }

      public SpotifyHttpManager.Builder setConnectionRequestTimeout(Integer connectionRequestTimeout) {
         this.connectionRequestTimeout = connectionRequestTimeout;
         return this;
      }

      public SpotifyHttpManager.Builder setConnectTimeout(Integer connectTimeout) {
         this.connectTimeout = connectTimeout;
         return this;
      }

      public SpotifyHttpManager.Builder setSocketTimeout(Integer socketTimeout) {
         this.socketTimeout = socketTimeout;
         return this;
      }

      public SpotifyHttpManager build() {
         return new SpotifyHttpManager(this);
      }
   }
}
