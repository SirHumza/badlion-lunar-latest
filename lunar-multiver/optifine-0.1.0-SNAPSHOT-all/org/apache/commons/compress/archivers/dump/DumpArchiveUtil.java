package org.apache.commons.compress.archivers.dump;

import org.apache.commons.compress.archivers.zip.ZipEncoding;

class DumpArchiveUtil {
   private DumpArchiveUtil() {
   }

   public static int calculateChecksum(byte[] var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < 256; var2++) {
         var1 += convert32(var0, 4 * var2);
      }

      return 84446 - (var1 - convert32(var0, 28));
   }

   public static final boolean verify(byte[] var0) {
      int var1 = convert32(var0, 24);
      if (var1 != 60012) {
         return false;
      }

      int var2 = convert32(var0, 28);
      return var2 == calculateChecksum(var0);
   }

   public static final int getIno(byte[] var0) {
      return convert32(var0, 20);
   }

   public static final long convert64(byte[] var0, int var1) {
      long var2 = 0L;
      var2 += (long)var0[var1 + 7] << 56;
      var2 += (long)var0[var1 + 6] << 48 & 71776119061217280L;
      var2 += (long)var0[var1 + 5] << 40 & 280375465082880L;
      var2 += (long)var0[var1 + 4] << 32 & 1095216660480L;
      var2 += (long)var0[var1 + 3] << 24 & 4278190080L;
      var2 += (long)var0[var1 + 2] << 16 & 16711680L;
      var2 += (long)var0[var1 + 1] << 8 & 65280L;
      return var2 + (var0[var1] & 255L);
   }

   public static final int convert32(byte[] var0, int var1) {
      int var2 = 0;
      var2 = var0[var1 + 3] << 24;
      var2 += var0[var1 + 2] << 16 & 0xFF0000;
      var2 += var0[var1 + 1] << 8 & 0xFF00;
      return var2 + (var0[var1] & 0xFF);
   }

   public static final int convert16(byte[] var0, int var1) {
      int var2 = 0;
      var2 += var0[var1 + 1] << 8 & 0xFF00;
      return var2 + (var0[var1] & 0xFF);
   }

   static String decode(ZipEncoding var0, byte[] var1, int var2, int var3) {
      byte[] var4 = new byte[var3];
      System.arraycopy(var1, var2, var4, 0, var3);
      return var0.decode(var4);
   }
}
