package com.lunarclient.dfu.datafixers.functions;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.templates.RecursivePoint;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Objects;
import java.util.function.Function;

final class In<A> extends PointFree<Function<A, A>> {
   protected final RecursivePoint.RecursivePointType<A> type;

   public In(RecursivePoint.RecursivePointType<A> var1) {
      this.type = var1;
   }

   @Override
   public Type<Function<A, A>> type() {
      return DSL.func(this.type.unfold(), this.type);
   }

   @Override
   public String toString(int var1) {
      return "In[" + this.type + "]";
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof In && Objects.equals(this.type, ((In)var1).type);
   }

   @Override
   public int hashCode() {
      return this.type.hashCode();
   }

   @Override
   public Function<DynamicOps<?>, Function<A, A>> eval() {
      return var0 -> Function.identity();
   }
}
