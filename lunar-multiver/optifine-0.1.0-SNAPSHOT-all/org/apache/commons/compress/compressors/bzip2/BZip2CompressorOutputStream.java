package org.apache.commons.compress.compressors.bzip2;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;

public class BZip2CompressorOutputStream extends CompressorOutputStream implements BZip2Constants {
   public static final int MIN_BLOCKSIZE = 1;
   public static final int MAX_BLOCKSIZE = 9;
   private static final int GREATER_ICOST = 15;
   private static final int LESSER_ICOST = 0;
   private int last;
   private final int blockSize100k;
   private int bsBuff;
   private int bsLive;
   private final CRC crc = new CRC();
   private int nInUse;
   private int nMTF;
   private int currentChar = -1;
   private int runLength = 0;
   private int blockCRC;
   private int combinedCRC;
   private final int allowableBlockSize;
   private BZip2CompressorOutputStream.Data data;
   private BlockSort blockSorter;
   private OutputStream out;

   private static void hbMakeCodeLengths(byte[] var0, int[] var1, BZip2CompressorOutputStream.Data var2, int var3, int var4) {
      int[] var5 = var2.heap;
      int[] var6 = var2.weight;
      int[] var7 = var2.parent;
      int var8 = var3;

      while (--var8 >= 0) {
         var6[var8 + 1] = (var1[var8] == 0 ? 1 : var1[var8]) << 8;
      }

      boolean var19 = true;

      while (var19) {
         var19 = false;
         int var9 = var3;
         int var10 = 0;
         var5[0] = 0;
         var6[0] = 0;
         var7[0] = -2;

         for (int var11 = 1; var11 <= var3; var11++) {
            var7[var11] = -1;
            var5[++var10] = var11;
            int var12 = var10;

            int var13;
            for (var13 = var5[var12]; var6[var13] < var6[var5[var12 >> 1]]; var12 >>= 1) {
               var5[var12] = var5[var12 >> 1];
            }

            var5[var12] = var13;
         }

         while (var10 > 1) {
            int var22 = var5[1];
            var5[1] = var5[var10];
            var10--;
            int var25 = 0;
            int var32 = 1;
            int var14 = var5[1];

            while (true) {
               var25 = var32 << 1;
               if (var25 > var10) {
                  break;
               }

               if (var25 < var10 && var6[var5[var25 + 1]] < var6[var5[var25]]) {
                  var25++;
               }

               if (var6[var14] < var6[var5[var25]]) {
                  break;
               }

               var5[var32] = var5[var25];
               var32 = var25;
            }

            var5[var32] = var14;
            int var15 = var5[1];
            var5[1] = var5[var10];
            var10--;
            int var27 = 0;
            var32 = 1;
            var14 = var5[1];

            while (true) {
               var27 = var32 << 1;
               if (var27 > var10) {
                  break;
               }

               if (var27 < var10 && var6[var5[var27 + 1]] < var6[var5[var27]]) {
                  var27++;
               }

               if (var6[var14] < var6[var5[var27]]) {
                  break;
               }

               var5[var32] = var5[var27];
               var32 = var27;
            }

            var5[var32] = var14;
            var7[var22] = var7[var15] = ++var9;
            int var16 = var6[var22];
            int var17 = var6[var15];
            var6[var9] = (var16 & -256) + (var17 & -256) | 1 + ((var16 & 0xFF) > (var17 & 0xFF) ? var16 & 0xFF : var17 & 0xFF);
            var7[var9] = -1;
            var5[++var10] = var9;
            int var37 = 0;
            var32 = var10;
            var37 = var5[var32];

            for (int var18 = var6[var37]; var18 < var6[var5[var32 >> 1]]; var32 >>= 1) {
               var5[var32] = var5[var32 >> 1];
            }

            var5[var32] = var37;
         }

         for (int var23 = 1; var23 <= var3; var23++) {
            int var29 = 0;

            int var39;
            for (int var35 = var23; (var39 = var7[var35]) >= 0; var29++) {
               var35 = var39;
            }

            var0[var23 - 1] = (byte)var29;
            if (var29 > var4) {
               var19 = true;
            }
         }

         if (var19) {
            for (int var24 = 1; var24 < var3; var24++) {
               int var30 = var6[var24] >> 8;
               var30 = 1 + (var30 >> 1);
               var6[var24] = var30 << 8;
            }
         }
      }
   }

