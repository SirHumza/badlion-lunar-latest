package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class CORCOCICIRIOHROHROIIOOHICCHCRR<E> extends AbstractCollection<E> implements CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> {
   @LazyInit
   private transient @Nullable Set<E> elementSet;
   @LazyInit
   private transient @Nullable Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entrySet;

   @Override
   public boolean isEmpty() {
      return this.entrySet().isEmpty();
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      return this.count(var1) > 0;
   }

   @CanIgnoreReturnValue
   @Override
   public final boolean add(@Nullable E var1) {
      this.add((E)var1, 1);
      return true;
   }

   @CanIgnoreReturnValue
   @Override
   public int add(@Nullable E var1, int var2) {
      throw new UnsupportedOperationException();
   }

   @CanIgnoreReturnValue
   @Override
   public final boolean remove(@Nullable Object var1) {
      return this.remove(var1, 1) > 0;
   }

   @CanIgnoreReturnValue
   @Override
   public int remove(@Nullable Object var1, int var2) {
      throw new UnsupportedOperationException();
   }

   @CanIgnoreReturnValue
   @Override
   public int setCount(@Nullable E var1, int var2) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, (E)var1, var2);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean setCount(@Nullable E var1, int var2, int var3) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, (E)var1, var2, var3);
   }

   @CanIgnoreReturnValue
   @Override
   public final boolean addAll(Collection<? extends E> var1) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   @CanIgnoreReturnValue
   @Override
   public final boolean removeAll(Collection<?> var1) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this, var1);
   }

   @CanIgnoreReturnValue
   @Override
   public final boolean retainAll(Collection<?> var1) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this, var1);
   }

   @Override
   public abstract void clear();

   @Override
   public Set<E> elementSet() {
      Set var1 = this.elementSet;
      if (var1 == null) {
         this.elementSet = var1 = this.createElementSet();
      }

      return var1;
   }

   Set<E> createElementSet() {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   abstract Iterator<E> elementIterator();

   @Override
   public Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entrySet() {
      Set var1 = this.entrySet;
      if (var1 == null) {
         this.entrySet = var1 = this.createEntrySet();
      }

      return var1;
   }

   Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> createEntrySet() {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   }

   abstract Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entryIterator();

   abstract int distinctElements();

   @Override
   public final boolean equals(@Nullable Object var1) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   @Override
   public final int hashCode() {
      return this.entrySet().hashCode();
   }

   @Override
   public final String toString() {
      return this.entrySet().toString();
   }

   class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends CCRIHCIIOOIOHIRCCHIICCRHIROORC.CRRRICCRROCOHHOHIICIHORCOORRRH<E> {
      @Override
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> OOIORIRHCHIIOOIRCRIRHRHIOIRROO() {
         return CORCOCICIRIOHROHROIIOOHICCHCRR.this;
      }

      @Override
      public Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> iterator() {
         return CORCOCICIRIOHROHROIIOOHICCHCRR.this.entryIterator();
      }

      @Override
      public int size() {
         return CORCOCICIRIOHROHROIIOOHICCHCRR.this.distinctElements();
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CCRIHCIIOOIOHIRCCHIICCRHIROORC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> {
      @Override
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> OOIORIRHCHIIOOIRCRIRHRHIOIRROO() {
         return CORCOCICIRIOHROHROIIOOHICCHCRR.this;
      }

      @Override
      public Iterator<E> iterator() {
         return CORCOCICIRIOHROHROIIOOHICCHCRR.this.elementIterator();
      }
   }
}
