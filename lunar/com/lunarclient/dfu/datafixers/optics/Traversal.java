package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.Applicative;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.profunctors.TraversalP;
import java.util.function.Function;

public interface Traversal<S, T, A, B> extends App2<Traversal.Mu<A, B>, S, T>, Optic<TraversalP.Mu, S, T, A, B>, Wander<S, T, A, B> {
   static <S, T, A, B> Traversal<S, T, A, B> unbox(App2<Traversal.Mu<A, B>, S, T> var0) {
      return (Traversal<S, T, A, B>)var0;
   }

   default <P extends K2> FunctionType<App2<P, A, B>, App2<P, S, T>> eval(App<? extends TraversalP.Mu, P> var1) {
      TraversalP var2 = TraversalP.unbox(var1);
      return var2x -> var2.wander(this, var2x);
   }

   final class Instance<A2, B2> implements TraversalP<Traversal.Mu<A2, B2>, TraversalP.Mu> {
      @Override
      public <A, B, C, D> FunctionType<App2<Traversal.Mu<A2, B2>, A, B>, App2<Traversal.Mu<A2, B2>, C, D>> dimap(Function<C, A> var1, Function<B, D> var2) {
         return var3 -> new Traversal<C, D, A2, B2>() {
            @Override
            public <F extends K1> FunctionType<C, App<F, D>> wander(Applicative<F, ?> var1x, FunctionType<A2, App<F, B2>> var2x) {
               return var5 -> var1x.map(var2, Traversal.<S, T, A, B>unbox(var3).<F>wander(var1x, var2x).apply((S)var1.apply(var5)));
            }
         };
      }

      @Override
      public <S, T, A, B> App2<Traversal.Mu<A2, B2>, S, T> wander(final Wander<S, T, A, B> var1, final App2<Traversal.Mu<A2, B2>, A, B> var2) {
         return new Traversal<S, T, A2, B2>() {
            @Override
            public <F extends K1> FunctionType<S, App<F, T>> wander(Applicative<F, ?> var1x, FunctionType<A2, App<F, B2>> var2x) {
               return var1.wander(var1x, Traversal.<S, T, A, B>unbox(var2).wander(var1x, var2x));
            }
         };
      }
   }

   final class Mu<A, B> implements K2 {
   }
}
