package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import java.util.function.BiFunction;

public enum OCOHORHCROHICRRIHCIHHRRCIHICRI {
   START((var0, var1) -> var0),
   CENTER((var0, var1) -> var1 / 2 - var0),
   END((var0, var1) -> var1 - var0);

   private final BiFunction<Integer, Integer, Integer> function;

   OCOHORHCROHICRRIHCIHHRRCIHICRI(BiFunction<Integer, Integer, Integer> var3) {
      this.function = var3;
   }

   public int apply(int var1, int var2) {
      return this.function.apply(var1, var2);
   }
}
