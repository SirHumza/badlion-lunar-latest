package com.lunarclient.dfu.datafixers.functions;

import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.function.Function;

final class Id<A> extends PointFree<Function<A, A>> {
   private final Type<Function<A, A>> type;

   Id(Type<Function<A, A>> var1) {
      this.type = var1;
   }

   @Override
   public Type<Function<A, A>> type() {
      return this.type;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Id var2 && this.type.equals(var2.type);
   }

   @Override
   public int hashCode() {
      return this.type.hashCode();
   }

   @Override
   public String toString(int var1) {
      return "id";
   }

   @Override
   public Function<DynamicOps<?>, Function<A, A>> eval() {
      return var0 -> Function.identity();
   }
}
