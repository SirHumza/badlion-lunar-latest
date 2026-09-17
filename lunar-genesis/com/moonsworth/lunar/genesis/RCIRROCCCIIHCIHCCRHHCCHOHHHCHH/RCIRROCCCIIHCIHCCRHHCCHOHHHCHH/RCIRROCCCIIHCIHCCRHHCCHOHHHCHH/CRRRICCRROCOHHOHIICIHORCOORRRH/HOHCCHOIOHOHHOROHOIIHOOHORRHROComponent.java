package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class IHROCRRIRIROCCCRCRRROCRRCRIIHH<E> extends HOHCCHOIOHOHHOROHOIIHOOHORRHRO<E> implements SortedSet<E> {
   protected IHROCRRIRIROCCCRCRRROCRRCRIIHH() {
   }

   protected abstract SortedSet<E> delegate();

   @Override
   public Comparator<? super E> comparator() {
      return this.delegate().comparator();
   }

   @Override
   public E first() {
      return this.delegate().first();
   }

   @Override
   public SortedSet<E> headSet(E var1) {
      return this.delegate().headSet((E)var1);
   }

   @Override
   public E last() {
      return this.delegate().last();
   }

   @Override
   public SortedSet<E> subSet(E var1, E var2) {
      return this.delegate().subSet((E)var1, (E)var2);
   }

   @Override
   public SortedSet<E> tailSet(E var1) {
      return this.delegate().tailSet((E)var1);
   }

   private int unsafeCompare(@Nullable Object var1, @Nullable Object var2) {
      Comparator var3 = this.comparator();
      return var3 == null ? ((Comparable)var1).compareTo(var2) : var3.compare(var1, var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @Override
   protected boolean standardContains(@Nullable Object var1) {
      try {
         IHROCRRIRIROCCCRCRRROCRRCRIIHH var2 = this;
         Object var3 = var2.tailSet(var1).first();
         return this.unsafeCompare(var3, var1) == 0;
      } catch (ClassCastException | NoSuchElementException | NullPointerException var4) {
         return false;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @Override
   protected boolean standardRemove(@Nullable Object var1) {
      try {
         IHROCRRIRIROCCCRCRRROCRRCRIIHH var2 = this;
         Iterator var3 = var2.tailSet(var1).iterator();
         if (var3.hasNext()) {
            Object var4 = var3.next();
            if (this.unsafeCompare(var4, var1) == 0) {
               var3.remove();
               return true;
            }
         }

         return false;
      } catch (ClassCastException | NullPointerException var5) {
         return false;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected SortedSet<E> standardSubSet(E var1, E var2) {
      return this.tailSet((E)var1).headSet((E)var2);
   }
}
