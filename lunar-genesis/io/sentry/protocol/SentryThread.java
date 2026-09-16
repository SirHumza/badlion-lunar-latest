package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLockReason;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryThread implements JsonSerializable, JsonUnknown {
   @Nullable
   private Long id;
   @Nullable
   private Integer priority;
   @Nullable
   private String name;
   @Nullable
   private String state;
   @Nullable
   private Boolean crashed;
   @Nullable
   private Boolean current;
   @Nullable
   private Boolean daemon;
   @Nullable
   private Boolean main;
   @Nullable
   private SentryStackTrace stacktrace;
   @Nullable
   private Map<String, SentryLockReason> heldLocks;
   @Nullable
   private Map<String, Object> unknown;

   @Nullable
   public Long getId() {
      return this.id;
   }

   public void setId(@Nullable Long var1) {
      this.id = var1;
   }

   @Nullable
   public String getName() {
      return this.name;
   }

   public void setName(@Nullable String var1) {
      this.name = var1;
   }

   @Nullable
   public Boolean isCrashed() {
      return this.crashed;
   }

   public void setCrashed(@Nullable Boolean var1) {
      this.crashed = var1;
   }

   @Nullable
   public Boolean isCurrent() {
      return this.current;
   }

   public void setCurrent(@Nullable Boolean var1) {
      this.current = var1;
   }

   @Nullable
   public SentryStackTrace getStacktrace() {
      return this.stacktrace;
   }

   public void setStacktrace(@Nullable SentryStackTrace var1) {
      this.stacktrace = var1;
   }

   @Nullable
   public Integer getPriority() {
      return this.priority;
   }

   public void setPriority(@Nullable Integer var1) {
      this.priority = var1;
   }

   @Nullable
   public Boolean isDaemon() {
      return this.daemon;
   }

   public void setDaemon(@Nullable Boolean var1) {
      this.daemon = var1;
   }

   @Nullable
   public Boolean isMain() {
      return this.main;
   }

   public void setMain(@Nullable Boolean var1) {
      this.main = var1;
   }

   @Nullable
   public String getState() {
      return this.state;
   }

   public void setState(@Nullable String var1) {
      this.state = var1;
   }

   @Nullable
   public Map<String, SentryLockReason> getHeldLocks() {
      return this.heldLocks;
   }

   public void setHeldLocks(@Nullable Map<String, SentryLockReason> var1) {
      this.heldLocks = var1;
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
      if (this.id != null) {
         var1.name("id").value(this.id);
      }

      if (this.priority != null) {
         var1.name("priority").value(this.priority);
      }

      if (this.name != null) {
         var1.name("name").value(this.name);
      }

      if (this.state != null) {
         var1.name("state").value(this.state);
      }

      if (this.crashed != null) {
         var1.name("crashed").value(this.crashed);
      }

      if (this.current != null) {
         var1.name("current").value(this.current);
      }

      if (this.daemon != null) {
         var1.name("daemon").value(this.daemon);
      }

      if (this.main != null) {
         var1.name("main").value(this.main);
      }

      if (this.stacktrace != null) {
         var1.name("stacktrace").value(var2, this.stacktrace);
      }

      if (this.heldLocks != null) {
         var1.name("held_locks").value(var2, this.heldLocks);
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

   public static final class Deserializer implements JsonDeserializer<SentryThread> {
      @NotNull
      public SentryThread deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         SentryThread var3 = new SentryThread();
         ConcurrentHashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "id":
                  var3.id = var1.nextLongOrNull();
                  break;
               case "priority":
                  var3.priority = var1.nextIntegerOrNull();
                  break;
               case "name":
                  var3.name = var1.nextStringOrNull();
                  break;
               case "state":
                  var3.state = var1.nextStringOrNull();
                  break;
               case "crashed":
                  var3.crashed = var1.nextBooleanOrNull();
                  break;
               case "current":
                  var3.current = var1.nextBooleanOrNull();
                  break;
               case "daemon":
                  var3.daemon = var1.nextBooleanOrNull();
                  break;
               case "main":
                  var3.main = var1.nextBooleanOrNull();
                  break;
               case "stacktrace":
                  var3.stacktrace = var1.nextOrNull(var2, new SentryStackTrace.Deserializer());
                  break;
               case "held_locks":
                  Map var8 = var1.nextMapOrNull(var2, new SentryLockReason.Deserializer());
                  if (var8 != null) {
                     var3.heldLocks = new HashMap<>(var8);
                  }
                  break;
               default:
                  if (var4 == null) {
                     var4 = new ConcurrentHashMap();
                  }

                  var1.nextUnknown(var2, var4, var5);
            }
         }

         var3.setUnknown(var4);
         var1.endObject();
         return var3;
      }
   }

   public static final class JsonKeys {
      public static final String ID = "id";
      public static final String PRIORITY = "priority";
      public static final String NAME = "name";
      public static final String STATE = "state";
      public static final String CRASHED = "crashed";
      public static final String CURRENT = "current";
      public static final String DAEMON = "daemon";
      public static final String MAIN = "main";
      public static final String STACKTRACE = "stacktrace";
      public static final String HELD_LOCKS = "held_locks";
   }
}
