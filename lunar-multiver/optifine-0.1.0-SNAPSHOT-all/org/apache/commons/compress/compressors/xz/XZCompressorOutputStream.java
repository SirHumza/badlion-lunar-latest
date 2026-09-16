package org.apache.commons.compress.compressors.xz;

import java.io.OutputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.XZOutputStream;

public class XZCompressorOutputStream extends CompressorOutputStream {
   private final XZOutputStream out;

   public XZCompressorOutputStream(OutputStream var1) {
      this.out = new XZOutputStream(var1, new LZMA2Options());
   }

   public XZCompressorOutputStream(OutputStream var1, int var2) {
      this.out = new XZOutputStream(var1, new LZMA2Options(var2));
   }

   @Override
   public void write(int var1) {
      this.out.write(var1);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      this.out.write(var1, var2, var3);
   }

   @Override
   public void flush() {
      this.out.flush();
   }

   public void finish() {
      this.out.finish();
   }

   @Override
   public void close() {
      this.out.close();
   }
}
