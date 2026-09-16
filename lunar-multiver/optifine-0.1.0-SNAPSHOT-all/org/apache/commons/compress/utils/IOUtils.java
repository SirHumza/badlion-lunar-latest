package org.apache.commons.compress.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class IOUtils {
   private static final int COPY_BUF_SIZE = 8024;
   private static final int SKIP_BUF_SIZE = 4096;
   private static final byte[] SKIP_BUF = new byte[4096];

   private IOUtils() {
   }

   public static long copy(InputStream var0, OutputStream var1) {
      return copy(var0, var1, 8024);
   }

   public static long copy(InputStream var0, OutputStream var1, int var2) {
      byte[] var3 = new byte[var2];
      int var4 = 0;
      long var5 = 0L;

      while (-1 != (var4 = var0.read(var3))) {
         var1.write(var3, 0, var4);
         var5 += var4;
      }

      return var5;
   }

   public static long skip(InputStream var0, long var1) {
      long var3 = var1;

      while (var1 > 0L) {
         long var5 = var0.skip(var1);
         if (var5 == 0L) {
            break;
         }

         var1 -= var5;
      }

      while (var1 > 0L) {
         int var7 = readFully(var0, SKIP_BUF, 0, (int)Math.min(var1, 4096L));
         if (var7 < 1) {
            break;
         }

         var1 -= var7;
      }

      return var3 - var1;
   }

   public static int readFully(InputStream var0, byte[] var1) {
      return readFully(var0, var1, 0, var1.length);
   }

   public static int readFully(InputStream var0, byte[] var1, int var2, int var3) {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         int var4 = 0;
         int var5 = 0;

         while (var4 != var3) {
            var5 = var0.read(var1, var2 + var4, var3 - var4);
            if (var5 == -1) {
               break;
            }

            var4 += var5;
         }

         return var4;
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public static byte[] toByteArray(InputStream var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      copy(var0, var1);
      return var1.toByteArray();
   }

   public static void closeQuietly(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (IOException var2) {
         }
      }
   }
}
