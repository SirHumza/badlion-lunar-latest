package com.lunarclient.dfu.datafixers.functions;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Objects;
import java.util.function.Function;

final class FunctionWrapper<A, B> extends PointFree<Function<A, B>> {
   private final String name;
   protected final Function<DynamicOps<?>, Function<A, B>> fun;
   private final Type<Function<A, B>> type;

   FunctionWrapper(String var1, Function<DynamicOps<?>, Function<A, B>> var2, Type<A> var3, Type<B> var4) {
      this.name = var1;
      this.fun = var2;
      this.type = DSL.func(var3, var4);
   }

   @Override
   public Type<Function<A, B>> type() {
      return this.type;
   }

   @Override
   public String toString(int var1) {
      return "fun[" + this.name + "]";
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         FunctionWrapper var2 = (FunctionWrapper)var1;
         return Objects.equals(this.fun, var2.fun) && Objects.equals(this.type, var2.type);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.fun.hashCode();
   }

   @Override
   public Function<DynamicOps<?>, Function<A, B>> eval() {
      return this.fun;
   }
}
