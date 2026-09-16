package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.util.Either;

public final class Inj1<F, G, F2> implements Prism<Either<F, G>, Either<F2, G>, F, F2> {
   public static final Inj1<?, ?, ?> INSTANCE = new Inj1();

   private Inj1() {
   }

   public Either<Either<F2, G>, F> match(Either<F, G> var1) {
      return var1.map(Either::right, var0 -> Either.left(Either.right((G)var0)));
   }

   public Either<F2, G> build(F2 var1) {
      return Either.left((F2)var1);
   }

   @Override
   public String toString() {
      return "inj1";
   }
}
