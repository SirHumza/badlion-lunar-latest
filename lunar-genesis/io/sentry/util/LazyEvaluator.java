package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class LazyEvaluator<T> {
   @Nullable
   private volatile T value = (T)null;
   @NotNull
   private final LazyEvaluator.Evaluator<T> evaluator;

   public LazyEvaluator(@NotNull LazyEvaluator.Evaluator<T> var1) {
      this.evaluator = var1;
   }

   @NotNull
   public T getValue() {
      if (this.value == null) {
         synchronized (this) {
            if (this.value == null) {
               this.value = this.evaluator.evaluate();
            }
         }
      }

      return this.value;
   }

   public void setValue(@Nullable T var1) {
      synchronized (this) {
         this.value = (T)var1;
      }
   }

   public void resetValue() {
      synchronized (this) {
         this.value = null;
      }
   }

   public interface Evaluator<T> {
      @NotNull
      T evaluate();
   }
}
