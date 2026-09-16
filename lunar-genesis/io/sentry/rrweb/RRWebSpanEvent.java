package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class RRWebSpanEvent extends RRWebEvent implements JsonSerializable, JsonUnknown {
   public static final String EVENT_TAG = "performanceSpan";
   @NotNull
   private String tag = "performanceSpan";
   @Nullable
   private String op;
   @Nullable
   private String description;
   private double startTimestamp;
   private double endTimestamp;
   @Nullable
   private Map<String, Object> data;
   @Nullable
   private Map<String, Object> unknown;
   @Nullable
   private Map<String, Object> payloadUnknown;
   @Nullable
   private Map<String, Object> dataUnknown;

   public RRWebSpanEvent() {
      super(RRWebEventType.Custom);
   }

   @NotNull
   public String getTag() {
      return this.tag;
   }

   public void setTag(@NotNull String var1) {
      this.tag = var1;
   }

   @Nullable
   public String getOp() {
      return this.op;
   }

   public void setOp(@Nullable String var1) {
      this.op = var1;
   }

   @Nullable
   public String getDescription() {
      return this.description;
   }

   public void setDescription(@Nullable String var1) {
      this.description = var1;
   }

   public double getStartTimestamp() {
      return this.startTimestamp;
   }

   public void setStartTimestamp(double var1) {
      this.startTimestamp = var1;
   }

   public double getEndTimestamp() {
      return this.endTimestamp;
   }

   public void setEndTimestamp(double var1) {
      this.endTimestamp = var1;
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
      if (this.op != null) {
         var1.name("op").value(this.op);
      }

      if (this.description != null) {
         var1.name("description").value(this.description);
      }

      var1.name("startTimestamp").value(var2, BigDecimal.valueOf(this.startTimestamp));
      var1.name("endTimestamp").value(var2, BigDecimal.valueOf(this.endTimestamp));
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

   public static final class Deserializer implements JsonDeserializer<RRWebSpanEvent> {
      @NotNull
      public RRWebSpanEvent deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         HashMap var3 = null;
         RRWebSpanEvent var4 = new RRWebSpanEvent();
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

      private void deserializeData(@NotNull RRWebSpanEvent var1, @NotNull ObjectReader var2, @NotNull ILogger var3) {
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

      private void deserializePayload(@NotNull RRWebSpanEvent var1, @NotNull ObjectReader var2, @NotNull ILogger var3) {
         ConcurrentHashMap var4 = null;
         var2.beginObject();

         while (var2.peek() == JsonToken.NAME) {
            String var5 = var2.nextName();
            switch (var5) {
               case "op":
                  var1.op = var2.nextStringOrNull();
                  break;
               case "description":
                  var1.description = var2.nextStringOrNull();
                  break;
               case "startTimestamp":
                  var1.startTimestamp = var2.nextDouble();
                  break;
               case "endTimestamp":
                  var1.endTimestamp = var2.nextDouble();
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
      public static final String OP = "op";
      public static final String DESCRIPTION = "description";
      public static final String START_TIMESTAMP = "startTimestamp";
      public static final String END_TIMESTAMP = "endTimestamp";
   }
}
