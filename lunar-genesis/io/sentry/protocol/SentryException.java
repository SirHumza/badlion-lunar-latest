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

public final class SentryException implements JsonSerializable, JsonUnknown {
   @Nullable
   private String type;
   @Nullable
   private String value;
   @Nullable
   private String module;
   @Nullable
   private Long threadId;
   @Nullable
   private SentryStackTrace stacktrace;
   @Nullable
   private Mechanism mechanism;
   @Nullable
   private Map<String, Object> unknown;

   @Nullable
   public String getType() {
      return this.type;
   }

   public void setType(@Nullable String var1) {
      this.type = var1;
   }

   @Nullable
   public String getValue() {
      return this.value;
   }

   public void setValue(@Nullable String var1) {
      this.value = var1;
   }

   @Nullable
   public String getModule() {
      return this.module;
   }

   public void setModule(@Nullable String var1) {
      this.module = var1;
   }

   @Nullable
   public Long getThreadId() {
      return this.threadId;
   }

   public void setThreadId(@Nullable Long var1) {
      this.threadId = var1;
   }

   @Nullable
   public SentryStackTrace getStacktrace() {
      return this.stacktrace;
   }

   public void setStacktrace(@Nullable SentryStackTrace var1) {
      this.stacktrace = var1;
   }

   @Nullable
   public Mechanism getMechanism() {
      return this.mechanism;
   }

   public void setMechanism(@Nullable Mechanism var1) {
      this.mechanism = var1;
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
      if (this.type != null) {
         var1.name("type").value(this.type);
      }

      if (this.value != null) {
         var1.name("value").value(this.value);
      }

      if (this.module != null) {
         var1.name("module").value(this.module);
      }

      if (this.threadId != null) {
         var1.name("thread_id").value(this.threadId);
      }

      if (this.stacktrace != null) {
         var1.name("stacktrace").value(var2, this.stacktrace);
      }

      if (this.mechanism != null) {
         var1.name("mechanism").value(var2, this.mechanism);
      }

      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<SentryException> {
      @NotNull
      public SentryException deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         SentryException var3 = new SentryException();
         HashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "type":
                  var3.type = var1.nextStringOrNull();
                  break;
               case "value":
                  var3.value = var1.nextStringOrNull();
                  break;
               case "module":
                  var3.module = var1.nextStringOrNull();
                  break;
               case "thread_id":
                  var3.threadId = var1.nextLongOrNull();
                  break;
               case "stacktrace":
                  var3.stacktrace = var1.nextOrNull(var2, new SentryStackTrace.Deserializer());
                  break;
               case "mechanism":
                  var3.mechanism = var1.nextOrNull(var2, new Mechanism.Deserializer());
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
      public static final String TYPE = "type";
      public static final String VALUE = "value";
      public static final String MODULE = "module";
      public static final String THREAD_ID = "thread_id";
      public static final String STACKTRACE = "stacktrace";
      public static final String MECHANISM = "mechanism";
   }
}
