package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.Profunctor;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Procompose<F extends K2, G extends K2, A, B, C> implements App2<Procompose.Mu<F, G>, A, B> {
   private final Supplier<App2<F, A, C>> first;
   private final App2<G, C, B> second;

   public Procompose(Supplier<App2<F, A, C>> var1, App2<G, C, B> var2) {
      this.first = var1;
      this.second = var2;
   }

   public static <F extends K2, G extends K2, A, B> Procompose<F, G, A, B, ?> unbox(App2<Procompose.Mu<F, G>, A, B> var0) {
      return (Procompose<F, G, A, B, ?>)var0;
   }

   public Supplier<App2<F, A, C>> first() {
      return this.first;
   }

   public App2<G, C, B> second() {
      return this.second;
   }

   public static final class Mu<F extends K2, G extends K2> implements K2 {
   }

   static final class ProfunctorInstance<F extends K2, G extends K2> implements Profunctor<Procompose.Mu<F, G>, Profunctor.Mu> {
      private final Profunctor<F, Profunctor.Mu> p1;
      private final Profunctor<G, Profunctor.Mu> p2;

      ProfunctorInstance(Profunctor<F, Profunctor.Mu> var1, Profunctor<G, Profunctor.Mu> var2) {
         this.p1 = var1;
         this.p2 = var2;
      }

      @Override
      public <A, B, C, D> FunctionType<App2<Procompose.Mu<F, G>, A, B>, App2<Procompose.Mu<F, G>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var3 -> this.cap(Procompose.unbox(var3), var1, var2);
      }

      private <A, B, C, D, E> App2<Procompose.Mu<F, G>, C, D> cap(Procompose<F, G, A, B, E> var1, Function<C, A> var2, Function<B, D> var3) {
         return new Procompose<>(
            () -> this.p1.<A, D, C, D>dimap(var2, Function.identity()).apply((App2<F, A, D>)var1.first.get()),
            this.p2.<D, B, D, D>dimap(Function.identity(), var3).apply((App2<G, D, B>)var1.second)
         );
      }
   }
}
