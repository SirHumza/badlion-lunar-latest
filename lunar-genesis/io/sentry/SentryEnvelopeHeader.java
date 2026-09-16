package io.sentry;

import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SentryEnvelopeHeader implements JsonSerializable, JsonUnknown {
   @Nullable
   private final SentryId eventId;
   @Nullable
   private final SdkVersion sdkVersion;
   @Nullable
   private final TraceContext traceContext;
   @Nullable
   private Date sentAt;
   @Nullable
   private Map<String, Object> unknown;

   public SentryEnvelopeHeader(@Nullable SentryId var1, @Nullable SdkVersion var2) {
      this(var1, var2, null);
   }

   public SentryEnvelopeHeader(@Nullable SentryId var1, @Nullable SdkVersion var2, @Nullable TraceContext var3) {
      this.eventId = var1;
      this.sdkVersion = var2;
      this.traceContext = var3;
   }

   public SentryEnvelopeHeader(@Nullable SentryId var1) {
      this(var1, null);
   }

   public SentryEnvelopeHeader() {
      this(new SentryId());
   }

   @Nullable
   public SentryId getEventId() {
      return this.eventId;
   }

   @Nullable
   public SdkVersion getSdkVersion() {
      return this.sdkVersion;
   }

   @Nullable
   public TraceContext getTraceContext() {
      return this.traceContext;
   }

   @Nullable
   public Date getSentAt() {
      return this.sentAt;
   }

   public void setSentAt(@Nullable Date var1) {
      this.sentAt = var1;
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.eventId != null) {
         var1.name("event_id").value(var2, this.eventId);
      }

      if (this.sdkVersion != null) {
         var1.name("sdk").value(var2, this.sdkVersion);
      }

      if (this.traceContext != null) {
         var1.name("trace").value(var2, this.traceContext);
      }

      if (this.sentAt != null) {
         var1.name("sent_at").value(var2, DateUtils.getTimestamp(this.sentAt));
      }

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

   public static final class Deserializer implements JsonDeserializer<SentryEnvelopeHeader> {
      @NotNull
      public SentryEnvelopeHeader deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         SentryId var3 = null;
         SdkVersion var4 = null;
         TraceContext var5 = null;
         Date var6 = null;
         HashMap var7 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var8 = var1.nextName();
            switch (var8) {
               case "event_id":
                  var3 = var1.nextOrNull(var2, new SentryId.Deserializer());
                  break;
               case "sdk":
                  var4 = var1.nextOrNull(var2, new SdkVersion.Deserializer());
                  break;
               case "trace":
                  var5 = var1.nextOrNull(var2, new TraceContext.Deserializer());
                  break;
               case "sent_at":
                  var6 = var1.nextDateOrNull(var2);
                  break;
               default:
                  if (var7 == null) {
                     var7 = new HashMap();
                  }

                  var1.nextUnknown(var2, var7, var8);
            }
         }

         SentryEnvelopeHeader var11 = new SentryEnvelopeHeader(var3, var4, var5);
         var11.setSentAt(var6);
         var11.setUnknown(var7);
         var1.endObject();
         return var11;
      }
   }

   public static final class JsonKeys {
      public static final String EVENT_ID = "event_id";
      public static final String SDK = "sdk";
      public static final String TRACE = "trace";
      public static final String SENT_AT = "sent_at";
   }
}
