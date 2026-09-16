package com.nothome.delta;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class GDiffPatcher {
   private ByteBuffer buf = ByteBuffer.allocate(1024);
   private byte[] buf2 = this.buf.array();

   public void patch(File var1, File var2, File var3) {
      try (
         RandomAccessFileSeekableSource var4 = new RandomAccessFileSeekableSource(new RandomAccessFile(var1, "r"));
         FileInputStream var6 = new FileInputStream(var2);
         FileOutputStream var8 = new FileOutputStream(var3);
      ) {
         this.patch(var4, var6, var8);
      }
   }

   public void patch(byte[] var1, InputStream var2, OutputStream var3) {
      this.patch(new ByteBufferSeekableSource(var1), var2, var3);
   }

   public byte[] patch(byte[] var1, byte[] var2) {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      this.patch(var1, new ByteArrayInputStream(var2), var3);
      return var3.toByteArray();
   }

   public void patch(SeekableSource var1, InputStream var2, OutputStream var3) {
      DataOutputStream var4 = new DataOutputStream(var3);
      DataInputStream var5 = new DataInputStream(var2);
      if (var5.readUnsignedByte() == 209
         && var5.readUnsignedByte() == 255
         && var5.readUnsignedByte() == 209
         && var5.readUnsignedByte() == 255
         && var5.readUnsignedByte() == 4) {
         while (true) {
            int var6 = var5.readUnsignedByte();
            if (var6 == 0) {
               var4.flush();
               return;
            }

            if (var6 <= 246) {
               this.append(var6, var5, var4);
            } else {
               switch (var6) {
                  case 247:
                     int var18 = var5.readUnsignedShort();
                     this.append(var18, var5, var4);
                     break;
                  case 248:
                     int var17 = var5.readInt();
                     this.append(var17, var5, var4);
                     break;
                  case 249:
                     int var23 = var5.readUnsignedShort();
                     int var16 = var5.readUnsignedByte();
                     this.copy(var23, var16, var1, var4);
                     break;
                  case 250:
                     int var22 = var5.readUnsignedShort();
                     int var15 = var5.readUnsignedShort();
                     this.copy(var22, var15, var1, var4);
                     break;
                  case 251:
                     int var21 = var5.readUnsignedShort();
                     int var14 = var5.readInt();
                     this.copy(var21, var14, var1, var4);
                     break;
                  case 252:
                     int var20 = var5.readInt();
                     int var13 = var5.readUnsignedByte();
                     this.copy(var20, var13, var1, var4);
                     break;
                  case 253:
                     int var19 = var5.readInt();
                     int var12 = var5.readUnsignedShort();
                     this.copy(var19, var12, var1, var4);
                     break;
                  case 254:
                     int var8 = var5.readInt();
                     int var11 = var5.readInt();
                     this.copy(var8, var11, var1, var4);
                     break;
                  case 255:
                     long var9 = var5.readLong();
                     int var7 = var5.readInt();
                     this.copy(var9, var7, var1, var4);
                     break;
                  default:
                     throw new IllegalStateException("command " + var6);
               }
            }
         }
      } else {
         throw new PatchException("magic string not found, aborting!");
      }
   }

   private void copy(long var1, int var3, SeekableSource var4, OutputStream var5) {
      var4.seek(var1);

      while (var3 > 0) {
         int var6 = Math.min(this.buf.capacity(), var3);
         ((Buffer)this.buf).clear().limit(var6);
         int var7 = var4.read(this.buf);
         if (var7 == -1) {
            throw new EOFException("in copy " + var1 + " " + var3);
         }

         var5.write(this.buf.array(), 0, var7);
         var3 -= var7;
      }
   }

   private void append(int var1, InputStream var2, OutputStream var3) {
      while (var1 > 0) {
         int var4 = Math.min(this.buf2.length, var1);
         int var5 = var2.read(this.buf2, 0, var4);
         if (var5 == -1) {
            throw new EOFException("cannot read " + var1);
         }

         var3.write(this.buf2, 0, var5);
         var1 -= var5;
      }
   }

   public static void main(String[] var0) {
      if (var0.length != 3) {
         System.err.println("usage GDiffPatch source patch output");
         System.err.println("aborting..");
      } else {
         try {
            File var1 = new File(var0[0]);
            File var2 = new File(var0[1]);
            File var3 = new File(var0[2]);
            if (var1.length() > 2147483647L || var2.length() > 2147483647L) {
               System.err.println("source or patch is too large, max length is 2147483647");
               System.err.println("aborting..");
               return;
            }

            GDiffPatcher var4 = new GDiffPatcher();
            var4.patch(var1, var2, var3);
            System.out.println("finished patching file");
         } catch (Exception var5) {
            System.err.println("error while patching: " + var5);
         }
      }
   }
}
