package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static int skipWhitespace(byte[] var0, int var1, int var2) {
      while (var1 < var2 && (var0[var1] & 255) <= 32) {
         var1++;
      }

      return var1;
   }

   abstract long nan();

   abstract long negativeInfinity();

   private long parseDecFloatLiteral(byte[] var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      long var7 = 0L;
      int var9 = var2;
      int var10 = -1;
      boolean var11 = false;
      byte var12 = 0;

      while (var2 < var4) {
         var12 = var1[var2];
         if (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var12)) {
            var7 = 10L * var7 + var12 - 48L;
         } else {
            if (var12 != 46) {
               break;
            }

            var11 |= var10 >= 0;
            var10 = var2;

            while (var2 < var4 - 4) {
               int var13 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.tryToParseFourDigits(var1, var2 + 1);
               if (var13 < 0) {
                  break;
               }

               var7 = 10000L * var7 + var13;
               var2 += 4;
            }
         }

         var2++;
      }

      int var14 = var2;
      int var15;
      int var23;
      if (var10 < 0) {
         var23 = var2 - var9;
         var10 = var2;
         var15 = 0;
      } else {
         var23 = var2 - var9 - 1;
         var15 = var10 - var2 + 1;
      }

      int var16 = 0;
      if ((var12 | 32) == 101) {
         var12 = charAt(var1, ++var2, var4);
         boolean var17 = var12 == 45;
         if (var17 || var12 == 43) {
            var12 = charAt(var1, ++var2, var4);
         }

         var11 |= !OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var12);

         do {
            if (var16 < 1024) {
               var16 = 10 * var16 + var12 - 48;
            }

            var12 = charAt(var1, ++var2, var4);
         } while (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var12));

         if (var17) {
            var16 = -var16;
         }

         var15 += var16;
      }

      if (var12 == 100 | var12 == 68 | var12 == 102 | var12 == 70) {
         var2++;
      }

      var2 = skipWhitespace(var1, var2, var4);
      if (!var11 && var2 >= var4 && (var6 || var23 != 0)) {
         int var18 = 0;
         int var19;
         boolean var24;
         if (var23 > 19) {
            var7 = 0L;

            for (var2 = var9; var2 < var14; var2++) {
               var12 = var1[var2];
               if (var12 == 46) {
                  var18++;
               } else {
                  if (Long.compareUnsigned(var7, 1000000000000000000L) >= 0) {
                     break;
                  }

                  var7 = 10L * var7 + var12 - 48L;
               }
            }

            var24 = var2 < var14;
            var19 = var10 - var2 + var18 + var16;
         } else {
            var24 = false;
            var19 = 0;
         }

         return this.valueOfFloatLiteral(var1, var3, var4, var5, var7, var15, var24, var19);
      } else {
         throw new NumberFormatException("illegal syntax");
      }
   }

   public long parseFloatingPointLiteral(byte[] var1, int var2, int var3) {
      int var4 = var2 + var3;
      if (var2 >= 0 && var4 >= var2 && var4 <= var1.length && var3 <= 2147483643) {
         int var5 = skipWhitespace(var1, var2, var4);
         if (var5 == var4) {
            throw new NumberFormatException("illegal syntax");
         }

         byte var6 = var1[var5];
         boolean var7 = var6 == 45;
         if (var7 || var6 == 43) {
            var6 = charAt(var1, ++var5, var4);
            if (var6 == 0) {
               throw new NumberFormatException("illegal syntax");
            }
         }

         if (var6 >= 73) {
            return this.parseNaNOrInfinity(var1, var5, var4, var7);
         }

         boolean var8 = var6 == 48;
         if (var8) {
            var6 = charAt(var1, ++var5, var4);
            if (var6 == 120 || var6 == 88) {
               return this.parseHexFloatingPointLiteral(var1, var5 + 1, var2, var4, var7);
            }
         }

         return this.parseDecFloatLiteral(var1, var5, var2, var4, var7, var8);
      } else {
         throw new IllegalArgumentException("offset < 0 or length > str.length");
      }
   }

   private long parseHexFloatingPointLiteral(byte[] var1, int var2, int var3, int var4, boolean var5) {
      long var6 = 0L;
      int var8 = 0;
      int var9 = var2;
      int var10 = -1;
      boolean var12 = false;
      byte var13 = 0;

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

      int var15 = 0;
      boolean var16 = (var13 | 32) == 112;
      if (var16) {
         var13 = charAt(var1, ++var2, var4);
         boolean var17 = var13 == 45;
         if (var17 || var13 == 43) {
            var13 = charAt(var1, ++var2, var4);
         }

         var12 |= !OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var13);

         do {
            if (var15 < 1024) {
               var15 = 10 * var15 + var13 - 48;
            }

            var13 = charAt(var1, ++var2, var4);
         } while (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.isDigit(var13));

         if (var17) {
            var15 = -var15;
         }

         var8 += var15;
      }

      if (var13 == 100 | var13 == 68 | var13 == 102 | var13 == 70) {
         var2++;
      }

      var2 = skipWhitespace(var1, var2, var4);
      if (!var12 && var2 >= var4 && var11 != 0 && var16) {
         int var18 = 0;
         boolean var23;
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

            var23 = var2 < var22;
         } else {
            var23 = false;
         }

         return this.valueOfHexLiteral(var1, var3, var4, var5, var6, var8, var23, (var10 - var2 + var18) * 4 + var15);
      } else {
         throw new NumberFormatException("illegal syntax");
      }
   }

   private long parseNaNOrInfinity(byte[] var1, int var2, int var3, boolean var4) {
      if (var1[var2] == 78) {
         if (var2 + 2 < var3 && var1[var2 + 1] == 97 && var1[var2 + 2] == 78) {
            var2 = skipWhitespace(var1, var2 + 3, var3);
            if (var2 == var3) {
               return this.nan();
            }
         }
      } else if (var2 + 7 < var3 && OOROOCCIRCCRHOIOIORIHCHHOOCCOR.readLongLE(var1, var2) == 8751735898823355977L) {
         var2 = skipWhitespace(var1, var2 + 8, var3);
         if (var2 == var3) {
            return var4 ? this.negativeInfinity() : this.positiveInfinity();
         }
      }

      throw new NumberFormatException("illegal syntax");
   }

   abstract long positiveInfinity();

   abstract long valueOfFloatLiteral(byte[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9);

   abstract long valueOfHexLiteral(byte[] var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9);
}
