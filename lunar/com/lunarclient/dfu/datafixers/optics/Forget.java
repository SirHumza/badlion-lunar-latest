package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cartesian;
import com.lunarclient.dfu.datafixers.optics.profunctors.ReCocartesian;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.function.Function;

public interface Forget<R, A, B> extends App2<Forget.Mu<R>, A, B> {
   static <R, A, B> Forget<R, A, B> unbox(App2<Forget.Mu<R>, A, B> var0) {
      return (Forget<R, A, B>)var0;
   }

   R run(A var1);

   final class Instance<R>
      implements App<Forget.Instance.Mu<R>, Forget.Mu<R>>,
      Cartesian<Forget.Mu<R>, Forget.Instance.Mu<R>>,
      ReCocartesian<Forget.Mu<R>, Forget.Instance.Mu<R>> {
      @Override
      public <A, B, C, D> FunctionType<App2<Forget.Mu<R>, A, B>, App2<Forget.Mu<R>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var1x -> (App2<Forget.Mu<R>, C, D>)Optics.forget(var2x -> Forget.<R, A, B>unbox(var1x).run((A)var1.apply(var2x)));
      }

      @Override
      public <A, B, C> App2<Forget.Mu<R>, Pair<A, C>, Pair<B, C>> first(App2<Forget.Mu<R>, A, B> var1) {
         return Optics.forget(var1x -> Forget.<R, A, B>unbox(var1).run(var1x.getFirst()));
      }

      @Override
      public <A, B, C> App2<Forget.Mu<R>, Pair<C, A>, Pair<C, B>> second(App2<Forget.Mu<R>, A, B> var1) {
         return Optics.forget(var1x -> Forget.<R, A, B>unbox(var1).run(var1x.getSecond()));
      }

      @Override
      public <A, B, C> App2<Forget.Mu<R>, A, B> unleft(App2<Forget.Mu<R>, Either<A, C>, Either<B, C>> var1) {
         return Optics.forget(var1x -> Forget.<R, A, B>unbox(var1).run((A)Either.left(var1x)));
      }

      @Override
      public <A, B, C> App2<Forget.Mu<R>, A, B> unright(App2<Forget.Mu<R>, Either<C, A>, Either<C, B>> var1) {
         return Optics.forget(var1x -> Forget.<R, A, B>unbox(var1).run((A)Either.right(var1x)));
      }

      public static final class Mu<R> implements Cartesian.Mu, ReCocartesian.Mu {
      }
   }

   final class Mu<R> implements K2 {
   }
}
