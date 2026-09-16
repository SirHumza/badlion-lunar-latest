package org.jgrapht.alg.util;

import java.io.Serializable;
import java.util.Comparator;

public class ToleranceDoubleComparator implements Serializable, Comparator<Double> {
   private static final long serialVersionUID = -3819451375975842372L;
   public static final double DEFAULT_EPSILON = 1.0E-9;
   private final double epsilon;

   public ToleranceDoubleComparator() {
      this(1.0E-9);
   }

   public ToleranceDoubleComparator(double var1) {
      if (var1 <= 0.0) {
         throw new IllegalArgumentException("Tolerance must be positive");
      }

      this.epsilon = var1;
   }

   public int compare(Double var1, Double var2) {
      return Math.abs(var1 - var2) < this.epsilon ? 0 : Double.compare(var1, var2);
   }
}
