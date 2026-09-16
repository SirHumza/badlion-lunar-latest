package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.google.common.reflect.TypeToken;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.CartesianLike;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.util.Pair;

public interface Cartesian<P extends K2, Mu extends Cartesian.Mu> extends Profunctor<P, Mu> {
   static <P extends K2, Proof extends Cartesian.Mu> Cartesian<P, Proof> unbox(App<Proof, P> var0) {
      return (Cartesian<P, Proof>)var0;
   }

   <A, B, C> App2<P, Pair<A, C>, Pair<B, C>> first(App2<P, A, B> var1);

   default <A, B, C> App2<P, Pair<C, A>, Pair<C, B>> second(App2<P, A, B> var1) {
      return this.dimap(this.first(var1), Pair::swap, Pair::swap);
   }

   default FunctorProfunctor<CartesianLike.Mu, P, FunctorProfunctor.Mu<CartesianLike.Mu>> toFP2() {
      return new FunctorProfunctor<CartesianLike.Mu, P, FunctorProfunctor.Mu<CartesianLike.Mu>>() {
         @Override
         public <A, B, F extends K1> App2<P, App<F, A>, App<F, B>> distribute(App<? extends CartesianLike.Mu, F> var1, App2<P, A, B> var2) {
            return this.cap(CartesianLike.unbox(var1), var2);
         }

         private <A, B, F extends K1, C> App2<P, App<F, A>, App<F, B>> cap(CartesianLike<F, C, ?> var1, App2<P, A, B> var2) {
            return Cartesian.this.dimap((App2<P, Pair<A, C>, App<Pair.Mu<C>, A>>)Cartesian.this.first(var2), var1x -> Pair.unbox(var1.to(var1x)), var1::from);
         }
      };
   }

   interface Mu extends Profunctor.Mu {
      TypeToken<Cartesian.Mu> TYPE_TOKEN = new TypeToken<Cartesian.Mu>() {};
   }
}
