package com.lunarclient.dfu.datafixers.optics;

import com.lunarclient.dfu.datafixers.util.Pair;

public final class Proj1<F, G, F2> implements Lens<Pair<F, G>, Pair<F2, G>, F, F2> {
   public static final Proj1<?, ?, ?> INSTANCE = new Proj1();

   private Proj1() {
   }

   public F view(Pair<F, G> var1) {
      return (F)var1.getFirst();
   }

   public Pair<F2, G> update(F2 var1, Pair<F, G> var2) {
      return (Pair<F2, G>)Pair.of(var1, (G)var2.getSecond());
   }

   @Override
   public String toString() {
      return "π1";
   }
}
