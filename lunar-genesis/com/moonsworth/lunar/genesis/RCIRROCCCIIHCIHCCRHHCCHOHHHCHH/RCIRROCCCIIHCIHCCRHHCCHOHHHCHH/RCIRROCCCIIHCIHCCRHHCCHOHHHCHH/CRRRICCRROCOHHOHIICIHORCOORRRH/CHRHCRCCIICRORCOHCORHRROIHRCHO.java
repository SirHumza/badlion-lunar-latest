package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
final class CHRHCRCCIICRORCOHCORHRROIHRCHO<T> extends IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> implements Serializable {
   final IOIHHIORCICCHIIHOIOIOHHRICRHIO<? super T> CIIORIOIIHOORIHOOHRCCOOIHHCHCR;
   private static final long IHRIIORROROIROORHIRORORORIHHHI = 0L;

   CHRHCRCCIICRORCOHCORHRROIHRCHO(IOIHHIORCICCHIIHOIOIOHHRICRHIO<? super T> var1) {
      this.CIIORIOIIHOORIHOOHRCCOOIHHCHCR = var1;
   }

   @Override
   public int compare(@Nullable T var1, @Nullable T var2) {
      if (var1 == var2) {
         return 0;
      } else if (var1 == null) {
         return 1;
      } else {
         return var2 == null ? -1 : this.CIIORIOIIHOORIHOOHRCCOOIHHCHCR.compare((T)var1, (T)var2);
      }
   }

   @Override
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> HCHORRRCIORCRHCRIIHROIRRRHCCOR() {
      return this.CIIORIOIIHOORIHOOHRCCOOIHHCHCR.HCHORRRCIORCRHCRIIHROIRRRHCCOR().ICIRICOORRRIHCOHHOHIHRHIRRCHII();
   }

   @Override
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> ICIRICOORRRIHCOHHOHIHRHIRRCHII() {
      return this.CIIORIOIIHOORIHOOHRCCOOIHHCHCR.ICIRICOORRRIHCOHHOHIHRHIRRCHII();
   }

   @Override
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> OCRORRCHHHCHOIHHCIOHIIIIRCHHCI() {
      return this;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof CHRHCRCCIICRORCOHCORHRROIHRCHO) {
         CHRHCRCCIICRORCOHCORHRROIHRCHO var2 = (CHRHCRCCIICRORCOHCORHRROIHRCHO)var1;
         return this.CIIORIOIIHOORIHOOHRCCOOIHHCHCR.equals(var2.CIIORIOIIHOORIHOOHRCCOOIHHCHCR);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.CIIORIOIIHOORIHOOHRCCOOIHHCHCR.hashCode() ^ -921210296;
   }

   @Override
   public String toString() {
      return this.CIIORIOIIHOORIHOOHRCCOOIHHCHCR + ".nullsLast()";
   }
}
