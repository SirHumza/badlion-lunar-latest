package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
final class HOIRIRROOCICRHIRIHCIRCOHCIHHHO<T> extends IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> implements Serializable {
   final IOIHHIORCICCHIIHOIOIOHHRICRHIO<? super T> RCRIICOCCIIIHOOIOCHIIHHIHIOHIC;
   private static final long CCHHIIOHHCHHOCHOHICIORRIHHRCHC = 0L;

   HOIRIRROOCICRHIRIHCIRCOHCIHHHO(IOIHHIORCICCHIIHOIOIOHHRICRHIO<? super T> var1) {
      this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   @Override
   public int compare(T var1, T var2) {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.compare((T)var2, (T)var1);
   }

   @Override
   public <S extends T> IOIHHIORCICCHIIHOIOIOHHRICRHIO<S> HCHORRRCIORCRHCRIIHROIRRRHCCOR() {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC;
   }

   @Override
   public <E extends T> E min(E var1, E var2) {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.max((E)var1, (E)var2);
   }

   @Override
   public <E extends T> E min(E var1, E var2, E var3, E... var4) {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.max((E)var1, (E)var2, (E)var3, (E[])var4);
   }

   @Override
   public <E extends T> E min(Iterator<E> var1) {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.max(var1);
   }

   @Override
   public <E extends T> E min(Iterable<E> var1) {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.max(var1);
   }

   @Override
   public <E extends T> E max(E var1, E var2) {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.min((E)var1, (E)var2);
   }

   @Override
   public <E extends T> E max(E var1, E var2, E var3, E... var4) {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.min((E)var1, (E)var2, (E)var3, (E[])var4);
   }

   @Override
   public <E extends T> E max(Iterator<E> var1) {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.min(var1);
   }

   @Override
   public <E extends T> E max(Iterable<E> var1) {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.min(var1);
   }

   @Override
   public int hashCode() {
      return -this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof HOIRIRROOCICRHIRIHCIRCOHCIHHHO) {
         HOIRIRROOCICRHIRIHCIRCOHCIHHHO var2 = (HOIRIRROOCICRHIRIHCIRCOHCIHHHO)var1;
         return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC.equals(var2.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.RCRIICOCCIIIHOOIOCHIIHHIHIOHIC + ".reverse()";
   }
}
