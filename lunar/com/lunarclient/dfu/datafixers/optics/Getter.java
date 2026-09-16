package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.GetterP;
import java.util.function.Function;
import java.util.function.Supplier;

interface Getter<S, T, A, B> extends App2<Getter.Mu<A, B>, S, T>, Optic<GetterP.Mu, S, T, A, B> {
   static <S, T, A, B> Getter<S, T, A, B> unbox(App2<Getter.Mu<A, B>, S, T> var0) {
      return (Getter<S, T, A, B>)var0;
   }

   A get(S var1);

   default <P extends K2> FunctionType<App2<P, A, B>, App2<P, S, T>> eval(App<? extends GetterP.Mu, P> var1) {
      GetterP var2 = GetterP.unbox(var1);
      return var2x -> (App2<P, S, T>)var2.lmap(var2.secondPhantom(var2x), this::get);
   }

   final class Instance<A2, B2> implements GetterP<Getter.Mu<A2, B2>, GetterP.Mu> {
      @Override
      public <A, B, C, D> FunctionType<App2<Getter.Mu<A2, B2>, A, B>, App2<Getter.Mu<A2, B2>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var1x -> Optics.getter(var1.andThen(Getter.unbox(var1x)::get));
      }

      @Override
      public <A, B, C, D> FunctionType<Supplier<App2<Getter.Mu<A2, B2>, A, B>>, App2<Getter.Mu<A2, B2>, C, D>> cimap(Function<C, A> var1, Function<D, B> var2) {
         return var1x -> Optics.getter(var1.andThen(Getter.unbox(var1x.get())::get));
      }
   }

   final class Mu<A, B> implements K2 {
   }
}
