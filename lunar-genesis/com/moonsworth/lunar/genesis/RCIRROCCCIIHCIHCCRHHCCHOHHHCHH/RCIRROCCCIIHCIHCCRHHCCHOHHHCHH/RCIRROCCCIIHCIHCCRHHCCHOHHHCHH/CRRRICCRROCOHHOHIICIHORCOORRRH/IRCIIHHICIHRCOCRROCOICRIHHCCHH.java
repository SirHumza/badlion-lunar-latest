package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.NoSuchElementException;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> extends RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC<E> {
   private final int RHRICRCOIHROOOHCRICCOCRCHHRCCO;
   private int position;

   protected abstract E get(int var1);

   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1) {
      this(var1, 0);
   }

   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, int var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
         var2, var1
      );
      this.RHRICRCOIHROOOHCRICCOCRCHHRCCO = var1;
      this.position = var2;
   }

   @Override
   public final boolean hasNext() {
      return this.position < this.RHRICRCOIHROOOHCRICCOCRCHHRCCO;
   }

   @Override
   public final E next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return this.get(this.position++);
      }
   }

   @Override
   public final int nextIndex() {
      return this.position;
   }

   @Override
   public final boolean hasPrevious() {
      return this.position > 0;
   }

   @Override
   public final E previous() {
      if (!this.hasPrevious()) {
         throw new NoSuchElementException();
      } else {
         return this.get(--this.position);
      }
   }

   @Override
   public final int previousIndex() {
      return this.position - 1;
   }
}
