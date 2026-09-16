package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
public final class TraceContext implements JsonSerializable, JsonUnknown {
   @NotNull
   private final SentryId traceId;
   @NotNull
   private final String publicKey;
   @Nullable
   private final String release;
   @Nullable
   private final String environment;
   @Nullable
   private final String userId;
   @Nullable
   private final String userSegment;
   @Nullable
   private final String transaction;
   @Nullable
   private final String sampleRate;
   @Nullable
   private final String sampled;
   @Nullable
   private final SentryId replayId;
   @Nullable
   private Map<String, @NotNull Object> unknown;

   TraceContext(@NotNull SentryId var1, @NotNull String var2) {
      this(var1, var2, null, null, null, null, null, null, null);
   }

   TraceContext(
      @NotNull SentryId var1,
      @NotNull String var2,
      @Nullable String var3,
      @Nullable String var4,
      @Nullable String var5,
      @Nullable String var6,
      @Nullable String var7,
      @Nullable String var8,
      @Nullable SentryId var9
   ) {
      this(var1, var2, var3, var4, var5, null, var6, var7, var8, var9);
   }

   @Deprecated
   TraceContext(
      @NotNull SentryId var1,
      @NotNull String var2,
      @Nullable String var3,
      @Nullable String var4,
      @Nullable String var5,
      @Nullable String var6,
      @Nullable String var7,
      @Nullable String var8,
      @Nullable String var9,
      @Nullable SentryId var10
   ) {
      this.traceId = var1;
      this.publicKey = var2;
      this.release = var3;
      this.environment = var4;
      this.userId = var5;
      this.userSegment = var6;
      this.transaction = var7;
      this.sampleRate = var8;
      this.sampled = var9;
      this.replayId = var10;
   }

   @Nullable
   private static String getUserId(@NotNull SentryOptions var0, @Nullable User var1) {
      return var0.isSendDefaultPii() && var1 != null ? var1.getId() : null;
   }

   @NotNull
   public SentryId getTraceId() {
      return this.traceId;
   }

   @NotNull
   public String getPublicKey() {
      return this.publicKey;
   }

   @Nullable
   public String getRelease() {
      return this.release;
   }

   @Nullable
   public String getEnvironment() {
      return this.environment;
   }

   @Nullable
   public String getUserId() {
      return this.userId;
   }

   @Deprecated
   @Nullable
   public String getUserSegment() {
      return this.userSegment;
   }

   @Nullable
   public String getTransaction() {
      return this.transaction;
   }

   @Nullable
   public String getSampleRate() {
      return this.sampleRate;
   }

   @Nullable
   public String getSampled() {
      return this.sampled;
   }

