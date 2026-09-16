package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.Closed;
import java.util.function.Function;

interface Grate<S, T, A, B> extends App2<Grate.Mu<A, B>, S, T>, Optic<Closed.Mu, S, T, A, B> {
   static <S, T, A, B> Grate<S, T, A, B> unbox(App2<Grate.Mu<A, B>, S, T> var0) {
      return (Grate<S, T, A, B>)var0;
   }

   T grate(FunctionType<FunctionType<S, A>, B> var1);

   default <P extends K2> FunctionType<App2<P, A, B>, App2<P, S, T>> eval(App<? extends Closed.Mu, P> var1) {
      Closed var2 = Closed.unbox(var1);
      return var2x -> var2.dimap(var2.closed(var2x), var0 -> var1xx -> var1xx.apply(var0), this::grate);
   }

   final class Instance<A2, B2> implements Closed<Grate.Mu<A2, B2>, Closed.Mu> {
      @Override
      public <A, B, C, D> FunctionType<App2<Grate.Mu<A2, B2>, A, B>, App2<Grate.Mu<A2, B2>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> Optics.grate(var3 -> (T)var2.apply(Grate.unbox(var2x).grate(var2xxx -> (B)var3.apply(FunctionType.create(var2xxx.compose(var1))))));
      }

      @Override
      public <A, B, X> App2<Grate.Mu<A2, B2>, FunctionType<X, A>, FunctionType<X, B>> closed(App2<Grate.Mu<A2, B2>, A, B> var1) {
         FunctionType var2 = var0 -> var1x -> var0.apply((FunctionType<FunctionType, >)var1xx -> var1xx.apply(var1x));
         return Optics.<FunctionType<X, A>, FunctionType<X, B>, A, B>grate(var2).eval(this).apply(Grate.unbox(var1));
      }
   }

   final class Mu<A, B> implements K2 {
   }
}
