package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.AffineP;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.function.Function;

interface ForgetE<R, A, B> extends App2<ForgetE.Mu<R>, A, B> {
   static <R, A, B> ForgetE<R, A, B> unbox(App2<ForgetE.Mu<R>, A, B> var0) {
      return (ForgetE<R, A, B>)var0;
   }

   Either<B, R> run(A var1);

   final class Instance<R> implements App<ForgetE.Instance.Mu<R>, ForgetE.Mu<R>>, AffineP<ForgetE.Mu<R>, ForgetE.Instance.Mu<R>> {
      @Override
      public <A, B, C, D> FunctionType<App2<ForgetE.Mu<R>, A, B>, App2<ForgetE.Mu<R>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> (App2<ForgetE.Mu<R>, C, D>)Optics.forgetE(var3 -> ForgetE.<R, A, B>unbox(var2x).run((A)var1.apply(var3)).mapLeft(var2));
      }

      @Override
      public <A, B, C> App2<ForgetE.Mu<R>, Pair<A, C>, Pair<B, C>> first(App2<ForgetE.Mu<R>, A, B> var1) {
         return Optics.forgetE(var1x -> ForgetE.<R, A, B>unbox(var1).run(var1x.getFirst()).mapLeft(var1xx -> Pair.of((B)var1xx, (C)var1x.getSecond())));
      }

      @Override
      public <A, B, C> App2<ForgetE.Mu<R>, Pair<C, A>, Pair<C, B>> second(App2<ForgetE.Mu<R>, A, B> var1) {
         return Optics.forgetE(var1x -> ForgetE.<R, A, B>unbox(var1).run(var1x.getSecond()).mapLeft(var1xx -> Pair.of((C)var1x.getFirst(), (B)var1xx)));
      }

      @Override
      public <A, B, C> App2<ForgetE.Mu<R>, Either<A, C>, Either<B, C>> left(App2<ForgetE.Mu<R>, A, B> var1) {
         return Optics.forgetE(
            var1x -> var1x.map(
               var1xx -> ForgetE.<R, A, B>unbox(var1).run((A)var1xx).mapLeft(Either::left), var0x -> Either.left((Either<B, C>)Either.right(var0x))
            )
         );
      }

      @Override
      public <A, B, C> App2<ForgetE.Mu<R>, Either<C, A>, Either<C, B>> right(App2<ForgetE.Mu<R>, A, B> var1) {
         return Optics.forgetE(
            var1x -> var1x.map(
               var0x -> Either.left((Either<C, B>)Either.left((C)var0x)), var1xx -> ForgetE.<R, A, B>unbox(var1).run((A)var1xx).mapLeft(Either::right)
            )
         );
      }

      static final class Mu<R> implements AffineP.Mu {
      }
   }

   final class Mu<R> implements K2 {
   }
}
