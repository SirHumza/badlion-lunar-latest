package io.sentry;

import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import io.sentry.rrweb.RRWebMetaEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.MapObjectReader;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReplayRecording implements JsonSerializable, JsonUnknown {
   @Nullable
   private Integer segmentId;
   @Nullable
   private List<? extends RRWebEvent> payload;
   @Nullable
   private Map<String, Object> unknown;

   @Nullable
   public Integer getSegmentId() {
      return this.segmentId;
   }

   public void setSegmentId(@Nullable Integer var1) {
      this.segmentId = var1;
   }

   @Nullable
   public List<? extends RRWebEvent> getPayload() {
      return this.payload;
   }

   public void setPayload(@Nullable List<? extends RRWebEvent> var1) {
      this.payload = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ReplayRecording var2 = (ReplayRecording)var1;
         return Objects.equals(this.segmentId, var2.segmentId) && Objects.equals(this.payload, var2.payload);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.segmentId, this.payload);
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.segmentId != null) {
         var1.name("segment_id").value(this.segmentId);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
      var1.setLenient(true);
      if (this.segmentId != null) {
         var1.jsonValue("\n");
      }

      if (this.payload != null) {
         var1.value(var2, this.payload);
      }

      var1.setLenient(false);
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

   public static final class Deserializer implements JsonDeserializer<ReplayRecording> {
      @NotNull
      public ReplayRecording deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         ReplayRecording var3 = new ReplayRecording();
         HashMap var4 = null;
         Integer var5 = null;
         ArrayList var6 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var7 = var1.nextName();
            switch (var7) {
               case "segment_id":
                  var5 = var1.nextIntegerOrNull();
                  break;
               default:
                  if (var4 == null) {
                     var4 = new HashMap();
                  }

                  var1.nextUnknown(var2, var4, var7);
            }
         }

         var1.endObject();
         var1.setLenient(true);
         List var27 = (List)var1.nextObjectOrNull();
         var1.setLenient(false);
         if (var27 != null) {
            var6 = new ArrayList(var27.size());

            for (Object var29 : var27) {
               if (var29 instanceof Map) {
                  Map var10 = (Map)var29;
                  MapObjectReader var11 = new MapObjectReader(var10);

                  for (Entry var13 : var10.entrySet()) {
                     String var14 = (String)var13.getKey();
                     Object var15 = var13.getValue();
                     if (var14.equals("type")) {
                        RRWebEventType var16 = RRWebEventType.values()[(Integer)var15];
                        switch (var16) {
                           case IncrementalSnapshot:
                              Map var17 = (Map)var10.get("data");
                              if (var17 == null) {
                                 var17 = Collections.emptyMap();
                              }

                              Integer var18 = (Integer)var17.get("source");
                              if (var18 != null) {
                                 RRWebIncrementalSnapshotEvent.IncrementalSource var30 = RRWebIncrementalSnapshotEvent.IncrementalSource.values()[var18];
                                 switch (var30) {
                                    case MouseInteraction:
                                       RRWebInteractionEvent var31 = new RRWebInteractionEvent.Deserializer().deserialize(var11, var2);
                                       var6.add(var31);
                                       continue;
                                    case TouchMove:
                                       RRWebInteractionMoveEvent var32 = new RRWebInteractionMoveEvent.Deserializer().deserialize(var11, var2);
                                       var6.add(var32);
                                       continue;
                                    default:
                                       var2.log(SentryLevel.DEBUG, "Unsupported rrweb incremental snapshot type %s", var30);
                                 }
                              }
                              break;
                           case Meta:
                              RRWebMetaEvent var19 = new RRWebMetaEvent.Deserializer().deserialize(var11, var2);
                              var6.add(var19);
                              break;
                           case Custom:
                              Map var20 = (Map)var10.get("data");
                              if (var20 == null) {
                                 var20 = Collections.emptyMap();
                              }

                              String var21 = (String)var20.get("tag");
                              if (var21 != null) {
                                 switch (var21) {
                                    case "video":
                                       RRWebVideoEvent var24 = new RRWebVideoEvent.Deserializer().deserialize(var11, var2);
                                       var6.add(var24);
                                       continue;
                                    case "breadcrumb":
                                       RRWebBreadcrumbEvent var25 = new RRWebBreadcrumbEvent.Deserializer().deserialize(var11, var2);
                                       var6.add(var25);
                                       continue;
                                    case "performanceSpan":
                                       RRWebSpanEvent var26 = new RRWebSpanEvent.Deserializer().deserialize(var11, var2);
                                       var6.add(var26);
                                       continue;
                                    default:
                                       var2.log(SentryLevel.DEBUG, "Unsupported rrweb event type %s", var16);
                                 }
                              }
                              break;
                           default:
                              var2.log(SentryLevel.DEBUG, "Unsupported rrweb event type %s", var16);
                        }
                     }
                  }
               }
            }
         }

         var3.setSegmentId(var5);
         var3.setPayload(var6);
         var3.setUnknown(var4);
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String SEGMENT_ID = "segment_id";
   }
}
