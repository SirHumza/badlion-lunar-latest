package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> implements Iterator<T> {
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORROOOCCCIOCOCHOCOHIOIRCICOOCO = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NOT_READY;
   private @Nullable T next;

   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   protected abstract T computeNext();

   @CanIgnoreReturnValue
   protected final @Nullable T CHICCRIOOROHRIHIRHHHCHICHCHIIH() {
      this.ORROOOCCCIOCOCHOCOHIOIRCICOOCO = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DONE;
      return null;
   }

   @Override
   public final boolean hasNext() {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(this.ORROOOCCCIOCOCHOCOHIOIRCICOOCO != IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FAILED);
      switch (this.ORROOOCCCIOCOCHOCOHIOIRCICOOCO) {
         case DONE:
            return false;
         case READY:
            return true;
         default:
            return this.tryToComputeNext();
      }
   }

   private boolean tryToComputeNext() {
      this.ORROOOCCCIOCOCHOCOHIOIRCICOOCO = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FAILED;
      this.next = this.computeNext();
      if (this.ORROOOCCCIOCOCHOCOHIOIRCICOOCO != IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DONE) {
         this.ORROOOCCCIOCOCHOCOHIOIRCICOOCO = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.READY;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final T next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      this.ORROOOCCCIOCOCHOCOHIOIRCICOOCO = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NOT_READY;
      Object var1 = this.next;
      this.next = null;
      return (T)var1;
   }

   @Override
   public final void remove() {
      throw new UnsupportedOperationException();
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      READY,
      NOT_READY,
      DONE,
      FAILED;
   }
}
