package com.lunarclient.dfu.datafixers.kinds;

import com.lunarclient.dfu.datafixers.FunctionType;

public interface Representable<T extends K1, C, Mu extends Representable.Mu> extends Functor<T, Mu> {
   static <F extends K1, C, Mu extends Representable.Mu> Representable<F, C, Mu> unbox(App<Mu, F> var0) {
      return (Representable<F, C, Mu>)var0;
   }

   <A> App<FunctionType.ReaderMu<C>, A> to(App<T, A> var1);

   <A> App<T, A> from(App<FunctionType.ReaderMu<C>, A> var1);

   interface Mu extends Functor.Mu {
   }
}
