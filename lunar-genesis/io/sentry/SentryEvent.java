package io.sentry;

import io.sentry.protocol.Message;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryThread;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

public final class SentryEvent extends SentryBaseEvent implements JsonSerializable, JsonUnknown {
   @NotNull
   private Date timestamp;
   @Nullable
   private Message message;
   @Nullable
   private String logger;
   @Nullable
   private SentryValues<SentryThread> threads;
   @Nullable
   private SentryValues<SentryException> exception;
   @Nullable
   private SentryLevel level;
   @Nullable
   private String transaction;
   @Nullable
   private List<String> fingerprint;
   @Nullable
   private Map<String, Object> unknown;
   @Nullable
   private Map<String, String> modules;

   SentryEvent(@NotNull SentryId var1, @NotNull Date var2) {
      super(var1);
      this.timestamp = var2;
   }

   public SentryEvent(@Nullable Throwable var1) {
      this();
      this.throwable = var1;
   }

   public SentryEvent() {
      this(new SentryId(), DateUtils.getCurrentDateTime());
   }

   @TestOnly
   public SentryEvent(@NotNull Date var1) {
      this(new SentryId(), var1);
   }

   public Date getTimestamp() {
      return (Date)this.timestamp.clone();
   }

   public void setTimestamp(@NotNull Date var1) {
      this.timestamp = var1;
   }

   @Nullable
   public Message getMessage() {
      return this.message;
   }

   public void setMessage(@Nullable Message var1) {
      this.message = var1;
   }

   @Nullable
   public String getLogger() {
      return this.logger;
   }

   public void setLogger(@Nullable String var1) {
      this.logger = var1;
   }

   @Nullable
   public List<SentryThread> getThreads() {
      return this.threads != null ? this.threads.getValues() : null;
   }

   public void setThreads(@Nullable List<SentryThread> var1) {
      this.threads = new SentryValues<>(var1);
   }

   @Nullable
   public List<SentryException> getExceptions() {
      return this.exception == null ? null : this.exception.getValues();
   }

   public void setExceptions(@Nullable List<SentryException> var1) {
      this.exception = new SentryValues<>(var1);
   }

   @Nullable
   public SentryLevel getLevel() {
      return this.level;
   }

   public void setLevel(@Nullable SentryLevel var1) {
      this.level = var1;
   }

   @Nullable
   public String getTransaction() {
      return this.transaction;
   }

   public void setTransaction(@Nullable String var1) {
      this.transaction = var1;
   }

   @Nullable
   public List<String> getFingerprints() {
      return this.fingerprint;
   }

   public void setFingerprints(@Nullable List<String> var1) {
      this.fingerprint = var1 != null ? new ArrayList<>(var1) : null;
   }

   @Nullable
   Map<String, String> getModules() {
      return this.modules;
   }

   public void setModules(@Nullable Map<String, String> var1) {
      this.modules = CollectionUtils.newHashMap(var1);
   }

   public void setModule(@NotNull String var1, @NotNull String var2) {
      if (this.modules == null) {
         this.modules = new HashMap<>();
      }

      this.modules.put(var1, var2);
   }

   public void removeModule(@NotNull String var1) {
      if (this.modules != null) {
         this.modules.remove(var1);
      }
   }

   @Nullable
   public String getModule(@NotNull String var1) {
      return this.modules != null ? this.modules.get(var1) : null;
   }

   public boolean isCrashed() {
      return this.getUnhandledException() != null;
   }

   @Nullable
   public SentryException getUnhandledException() {
      if (this.exception != null) {
         for (SentryException var2 : this.exception.getValues()) {
            if (var2.getMechanism() != null && var2.getMechanism().isHandled() != null && !var2.getMechanism().isHandled()) {
               return var2;
            }
         }
      }

      return null;
   }

   public boolean isErrored() {
      return this.exception != null && !this.exception.getValues().isEmpty();
   }

   @Override
   public void serialize(@NotNull ObjectWriter var1, @NotNull ILogger var2) {
      var1.beginObject();
      var1.name("timestamp").value(var2, this.timestamp);
      if (this.message != null) {
         var1.name("message").value(var2, this.message);
      }

      if (this.logger != null) {
         var1.name("logger").value(this.logger);
      }

      if (this.threads != null && !this.threads.getValues().isEmpty()) {
         var1.name("threads");
         var1.beginObject();
         var1.name("values").value(var2, this.threads.getValues());
         var1.endObject();
      }

      if (this.exception != null && !this.exception.getValues().isEmpty()) {
         var1.name("exception");
         var1.beginObject();
         var1.name("values").value(var2, this.exception.getValues());
         var1.endObject();
      }

      if (this.level != null) {
         var1.name("level").value(var2, this.level);
      }

      if (this.transaction != null) {
         var1.name("transaction").value(this.transaction);
      }

      if (this.fingerprint != null) {
         var1.name("fingerprint").value(var2, this.fingerprint);
      }

      if (this.modules != null) {
         var1.name("modules").value(var2, this.modules);
      }

      new SentryBaseEvent.Serializer().serialize(this, var1, var2);
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

   public static final class Deserializer implements JsonDeserializer<SentryEvent> {
      @NotNull
      public SentryEvent deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         var1.beginObject();
         SentryEvent var3 = new SentryEvent();
         ConcurrentHashMap var4 = null;
         SentryBaseEvent.Deserializer var5 = new SentryBaseEvent.Deserializer();

         while (var1.peek() == JsonToken.NAME) {
            String var6 = var1.nextName();
            switch (var6) {
               case "timestamp":
                  Date var9 = var1.nextDateOrNull(var2);
                  if (var9 != null) {
                     var3.timestamp = var9;
                  }
                  break;
               case "message":
                  var3.message = var1.nextOrNull(var2, new Message.Deserializer());
                  break;
               case "logger":
                  var3.logger = var1.nextStringOrNull();
                  break;
               case "threads":
                  var1.beginObject();
                  var1.nextName();
                  var3.threads = new SentryValues<>(var1.nextListOrNull(var2, new SentryThread.Deserializer()));
                  var1.endObject();
                  break;
               case "exception":
                  var1.beginObject();
                  var1.nextName();
                  var3.exception = new SentryValues<>(var1.nextListOrNull(var2, new SentryException.Deserializer()));
                  var1.endObject();
                  break;
               case "level":
                  var3.level = var1.nextOrNull(var2, new SentryLevel.Deserializer());
                  break;
               case "transaction":
                  var3.transaction = var1.nextStringOrNull();
                  break;
               case "fingerprint":
                  List var10 = (List)var1.nextObjectOrNull();
                  if (var10 != null) {
                     var3.fingerprint = var10;
                  }
                  break;
               case "modules":
                  Map var11 = (Map)var1.nextObjectOrNull();
                  var3.modules = CollectionUtils.newConcurrentHashMap(var11);
                  break;
               default:
                  if (!var5.deserializeValue(var3, var6, var1, var2)) {
                     if (var4 == null) {
                        var4 = new ConcurrentHashMap();
                     }

                     var1.nextUnknown(var2, var4, var6);
                  }
            }
         }

         var3.setUnknown(var4);
         var1.endObject();
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String TIMESTAMP = "timestamp";
      public static final String MESSAGE = "message";
      public static final String LOGGER = "logger";
      public static final String THREADS = "threads";
      public static final String EXCEPTION = "exception";
      public static final String LEVEL = "level";
      public static final String TRANSACTION = "transaction";
      public static final String FINGERPRINT = "fingerprint";
      public static final String MODULES = "modules";
   }
}
