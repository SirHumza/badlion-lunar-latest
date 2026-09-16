package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import java.util.function.Function;

public interface GetterP<P extends K2, Mu extends GetterP.Mu> extends Bicontravariant<P, Mu>, Profunctor<P, Mu> {
   static <P extends K2, Proof extends GetterP.Mu> GetterP<P, Proof> unbox(App<Proof, P> var0) {
      return (GetterP<P, Proof>)var0;
   }

   default <A, B, C> App2<P, C, A> secondPhantom(App2<P, C, B> var1) {
      return this.cimap(() -> this.rmap(var1, var0 -> (Void)null), (Function<C, A>)Function.identity(), var0 -> null);
   }

   interface Mu extends Bicontravariant.Mu, Profunctor.Mu {
   }
}
