package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class FilesystemPropertiesLoader implements PropertiesLoader {
   @NotNull
   private final String filePath;
   @NotNull
   private final ILogger logger;

   public FilesystemPropertiesLoader(@NotNull String var1, @NotNull ILogger var2) {
      this.filePath = var1;
      this.logger = var2;
   }

   @Nullable
   @Override
   public Properties load() {
      try {
         File var1 = new File(this.filePath);
         if (var1.isFile() && var1.canRead()) {
            BufferedInputStream var2 = new BufferedInputStream(new FileInputStream(var1));

            Properties var4;
            try {
               Properties var3 = new Properties();
               var3.load(var2);
               var4 = var3;
            } catch (Throwable var6) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }

               throw var6;
            }

            var2.close();
            return var4;
         } else {
            return null;
         }
      } catch (IOException var7) {
         this.logger.log(SentryLevel.ERROR, var7, "Failed to load Sentry configuration from file: %s", this.filePath);
         return null;
      }
   }
}
