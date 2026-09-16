package ch.randelshofer.fastdoubleparser;

final class JsonDoubleBitsFromCharArray extends AbstractJsonFloatingPointBitsFromCharArray {
   public JsonDoubleBitsFromCharArray() {
   }

   @Override
   long valueOfFloatLiteral(char[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9) {
      double var10 = FastDoubleMath.tryDecFloatToDoubleTruncated(var4, var5, var7, var8, var9);
      return Double.doubleToRawLongBits(Double.isNaN(var10) ? Double.parseDouble(new String(var1, var2, var3 - var2)) : var10);
   }
}
