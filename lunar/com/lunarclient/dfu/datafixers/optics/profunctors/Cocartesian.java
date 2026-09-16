package com.lunarclient.dfu.datafixers.optics.profunctors;

import com.google.common.reflect.TypeToken;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.CocartesianLike;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.util.Either;

public interface Cocartesian<P extends K2, Mu extends Cocartesian.Mu> extends Profunctor<P, Mu> {
   static <P extends K2, Proof extends Cocartesian.Mu> Cocartesian<P, Proof> unbox(App<Proof, P> var0) {
      return (Cocartesian<P, Proof>)var0;
   }

   <A, B, C> App2<P, Either<A, C>, Either<B, C>> left(App2<P, A, B> var1);

   default <A, B, C> App2<P, Either<C, A>, Either<C, B>> right(App2<P, A, B> var1) {
      return this.dimap(this.left(var1), Either::swap, Either::swap);
   }

   default FunctorProfunctor<CocartesianLike.Mu, P, FunctorProfunctor.Mu<CocartesianLike.Mu>> toFP() {
      return new FunctorProfunctor<CocartesianLike.Mu, P, FunctorProfunctor.Mu<CocartesianLike.Mu>>() {
         @Override
         public <A, B, F extends K1> App2<P, App<F, A>, App<F, B>> distribute(App<? extends CocartesianLike.Mu, F> var1, App2<P, A, B> var2) {
            return this.cap(CocartesianLike.unbox(var1), var2);
         }

         private <A, B, F extends K1, C> App2<P, App<F, A>, App<F, B>> cap(CocartesianLike<F, C, ?> var1, App2<P, A, B> var2) {
            return Cocartesian.this.dimap(
               (App2<P, Either<A, C>, App<Either.Mu<C>, A>>)Cocartesian.this.left(var2), var1x -> Either.unbox(var1.to(var1x)), var1::from
            );
         }
      };
   }

   interface Mu extends Profunctor.Mu {
      TypeToken<Cocartesian.Mu> TYPE_TOKEN = new TypeToken<Cocartesian.Mu>() {};
   }
}
