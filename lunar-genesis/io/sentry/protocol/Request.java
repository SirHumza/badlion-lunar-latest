package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Request implements JsonSerializable, JsonUnknown {
   @Nullable
   private String url;
   @Nullable
   private String method;
   @Nullable
   private String queryString;
   @Nullable
   private Object data;
   @Nullable
   private String cookies;
   @Nullable
   private Map<String, String> headers;
   @Nullable
   private Map<String, String> env;
   @Nullable
   private Long bodySize;
   @Nullable
   private Map<String, String> other;
   @Nullable
   private String fragment;
   @Nullable
   private String apiTarget;
   @Nullable
   private Map<String, Object> unknown;

   public Request() {
   }

   public Request(@NotNull Request var1) {
      this.url = var1.url;
      this.cookies = var1.cookies;
      this.method = var1.method;
      this.queryString = var1.queryString;
      this.headers = CollectionUtils.newConcurrentHashMap(var1.headers);
      this.env = CollectionUtils.newConcurrentHashMap(var1.env);
      this.other = CollectionUtils.newConcurrentHashMap(var1.other);
      this.unknown = CollectionUtils.newConcurrentHashMap(var1.unknown);
      this.data = var1.data;
      this.fragment = var1.fragment;
      this.bodySize = var1.bodySize;
      this.apiTarget = var1.apiTarget;
   }

   @Nullable
   public String getUrl() {
      return this.url;
   }

   public void setUrl(@Nullable String var1) {
      this.url = var1;
   }

   @Nullable
   public String getMethod() {
      return this.method;
   }

   public void setMethod(@Nullable String var1) {
      this.method = var1;
   }

   @Nullable
   public String getQueryString() {
      return this.queryString;
   }

   public void setQueryString(@Nullable String var1) {
      this.queryString = var1;
   }

   @Nullable
   public Object getData() {
      return this.data;
   }

   public void setData(@Nullable Object var1) {
      this.data = var1;
   }

   @Nullable
   public String getCookies() {
      return this.cookies;
   }

   public void setCookies(@Nullable String var1) {
      this.cookies = var1;
   }

   @Nullable
   public Map<String, String> getHeaders() {
      return this.headers;
   }

   public void setHeaders(@Nullable Map<String, String> var1) {
      this.headers = CollectionUtils.newConcurrentHashMap(var1);
   }

   @Nullable
   public Map<String, String> getEnvs() {
      return this.env;
   }

   public void setEnvs(@Nullable Map<String, String> var1) {
      this.env = CollectionUtils.newConcurrentHashMap(var1);
   }

   @Nullable
   public Map<String, String> getOthers() {
      return this.other;
   }

   public void setOthers(@Nullable Map<String, String> var1) {
      this.other = CollectionUtils.newConcurrentHashMap(var1);
   }

   @Nullable
   public String getFragment() {
      return this.fragment;
   }

   public void setFragment(@Nullable String var1) {
      this.fragment = var1;
   }

   @Nullable
   public Long getBodySize() {
      return this.bodySize;
   }

   public void setBodySize(@Nullable Long var1) {
      this.bodySize = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Request var2 = (Request)var1;
         return Objects.equals(this.url, var2.url)
            && Objects.equals(this.method, var2.method)
            && Objects.equals(this.queryString, var2.queryString)
            && Objects.equals(this.cookies, var2.cookies)
            && Objects.equals(this.headers, var2.headers)
            && Objects.equals(this.env, var2.env)
            && Objects.equals(this.bodySize, var2.bodySize)
            && Objects.equals(this.fragment, var2.fragment)
            && Objects.equals(this.apiTarget, var2.apiTarget);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.url, this.method, this.queryString, this.cookies, this.headers, this.env, this.bodySize, this.fragment, this.apiTarget);
   }

   @Nullable
   @Override
   public Map<String, Object> getUnknown() {
      return this.unknown;
   }

   @Override
   public void setUnknown(@Nullable Map<String, Object> var1) {
      this.unknown = var1;
   }

   @Nullable
   public String getApiTarget() {
      return this.apiTarget;
   }

   public void setApiTarget(@Nullable String var1) {
      this.apiTarget = var1;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.url != null) {
         var1.name("url").value(this.url);
      }

      if (this.method != null) {
         var1.name("method").value(this.method);
      }

      if (this.queryString != null) {
         var1.name("query_string").value(this.queryString);
      }

      if (this.data != null) {
         var1.name("data").value(var2, this.data);
      }

      if (this.cookies != null) {
         var1.name("cookies").value(this.cookies);
      }

      if (this.headers != null) {
         var1.name("headers").value(var2, this.headers);
      }

      if (this.env != null) {
         var1.name("env").value(var2, this.env);
      }

      if (this.other != null) {
         var1.name("other").value(var2, this.other);
      }

      if (this.fragment != null) {
         var1.name("fragment").value(var2, this.fragment);
      }

      if (this.bodySize != null) {
         var1.name("body_size").value(var2, this.bodySize);
      }

      if (this.apiTarget != null) {
         var1.name("api_target").value(var2, this.apiTarget);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<Request> {
      @NotNull
      public Request deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Request var3 = new Request();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "url":
                  var3.url = var1.nextStringOrNull();
                  break;
               case "method":
                  var3.method = var1.nextStringOrNull();
                  break;
               case "query_string":
                  var3.queryString = var1.nextStringOrNull();
                  break;
               case "data":
                  var3.data = var1.nextObjectOrNull();
                  break;
               case "cookies":
                  var3.cookies = var1.nextStringOrNull();
                  break;
               case "headers":
                  Map var8 = (Map)var1.nextObjectOrNull();
                  if (var8 != null) {
                     var3.headers = CollectionUtils.newConcurrentHashMap(var8);
                  }
                  break;
               case "env":
                  Map var9 = (Map)var1.nextObjectOrNull();
                  if (var9 != null) {
                     var3.env = CollectionUtils.newConcurrentHashMap(var9);
                  }
                  break;
               case "other":
                  Map var10 = (Map)var1.nextObjectOrNull();
                  if (var10 != null) {
                     var3.other = CollectionUtils.newConcurrentHashMap(var10);
                  }
                  break;
               case "fragment":
                  var3.fragment = var1.nextStringOrNull();
                  break;
               case "body_size":
                  var3.bodySize = var1.nextLongOrNull();
                  break;
               case "api_target":
                  var3.apiTarget = var1.nextStringOrNull();
                  break;
               default:
                  if (var4 == null) {
                     var4 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var4, var5);
            }
         }

         var3.setUnknown(var4);
         var1.endObject();
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String URL = "url";
      public static final String METHOD = "method";
      public static final String QUERY_STRING = "query_string";
      public static final String DATA = "data";
      public static final String COOKIES = "cookies";
      public static final String HEADERS = "headers";
      public static final String ENV = "env";
      public static final String OTHER = "other";
      public static final String FRAGMENT = "fragment";
      public static final String BODY_SIZE = "body_size";
      public static final String API_TARGET = "api_target";
   }
}