   public static int chooseBlockSize(long var0) {
      return var0 > 0L ? (int)Math.min(var0 / 132000L + 1L, 9L) : 9;
   }

   public BZip2CompressorOutputStream(OutputStream var1) {
      this(var1, 9);
   }

   public BZip2CompressorOutputStream(OutputStream var1, int var2) {
      if (var2 < 1) {
         throw new IllegalArgumentException("blockSize(" + var2 + ") < 1");
      }

      if (var2 > 9) {
         throw new IllegalArgumentException("blockSize(" + var2 + ") > 9");
      }

      this.blockSize100k = var2;
      this.out = var1;
      this.allowableBlockSize = this.blockSize100k * 100000 - 20;
      this.init();
   }

   @Override
   public void write(int var1) {
      if (this.out != null) {
         this.write0(var1);
      } else {
         throw new IOException("closed");
      }
   }

   private void writeRun() {
      int var1 = this.last;
      if (var1 < this.allowableBlockSize) {
         int var2 = this.currentChar;
         BZip2CompressorOutputStream.Data var3 = this.data;
         var3.inUse[var2] = true;
         byte var4 = (byte)var2;
         int var5 = this.runLength;
         this.crc.updateCRC(var2, var5);
         switch (var5) {
            case 1:
               var3.block[var1 + 2] = var4;
               this.last = var1 + 1;
               break;
            case 2:
               var3.block[var1 + 2] = var4;
               var3.block[var1 + 3] = var4;
               this.last = var1 + 2;
               break;
            case 3:
               byte[] var8 = var3.block;
               var8[var1 + 2] = var4;
               var8[var1 + 3] = var4;
               var8[var1 + 4] = var4;
               this.last = var1 + 3;
               break;
            default:
               var5 -= 4;
               var3.inUse[var5] = true;
               byte[] var6 = var3.block;
               var6[var1 + 2] = var4;
               var6[var1 + 3] = var4;
               var6[var1 + 4] = var4;
               var6[var1 + 5] = var4;
               var6[var1 + 6] = (byte)var5;
               this.last = var1 + 5;
         }
      } else {
         this.endBlock();
         this.initBlock();
         this.writeRun();
      }
   }

   @Override
   protected void finalize() {
      this.finish();
      super.finalize();
   }

   public void finish() {
      if (this.out != null) {
         try {
            if (this.runLength > 0) {
               this.writeRun();
            }

            this.currentChar = -1;
            this.endBlock();
            this.endCompression();
         } finally {
            this.out = null;
            this.data = null;
            this.blockSorter = null;
         }
      }
   }

   @Override
   public void close() {
      if (this.out != null) {
         OutputStream var1 = this.out;
         this.finish();
         var1.close();
      }
   }

   @Override
   public void flush() {
      OutputStream var1 = this.out;
      if (var1 != null) {
         var1.flush();
      }
   }

   private void init() {
      this.bsPutUByte(66);
      this.bsPutUByte(90);
      this.data = new BZip2CompressorOutputStream.Data(this.blockSize100k);
      this.blockSorter = new BlockSort(this.data);
      this.bsPutUByte(104);
      this.bsPutUByte(48 + this.blockSize100k);
      this.combinedCRC = 0;
      this.initBlock();
   }

   private void initBlock() {
      this.crc.initialiseCRC();
      this.last = -1;
      boolean[] var1 = this.data.inUse;
      int var2 = 256;

      while (--var2 >= 0) {
         var1[var2] = false;
      }
   }

   private void endBlock() {
      this.blockCRC = this.crc.getFinalCRC();
      this.combinedCRC = this.combinedCRC << 1 | this.combinedCRC >>> 31;
      this.combinedCRC = this.combinedCRC ^ this.blockCRC;
      if (this.last != -1) {
         this.blockSort();
         this.bsPutUByte(49);
         this.bsPutUByte(65);
         this.bsPutUByte(89);
         this.bsPutUByte(38);
         this.bsPutUByte(83);
         this.bsPutUByte(89);
         this.bsPutInt(this.blockCRC);
         this.bsW(1, 0);
         this.moveToFrontCodeAndSend();
      }
   }

   private void endCompression() {
      this.bsPutUByte(23);
      this.bsPutUByte(114);
      this.bsPutUByte(69);
      this.bsPutUByte(56);
      this.bsPutUByte(80);
      this.bsPutUByte(144);
      this.bsPutInt(this.combinedCRC);
      this.bsFinishedWithStream();
   }

