package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class ResourcesModulesLoader extends ModulesLoader {
   @NotNull
   private final ClassLoader classLoader;

   public ResourcesModulesLoader(@NotNull ILogger var1) {
      this(var1, ResourcesModulesLoader.class.getClassLoader());
   }

   ResourcesModulesLoader(@NotNull ILogger var1, @Nullable ClassLoader var2) {
      super(var1);
      this.classLoader = ClassLoaderUtils.classLoaderOrDefault(var2);
   }

   @Override
   protected Map<String, String> loadModules() {
      TreeMap var1 = new TreeMap();

      try {
         InputStream var2 = this.classLoader.getResourceAsStream("sentry-external-modules.txt");

         Map var9;
         label57: {
            try {
               if (var2 == null) {
                  this.logger.log(SentryLevel.INFO, "%s file was not found.", "sentry-external-modules.txt");
                  var9 = var1;
                  break label57;
               }

               var9 = this.parseStream(var2);
            } catch (Throwable var6) {
               if (var2 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var5) {
                     var6.addSuppressed(var5);
                  }
               }

               throw var6;
            }

            if (var2 != null) {
               var2.close();
            }

            return var9;
         }

         if (var2 != null) {
            var2.close();
         }

         return var9;
      } catch (SecurityException var7) {
         this.logger.log(SentryLevel.INFO, "Access to resources denied.", var7);
      } catch (IOException var8) {
         this.logger.log(SentryLevel.INFO, "Access to resources failed.", var8);
      }

      return var1;
   }
}
