package org.apache.commons.compress.compressors.xz;

import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.tukaani.xz.SingleXZInputStream;
import org.tukaani.xz.XZ;
import org.tukaani.xz.XZInputStream;

public class XZCompressorInputStream extends CompressorInputStream {
   private final InputStream in;

   public static boolean matches(byte[] var0, int var1) {
      if (var1 < XZ.HEADER_MAGIC.length) {
         return false;
      }

      for (int var2 = 0; var2 < XZ.HEADER_MAGIC.length; var2++) {
         if (var0[var2] != XZ.HEADER_MAGIC[var2]) {
            return false;
         }
      }

      return true;
   }

   public XZCompressorInputStream(InputStream var1) {
      this(var1, false);
   }

   public XZCompressorInputStream(InputStream var1, boolean var2) {
      if (var2) {
         this.in = new XZInputStream(var1);
      } else {
         this.in = new SingleXZInputStream(var1);
      }
   }

   @Override
   public int read() {
      int var1 = this.in.read();
      this.count(var1 == -1 ? -1 : 1);
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
