package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.AffineP;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface ReForgetC<R, A, B> extends App2<ReForgetC.Mu<R>, A, B> {
   static <R, A, B> ReForgetC<R, A, B> unbox(App2<ReForgetC.Mu<R>, A, B> var0) {
      return (ReForgetC<R, A, B>)var0;
   }

   Either<Function<R, B>, BiFunction<A, R, B>> impl();

   default B run(A var1, R var2) {
      return this.impl().map(var1x -> var1x.apply((R)var2), var2x -> var2x.apply((A)var1, (R)var2));
   }

   final class Instance<R> implements App<ReForgetC.Instance.Mu<R>, ReForgetC.Mu<R>>, AffineP<ReForgetC.Mu<R>, ReForgetC.Instance.Mu<R>> {
      @Override
      public <A, B, C, D> FunctionType<App2<ReForgetC.Mu<R>, A, B>, App2<ReForgetC.Mu<R>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> (App2<ReForgetC.Mu<R>, C, D>)Optics.reForgetC(
            "dimap",
            ReForgetC.unbox(var2x)
               .impl()
               .map(
                  var1xx -> Either.left(var2xx -> (B)var2.apply(var1xx.apply(var2xx))),
                  var2xx -> Either.right((var3, var4) -> (B)var2.apply(var2xx.apply(var1.apply(var3), var4)))
               )
         );
      }

      @Override
      public <A, B, C> App2<ReForgetC.Mu<R>, Pair<A, C>, Pair<B, C>> first(App2<ReForgetC.Mu<R>, A, B> var1) {
         return Optics.reForgetC(
            "first",
            ReForgetC.unbox(var1)
               .impl()
               .map(
                  var0 -> Either.right((var1x, var2) -> Pair.of((B)var0.apply(var2), var1x.getSecond())),
                  var0 -> Either.right((var1x, var2) -> Pair.of((B)var0.apply(var1x.getFirst(), var2), var1x.getSecond()))
               )
         );
      }

      @Override
      public <A, B, C> App2<ReForgetC.Mu<R>, Pair<C, A>, Pair<C, B>> second(App2<ReForgetC.Mu<R>, A, B> var1) {
         return Optics.reForgetC(
            "second",
            ReForgetC.unbox(var1)
               .impl()
               .map(
                  var0 -> Either.right((var1x, var2) -> Pair.of(var1x.getFirst(), (B)var0.apply(var2))),
                  var0 -> Either.right((var1x, var2) -> Pair.of(var1x.getFirst(), (B)var0.apply(var1x.getSecond(), var2)))
               )
         );
      }

      @Override
      public <A, B, C> App2<ReForgetC.Mu<R>, Either<A, C>, Either<B, C>> left(App2<ReForgetC.Mu<R>, A, B> var1) {
         return Optics.reForgetC(
            "left",
            ReForgetC.unbox(var1)
               .impl()
               .map(
                  var0 -> Either.left(var1x -> (Either<B, C>)Either.left((B)var0.apply(var1x))),
                  var0 -> Either.right((var1x, var2) -> var1x.mapLeft(var2x -> (B)var0.apply(var2x, var2)))
               )
         );
      }

      @Override
      public <A, B, C> App2<ReForgetC.Mu<R>, Either<C, A>, Either<C, B>> right(App2<ReForgetC.Mu<R>, A, B> var1) {
         return Optics.reForgetC(
            "right",
            ReForgetC.unbox(var1)
               .impl()
               .map(
                  var0 -> Either.left(var1x -> (Either<C, B>)Either.right(var0.apply(var1x))),
                  var0 -> Either.right((var1x, var2) -> var1x.mapRight(var2x -> (B)var0.apply(var2x, var2)))
               )
         );
      }

      public static final class Mu<R> implements AffineP.Mu {
      }
   }

   final class Mu<R> implements K2 {
   }
}
