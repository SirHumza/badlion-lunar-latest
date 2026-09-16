package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public class RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO {
   private static final IOIICIRIICICIIOORHCIIIIRRIHRHI OIHHHRIIHIHIRORRHIIIHOROCCHROR = new IOIICIRIICICIIOORHCIIIIRRIHRHI();
   private static final HHRIICOIOORCHCOIICOOIHIRHHICRI IHRHCHIOCHHHOOHIRRCIOCIHRHCCHO = new HHRIICOIOORCHCOIICOOIHIRHHICRI();
   private static final ORHIOICIOCRRHOOCOHRORIHICHRCRR ROIRCHHHCOCCCROICIIHCCCOICIICH = new ORHIOICIOCRRHOOCOHRORIHICHRCRR();

   private RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO() {
   }

   public static float parseFloat(CharSequence var0) {
      return parseFloat(var0, 0, var0.length());
   }

   public static float parseFloat(CharSequence var0, int var1, int var2) {
      long var3 = ROIRCHHHCOCCCROICIIHCCCOICIICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
      return Float.intBitsToFloat((int)var3);
   }

   public static float parseFloat(byte[] var0) {
      return parseFloat(var0, 0, var0.length);
   }

   public static float parseFloat(byte[] var0, int var1, int var2) {
      long var3 = OIHHHRIIHIHIRORRHIIIHOROCCHROR.parseFloatingPointLiteral(var0, var1, var2);
      return Float.intBitsToFloat((int)var3);
   }

   public static float parseFloat(char[] var0) {
      return parseFloat(var0, 0, var0.length);
   }

   public static float parseFloat(char[] var0, int var1, int var2) {
      long var3 = IHRHCHIOCHHHOOHIRRCIOCIHRHCCHO.parseFloatingPointLiteral(var0, var1, var2);
      return Float.intBitsToFloat((int)var3);
   }
}
