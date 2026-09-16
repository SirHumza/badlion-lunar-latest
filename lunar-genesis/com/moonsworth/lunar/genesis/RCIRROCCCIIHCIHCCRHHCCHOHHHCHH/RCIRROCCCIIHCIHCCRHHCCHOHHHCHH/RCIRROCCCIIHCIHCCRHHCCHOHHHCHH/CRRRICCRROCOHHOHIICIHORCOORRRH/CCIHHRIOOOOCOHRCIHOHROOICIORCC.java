package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
final class CCIHHRIOOOOCOHRCIHOHROOICIORCC<T> extends IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> implements Serializable {
   final Comparator<? super T>[] HIRIICOICCCIIHCRHHHIRORIRORHOR;
   private static final long CIHHIRCRICORRIHRRCOOHCCIRORCHI = 0L;

   CCIHHRIOOOOCOHRCIHOHROOICIORCC(Comparator<? super T> var1, Comparator<? super T> var2) {
      this.HIRIICOICCCIIHCRHHHIRORIRORHOR = new Comparator[]{var1, var2};
   }

   CCIHHRIOOOOCOHRCIHOHROOICIORCC(Iterable<? extends Comparator<? super T>> var1) {
      this.HIRIICOICCCIIHCRHHHIRORIRORHOR = IRIHOIRCHIRRCRIOORCOICORHHORHH.toArray(var1, new Comparator[0]);
   }

   @Override
   public int compare(T var1, T var2) {
      for (int var3 = 0; var3 < this.HIRIICOICCCIIHCRHHHIRORIRORHOR.length; var3++) {
         int var4 = this.HIRIICOICCCIIHCRHHHIRORIRORHOR[var3].compare((T)var1, (T)var2);
         if (var4 != 0) {
            return var4;
         }
      }

      return 0;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof CCIHHRIOOOOCOHRCIHOHROOICIORCC) {
         CCIHHRIOOOOCOHRCIHOHROOICIORCC var2 = (CCIHHRIOOOOCOHRCIHOHROOICIORCC)var1;
         return Arrays.equals(this.HIRIICOICCCIIHCRHHHIRORIRORHOR, var2.HIRIICOICCCIIHCRHHHIRORIRORHOR);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.HIRIICOICCCIIHCRHHHIRORIRORHOR);
   }

   @Override
   public String toString() {
      return "Ordering.compound(" + Arrays.toString(this.HIRIICOICCCIIHCRHHHIRORIRORHOR) + ")";
   }
}
