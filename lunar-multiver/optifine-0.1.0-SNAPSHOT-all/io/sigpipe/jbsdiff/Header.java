package io.sigpipe.jbsdiff;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;

class Header {
   public static final int HEADER_SIZE = 32;
   public static final String HEADER_MAGIC = "BSDIFF40";
   private String magic;
   private int controlLength;
   private int diffLength;
   private int outLength;

   public Header() {
   }

   public Header(InputStream var1) {
      DataInputStream var2 = new DataInputStream(var1);
      byte[] var3 = new byte[8];
      var2.read(var3);
      this.magic = new String(var3);
      if (!this.magic.equals("BSDIFF40")) {
         throw new InvalidHeaderException("Header missing magic number");
      }

      this.controlLength = Offset.readOffset(var2);
      this.diffLength = Offset.readOffset(var2);
      this.outLength = Offset.readOffset(var2);
      this.verify();
   }

   public Header(int var1, int var2, int var3) {
      this.controlLength = var1;
      this.diffLength = var2;
      this.outLength = var3;
      this.verify();
   }

   public void write(OutputStream var1) {
      var1.write("BSDIFF40".getBytes());
      Offset.writeOffset(this.controlLength, var1);
      Offset.writeOffset(this.diffLength, var1);
      Offset.writeOffset(this.outLength, var1);
   }

   private void verify() {
      if (this.controlLength < 0) {
         throw new InvalidHeaderException("control block length", this.controlLength);
      }

      if (this.diffLength < 0) {
         throw new InvalidHeaderException("diff block length", this.diffLength);
      }

      if (this.outLength < 0) {
         throw new InvalidHeaderException("output file length", this.outLength);
      }
   }

   @Override
   public String toString() {
      String var1 = "";
      var1 = var1 + this.magic + "\n";
      var1 = var1 + "control bytes = " + this.controlLength + "\n";
      var1 = var1 + "diff bytes = " + this.diffLength + "\n";
      return var1 + "output size = " + this.outLength;
   }

   public int getControlLength() {
      return this.controlLength;
   }

   public void setControlLength(int var1) {
      this.controlLength = var1;
      this.verify();
   }

   public int getDiffLength() {
      return this.diffLength;
   }

   public void setDiffLength(int var1) {
      this.diffLength = var1;
      this.verify();
   }

   public int getOutputLength() {
      return this.outLength;
   }

   public void setOutputLength(int var1) {
      this.outLength = var1;
      this.verify();
   }
}
