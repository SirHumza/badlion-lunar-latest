package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.ListIterator;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class CCHCOROOHHCIHOHOCHIHRHOHOCROII<F, T> extends HOIRRRIRHICOHCCORHIHCOHIIIHCCO<F, T> implements ListIterator<T> {
   CCHCOROOHHCIHOHOCHIHRHOHOCROII(ListIterator<? extends F> var1) {
      super(var1);
   }

   private ListIterator<? extends F> backingIterator() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.cast(this.ICCOIHICCIHICCRCHIORHCOIRCOOOC);
   }

   @Override
   public final boolean hasPrevious() {
      return this.backingIterator().hasPrevious();
   }

   @Override
   public final T previous() {
      return this.transform((F)this.backingIterator().previous());
   }

   @Override
   public final int nextIndex() {
      return this.backingIterator().nextIndex();
   }

   @Override
   public final int previousIndex() {
      return this.backingIterator().previousIndex();
   }

   @Override
   public void set(T var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void add(T var1) {
      throw new UnsupportedOperationException();
   }
}
