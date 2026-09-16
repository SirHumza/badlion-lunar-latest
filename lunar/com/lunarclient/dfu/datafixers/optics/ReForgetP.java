package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.AffineP;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.function.Function;

interface ReForgetP<R, A, B> extends App2<ReForgetP.Mu<R>, A, B> {
   static <R, A, B> ReForgetP<R, A, B> unbox(App2<ReForgetP.Mu<R>, A, B> var0) {
      return (ReForgetP<R, A, B>)var0;
   }

   B run(A var1, R var2);

   final class Instance<R> implements App<ReForgetP.Instance.Mu<R>, ReForgetP.Mu<R>>, AffineP<ReForgetP.Mu<R>, ReForgetP.Instance.Mu<R>> {
      @Override
      public <A, B, C, D> FunctionType<App2<ReForgetP.Mu<R>, A, B>, App2<ReForgetP.Mu<R>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> (App2<ReForgetP.Mu<R>, C, D>)Optics.reForgetP("dimap", (var3, var4) -> {
            Object var5 = var1.apply(var3);
            Object var6 = ReForgetP.<R, Object, B>unbox(var2x).run(var5, var4);
            return (B)var2.apply(var6);
         });
      }

      @Override
      public <A, B, C> App2<ReForgetP.Mu<R>, Either<A, C>, Either<B, C>> left(App2<ReForgetP.Mu<R>, A, B> var1) {
         return Optics.reForgetP("left", (var1x, var2) -> var1x.mapLeft(var2x -> ReForgetP.unbox(var1).run((A)var2x, (R)var2)));
      }

      @Override
      public <A, B, C> App2<ReForgetP.Mu<R>, Either<C, A>, Either<C, B>> right(App2<ReForgetP.Mu<R>, A, B> var1) {
         return Optics.reForgetP("right", (var1x, var2) -> var1x.mapRight(var2x -> ReForgetP.unbox(var1).run((A)var2x, (R)var2)));
      }

      @Override
      public <A, B, C> App2<ReForgetP.Mu<R>, Pair<A, C>, Pair<B, C>> first(App2<ReForgetP.Mu<R>, A, B> var1) {
         return Optics.reForgetP("first", (var1x, var2) -> Pair.of(ReForgetP.<R, A, B>unbox(var1).run(var1x.getFirst(), var2), var1x.getSecond()));
      }

      @Override
      public <A, B, C> App2<ReForgetP.Mu<R>, Pair<C, A>, Pair<C, B>> second(App2<ReForgetP.Mu<R>, A, B> var1) {
         return Optics.reForgetP("second", (var1x, var2) -> Pair.of(var1x.getFirst(), ReForgetP.<R, A, B>unbox(var1).run(var1x.getSecond(), var2)));
      }

      static final class Mu<R> implements AffineP.Mu {
      }
   }

   final class Mu<R> implements K2 {
   }
}
