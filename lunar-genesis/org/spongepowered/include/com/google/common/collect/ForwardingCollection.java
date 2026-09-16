package org.spongepowered.include.com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
   protected ForwardingCollection() {
   }

   protected abstract Collection<E> delegate();

   @Override
   public Iterator<E> iterator() {
      return this.delegate().iterator();
   }

   @Override
   public int size() {
      return this.delegate().size();
   }

   @CanIgnoreReturnValue
   @Override
   public boolean removeAll(Collection<?> var1) {
      return this.delegate().removeAll(var1);
   }

   @Override
   public boolean isEmpty() {
      return this.delegate().isEmpty();
   }

   @Override
   public boolean contains(Object var1) {
      return this.delegate().contains(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean add(E var1) {
      return this.delegate().add((E)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean remove(Object var1) {
      return this.delegate().remove(var1);
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      return this.delegate().containsAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean addAll(Collection<? extends E> var1) {
      return this.delegate().addAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean retainAll(Collection<?> var1) {
      return this.delegate().retainAll(var1);
   }

   @Override
   public void clear() {
      this.delegate().clear();
   }

   @Override
   public Object[] toArray() {
      return this.delegate().toArray();
   }

   @CanIgnoreReturnValue
   @Override
   public <T> T[] toArray(T[] var1) {
      return (T[])this.delegate().toArray(var1);
   }
}
