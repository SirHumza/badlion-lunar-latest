package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

@Documented
@Syntax("RegEx")
@Retention(RetentionPolicy.RUNTIME)
@TypeQualifierNickname
public @interface RegEx {
   When when() default When.ALWAYS;

   class Checker implements TypeQualifierValidator<RegEx> {
      public When forConstantValue(RegEx var1, Object var2) {
         if (!(var2 instanceof String)) {
            return When.NEVER;
         }

         try {
            Pattern.compile((String)var2);
         } catch (PatternSyntaxException var4) {
            return When.NEVER;
         }

         return When.ALWAYS;
      }
   }
}
