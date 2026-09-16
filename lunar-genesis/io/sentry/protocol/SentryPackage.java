package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryPackage implements JsonSerializable, JsonUnknown {
   @NotNull
   private String name;
   @NotNull
   private String version;
   @Nullable
   private Map<String, Object> unknown;

   public SentryPackage(@NotNull String var1, @NotNull String var2) {
      this.name = Objects.requireNonNull(var1, "name is required.");
      this.version = Objects.requireNonNull(var2, "version is required.");
   }

   @NotNull
   public String getName() {
      return this.name;
   }

   public void setName(@NotNull String var1) {
      this.name = Objects.requireNonNull(var1, "name is required.");
   }

   @NotNull
   public String getVersion() {
      return this.version;
   }

   public void setVersion(@NotNull String var1) {
      this.version = Objects.requireNonNull(var1, "version is required.");
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         SentryPackage var2 = (SentryPackage)var1;
         return java.util.Objects.equals(this.name, var2.name) && java.util.Objects.equals(this.version, var2.version);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return java.util.Objects.hash(this.name, this.version);
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
      var1.name("name").value(this.name);
      var1.name("version").value(this.version);
      if (this.unknown != null) {
         for (String var4 : this.unknown.keySet()) {
            Object var5 = this.unknown.get(var4);
            var1.name(var4).value(var2, var5);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<SentryPackage> {
      @NotNull
      public SentryPackage deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         String var3 = null;
         String var4 = null;
         HashMap var5 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var6 = var1.nextName();
            switch (var6) {
               case "name":
                  var3 = var1.nextString();
                  break;
               case "version":
                  var4 = var1.nextString();
                  break;
               default:
                  if (var5 == null) {
                     var5 = new HashMap();
                  }

                  var1.nextUnknown(var2, var5, var6);
            }
         }

         var1.endObject();
         if (var3 == null) {
            String var11 = "Missing required field \"name\"";
            IllegalStateException var13 = new IllegalStateException(var11);
            var2.log(SentryLevel.ERROR, var11, var13);
            throw var13;
         } else if (var4 == null) {
            String var10 = "Missing required field \"version\"";
            IllegalStateException var12 = new IllegalStateException(var10);
            var2.log(SentryLevel.ERROR, var10, var12);
            throw var12;
         } else {
            SentryPackage var9 = new SentryPackage(var3, var4);
            var9.setUnknown(var5);
            return var9;
         }
      }
   }

   public static final class JsonKeys {
      public static final String NAME = "name";
      public static final String VERSION = "version";
   }
}
