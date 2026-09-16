package com.nothome.delta;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;

public class GDiffWriter implements DiffWriter, AutoCloseable {
   public static final int CHUNK_SIZE = 32767;
   public static final byte EOF = 0;
   public static final int DATA_MAX = 246;
   public static final int DATA_USHORT = 247;
   public static final int DATA_INT = 248;
   public static final int COPY_USHORT_UBYTE = 249;
   public static final int COPY_USHORT_USHORT = 250;
   public static final int COPY_USHORT_INT = 251;
   public static final int COPY_INT_UBYTE = 252;
   public static final int COPY_INT_USHORT = 253;
   public static final int COPY_INT_INT = 254;
   public static final int COPY_LONG_INT = 255;
   private ByteArrayOutputStream buf = new ByteArrayOutputStream();
   private boolean debug = false;
   private DataOutputStream output = null;

   public GDiffWriter(DataOutputStream var1) {
      this.output = var1;
      this.output.writeByte(209);
      this.output.writeByte(255);
      this.output.writeByte(209);
      this.output.writeByte(255);
      this.output.writeByte(4);
   }

   public GDiffWriter(OutputStream var1) {
      this(new DataOutputStream(var1));
   }

   @Override
   public void addCopy(long var1, int var3) {
      this.writeBuf();
      if (this.debug) {
         System.err.println("COPY off: " + var1 + ", len: " + var3);
      }

      if (var1 > 2147483647L) {
         this.output.writeByte(255);
         this.output.writeLong(var1);
         this.output.writeInt(var3);
      } else if (var1 < 65536L) {
         if (var3 < 256) {
            this.output.writeByte(249);
            this.output.writeShort((int)var1);
            this.output.writeByte(var3);
         } else if (var3 > 65535) {
            this.output.writeByte(251);
            this.output.writeShort((int)var1);
            this.output.writeInt(var3);
         } else {
            this.output.writeByte(250);
            this.output.writeShort((int)var1);
            this.output.writeShort(var3);
         }
      } else if (var3 < 256) {
         this.output.writeByte(252);
         this.output.writeInt((int)var1);
         this.output.writeByte(var3);
      } else if (var3 > 65535) {
         this.output.writeByte(254);
         this.output.writeInt((int)var1);
         this.output.writeInt(var3);
      } else {
         this.output.writeByte(253);
         this.output.writeInt((int)var1);
         this.output.writeShort(var3);
      }
   }

   @Override
   public void addData(byte var1) {
      this.buf.write(var1);
      if (this.buf.size() >= 32767) {
         this.writeBuf();
      }
   }

   private void writeBuf() {
      if (this.buf.size() > 0) {
         if (this.buf.size() <= 246) {
            this.output.writeByte(this.buf.size());
         } else if (this.buf.size() <= 65535) {
            this.output.writeByte(247);
            this.output.writeShort(this.buf.size());
         } else {
            this.output.writeByte(248);
            this.output.writeInt(this.buf.size());
         }

         this.buf.writeTo(this.output);
         this.buf.reset();
      }
   }

   @Override
   public void flush() {
      this.writeBuf();
      this.output.flush();
   }

   @Override
   public void close() {
      try (DataOutputStream var1 = this.output) {
         this.flush();
         this.output.write(0);
      }
   }
}
