package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.Functor;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.kinds.K2;

public interface Mapping<P extends K2, Mu extends Mapping.Mu> extends TraversalP<P, Mu> {
   static <P extends K2, Proof extends Mapping.Mu> Mapping<P, Proof> unbox(App<Proof, P> var0) {
      return (Mapping<P, Proof>)var0;
   }

   <A, B, F extends K1> App2<P, App<F, A>, App<F, B>> mapping(Functor<F, ?> var1, App2<P, A, B> var2);

   interface Mu extends TraversalP.Mu {
   }
}
