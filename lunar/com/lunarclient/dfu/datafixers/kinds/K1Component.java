package com.lunarclient.dfu.datafixers.kinds;

import com.lunarclient.dfu.datafixers.util.Either;
import java.util.function.Function;

public interface CocartesianLike<T extends K1, C, Mu extends CocartesianLike.Mu> extends Functor<T, Mu>, Traversable<T, Mu> {
   static <F extends K1, C, Mu extends CocartesianLike.Mu> CocartesianLike<F, C, Mu> unbox(App<Mu, F> var0) {
      return (CocartesianLike<F, C, Mu>)var0;
   }

   <A> App<Either.Mu<C>, A> to(App<T, A> var1);

   <A> App<T, A> from(App<Either.Mu<C>, A> var1);

   @Override
   default <F extends K1, A, B> App<F, App<T, B>> traverse(Applicative<F, ?> var1, Function<A, App<F, B>> var2, App<T, A> var3) {
      return var1.map(this::from, new Either.Instance<C>().traverse(var1, var2, this.to(var3)));
   }

   interface Mu extends Functor.Mu, Traversable.Mu {
   }
}
