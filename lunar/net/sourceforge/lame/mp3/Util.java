package net.sourceforge.lame.mp3;

public class Util {
   public static final float SQRT2 = 1.4142135F;

   public static float FAST_LOG10(float var0) {
      return (float)Math.log10(var0);
   }

   public static float FAST_LOG10_X(float var0, float var1) {
      return (float)Math.log10(var0) * var1;
   }
}
