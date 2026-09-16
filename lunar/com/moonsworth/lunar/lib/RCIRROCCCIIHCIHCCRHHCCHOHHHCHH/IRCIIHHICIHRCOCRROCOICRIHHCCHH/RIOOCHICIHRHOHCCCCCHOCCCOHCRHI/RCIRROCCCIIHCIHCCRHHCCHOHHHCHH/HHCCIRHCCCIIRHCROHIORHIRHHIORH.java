package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final boolean HRIHOHOHCRHCHIOHICCOHRIHOOCRHR = true;

   private static int skipWhitespace(char[] var0, int var1, int var2) {
      while (var1 < var2 && var0[var1] <= ' ') {
         var1++;
      }

      return var1;
   }

   abstract long nan();

   abstract long negativeInfinity();

   private long parseDecFloatLiteral(char[] var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      long var7 = 0L;
      int var9 = var2;
      int var10 = -1;
      boolean var11 = false;
      char var12 = '\u0000';
      int var13 = Math.min(var4 - 4, 1073741824);

      while (var2 < var4) {
         var12 = var1[var2];
         if (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var12)) {
            var7 = 10L * var7 + var12 - 48L;
         } else {
            if (var12 != '.') {
               break;
            }

            var11 |= var10 >= 0;
            var10 = var2;

            while (var2 < var13) {
               int var14 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.tryToParseFourDigits(var1, var2 + 1);
               if (var14 < 0) {
                  break;
               }

               var7 = 10000L * var7 + var14;
               var2 += 4;
            }
         }

         var2++;
      }

      int var15 = var2;
      int var16;
      int var24;
      if (var10 < 0) {
         var24 = var15 - var9;
         var10 = var15;
         var16 = 0;
      } else {
         var24 = var15 - var9 - 1;
         var16 = var10 - var15 + 1;
      }

      int var17 = 0;
      if ((var12 | ' ') == 101) {
         var12 = charAt(var1, ++var2, var4);
         boolean var18 = var12 == '-';
         if (var18 || var12 == '+') {
            var12 = charAt(var1, ++var2, var4);
         }

         var11 |= !OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var12);

         do {
            if (var17 < 1024) {
               var17 = 10 * var17 + var12 - 48;
            }

            var12 = charAt(var1, ++var2, var4);
         } while (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var12));

         if (var18) {
            var17 = -var17;
         }

         var16 += var17;
      }

      if (var12 == 'd' | var12 == 'D' | var12 == 'f' | var12 == 'F') {
         var2++;
      }

      var2 = skipWhitespace(var1, var2, var4);
      if (!var11 && var2 >= var4 && (var6 || var24 != 0)) {
         int var19 = 0;
         int var20;
         boolean var25;
         if (var24 > 19) {
            var7 = 0L;

            for (var2 = var9; var2 < var15; var2++) {
               var12 = var1[var2];
               if (var12 == '.') {
                  var19++;
               } else {
                  if (Long.compareUnsigned(var7, 1000000000000000000L) >= 0) {
                     break;
                  }

                  var7 = 10L * var7 + var12 - 48L;
               }
            }

            var25 = var2 < var15;
            var20 = var10 - var2 + var19 + var17;
         } else {
            var25 = false;
            var20 = 0;
         }

         return this.valueOfFloatLiteral(var1, var3, var4, var5, var7, var16, var25, var20);
      } else {
         throw new NumberFormatException("illegal syntax");
      }
   }

   public long parseFloatingPointLiteral(char[] var1, int var2, int var3) {
      int var4 = var2 + var3;
      if (var2 >= 0 && var4 >= var2 && var4 <= var1.length && var3 <= 2147483643) {
         int var5 = skipWhitespace(var1, var2, var4);
         if (var5 == var4) {
            throw new NumberFormatException("illegal syntax");
         }

         char var6 = var1[var5];
         boolean var7 = var6 == '-';
         if (var7 || var6 == '+') {
            var6 = charAt(var1, ++var5, var4);
            if (var6 == 0) {
               throw new NumberFormatException("illegal syntax");
            }
         }

         if (var6 >= 'I') {
            return this.parseNaNOrInfinity(var1, var5, var4, var7);
         }

         boolean var8 = var6 == '0';
         if (var8) {
            var6 = charAt(var1, ++var5, var4);
            if (var6 == 'x' || var6 == 'X') {
               return this.parseHexFloatLiteral(var1, var5 + 1, var2, var4, var7);
            }
         }

         return this.parseDecFloatLiteral(var1, var5, var2, var4, var7, var8);
      } else {
         throw new IllegalArgumentException("offset < 0 or length > str.length");
      }
   }

   private long parseHexFloatLiteral(char[] var1, int var2, int var3, int var4, boolean var5) {
      long var6 = 0L;
      int var8 = 0;
      int var9 = var2;
      int var10 = -1;
      boolean var12 = false;
      char var13 = '\u0000';

      while (var2 < var4) {
         var13 = var1[var2];
         int var14 = lookupHex(var13);
         if (var14 >= 0) {
            var6 = var6 << 4 | var14;
         } else {
            if (var14 != -4) {
               break;
            }

            var12 |= var10 >= 0;
            var10 = var2;

            while (var2 < var4 - 8) {
               long var15 = this.tryToParseEightHexDigits(var1, var2 + 1);
               if (var15 < 0L) {
                  break;
               }

               var6 = (var6 << 32) + var15;
               var2 += 8;
            }
         }

         var2++;
      }

      int var22 = var2;
      int var11;
      if (var10 < 0) {
         var11 = var22 - var9;
         var10 = var22;
      } else {
         var11 = var22 - var9 - 1;
         var8 = Math.min(var10 - var2 + 1, 1024) * 4;
      }

      int var23 = 0;
      boolean var16 = (var13 | ' ') == 112;
      if (var16) {
         var13 = charAt(var1, ++var2, var4);
         boolean var17 = var13 == '-';
         if (var17 || var13 == '+') {
            var13 = charAt(var1, ++var2, var4);
         }

         var12 |= !OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var13);

         do {
            if (var23 < 1024) {
               var23 = 10 * var23 + var13 - 48;
            }

            var13 = charAt(var1, ++var2, var4);
         } while (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var13));

         if (var17) {
            var23 = -var23;
         }

         var8 += var23;
      }

      if (var13 == 'd' | var13 == 'D' | var13 == 'f' | var13 == 'F') {
         var2++;
      }

      var2 = skipWhitespace(var1, var2, var4);
      if (!var12 && var2 >= var4 && var11 != 0 && var16) {
         int var18 = 0;
         boolean var24;
         if (var11 > 16) {
            var6 = 0L;

            for (var2 = var9; var2 < var22; var2++) {
               var13 = var1[var2];
               int var19 = lookupHex(var13);
               if (var19 >= 0) {
                  if (Long.compareUnsigned(var6, 1000000000000000000L) >= 0) {
                     break;
                  }

                  var6 = var6 << 4 | var19;
               } else {
                  var18++;
               }
            }

            var24 = var2 < var22;
         } else {
            var24 = false;
         }

         return this.valueOfHexLiteral(var1, var3, var4, var5, var6, var8, var24, (var10 - var2 + var18) * 4 + var23);
      } else {
         throw new NumberFormatException("illegal syntax");
      }
   }

   private long parseNaNOrInfinity(char[] var1, int var2, int var3, boolean var4) {
      if (var1[var2] == 'N') {
         if (var2 + 2 < var3 && var1[var2 + 1] == 'a' && var1[var2 + 2] == 'N') {
            var2 = skipWhitespace(var1, var2 + 3, var3);
            if (var2 == var3) {
               return this.nan();
            }
         }
      } else if (var2 + 7 < var3
         && var1[var2] == 'I'
         && var1[var2 + 1] == 'n'
         && var1[var2 + 2] == 'f'
         && var1[var2 + 3] == 'i'
         && var1[var2 + 4] == 'n'
         && var1[var2 + 5] == 'i'
         && var1[var2 + 6] == 't'
         && var1[var2 + 7] == 'y') {
         var2 = skipWhitespace(var1, var2 + 8, var3);
         if (var2 == var3) {
            return var4 ? this.negativeInfinity() : this.positiveInfinity();
         }
      }

      throw new NumberFormatException("illegal syntax");
   }

   abstract long positiveInfinity();

   private long tryToParseEightHexDigits(char[] var1, int var2) {
      return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.tryToParseEightHexDigits(var1, var2);
   }

   abstract long valueOfFloatLiteral(char[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9);

   abstract long valueOfHexLiteral(char[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9);
}
