package org.mozilla.universalchardet;

import java.io.OutputStream;

public class EncodingDetectorOutputStream extends OutputStream {
   private OutputStream out;
   private final UniversalDetector detector = new UniversalDetector(null);

   public EncodingDetectorOutputStream(OutputStream var1) {
      this.out = var1;
   }

   @Override
   public void close() {
      this.out.close();
      this.detector.dataEnd();
   }

   @Override
   public void flush() {
      this.out.flush();
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      this.out.write(var1, var2, var3);
      if (!this.detector.isDone()) {
         this.detector.handleData(var1, var2, var3);
      }
   }

   @Override
   public void write(byte[] var1) {
      this.write(var1, 0, var1.length);
   }

   @Override
   public void write(int var1) {
      this.write(new byte[]{(byte)var1});
   }

   public String getDetectedCharset() {
      return this.detector.getDetectedCharset();
   }
}
