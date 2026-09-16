package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public @interface IOHIHIIHCCCCCIHRORIOIOORCIOHII {
   IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH HRICIIOIIOIHRCHROROOROCIHOIRIR();

   IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIRIHOCOHORICOHRRHHOHHOROHRRRO() default IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PROPERTY;

   String OICCCOOHORIHRHOORROORIIHORIRRH() default "";

   Class<?> OOIIIRHRCCCCRHOCOHHRIIOOICCOCR() default IOHIHIIHCCCCCIHRORIOIOORCIOHII.class;

   boolean OOCHHCRIIRICHCROICHCROOHOIRRCC() default false;

   @Deprecated
   abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   }

   enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      NONE(null),
      CLASS("@class"),
      MINIMAL_CLASS("@c"),
      NAME("@type"),
      DEDUCTION(null),
      CUSTOM(null);

      private final String _defaultPropertyName;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3) {
         this._defaultPropertyName = var3;
      }

      public String getDefaultPropertyName() {
         return this._defaultPropertyName;
      }
   }

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      PROPERTY,
      WRAPPER_OBJECT,
      WRAPPER_ARRAY,
      EXTERNAL_PROPERTY,
      EXISTING_PROPERTY;
   }
}
