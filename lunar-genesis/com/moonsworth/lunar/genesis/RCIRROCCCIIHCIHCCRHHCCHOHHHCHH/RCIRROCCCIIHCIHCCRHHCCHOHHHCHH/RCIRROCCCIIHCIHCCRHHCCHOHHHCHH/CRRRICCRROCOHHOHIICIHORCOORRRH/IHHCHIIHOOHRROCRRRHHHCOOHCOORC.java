package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Comparator;
import java.util.SortedSet;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class IHHCHIIHOOHRROCRRRHHHCOOHCOORC {
   private IHHCHIIHOOHRROCRRRHHHCOOHCOORC() {
   }

   public static boolean hasSameComparator(Comparator<?> var0, Iterable<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Comparator var2;
      if (var1 instanceof SortedSet) {
         var2 = comparator((SortedSet)var1);
      } else {
         if (!(var1 instanceof HRICIORORHCRHCCCIIIHRRHCICOHOR)) {
            return false;
         }

         var2 = ((HRICIORORHCRHCCCIIIHRRHCICOHOR)var1).comparator();
      }

      return var0.equals(var2);
   }

   public static <E> Comparator<? super E> comparator(SortedSet<E> var0) {
      Comparator var1 = var0.comparator();
      if (var1 == null) {
         var1 = IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC();
      }

      return var1;
   }
}
