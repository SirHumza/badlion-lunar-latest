package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.kinds.Kind2;
import java.util.function.Function;
import java.util.function.Supplier;

interface Bicontravariant<P extends K2, Mu extends Bicontravariant.Mu> extends Kind2<P, Mu> {
   static <P extends K2, Proof extends Bicontravariant.Mu> Bicontravariant<P, Proof> unbox(App<Proof, P> var0) {
      return (Bicontravariant<P, Proof>)var0;
   }

   <A, B, C, D> FunctionType<Supplier<App2<P, A, B>>, App2<P, C, D>> cimap(Function<C, A> var1, Function<D, B> var2);

   default <A, B, C, D> App2<P, C, D> cimap(Supplier<App2<P, A, B>> var1, Function<C, A> var2, Function<D, B> var3) {
      return this.<A, B, C, D>cimap(var2, var3).apply(var1);
   }

   interface Mu extends Kind2.Mu {
   }
}
