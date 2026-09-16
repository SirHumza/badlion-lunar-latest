package io.sentry;

import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SentryEnvelopeItemHeader implements JsonSerializable, JsonUnknown {
   @Nullable
   private final String contentType;
   @Nullable
   private final String fileName;
   @NotNull
   private final SentryItemType type;
   private final int length;
   @Nullable
   private final Callable<Integer> getLength;
   @Nullable
   private final String attachmentType;
   @Nullable
   private Map<String, Object> unknown;

   @NotNull
   public SentryItemType getType() {
      return this.type;
   }

   public int getLength() {
      if (this.getLength != null) {
         try {
            return this.getLength.call();
         } catch (Throwable var2) {
            return -1;
         }
      } else {
         return this.length;
      }
   }

   @Nullable
   public String getContentType() {
      return this.contentType;
   }

   @Nullable
   public String getFileName() {
      return this.fileName;
   }

   @ApiStatus.Internal
   public SentryEnvelopeItemHeader(@NotNull SentryItemType var1, int var2, @Nullable String var3, @Nullable String var4, @Nullable String var5) {
      this.type = Objects.requireNonNull(var1, "type is required");
      this.contentType = var3;
      this.length = var2;
      this.fileName = var4;
      this.getLength = null;
      this.attachmentType = var5;
   }

   SentryEnvelopeItemHeader(@NotNull SentryItemType var1, @Nullable Callable<Integer> var2, @Nullable String var3, @Nullable String var4, @Nullable String var5) {
      this.type = Objects.requireNonNull(var1, "type is required");
      this.contentType = var3;
      this.length = -1;
      this.fileName = var4;
      this.getLength = var2;
      this.attachmentType = var5;
   }

   SentryEnvelopeItemHeader(@NotNull SentryItemType var1, @Nullable Callable<Integer> var2, @Nullable String var3, @Nullable String var4) {
      this(var1, var2, var3, var4, null);
   }

   @Nullable
   public String getAttachmentType() {
      return this.attachmentType;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.contentType != null) {
         var1.name("content_type").value(this.contentType);
      }

      if (this.fileName != null) {
         var1.name("filename").value(this.fileName);
      }

      var1.name("type").value(var2, this.type);
      if (this.attachmentType != null) {
         var1.name("attachment_type").value(this.attachmentType);
      }

      var1.name("length").value(this.getLength());
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

   public static final class Deserializer implements JsonDeserializer<SentryEnvelopeItemHeader> {
      @NotNull
      public SentryEnvelopeItemHeader deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         String var3 = null;
         String var4 = null;
         SentryItemType var5 = null;
         int var6 = 0;
         String var7 = null;
         HashMap var8 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var9 = var1.nextName();
            switch (var9) {
               case "content_type":
                  var3 = var1.nextStringOrNull();
                  break;
               case "filename":
                  var4 = var1.nextStringOrNull();
                  break;
               case "type":
                  var5 = var1.nextOrNull(var2, new SentryItemType.Deserializer());
                  break;
               case "length":
                  var6 = var1.nextInt();
                  break;
               case "attachment_type":
                  var7 = var1.nextStringOrNull();
                  break;
               default:
                  if (var8 == null) {
                     var8 = new HashMap();
                  }

                  var1.nextUnknown(var2, var8, var9);
            }
         }

         if (var5 == null) {
            throw this.missingRequiredFieldException("type", var2);
         }

         SentryEnvelopeItemHeader var12 = new SentryEnvelopeItemHeader(var5, var6, var3, var4, var7);
         var12.setUnknown(var8);
         var1.endObject();
         return var12;
      }

      private Exception missingRequiredFieldException(String var1, ILogger var2) {
         String var3 = "Missing required field \"" + var1 + "\"";
         IllegalStateException var4 = new IllegalStateException(var3);
         var2.log(SentryLevel.ERROR, var3, var4);
         return var4;
      }
   }

   public static final class JsonKeys {
      public static final String CONTENT_TYPE = "content_type";
      public static final String FILENAME = "filename";
      public static final String TYPE = "type";
      public static final String ATTACHMENT_TYPE = "attachment_type";
      public static final String LENGTH = "length";
   }
}
