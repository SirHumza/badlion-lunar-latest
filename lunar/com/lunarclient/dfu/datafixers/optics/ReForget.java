package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cocartesian;
import com.lunarclient.dfu.datafixers.optics.profunctors.ReCartesian;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.function.Function;

interface ReForget<R, A, B> extends App2<ReForget.Mu<R>, A, B> {
   static <R, A, B> ReForget<R, A, B> unbox(App2<ReForget.Mu<R>, A, B> var0) {
      return (ReForget<R, A, B>)var0;
   }

   B run(R var1);

   final class Instance<R>
      implements App<ReForget.Instance.Mu<R>, ReForget.Mu<R>>,
      Cocartesian<ReForget.Mu<R>, ReForget.Instance.Mu<R>>,
      ReCartesian<ReForget.Mu<R>, ReForget.Instance.Mu<R>> {
      @Override
      public <A, B, C, D> FunctionType<App2<ReForget.Mu<R>, A, B>, App2<ReForget.Mu<R>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var1x -> (App2<ReForget.Mu<R>, C, D>)Optics.reForget(var2x -> (B)var2.apply(ReForget.unbox(var1x).run(var2x)));
      }

      @Override
      public <A, B, C> App2<ReForget.Mu<R>, A, B> unfirst(App2<ReForget.Mu<R>, Pair<A, C>, Pair<B, C>> var1) {
         return Optics.reForget(var1x -> (B)ReForget.<R, A, Pair>unbox(var1).run(var1x).getFirst());
      }

      @Override
      public <A, B, C> App2<ReForget.Mu<R>, A, B> unsecond(App2<ReForget.Mu<R>, Pair<C, A>, Pair<C, B>> var1) {
         return Optics.reForget(var1x -> (B)ReForget.<R, A, Pair>unbox(var1).run(var1x).getSecond());
      }

      @Override
      public <A, B, C> App2<ReForget.Mu<R>, Either<A, C>, Either<B, C>> left(App2<ReForget.Mu<R>, A, B> var1) {
         return Optics.reForget(var1x -> (Either<B, C>)Either.left(ReForget.<R, A, B>unbox(var1).run(var1x)));
      }

      @Override
      public <A, B, C> App2<ReForget.Mu<R>, Either<C, A>, Either<C, B>> right(App2<ReForget.Mu<R>, A, B> var1) {
         return Optics.reForget(var1x -> (Either<C, B>)Either.right(ReForget.unbox(var1).run(var1x)));
      }

      static final class Mu<R> implements Cocartesian.Mu, ReCartesian.Mu {
      }
   }

   final class Mu<R> implements K2 {
   }
}
