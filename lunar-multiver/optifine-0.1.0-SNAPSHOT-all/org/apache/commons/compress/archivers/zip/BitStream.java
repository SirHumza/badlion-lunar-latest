package org.apache.commons.compress.archivers.zip;

import java.io.InputStream;

class BitStream {
   private final InputStream in;
   private long bitCache;
   private int bitCacheSize;
   private static final int[] MASKS = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255};

   BitStream(InputStream var1) {
      this.in = var1;
   }

   private boolean fillCache() {
      boolean var1 = false;

      while (this.bitCacheSize <= 56) {
         long var2 = this.in.read();
         if (var2 == -1L) {
            break;
         }

         var1 = true;
         this.bitCache = this.bitCache | var2 << this.bitCacheSize;
         this.bitCacheSize += 8;
      }

      return var1;
   }

   int nextBit() {
      if (this.bitCacheSize == 0 && !this.fillCache()) {
         return -1;
      }

      int var1 = (int)(this.bitCache & 1L);
      this.bitCache >>>= 1;
      this.bitCacheSize--;
      return var1;
   }

   int nextBits(int var1) {
      if (this.bitCacheSize < var1 && !this.fillCache()) {
         return -1;
      }

      int var2 = (int)(this.bitCache & MASKS[var1]);
      this.bitCache >>>= var1;
      this.bitCacheSize -= var1;
      return var2;
   }

   int nextByte() {
      return this.nextBits(8);
   }
}
