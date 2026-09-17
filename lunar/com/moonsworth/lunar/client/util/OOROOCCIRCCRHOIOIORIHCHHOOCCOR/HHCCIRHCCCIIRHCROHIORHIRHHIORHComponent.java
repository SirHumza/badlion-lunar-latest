package com.moonsworth.lunar.client.util.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class CRRRICCRROCOHHOHIICIHORCOORRRH<T> implements HHCCIRHCCCIIRHCROHIORHIRHHIORH<T> {
   private final List<T> OHICCIIHCOORCHHHROHIRIHCCHHHRO;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(List<T> var1) {
      this.OHICCIIHCOORCHHHROHIRIHCCHHHRO = var1;
   }

   @NotNull
   @Override
   public Iterator<T> iterator() {
      return new Iterator<T>() {
         private int index = 0;

         @Override
         public boolean hasNext() {
            return CRRRICCRROCOHHOHIICIHORCOORRRH.this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.size() > this.index;
         }

         @Override
         public T next() {
            return !this.hasNext() ? null : CRRRICCRROCOHHOHIICIHORCOORRRH.this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.get(this.index++);
         }
      };
   }

   @Override
   public T get(int var1) {
      return this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.get(var1);
   }

   @NotNull
   @Override
   public ListIterator<T> listIterator() {
      return this.listIterator(0);
   }

   @NotNull
   @Override
   public ListIterator<T> listIterator(int var1) {
      return new ListIterator<T>() {
         private int index = 0;

         @Override
         public boolean hasNext() {
            return CRRRICCRROCOHHOHIICIHORCOORRRH.this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.size() > this.index;
         }

         @Override
         public T next() {
            return !this.hasNext() ? null : CRRRICCRROCOHHOHIICIHORCOORRRH.this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.get(this.index++);
         }

         @Override
         public boolean hasPrevious() {
            return this.index > 0;
         }

         @Override
         public T previous() {
            return !this.hasPrevious() ? null : CRRRICCRROCOHHOHIICIHORCOORRRH.this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.get(--this.index);
         }

         @Override
         public int nextIndex() {
            return this.index;
         }

         @Override
         public int previousIndex() {
            return this.index - 1;
         }

         @Override
         public void remove() {
            throw new UnsupportedOperationException("List is immutable!");
         }

         @Override
         public void set(T var1) {
            throw new UnsupportedOperationException("List is immutable!");
         }

         @Override
         public void add(T var1) {
            throw new UnsupportedOperationException("List is immutable!");
         }
      };
   }

   @NotNull
   @Override
   public List<T> subList(int var1, int var2) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHIHRRICIHORIHHIHHOIIOHHRCIIIH(this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.subList(var1, var2));
   }

   @Generated
   @Override
   public int size() {
      return this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.size();
   }

   @Generated
   @Override
   public boolean isEmpty() {
      return this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.isEmpty();
   }

   @Generated
   @Override
   public boolean contains(Object var1) {
      return this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.contains(var1);
   }

   @Generated
   @Override
   public Object[] toArray() {
      return this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.toArray();
   }

   @Generated
   @Override
   public <E> E[] toArray(E[] var1) {
      return (E[])this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.toArray(var1);
   }

   @Generated
   @Override
   public boolean containsAll(Collection<?> var1) {
      return this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.containsAll(var1);
   }

   @Generated
   @Override
   public int indexOf(Object var1) {
      return this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.indexOf(var1);
   }

   @Generated
   @Override
   public int lastIndexOf(Object var1) {
      return this.OHICCIIHCOORCHHHROHIRIHCCHHHRO.lastIndexOf(var1);
   }
}
