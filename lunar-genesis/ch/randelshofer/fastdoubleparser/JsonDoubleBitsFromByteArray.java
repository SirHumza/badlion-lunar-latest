package ch.randelshofer.fastdoubleparser;

import java.nio.charset.StandardCharsets;

final class JsonDoubleBitsFromByteArray extends AbstractJsonFloatingPointBitsFromByteArray {
   public JsonDoubleBitsFromByteArray() {
   }

   @Override
   long valueOfFloatLiteral(byte[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9) {
      double var10 = FastDoubleMath.tryDecFloatToDoubleTruncated(var4, var5, var7, var8, var9);
      return Double.doubleToRawLongBits(Double.isNaN(var10) ? Double.parseDouble(new String(var1, var2, var3 - var2, StandardCharsets.ISO_8859_1)) : var10);
   }
}
