package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.util.Pair;

public final class Proj2<F, G, G2> implements Lens<Pair<F, G>, Pair<F, G2>, G, G2> {
   public static final Proj2<?, ?, ?> INSTANCE = new Proj2();

   private Proj2() {
   }

   public G view(Pair<F, G> var1) {
      return (G)var1.getSecond();
   }

   public Pair<F, G2> update(G2 var1, Pair<F, G> var2) {
      return Pair.of((F)var2.getFirst(), (G2)var1);
   }

   @Override
   public String toString() {
      return "π2";
   }
}
