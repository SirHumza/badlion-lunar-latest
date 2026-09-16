package org.apache.commons.compress.archivers.cpio;

class CpioUtil {
   static long fileType(long var0) {
      return var0 & 61440L;
   }

   static long byteArray2long(byte[] var0, boolean var1) {
      if (var0.length % 2 != 0) {
         throw new UnsupportedOperationException();
      }

      long var2 = 0L;
      boolean var4 = false;
      byte[] var5 = new byte[var0.length];
      System.arraycopy(var0, 0, var5, 0, var0.length);
      if (!var1) {
         byte var6 = 0;

         for (int var9 = 0; var9 < var5.length; var9++) {
            var6 = var5[var9];
            var5[var9++] = var5[var9];
            var5[var9] = var6;
         }
      }

      var2 = var5[0] & 0xFF;

      for (int var11 = 1; var11 < var5.length; var11++) {
         var2 <<= 8;
         var2 |= var5[var11] & 0xFF;
      }

      return var2;
   }

   static byte[] long2byteArray(long var0, int var2, boolean var3) {
      byte[] var4 = new byte[var2];
      boolean var5 = false;
      long var6 = 0L;
      if (var2 % 2 == 0 && var2 >= 2) {
         var6 = var0;

         for (int var9 = var2 - 1; var9 >= 0; var9--) {
            var4[var9] = (byte)(var6 & 255L);
            var6 >>= 8;
         }

         if (!var3) {
            byte var8 = 0;

            for (int var10 = 0; var10 < var2; var10++) {
               var8 = var4[var10];
               var4[var10++] = var4[var10];
               var4[var10] = var8;
            }
         }

         return var4;
      } else {
         throw new UnsupportedOperationException();
      }
   }
}
