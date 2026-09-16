package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import java.math.BigInteger;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   public static BigInteger CHHHRIIIIIRRHHICIRHCOCHIOHCRHR(String var0) {
      try {
         return IRRCCOICORICIHCHRHIHIHROIRHOCR.parseBigInteger(var0);
      } catch (NumberFormatException var3) {
         String var2 = var0.length() <= 1000 ? var0 : var0.substring(0, 1000) + " [truncated]";
         throw new NumberFormatException("Value \"" + var2 + "\" can not be represented as `java.math.BigInteger`, reason: " + var3.getMessage());
      }
   }

   public static BigInteger RCIROOOOICRHCCRRCIORHHIRCOIIIC(String var0, int var1) {
      try {
         return IRRCCOICORICIHCHRHIHIHROIRHOCR.parseBigInteger(var0, var1);
      } catch (NumberFormatException var4) {
         String var3 = var0.length() <= 1000 ? var0 : var0.substring(0, 1000) + " [truncated]";
         throw new NumberFormatException(
            "Value \"" + var3 + "\" can not be represented as `java.math.BigInteger` with radix " + var1 + ", reason: " + var4.getMessage()
         );
      }
   }
}
