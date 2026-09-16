package org.apache.commons.compress.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;

public class ChecksumVerifyingInputStream extends InputStream {
   private final InputStream in;
   private long bytesRemaining;
   private final long expectedChecksum;
   private final Checksum checksum;

   public ChecksumVerifyingInputStream(Checksum var1, InputStream var2, long var3, long var5) {
      this.checksum = var1;
      this.in = var2;
      this.expectedChecksum = var5;
      this.bytesRemaining = var3;
   }

   @Override
   public int read() {
      if (this.bytesRemaining <= 0L) {
         return -1;
      }

      int var1 = this.in.read();
      if (var1 >= 0) {
         this.checksum.update(var1);
         this.bytesRemaining--;
      }

      if (this.bytesRemaining == 0L && this.expectedChecksum != this.checksum.getValue()) {
         throw new IOException("Checksum verification failed");
      } else {
         return var1;
      }
   }

   @Override
   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      int var4 = this.in.read(var1, var2, var3);
      if (var4 >= 0) {
         this.checksum.update(var1, var2, var4);
         this.bytesRemaining -= var4;
      }

      if (this.bytesRemaining <= 0L && this.expectedChecksum != this.checksum.getValue()) {
         throw new IOException("Checksum verification failed");
      } else {
         return var4;
      }
   }

   @Override
   public long skip(long var1) {
      return this.read() >= 0 ? 1L : 0L;
   }

   @Override
   public void close() {
      this.in.close();
   }
}
