package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.AffineP;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.function.Function;

interface ReForgetEP<R, A, B> extends App2<ReForgetEP.Mu<R>, A, B> {
   static <R, A, B> ReForgetEP<R, A, B> unbox(App2<ReForgetEP.Mu<R>, A, B> var0) {
      return (ReForgetEP<R, A, B>)var0;
   }

   B run(Either<A, Pair<A, R>> var1);

   final class Instance<R> implements App<ReForgetEP.Instance.Mu<R>, ReForgetEP.Mu<R>>, AffineP<ReForgetEP.Mu<R>, ReForgetEP.Instance.Mu<R>> {
      @Override
      public <A, B, C, D> FunctionType<App2<ReForgetEP.Mu<R>, A, B>, App2<ReForgetEP.Mu<R>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> (App2<ReForgetEP.Mu<R>, C, D>)Optics.reForgetEP("dimap", var3 -> {
            Either var4 = var3.mapBoth(var1, var1xxx -> Pair.of(var1.apply(var1xxx.getFirst()), var1xxx.getSecond()));
            Object var5 = ReForgetEP.unbox(var2x).run(var4);
            return (B)var2.apply(var5);
         });
      }

      @Override
      public <A, B, C> App2<ReForgetEP.Mu<R>, Either<A, C>, Either<B, C>> left(App2<ReForgetEP.Mu<R>, A, B> var1) {
         ReForgetEP var2 = ReForgetEP.unbox(var1);
         return Optics.reForgetEP(
            "left",
            var1x -> var1x.map(
               var1xx -> var1xx.mapLeft(var1xxx -> (B)var2.run(Either.left((A)var1xxx))),
               var1xx -> var1xx.getFirst().mapLeft(var2x -> (B)var2.run(Either.right(Pair.of((A)var2x, var1xx.getSecond()))))
            )
         );
      }

      @Override
      public <A, B, C> App2<ReForgetEP.Mu<R>, Either<C, A>, Either<C, B>> right(App2<ReForgetEP.Mu<R>, A, B> var1) {
         ReForgetEP var2 = ReForgetEP.unbox(var1);
         return Optics.reForgetEP(
            "right",
            var1x -> var1x.map(
               var1xx -> var1xx.mapRight(var1xxx -> (B)var2.run(Either.left((A)var1xxx))),
               var1xx -> var1xx.getFirst().mapRight(var2x -> (B)var2.run(Either.right(Pair.of((A)var2x, var1xx.getSecond()))))
            )
         );
      }

      @Override
      public <A, B, C> App2<ReForgetEP.Mu<R>, Pair<A, C>, Pair<B, C>> first(App2<ReForgetEP.Mu<R>, A, B> var1) {
         ReForgetEP var2 = ReForgetEP.unbox(var1);
         return Optics.reForgetEP(
            "first",
            var1x -> var1x.map(
               var1xx -> Pair.of((B)var2.run(Either.left(var1xx.getFirst())), var1xx.getSecond()),
               var1xx -> Pair.of((B)var2.run(Either.right(Pair.of(var1xx.getFirst().getFirst(), var1xx.getSecond()))), var1xx.getFirst().getSecond())
            )
         );
      }

      @Override
      public <A, B, C> App2<ReForgetEP.Mu<R>, Pair<C, A>, Pair<C, B>> second(App2<ReForgetEP.Mu<R>, A, B> var1) {
         ReForgetEP var2 = ReForgetEP.unbox(var1);
         return Optics.reForgetEP(
            "second",
            var1x -> var1x.map(
               var1xx -> Pair.of(var1xx.getFirst(), (B)var2.run(Either.left(var1xx.getSecond()))),
               var1xx -> Pair.of(var1xx.getFirst().getFirst(), (B)var2.run(Either.right(Pair.of(var1xx.getFirst().getSecond(), var1xx.getSecond()))))
            )
         );
      }

      static final class Mu<R> implements AffineP.Mu {
      }
   }

   final class Mu<R> implements K2 {
   }
}
