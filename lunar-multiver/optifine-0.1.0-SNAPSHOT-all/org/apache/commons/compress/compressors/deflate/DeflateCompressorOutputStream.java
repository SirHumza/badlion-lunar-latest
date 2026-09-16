package org.apache.commons.compress.compressors.deflate;

import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;

public class DeflateCompressorOutputStream extends CompressorOutputStream {
   private final DeflaterOutputStream out;

   public DeflateCompressorOutputStream(OutputStream var1) {
      this(var1, new DeflateParameters());
   }

   public DeflateCompressorOutputStream(OutputStream var1, DeflateParameters var2) {
      this.out = new DeflaterOutputStream(var1, new Deflater(var2.getCompressionLevel(), !var2.withZlibHeader()));
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
