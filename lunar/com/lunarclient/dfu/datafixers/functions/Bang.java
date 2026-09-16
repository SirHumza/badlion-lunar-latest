package com.lunarclient.dfu.datafixers.functions;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.util.Unit;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.function.Function;

final class Bang<A> extends PointFree<Function<A, Unit>> {
   private final Type<A> type;

   Bang(Type<A> var1) {
      this.type = var1;
   }

   @Override
   public Type<Function<A, Unit>> type() {
      return DSL.func(this.type, DSL.emptyPartType());
   }

   @Override
   public String toString(int var1) {
      return "!";
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Bang var2 && this.type.equals(var2.type);
   }

   @Override
   public int hashCode() {
      return this.type.hashCode();
   }

   @Override
   public Function<DynamicOps<?>, Function<A, Unit>> eval() {
      return var0 -> var0x -> Unit.INSTANCE;
   }
}
