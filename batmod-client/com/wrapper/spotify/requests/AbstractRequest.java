package com.wrapper.spotify.requests;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.wrapper.spotify.IHttpManager;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.SpotifyApiThreading;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.logging.Level;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

public abstract class AbstractRequest implements IRequest {
   private IHttpManager httpManager;
   private URI uri;
   private List<Header> headers;
   private ContentType contentType;
   private HttpEntity body;
   private List<NameValuePair> bodyParameters;

   protected AbstractRequest(AbstractRequest.Builder<?> builder) {
      assert builder != null;
      assert builder.path != null;
      assert !builder.path.equals("");
      this.httpManager = builder.httpManager;
      URIBuilder uriBuilder = new URIBuilder();
      uriBuilder.setScheme(builder.scheme).setHost(builder.host).setPort(builder.port).setPath(builder.path);
      if (builder.queryParameters.size() > 0) {
         uriBuilder.setParameters(builder.queryParameters);
      }

      try {
         this.uri = uriBuilder.build();
      } catch (URISyntaxException e) {
         SpotifyApi.LOGGER.log(Level.SEVERE, e.getMessage());
      }

      this.headers = builder.headers;
      this.contentType = builder.contentType;
      this.body = builder.body;
      this.bodyParameters = builder.bodyParameters;
   }

   @Override
   public <T> Future<T> executeAsync() {
      return SpotifyApiThreading.executeAsync(new Callable<T>() {
         @Override
         public T call() throws IOException, SpotifyWebApiException {
            return AbstractRequest.this.execute();
         }
      });
   }

   public void initializeBody() throws UnsupportedEncodingException {
      if (this.body == null && this.contentType != null) {
         switch (this.contentType.getMimeType()) {
            case "application/json":
               this.body = new StringEntity(this.bodyParametersToJson(this.bodyParameters), ContentType.APPLICATION_JSON);
               break;
            case "application/x-www-form-urlencoded":
               this.body = new UrlEncodedFormEntity(this.bodyParameters);
         }
      }
   }

   public String bodyParametersToJson(List<NameValuePair> bodyParameters) {
      JsonObject jsonObject = new JsonObject();

      for (NameValuePair nameValuePair : bodyParameters) {
         JsonElement jsonElement;
         try {
            jsonElement = new JsonParser().parse(nameValuePair.getValue());
         } catch (JsonSyntaxException e) {
            jsonElement = new JsonPrimitive(nameValuePair.getValue());
         }

         jsonObject.add(nameValuePair.getName(), jsonElement);
      }

      return jsonObject.toString();
   }

   @Override
   public String getJson() throws IOException, SpotifyWebApiException {
      String json = this.httpManager.get(this.uri, this.headers.toArray(new Header[this.headers.size()]));
      return json != null && !json.equals("") ? json : null;
   }

   @Override
   public String postJson() throws IOException, SpotifyWebApiException {
      this.initializeBody();
      String json = this.httpManager.post(this.uri, this.headers.toArray(new Header[this.headers.size()]), this.body);
      return json != null && !json.equals("") ? json : null;
   }

   @Override
   public String putJson() throws IOException, SpotifyWebApiException {
      this.initializeBody();
      String json = this.httpManager.put(this.uri, this.headers.toArray(new Header[this.headers.size()]), this.body);
      return json != null && !json.equals("") ? json : null;
   }

   @Override
   public String deleteJson() throws IOException, SpotifyWebApiException {
      this.initializeBody();
      String json = this.httpManager.delete(this.uri, this.headers.toArray(new Header[this.headers.size()]), this.body);
      return json != null && !json.equals("") ? json : null;
   }

   @Override
   public IHttpManager getHttpManager() {
      return this.httpManager;
   }

   @Override
   public URI getUri() {
      return this.uri;
   }

   @Override
   public List<Header> getHeaders() {
      return this.headers;
   }

   @Override
   public ContentType getContentType() {
      return this.contentType;
   }

   @Override
   public HttpEntity getBody() {
      return this.body;
   }

   @Override
   public List<NameValuePair> getBodyParameters() {
      return this.bodyParameters;
   }

   public abstract static class Builder<T extends AbstractRequest.Builder<?>> implements IRequest.Builder {
      private final List<NameValuePair> pathParameters = new ArrayList<>();
      private final List<NameValuePair> queryParameters = new ArrayList<>();
      private final List<Header> headers = new ArrayList<>();
      private final List<NameValuePair> bodyParameters = new ArrayList<>();
      private IHttpManager httpManager = SpotifyApi.DEFAULT_HTTP_MANAGER;
      private String scheme = "https";
      private String host = "api.spotify.com";
      private Integer port = 443;
      private String path = null;
      private ContentType contentType = null;
      private HttpEntity body = null;

      protected Builder() {
      }

      public T setHttpManager(IHttpManager httpManager) {
         assert httpManager != null;
         this.httpManager = httpManager;
         return (T)this;
      }

      public T setScheme(String scheme) {
         assert scheme != null;
         assert !scheme.equals("");
         this.scheme = scheme;
         return (T)this;
      }

      public T setHost(String host) {
         assert host != null;
         assert !this.scheme.equals("");
         this.host = host;
         return (T)this;
      }

      public T setPort(Integer port) {
         assert port != null;
         assert port >= 0;
         this.port = port;
         return (T)this;
      }

      public T setPath(String path) {
         assert path != null;
         assert !path.equals("");
         String builtPath = path;

         for (NameValuePair nameValuePair : this.pathParameters) {
            builtPath = builtPath.replaceAll("\\{" + nameValuePair.getName() + "}", nameValuePair.getValue());
         }

         this.path = builtPath;
         return (T)this;
      }

      public T setPathParameter(String name, String value) {
         assert name != null && value != null;
         assert !name.equals("") && !value.equals("");
         String encodedValue = null;

         try {
            encodedValue = URLEncoder.encode(value, "UTF-8");
         } catch (UnsupportedEncodingException e) {
            SpotifyApi.LOGGER.log(Level.SEVERE, e.getMessage());
         }

         this.pathParameters.add(new BasicNameValuePair(name, encodedValue));
         return (T)this;
      }

      public T setDefaults(IHttpManager httpManager, String scheme, String host, Integer port) {
         this.setHttpManager(httpManager);
         this.setScheme(scheme);
         this.setHost(host);
         this.setPort(port);
         return (T)this;
      }

      public <X> T setQueryParameter(String name, X value) {
         assert name != null;
         assert !name.equals("");
         assert value != null;
         this.queryParameters.add(new BasicNameValuePair(name, String.valueOf(value)));
         return (T)this;
      }

      public <X> T setHeader(String name, X value) {
         assert name != null;
         assert !name.equals("");
         assert value != null;
         this.headers.add(new BasicHeader(name, String.valueOf(value)));
         return (T)this;
      }

      public T setContentType(ContentType contentType) {
         this.contentType = contentType;
         this.setHeader("Content-Type", contentType.getMimeType());
         return (T)this;
      }

      public T setBody(HttpEntity httpEntity) {
         this.body = httpEntity;
         return (T)this;
      }

      public <X> T setBodyParameter(String name, X value) {
         assert name != null;
         assert !name.equals("");
         assert value != null;
         this.bodyParameters.add(new BasicNameValuePair(name, String.valueOf(value)));
         return (T)this;
      }
   }
}
