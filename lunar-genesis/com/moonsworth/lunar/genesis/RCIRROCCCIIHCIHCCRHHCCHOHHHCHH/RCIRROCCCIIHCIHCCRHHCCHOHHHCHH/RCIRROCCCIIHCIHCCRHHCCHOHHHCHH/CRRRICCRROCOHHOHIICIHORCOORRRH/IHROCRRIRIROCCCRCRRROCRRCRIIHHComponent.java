package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class OCIIROIOORRIOIIIRHIRRCCIIRRROH<E> extends IHROCRRIRIROCCCRCRRROCRRCRIIHH<E> implements NavigableSet<E> {
   protected OCIIROIOORRIOIIIRHIRRCCIIRRROH() {
   }

   protected abstract NavigableSet<E> delegate();

   @Override
   public E lower(E var1) {
      return this.delegate().lower((E)var1);
   }

   protected E standardLower(E var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getNext(this.headSet((E)var1, false).descendingIterator(), null);
   }

   @Override
   public E floor(E var1) {
      return this.delegate().floor((E)var1);
   }

   protected E standardFloor(E var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getNext(this.headSet((E)var1, true).descendingIterator(), null);
   }

   @Override
   public E ceiling(E var1) {
      return this.delegate().ceiling((E)var1);
   }

   protected E standardCeiling(E var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getNext(this.tailSet((E)var1, true).iterator(), null);
   }

   @Override
   public E higher(E var1) {
      return this.delegate().higher((E)var1);
   }

   protected E standardHigher(E var1) {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getNext(this.tailSet((E)var1, false).iterator(), null);
   }

   @Override
   public E pollFirst() {
      return this.delegate().pollFirst();
   }

   protected E standardPollFirst() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.iterator());
   }

   @Override
   public E pollLast() {
      return this.delegate().pollLast();
   }

   protected E standardPollLast() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.descendingIterator());
   }

   protected E standardFirst() {
      return this.iterator().next();
   }

   protected E standardLast() {
      return this.descendingIterator().next();
   }

   @Override
   public NavigableSet<E> descendingSet() {
      return this.delegate().descendingSet();
   }

   @Override
   public Iterator<E> descendingIterator() {
      return this.delegate().descendingIterator();
   }

   @Override
   public NavigableSet<E> subSet(E var1, boolean var2, E var3, boolean var4) {
      return this.delegate().subSet((E)var1, var2, (E)var3, var4);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected NavigableSet<E> standardSubSet(E var1, boolean var2, E var3, boolean var4) {
      return this.tailSet((E)var1, var2).headSet((E)var3, var4);
   }

   @Override
   protected SortedSet<E> standardSubSet(E var1, E var2) {
      return this.subSet((E)var1, true, (E)var2, false);
   }

   @Override
   public NavigableSet<E> headSet(E var1, boolean var2) {
      return this.delegate().headSet((E)var1, var2);
   }

   protected SortedSet<E> standardHeadSet(E var1) {
      return this.headSet((E)var1, false);
   }

   @Override
   public NavigableSet<E> tailSet(E var1, boolean var2) {
      return this.delegate().tailSet((E)var1, var2);
   }

   protected SortedSet<E> standardTailSet(E var1) {
      return this.tailSet((E)var1, true);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(OCIIROIOORRIOIIIRHIRRCCIIRRROH.this);
      }
   }
}
