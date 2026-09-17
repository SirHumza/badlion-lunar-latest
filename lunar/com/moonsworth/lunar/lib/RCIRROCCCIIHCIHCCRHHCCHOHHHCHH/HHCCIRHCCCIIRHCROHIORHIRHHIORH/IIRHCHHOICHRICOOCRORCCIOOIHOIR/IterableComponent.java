package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CRRRICCRROCOHHOHIICIHORCOORRRH<T> implements Iterable<T>, Iterator<T> {
   private final T[] IIRICCCHICIORCIICIHRCCHROCIRCO;
   private int _index;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(T[] var1) {
      this.IIRICCCHICIORCIICIHRCCHROCIRCO = (T[])var1;
      this._index = 0;
   }

   @Override
   public boolean hasNext() {
      return this._index < this.IIRICCCHICIORCIICIHRCCHROCIRCO.length;
   }

   @Override
   public T next() {
      if (this._index >= this.IIRICCCHICIORCIICIHRCCHROCIRCO.length) {
         throw new NoSuchElementException();
      } else {
         return this.IIRICCCHICIORCIICIHRCCHROCIRCO[this._index++];
      }
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Iterator<T> iterator() {
      return this;
   }
}
