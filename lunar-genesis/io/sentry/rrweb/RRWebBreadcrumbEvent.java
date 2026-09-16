package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class RRWebBreadcrumbEvent extends RRWebEvent implements JsonSerializable, JsonUnknown {
   public static final String EVENT_TAG = "breadcrumb";
   @NotNull
   private String tag = "breadcrumb";
   private double breadcrumbTimestamp;
   @Nullable
   private String breadcrumbType;
   @Nullable
   private String category;
   @Nullable
   private String message;
   @Nullable
   private SentryLevel level;
   @Nullable
   private Map<String, Object> data;
   @Nullable
   private Map<String, Object> unknown;
   @Nullable
   private Map<String, Object> payloadUnknown;
   @Nullable
   private Map<String, Object> dataUnknown;

   public RRWebBreadcrumbEvent() {
      super(RRWebEventType.Custom);
   }

   @NotNull
   public String getTag() {
      return this.tag;
   }

   public void setTag(@NotNull String var1) {
      this.tag = var1;
   }

   public double getBreadcrumbTimestamp() {
      return this.breadcrumbTimestamp;
   }

   public void setBreadcrumbTimestamp(double var1) {
      this.breadcrumbTimestamp = var1;
   }

   @Nullable
   public String getBreadcrumbType() {
      return this.breadcrumbType;
   }

   public void setBreadcrumbType(@Nullable String var1) {
      this.breadcrumbType = var1;
   }

   @Nullable
   public String getCategory() {
      return this.category;
   }

   public void setCategory(@Nullable String var1) {
      this.category = var1;
   }

   @Nullable
   public String getMessage() {
      return this.message;
   }

   public void setMessage(@Nullable String var1) {
      this.message = var1;
   }

   @Nullable
   public SentryLevel getLevel() {
      return this.level;
   }

   public void setLevel(@Nullable SentryLevel var1) {
      this.level = var1;
   }

   @Nullable
   public Map<String, Object> getData() {
      return this.data;
   }

   public void setData(@Nullable Map<String, Object> var1) {
      this.data = var1 == null ? null : new ConcurrentHashMap<>(var1);
   }

   @Nullable
   public Map<String, Object> getPayloadUnknown() {
      return this.payloadUnknown;
   }

   public void setPayloadUnknown(@Nullable Map<String, Object> var1) {
      this.payloadUnknown = var1;
   }

   @Nullable
   public Map<String, Object> getDataUnknown() {
      return this.dataUnknown;
   }

   public void setDataUnknown(@Nullable Map<String, Object> var1) {
      this.dataUnknown = var1;
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

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      new RRWebEvent.Serializer().serialize(this, var1, var2);
      var1.name("data");
      this.serializeData(var1, var2);
      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
         }
      }

      var1.endObject();
   }

   private void serializeData(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("tag").value(this.tag);
      var1.name("payload");
      this.serializePayload(var1, var2);
      if (this.dataUnknown != null) {
         for (String var4 : this.dataUnknown.keySet()) {
            Object var5 = this.dataUnknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
         }
      }

      var1.endObject();
   }

   private void serializePayload(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.breadcrumbType != null) {
         var1.name("type").value(this.breadcrumbType);
      }

      var1.name("timestamp").value(var2, BigDecimal.valueOf(this.breadcrumbTimestamp));
      if (this.category != null) {
         var1.name("category").value(this.category);
      }

      if (this.message != null) {
         var1.name("message").value(this.message);
      }

      if (this.level != null) {
         var1.name("level").value(var2, this.level);
      }

      if (this.data != null) {
         var1.name("data").value(var2, this.data);
      }

      if (this.payloadUnknown != null) {
         for (String var4 : this.payloadUnknown.keySet()) {
            Object var5 = this.payloadUnknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<RRWebBreadcrumbEvent> {
      @NotNull
      public RRWebBreadcrumbEvent deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         HashMap var3 = null;
         RRWebBreadcrumbEvent var4 = new RRWebBreadcrumbEvent();
         RRWebEvent.Deserializer var5 = new RRWebEvent.Deserializer();

         while (var1.peek() == JsonToken.NAME) {
            String var6 = var1.nextName();
            switch (var6) {
               case "data":
                  this.deserializeData(var4, var1, var2);
                  break;
               default:
                  if (!var5.deserializeValue(var4, var6, var1, var2)) {
                     if (var3 == null) {
                        var3 = new HashMap();
                     }

                     var1.nextUnknown(var2, var3, var6);
                  }
            }
         }

         var4.setUnknown(var3);
         var1.endObject();
         return var4;
      }

      private void deserializeData(@NotNull RRWebBreadcrumbEvent var1, @NotNull ObjectReader var2, @NotNull ILogger var3) {
         ConcurrentHashMap var4 = null;
         var2.beginObject();

         while (var2.peek() == JsonToken.NAME) {
            String var5 = var2.nextName();
            switch (var5) {
               case "tag":
                  String var8 = var2.nextStringOrNull();
                  var1.tag = var8 == null ? "" : var8;
                  break;
               case "payload":
                  this.deserializePayload(var1, var2, var3);
                  break;
               default:
                  if (var4 == null) {
                     var4 = new ConcurrentHashMap();
                  }

                  var2.nextUnknown(var3, var4, var5);
            }
         }

         var1.setDataUnknown(var4);
         var2.endObject();
      }

      private void deserializePayload(@NotNull RRWebBreadcrumbEvent var1, @NotNull ObjectReader var2, @NotNull ILogger var3) {
         ConcurrentHashMap var4 = null;
         var2.beginObject();

         while (var2.peek() == JsonToken.NAME) {
            String var5 = var2.nextName();
            switch (var5) {
               case "type":
                  var1.breadcrumbType = var2.nextStringOrNull();
                  break;
               case "timestamp":
                  var1.breadcrumbTimestamp = var2.nextDouble();
                  break;
               case "category":
                  var1.category = var2.nextStringOrNull();
                  break;
               case "message":
                  var1.message = var2.nextStringOrNull();
                  break;
               case "level":
                  try {
                     var1.level = new SentryLevel.Deserializer().deserialize(var2, var3);
                  } catch (Exception var9) {
                     var3.log(SentryLevel.DEBUG, var9, "Error when deserializing SentryLevel");
                  }
                  break;
               case "data":
                  Map var8 = CollectionUtils.newConcurrentHashMap((Map)var2.nextObjectOrNull());
                  if (var8 != null) {
                     var1.data = var8;
                  }
                  break;
               default:
                  if (var4 == null) {
                     var4 = new ConcurrentHashMap();
                  }

                  var2.nextUnknown(var3, var4, var5);
            }
         }

         var1.setPayloadUnknown(var4);
         var2.endObject();
      }
   }

   public static final class JsonKeys {
      public static final String DATA = "data";
      public static final String PAYLOAD = "payload";
      public static final String TIMESTAMP = "timestamp";
      public static final String TYPE = "type";
      public static final String CATEGORY = "category";
      public static final String MESSAGE = "message";
      public static final String LEVEL = "level";
   }
}
