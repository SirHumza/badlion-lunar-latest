package com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.spongepowered.asm.mixin.Shadow;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD})
@com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
public @interface CORCOCICIRIOHROHROIIOOHICCHCRR {
   boolean smuggle() default true;

   Class<? extends Annotation>[] remove() default {};

   Shadow shadow() default @Shadow;
}