   public final int getBlockSize() {
      return this.blockSize100k;
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      if (var2 < 0) {
         throw new IndexOutOfBoundsException("offs(" + var2 + ") < 0.");
      }

      if (var3 < 0) {
         throw new IndexOutOfBoundsException("len(" + var3 + ") < 0.");
      }

      if (var2 + var3 > var1.length) {
         throw new IndexOutOfBoundsException("offs(" + var2 + ") + len(" + var3 + ") > buf.length(" + var1.length + ").");
      }

      if (this.out == null) {
         throw new IOException("stream closed");
      }

      int var4 = var2 + var3;

      while (var2 < var4) {
         this.write0(var1[var2++]);
      }
   }

   private void write0(int var1) {
      if (this.currentChar != -1) {
         var1 &= 255;
         if (this.currentChar == var1) {
            if (++this.runLength > 254) {
               this.writeRun();
               this.currentChar = -1;
               this.runLength = 0;
            }
         } else {
            this.writeRun();
            this.runLength = 1;
            this.currentChar = var1;
         }
      } else {
         this.currentChar = var1 & 0xFF;
         this.runLength++;
      }
   }

   private static void hbAssignCodes(int[] var0, byte[] var1, int var2, int var3, int var4) {
      int var5 = 0;

      for (int var6 = var2; var6 <= var3; var6++) {
         for (int var7 = 0; var7 < var4; var7++) {
            if ((var1[var7] & 255) == var6) {
               var0[var7] = var5++;
            }
         }

         var5 <<= 1;
      }
   }

   private void bsFinishedWithStream() {
      while (this.bsLive > 0) {
         int var1 = this.bsBuff >> 24;
         this.out.write(var1);
         this.bsBuff <<= 8;
         this.bsLive -= 8;
      }
   }

   private void bsW(int var1, int var2) {
      OutputStream var3 = this.out;
      int var4 = this.bsLive;
      int var5 = this.bsBuff;

      while (var4 >= 8) {
         var3.write(var5 >> 24);
         var5 <<= 8;
         var4 -= 8;
      }

      this.bsBuff = var5 | var2 << 32 - var4 - var1;
      this.bsLive = var4 + var1;
   }

   private void bsPutUByte(int var1) {
      this.bsW(8, var1);
   }

   private void bsPutInt(int var1) {
      this.bsW(8, var1 >> 24 & 0xFF);
      this.bsW(8, var1 >> 16 & 0xFF);
      this.bsW(8, var1 >> 8 & 0xFF);
      this.bsW(8, var1 & 0xFF);
   }

   private void sendMTFValues() {
      byte[][] var1 = this.data.sendMTFValues_len;
      int var2 = this.nInUse + 2;
      int var3 = 6;

      while (--var3 >= 0) {
         byte[] var4 = var1[var3];
         int var5 = var2;

         while (--var5 >= 0) {
            var4[var5] = 15;
         }
      }

      var3 = this.nMTF < 200 ? 2 : (this.nMTF < 600 ? 3 : (this.nMTF < 1200 ? 4 : (this.nMTF < 2400 ? 5 : 6)));
      this.sendMTFValues0(var3, var2);
      int var7 = this.sendMTFValues1(var3, var2);
      this.sendMTFValues2(var3, var7);
      this.sendMTFValues3(var3, var2);
      this.sendMTFValues4();
      this.sendMTFValues5(var3, var7);
      this.sendMTFValues6(var3, var2);
      this.sendMTFValues7();
   }

   private void sendMTFValues0(int var1, int var2) {
      byte[][] var3 = this.data.sendMTFValues_len;
      int[] var4 = this.data.mtfFreq;
      int var5 = this.nMTF;
      int var6 = 0;

      for (int var7 = var1; var7 > 0; var7--) {
         int var8 = var5 / var7;
         int var9 = var6 - 1;
         int var10 = 0;
         int var11 = var2 - 1;

         while (var10 < var8 && var9 < var11) {
            var10 += var4[++var9];
         }

         if (var9 > var6 && var7 != var1 && var7 != 1 && (var1 - var7 & 1) != 0) {
            var10 -= var4[var9--];
         }

         byte[] var13 = var3[var7 - 1];
         int var12 = var2;

         while (--var12 >= 0) {
            if (var12 >= var6 && var12 <= var9) {
               var13[var12] = 0;
            } else {
               var13[var12] = 15;
            }
         }

         var6 = var9 + 1;
         var5 -= var10;
      }
   }

