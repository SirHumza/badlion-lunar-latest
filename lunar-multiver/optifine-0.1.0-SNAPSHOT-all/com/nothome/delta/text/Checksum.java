package com.nothome.delta.text;

import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.HashMap;

public class Checksum {
   protected HashMap<Long, Integer> checksums = new HashMap<>();
   private static final char[] single_hash = com.nothome.delta.Checksum.getSingleHash();

   public Checksum(Readable var1, int var2) {
      CharBuffer var3 = CharBuffer.allocate(var2 * 2);
      int var4 = 0;

      while (true) {
         var1.read(var3);
         ((Buffer)var3).flip();
         if (var3.remaining() < var2) {
            return;
         }

         while (var3.remaining() >= var2) {
            long var5 = queryChecksum0(var3, var2);
            this.checksums.put(var5, var4++);
         }

         var3.compact();
      }
   }

   public static long queryChecksum(CharBuffer var0, int var1) {
      ((Buffer)var0).mark();
      long var2 = queryChecksum0(var0, var1);
      ((Buffer)var0).reset();
      return var2;
   }

   private static byte b(char var0) {
      return (byte)var0;
   }

   private static long queryChecksum0(CharBuffer var0, int var1) {
      char var2 = 0;
      char var3 = 0;

      for (int var4 = 0; var4 < var1; var4++) {
         var3 += single_hash[b(var0.get()) + 128];
         var2 += var3;
      }

      return (var2 & '\uffff') << 16 | var3 & 65535;
   }

   public static long incrementChecksum(long var0, char var2, char var3, int var4) {
      char var5 = single_hash[b(var2) + 128];
      char var6 = single_hash[b(var3) + 128];
      int var7 = (int)(var0 & 65535L) - var5 + var6 & 65535;
      int var8 = (int)(var0 >> 16) - var5 * var4 + var7 & 65535;
      return var8 << 16 | var7 & 65535;
   }

   public int findChecksumIndex(long var1) {
      return !this.checksums.containsKey(var1) ? -1 : this.checksums.get(var1);
   }

   @Override
   public String toString() {
      return super.toString() + " checksums=" + this.checksums;
   }
}
