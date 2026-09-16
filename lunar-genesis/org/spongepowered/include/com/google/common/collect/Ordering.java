package org.spongepowered.include.com.google.common.collect;

import java.util.Comparator;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Function;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public abstract class Ordering<T> implements Comparator<T> {
   public static <T> Ordering<T> from(Comparator<T> var0) {
      return var0 instanceof Ordering ? (Ordering)var0 : new ComparatorOrdering<>(var0);
   }

   protected Ordering() {
   }

   public <S extends T> Ordering<S> reverse() {
      return new ReverseOrdering<>(this);
   }

   public <F> Ordering<F> onResultOf(Function<F, ? extends T> var1) {
      return new ByFunctionOrdering<>(var1, this);
   }

   @CanIgnoreReturnValue
   @Override
   public abstract int compare(@Nullable T var1, @Nullable T var2);
}
