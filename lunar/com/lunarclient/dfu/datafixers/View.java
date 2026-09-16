package com.lunarclient.dfu.datafixers;

import com.lunarclient.dfu.datafixers.functions.Functions;
import com.lunarclient.dfu.datafixers.functions.PointFree;
import com.lunarclient.dfu.datafixers.functions.PointFreeRule;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.types.Func;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.Function;

public record View<A, B>() implements App2<View.Mu, A, B> {
   private final PointFree<Function<A, B>> function;

   public View(PointFree<Function<A, B>> var1) {
      this.function = var1;
   }

   static <A, B> View<A, B> unbox(App2<View.Mu, A, B> var0) {
      return (View<A, B>)var0;
   }

   public static <A> View<A, A> nopView(Type<A> var0) {
      return new View<>(Functions.id(var0));
   }

   public Type<A> type() {
      return ((Func)this.funcType()).first();
   }

   public Type<B> newType() {
      return ((Func)this.funcType()).second();
   }

   public Type<Function<A, B>> funcType() {
      return this.function.type();
   }

   @Override
   public String toString() {
      return "View[" + this.function + "," + this.newType() + "]";
   }

   public Optional<? extends View<A, B>> rewrite(PointFreeRule var1) {
      return var1.rewrite(this.function()).map(View::new);
   }

   public View<A, B> rewriteOrNop(PointFreeRule var1) {
      return DataFixUtils.orElse(this.rewrite(var1), this);
   }

   public <C> View<A, C> flatMap(Function<Type<B>, View<B, C>> var1) {
      View var2 = (View)var1.apply(this.newType());
      return new View<>(Functions.comp(var2.function(), this.function()));
   }

   public static <A, B> View<A, B> create(PointFree<Function<A, B>> var0) {
      return new View<>(var0);
   }

   public static <A, B> View<A, B> create(String var0, Type<A> var1, Type<B> var2, Function<DynamicOps<?>, Function<A, B>> var3) {
      return new View<>(Functions.fun(var0, var3, var1, var2));
   }

   public <C> View<C, B> compose(View<C, A> var1) {
      if (this.isNop()) {
         return (View<C, B>)(new View<>(var1.function()));
      } else {
         return (View<C, B>)(var1.isNop() ? new View<>(this.function()) : new View<>(Functions.comp(this.function(), var1.function())));
      }
   }

   public boolean isNop() {
      return Functions.isId(this.function());
   }

   static final class Mu implements K2 {
   }
}
