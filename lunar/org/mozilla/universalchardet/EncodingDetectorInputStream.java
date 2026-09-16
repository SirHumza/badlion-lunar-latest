package org.mozilla.universalchardet;

import java.io.InputStream;

public class EncodingDetectorInputStream extends InputStream {
   private InputStream in;
   private final UniversalDetector detector = new UniversalDetector(null);

   public EncodingDetectorInputStream(InputStream var1) {
      this.in = var1;
   }

   @Override
   public int available() {
      return this.in.available();
   }

   @Override
   public void close() {
      this.in.close();
   }

   @Override
   public void mark(int var1) {
      this.in.mark(var1);
   }

   @Override
   public boolean markSupported() {
      return this.in.markSupported();
   }

   @Override
   public int read() {
      byte[] var1 = new byte[1];
      int var2 = this.read(var1, 0, 1);
      return var2 >= 0 ? var1[0] : -1;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      int var4 = this.in.read(var1, var2, var3);
      if (!this.detector.isDone() && var4 > 0) {
         this.detector.handleData(var1, var2, var4);
      }

      if (var4 == -1) {
         this.detector.dataEnd();
      }

      return var4;
   }

   @Override
   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   @Override
   public void reset() {
      this.in.reset();
   }

   @Override
   public long skip(long var1) {
      if (this.detector.isDone()) {
         return this.in.skip(var1);
      }

      int var3 = 0;
      long var4 = -1L;

      for (long var6 = 0L; var6 < var1 && var3 >= 0; var6++) {
         var3 = this.in.read();
         var4++;
      }

      return var4;
   }

   public String getDetectedCharset() {
      return this.detector.getDetectedCharset();
   }
}
