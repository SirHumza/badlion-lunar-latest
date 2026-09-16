package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.util.Either;

public final class Inj2<F, G, G2> implements Prism<Either<F, G>, Either<F, G2>, G, G2> {
   public static final Inj2<?, ?, ?> INSTANCE = new Inj2();

   private Inj2() {
   }

   public Either<Either<F, G2>, G> match(Either<F, G> var1) {
      return var1.map(var0 -> Either.left(Either.left((F)var0)), Either::right);
   }

   public Either<F, G2> build(G2 var1) {
      return Either.right((G2)var1);
   }

   @Override
   public String toString() {
      return "inj2";
   }
}
