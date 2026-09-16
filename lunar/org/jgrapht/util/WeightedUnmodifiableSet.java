package org.jgrapht.util;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class WeightedUnmodifiableSet<E> extends AbstractSet<E> implements Serializable {
   private static final long serialVersionUID = -5913435131882975869L;
   public final Set<E> backingSet;
   public final double weight;

   public WeightedUnmodifiableSet(Set<E> var1) {
      this.backingSet = var1;
      this.weight = var1.size();
   }

   public WeightedUnmodifiableSet(Set<E> var1, double var2) {
      this.backingSet = var1;
      this.weight = var2;
   }

   public double getWeight() {
      return this.weight;
   }

   @Override
   public int size() {
      return this.backingSet.size();
   }

   @Override
   public boolean isEmpty() {
      return this.backingSet.isEmpty();
   }

   @Override
   public boolean contains(Object var1) {
      return this.backingSet.contains(var1);
   }

   @Override
   public Iterator<E> iterator() {
      return this.backingSet.iterator();
   }

   @Override
   public Object[] toArray() {
      return this.backingSet.toArray();
   }

   @Override
   public <T> T[] toArray(T[] var1) {
      return (T[])this.backingSet.toArray(var1);
   }

   @Override
   public boolean add(E var1) {
      throw new UnsupportedOperationException("This set is unmodifiable");
   }

   @Override
   public boolean remove(Object var1) {
      throw new UnsupportedOperationException("This set is unmodifiable");
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      return this.backingSet.containsAll(var1);
   }

   @Override
   public boolean addAll(Collection<? extends E> var1) {
      throw new UnsupportedOperationException("This set is unmodifiable");
   }

   @Override
   public boolean retainAll(Collection<?> var1) {
      throw new UnsupportedOperationException("This set is unmodifiable");
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      throw new UnsupportedOperationException("This set is unmodifiable");
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException("This set is unmodifiable");
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof WeightedUnmodifiableSet)) {
         return false;
      }

      WeightedUnmodifiableSet var2 = (WeightedUnmodifiableSet)var1;
      return this.backingSet.equals(var2.backingSet);
   }

   @Override
   public int hashCode() {
      return this.backingSet.hashCode();
   }
}
