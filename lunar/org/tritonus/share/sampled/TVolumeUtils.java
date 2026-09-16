package org.tritonus.share.sampled;

public class TVolumeUtils {
   private static final double FACTOR1 = 20.0 / Math.log(10.0);
   private static final double FACTOR2 = 0.05;

   public static double lin2log(double var0) {
      return FACTOR1 * Math.log(var0);
   }

   public static double log2lin(double var0) {
      return Math.pow(10.0, var0 * 0.05);
   }
}
