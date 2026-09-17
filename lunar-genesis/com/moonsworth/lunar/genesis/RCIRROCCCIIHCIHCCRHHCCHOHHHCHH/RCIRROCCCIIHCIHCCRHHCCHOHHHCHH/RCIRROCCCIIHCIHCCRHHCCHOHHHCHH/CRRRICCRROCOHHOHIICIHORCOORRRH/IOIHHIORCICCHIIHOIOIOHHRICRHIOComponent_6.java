package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
final class OHIIIOHIRIRCCRRIOIICCHHIORRHOH<T> extends IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> implements Serializable {
   final Comparator<T> CIIRRCCIHCOIHHIICCRHIHOHRHOHIH;
   private static final long OCICHHHOCHOCHRRRRHCCHCOORHIIOH = 0L;

   OHIIIOHIRIRCCRRIOIICCHHIORRHOH(Comparator<T> var1) {
      this.CIIRRCCIHCOIHHIICCRHIHOHRHOHIH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   @Override
   public int compare(T var1, T var2) {
      return this.CIIRRCCIHCOIHHIICCRHIHOHRHOHIH.compare((T)var1, (T)var2);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof OHIIIOHIRIRCCRRIOIICCHHIORRHOH) {
         OHIIIOHIRIRCCRRIOIICCHHIORRHOH var2 = (OHIIIOHIRIRCCRRIOIICCHHIORRHOH)var1;
         return this.CIIRRCCIHCOIHHIICCRHIHOHRHOHIH.equals(var2.CIIRRCCIHCOIHHIICCRHIHOHRHOHIH);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.CIIRRCCIHCOIHHIICCRHIHOHRHOHIH.hashCode();
   }

   @Override
   public String toString() {
      return this.CIIRRCCIHCOIHHIICCRHIHOHRHOHIH.toString();
   }
}
