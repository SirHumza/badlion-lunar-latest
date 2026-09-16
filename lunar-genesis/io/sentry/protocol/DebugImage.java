package io.sentry.protocol;

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

public final class DebugImage implements JsonSerializable, JsonUnknown {
   public static final String PROGUARD = "proguard";
   public static final String JVM = "jvm";
   @Nullable
   private String uuid;
   @Nullable
   private String type;
   @Nullable
   private String debugId;
   @Nullable
   private String debugFile;
   @Nullable
   private String codeId;
   @Nullable
   private String codeFile;
   @Nullable
   private String imageAddr;
   @Nullable
   private Long imageSize;
   @Nullable
   private String arch;
   @Nullable
   private Map<String, Object> unknown;

   @Nullable
   public String getUuid() {
      return this.uuid;
   }

   public void setUuid(@Nullable String var1) {
      this.uuid = var1;
   }

   @Nullable
   public String getType() {
      return this.type;
   }

   public void setType(@Nullable String var1) {
      this.type = var1;
   }

   @Nullable
   public String getDebugId() {
      return this.debugId;
   }

   public void setDebugId(@Nullable String var1) {
      this.debugId = var1;
   }

   @Nullable
   public String getDebugFile() {
      return this.debugFile;
   }

   public void setDebugFile(@Nullable String var1) {
      this.debugFile = var1;
   }

   @Nullable
   public String getCodeFile() {
      return this.codeFile;
   }

   public void setCodeFile(@Nullable String var1) {
      this.codeFile = var1;
   }

   @Nullable
   public String getImageAddr() {
      return this.imageAddr;
   }

   public void setImageAddr(@Nullable String var1) {
      this.imageAddr = var1;
   }

   @Nullable
   public Long getImageSize() {
      return this.imageSize;
   }

   public void setImageSize(@Nullable Long var1) {
      this.imageSize = var1;
   }

   public void setImageSize(long var1) {
      this.imageSize = var1;
   }

   @Nullable
   public String getArch() {
      return this.arch;
   }

   public void setArch(@Nullable String var1) {
      this.arch = var1;
   }

   @Nullable
   public String getCodeId() {
      return this.codeId;
   }

   public void setCodeId(@Nullable String var1) {
      this.codeId = var1;
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
      if (this.uuid != null) {
         var1.name("uuid").value(this.uuid);
      }

      if (this.type != null) {
         var1.name("type").value(this.type);
      }

      if (this.debugId != null) {
         var1.name("debug_id").value(this.debugId);
      }

      if (this.debugFile != null) {
         var1.name("debug_file").value(this.debugFile);
      }

      if (this.codeId != null) {
         var1.name("code_id").value(this.codeId);
      }

      if (this.codeFile != null) {
         var1.name("code_file").value(this.codeFile);
      }

      if (this.imageAddr != null) {
         var1.name("image_addr").value(this.imageAddr);
      }

      if (this.imageSize != null) {
         var1.name("image_size").value(this.imageSize);
      }

      if (this.arch != null) {
         var1.name("arch").value(this.arch);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<DebugImage> {
      @NotNull
      public DebugImage deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         DebugImage var3 = new DebugImage();
         HashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "uuid":
                  var3.uuid = var1.nextStringOrNull();
                  break;
               case "type":
                  var3.type = var1.nextStringOrNull();
                  break;
               case "debug_id":
                  var3.debugId = var1.nextStringOrNull();
                  break;
               case "debug_file":
                  var3.debugFile = var1.nextStringOrNull();
                  break;
               case "code_id":
                  var3.codeId = var1.nextStringOrNull();
                  break;
               case "code_file":
                  var3.codeFile = var1.nextStringOrNull();
                  break;
               case "image_addr":
                  var3.imageAddr = var1.nextStringOrNull();
                  break;
               case "image_size":
                  var3.imageSize = var1.nextLongOrNull();
                  break;
               case "arch":
                  var3.arch = var1.nextStringOrNull();
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
      public static final String UUID = "uuid";
      public static final String TYPE = "type";
      public static final String DEBUG_ID = "debug_id";
      public static final String DEBUG_FILE = "debug_file";
      public static final String CODE_ID = "code_id";
      public static final String CODE_FILE = "code_file";
      public static final String IMAGE_ADDR = "image_addr";
      public static final String IMAGE_SIZE = "image_size";
      public static final String ARCH = "arch";
   }
}
