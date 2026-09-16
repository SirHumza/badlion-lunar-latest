package org.spongepowered.include.com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Preconditions;

final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {
   final Comparator<T> comparator;

   ComparatorOrdering(Comparator<T> var1) {
      this.comparator = Preconditions.checkNotNull(var1);
   }

   @Override
   public int compare(T var1, T var2) {
      return this.comparator.compare((T)var1, (T)var2);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof ComparatorOrdering) {
         ComparatorOrdering var2 = (ComparatorOrdering)var1;
         return this.comparator.equals(var2.comparator);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.comparator.hashCode();
   }

   @Override
   public String toString() {
      return this.comparator.toString();
   }
}
