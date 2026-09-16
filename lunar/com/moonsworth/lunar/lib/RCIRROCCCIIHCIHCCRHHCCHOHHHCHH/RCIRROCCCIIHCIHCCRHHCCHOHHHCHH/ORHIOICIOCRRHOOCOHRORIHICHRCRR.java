package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public @interface ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   String COROCIRRROIOIRIRRHIIRHOROCHHHR = "";
   int CRRCOHOROIIHHCRIHRCHHRIIICHOOH = -1;

   String value() default "";

   String namespace() default "";

   boolean required() default false;

   int index() default -1;

   String CIHOIOCORIRIIOHOORIRHORRRCHOHR() default "";

   ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRIICRCHCICOCCIIOICIRIHORHHOCH() default ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.AUTO;

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      AUTO,
      READ_ONLY,
      WRITE_ONLY,
      READ_WRITE;
   }
}
