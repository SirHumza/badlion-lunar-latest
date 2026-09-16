package io.sentry;

import io.sentry.protocol.User;
import io.sentry.util.StringUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Session implements JsonSerializable, JsonUnknown {
   @NotNull
   private final Date started;
   @Nullable
   private Date timestamp;
   @NotNull
   private final AtomicInteger errorCount;
   @Nullable
   private final String distinctId;
   @Nullable
   private final UUID sessionId;
   @Nullable
   private Boolean init;
   @NotNull
   private Session.State status;
   @Nullable
   private Long sequence;
   @Nullable
   private Double duration;
   @Nullable
   private final String ipAddress;
   @Nullable
   private String userAgent;
   @Nullable
   private final String environment;
   @NotNull
   private final String release;
   @Nullable
   private String abnormalMechanism;
   @NotNull
   private final Object sessionLock = new Object();
   @Nullable
   private Map<String, Object> unknown;

   public Session(
      @NotNull Session.State var1,
      @NotNull Date var2,
      @Nullable Date var3,
      int var4,
      @Nullable String var5,
      @Nullable UUID var6,
      @Nullable Boolean var7,
      @Nullable Long var8,
      @Nullable Double var9,
      @Nullable String var10,
      @Nullable String var11,
      @Nullable String var12,
      @NotNull String var13,
      @Nullable String var14
   ) {
      this.status = var1;
      this.started = var2;
      this.timestamp = var3;
      this.errorCount = new AtomicInteger(var4);
      this.distinctId = var5;
      this.sessionId = var6;
      this.init = var7;
      this.sequence = var8;
      this.duration = var9;
      this.ipAddress = var10;
      this.userAgent = var11;
      this.environment = var12;
      this.release = var13;
      this.abnormalMechanism = var14;
   }

   public Session(@Nullable String var1, @Nullable User var2, @Nullable String var3, @NotNull String var4) {
      this(
         Session.State.Ok,
         DateUtils.getCurrentDateTime(),
         DateUtils.getCurrentDateTime(),
         0,
         var1,
         UUID.randomUUID(),
         true,
         null,
         null,
         var2 != null ? var2.getIpAddress() : null,
         null,
         var3,
         var4,
         null
      );
   }

   public boolean isTerminated() {
      return this.status != Session.State.Ok;
   }

   @Nullable
   public Date getStarted() {
      return this.started == null ? null : (Date)this.started.clone();
   }

   @Nullable
   public String getDistinctId() {
      return this.distinctId;
   }

   @Nullable
   public UUID getSessionId() {
      return this.sessionId;
   }

   @Nullable
   public String getIpAddress() {
      return this.ipAddress;
   }

   @Nullable
   public String getUserAgent() {
      return this.userAgent;
   }

   @Nullable
   public String getEnvironment() {
      return this.environment;
   }

   @NotNull
   public String getRelease() {
      return this.release;
   }

   @Nullable
   public Boolean getInit() {
      return this.init;
   }

   @ApiStatus.Internal
   public void setInitAsTrue() {
      this.init = true;
   }

   public int errorCount() {
      return this.errorCount.get();
   }

   @NotNull
   public Session.State getStatus() {
      return this.status;
   }

   @Nullable
   public Long getSequence() {
      return this.sequence;
   }

   @Nullable
   public Double getDuration() {
      return this.duration;
   }

   @Nullable
   public String getAbnormalMechanism() {
      return this.abnormalMechanism;
   }

   @Nullable
   public Date getTimestamp() {
      Date var1 = this.timestamp;
      return var1 != null ? (Date)var1.clone() : null;
   }

   public void end() {
      this.end(DateUtils.getCurrentDateTime());
   }

   public void end(@Nullable Date var1) {
      synchronized (this.sessionLock) {
         this.init = null;
         if (this.status == Session.State.Ok) {
            this.status = Session.State.Exited;
         }

         if (var1 != null) {
            this.timestamp = var1;
         } else {
            this.timestamp = DateUtils.getCurrentDateTime();
         }

         if (this.timestamp != null) {
            this.duration = this.calculateDurationTime(this.timestamp);
            this.sequence = this.getSequenceTimestamp(this.timestamp);
         }
      }
   }

   private double calculateDurationTime(@NotNull Date var1) {
      long var2 = Math.abs(var1.getTime() - this.started.getTime());
      return var2 / 1000.0;
   }

   public boolean update(@Nullable Session.State var1, @Nullable String var2, boolean var3) {
      return this.update(var1, var2, var3, null);
   }

   public boolean update(@Nullable Session.State var1, @Nullable String var2, boolean var3, @Nullable String var4) {
      synchronized (this.sessionLock) {
         boolean var6 = false;
         if (var1 != null) {
            this.status = var1;
            var6 = true;
         }

         if (var2 != null) {
            this.userAgent = var2;
            var6 = true;
         }

         if (var3) {
            this.errorCount.addAndGet(1);
            var6 = true;
         }

         if (var4 != null) {
            this.abnormalMechanism = var4;
            var6 = true;
         }

         if (var6) {
            this.init = null;
            this.timestamp = DateUtils.getCurrentDateTime();
            if (this.timestamp != null) {
               this.sequence = this.getSequenceTimestamp(this.timestamp);
            }
         }

         return var6;
      }
   }

   private long getSequenceTimestamp(@NotNull Date var1) {
      long var2 = var1.getTime();
      if (var2 < 0L) {
         var2 = Math.abs(var2);
      }

      return var2;
   }

   @NotNull
   public Session clone() {
      return new Session(
         this.status,
         this.started,
         this.timestamp,
         this.errorCount.get(),
         this.distinctId,
         this.sessionId,
         this.init,
         this.sequence,
         this.duration,
         this.ipAddress,
         this.userAgent,
         this.environment,
         this.release,
         this.abnormalMechanism
      );
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      if (this.sessionId != null) {
         var1.name("sid").value(this.sessionId.toString());
      }

      if (this.distinctId != null) {
         var1.name("did").value(this.distinctId);
      }

      if (this.init != null) {
         var1.name("init").value(this.init);
      }

      var1.name("started").value(var2, this.started);
      var1.name("status").value(var2, this.status.name().toLowerCase(Locale.ROOT));
      if (this.sequence != null) {
         var1.name("seq").value(this.sequence);
      }

      var1.name("errors").value(this.errorCount.intValue());
      if (this.duration != null) {
         var1.name("duration").value(this.duration);
      }

      if (this.timestamp != null) {
         var1.name("timestamp").value(var2, this.timestamp);
      }

      if (this.abnormalMechanism != null) {
         var1.name("abnormal_mechanism").value(var2, this.abnormalMechanism);
      }

      var1.name("attrs");
      var1.beginObject();
      var1.name("release").value(var2, this.release);
      if (this.environment != null) {
         var1.name("environment").value(var2, this.environment);
      }

      if (this.ipAddress != null) {
         var1.name("ip_address").value(var2, this.ipAddress);
      }

      if (this.userAgent != null) {
         var1.name("user_agent").value(var2, this.userAgent);
      }

      var1.endObject();
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

   public static final class Deserializer implements JsonDeserializer<Session> {
      @NotNull
      public Session deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         Date var3 = null;
         Date var4 = null;
         Integer var5 = null;
         String var6 = null;
         UUID var7 = null;
         Boolean var8 = null;
         Session.State var9 = null;
         Long var10 = null;
         Double var11 = null;
         String var12 = null;
         String var13 = null;
         String var14 = null;
         String var15 = null;
         String var16 = null;
         ConcurrentHashMap var17 = null;

         while (var1.peek() == JsonToken.NAME) {
            String var18 = var1.nextName();
            switch (var18) {
               case "sid":
                  String var21 = null;

                  try {
                     var21 = var1.nextStringOrNull();
                     var7 = UUID.fromString(var21);
                  } catch (IllegalArgumentException var26) {
                     var2.log(SentryLevel.ERROR, "%s sid is not valid.", var21);
                  }
                  break;
               case "did":
                  var6 = var1.nextStringOrNull();
                  break;
               case "init":
                  var8 = var1.nextBooleanOrNull();
                  break;
               case "started":
                  var3 = var1.nextDateOrNull(var2);
                  break;
               case "status":
                  String var22 = StringUtils.capitalize(var1.nextStringOrNull());
                  if (var22 != null) {
                     var9 = Session.State.valueOf(var22);
                  }
                  break;
               case "seq":
                  var10 = var1.nextLongOrNull();
                  break;
               case "errors":
                  var5 = var1.nextIntegerOrNull();
                  break;
               case "duration":
                  var11 = var1.nextDoubleOrNull();
                  break;
               case "timestamp":
                  var4 = var1.nextDateOrNull(var2);
                  break;
               case "abnormal_mechanism":
                  var16 = var1.nextStringOrNull();
                  break;
               case "attrs":
                  var1.beginObject();

                  while (var1.peek() == JsonToken.NAME) {
                     String var23 = var1.nextName();
                     switch (var23) {
                        case "release":
                           var15 = var1.nextStringOrNull();
                           break;
                        case "environment":
                           var14 = var1.nextStringOrNull();
                           break;
                        case "ip_address":
                           var12 = var1.nextStringOrNull();
                           break;
                        case "user_agent":
                           var13 = var1.nextStringOrNull();
                           break;
                        default:
                           var1.skipValue();
                     }
                  }

                  var1.endObject();
                  break;
               default:
                  if (var17 == null) {
                     var17 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var17, var18);
            }
         }

         if (var9 == null) {
            throw this.missingRequiredFieldException("status", var2);
         }

         if (var3 == null) {
            throw this.missingRequiredFieldException("started", var2);
         }

         if (var5 == null) {
            throw this.missingRequiredFieldException("errors", var2);
         }

         if (var15 == null) {
            throw this.missingRequiredFieldException("release", var2);
         }

         Session var27 = new Session(var9, var3, var4, var5, var6, var7, var8, var10, var11, var12, var13, var14, var15, var16);
         var27.setUnknown(var17);
         var1.endObject();
         return var27;
      }

      private Exception missingRequiredFieldException(String var1, ILogger var2) {
         String var3 = "Missing required field \"" + var1 + "\"";
         IllegalStateException var4 = new IllegalStateException(var3);
         var2.log(SentryLevel.ERROR, var3, var4);
         return var4;
      }
   }

   public static final class JsonKeys {
      public static final String SID = "sid";
      public static final String DID = "did";
      public static final String INIT = "init";
      public static final String STARTED = "started";
      public static final String STATUS = "status";
      public static final String SEQ = "seq";
      public static final String ERRORS = "errors";
      public static final String DURATION = "duration";
      public static final String TIMESTAMP = "timestamp";
      public static final String ATTRS = "attrs";
      public static final String RELEASE = "release";
      public static final String ENVIRONMENT = "environment";
      public static final String IP_ADDRESS = "ip_address";
      public static final String USER_AGENT = "user_agent";
      public static final String ABNORMAL_MECHANISM = "abnormal_mechanism";
   }

   public enum State {
      Ok,
      Exited,
      Crashed,
      Abnormal;
   }
}
