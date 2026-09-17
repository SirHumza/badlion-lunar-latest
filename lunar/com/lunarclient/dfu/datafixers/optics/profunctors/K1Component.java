package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.kinds.Kind2;

public interface FunctorProfunctor<T extends K1, P extends K2, Mu extends FunctorProfunctor.Mu<T>> extends Kind2<P, Mu> {
   static <T extends K1, P extends K2, Mu extends FunctorProfunctor.Mu<T>> FunctorProfunctor<T, P, Mu> unbox(App<Mu, P> var0) {
      return (FunctorProfunctor<T, P, Mu>)var0;
   }

   <A, B, F extends K1> App2<P, App<F, A>, App<F, B>> distribute(App<? extends T, F> var1, App2<P, A, B> var2);

   interface Mu<T extends K1> extends Kind2.Mu {
   }
}
