package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import java.util.Queue;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class ROHHHCHRIHHOOHCHIIIHOOCIIRROIO<E> extends OOCHRIIIRIHRRCRIORHCROIIHCRRIC<E> implements Queue<E> {
   protected ROHHHCHRIHHOOHCHIIIHOOCIIRROIO() {
   }

   protected abstract Queue<E> delegate();

   @CanIgnoreReturnValue
   @Override
   public boolean offer(E var1) {
      return this.delegate().offer((E)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public E poll() {
      return this.delegate().poll();
   }

   @CanIgnoreReturnValue
   @Override
   public E remove() {
      return this.delegate().remove();
   }

   @Override
   public E peek() {
      return this.delegate().peek();
   }

   @Override
   public E element() {
      return this.delegate().element();
   }

   protected boolean standardOffer(E var1) {
      try {
         return this.add((E)var1);
      } catch (IllegalStateException var3) {
         return false;
      }
   }

   protected E standardPeek() {
      try {
         return this.element();
      } catch (NoSuchElementException var2) {
         return null;
      }
   }

   protected E standardPoll() {
      try {
         return this.remove();
      } catch (NoSuchElementException var2) {
         return null;
      }
   }
}
