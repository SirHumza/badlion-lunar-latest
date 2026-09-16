package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.Procompose;
import java.util.function.Supplier;

public interface MonoidProfunctor<P extends K2, Mu extends MonoidProfunctor.Mu> extends Profunctor<P, Mu> {
   <A, B> App2<P, A, B> zero(App2<FunctionType.Mu, A, B> var1);

   <A, B> App2<P, A, B> plus(App2<Procompose.Mu<P, P>, A, B> var1);

   default <A, B, C> App2<P, A, C> compose(App2<P, B, C> var1, Supplier<App2<P, A, B>> var2) {
      return (App2<P, A, C>)this.plus(new Procompose<>(var2, var1));
   }

   interface Mu extends Profunctor.Mu {
   }
}
