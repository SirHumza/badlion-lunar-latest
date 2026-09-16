package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public @interface RIROICHCRROROHCCROOCCCCOCHCCRI {
   String[] value() default {};

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH<RIROICHCRROROHCCROOCCCCOCHCCRI>, Serializable {
      private static final long OOOOHROHHCHCOHCIROICCIHCHOROHI = 1L;
      protected static final RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORHHIOIORIOOCCCICIRRHRHRHRIIII = new RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         null
      );
      protected final Set<String> OCRCCRRORHROIOOIIOCOIIHRHCOIIO;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Set<String> var1) {
         this.OCRCCRRORHROIOOIIOCOIIHRHCOIIO = var1;
      }

      public static RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIROICHCRROROHCCROOCCCCOCHCCRI var0) {
         return var0 == null
            ? ORHHIOIORIOOCCCICIRRHRHRHRIIII
            : new RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0.value()));
      }

      public static RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCOCRHHHICICRCHRCOIRICIOIRIRHO() {
         return ORHHIOIORIOOCCCICIRRHRHRHRIIII;
      }

      @Override
      public Class<RIROICHCRROROHCCROOCCCCOCHCCRI> HIHCROOHCOCCCIHCIHCHORCCHIIIIC() {
         return RIROICHCRROROHCCROOCCCCOCHCCRI.class;
      }

      public Set<String> CCCHHORHRRIOORHCHRRRIIOOCORHHC() {
         return this.OCRCCRRORHROIOOIIOCOIIHRHCOIIO;
      }

      public RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
      ) {
         Set var2;
         if (var1 != null && (var2 = var1.CCCHHORHRRIOORHCHRRRIIOOCORHHC()) != null) {
            if (this.OCRCCRRORHROIOOIIOCOIIHRHCOIIO == null) {
               return var1;
            }

            HashSet var3 = new HashSet();

            for (String var5 : var2) {
               if (this.OCRCCRRORHROIOOIIOCOIIHRHCOIIO.contains(var5)) {
                  var3.add(var5);
               }
            }

            return new RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
         } else {
            return this;
         }
      }

      @Override
      public String toString() {
         return String.format("JsonIncludeProperties.Value(included=%s)", this.OCRCCRRORHROIOOIIOCOIIHRHCOIIO);
      }

      @Override
      public int hashCode() {
         return this.OCRCCRRORHROIOOIIOCOIIHRHCOIIO == null ? 0 : this.OCRCCRRORHROIOOIIOCOIIHRHCOIIO.size();
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else {
            return var1 == null
               ? false
               : var1.getClass() == this.getClass()
                  && OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     this.OCRCCRRORHROIOOIIOCOIIHRHCOIIO, ((RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1).OCRCCRRORHROIOOIIOCOIIHRHCOIIO
                  );
         }
      }

      private static boolean OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Set<String> var0, Set<String> var1) {
         return var0 == null ? var1 == null : var0.equals(var1);
      }

      private static Set<String> OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(String[] var0) {
         if (var0 != null && var0.length != 0) {
            HashSet var1 = new HashSet(var0.length);

            for (String var5 : var0) {
               var1.add(var5);
            }

            return var1;
         } else {
            return Collections.emptySet();
         }
      }
   }
}
