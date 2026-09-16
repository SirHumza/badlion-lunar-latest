package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SdkVersion implements JsonSerializable, JsonUnknown {
   @NotNull
   private String name;
   @NotNull
   private String version;
   @Nullable
   private Set<SentryPackage> deserializedPackages;
   @Nullable
   private Set<String> deserializedIntegrations;
   @Nullable
   private Map<String, Object> unknown;

   public SdkVersion(@NotNull String var1, @NotNull String var2) {
      this.name = Objects.requireNonNull(var1, "name is required.");
      this.version = Objects.requireNonNull(var2, "version is required.");
   }

   @NotNull
   public String getVersion() {
      return this.version;
   }

   public void setVersion(@NotNull String var1) {
      this.version = Objects.requireNonNull(var1, "version is required.");
   }

   @NotNull
   public String getName() {
      return this.name;
   }

   public void setName(@NotNull String var1) {
      this.name = Objects.requireNonNull(var1, "name is required.");
   }

   public void addPackage(@NotNull String var1, @NotNull String var2) {
      SentryIntegrationPackageStorage.getInstance().addPackage(var1, var2);
   }

   public void addIntegration(@NotNull String var1) {
      SentryIntegrationPackageStorage.getInstance().addIntegration(var1);
   }

   @Deprecated
   @Nullable
   public List<SentryPackage> getPackages() {
      Set var1 = this.deserializedPackages != null ? this.deserializedPackages : SentryIntegrationPackageStorage.getInstance().getPackages();
      return new CopyOnWriteArrayList<>(var1);
   }

   @NotNull
   public Set<SentryPackage> getPackageSet() {
      return this.deserializedPackages != null ? this.deserializedPackages : SentryIntegrationPackageStorage.getInstance().getPackages();
   }

   @Deprecated
   @Nullable
   public List<String> getIntegrations() {
      Set var1 = this.deserializedIntegrations != null ? this.deserializedIntegrations : SentryIntegrationPackageStorage.getInstance().getIntegrations();
      return new CopyOnWriteArrayList<>(var1);
   }

   @NotNull
   public Set<String> getIntegrationSet() {
      return this.deserializedIntegrations != null ? this.deserializedIntegrations : SentryIntegrationPackageStorage.getInstance().getIntegrations();
   }

   @NotNull
   public static SdkVersion updateSdkVersion(@Nullable SdkVersion var0, @NotNull String var1, @NotNull String var2) {
      Objects.requireNonNull(var1, "name is required.");
      Objects.requireNonNull(var2, "version is required.");
      if (var0 == null) {
         var0 = new SdkVersion(var1, var2);
      } else {
         var0.setName(var1);
         var0.setVersion(var2);
      }

      return var0;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         SdkVersion var2 = (SdkVersion)var1;
         return this.name.equals(var2.name) && this.version.equals(var2.version);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name, this.version);
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
      Set var3 = this.getPackageSet();
      Set var4 = this.getIntegrationSet();
      if (!var3.isEmpty()) {
         var1.name("packages").value(var2, var3);
      }

      if (!var4.isEmpty()) {
         var1.name("integrations").value(var2, var4);
      }

      if (this.unknown != null) {
         for (String var6 : this.unknown.keySet()) {
            Object var7 = this.unknown.get(var6);
            var1.name(var6).value(var2, var7);
         }
      }

      var1.endObject();
   }

   public static final class Deserializer implements JsonDeserializer<SdkVersion> {
      @NotNull
      public SdkVersion deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2) {
         String var3 = null;
         String var4 = null;
         ArrayList var5 = new ArrayList();
         ArrayList var6 = new ArrayList();
         HashMap var7 = null;
         var1.beginObject();

         while (var1.peek() == JsonToken.NAME) {
            String var8 = var1.nextName();
            switch (var8) {
               case "name":
                  var3 = var1.nextString();
                  break;
               case "version":
                  var4 = var1.nextString();
                  break;
               case "packages":
                  List var11 = var1.nextListOrNull(var2, new SentryPackage.Deserializer());
                  if (var11 != null) {
                     var5.addAll(var11);
                  }
                  break;
               case "integrations":
                  List var12 = (List)var1.nextObjectOrNull();
                  if (var12 != null) {
                     var6.addAll(var12);
                  }
                  break;
               default:
                  if (var7 == null) {
                     var7 = new HashMap();
                  }

                  var1.nextUnknown(var2, var7, var8);
            }
         }

         var1.endObject();
         if (var3 == null) {
            String var15 = "Missing required field \"name\"";
            IllegalStateException var17 = new IllegalStateException(var15);
            var2.log(SentryLevel.ERROR, var15, var17);
            throw var17;
         } else if (var4 == null) {
            String var14 = "Missing required field \"version\"";
            IllegalStateException var16 = new IllegalStateException(var14);
            var2.log(SentryLevel.ERROR, var14, var16);
            throw var16;
         } else {
            SdkVersion var13 = new SdkVersion(var3, var4);
            var13.deserializedPackages = new CopyOnWriteArraySet<>(var5);
            var13.deserializedIntegrations = new CopyOnWriteArraySet<>(var6);
            var13.setUnknown(var7);
            return var13;
         }
      }
   }

   public static final class JsonKeys {
      public static final String NAME = "name";
      public static final String VERSION = "version";
      public static final String PACKAGES = "packages";
      public static final String INTEGRATIONS = "integrations";
   }
}
