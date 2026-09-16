package com.nothome.delta.text;

import java.io.CharArrayWriter;
import java.io.Writer;

public class GDiffTextWriter implements DiffTextWriter {
   public static final char LF = '\n';
   public static final char COPY = 'y';
   public static final char DATA = 'i';
   public static final char COMMA = ',';
   static final String GDT = "gdt";
   private CharArrayWriter caw = new CharArrayWriter();
   private Writer w = null;
   public static final int CHUNK_SIZE = 32768;

   public GDiffTextWriter(Writer var1) {
      if (var1 == null) {
         throw new NullPointerException("w");
      }

      this.w = var1;
      var1.write("gdt");
      var1.write(10);
   }

   private String d(int var1) {
      return Integer.toHexString(var1);
   }

   @Override
   public void addCopy(int var1, int var2) {
      this.writeBuf();
      this.w.write(121);
      this.w.write(this.d(var1));
      this.w.write(44);
      this.w.write(this.d(var2));
      this.w.write(10);
   }

   @Override
   public void addData(char var1) {
      this.caw.append(var1);
      if (this.caw.size() > 32768) {
         this.flush();
      }
   }

   private void writeBuf() {
      if (this.caw.size() != 0) {
         this.w.write(105);
         this.w.write(this.d(this.caw.size()));
         this.w.write(10);
         this.caw.writeTo(this.w);
         this.caw.reset();
         this.w.write(10);
      }
   }

   @Override
   public void flush() {
      this.writeBuf();
      this.w.flush();
   }

   @Override
   public void close() {
      this.flush();
      this.w.close();
   }
}
