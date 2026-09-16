package com.llamalad7.mixinextras.utils;

import com.llamalad7.mixinextras.config.MixinExtrasConfig;
import com.llamalad7.mixinextras.lib.apache.commons.mutable.MutableObject;
import com.llamalad7.mixinextras.lib.gson.Strictness;
import com.llamalad7.mixinextras.lib.gson.stream.JsonReader;
import com.llamalad7.mixinextras.service.MixinExtrasVersion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;

public class MixinConfigUtils {
   private static final String KEY_TOP_LEVEL_MIN_VERSION = "minMixinExtrasVersion";
   private static final String KEY_SUBCONFIG = "mixinextras";
   private static final String KEY_MIN_VERSION = "minVersion";
   private static final String KEY_PARENT = "parent";
   private static final Map<String, MixinExtrasConfig> CONFIG_CACHE = new HashMap<>();

   public static void requireMinVersion(IMixinConfig var0, MixinExtrasVersion var1, String var2) {
      MixinExtrasVersion var3 = extraConfigFor(var0.getName()).minVersion;
      if (var3 == null || var3.getNumber() < var1.getNumber()) {
         throw new UnsupportedOperationException(
            String.format(
               "In order to use %s, Mixin Config '%s' needs to declare a reliance on MixinExtras >=%s! E.g. `\"%s\": {\"%s\": \"%s\"}`",
               var2,
               var0,
               var1,
               "mixinextras",
               "minVersion",
               MixinExtrasVersion.LATEST
            )
         );
      }
   }

   private static MixinExtrasConfig extraConfigFor(String var0) {
      MixinExtrasConfig var1 = CONFIG_CACHE.get(var0);
      if (var1 == null) {
         CONFIG_CACHE.put(var0, var1 = readMixinExtrasConfig(var0));
      }

      return var1;
   }

   private static MixinExtrasConfig readMixinExtrasConfig(String var0) {
      MutableObject var1 = new MutableObject();
      MutableObject var2 = new MutableObject();
      readConfig(var0, var2x -> {
         var2x.beginObject();

         while (var2x.hasNext()) {
            String var3 = var2x.nextName();
            switch (var3) {
               case "mixinextras":
                  var2x.beginObject();

                  while (var2x.hasNext()) {
                     String var7 = var2x.nextName();
                     if (var7.equals("minVersion") && var2.getValue() == null) {
                        var2.setValue(var2x.nextString());
                     } else {
                        var2x.skipValue();
                     }
                  }

                  var2x.endObject();
                  break;
               case "minMixinExtrasVersion":
                  if (var2.getValue() == null) {
                     var2.setValue(var2x.nextString());
                  } else {
                     var2x.skipValue();
                  }
                  break;
               case "parent":
                  String var6 = var2x.nextString();
                  var1.setValue(extraConfigFor(var6));
                  break;
               default:
                  var2x.skipValue();
            }
         }
      });
      return new MixinExtrasConfig(var0, (MixinExtrasConfig)var1.getValue(), (String)var2.getValue());
   }

   private static void readConfig(String var0, MixinConfigUtils.JsonProcessor var1) {
      try {
         JsonReader var2 = new JsonReader(new BufferedReader(new InputStreamReader(ResourceUtils.getResourceAsStream(var0), StandardCharsets.UTF_8)));

         try {
            var2.setStrictness(Strictness.LENIENT);
            var1.process(var2);
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
      } catch (Exception var7) {
         throw new RuntimeException("Failed to read mixin config " + var0, var7);
      }
   }

   @FunctionalInterface
   private interface JsonProcessor {
      void process(JsonReader var1);
   }
}
