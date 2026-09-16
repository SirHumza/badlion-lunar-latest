package org.klab.commons.cli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Argument {
   int index();

   boolean required() default false;

   class Util {
      private Util() {
      }

      public static int getIndex(Field var0) {
         Argument var1 = var0.getAnnotation(Argument.class);
         return var1.index();
      }

      public static boolean isRequred(Field var0) {
         Argument var1 = var0.getAnnotation(Argument.class);
         return var1.required();
      }
   }
}
