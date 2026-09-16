package org.klab.commons.cli.spi;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.ServiceLoader;
import java.util.Set;
import org.klab.commons.cli.HelpOption;
import org.klab.commons.cli.Option;
import org.klab.commons.cli.Options;
import vavi.beans.DefaultBinder;

public abstract class CliProvider {
   protected Options.ExceptionHandler<?> exceptionHandler;
   protected DefaultBinder defaultBinder;
   protected String option;

   public void setExceptionHandler(Options.ExceptionHandler<?> var1) {
      this.exceptionHandler = var1;
   }

   public void setDefaultBinder(DefaultBinder var1) {
      this.defaultBinder = var1;
   }

   public void setOption(String var1) {
      this.option = var1;
   }

   public abstract <T> void bind(String[] var1, T var2);

   public static class Util {
      private static CliProvider defaultProvider;

      private Util() {
      }

      public static Set<Field> getOptionFields(Object var0) {
         Options var1 = var0.getClass().getAnnotation(Options.class);
         if (var1 == null) {
            throw new IllegalArgumentException("bean is not annotated with @Options");
         }

         HashSet var2 = new HashSet();

         for (Class var3 = var0.getClass(); var3 != null; var3 = var3.getSuperclass()) {
            for (Field var7 : var3.getDeclaredFields()) {
               Option var8 = var7.getAnnotation(Option.class);
               if (var8 != null) {
                  var2.add(var7);
               }
            }
         }

         return var2;
      }

      public static CliProvider defaultService() {
         return defaultProvider;
      }

      public static HelpOption getHelpOption(Object var0) {
         Options var1 = var0.getClass().getAnnotation(Options.class);
         if (var1 == null) {
            throw new IllegalArgumentException("bean is not annotated with @Options");
         }

         for (Class var2 = var0.getClass(); var2 != null; var2 = var2.getSuperclass()) {
            HelpOption var3 = var2.getAnnotation(HelpOption.class);
            if (var3 != null) {
               return var3;
            }
         }

         return null;
      }

      static {
         ServiceLoader var0 = ServiceLoader.load(CliProvider.class);
         defaultProvider = (CliProvider)var0.iterator().next();
      }
   }
}
