package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public abstract class ModulesLoader implements IModulesLoader {
   private static final Charset UTF_8 = Charset.forName("UTF-8");
   public static final String EXTERNAL_MODULES_FILENAME = "sentry-external-modules.txt";
   @NotNull
   protected final ILogger logger;
   @Nullable
   private Map<String, String> cachedModules = null;

   public ModulesLoader(@NotNull ILogger var1) {
      this.logger = var1;
   }

   @Nullable
   @Override
   public Map<String, String> getOrLoadModules() {
      if (this.cachedModules != null) {
         return this.cachedModules;
      }

      this.cachedModules = this.loadModules();
      return this.cachedModules;
   }

   protected abstract Map<String, String> loadModules();

   protected Map<String, String> parseStream(@NotNull InputStream var1) {
      TreeMap var2 = new TreeMap();

      try {
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var1, UTF_8));

         try {
            for (String var4 = var3.readLine(); var4 != null; var4 = var3.readLine()) {
               int var5 = var4.lastIndexOf(58);
               String var6 = var4.substring(0, var5);
               String var7 = var4.substring(var5 + 1);
               var2.put(var6, var7);
            }

            this.logger.log(SentryLevel.DEBUG, "Extracted %d modules from resources.", var2.size());
         } catch (Throwable var9) {
            try {
               var3.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }

            throw var9;
         }

         var3.close();
      } catch (IOException var10) {
         this.logger.log(SentryLevel.ERROR, "Error extracting modules.", var10);
      } catch (RuntimeException var11) {
         this.logger.log(SentryLevel.ERROR, var11, "%s file is malformed.", "sentry-external-modules.txt");
      }

      return var2;
   }
}
