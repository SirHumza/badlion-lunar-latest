package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.nio.charset.StandardCharsets;

final class RICRIRRCOHRCOCRRHHCRHRROOIOHHR extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public RICRIRRCOHRCOCRRHHCRHRROOIOHHR() {
   }

   @Override
   long nan() {
      return Double.doubleToRawLongBits(Double.NaN);
   }

   @Override
   long negativeInfinity() {
      return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
   }

   @Override
   long positiveInfinity() {
      return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
   }

   @Override
   long valueOfFloatLiteral(byte[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9) {
      double var10 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.tryDecFloatToDoubleTruncated(var4, var5, var7, var8, var9);
      return Double.doubleToRawLongBits(Double.isNaN(var10) ? Double.parseDouble(new String(var1, var2, var3 - var2, StandardCharsets.ISO_8859_1)) : var10);
   }

   @Override
   long valueOfHexLiteral(byte[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9) {
      double var10 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.tryHexFloatToDoubleTruncated(var4, var5, var7, var8, var9);
      return Double.doubleToRawLongBits(Double.isNaN(var10) ? Double.parseDouble(new String(var1, var2, var3 - var2, StandardCharsets.ISO_8859_1)) : var10);
   }
}
