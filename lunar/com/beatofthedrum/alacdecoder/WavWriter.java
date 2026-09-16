package com.beatofthedrum.alacdecoder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class WavWriter {
   private static final Logger logger = System.getLogger(WavWriter.class.getName());

   static void writeUInt32(FileOutputStream var0, int var1) {
      byte[] var2 = new byte[]{(byte)var1, (byte)(var1 >>> 8), (byte)(var1 >>> 16), (byte)(var1 >>> 24)};

      try {
         var0.write(var2, 0, 4);
      } catch (IOException var4) {
         logger.log(Level.DEBUG, var4.toString());
      }
   }

   static void writeUInt16(FileOutputStream var0, int var1) {
      byte[] var2 = new byte[]{(byte)var1, (byte)(var1 >>> 8)};

      try {
         var0.write(var2, 0, 2);
      } catch (IOException var4) {
         logger.log(Level.DEBUG, var4.toString());
      }
   }

   public static void writeHeaders(FileOutputStream var0, int var1, int var2, int var3, int var4, int var5) {
      byte[] var6 = new byte[]{82, 73, 70, 70};

      try {
         var0.write(var6, 0, 4);
      } catch (IOException var11) {
         logger.log(Level.DEBUG, var11.toString());
      }

      writeUInt32(var0, 36 + var1);
      var6[0] = 87;
      var6[1] = 65;
      var6[2] = 86;
      var6[3] = 69;

      try {
         var0.write(var6, 0, 4);
      } catch (IOException var10) {
         logger.log(Level.DEBUG, var10.toString());
      }

      var6[0] = 102;
      var6[1] = 109;
      var6[2] = 116;
      var6[3] = 32;

      try {
         var0.write(var6, 0, 4);
      } catch (IOException var9) {
         logger.log(Level.DEBUG, var9.toString());
      }

      writeUInt32(var0, 16);
      writeUInt16(var0, 1);
      writeUInt16(var0, var2);
      writeUInt32(var0, var3);
      writeUInt32(var0, var3 * var2 * var4);
      writeUInt16(var0, var2 * var4);
      writeUInt16(var0, var5);
      var6[0] = 100;
      var6[1] = 97;
      var6[2] = 116;
      var6[3] = 97;

      try {
         var0.write(var6, 0, 4);
      } catch (IOException var8) {
         logger.log(Level.DEBUG, var8.toString());
      }

      writeUInt32(var0, var1);
   }
}
