package org.spongepowered.include.com.google.common.collect;

import java.io.Serializable;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;

final class ReverseOrdering<T> extends Ordering<T> implements Serializable {
   final Ordering<? super T> forwardOrder;

   ReverseOrdering(Ordering<? super T> var1) {
      this.forwardOrder = Preconditions.checkNotNull(var1);
   }

   @Override
   public int compare(T var1, T var2) {
      return this.forwardOrder.compare((T)var2, (T)var1);
   }

   @Override
   public <S extends T> Ordering<S> reverse() {
      return this.forwardOrder;
   }

   @Override
   public int hashCode() {
      return -this.forwardOrder.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof ReverseOrdering) {
         ReverseOrdering var2 = (ReverseOrdering)var1;
         return this.forwardOrder.equals(var2.forwardOrder);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.forwardOrder + ".reverse()";
   }
}