   private int sendMTFValues1(int var1, int var2) {
      BZip2CompressorOutputStream.Data var3 = this.data;
      int[][] var4 = var3.sendMTFValues_rfreq;
      int[] var5 = var3.sendMTFValues_fave;
      short[] var6 = var3.sendMTFValues_cost;
      char[] var7 = var3.sfmap;
      byte[] var8 = var3.selector;
      byte[][] var9 = var3.sendMTFValues_len;
      byte[] var10 = var9[0];
      byte[] var11 = var9[1];
      byte[] var12 = var9[2];
      byte[] var13 = var9[3];
      byte[] var14 = var9[4];
      byte[] var15 = var9[5];
      int var16 = this.nMTF;
      int var17 = 0;

      for (int var18 = 0; var18 < 4; var18++) {
         int var19 = var1;

         while (--var19 >= 0) {
            var5[var19] = 0;
            int[] var20 = var4[var19];
            int var21 = var2;

            while (--var21 >= 0) {
               var20[var21] = 0;
            }
         }

         var17 = 0;
         var19 = 0;

         while (var19 < this.nMTF) {
            int var31 = Math.min(var19 + 50 - 1, var16 - 1);
            if (var1 == 6) {
               short var34 = 0;
               short var36 = 0;
               short var39 = 0;
               short var24 = 0;
               short var25 = 0;
               short var26 = 0;

               for (int var27 = var19; var27 <= var31; var27++) {
                  char var28 = var7[var27];
                  var34 = (short)(var34 + (var10[var28] & 255));
                  var36 = (short)(var36 + (var11[var28] & 255));
                  var39 = (short)(var39 + (var12[var28] & 255));
                  var24 = (short)(var24 + (var13[var28] & 255));
                  var25 = (short)(var25 + (var14[var28] & 255));
                  var26 = (short)(var26 + (var15[var28] & 255));
               }

               var6[0] = var34;
               var6[1] = var36;
               var6[2] = var39;
               var6[3] = var24;
               var6[4] = var25;
               var6[5] = var26;
            } else {
               int var32 = var1;

               while (--var32 >= 0) {
                  var6[var32] = 0;
               }

               for (int var33 = var19; var33 <= var31; var33++) {
                  char var22 = var7[var33];
                  int var23 = var1;

                  while (--var23 >= 0) {
                     var6[var23] = (short)(var6[var23] + (var9[var23][var22] & 255));
                  }
               }
            }

            int var35 = -1;
            int var37 = var1;
            int var40 = 999999999;

            while (--var37 >= 0) {
               short var42 = var6[var37];
               if (var42 < var40) {
                  var40 = var42;
                  var35 = var37;
               }
            }

            var5[var35]++;
            var8[var17] = (byte)var35;
            var17++;
            int[] var38 = var4[var35];

            for (int var41 = var19; var41 <= var31; var41++) {
               var38[var7[var41]]++;
            }

            var19 = var31 + 1;
         }

         for (int var30 = 0; var30 < var1; var30++) {
            hbMakeCodeLengths(var9[var30], var4[var30], this.data, var2, 20);
         }
      }

      return var17;
   }

   private void sendMTFValues2(int var1, int var2) {
      BZip2CompressorOutputStream.Data var3 = this.data;
      byte[] var4 = var3.sendMTFValues2_pos;
      int var5 = var1;

      while (--var5 >= 0) {
         var4[var5] = (byte)var5;
      }

      for (int var10 = 0; var10 < var2; var10++) {
         byte var6 = var3.selector[var10];
         byte var7 = var4[0];
         int var8 = 0;

         while (var6 != var7) {
            var8++;
            byte var9 = var7;
            var7 = var4[var8];
            var4[var8] = var9;
         }

         var4[0] = var7;
         var3.selectorMtf[var10] = (byte)var8;
      }
   }

   private void sendMTFValues3(int var1, int var2) {
      int[][] var3 = this.data.sendMTFValues_code;
      byte[][] var4 = this.data.sendMTFValues_len;

      for (int var5 = 0; var5 < var1; var5++) {
         int var6 = 32;
         int var7 = 0;
         byte[] var8 = var4[var5];
         int var9 = var2;

         while (--var9 >= 0) {
            int var10 = var8[var9] & 255;
            if (var10 > var7) {
               var7 = var10;
            }

            if (var10 < var6) {
               var6 = var10;
            }
         }

         hbAssignCodes(var3[var5], var4[var5], var6, var7, var2);
      }
   }

