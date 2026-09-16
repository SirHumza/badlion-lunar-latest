package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.AffineP;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cartesian;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cocartesian;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.function.Function;

public interface Affine<S, T, A, B> extends App2<Affine.Mu<A, B>, S, T>, Optic<AffineP.Mu, S, T, A, B> {
   static <S, T, A, B> Affine<S, T, A, B> unbox(App2<Affine.Mu<A, B>, S, T> var0) {
      return (Affine<S, T, A, B>)var0;
   }

   Either<T, A> preview(S var1);

   T set(B var1, S var2);

   default <P extends K2> FunctionType<App2<P, A, B>, App2<P, S, T>> eval(App<? extends AffineP.Mu, P> var1) {
      Cartesian var2 = Cartesian.unbox(var1);
      Cocartesian var3 = Cocartesian.unbox(var1);
      return var3x -> var2.dimap(
         var3.left(var2.rmap(var2.first(var3x), var1xx -> (B)this.set((B)var1xx.getFirst(), (S)var1xx.getSecond()))),
         var1xx -> this.preview(var1xx).map(Either::right, var1xxx -> Either.left(Pair.of(var1xxx, var1xx))),
         Either::unwrap
      );
   }

   final class Instance<A2, B2> implements AffineP<Affine.Mu<A2, B2>, AffineP.Mu> {
      @Override
      public <A, B, C, D> FunctionType<App2<Affine.Mu<A2, B2>, A, B>, App2<Affine.Mu<A2, B2>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> Optics.affine(
            var3 -> Affine.<S, T, A, B>unbox(var2x).preview((S)var1.apply(var3)).mapLeft(var2),
            (var3, var4) -> (T)var2.apply(Affine.<Object, T, A, Object>unbox(var2x).set(var3, var1.apply(var4)))
         );
      }

      @Override
      public <A, B, C> App2<Affine.Mu<A2, B2>, Pair<A, C>, Pair<B, C>> first(App2<Affine.Mu<A2, B2>, A, B> var1) {
         Affine var2 = Affine.unbox(var1);
         return Optics.affine(
            var1x -> var2.preview(var1x.getFirst()).mapBoth(var1xx -> (Pair<B, C>)Pair.of((B)var1xx, var1x.getSecond()), Function.identity()),
            (var1x, var2x) -> Pair.of((B)var2.set(var1x, var2x.getFirst()), var2x.getSecond())
         );
      }

      @Override
      public <A, B, C> App2<Affine.Mu<A2, B2>, Pair<C, A>, Pair<C, B>> second(App2<Affine.Mu<A2, B2>, A, B> var1) {
         Affine var2 = Affine.unbox(var1);
         return Optics.affine(
            var1x -> var2.preview(var1x.getSecond()).mapBoth(var1xx -> Pair.of((C)var1x.getFirst(), var1xx), Function.identity()),
            (var1x, var2x) -> (Pair<C, B>)Pair.of(var2x.getFirst(), var2.set(var1x, var2x.getSecond()))
         );
      }

      @Override
      public <A, B, C> App2<Affine.Mu<A2, B2>, Either<A, C>, Either<B, C>> left(App2<Affine.Mu<A2, B2>, A, B> var1) {
         Affine var2 = Affine.unbox(var1);
         return Optics.affine(
            var1x -> var1x.map(var1xx -> var2.preview(var1xx).mapLeft(Either::left), var0x -> Either.left(Either.right((C)var0x))),
            (var1x, var2x) -> var2x.map(var2xx -> Either.left((B)var2.set(var1x, var2xx)), Either::right)
         );
      }

      @Override
      public <A, B, C> App2<Affine.Mu<A2, B2>, Either<C, A>, Either<C, B>> right(App2<Affine.Mu<A2, B2>, A, B> var1) {
         Affine var2 = Affine.unbox(var1);
         return Optics.affine(
            var1x -> var1x.map(var0x -> Either.left(Either.left((C)var0x)), var1xx -> var2.preview(var1xx).mapLeft(Either::right)),
            (var1x, var2x) -> var2x.map(Either::left, var2xx -> Either.right((B)var2.set(var1x, var2xx)))
         );
      }
   }

   final class Mu<A, B> implements K2 {
   }
}
