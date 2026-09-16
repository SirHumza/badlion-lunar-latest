package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ClasspathPropertiesLoader implements PropertiesLoader {
   @NotNull
   private final String fileName;
   @NotNull
   private final ClassLoader classLoader;
   @NotNull
   private final ILogger logger;

   public ClasspathPropertiesLoader(@NotNull String var1, @Nullable ClassLoader var2, @NotNull ILogger var3) {
      this.fileName = var1;
      this.classLoader = ClassLoaderUtils.classLoaderOrDefault(var2);
      this.logger = var3;
   }

   public ClasspathPropertiesLoader(@NotNull ILogger var1) {
      this("sentry.properties", ClasspathPropertiesLoader.class.getClassLoader(), var1);
   }

   @Nullable
   @Override
   public Properties load() {
      try {
         InputStream var1 = this.classLoader.getResourceAsStream(this.fileName);

         Properties var4;
         label61: {
            try {
               if (var1 != null) {
                  BufferedInputStream var2 = new BufferedInputStream(var1);

                  try {
                     Properties var3 = new Properties();
                     var3.load(var2);
                     var4 = var3;
                  } catch (Throwable var7) {
                     try {
                        var2.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }

                     throw var7;
                  }

                  var2.close();
                  break label61;
               }
            } catch (Throwable var8) {
               if (var1 != null) {
                  try {
                     var1.close();
                  } catch (Throwable var5) {
                     var8.addSuppressed(var5);
                  }
               }

               throw var8;
            }

            if (var1 != null) {
               var1.close();
            }

            return null;
         }

         if (var1 != null) {
            var1.close();
         }

         return var4;
      } catch (IOException var9) {
         this.logger.log(SentryLevel.ERROR, var9, "Failed to load Sentry configuration from classpath resource: %s", this.fileName);
         return null;
      }
   }
}
