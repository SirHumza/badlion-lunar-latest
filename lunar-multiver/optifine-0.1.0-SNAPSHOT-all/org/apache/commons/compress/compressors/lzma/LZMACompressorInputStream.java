package org.apache.commons.compress.compressors.lzma;

import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.tukaani.xz.LZMAInputStream;

public class LZMACompressorInputStream extends CompressorInputStream {
   private final InputStream in;

   public LZMACompressorInputStream(InputStream var1) {
      this.in = new LZMAInputStream(var1);
   }

   @Override
   public int read() {
      int var1 = this.in.read();
      this.count(var1 == -1 ? 0 : 1);
      return var1;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      int var4 = this.in.read(var1, var2, var3);
      this.count(var4);
      return var4;
   }

   @Override
   public long skip(long var1) {
      return this.in.skip(var1);
   }

   @Override
   public int available() {
      return this.in.available();
   }

   @Override
   public void close() {
      this.in.close();
   }
}
