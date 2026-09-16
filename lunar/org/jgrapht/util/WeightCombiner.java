package org.jgrapht.util;

import java.io.Serializable;

public interface WeightCombiner {
   WeightCombiner SUM = (WeightCombiner)((Serializable)((var0x, var2) -> var0x + var2));
   WeightCombiner MULT = (WeightCombiner)((Serializable)((var0x, var2) -> var0x * var2));
   WeightCombiner MIN = (WeightCombiner)((Serializable)(Math::min));
   WeightCombiner MAX = (WeightCombiner)((Serializable)(Math::max));
   WeightCombiner FIRST = (WeightCombiner)((Serializable)((var0x, var2) -> var0x));
   WeightCombiner SECOND = (WeightCombiner)((Serializable)((var0x, var2) -> var2));

   double combine(double var1, double var3);
}
