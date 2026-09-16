package org.tritonus.share.midi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public final class MidiUtils {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAllExceptions");

   private MidiUtils() {
   }

   public static int getUnsignedInteger(byte var0) {
      return var0 < 0 ? var0 + 256 : var0;
   }

   public static int get14bitValue(int var0, int var1) {
      return var0 & 127 | (var1 & 127) << 7;
   }

   public static int get14bitMSB(int var0) {
      return var0 >> 7 & 127;
   }

   public static int get14bitLSB(int var0) {
      return var0 & 127;
   }

   public static byte[] getVariableLengthQuantity(long var0) {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      try {
         writeVariableLengthQuantity(var0, var2);
      } catch (IOException var4) {
         logger.log(Level.ERROR, var4.getMessage(), var4);
      }

      return var2.toByteArray();
   }

   public static int writeVariableLengthQuantity(long var0, OutputStream var2) {
      int var3 = 0;
      boolean var4 = false;
      int var5 = (int)(var0 >> 21 & 127L);
      if (var5 != 0) {
         if (var2 != null) {
            var2.write(var5 | 128);
         }

         var3++;
         var4 = true;
      }

      var5 = (int)(var0 >> 14 & 127L);
      if (var5 != 0 || var4) {
         if (var2 != null) {
            var2.write(var5 | 128);
         }

         var3++;
         var4 = true;
      }

      var5 = (int)(var0 >> 7 & 127L);
      if (var5 != 0 || var4) {
         if (var2 != null) {
            var2.write(var5 | 128);
         }

         var3++;
      }

      var5 = (int)(var0 & 127L);
      if (var2 != null) {
         var2.write(var5);
      }

      return var3 + 1;
   }
}
