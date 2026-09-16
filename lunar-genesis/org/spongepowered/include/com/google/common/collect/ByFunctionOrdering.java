package org.spongepowered.include.com.google.common.collect;

import java.io.Serializable;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Function;
import org.spongepowered.include.com.google.common.base.Objects;
import org.spongepowered.include.com.google.common.base.Preconditions;

final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
   final Function<F, ? extends T> function;
   final Ordering<T> ordering;

   ByFunctionOrdering(Function<F, ? extends T> var1, Ordering<T> var2) {
      this.function = Preconditions.checkNotNull(var1);
      this.ordering = Preconditions.checkNotNull(var2);
   }

   @Override
   public int compare(F var1, F var2) {
      return this.ordering.compare((T)this.function.apply((F)var1), (T)this.function.apply((F)var2));
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ByFunctionOrdering)) {
         return false;
      }

      ByFunctionOrdering var2 = (ByFunctionOrdering)var1;
      return this.function.equals(var2.function) && this.ordering.equals(var2.ordering);
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.function, this.ordering);
   }

   @Override
   public String toString() {
      return this.ordering + ".onResultOf(" + this.function + ")";
   }
}
