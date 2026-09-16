package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.util.Pair;

public interface ReCartesian<P extends K2, Mu extends ReCartesian.Mu> extends Profunctor<P, Mu> {
   static <P extends K2, Proof extends ReCartesian.Mu> ReCartesian<P, Proof> unbox(App<Proof, P> var0) {
      return (ReCartesian<P, Proof>)var0;
   }

   <A, B, C> App2<P, A, B> unfirst(App2<P, Pair<A, C>, Pair<B, C>> var1);

   <A, B, C> App2<P, A, B> unsecond(App2<P, Pair<C, A>, Pair<C, B>> var1);

   interface Mu extends Profunctor.Mu {
   }
}
