package org.klab.commons.cli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Bound {
   Class<? extends Binder<?>> binder();

   String value() default "";

   class Util {
      private Util() {
      }

      public static boolean isBound(Field var0) {
         return var0.getAnnotation(Bound.class) != null;
      }

      public static <T> Binder<T> getBinder(Field var0) {
         try {
            Bound var1 = var0.getAnnotation(Bound.class);
            return (Binder<T>)var1.binder().getDeclaredConstructor().newInstance();
         } catch (Exception var3) {
            throw new IllegalStateException(var3);
         }
      }
   }
}
