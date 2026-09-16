package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class IIHRRHORCRCROCHHOHORCHCROCIHRO<T> extends IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> {
   private @Nullable T nextOrNull;

   protected IIHRRHORCRCROCHHOHORCHCROCIHRO(@Nullable T var1) {
      this.nextOrNull = (T)var1;
   }

   protected abstract @Nullable T computeNext(T var1);

   @Override
   public final boolean hasNext() {
      return this.nextOrNull != null;
   }

   @Override
   public final T next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      try {
         return this.nextOrNull;
      } finally {
         this.nextOrNull = this.computeNext(this.nextOrNull);
      }
   }
}
