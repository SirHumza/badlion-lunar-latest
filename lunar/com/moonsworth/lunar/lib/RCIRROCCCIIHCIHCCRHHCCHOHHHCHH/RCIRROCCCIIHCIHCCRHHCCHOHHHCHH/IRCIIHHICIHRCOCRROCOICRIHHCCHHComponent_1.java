package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public @interface CRRRICCRROCOHHOHIICIHORCOORRRH {
   String value() default "";

   IOHHOIIOCRHCHHCRORICCOHOHROOIH ICCORHOCHOOROHIRCCCCOHHCRRHHIO() default IOHHOIIOCRHCHHCRORICCOHOHROOIH.DEFAULT;

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH<CRRRICCRROCOHHOHIICIHORCOORRRH>, Serializable {
      private static final long OCIHIOOOIHCCRIRCHICCCHIIRHHHOR = 1L;
      protected static final CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIORCCRCOIORHHIOHOOOIIOOHHIHHC = new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         null, null
      );
      protected final Object CHROHOOHRRIHHHICROOOOOCRCCHROC;
      protected final Boolean IHCCIHCCHHCCHRCORRIRROHCICCCHI;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var1, Boolean var2) {
         this.CHROHOOHRRIHHHICROOOOOCRCCHROC = var1;
         this.IHCCIHCCHHCCHRCORRIRROHCICCCHI = var2;
      }

      @Override
      public Class<CRRRICCRROCOHHOHIICIHORCOORRRH> HIHCROOHCOCCCIHCIHCHORCCHIIIIC() {
         return CRRRICCRROCOHHOHIICIHORCOORRRH.class;
      }

      public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRIRCIIRRHCCHOCCCIIORCIHICCIRR() {
         return OIORCCRCOIORHHIOHOOOIIOOHHIHHC;
      }

      public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var0, Boolean var1) {
         if ("".equals(var0)) {
            var0 = null;
         }

         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1)
            ? OIORCCRCOIORHHIOHOOOIIOOHHIHHC
            : new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
      }

      public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var0) {
         return var0 == null ? OIORCCRCOIORHHIOHOOOIIOOHHIHHC : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.value(), var0.ICCORHOCHOOROHIRCCCCOHHCRRHHIO().asBoolean());
      }

      public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HCCCIIHICHIROIHHIIHCIIICCORCCR(Object var0) {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null);
      }

      public CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CROHHORHOOORICOCHCOOHIROIOCIRO(Object var1) {
         if (var1 == null) {
            if (this.CHROHOOHRRIHHHICROOOOOCRCCHROC == null) {
               return this;
            }
         } else if (var1.equals(this.CHROHOOHRRIHHHICROOOOOCRCCHROC)) {
            return this;
         }

         return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.IHCCIHCCHHCCHRCORRIRROHCICCCHI);
      }

      public CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IICCOOCHCHROORHHIIHROHCCRHRCOR(Boolean var1) {
         if (var1 == null) {
            if (this.IHCCIHCCHHCCHRCORRIRROHCICCCHI == null) {
               return this;
            }
         } else if (var1.equals(this.IHCCIHCCHHCCHRCORRIRROHCICCCHI)) {
            return this;
         }

         return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CHROHOOHRRIHHHICROOOOOCRCCHROC, var1);
      }

      public Object OOIHCRRROCORHCCHOIHORCRRRCHHIC() {
         return this.CHROHOOHRRIHHHICROOOOOCRCCHROC;
      }

      public Boolean CHCRORHRRHHOIRRRCCRCHRIOHCICRI() {
         return this.IHCCIHCCHHCCHRCORRIRROHCICCCHI;
      }

      public boolean hasId() {
         return this.CHROHOOHRRIHHHICROOOOOCRCCHROC != null;
      }

      public boolean OHHHOIRORRRHROOROCHCIIICIRCROH(boolean var1) {
         return this.IHCCIHCCHHCCHRCORRIRROHCICCCHI == null ? var1 : this.IHCCIHCCHHCCHRCORRIRROHCICCCHI;
      }

      @Override
      public String toString() {
         return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.CHROHOOHRRIHHHICROOOOOCRCCHROC, this.IHCCIHCCHHCCHRCORRIRROHCICCCHI);
      }

      @Override
      public int hashCode() {
         int var1 = 1;
         if (this.CHROHOOHRRIHHHICROOOOOCRCCHROC != null) {
            var1 += this.CHROHOOHRRIHHHICROOOOOCRCCHROC.hashCode();
         }

         if (this.IHCCIHCCHHCCHRCORRIRROHCICCCHI != null) {
            var1 += this.IHCCIHCCHHCCHRCORRIRROHCICCCHI.hashCode();
         }

         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 == null) {
            return false;
         }

         if (var1.getClass() == this.getClass()) {
            CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            if (IOHHOIIOCRHCHHCRORICCOHOHROOIH.equals(this.IHCCIHCCHHCCHRCORRIRROHCICCCHI, var2.IHCCIHCCHHCCHRCORRIRROHCICCCHI)) {
               if (this.CHROHOOHRRIHHHICROOOOOCRCCHROC == null) {
                  return var2.CHROHOOHRRIHHHICROOOOOCRCCHROC == null;
               }

               return this.CHROHOOHRRIHHHICROOOOOCRCCHROC.equals(var2.CHROHOOHRRIHHHICROOOOOCRCCHROC);
            }
         }

         return false;
      }

      private static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(Object var0, Boolean var1) {
         return var0 == null && var1 == null;
      }
   }
}
