package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

@Documented
@TypeQualifier(applicableTo = Number.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Nonnegative {
   When when() default When.ALWAYS;

   class Checker implements TypeQualifierValidator<Nonnegative> {
      public When forConstantValue(Nonnegative var1, Object var2) {
         if (!(var2 instanceof Number)) {
            return When.NEVER;
         }

         Number var4 = (Number)var2;
         boolean var3;
         if (var4 instanceof Long) {
            var3 = var4.longValue() < 0L;
         } else if (var4 instanceof Double) {
            var3 = var4.doubleValue() < 0.0;
         } else if (var4 instanceof Float) {
            var3 = var4.floatValue() < 0.0F;
         } else {
            var3 = var4.intValue() < 0;
         }

         return var3 ? When.NEVER : When.ALWAYS;
      }
   }
}
