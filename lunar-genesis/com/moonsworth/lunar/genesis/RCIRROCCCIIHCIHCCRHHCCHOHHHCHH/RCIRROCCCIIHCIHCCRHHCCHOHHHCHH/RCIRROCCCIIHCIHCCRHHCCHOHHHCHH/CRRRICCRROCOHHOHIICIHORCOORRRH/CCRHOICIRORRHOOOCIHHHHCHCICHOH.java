package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class CCRHOICIRORRHOOOCIHHHHCHCICHOH<E> extends OOCHRIIIRIHRRCRIORHCROIIHCRRIC<E> implements CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> {
   protected CCRHOICIRORRHOOOCIHHHHCHCICHOH() {
   }

   protected abstract CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> CIHHORHICHHIRCRRIIROCIOCICIRCI();

   @Override
   public int count(Object var1) {
      return this.CIHHORHICHHIRCRRIIROCIOCICIRCI().count(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public int add(E var1, int var2) {
      return this.CIHHORHICHHIRCRRIIROCIOCICIRCI().add((E)var1, var2);
   }

   @CanIgnoreReturnValue
   @Override
   public int remove(Object var1, int var2) {
      return this.CIHHORHICHHIRCRRIIROCIOCICIRCI().remove(var1, var2);
   }

   @Override
   public Set<E> elementSet() {
      return this.CIHHORHICHHIRCRRIIROCIOCICIRCI().elementSet();
   }

   @Override
   public Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entrySet() {
      return this.CIHHORHICHHIRCRRIIROCIOCICIRCI().entrySet();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return var1 == this || this.CIHHORHICHHIRCRRIIROCIOCICIRCI().equals(var1);
   }

   @Override
   public int hashCode() {
      return this.CIHHORHICHHIRCRRIIROCIOCICIRCI().hashCode();
   }

   @CanIgnoreReturnValue
   @Override
   public int setCount(E var1, int var2) {
      return this.CIHHORHICHHIRCRRIIROCIOCICIRCI().setCount((E)var1, var2);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean setCount(E var1, int var2, int var3) {
      return this.CIHHORHICHHIRCRRIIROCIOCICIRCI().setCount((E)var1, var2, var3);
   }

   @Override
   protected boolean standardContains(@Nullable Object var1) {
      return this.count(var1) > 0;
   }

   @Override
   protected void standardClear() {
      HRCROCOHHHICRHIHHOOCIIRRRCCIRR.clear(this.entrySet().iterator());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected int standardCount(@Nullable Object var1) {
      for (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : this.entrySet()) {
         if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var3.getElement(), var1
         )) {
            return var3.getCount();
         }
      }

      return 0;
   }

   protected boolean standardAdd(E var1) {
      this.add((E)var1, 1);
      return true;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @Override
   protected boolean standardAddAll(Collection<? extends E> var1) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   @Override
   protected boolean standardRemove(Object var1) {
      return this.remove(var1, 1) > 0;
   }

   @Override
   protected boolean standardRemoveAll(Collection<?> var1) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this, var1);
   }

   @Override
   protected boolean standardRetainAll(Collection<?> var1) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this, var1);
   }

   protected int standardSetCount(E var1, int var2) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, (E)var1, var2);
   }

   protected boolean standardSetCount(E var1, int var2, int var3) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, (E)var1, var2, var3);
   }

   protected Iterator<E> standardIterator() {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
   }

   protected int standardSize() {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   protected boolean standardEquals(@Nullable Object var1) {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   protected int standardHashCode() {
      return this.entrySet().hashCode();
   }

   @Override
   protected String standardToString() {
      return this.entrySet().toString();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CCRIHCIIOOIOHIRCCHIICCRHIROORC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> OOIORIRHCHIIOOIRCRIRHRHIOIRROO() {
         return CCRHOICIRORRHOOOCIHHHHCHCICHOH.this;
      }

      @Override
      public Iterator<E> iterator() {
         return CCRIHCIIOOIOHIRCCHIICCRHIROORC.elementIterator(this.OOIORIRHCHIIOOIRCRIRHRHIOIRROO().entrySet().iterator());
      }
   }
}