   @Nullable
   public SentryId getReplayId() {
      return this.replayId;
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
      var1.name("trace_id").value(var2, this.traceId);
      var1.name("public_key").value(this.publicKey);
      if (this.release != null) {
         var1.name("release").value(this.release);
      }

      if (this.environment != null) {
         var1.name("environment").value(this.environment);
      }

      if (this.userId != null) {
         var1.name("user_id").value(this.userId);
      }

      if (this.userSegment != null) {
         var1.name("user_segment").value(this.userSegment);
      }

      if (this.transaction != null) {
         var1.name("transaction").value(this.transaction);
      }

      if (this.sampleRate != null) {
         var1.name("sample_rate").value(this.sampleRate);
      }

      if (this.sampled != null) {
         var1.name("sampled").value(this.sampled);
      }

      if (this.replayId != null) {
         var1.name("replay_id").value(var2, this.replayId);
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

   public static final class Deserializer implements JsonDeserializer<TraceContext> {
      @NotNull
      public TraceContext deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         SentryId var3 = null;
         String var4 = null;
         String var5 = null;
         String var6 = null;
         TraceContext.TraceContextUser var7 = null;
         String var8 = null;
         String var9 = null;
         String var10 = null;
         String var11 = null;
         String var12 = null;
         SentryId var13 = null;
         ConcurrentHashMap var14 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var15 = var1.nextName();
            switch (var15) {
               case "trace_id":
                  var3 = new SentryId.Deserializer().deserialize(var1, var2);
                  break;
               case "public_key":
                  var4 = var1.nextString();
                  break;
               case "release":
                  var5 = var1.nextStringOrNull();
                  break;
               case "environment":
                  var6 = var1.nextStringOrNull();
                  break;
               case "user":
                  var7 = var1.nextOrNull(var2, new TraceContext.TraceContextUser.Deserializer());
                  break;
               case "user_id":
                  var8 = var1.nextStringOrNull();
                  break;
               case "user_segment":
                  var9 = var1.nextStringOrNull();
                  break;
               case "transaction":
                  var10 = var1.nextStringOrNull();
                  break;
               case "sample_rate":
                  var11 = var1.nextStringOrNull();
                  break;
               case "sampled":
                  var12 = var1.nextStringOrNull();
                  break;
               case "replay_id":
                  var13 = new SentryId.Deserializer().deserialize(var1, var2);
                  break;
               default:
                  if (var14 == null) {
                     var14 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var14, var15);
            }
         }

         if (var3 == null) {
            throw this.missingRequiredFieldException("trace_id", var2);
         }

         if (var4 == null) {
            throw this.missingRequiredFieldException("public_key", var2);
         }

         if (var7 != null) {
            if (var8 == null) {
               var8 = var7.getId();
            }

            if (var9 == null) {
               var9 = var7.getSegment();
            }
         }

         TraceContext var18 = new TraceContext(var3, var4, var5, var6, var8, var9, var10, var11, var12, var13);
         var18.setUnknown(var14);
         var1.endObject();
         return var18;
      }

      private Exception missingRequiredFieldException(String var1, ILogger var2) {
         String var3 = "Missing required field \"" + var1 + "\"";
         IllegalStateException var4 = new IllegalStateException(var3);
         var2.log(SentryLevel.ERROR, var3, var4);
         return var4;
      }
   }

   public static final class JsonKeys {
      public static final String TRACE_ID = "trace_id";
      public static final String PUBLIC_KEY = "public_key";
      public static final String RELEASE = "release";
      public static final String ENVIRONMENT = "environment";
      public static final String USER = "user";
      public static final String USER_ID = "user_id";
      public static final String USER_SEGMENT = "user_segment";
      public static final String TRANSACTION = "transaction";
      public static final String SAMPLE_RATE = "sample_rate";
      public static final String SAMPLED = "sampled";
      public static final String REPLAY_ID = "replay_id";
   }

   @Deprecated
   private static final class TraceContextUser implements JsonUnknown {
      @Nullable
      private String id;
      @Nullable
      private String segment;
      @Nullable
      private Map<String, @NotNull Object> unknown;

      private TraceContextUser(@Nullable String var1, @Nullable String var2) {
         this.id = var1;
         this.segment = var2;
      }

      @Nullable
      public String getId() {
         return this.id;
      }

      @Deprecated
      @Nullable
      public String getSegment() {
         return this.segment;
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

      public static final class Deserializer implements JsonDeserializer<TraceContext.TraceContextUser> {
         @NotNull
         public TraceContext.TraceContextUser deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
            var1.beginObject();
            String var3 = null;
            String var4 = null;
            ConcurrentHashMap var5 = null;

            while (var1.peek() == JsonToken.NAME) {
               String var6 = var1.nextName();
               switch (var6) {
                  case "id":
                     var3 = var1.nextStringOrNull();
                     break;
                  case "segment":
                     var4 = var1.nextStringOrNull();
                     break;
                  default:
                     if (var5 == null) {
                        var5 = new ConcurrentHashMap();
                     }

                     var1.nextUnknown(var2, var5, var6);
               }
            }

            TraceContext.TraceContextUser var9 = new TraceContext.TraceContextUser(var3, var4);
            var9.setUnknown(var5);
            var1.endObject();
            return var9;
         }
      }

      public static final class JsonKeys {
         public static final String ID = "id";
         public static final String SEGMENT = "segment";
      }
   }
}
