package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cocartesian;
import com.lunarclient.dfu.datafixers.util.Either;
import java.util.function.Function;

public interface Prism<S, T, A, B> extends App2<Prism.Mu<A, B>, S, T>, Optic<Cocartesian.Mu, S, T, A, B> {
   static <S, T, A, B> Prism<S, T, A, B> unbox(App2<Prism.Mu<A, B>, S, T> var0) {
      return (Prism<S, T, A, B>)var0;
   }

   Either<T, A> match(S var1);

   T build(B var1);

   default <P extends K2> FunctionType<App2<P, A, B>, App2<P, S, T>> eval(App<? extends Cocartesian.Mu, P> var1) {
      Cocartesian var2 = Cocartesian.unbox(var1);
      return var2x -> var2.dimap(var2.right(var2x), this::match, var1xx -> var1xx.map(Function.identity(), this::build));
   }

   final class Instance<A2, B2> implements Cocartesian<Prism.Mu<A2, B2>, Cocartesian.Mu> {
      @Override
      public <A, B, C, D> FunctionType<App2<Prism.Mu<A2, B2>, A, B>, App2<Prism.Mu<A2, B2>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> Optics.prism(
            var3 -> Prism.<S, T, A, B>unbox(var2x).match((S)var1.apply(var3)).mapLeft(var2),
            var2xx -> (T)var2.apply(Prism.<S, T, A, Object>unbox(var2x).build(var2xx))
         );
      }

      @Override
      public <A, B, C> App2<Prism.Mu<A2, B2>, Either<A, C>, Either<B, C>> left(App2<Prism.Mu<A2, B2>, A, B> var1) {
         Prism var2 = Prism.unbox(var1);
         return Optics.prism(
            var1x -> var1x.map(var1xx -> var2.match(var1xx).mapLeft(Either::left), var0x -> Either.left(Either.right((C)var0x))),
            var1x -> Either.left((B)var2.build(var1x))
         );
      }

      @Override
      public <A, B, C> App2<Prism.Mu<A2, B2>, Either<C, A>, Either<C, B>> right(App2<Prism.Mu<A2, B2>, A, B> var1) {
         Prism var2 = Prism.unbox(var1);
         return Optics.prism(
            var1x -> var1x.map(var0x -> Either.left(Either.left((C)var0x)), var1xx -> var2.match(var1xx).mapLeft(Either::right)),
            var1x -> Either.right((B)var2.build(var1x))
         );
      }
   }

   final class Mu<A, B> implements K2 {
   }
}
