package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.google.common.reflect.TypeToken;
import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;

public interface Closed<P extends K2, Mu extends Closed.Mu> extends Profunctor<P, Mu> {
   static <P extends K2, Proof extends Closed.Mu> Closed<P, Proof> unbox(App<Proof, P> var0) {
      return (Closed<P, Proof>)var0;
   }

   <A, B, X> App2<P, FunctionType<X, A>, FunctionType<X, B>> closed(App2<P, A, B> var1);

   interface Mu extends Profunctor.Mu {
      TypeToken<Closed.Mu> TYPE_TOKEN = new TypeToken<Closed.Mu>() {};
   }
}
