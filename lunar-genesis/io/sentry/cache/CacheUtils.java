package io.sentry.cache;

import io.sentry.JsonDeserializer;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class CacheUtils {
   private static final Charset UTF_8 = Charset.forName("UTF-8");

   static <T> void store(@NotNull SentryOptions var0, @NotNull T var1, @NotNull String var2, @NotNull String var3) {
      File var4 = ensureCacheDir(var0, var2);
      if (var4 == null) {
         var0.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache");
      } else {
         File var5 = new File(var4, var3);
         if (var5.exists()) {
            var0.getLogger().log(SentryLevel.DEBUG, "Overwriting %s in scope cache", var3);
            if (!var5.delete()) {
               var0.getLogger().log(SentryLevel.ERROR, "Failed to delete: %s", var5.getAbsolutePath());
            }
         }

         try {
            FileOutputStream var6 = new FileOutputStream(var5);

            try {
               BufferedWriter var7 = new BufferedWriter(new OutputStreamWriter(var6, UTF_8));

               try {
                  var0.getSerializer().serialize(var1, var7);
               } catch (Throwable var12) {
                  try {
                     var7.close();
                  } catch (Throwable var11) {
                     var12.addSuppressed(var11);
                  }

                  throw var12;
               }

               var7.close();
            } catch (Throwable var13) {
               try {
                  var6.close();
               } catch (Throwable var10) {
                  var13.addSuppressed(var10);
               }

               throw var13;
            }

            var6.close();
         } catch (Throwable var14) {
            var0.getLogger().log(SentryLevel.ERROR, var14, "Error persisting entity: %s", var3);
         }
      }
   }

   static void delete(@NotNull SentryOptions var0, @NotNull String var1, @NotNull String var2) {
      File var3 = ensureCacheDir(var0, var1);
      if (var3 == null) {
         var0.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot delete from scope cache");
      } else {
         File var4 = new File(var3, var2);
         if (var4.exists()) {
            var0.getLogger().log(SentryLevel.DEBUG, "Deleting %s from scope cache", var2);
            if (!var4.delete()) {
               var0.getLogger().log(SentryLevel.ERROR, "Failed to delete: %s", var4.getAbsolutePath());
            }
         }
      }
   }

   @Nullable
   static <T, R> T read(@NotNull SentryOptions var0, @NotNull String var1, @NotNull String var2, @NotNull Class<T> var3, @Nullable JsonDeserializer<R> var4) {
      File var5 = ensureCacheDir(var0, var1);
      if (var5 == null) {
         var0.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot read from scope cache");
         return null;
      }

      File var6 = new File(var5, var2);
      if (var6.exists()) {
         try {
            BufferedReader var7 = new BufferedReader(new InputStreamReader(new FileInputStream(var6), UTF_8));

            Object var13;
            label41: {
               try {
                  if (var4 == null) {
                     var13 = var0.getSerializer().deserialize(var7, var3);
                     break label41;
                  }

                  var13 = var0.getSerializer().deserializeCollection(var7, var3, var4);
               } catch (Throwable var11) {
                  try {
                     var7.close();
                  } catch (Throwable var10) {
                     var11.addSuppressed(var10);
                  }

                  throw var11;
               }

               var7.close();
               return (T)var13;
            }

            var7.close();
            return (T)var13;
         } catch (Throwable var12) {
            var0.getLogger().log(SentryLevel.ERROR, var12, "Error reading entity from scope cache: %s", var2);
         }
      } else {
         var0.getLogger().log(SentryLevel.DEBUG, "No entry stored for %s", var2);
      }

      return null;
   }

   @Nullable
   private static File ensureCacheDir(@NotNull SentryOptions var0, @NotNull String var1) {
      String var2 = var0.getCacheDirPath();
      if (var2 == null) {
         return null;
      }

      File var3 = new File(var2, var1);
      var3.mkdirs();
      return var3;
   }
}
