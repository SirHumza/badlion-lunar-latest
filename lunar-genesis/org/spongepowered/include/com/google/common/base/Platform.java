package org.spongepowered.include.com.google.common.base;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

final class Platform {
   private static final Logger logger = Logger.getLogger(Platform.class.getName());
   private static final PatternCompiler patternCompiler = loadPatternCompiler();

   private Platform() {
   }

   static boolean stringIsNullOrEmpty(@Nullable String var0) {
      return var0 == null || var0.isEmpty();
   }

   private static PatternCompiler loadPatternCompiler() {
      ServiceLoader var0 = ServiceLoader.load(PatternCompiler.class);

      try {
         Iterator var1 = var0.iterator();

         while (var1.hasNext()) {
            try {
               return (PatternCompiler)var1.next();
            } catch (ServiceConfigurationError var3) {
               logPatternCompilerError(var3);
            }
         }
      } catch (ServiceConfigurationError var4) {
         logPatternCompilerError(var4);
      }

      return new Platform.JdkPatternCompiler();
   }

   private static void logPatternCompilerError(ServiceConfigurationError var0) {
      logger.log(Level.WARNING, "Error loading regex compiler, falling back to next option", var0);
   }

   private static final class JdkPatternCompiler implements PatternCompiler {
      private JdkPatternCompiler() {
      }
   }
}
