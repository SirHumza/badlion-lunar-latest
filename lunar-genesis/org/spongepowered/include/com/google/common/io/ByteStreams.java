package org.spongepowered.include.com.google.common.io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class ByteStreams {
   private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() {
      @Override
      public void write(int var1) {
      }

      @Override
      public void write(byte[] var1) {
         Preconditions.checkNotNull(var1);
      }

      @Override
      public void write(byte[] var1, int var2, int var3) {
         Preconditions.checkNotNull(var1);
      }

      @Override
      public String toString() {
         return "ByteStreams.nullOutputStream()";
      }
   };

   static byte[] createBuffer() {
      return new byte[8192];
   }

   @CanIgnoreReturnValue
   public static long copy(InputStream var0, OutputStream var1) {
      Preconditions.checkNotNull(var0);
      Preconditions.checkNotNull(var1);
      byte[] var2 = createBuffer();
      long var3 = 0L;

      while (true) {
         int var5 = var0.read(var2);
         if (var5 == -1) {
            return var3;
         }

         var1.write(var2, 0, var5);
         var3 += var5;
      }
   }

   public static byte[] toByteArray(InputStream var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream(Math.max(32, var0.available()));
      copy(var0, var1);
      return var1.toByteArray();
   }

   static byte[] toByteArray(InputStream var0, int var1) {
      byte[] var2 = new byte[var1];
      int var3 = var1;

      while (var3 > 0) {
         int var4 = var1 - var3;
         int var5 = var0.read(var2, var4, var3);
         if (var5 == -1) {
            return Arrays.copyOf(var2, var4);
         }

         var3 -= var5;
      }

      int var7 = var0.read();
      if (var7 == -1) {
         return var2;
      }

      ByteStreams.FastByteArrayOutputStream var8 = new ByteStreams.FastByteArrayOutputStream();
      var8.write(var7);
      copy(var0, var8);
      byte[] var6 = new byte[var2.length + var8.size()];
      System.arraycopy(var2, 0, var6, 0, var2.length);
      var8.writeTo(var6, var2.length);
      return var6;
   }

   private static final class FastByteArrayOutputStream extends ByteArrayOutputStream {
      private FastByteArrayOutputStream() {
      }

      void writeTo(byte[] var1, int var2) {
         System.arraycopy(this.buf, 0, var1, var2, this.count);
      }
   }
}
