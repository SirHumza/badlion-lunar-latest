package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

@Documented
@TypeQualifier(applicableTo = String.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MatchesPattern {
   @RegEx
   String value();

   int flags() default 0;

   class Checker implements TypeQualifierValidator<MatchesPattern> {
      public When forConstantValue(MatchesPattern var1, Object var2) {
         Pattern var3 = Pattern.compile(var1.value(), var1.flags());
         return var3.matcher((String)var2).matches() ? When.ALWAYS : When.NEVER;
      }
   }
}
