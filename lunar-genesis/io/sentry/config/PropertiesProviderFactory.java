package io.sentry.config;

import io.sentry.SystemOutLogger;
import java.util.ArrayList;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class PropertiesProviderFactory {
   @NotNull
   public static PropertiesProvider create() {
      SystemOutLogger var0 = new SystemOutLogger();
      ArrayList var1 = new ArrayList();
      var1.add(new SystemPropertyPropertiesProvider());
      var1.add(new EnvironmentVariablePropertiesProvider());
      String var2 = System.getProperty("sentry.properties.file");
      if (var2 != null) {
         Properties var3 = new FilesystemPropertiesLoader(var2, var0).load();
         if (var3 != null) {
            var1.add(new SimplePropertiesProvider(var3));
         }
      }

      String var6 = System.getenv("SENTRY_PROPERTIES_FILE");
      if (var6 != null) {
         Properties var4 = new FilesystemPropertiesLoader(var6, var0).load();
         if (var4 != null) {
            var1.add(new SimplePropertiesProvider(var4));
         }
      }

      Properties var7 = new ClasspathPropertiesLoader(var0).load();
      if (var7 != null) {
         var1.add(new SimplePropertiesProvider(var7));
      }

      Properties var5 = new FilesystemPropertiesLoader("sentry.properties", var0).load();
      if (var5 != null) {
         var1.add(new SimplePropertiesProvider(var5));
      }

      return new CompositePropertiesProvider(var1);
   }
}
