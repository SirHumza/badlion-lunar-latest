package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class RRWebVideoEvent extends RRWebEvent implements JsonSerializable, JsonUnknown {
   public static final String EVENT_TAG = "video";
   public static final String REPLAY_ENCODING = "h264";
   public static final String REPLAY_CONTAINER = "mp4";
   public static final String REPLAY_FRAME_RATE_TYPE_CONSTANT = "constant";
   public static final String REPLAY_FRAME_RATE_TYPE_VARIABLE = "variable";
   @NotNull
   private String tag;
   private int segmentId;
   private long size;
   private long durationMs;
   @NotNull
   private String encoding = "h264";
   @NotNull
   private String container = "mp4";
   private int height;
   private int width;
   private int frameCount;
   @NotNull
   private String frameRateType = "constant";
   private int frameRate;
   private int left;
   private int top;
   @Nullable
   private Map<String, Object> unknown;
   @Nullable
   private Map<String, Object> payloadUnknown;
   @Nullable
   private Map<String, Object> dataUnknown;

   public RRWebVideoEvent() {
      super(RRWebEventType.Custom);
      this.tag = "video";
   }

   @NotNull
   public String getTag() {
      return this.tag;
   }

   public void setTag(@NotNull String var1) {
      this.tag = var1;
   }

   public int getSegmentId() {
      return this.segmentId;
   }

   public void setSegmentId(int var1) {
      this.segmentId = var1;
   }

   public long getSize() {
      return this.size;
   }

   public void setSize(long var1) {
      this.size = var1;
   }

   public long getDurationMs() {
      return this.durationMs;
   }

   public void setDurationMs(long var1) {
      this.durationMs = var1;
   }

   @NotNull
   public String getEncoding() {
      return this.encoding;
   }

   public void setEncoding(@NotNull String var1) {
      this.encoding = var1;
   }

   @NotNull
   public String getContainer() {
      return this.container;
   }

   public void setContainer(@NotNull String var1) {
      this.container = var1;
   }

   public int getHeight() {
      return this.height;
   }

   public void setHeight(int var1) {
      this.height = var1;
   }

   public int getWidth() {
      return this.width;
   }

   public void setWidth(int var1) {
      this.width = var1;
   }

   public int getFrameCount() {
      return this.frameCount;
   }

   public void setFrameCount(int var1) {
      this.frameCount = var1;
   }

   @NotNull
   public String getFrameRateType() {
      return this.frameRateType;
   }

   public void setFrameRateType(@NotNull String var1) {
      this.frameRateType = var1;
   }

   public int getFrameRate() {
      return this.frameRate;
   }

   public void setFrameRate(int var1) {
      this.frameRate = var1;
   }

   public int getLeft() {
      return this.left;
   }

   public void setLeft(int var1) {
      this.left = var1;
   }

   public int getTop() {
      return this.top;
   }

   public void setTop(int var1) {
      this.top = var1;
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
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 == null || this.getClass() != var1.getClass()) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      RRWebVideoEvent var2 = (RRWebVideoEvent)var1;
      return this.segmentId == var2.segmentId
         && this.size == var2.size
         && this.durationMs == var2.durationMs
         && this.height == var2.height
         && this.width == var2.width
         && this.frameCount == var2.frameCount
         && this.frameRate == var2.frameRate
         && this.left == var2.left
         && this.top == var2.top
         && Objects.equals(this.tag, var2.tag)
         && Objects.equals(this.encoding, var2.encoding)
         && Objects.equals(this.container, var2.container)
         && Objects.equals(this.frameRateType, var2.frameRateType);
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         super.hashCode(),
         this.tag,
         this.segmentId,
         this.size,
         this.durationMs,
         this.encoding,
         this.container,
         this.height,
         this.width,
         this.frameCount,
         this.frameRateType,
         this.frameRate,
         this.left,
         this.top
      );
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
      var1.name("segmentId").value(this.segmentId);
      var1.name("size").value(this.size);
      var1.name("duration").value(this.durationMs);
      var1.name("encoding").value(this.encoding);
      var1.name("container").value(this.container);
      var1.name("height").value(this.height);
      var1.name("width").value(this.width);
      var1.name("frameCount").value(this.frameCount);
      var1.name("frameRate").value(this.frameRate);
      var1.name("frameRateType").value(this.frameRateType);
      var1.name("left").value(this.left);
      var1.name("top").value(this.top);
      if (this.payloadUnknown != null) {
         for (String var4 : this.payloadUnknown.keySet()) {
            Object var5 = this.payloadUnknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<RRWebVideoEvent> {
      @NotNull
      public RRWebVideoEvent deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         HashMap var3 = null;
         RRWebVideoEvent var4 = new RRWebVideoEvent();
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

      private void deserializeData(@NotNull RRWebVideoEvent var1, @NotNull ObjectReader var2, @NotNull ILogger var3) {
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

      private void deserializePayload(@NotNull RRWebVideoEvent var1, @NotNull ObjectReader var2, @NotNull ILogger var3) {
         ConcurrentHashMap var4 = null;
         var2.beginObject();

         while (var2.peek() == JsonToken.NAME) {
            String var5 = var2.nextName();
            switch (var5) {
               case "segmentId":
                  var1.segmentId = var2.nextInt();
                  break;
               case "size":
                  Long var8 = var2.nextLongOrNull();
                  var1.size = var8 == null ? 0L : var8;
                  break;
               case "duration":
                  var1.durationMs = var2.nextLong();
                  break;
               case "container":
                  String var9 = var2.nextStringOrNull();
                  var1.container = var9 == null ? "" : var9;
                  break;
               case "encoding":
                  String var10 = var2.nextStringOrNull();
                  var1.encoding = var10 == null ? "" : var10;
                  break;
               case "height":
                  Integer var11 = var2.nextIntegerOrNull();
                  var1.height = var11 == null ? 0 : var11;
                  break;
               case "width":
                  Integer var12 = var2.nextIntegerOrNull();
                  var1.width = var12 == null ? 0 : var12;
                  break;
               case "frameCount":
                  Integer var13 = var2.nextIntegerOrNull();
                  var1.frameCount = var13 == null ? 0 : var13;
                  break;
               case "frameRate":
                  Integer var14 = var2.nextIntegerOrNull();
                  var1.frameRate = var14 == null ? 0 : var14;
                  break;
               case "frameRateType":
                  String var15 = var2.nextStringOrNull();
                  var1.frameRateType = var15 == null ? "" : var15;
                  break;
               case "left":
                  Integer var16 = var2.nextIntegerOrNull();
                  var1.left = var16 == null ? 0 : var16;
                  break;
               case "top":
                  Integer var17 = var2.nextIntegerOrNull();
                  var1.top = var17 == null ? 0 : var17;
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
      public static final String SEGMENT_ID = "segmentId";
      public static final String SIZE = "size";
      public static final String DURATION = "duration";
      public static final String ENCODING = "encoding";
      public static final String CONTAINER = "container";
      public static final String HEIGHT = "height";
      public static final String WIDTH = "width";
      public static final String FRAME_COUNT = "frameCount";
      public static final String FRAME_RATE_TYPE = "frameRateType";
      public static final String FRAME_RATE = "frameRate";
      public static final String LEFT = "left";
      public static final String TOP = "top";
   }
}
