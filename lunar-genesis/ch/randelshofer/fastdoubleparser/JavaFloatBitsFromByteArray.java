package ch.randelshofer.fastdoubleparser;

import java.nio.charset.StandardCharsets;

final class JavaFloatBitsFromByteArray extends AbstractJavaFloatingPointBitsFromByteArray {
   public JavaFloatBitsFromByteArray() {
   }

   @Override
   long nan() {
      return Float.floatToRawIntBits(Float.NaN);
   }

   @Override
   long negativeInfinity() {
      return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
   }

   @Override
   long positiveInfinity() {
      return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
   }

   @Override
   long valueOfFloatLiteral(byte[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9) {
      float var10 = FastFloatMath.decFloatLiteralToFloat(var4, var5, var7, var8, var9);
      return Float.floatToRawIntBits(Float.isNaN(var10) ? Float.parseFloat(new String(var1, var2, var3 - var2, StandardCharsets.ISO_8859_1)) : var10);
   }

   @Override
   long valueOfHexLiteral(byte[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9) {
      float var10 = FastFloatMath.hexFloatLiteralToFloat(var4, var5, var7, var8, var9);
      return Float.floatToRawIntBits(Float.isNaN(var10) ? Float.parseFloat(new String(var1, var2, var3 - var2, StandardCharsets.ISO_8859_1)) : var10);
   }
}
