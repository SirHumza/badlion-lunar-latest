package io.sigpipe.jbsdiff;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class Offset {
   public static final int OFFSET_SIZE = 8;

   public static int readOffset(InputStream var0) {
      byte[] var1 = new byte[8];
      int var2 = var0.read(var1);
      if (var2 < 8) {
         throw new IOException("Could not read offset.");
      }

      int var3 = 0;
      var3 = var1[7] & 127;
      var3 *= 256;
      var3 += var1[6] & 255;
      var3 *= 256;
      var3 += var1[5] & 255;
      var3 *= 256;
      var3 += var1[4] & 255;
      var3 *= 256;
      var3 += var1[3] & 255;
      var3 *= 256;
      var3 += var1[2] & 255;
      var3 *= 256;
      var3 += var1[1] & 255;
      var3 *= 256;
      var3 += var1[0] & 255;
      if (var3 < 0) {
         throw new IOException("Integer overflow: 64-bit offsets not supported.");
      }

      if ((var1[7] & 128) != 0) {
         var3 = -var3;
      }

      return var3;
   }

   public static void writeOffset(int var0, OutputStream var1) {
      byte[] var2 = new byte[8];
      int var3 = 0;
      if (var0 < 0) {
         var3 = -var0;
         var2[7] = (byte)(var2[7] | 128);
      } else {
         var3 = var0;
      }

      var2[0] = (byte)(var2[0] | var3 % 256);
      var3 -= var2[0] & 255;
      var3 /= 256;
      var2[1] = (byte)(var2[1] | var3 % 256);
      var3 -= var2[1] & 255;
      var3 /= 256;
      var2[2] = (byte)(var2[2] | var3 % 256);
      var3 -= var2[2] & 255;
      var3 /= 256;
      var2[3] = (byte)(var2[3] | var3 % 256);
      var3 -= var2[3] & 255;
      var3 /= 256;
      var2[4] = (byte)(var2[4] | var3 % 256);
      var3 -= var2[4] & 255;
      var3 /= 256;
      var2[5] = (byte)(var2[5] | var3 % 256);
      var3 -= var2[5] & 255;
      var3 /= 256;
      var2[6] = (byte)(var2[6] | var3 % 256);
      var3 -= var2[6] & 255;
      var3 /= 256;
      var2[7] = (byte)(var2[7] | var3 % 256);
      var1.write(var2);
   }
}
