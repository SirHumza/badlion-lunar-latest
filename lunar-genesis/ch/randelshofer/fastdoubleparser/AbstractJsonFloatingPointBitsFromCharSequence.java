package ch.randelshofer.fastdoubleparser;

abstract class AbstractJsonFloatingPointBitsFromCharSequence extends AbstractFloatValueParser {
   public final long parseNumber(CharSequence var1, int var2, int var3) {
      int var4 = var2 + var3;
      if (var2 >= 0 && var4 >= var2 && var4 <= var1.length() && var3 <= 2147483643) {
         int var5 = var2;
         char var6 = charAt(var1, var5, var4);
         boolean var7 = var6 == '-';
         if (var7) {
            var6 = charAt(var1, ++var5, var4);
            if (var6 == 0) {
               throw new NumberFormatException("illegal syntax");
            }
         }

         boolean var8 = var6 == '0';
         if (var8) {
            var6 = charAt(var1, ++var5, var4);
            if (var6 == '0') {
               throw new NumberFormatException("illegal syntax");
            }
         }

         long var9 = 0L;
         int var11 = var5;
         int var12 = -1;
         boolean var13 = false;

         while (var5 < var4) {
            var6 = var1.charAt(var5);
            if (FastDoubleSwar.isDigit(var6)) {
               var9 = 10L * var9 + var6 - 48L;
            } else {
               if (var6 != '.') {
                  break;
               }

               var13 |= var12 >= 0;
               var12 = var5;
            }

            var5++;
         }

         int var15 = var5;
         int var14;
         int var16;
         if (var12 < 0) {
            var14 = var15 - var11;
            var12 = var15;
            var16 = 0;
         } else {
            var14 = var15 - var11 - 1;
            var16 = var12 - var15 + 1;
         }

         int var17 = 0;
         if ((var6 | ' ') == 101) {
            var6 = charAt(var1, ++var5, var4);
            boolean var18 = var6 == '-';
            if (var18 || var6 == '+') {
               var6 = charAt(var1, ++var5, var4);
            }

            var13 |= !FastDoubleSwar.isDigit(var6);

            do {
               if (var17 < 1024) {
                  var17 = 10 * var17 + var6 - 48;
               }

               var6 = charAt(var1, ++var5, var4);
            } while (FastDoubleSwar.isDigit(var6));

            if (var18) {
               var17 = -var17;
            }

            var16 += var17;
         }

         if (!var13 && var5 >= var4 && (var8 || var14 != 0)) {
            int var19 = 0;
            int var20;
            boolean var24;
            if (var14 > 19) {
               var9 = 0L;

               for (var5 = var11; var5 < var15; var5++) {
                  var6 = var1.charAt(var5);
                  if (var6 == '.') {
                     var19++;
                  } else {
                     if (Long.compareUnsigned(var9, 1000000000000000000L) >= 0) {
                        break;
                     }

                     var9 = 10L * var9 + var6 - 48L;
                  }
               }

               var24 = var5 < var15;
               var20 = var12 - var5 + var19 + var17;
            } else {
               var24 = false;
               var20 = 0;
            }

            return this.valueOfFloatLiteral(var1, var2, var4, var7, var9, var16, var24, var20);
         } else {
            throw new NumberFormatException("illegal syntax");
         }
      } else {
         throw new IllegalArgumentException("offset < 0 or length > str.length");
      }
   }

   abstract long valueOfFloatLiteral(CharSequence var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9);
}
