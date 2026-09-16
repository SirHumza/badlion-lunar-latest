package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ListIterator;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class RIHOOCIHRICOCHRHCOOCCOIHOCHRCR<E> extends CHHIICHRIIROIOHIHIIROICOCCROCI<E> implements ListIterator<E> {
   protected RIHOOCIHRICOCHRHCOOCCOIHOCHRCR() {
   }

   protected abstract ListIterator<E> delegate();

   @Override
   public void add(E var1) {
      this.delegate().add((E)var1);
   }

   @Override
   public boolean hasPrevious() {
      return this.delegate().hasPrevious();
   }

   @Override
   public int nextIndex() {
      return this.delegate().nextIndex();
   }

   @CanIgnoreReturnValue
   @Override
   public E previous() {
      return this.delegate().previous();
   }

   @Override
   public int previousIndex() {
      return this.delegate().previousIndex();
   }

   @Override
   public void set(E var1) {
      this.delegate().set((E)var1);
   }
}
