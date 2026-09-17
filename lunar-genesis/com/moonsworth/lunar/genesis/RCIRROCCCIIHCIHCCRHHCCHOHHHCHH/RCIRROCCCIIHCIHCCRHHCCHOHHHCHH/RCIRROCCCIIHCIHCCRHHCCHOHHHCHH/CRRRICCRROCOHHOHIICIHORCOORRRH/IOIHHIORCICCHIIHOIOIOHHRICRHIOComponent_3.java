package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
final class HHIRHRHHRHIHRHOHCHRHIORRHIIHOR<T> extends IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> implements Serializable {
   final OOHRIIOOHROIOHCIRIHRHRRICRRHOI<T, Integer> CRHCRCHIHIOOIOCRCHCCRHIHHIIOIH;
   private static final long RCHCCROIHOCRRIOROHHIROIRCOIRCI = 0L;

   HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(List<T> var1) {
      this(ROCHRRCORRCOOOOOCOICOCROIIHIHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var1));
   }

   HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(OOHRIIOOHROIOHCIRIHRHRRICRRHOI<T, Integer> var1) {
      this.CRHCRCHIHIOOIOCRCHCCRHIHHIIOIH = var1;
   }

   @Override
   public int compare(T var1, T var2) {
      return this.rank((T)var1) - this.rank((T)var2);
   }

   private int rank(T var1) {
      Integer var2 = this.CRHCRCHIHIOOIOCRCHCCRHIHHIIOIH.get(var1);
      if (var2 == null) {
         throw new IOIHHIORCICCHIIHOIOIOHHRICRHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      } else {
         return var2;
      }
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 instanceof HHIRHRHHRHIHRHOHCHRHIORRHIIHOR) {
         HHIRHRHHRHIHRHOHCHRHIORRHIIHOR var2 = (HHIRHRHHRHIHRHOHCHRHIORRHIIHOR)var1;
         return this.CRHCRCHIHIOOIOCRCHCCRHIHHIIOIH.equals(var2.CRHCRCHIHIOOIOCRCHCCRHIHHIIOIH);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.CRHCRCHIHIOOIOCRCHCCRHIHHIIOIH.hashCode();
   }

   @Override
   public String toString() {
      return "Ordering.explicit(" + this.CRHCRCHIHIOOIOCRCHCCRHIHHIIOIH.RORCHHOHICRHCCIRRORIHCCOCRHOCO() + ")";
   }
}
