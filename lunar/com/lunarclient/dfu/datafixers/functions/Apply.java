package com.lunarclient.dfu.datafixers.functions;

import com.lunarclient.dfu.datafixers.types.Func;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

final class Apply<A, B> extends PointFree<B> {
   protected final PointFree<Function<A, B>> func;
   protected final PointFree<A> arg;
   protected final Type<B> type;

   public Apply(PointFree<Function<A, B>> var1, PointFree<A> var2) {
      this(var1, var2, ((Func)var1.type()).second());
   }

   Apply(PointFree<Function<A, B>> var1, PointFree<A> var2, Type<B> var3) {
      this.func = var1;
      this.arg = var2;
      this.type = var3;
   }

   @Override
   public Function<DynamicOps<?>, B> eval() {
      return var1 -> this.func.evalCached().apply(var1).apply(this.arg.evalCached().apply(var1));
   }

   @Override
   public Type<B> type() {
      return this.type;
   }

   @Override
   public String toString(int var1) {
      return "(ap " + this.func.toString(var1 + 1) + "\n" + indent(var1 + 1) + this.arg.toString(var1 + 1) + "\n" + indent(var1) + ")";
   }

   @Override
   public Optional<? extends PointFree<B>> all(PointFreeRule var1) {
      PointFree var2 = var1.rewriteOrNop(this.func);
      PointFree var3 = var1.rewriteOrNop(this.arg);
      return var2 == this.func && var3 == this.arg ? Optional.of(this) : Optional.of(new Apply<>(var2, var3, this.type));
   }

   @Override
   public Optional<? extends PointFree<B>> one(PointFreeRule var1) {
      return var1.rewrite(this.func)
         .map(var1x -> new Apply<>((PointFree<Function<A, B>>)var1x, this.arg, this.type))
         .or(() -> var1.rewrite(this.arg).map(var1xx -> new Apply<>(this.func, (PointFree<A>)var1xx, this.type)));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Apply var2) ? false : Objects.equals(this.func, var2.func) && Objects.equals(this.arg, var2.arg);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.func.hashCode();
      return 31 * var1 + this.arg.hashCode();
   }
}
