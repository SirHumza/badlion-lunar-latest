package com.github.benmanes.caffeine.cache;

import org.checkerframework.checker.nullness.qual.Nullable;

final class WriteOrderDeque<E extends WriteOrderDeque.WriteOrder<E>> extends AbstractLinkedDeque<E> {
   @Override
   public boolean contains(Object var1) {
      return var1 instanceof WriteOrderDeque.WriteOrder && this.contains((WriteOrderDeque.WriteOrder<?>)var1);
   }

   boolean contains(WriteOrderDeque.WriteOrder<?> var1) {
      return var1.getPreviousInWriteOrder() != null || var1.getNextInWriteOrder() != null || var1 == this.first;
   }

   @Override
   public boolean remove(Object var1) {
      return var1 instanceof WriteOrderDeque.WriteOrder && this.remove((E)var1);
   }

   public boolean remove(E var1) {
      if (this.contains(var1)) {
         this.unlink((E)var1);
         return true;
      } else {
         return false;
      }
   }

   public @Nullable E getPrevious(E var1) {
      return (E)var1.getPreviousInWriteOrder();
   }

   public void setPrevious(E var1, @Nullable E var2) {
      var1.setPreviousInWriteOrder(var2);
   }

   public @Nullable E getNext(E var1) {
      return (E)var1.getNextInWriteOrder();
   }

   public void setNext(E var1, @Nullable E var2) {
      var1.setNextInWriteOrder(var2);
   }

   interface WriteOrder<T extends WriteOrderDeque.WriteOrder<T>> {
      @Nullable T getPreviousInWriteOrder();

      void setPreviousInWriteOrder(@Nullable T var1);

      @Nullable T getNextInWriteOrder();

      void setNextInWriteOrder(@Nullable T var1);
   }
}
