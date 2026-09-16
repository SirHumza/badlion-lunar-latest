package org.klab.commons.cli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Option {
   int args() default 0;

   String argName() default "";

   boolean required() default false;

   String description() default "";

   char valueSeparator() default '-';

   String option();
}
