package io.sigpipe.jbsdiff;

import java.io.OutputStream;

public class CountingOutputStream extends OutputStream {
   private OutputStream out;
   private int counter;

   public CountingOutputStream(OutputStream var1) {
      this.out = var1;
   }

   @Override
   public void write(int var1) {
      this.counter++;
      this.out.write(var1);
   }

   public int getCount() {
      return this.counter;
   }
}
