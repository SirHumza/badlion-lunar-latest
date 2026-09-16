package org.fusesource.jansi.io;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class FastBufferedOutputStream extends FilterOutputStream {
   protected final byte[] buf = new byte[8192];
   protected int count;

   public FastBufferedOutputStream(OutputStream var1) {
      super(var1);
   }

   @Override
   public void write(int var1) {
      if (this.count >= this.buf.length) {
         this.flushBuffer();
      }

      this.buf[this.count++] = (byte)var1;
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      if (var3 >= this.buf.length) {
         this.flushBuffer();
         this.out.write(var1, var2, var3);
      } else {
         if (var3 > this.buf.length - this.count) {
            this.flushBuffer();
         }

         System.arraycopy(var1, var2, this.buf, this.count, var3);
         this.count += var3;
      }
   }

   private void flushBuffer() {
      if (this.count > 0) {
         this.out.write(this.buf, 0, this.count);
         this.count = 0;
      }
   }

   @Override
   public void flush() {
      this.flushBuffer();
      this.out.flush();
   }
}
