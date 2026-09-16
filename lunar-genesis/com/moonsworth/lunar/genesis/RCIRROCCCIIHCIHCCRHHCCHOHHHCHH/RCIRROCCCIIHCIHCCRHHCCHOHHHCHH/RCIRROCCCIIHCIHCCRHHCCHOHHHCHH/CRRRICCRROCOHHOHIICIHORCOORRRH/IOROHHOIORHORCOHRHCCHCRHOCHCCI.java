package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
final class IOROHHOIORHORCOHRHCCHCRHOCHCCI<T> extends IOIHHIORCICCHIIHOIOIOHHRICRHIO<Iterable<T>> implements Serializable {
   final Comparator<? super T> CRRIICCORIIIIOHICHHOHRRHICHRRC;
   private static final long CIRICRIORIRIRCCCIIOIIHOOIIIOIC = 0L;

   IOROHHOIORHORCOHRHCCHCRHOCHCCI(Comparator<? super T> var1) {
      this.CRRIICCORIIIIOHICHHOHRRHICHRRC = var1;
   }

   public int compare(Iterable<T> var1, Iterable<T> var2) {
      Iterator var3 = var1.iterator();
      Iterator var4 = var2.iterator();

      while (var3.hasNext()) {
         if (!var4.hasNext()) {
            return 1;
         }

         int var5 = this.CRRIICCORIIIIOHICHHOHRRHICHRRC.compare((T)var3.next(), (T)var4.next());
         if (var5 != 0) {
            return var5;
         }
      }

      return var4.hasNext() ? -1 : 0;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof IOROHHOIORHORCOHRHCCHCRHOCHCCI) {
         IOROHHOIORHORCOHRHCCHCRHOCHCCI var2 = (IOROHHOIORHORCOHRHCCHCRHOCHCCI)var1;
         return this.CRRIICCORIIIIOHICHHOHRRHICHRRC.equals(var2.CRRIICCORIIIIOHICHHOHRRHICHRRC);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.CRRIICCORIIIIOHICHHOHRRHICHRRC.hashCode() ^ 2075626741;
   }

   @Override
   public String toString() {
      return this.CRRIICCORIIIIOHICHHOHRRHICHRRC + ".lexicographical()";
   }
}
