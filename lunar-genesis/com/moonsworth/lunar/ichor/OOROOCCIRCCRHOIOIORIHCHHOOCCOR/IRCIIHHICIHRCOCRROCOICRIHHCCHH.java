package com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   private final CORCOCICIRIOHROHROIIOOHICCHCRR OIIRCHHHCHORCRHRRICIIHRIOOHOIH;
   private final Map<String, byte[]> CHHOOHIRRRCIHOOIOORICHRRORRCCI;
   private final Predicate<String> IIROCOHRCOOIOOCICROCROCRCORROR;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1, Map<String, byte[]> var2, Predicate<String> var3) {
      this.OIIRCHHHCHORCRHRRICIIHRIOOHOIH = var1;
      this.CHHOOHIRRRCIHOOIOORICHRRORRCCI = var2;
      this.IIROCOHRCOOIOOCICROCROCRCORROR = var3;
   }

   public Optional<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HCHRIROHHHCORIOCROOCHRCIOROOCI(Collection<String> var1) {
      for (String var3 : var1) {
         String var4 = var3.replace("/", ".");
         if (this.IIROCOHRCOOIOOCICROCROCRCORROR.test(var4)) {
            byte[] var5 = this.CHHOOHIRRRCIHOOIOORICHRRORRCCI.get(var4);
            if (var5 != null) {
               return Optional.of(new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OIIRCHHHCHORCRHRRICIIHRIOOHOIH, var4, var5));
            }
         }
      }

      return Optional.empty();
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var0, Path var1, Predicate<String> var2) {
      Map var3 = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var3, var2);
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR IOCHOCCCOOHHRHCRCRHCCCHCRCHCRI() {
      return this.OIIRCHHHCHORCRHRRICIIHRIOOHOIH;
   }

   public Map<String, byte[]> OOOCCOHHOHIICHHCHOROHOHIOCRCOR() {
      return this.CHHOOHIRRRCIHOOIOORICHRRORRCCI;
   }

   public Predicate<String> CHOOIOROOHCICHIIOIHHOHORICHCHC() {
      return this.IIROCOHRCOOIOOCICROCROCRCORROR;
   }
}