   private void sendMTFValues4() {
      boolean[] var1 = this.data.inUse;
      boolean[] var2 = this.data.sentMTFValues4_inUse16;
      int var3 = 16;

      while (--var3 >= 0) {
         var2[var3] = false;
         int var4 = var3 * 16;
         int var5 = 16;

         while (--var5 >= 0) {
            if (var1[var4 + var5]) {
               var2[var3] = true;
            }
         }
      }

      for (int var9 = 0; var9 < 16; var9++) {
         this.bsW(1, var2[var9] ? 1 : 0);
      }

      OutputStream var10 = this.out;
      int var11 = this.bsLive;
      int var12 = this.bsBuff;

      for (int var6 = 0; var6 < 16; var6++) {
         if (var2[var6]) {
            int var7 = var6 * 16;

            for (int var8 = 0; var8 < 16; var8++) {
               while (var11 >= 8) {
                  var10.write(var12 >> 24);
                  var12 <<= 8;
                  var11 -= 8;
               }

               if (var1[var7 + var8]) {
                  var12 |= 1 << 32 - var11 - 1;
               }

               var11++;
            }
         }
      }

      this.bsBuff = var12;
      this.bsLive = var11;
   }

   private void sendMTFValues5(int var1, int var2) {
      this.bsW(3, var1);
      this.bsW(15, var2);
      OutputStream var3 = this.out;
      byte[] var4 = this.data.selectorMtf;
      int var5 = this.bsLive;
      int var6 = this.bsBuff;

      for (int var7 = 0; var7 < var2; var7++) {
         int var8 = 0;

         for (int var9 = var4[var7] & 255; var8 < var9; var8++) {
            while (var5 >= 8) {
               var3.write(var6 >> 24);
               var6 <<= 8;
               var5 -= 8;
            }

            var6 |= 1 << 32 - var5 - 1;
            var5++;
         }

         while (var5 >= 8) {
            var3.write(var6 >> 24);
            var6 <<= 8;
            var5 -= 8;
         }

         var5++;
      }

      this.bsBuff = var6;
      this.bsLive = var5;
   }

   private void sendMTFValues6(int var1, int var2) {
      byte[][] var3 = this.data.sendMTFValues_len;
      OutputStream var4 = this.out;
      int var5 = this.bsLive;
      int var6 = this.bsBuff;

      for (int var7 = 0; var7 < var1; var7++) {
         byte[] var8 = var3[var7];
         int var9 = var8[0] & 255;

         while (var5 >= 8) {
            var4.write(var6 >> 24);
            var6 <<= 8;
            var5 -= 8;
         }

         var6 |= var9 << 32 - var5 - 5;
         var5 += 5;

         for (int var10 = 0; var10 < var2; var10++) {
            int var11;
            for (var11 = var8[var10] & 255; var9 < var11; var9++) {
               while (var5 >= 8) {
                  var4.write(var6 >> 24);
                  var6 <<= 8;
                  var5 -= 8;
               }

               var6 |= 2 << 32 - var5 - 2;
               var5 += 2;
            }

            while (var9 > var11) {
               while (var5 >= 8) {
                  var4.write(var6 >> 24);
                  var6 <<= 8;
                  var5 -= 8;
               }

               var6 |= 3 << 32 - var5 - 2;
               var5 += 2;
               var9--;
            }

            while (var5 >= 8) {
               var4.write(var6 >> 24);
               var6 <<= 8;
               var5 -= 8;
            }

            var5++;
         }
      }

      this.bsBuff = var6;
      this.bsLive = var5;
   }

   private void sendMTFValues7() {
      BZip2CompressorOutputStream.Data var1 = this.data;
      byte[][] var2 = var1.sendMTFValues_len;
      int[][] var3 = var1.sendMTFValues_code;
      OutputStream var4 = this.out;
      byte[] var5 = var1.selector;
      char[] var6 = var1.sfmap;
      int var7 = this.nMTF;
      int var8 = 0;
      int var9 = this.bsLive;
      int var10 = this.bsBuff;

      for (int var11 = 0; var11 < var7; var8++) {
         int var12 = Math.min(var11 + 50 - 1, var7 - 1);
         int var13 = var5[var8] & 255;
         int[] var14 = var3[var13];
         byte[] var15 = var2[var13];

         while (var11 <= var12) {
            char var16 = var6[var11];

            while (var9 >= 8) {
               var4.write(var10 >> 24);
               var10 <<= 8;
               var9 -= 8;
            }

            int var17 = var15[var16] & 255;
            var10 |= var14[var16] << 32 - var9 - var17;
            var9 += var17;
            var11++;
         }

         var11 = var12 + 1;
      }

      this.bsBuff = var10;
      this.bsLive = var9;
   }

