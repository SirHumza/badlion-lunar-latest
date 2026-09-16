package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH<T> extends IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<T> {
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRCICCRCHCIROIHCIOOIHHIIRHCHHI = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NOT_READY;
   private @Nullable T next;

   protected HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   }

   protected abstract T computeNext();

   @CanIgnoreReturnValue
   protected final T ROCOROCOICRHOICORCIIRRRROCOHOC() {
      this.CRCICCRCHCIROIHCIOOIHHIIRHCHHI = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DONE;
      return null;
   }

   @CanIgnoreReturnValue
   @Override
   public final boolean hasNext() {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
         this.CRCICCRCHCIROIHCIOOIHHIIRHCHHI != HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FAILED
      );
      switch (this.CRCICCRCHCIROIHCIOOIHHIIRHCHHI) {
         case DONE:
            return false;
         case READY:
            return true;
         default:
            return this.tryToComputeNext();
      }
   }

   private boolean tryToComputeNext() {
      this.CRCICCRCHCIROIHCIOOIHHIIRHCHHI = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FAILED;
      this.next = this.computeNext();
      if (this.CRCICCRCHCIROIHCIOOIHHIIRHCHHI != HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DONE) {
         this.CRCICCRCHCIROIHCIOOIHHIIRHCHHI = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.READY;
         return true;
      } else {
         return false;
      }
   }

   @CanIgnoreReturnValue
   @Override
   public final T next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.CRCICCRCHCIROIHCIOOIHHIIRHCHHI = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NOT_READY;
      Object var1 = this.next;
      this.next = null;
      return (T)var1;
   }

   public final T HHOORIRHIHRHRIIRICCRHCCIHCIIRR() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return this.next;
      }
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      READY,
      NOT_READY,
      DONE,
      FAILED;
   }
}
