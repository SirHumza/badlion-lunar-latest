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

public final class RRWebMetaEvent extends RRWebEvent implements JsonSerializable, JsonUnknown {
   @NotNull
   private String href = "";
   private int height;
   private int width;
   @Nullable
   private Map<String, Object> unknown;
   @Nullable
   private Map<String, Object> dataUnknown;

   public RRWebMetaEvent() {
      super(RRWebEventType.Meta);
   }

   @NotNull
   public String getHref() {
      return this.href;
   }

   public void setHref(@NotNull String var1) {
      this.href = var1;
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

   @Nullable
   public Map<String, Object> getDataUnknown() {
      return this.dataUnknown;
   }

   public void setDataUnknown(@Nullable Map<String, Object> var1) {
      this.dataUnknown = var1;
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

      RRWebMetaEvent var2 = (RRWebMetaEvent)var1;
      return this.height == var2.height && this.width == var2.width && Objects.equals(this.href, var2.href);
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.href, this.height, this.width);
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      new RRWebEvent.Serializer().serialize(this, var1, var2);
      var1.name("data");
      this.serializeData(var1, var2);
      var1.endObject();
   }

   private void serializeData(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("href").value(this.href);
      var1.name("height").value(this.height);
      var1.name("width").value(this.width);
      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4);
            var1.value(var2, var5);
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

   public static final class Deserializer implements JsonDeserializer<RRWebMetaEvent> {
      @NotNull
      public RRWebMetaEvent deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         HashMap var3 = null;
         RRWebMetaEvent var4 = new RRWebMetaEvent();
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

      private void deserializeData(@NotNull RRWebMetaEvent var1, @NotNull ObjectReader var2, @NotNull ILogger var3) {
         ConcurrentHashMap var4 = null;
         var2.beginObject();

         while (var2.peek() == JsonToken.NAME) {
            String var5 = var2.nextName();
            switch (var5) {
               case "href":
                  String var8 = var2.nextStringOrNull();
                  var1.href = var8 == null ? "" : var8;
                  break;
               case "height":
                  Integer var9 = var2.nextIntegerOrNull();
                  var1.height = var9 == null ? 0 : var9;
                  break;
               case "width":
                  Integer var10 = var2.nextIntegerOrNull();
                  var1.width = var10 == null ? 0 : var10;
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
   }

   public static final class JsonKeys {
      public static final String DATA = "data";
      public static final String HREF = "href";
      public static final String HEIGHT = "height";
      public static final String WIDTH = "width";
   }
}
