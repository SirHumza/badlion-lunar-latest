package ch.randelshofer.fastdoubleparser;

final class JsonDoubleBitsFromCharSequence extends AbstractJsonFloatingPointBitsFromCharSequence {
   public JsonDoubleBitsFromCharSequence() {
   }

   @Override
   long valueOfFloatLiteral(CharSequence var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9) {
      double var10 = FastDoubleMath.tryDecFloatToDoubleTruncated(var4, var5, var7, var8, var9);
      return Double.doubleToRawLongBits(Double.isNaN(var10) ? Double.parseDouble(var1.subSequence(var2, var3).toString()) : var10);
   }
}
