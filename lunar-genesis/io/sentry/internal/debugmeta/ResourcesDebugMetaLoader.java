package io.sentry.internal.debugmeta;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import io.sentry.util.DebugMetaPropertiesApplier;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class ResourcesDebugMetaLoader implements IDebugMetaLoader {
   @NotNull
   private final ILogger logger;
   @NotNull
   private final ClassLoader classLoader;

   public ResourcesDebugMetaLoader(@NotNull ILogger var1) {
      this(var1, ResourcesDebugMetaLoader.class.getClassLoader());
   }

   ResourcesDebugMetaLoader(@NotNull ILogger var1, @Nullable ClassLoader var2) {
      this.logger = var1;
      this.classLoader = ClassLoaderUtils.classLoaderOrDefault(var2);
   }

   @Nullable
   @Override
   public List<Properties> loadDebugMeta() {
      ArrayList var1 = new ArrayList();

      try {
         Enumeration var2 = this.classLoader.getResources(DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);

         while (var2.hasMoreElements()) {
            URL var3 = (URL)var2.nextElement();

            try {
               InputStream var4 = var3.openStream();

               try {
                  Properties var5 = new Properties();
                  var5.load(var4);
                  var1.add(var5);
                  this.logger.log(SentryLevel.INFO, "Debug Meta Data Properties loaded from %s", var3);
               } catch (Throwable var8) {
                  if (var4 != null) {
                     try {
                        var4.close();
                     } catch (Throwable var7) {
                        var8.addSuppressed(var7);
                     }
                  }

                  throw var8;
               }

               if (var4 != null) {
                  var4.close();
               }
            } catch (RuntimeException var9) {
               this.logger.log(SentryLevel.ERROR, var9, "%s file is malformed.", var3);
            }
         }
      } catch (IOException var10) {
         this.logger.log(SentryLevel.ERROR, var10, "Failed to load %s", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
      }

      if (var1.isEmpty()) {
         this.logger.log(SentryLevel.INFO, "No %s file was found.", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
         return null;
      } else {
         return var1;
      }
   }
}
