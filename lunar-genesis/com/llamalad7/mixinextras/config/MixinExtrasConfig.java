package com.llamalad7.mixinextras.config;

import com.llamalad7.mixinextras.lib.gson.annotations.SerializedName;
import com.llamalad7.mixinextras.lib.semver.Version;
import com.llamalad7.mixinextras.service.MixinExtrasVersion;

public class MixinExtrasConfig {
   @SerializedName("minVersion")
   private final String minVersionString;
   private final transient String configName;
   public final transient MixinExtrasConfig parent;
   public final transient MixinExtrasVersion minVersion;

   public MixinExtrasConfig(String var1, MixinExtrasConfig var2, String var3) {
      this.configName = var1;
      this.parent = var2;
      this.minVersionString = var3;
      this.minVersion = var3 != null ? this.determineMinVersion() : (var2 != null ? var2.minVersion : null);
   }

   private MixinExtrasVersion determineMinVersion() {
      if (this.minVersionString == null) {
         return null;
      }

      Version var1 = Version.tryParse(this.minVersionString)
         .orElseThrow(() -> new IllegalArgumentException(String.format("'%s' is not valid SemVer!", this.minVersionString)));
      MixinExtrasVersion[] var2 = MixinExtrasVersion.values();
      if (var1.isHigherThan(MixinExtrasVersion.LATEST.getSemver())) {
         throw new IllegalArgumentException(
            String.format("Mixin Config %s requires MixinExtras >=%s but %s is present!", this.configName, var1, MixinExtrasVersion.LATEST)
         );
      }

      MixinExtrasVersion var3 = var2[0];

      for (MixinExtrasVersion var7 : var2) {
         if (var7.getSemver().isHigherThan(var1)) {
            break;
         }

         var3 = var7;
      }

      return var3;
   }
}