   private void moveToFrontCodeAndSend() {
      this.bsW(24, this.data.origPtr);
      this.generateMTFValues();
      this.sendMTFValues();
   }

   private void blockSort() {
      this.blockSorter.blockSort(this.data, this.last);
   }

   private void generateMTFValues() {
      int var1 = this.last;
      BZip2CompressorOutputStream.Data var2 = this.data;
      boolean[] var3 = var2.inUse;
      byte[] var4 = var2.block;
      int[] var5 = var2.fmap;
      char[] var6 = var2.sfmap;
      int[] var7 = var2.mtfFreq;
      byte[] var8 = var2.unseqToSeq;
      byte[] var9 = var2.generateMTFValues_yy;
      int var10 = 0;

      for (int var11 = 0; var11 < 256; var11++) {
         if (var3[var11]) {
            var8[var11] = (byte)var10;
            var10++;
         }
      }

      this.nInUse = var10;
      int var19 = var10 + 1;

      for (int var12 = var19; var12 >= 0; var12--) {
         var7[var12] = 0;
      }

      int var20 = var10;

      while (--var20 >= 0) {
         var9[var20] = (byte)var20;
      }

      var20 = 0;
      int var13 = 0;

      for (int var14 = 0; var14 <= var1; var14++) {
         byte var15 = var8[var4[var5[var14]] & 0xFF];
         byte var16 = var9[0];
         int var17 = 0;

         while (var15 != var16) {
            var17++;
            byte var18 = var16;
            var16 = var9[var17];
            var9[var17] = var18;
         }

         var9[0] = var16;
         if (var17 == 0) {
            var13++;
         } else {
            if (var13 > 0) {
               var13--;

               while (true) {
                  if ((var13 & 1) == 0) {
                     var6[var20] = 0;
                     var20++;
                     var7[0]++;
                  } else {
                     var6[var20] = 1;
                     var20++;
                     var7[1]++;
                  }

                  if (var13 < 2) {
                     var13 = 0;
                     break;
                  }

                  var13 = var13 - 2 >> 1;
               }
            }

            var6[var20] = (char)(var17 + 1);
            var20++;
            var7[var17 + 1]++;
         }
      }

      if (var13 > 0) {
         var13--;

         while (true) {
            if ((var13 & 1) == 0) {
               var6[var20] = 0;
               var20++;
               var7[0]++;
            } else {
               var6[var20] = 1;
               var20++;
               var7[1]++;
            }

            if (var13 < 2) {
               break;
            }

            var13 = var13 - 2 >> 1;
         }
      }

      var6[var20] = (char)var19;
      var7[var19]++;
      this.nMTF = var20 + 1;
   }

   static final class Data {
      final boolean[] inUse = new boolean[256];
      final byte[] unseqToSeq = new byte[256];
      final int[] mtfFreq = new int[258];
      final byte[] selector = new byte[18002];
      final byte[] selectorMtf = new byte[18002];
      final byte[] generateMTFValues_yy = new byte[256];
      final byte[][] sendMTFValues_len = new byte[6][258];
      final int[][] sendMTFValues_rfreq = new int[6][258];
      final int[] sendMTFValues_fave = new int[6];
      final short[] sendMTFValues_cost = new short[6];
      final int[][] sendMTFValues_code = new int[6][258];
      final byte[] sendMTFValues2_pos = new byte[6];
      final boolean[] sentMTFValues4_inUse16 = new boolean[16];
      final int[] heap = new int[260];
      final int[] weight = new int[516];
      final int[] parent = new int[516];
      final byte[] block;
      final int[] fmap;
      final char[] sfmap;
      int origPtr;

      Data(int var1) {
         int var2 = var1 * 100000;
         this.block = new byte[var2 + 1 + 20];
         this.fmap = new int[var2];
         this.sfmap = new char[2 * var2];
      }
   }
}
