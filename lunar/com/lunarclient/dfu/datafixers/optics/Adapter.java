package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.Profunctor;
import java.util.function.Function;

public interface Adapter<S, T, A, B> extends App2<Adapter.Mu<A, B>, S, T>, Optic<Profunctor.Mu, S, T, A, B> {
   static <S, T, A, B> Adapter<S, T, A, B> unbox(App2<Adapter.Mu<A, B>, S, T> var0) {
      return (Adapter<S, T, A, B>)var0;
   }

   A from(S var1);

   T to(B var1);

   default <P extends K2> FunctionType<App2<P, A, B>, App2<P, S, T>> eval(App<? extends Profunctor.Mu, P> var1) {
      Profunctor var2 = Profunctor.unbox(var1);
      return var2x -> var2.dimap(var2x, this::from, this::to);
   }

   final class Instance<A2, B2> implements Profunctor<Adapter.Mu<A2, B2>, Profunctor.Mu> {
      @Override
      public <A, B, C, D> FunctionType<App2<Adapter.Mu<A2, B2>, A, B>, App2<Adapter.Mu<A2, B2>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var2x -> Optics.adapter(
            var2xx -> Adapter.<S, T, A, B>unbox(var2x).from((S)var1.apply(var2xx)), var2xx -> (T)var2.apply(Adapter.<S, T, A, Object>unbox(var2x).to(var2xx))
         );
      }
   }

   final class Mu<A, B> implements K2 {
   }
}
