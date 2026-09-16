package org.cadixdev.bombe.util;

import java.io.InputStream;
import java.io.OutputStream;

public final class ByteStreams {
   public static void copy(InputStream var0, OutputStream var1, byte[] var2) {
      int var3;
      while ((var3 = var0.read(var2)) != -1) {
         var1.write(var2, 0, var3);
      }
   }

   public static void copy(InputStream var0, OutputStream var1) {
      copy(var0, var1, new byte[8192]);
   }

   private ByteStreams() {
   }
}
