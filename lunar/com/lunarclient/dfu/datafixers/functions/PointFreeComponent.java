package com.lunarclient.dfu.datafixers.functions;

import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class PointFree<T> {
   private volatile boolean initialized;
   @Nullable
   private Function<DynamicOps<?>, T> value;

   public Function<DynamicOps<?>, T> evalCached() {
      if (!this.initialized) {
         synchronized (this) {
            if (!this.initialized) {
               this.value = this.eval();
               this.initialized = true;
            }
         }
      }

      return this.value;
   }

   public abstract Type<T> type();

   public abstract Function<DynamicOps<?>, T> eval();

   Optional<? extends PointFree<T>> all(PointFreeRule var1) {
      return Optional.of(this);
   }

   Optional<? extends PointFree<T>> one(PointFreeRule var1) {
      return Optional.empty();
   }

   @Override
   public final String toString() {
      return this.toString(0);
   }

   public static String indent(int var0) {
      return " ".repeat(var0);
   }

   public abstract String toString(int var1);
}
