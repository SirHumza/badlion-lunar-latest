package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryReplayEvent extends SentryBaseEvent implements JsonSerializable, JsonUnknown {
   public static final long REPLAY_VIDEO_MAX_SIZE = 10485760L;
   public static final String REPLAY_EVENT_TYPE = "replay_event";
   @Nullable
   private File videoFile;
   @NotNull
   private String type;
   @NotNull
   private SentryReplayEvent.ReplayType replayType;
   @Nullable
   private SentryId replayId = new SentryId();
   private int segmentId;
   @NotNull
   private Date timestamp;
   @Nullable
   private Date replayStartTimestamp;
   @Nullable
   private List<String> urls;
   @Nullable
   private List<String> errorIds;
   @Nullable
   private List<String> traceIds;
   @Nullable
   private Map<String, Object> unknown;

   public SentryReplayEvent() {
      this.type = "replay_event";
      this.replayType = SentryReplayEvent.ReplayType.SESSION;
      this.errorIds = new ArrayList<>();
      this.traceIds = new ArrayList<>();
      this.urls = new ArrayList<>();
      this.timestamp = DateUtils.getCurrentDateTime();
   }

   @Nullable
   public File getVideoFile() {
      return this.videoFile;
   }

   public void setVideoFile(@Nullable File var1) {
      this.videoFile = var1;
   }

   @NotNull
   public String getType() {
      return this.type;
   }

   public void setType(@NotNull String var1) {
      this.type = var1;
   }

   @Nullable
   public SentryId getReplayId() {
      return this.replayId;
   }

   public void setReplayId(@Nullable SentryId var1) {
      this.replayId = var1;
   }

   public int getSegmentId() {
      return this.segmentId;
   }

   public void setSegmentId(int var1) {
      this.segmentId = var1;
   }

   @NotNull
   public Date getTimestamp() {
      return this.timestamp;
   }

   public void setTimestamp(@NotNull Date var1) {
      this.timestamp = var1;
   }

   @Nullable
   public Date getReplayStartTimestamp() {
      return this.replayStartTimestamp;
   }

   public void setReplayStartTimestamp(@Nullable Date var1) {
      this.replayStartTimestamp = var1;
   }

   @Nullable
   public List<String> getUrls() {
      return this.urls;
   }

   public void setUrls(@Nullable List<String> var1) {
      this.urls = var1;
   }

   @Nullable
   public List<String> getErrorIds() {
      return this.errorIds;
   }

   public void setErrorIds(@Nullable List<String> var1) {
      this.errorIds = var1;
   }

   @Nullable
   public List<String> getTraceIds() {
      return this.traceIds;
   }

   public void setTraceIds(@Nullable List<String> var1) {
      this.traceIds = var1;
   }

   @NotNull
   public SentryReplayEvent.ReplayType getReplayType() {
      return this.replayType;
   }

   public void setReplayType(@NotNull SentryReplayEvent.ReplayType var1) {
      this.replayType = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         SentryReplayEvent var2 = (SentryReplayEvent)var1;
         return this.segmentId == var2.segmentId
            && Objects.equals(this.type, var2.type)
            && this.replayType == var2.replayType
            && Objects.equals(this.replayId, var2.replayId)
            && Objects.equals(this.urls, var2.urls)
            && Objects.equals(this.errorIds, var2.errorIds)
            && Objects.equals(this.traceIds, var2.traceIds);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.type, this.replayType, this.replayId, this.segmentId, this.urls, this.errorIds, this.traceIds);
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("type").value(this.type);
      var1.name("replay_type").value(var2, this.replayType);
      var1.name("segment_id").value(this.segmentId);
      var1.name("timestamp").value(var2, this.timestamp);
      if (this.replayId != null) {
         var1.name("replay_id").value(var2, this.replayId);
      }

      if (this.replayStartTimestamp != null) {
         var1.name("replay_start_timestamp").value(var2, this.replayStartTimestamp);
      }

      if (this.urls != null) {
         var1.name("urls").value(var2, this.urls);
      }

      if (this.errorIds != null) {
         var1.name("error_ids").value(var2, this.errorIds);
      }

      if (this.traceIds != null) {
         var1.name("trace_ids").value(var2, this.traceIds);
      }

      new SentryBaseEvent.Serializer().serialize(this, var1, var2);
      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
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

   public static final class Deserializer implements JsonDeserializer<SentryReplayEvent> {
      @NotNull
      public SentryReplayEvent deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         SentryBaseEvent.Deserializer var3 = new SentryBaseEvent.Deserializer();
         SentryReplayEvent var4 = new SentryReplayEvent();
         HashMap var5 = null;
         String var6 = null;
         SentryReplayEvent.ReplayType var7 = null;
         SentryId var8 = null;
         Integer var9 = null;
         Date var10 = null;
         Date var11 = null;
         List var12 = null;
         List var13 = null;
         List var14 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var15 = var1.nextName();
            switch (var15) {
               case "type":
                  var6 = var1.nextStringOrNull();
                  break;
               case "replay_type":
                  var7 = var1.nextOrNull(var2, new SentryReplayEvent.ReplayType.Deserializer());
                  break;
               case "replay_id":
                  var8 = var1.nextOrNull(var2, new SentryId.Deserializer());
                  break;
               case "segment_id":
                  var9 = var1.nextIntegerOrNull();
                  break;
               case "timestamp":
                  var10 = var1.nextDateOrNull(var2);
                  break;
               case "replay_start_timestamp":
                  var11 = var1.nextDateOrNull(var2);
                  break;
               case "urls":
                  var12 = (List)var1.nextObjectOrNull();
                  break;
               case "error_ids":
                  var13 = (List)var1.nextObjectOrNull();
                  break;
               case "trace_ids":
                  var14 = (List)var1.nextObjectOrNull();
                  break;
               default:
                  if (!var3.deserializeValue(var4, var15, var1, var2)) {
                     if (var5 == null) {
                        var5 = new HashMap();
                     }

                     var1.nextUnknown(var2, var5, var15);
                  }
            }
         }

         var1.endObject();
         if (var6 != null) {
            var4.setType(var6);
         }

         if (var7 != null) {
            var4.setReplayType(var7);
         }

         if (var9 != null) {
            var4.setSegmentId(var9);
         }

         if (var10 != null) {
            var4.setTimestamp(var10);
         }

         var4.setReplayId(var8);
         var4.setReplayStartTimestamp(var11);
         var4.setUrls(var12);
         var4.setErrorIds(var13);
         var4.setTraceIds(var14);
         var4.setUnknown(var5);
         return var4;
      }
   }

   public static final class JsonKeys {
      public static final String TYPE = "type";
      public static final String REPLAY_TYPE = "replay_type";
      public static final String REPLAY_ID = "replay_id";
      public static final String SEGMENT_ID = "segment_id";
      public static final String TIMESTAMP = "timestamp";
      public static final String REPLAY_START_TIMESTAMP = "replay_start_timestamp";
      public static final String URLS = "urls";
      public static final String ERROR_IDS = "error_ids";
      public static final String TRACE_IDS = "trace_ids";
   }

   public enum ReplayType implements JsonSerializable {
      SESSION,
      BUFFER;

      @Override
      public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
         var1.value(this.name().toLowerCase(Locale.ROOT));
      }

      public static final class Deserializer implements JsonDeserializer<SentryReplayEvent.ReplayType> {
         @NotNull
         public SentryReplayEvent.ReplayType deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
            return SentryReplayEvent.ReplayType.valueOf(var1.nextString().toUpperCase(Locale.ROOT));
         }
      }
   }
}
