package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DebugMeta implements JsonSerializable, JsonUnknown {
   @Nullable
   private SdkInfo sdkInfo;
   @Nullable
   private List<DebugImage> images;
   @Nullable
   private Map<String, Object> unknown;

   @Nullable
   public List<DebugImage> getImages() {
      return this.images;
   }

   public void setImages(@Nullable List<DebugImage> var1) {
      this.images = var1 != null ? new ArrayList<>(var1) : null;
   }

   @Nullable
   public SdkInfo getSdkInfo() {
      return this.sdkInfo;
   }

   public void setSdkInfo(@Nullable SdkInfo var1) {
      this.sdkInfo = var1;
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
      if (this.sdkInfo != null) {
         var1.name("sdk_info").value(var2, this.sdkInfo);
      }

      if (this.images != null) {
         var1.name("images").value(var2, this.images);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<DebugMeta> {
      @NotNull
      public DebugMeta deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         DebugMeta var3 = new DebugMeta();
         HashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "sdk_info":
                  var3.sdkInfo = var1.nextOrNull(var2, new SdkInfo.Deserializer());
                  break;
               case "images":
                  var3.images = var1.nextListOrNull(var2, new DebugImage.Deserializer());
                  break;
               default:
                  if (var4 == null) {
                     var4 = new HashMap();
                  }

                  var1.nextUnknown(var2, var4, var5);
            }
         }

         var1.endObject();
         var3.setUnknown(var4);
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String SDK_INFO = "sdk_info";
      public static final String IMAGES = "images";
   }
}
