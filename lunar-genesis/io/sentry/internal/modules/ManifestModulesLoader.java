package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Experimental
@ApiStatus.Internal
public final class ManifestModulesLoader extends ModulesLoader {
   private final Pattern URL_LIB_PATTERN = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
   private final Pattern NAME_AND_VERSION = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
   private final ClassLoader classLoader;

   public ManifestModulesLoader(@NotNull ILogger var1) {
      this(ManifestModulesLoader.class.getClassLoader(), var1);
   }

   ManifestModulesLoader(@Nullable ClassLoader var1, @NotNull ILogger var2) {
      super(var2);
      this.classLoader = ClassLoaderUtils.classLoaderOrDefault(var1);
   }

   @Override
   protected Map<String, String> loadModules() {
      HashMap var1 = new HashMap();

      for (ManifestModulesLoader.Module var4 : this.detectModulesViaManifestFiles()) {
         var1.put(var4.name, var4.version);
      }

      return var1;
   }

   @NotNull
   private List<ManifestModulesLoader.Module> detectModulesViaManifestFiles() {
      ArrayList var1 = new ArrayList();

      try {
         Enumeration var2 = this.classLoader.getResources("META-INF/MANIFEST.MF");

         while (var2.hasMoreElements()) {
            URL var3 = (URL)var2.nextElement();
            String var4 = this.extractDependencyNameFromUrl(var3);
            ManifestModulesLoader.Module var5 = this.convertOriginalNameToModule(var4);
            if (var5 != null) {
               var1.add(var5);
            }
         }
      } catch (Throwable var6) {
         this.logger.log(SentryLevel.ERROR, "Unable to detect modules via manifest files.", var6);
      }

      return var1;
   }

   @Nullable
   private ManifestModulesLoader.Module convertOriginalNameToModule(@Nullable String var1) {
      if (var1 == null) {
         return null;
      } else {
         Matcher var2 = this.NAME_AND_VERSION.matcher(var1);
         if (var2.matches() && var2.groupCount() == 2) {
            String var3 = var2.group(1);
            String var4 = var2.group(2);
            return new ManifestModulesLoader.Module(var3, var4);
         } else {
            return null;
         }
      }
   }

   @Nullable
   private String extractDependencyNameFromUrl(@NotNull URL var1) {
      String var2 = var1.toString();
      Matcher var3 = this.URL_LIB_PATTERN.matcher(var2);
      return var3.matches() && var3.groupCount() == 1 ? var3.group(1) : null;
   }

   private static final class Module {
      @NotNull
      private final String name;
      @NotNull
      private final String version;

      public Module(@NotNull String var1, @NotNull String var2) {
         this.name = var1;
         this.version = var2;
      }
   }
}
