package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class RRWebInteractionEvent extends RRWebIncrementalSnapshotEvent implements JsonSerializable, JsonUnknown {
   private static final int POINTER_TYPE_TOUCH = 2;
   @Nullable
   private RRWebInteractionEvent.InteractionType interactionType;
   private int id;
   private float x;
   private float y;
   private int pointerType = 2;
   private int pointerId;
   @Nullable
   private Map<String, Object> unknown;
   @Nullable
   private Map<String, Object> dataUnknown;

   public RRWebInteractionEvent() {
      super(RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction);
   }

   @Nullable
   public RRWebInteractionEvent.InteractionType getInteractionType() {
      return this.interactionType;
   }

   public void setInteractionType(@Nullable RRWebInteractionEvent.InteractionType var1) {
      this.interactionType = var1;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public float getX() {
      return this.x;
   }

   public void setX(float var1) {
      this.x = var1;
   }

   public float getY() {
      return this.y;
   }

   public void setY(float var1) {
      this.y = var1;
   }

   public int getPointerType() {
      return this.pointerType;
   }

   public void setPointerType(int var1) {
      this.pointerType = var1;
   }

   public int getPointerId() {
      return this.pointerId;
   }

   public void setPointerId(int var1) {
      this.pointerId = var1;
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
      new RRWebIncrementalSnapshotEvent.Serializer().serialize(this, var1, var2);
      var1.name("type").value(var2, this.interactionType);
      var1.name("id").value(this.id);
      var1.name("x").value(this.x);
      var1.name("y").value(this.y);
      var1.name("pointerType").value(this.pointerType);
      var1.name("pointerId").value(this.pointerId);
      if (this.dataUnknown != null) {
         for (String var4 : this.dataUnknown.keySet()) {
            Object var5 = this.dataUnknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<RRWebInteractionEvent> {
      @NotNull
      public RRWebInteractionEvent deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         HashMap var3 = null;
         RRWebInteractionEvent var4 = new RRWebInteractionEvent();
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

      private void deserializeData(@NotNull RRWebInteractionEvent var1, @NotNull ObjectReader var2, @NotNull ILogger var3) {
         HashMap var4 = null;
         RRWebIncrementalSnapshotEvent.Deserializer var5 = new RRWebIncrementalSnapshotEvent.Deserializer();
         var2.beginObject();

         while (var2.peek() == JsonToken.NAME) {
            String var6 = var2.nextName();
            switch (var6) {
               case "type":
                  var1.interactionType = var2.nextOrNull(var3, new RRWebInteractionEvent.InteractionType.Deserializer());
                  break;
               case "id":
                  var1.id = var2.nextInt();
                  break;
               case "x":
                  var1.x = var2.nextFloat();
                  break;
               case "y":
                  var1.y = var2.nextFloat();
                  break;
               case "pointerType":
                  var1.pointerType = var2.nextInt();
                  break;
               case "pointerId":
                  var1.pointerId = var2.nextInt();
                  break;
               default:
                  if (!var5.deserializeValue(var1, var6, var2, var3)) {
                     if (var4 == null) {
                        var4 = new HashMap();
                     }

                     var2.nextUnknown(var3, var4, var6);
                  }
            }
         }

         var1.setDataUnknown(var4);
         var2.endObject();
      }
   }

   public enum InteractionType implements JsonSerializable {
      MouseUp,
      MouseDown,
      Click,
      ContextMenu,
      DblClick,
      Focus,
      Blur,
      TouchStart,
      TouchMove_Departed,
      TouchEnd,
      TouchCancel;

      @Override
      public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
         var1.value(this.ordinal());
      }

      public static final class Deserializer implements JsonDeserializer<RRWebInteractionEvent.InteractionType> {
         @NotNull
         public RRWebInteractionEvent.InteractionType deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
            return RRWebInteractionEvent.InteractionType.values()[var1.nextInt()];
         }
      }
   }

   public static final class JsonKeys {
      public static final String DATA = "data";
      public static final String TYPE = "type";
      public static final String ID = "id";
      public static final String X = "x";
      public static final String Y = "y";
      public static final String POINTER_TYPE = "pointerType";
      public static final String POINTER_ID = "pointerId";
   }
}
