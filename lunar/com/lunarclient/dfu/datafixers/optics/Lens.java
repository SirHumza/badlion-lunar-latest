package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cartesian;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.function.Function;

public interface Lens<S, T, A, B> extends App2<Lens.Mu<A, B>, S, T>, Optic<Cartesian.Mu, S, T, A, B> {
   static <S, T, A, B> Lens<S, T, A, B> unbox(App2<Lens.Mu<A, B>, S, T> var0) {
      return (Lens<S, T, A, B>)var0;
   }

   static <S, T, A, B> Lens<S, T, A, B> unbox2(App2<Lens.Mu2<S, T>, B, A> var0) {
      return ((Lens.Box)var0).lens;
   }

   static <S, T, A, B> App2<Lens.Mu2<S, T>, B, A> box(Lens<S, T, A, B> var0) {
      return new Lens.Box<>(var0);
   }

   A view(S var1);

   T update(B var1, S var2);

   default <P extends K2> FunctionType<App2<P, A, B>, App2<P, S, T>> eval(App<? extends Cartesian.Mu, P> var1) {
      Cartesian var2 = Cartesian.unbox(var1);
      return var2x -> var2.dimap(
         var2.first(var2x), var1xx -> Pair.of(this.view(var1xx), var1xx), var1xx -> this.update((B)var1xx.getFirst(), (S)var1xx.getSecond())
      );
   }

   final class Box<S, T, A, B> implements App2<Lens.Mu2<S, T>, B, A> {
      private final Lens<S, T, A, B> lens;

      public Box(Lens<S, T, A, B> var1) {
         this.lens = var1;
      }
   }

   final class Instance<A2, B2> implements Cartesian<Lens.Mu<A2, B2>, Cartesian.Mu> {
      @Override
      public <A, B, C, D> FunctionType<App2<Lens.Mu<A2, B2>, A, B>, App2<Lens.Mu<A2, B2>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> Optics.lens(
            var2xx -> Lens.<S, T, A, B>unbox(var2x).view((S)var1.apply(var2xx)),
            (var3, var4) -> (T)var2.apply(Lens.<Object, T, A, Object>unbox(var2x).update(var3, var1.apply(var4)))
         );
      }

      @Override
      public <A, B, C> App2<Lens.Mu<A2, B2>, Pair<A, C>, Pair<B, C>> first(App2<Lens.Mu<A2, B2>, A, B> var1) {
         return Optics.lens(
            var1x -> Lens.<S, T, A, B>unbox(var1).view((S)var1x.getFirst()),
            (var1x, var2) -> Pair.of(Lens.<S, B, A, B>unbox(var1).update((B)var1x, (S)var2.getFirst()), var2.getSecond())
         );
      }

      @Override
      public <A, B, C> App2<Lens.Mu<A2, B2>, Pair<C, A>, Pair<C, B>> second(App2<Lens.Mu<A2, B2>, A, B> var1) {
         return Optics.lens(
            var1x -> Lens.<S, T, A, B>unbox(var1).view((S)var1x.getSecond()),
            (var1x, var2) -> (Pair<C, B>)Pair.of(var2.getFirst(), Lens.<A, T, A, Object>unbox(var1).update(var1x, var2.getSecond()))
         );
      }
   }

   final class Mu<A, B> implements K2 {
   }

   final class Mu2<S, T> implements K2 {
   }
}
