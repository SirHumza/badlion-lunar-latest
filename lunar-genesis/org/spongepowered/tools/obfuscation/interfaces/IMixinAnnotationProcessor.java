package org.spongepowered.tools.obfuscation.interfaces;

import javax.annotation.processing.ProcessingEnvironment;
import org.spongepowered.asm.util.ITokenProvider;

public interface IMixinAnnotationProcessor extends IMessagerSuppressible, IOptionProvider {
   IMixinAnnotationProcessor.CompilerEnvironment getCompilerEnvironment();

   ProcessingEnvironment getProcessingEnvironment();

   IObfuscationManager getObfuscationManager();

   ITokenProvider getTokenProvider();

   ITypeHandleProvider getTypeProvider();

   IJavadocProvider getJavadocProvider();

   enum CompilerEnvironment {
      JAVAC(false, "Java Compiler"),
      JDT(true, "Eclipse (JDT)") {
         @Override
         protected boolean isDetected(ProcessingEnvironment var1) {
            return var1.getClass().getName().contains("jdt");
         }
      },
      IDEA(true, "IntelliJ IDEA") {
         @Override
         protected boolean isDetected(ProcessingEnvironment var1) {
            for (String var5 : new String[]{"idea.plugins.path", "idea.config.path", "idea.home.path", "idea.paths.selector"}) {
               if (System.getProperty(var5) != null) {
                  return true;
               }
            }

            return false;
         }
      };

      private final boolean isDevelopmentEnvironment;
      private final String friendlyName;

      CompilerEnvironment(boolean var3, String var4) {
         this.isDevelopmentEnvironment = var3;
         this.friendlyName = var4;
      }

      public boolean isCompiler() {
         return !this.isDevelopmentEnvironment;
      }

      public boolean isDevelopmentEnvironment() {
         return this.isDevelopmentEnvironment;
      }

      public String getFriendlyName() {
         return this.friendlyName;
      }

      protected boolean isDetected(ProcessingEnvironment var1) {
         return false;
      }

      public static IMixinAnnotationProcessor.CompilerEnvironment detect(ProcessingEnvironment var0) {
         for (IMixinAnnotationProcessor.CompilerEnvironment var4 : values()) {
            if (var4.isDetected(var0)) {
               return var4;
            }
         }

         return JAVAC;
      }
   }
}
