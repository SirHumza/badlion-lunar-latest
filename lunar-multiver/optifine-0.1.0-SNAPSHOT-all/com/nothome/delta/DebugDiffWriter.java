package com.nothome.delta;

import java.io.ByteArrayOutputStream;

public class DebugDiffWriter implements DiffWriter {
   private ByteArrayOutputStream os = new ByteArrayOutputStream();

   @Override
   public void addCopy(long var1, int var3) {
      if (this.os.size() > 0) {
         this.writeBuf();
      }

      System.err.println("COPY off: " + var1 + ", len: " + var3);
   }

   @Override
   public void addData(byte var1) {
      this.os.write(var1);
      this.writeBuf();
   }

   private void writeBuf() {
      System.err.print("DATA: ");
      byte[] var1 = this.os.toByteArray();

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == 10) {
            System.err.print("\\n");
         } else {
            System.err.print(String.valueOf((char)var1[var2]));
         }
      }

      System.err.println("");
      this.os.reset();
   }

   @Override
   public void flush() {
      System.err.println("FLUSH");
   }

   @Override
   public void close() {
      System.err.println("CLOSE");
   }
}
