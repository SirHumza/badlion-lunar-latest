package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Response implements JsonSerializable, JsonUnknown {
   public static final String TYPE = "response";
   @Nullable
   private String cookies;
   @Nullable
   private Map<String, String> headers;
   @Nullable
   private Integer statusCode;
   @Nullable
   private Long bodySize;
   @Nullable
   private Object data;
   @Nullable
   private Map<String, Object> unknown;

   public Response() {
   }

   public Response(@NotNull Response var1) {
      this.cookies = var1.cookies;
      this.headers = CollectionUtils.newConcurrentHashMap(var1.headers);
      this.unknown = CollectionUtils.newConcurrentHashMap(var1.unknown);
      this.statusCode = var1.statusCode;
      this.bodySize = var1.bodySize;
      this.data = var1.data;
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
   @Override
   public Map<String, Object> getUnknown() {
      return this.unknown;
   }

   @Override
   public void setUnknown(@Nullable Map<String, Object> var1) {
      this.unknown = var1;
   }

   @Nullable
   public Integer getStatusCode() {
      return this.statusCode;
   }

   public void setStatusCode(@Nullable Integer var1) {
      this.statusCode = var1;
   }

   @Nullable
   public Long getBodySize() {
      return this.bodySize;
   }

   public void setBodySize(@Nullable Long var1) {
      this.bodySize = var1;
   }

   @Nullable
   public Object getData() {
      return this.data;
   }

   public void setData(@Nullable Object var1) {
      this.data = var1;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.cookies != null) {
         var1.name("cookies").value(this.cookies);
      }

      if (this.headers != null) {
         var1.name("headers").value(var2, this.headers);
      }

      if (this.statusCode != null) {
         var1.name("status_code").value(var2, this.statusCode);
      }

      if (this.bodySize != null) {
         var1.name("body_size").value(var2, this.bodySize);
      }

      if (this.data != null) {
         var1.name("data").value(var2, this.data);
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

   public static final class Deserializer implements JsonDeserializer<Response> {
      @NotNull
      public Response deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Response var3 = new Response();
         ConcurrentHashMap var4 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "cookies":
                  var3.cookies = var1.nextStringOrNull();
                  break;
               case "headers":
                  Map var8 = (Map)var1.nextObjectOrNull();
                  if (var8 != null) {
                     var3.headers = CollectionUtils.newConcurrentHashMap(var8);
                  }
                  break;
               case "status_code":
                  var3.statusCode = var1.nextIntegerOrNull();
                  break;
               case "body_size":
                  var3.bodySize = var1.nextLongOrNull();
                  break;
               case "data":
                  var3.data = var1.nextObjectOrNull();
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
      public static final String COOKIES = "cookies";
      public static final String HEADERS = "headers";
      public static final String STATUS_CODE = "status_code";
      public static final String BODY_SIZE = "body_size";
      public static final String DATA = "data";
   }
}
