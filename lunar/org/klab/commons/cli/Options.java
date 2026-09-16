package org.klab.commons.cli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.klab.commons.cli.spi.CliProvider;
import vavi.beans.DefaultBinder;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Options {
   Class<? extends CliProvider> cliProvider() default CliProvider.class;

   Class<? extends Options.ExceptionHandler> exceptionHandler() default ExitExceptionHandler.class;

   Class<? extends DefaultBinder> defaultBinder() default AdvancedBinder.class;

   String option() default "";

   interface ExceptionHandler<T> {
      void handleException(Options.ExceptionHandler.Context<T> var1);

      abstract class Context<T> {
         protected Exception exception;
         protected T bean;

         public Context(Exception var1, T var2) {
            this.exception = var1;
            this.bean = (T)var2;
         }

         public Exception getException() {
            return this.exception;
         }

         public T getBean() {
            return this.bean;
         }

         public abstract void printHelp();
      }
   }

   class Util {
      private Util() {
      }

      public static CliProvider getCliProvider(Object var0) {
         try {
            Options var1 = var0.getClass().getAnnotation(Options.class);
            Class var2 = var1.cliProvider();
            return var2.equals(CliProvider.class) ? CliProvider.Util.defaultService() : (CliProvider)var2.getDeclaredConstructor().newInstance();
         } catch (Exception var3) {
            throw new IllegalStateException(var3);
         }
      }

      public static Options.ExceptionHandler<?> getExceptionHandler(Object var0) {
         try {
            Options var1 = var0.getClass().getAnnotation(Options.class);
            return (Options.ExceptionHandler<?>)var1.exceptionHandler().getDeclaredConstructor().newInstance();
         } catch (Exception var3) {
            throw new IllegalStateException(var3);
         }
      }

      public static DefaultBinder getDefaultBinder(Object var0) {
         try {
            Options var1 = var0.getClass().getAnnotation(Options.class);
            return var1.defaultBinder().getDeclaredConstructor().newInstance();
         } catch (Exception var3) {
            throw new IllegalStateException(var3);
         }
      }

      public static String getOption(Object var0) {
         Options var1 = var0.getClass().getAnnotation(Options.class);
         return var1.option();
      }

      public static void bind(String[] var0, Object var1) {
         Options var2 = var1.getClass().getAnnotation(Options.class);
         if (var2 == null) {
            throw new IllegalArgumentException("bean is not annotated with @Options");
         }

         CliProvider var3 = getCliProvider(var1);
         Options.ExceptionHandler var4 = getExceptionHandler(var1);
         DefaultBinder var5 = getDefaultBinder(var1);
         String var6 = getOption(var1);
         var3.setExceptionHandler(var4);
         var3.setDefaultBinder(var5);
         var3.setOption(var6);
         var3.bind(var0, var1);
      }
   }
}
