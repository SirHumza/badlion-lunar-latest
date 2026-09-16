package com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;

final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   static final com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHRCCHIIRHRCOCCCROCRRIHCOR = new com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ""
   );
   static final com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHIIIROROHCROOCHCCRRIHRRCROOHR = new com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      ""
   );

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      implements com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private static final Pattern RROIHRCIRCCIRRRCCHRIHHOHHHCIHR = Pattern.compile("[:/]");
      private static final String HHOROROCRHIRIHRHOOOCICICHHCHII = ".";
      private final String CHORRHHICOCOCRRRRRRCIHOROIIHCC;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1) {
         this.CHORRHHICOCOCRRRRRRCIHOROIIHCC = var1.isEmpty() ? "" : var1 + ".";
      }

      @Override
      public <T> @Nullable T value(com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> var1) {
         StringBuffer var2 = new StringBuffer(var1.id().length() + this.CHORRHHICOCOCRRRRRRCIHOROIIHCC.length());
         var2.append(this.CHORRHHICOCOCRRRRRRCIHOROIIHCC);
         Matcher var3 = RROIHRCIRCCIRRRCCHRIHHOHHHCIHR.matcher(var1.id());

         while (var3.find()) {
            var3.appendReplacement(var2, ".");
         }

         var3.appendTail(var2);
         String var4 = System.getProperty(var2.toString());
         return (T)(var4 == null ? null : var1.IRRCRIOHOHIROOCOROHCCORIROCIHI().IRROICROIHCCCRRHIHCCOOCOOOHOCI(var4));
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private static final Pattern HCOHOHRIRIRCOIHHCIOHICIIHCOCRH = Pattern.compile("[:\\-/]");
      private static final String IROIHHCIHCICHOCCRRHCHRHIOCIRIO = "_";
      private final String CCRHICHOHOOOCORCCCIOHRICHRCCIR;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
         this.CCRHICHOHOOOCORCCCIOHRICHRCCIR = var1.isEmpty() ? "" : var1.toUpperCase(Locale.ROOT) + "_";
      }

      @Override
      public <T> @Nullable T value(com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> var1) {
         StringBuffer var2 = new StringBuffer(var1.id().length() + this.CCRHICHOHOOOCORCCCIOHRICHRCCIR.length());
         var2.append(this.CCRHICHOHOOOCORCCCIOHRICHRCCIR);
         Matcher var3 = HCOHOHRIRIRCOIHHCIOHICIIHCOCRH.matcher(var1.id());

         while (var3.find()) {
            var3.appendReplacement(var2, "_");
         }

         var3.appendTail(var2);
         String var4 = System.getenv(var2.toString().toUpperCase(Locale.ROOT));
         return (T)(var4 == null ? null : var1.IRRCRIOHOHIROOCOROHCCORIROCIHI().IRROICROIHCCCRRHIHCCOOCOOOHOCI(var4));
      }
   }
}
