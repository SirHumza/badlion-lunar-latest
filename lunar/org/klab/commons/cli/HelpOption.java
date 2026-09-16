package org.klab.commons.cli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HelpOption {
   String argName() default "";

   String description() default "";

   String option();

   Class<? extends Options.ExceptionHandler> helpHandler() default ExitExceptionHandler.class;

   class Util {
      private Util() {
      }

      public static Options.ExceptionHandler<?> getExceptionHandler(HelpOption var0) {
         try {
            return (Options.ExceptionHandler<?>)var0.helpHandler().getDeclaredConstructor().newInstance();
         } catch (Exception var2) {
            throw new IllegalStateException(var2);
         }
      }
   }
}
