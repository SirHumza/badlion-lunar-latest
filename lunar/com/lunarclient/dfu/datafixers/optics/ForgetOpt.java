package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.AffineP;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Function;

public interface ForgetOpt<R, A, B> extends App2<ForgetOpt.Mu<R>, A, B> {
   static <R, A, B> ForgetOpt<R, A, B> unbox(App2<ForgetOpt.Mu<R>, A, B> var0) {
      return (ForgetOpt<R, A, B>)var0;
   }

   Optional<R> run(A var1);

   final class Instance<R> implements App<ForgetOpt.Instance.Mu<R>, ForgetOpt.Mu<R>>, AffineP<ForgetOpt.Mu<R>, ForgetOpt.Instance.Mu<R>> {
      @Override
      public <A, B, C, D> FunctionType<App2<ForgetOpt.Mu<R>, A, B>, App2<ForgetOpt.Mu<R>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var1x -> (App2<ForgetOpt.Mu<R>, C, D>)Optics.forgetOpt(var2x -> ForgetOpt.<R, A, B>unbox(var1x).run((A)var1.apply(var2x)));
      }

      @Override
      public <A, B, C> App2<ForgetOpt.Mu<R>, Pair<A, C>, Pair<B, C>> first(App2<ForgetOpt.Mu<R>, A, B> var1) {
         return Optics.forgetOpt(var1x -> ForgetOpt.<R, A, B>unbox(var1).run(var1x.getFirst()));
      }

      @Override
      public <A, B, C> App2<ForgetOpt.Mu<R>, Pair<C, A>, Pair<C, B>> second(App2<ForgetOpt.Mu<R>, A, B> var1) {
         return Optics.forgetOpt(var1x -> ForgetOpt.<R, A, B>unbox(var1).run(var1x.getSecond()));
      }

      @Override
      public <A, B, C> App2<ForgetOpt.Mu<R>, Either<A, C>, Either<B, C>> left(App2<ForgetOpt.Mu<R>, A, B> var1) {
         return Optics.forgetOpt(var1x -> var1x.left().flatMap(ForgetOpt.unbox(var1)::run));
      }

      @Override
      public <A, B, C> App2<ForgetOpt.Mu<R>, Either<C, A>, Either<C, B>> right(App2<ForgetOpt.Mu<R>, A, B> var1) {
         return Optics.forgetOpt(var1x -> var1x.right().flatMap(ForgetOpt.unbox(var1)::run));
      }

      public static final class Mu<R> implements AffineP.Mu {
      }
   }

   final class Mu<R> implements K2 {
   }
}
