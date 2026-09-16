package com.github.benmanes.caffeine.cache;

import org.checkerframework.checker.nullness.qual.Nullable;

final class AccessOrderDeque<E extends AccessOrderDeque.AccessOrder<E>> extends AbstractLinkedDeque<E> {
   @Override
   public boolean contains(Object var1) {
      return var1 instanceof AccessOrderDeque.AccessOrder && this.contains((AccessOrderDeque.AccessOrder<?>)var1);
   }

   boolean contains(AccessOrderDeque.AccessOrder<?> var1) {
      return var1.getPreviousInAccessOrder() != null || var1.getNextInAccessOrder() != null || var1 == this.first;
   }

   @Override
   public boolean remove(Object var1) {
      return var1 instanceof AccessOrderDeque.AccessOrder && this.remove((E)var1);
   }

   boolean remove(E var1) {
      if (this.contains(var1)) {
         this.unlink((E)var1);
         return true;
      } else {
         return false;
      }
   }

   public @Nullable E getPrevious(E var1) {
      return (E)var1.getPreviousInAccessOrder();
   }

   public void setPrevious(E var1, @Nullable E var2) {
      var1.setPreviousInAccessOrder(var2);
   }

   public @Nullable E getNext(E var1) {
      return (E)var1.getNextInAccessOrder();
   }

   public void setNext(E var1, @Nullable E var2) {
      var1.setNextInAccessOrder(var2);
   }

   interface AccessOrder<T extends AccessOrderDeque.AccessOrder<T>> {
      @Nullable T getPreviousInAccessOrder();

      void setPreviousInAccessOrder(@Nullable T var1);

      @Nullable T getNextInAccessOrder();

      void setNextInAccessOrder(@Nullable T var1);
   }
}
