package org.jgrapht.util;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public class UnmodifiableUnionSet<E> extends AbstractSet<E> implements Serializable {
   private static final long serialVersionUID = -1937327799873331354L;
   private final Set<E> first;
   private final Set<E> second;

   public UnmodifiableUnionSet(Set<E> var1, Set<E> var2) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      this.first = var1;
      this.second = var2;
   }

   @Override
   public Iterator<E> iterator() {
      return new UnmodifiableUnionSet.UnionIterator(this.orderSetsBySize());
   }

   @Override
   public int size() {
      UnmodifiableUnionSet.SetSizeOrdering var1 = this.orderSetsBySize();
      Set var2 = var1.bigger;
      int var3 = var1.biggerSize;

      for (Object var5 : var1.smaller) {
         if (!var2.contains(var5)) {
            var3++;
         }
      }

      return var3;
   }

   @Override
   public boolean contains(Object var1) {
      return this.first.contains(var1) || this.second.contains(var1);
   }

   private UnmodifiableUnionSet<E>.SetSizeOrdering orderSetsBySize() {
      int var1 = this.first.size();
      int var2 = this.second.size();
      return var2 > var1
         ? new UnmodifiableUnionSet.SetSizeOrdering(this.second, this.first, var2, var1)
         : new UnmodifiableUnionSet.SetSizeOrdering(this.first, this.second, var1, var2);
   }

   private class SetSizeOrdering {
      final Set<E> bigger;
      final Set<E> smaller;
      final int biggerSize;
      final int smallerSize;

      SetSizeOrdering(Set<E> var2, Set<E> var3, int var4, int var5) {
         this.bigger = var2;
         this.smaller = var3;
         this.biggerSize = var4;
         this.smallerSize = var5;
      }
   }

   private class UnionIterator implements Iterator<E> {
      private UnmodifiableUnionSet<E>.SetSizeOrdering ordering;
      private boolean inBiggerSet;
      private Iterator<E> iterator;
      private Object cur;

      UnionIterator(UnmodifiableUnionSet<E>.SetSizeOrdering var2) {
         this.ordering = var2;
         this.inBiggerSet = true;
         this.iterator = var2.bigger.iterator();
         this.cur = this.prefetch();
      }

      @Override
      public boolean hasNext() {
         return this.cur != null ? true : (this.cur = this.prefetch()) != null;
      }

      @Override
      public E next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         Object var1 = this.cur;
         this.cur = null;
         return (E)var1;
      }

      private E prefetch() {
         while (true) {
            if (this.inBiggerSet) {
               if (this.iterator.hasNext()) {
                  return this.iterator.next();
               }

               this.inBiggerSet = false;
               this.iterator = this.ordering.smaller.iterator();
            } else {
               if (this.iterator.hasNext()) {
                  Object var1 = this.iterator.next();
                  if (this.ordering.bigger.contains(var1)) {
                     continue;
                  }

                  return (E)var1;
               }

               return null;
            }
         }
      }
   }
}
