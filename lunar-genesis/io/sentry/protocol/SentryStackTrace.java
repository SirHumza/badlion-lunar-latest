package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryStackTrace implements JsonSerializable, JsonUnknown {
   @Nullable
   private List<SentryStackFrame> frames;
   @Nullable
   private Map<String, String> registers;
   @Nullable
   private Boolean snapshot;
   @Nullable
   private Map<String, Object> unknown;

   public SentryStackTrace() {
   }

   public SentryStackTrace(@Nullable List<SentryStackFrame> var1) {
      this.frames = var1;
   }

   @Nullable
   public List<SentryStackFrame> getFrames() {
      return this.frames;
   }

   public void setFrames(@Nullable List<SentryStackFrame> var1) {
      this.frames = var1;
   }

   @Nullable
   public Map<String, String> getRegisters() {
      return this.registers;
   }

   public void setRegisters(@Nullable Map<String, String> var1) {
      this.registers = var1;
   }

   @Nullable
   public Boolean getSnapshot() {
      return this.snapshot;
   }

   public void setSnapshot(@Nullable Boolean var1) {
      this.snapshot = var1;
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
      if (this.frames != null) {
         var1.name("frames").value(var2, this.frames);
      }

      if (this.registers != null) {
         var1.name("registers").value(var2, this.registers);
      }

      if (this.snapshot != null) {
         var1.name("snapshot").value(this.snapshot);
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

   public static final class Deserializer implements JsonDeserializer<SentryStackTrace> {
      @NotNull
      public SentryStackTrace deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         SentryStackTrace var3 = new SentryStackTrace();
         ConcurrentHashMap var4 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var5 = var1.nextName();
            switch (var5) {
               case "frames":
                  var3.frames = var1.nextListOrNull(var2, new SentryStackFrame.Deserializer());
                  break;
               case "registers":
                  var3.registers = CollectionUtils.newConcurrentHashMap((Map<String, String>)var1.nextObjectOrNull());
                  break;
               case "snapshot":
                  var3.snapshot = var1.nextBooleanOrNull();
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
      public static final String FRAMES = "frames";
      public static final String REGISTERS = "registers";
      public static final String SNAPSHOT = "snapshot";
   }
}
