package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cocartesian;
import com.lunarclient.dfu.datafixers.util.Either;
import java.util.function.Function;

interface ReForgetE<R, A, B> extends App2<ReForgetE.Mu<R>, A, B> {
   static <R, A, B> ReForgetE<R, A, B> unbox(App2<ReForgetE.Mu<R>, A, B> var0) {
      return (ReForgetE<R, A, B>)var0;
   }

   B run(Either<A, R> var1);

   final class Instance<R> implements App<ReForgetE.Instance.Mu<R>, ReForgetE.Mu<R>>, Cocartesian<ReForgetE.Mu<R>, ReForgetE.Instance.Mu<R>> {
      @Override
      public <A, B, C, D> FunctionType<App2<ReForgetE.Mu<R>, A, B>, App2<ReForgetE.Mu<R>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> (App2<ReForgetE.Mu<R>, C, D>)Optics.reForgetE("dimap", var3 -> {
            Either var4 = var3.mapLeft(var1);
            Object var5 = ReForgetE.unbox(var2x).run(var4);
            return (B)var2.apply(var5);
         });
      }

      @Override
      public <A, B, C> App2<ReForgetE.Mu<R>, Either<A, C>, Either<B, C>> left(App2<ReForgetE.Mu<R>, A, B> var1) {
         ReForgetE var2 = ReForgetE.unbox(var1);
         return Optics.reForgetE(
            "left",
            var1x -> var1x.map(
               var1xx -> var1xx.map(var1xxx -> (Either<B, C>)Either.left((B)var2.run(Either.left(var1xxx))), Either::right),
               var1xx -> (Either<B, C>)Either.left((B)var2.run(Either.right((R)var1xx)))
            )
         );
      }

      @Override
      public <A, B, C> App2<ReForgetE.Mu<R>, Either<C, A>, Either<C, B>> right(App2<ReForgetE.Mu<R>, A, B> var1) {
         ReForgetE var2 = ReForgetE.unbox(var1);
         return Optics.reForgetE(
            "right",
            var1x -> var1x.map(
               var1xx -> var1xx.map(Either::left, var1xxx -> (Either<C, B>)Either.right(var2.run(Either.left(var1xxx)))),
               var1xx -> (Either<C, B>)Either.right(var2.run(Either.right((R)var1xx)))
            )
         );
      }

      static final class Mu<R> implements Cocartesian.Mu {
      }
   }

   final class Mu<R> implements K2 {
   }
}
