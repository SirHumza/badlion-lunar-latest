package org.objectweb.asm.tree.analysis;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class SmallSet<T> extends AbstractSet<T> {
   private final T element1;
   private final T element2;

   SmallSet() {
      this.element1 = null;
      this.element2 = null;
   }

   SmallSet(T var1) {
      this.element1 = (T)var1;
      this.element2 = null;
   }

   private SmallSet(T var1, T var2) {
      this.element1 = (T)var1;
      this.element2 = (T)var2;
   }

   @Override
   public Iterator<T> iterator() {
      return new SmallSet.IteratorImpl<>(this.element1, this.element2);
   }

   @Override
   public int size() {
      if (this.element1 == null) {
         return 0;
      } else {
         return this.element2 == null ? 1 : 2;
      }
   }

   Set<T> union(SmallSet<T> var1) {
      if ((var1.element1 != this.element1 || var1.element2 != this.element2) && (var1.element1 != this.element2 || var1.element2 != this.element1)) {
         if (var1.element1 == null) {
            return this;
         }

         if (this.element1 == null) {
            return var1;
         }

         if (var1.element2 == null) {
            if (this.element2 == null) {
               return new SmallSet<>(this.element1, var1.element1);
            }

            if (var1.element1 == this.element1 || var1.element1 == this.element2) {
               return this;
            }
         }

         if (this.element2 != null || this.element1 != var1.element1 && this.element1 != var1.element2) {
            HashSet var2 = new HashSet(4);
            var2.add(this.element1);
            if (this.element2 != null) {
               var2.add(this.element2);
            }

            var2.add(var1.element1);
            if (var1.element2 != null) {
               var2.add(var1.element2);
            }

            return var2;
         } else {
            return var1;
         }
      } else {
         return this;
      }
   }

   static class IteratorImpl<T> implements Iterator<T> {
      private T firstElement;
      private T secondElement;

      IteratorImpl(T var1, T var2) {
         this.firstElement = (T)var1;
         this.secondElement = (T)var2;
      }

      @Override
      public boolean hasNext() {
         return this.firstElement != null;
      }

      @Override
      public T next() {
         if (this.firstElement == null) {
            throw new NoSuchElementException();
         }

         Object var1 = this.firstElement;
         this.firstElement = this.secondElement;
         this.secondElement = null;
         return (T)var1;
      }

      @Override
      public void remove() {
         throw new UnsupportedOperationException();
      }
   }
}
