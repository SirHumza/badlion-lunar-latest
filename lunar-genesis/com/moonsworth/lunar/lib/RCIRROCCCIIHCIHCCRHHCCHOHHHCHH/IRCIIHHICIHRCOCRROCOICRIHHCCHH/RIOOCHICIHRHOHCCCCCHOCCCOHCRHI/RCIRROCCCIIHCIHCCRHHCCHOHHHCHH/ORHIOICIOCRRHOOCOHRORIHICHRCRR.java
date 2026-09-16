package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

final class ORHIOICIOCRRHOOCOHRORIHICHRCRR extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   public ORHIOICIOCRRHOOCOHRORIHICHRCRR() {
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
   long valueOfFloatLiteral(CharSequence var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9) {
      float var10 = CORCOCICIRIOHROHROIIOOHICCHCRR.decFloatLiteralToFloat(var4, var5, var7, var8, var9);
      return Float.floatToRawIntBits(Float.isNaN(var10) ? Float.parseFloat(var1.subSequence(var2, var3).toString()) : var10);
   }

   @Override
   long valueOfHexLiteral(CharSequence var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9) {
      float var10 = CORCOCICIRIOHROHROIIOOHICCHCRR.hexFloatLiteralToFloat(var4, var5, var7, var8, var9);
      return Float.floatToRawIntBits(Float.isNaN(var10) ? Float.parseFloat(var1.subSequence(var2, var3).toString()) : var10);
   }
}
