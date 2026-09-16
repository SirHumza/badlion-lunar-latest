package org.apache.commons.compress.compressors.bzip2;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;

public class BZip2CompressorInputStream extends CompressorInputStream implements BZip2Constants {
   private int last;
   private int origPtr;
   private int blockSize100k;
   private boolean blockRandomised;
   private int bsBuff;
   private int bsLive;
   private final CRC crc = new CRC();
   private int nInUse;
   private InputStream in;
   private final boolean decompressConcatenated;
   private static final int EOF = 0;
   private static final int START_BLOCK_STATE = 1;
   private static final int RAND_PART_A_STATE = 2;
   private static final int RAND_PART_B_STATE = 3;
   private static final int RAND_PART_C_STATE = 4;
   private static final int NO_RAND_PART_A_STATE = 5;
   private static final int NO_RAND_PART_B_STATE = 6;
   private static final int NO_RAND_PART_C_STATE = 7;
   private int currentState = 1;
   private int storedBlockCRC;
   private int storedCombinedCRC;
   private int computedBlockCRC;
   private int computedCombinedCRC;
   private int su_count;
   private int su_ch2;
   private int su_chPrev;
   private int su_i2;
   private int su_j2;
   private int su_rNToGo;
   private int su_rTPos;
   private int su_tPos;
   private char su_z;
   private BZip2CompressorInputStream.Data data;

   public BZip2CompressorInputStream(InputStream var1) {
      this(var1, false);
   }

   public BZip2CompressorInputStream(InputStream var1, boolean var2) {
      this.in = var1;
      this.decompressConcatenated = var2;
      this.init(true);
      this.initBlock();
   }

   @Override
   public int read() {
      if (this.in != null) {
         int var1 = this.read0();
         this.count(var1 < 0 ? -1 : 1);
         return var1;
      } else {
         throw new IOException("stream closed");
      }
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      if (var2 < 0) {
         throw new IndexOutOfBoundsException("offs(" + var2 + ") < 0.");
      }

      if (var3 < 0) {
         throw new IndexOutOfBoundsException("len(" + var3 + ") < 0.");
      }

      if (var2 + var3 > var1.length) {
         throw new IndexOutOfBoundsException("offs(" + var2 + ") + len(" + var3 + ") > dest.length(" + var1.length + ").");
      }

      if (this.in == null) {
         throw new IOException("stream closed");
      }

      int var4 = var2 + var3;
      int var5 = var2;

      int var6;
      while (var5 < var4 && (var6 = this.read0()) >= 0) {
         var1[var5++] = (byte)var6;
         this.count(1);
      }

      return var5 == var2 ? -1 : var5 - var2;
   }

   private void makeMaps() {
      boolean[] var1 = this.data.inUse;
      byte[] var2 = this.data.seqToUnseq;
      int var3 = 0;

      for (int var4 = 0; var4 < 256; var4++) {
         if (var1[var4]) {
            var2[var3++] = (byte)var4;
         }
      }

      this.nInUse = var3;
   }

   private int read0() {
      switch (this.currentState) {
         case 0:
            return -1;
         case 1:
            return this.setupBlock();
         case 2:
            throw new IllegalStateException();
         case 3:
            return this.setupRandPartB();
         case 4:
            return this.setupRandPartC();
         case 5:
            throw new IllegalStateException();
         case 6:
            return this.setupNoRandPartB();
         case 7:
            return this.setupNoRandPartC();
         default:
            throw new IllegalStateException();
      }
   }

   private boolean init(boolean var1) {
      if (null == this.in) {
         throw new IOException("No InputStream");
      }

      int var2 = this.in.read();
      if (var2 == -1 && !var1) {
         return false;
      }

      int var3 = this.in.read();
      int var4 = this.in.read();
      if (var2 == 66 && var3 == 90 && var4 == 104) {
         int var5 = this.in.read();
         if (var5 >= 49 && var5 <= 57) {
            this.blockSize100k = var5 - 48;
            this.bsLive = 0;
            this.computedCombinedCRC = 0;
            return true;
         } else {
            throw new IOException("BZip2 block size is invalid");
         }
      } else {
         throw new IOException(var1 ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream");
      }
   }

   private void initBlock() {
      while (true) {
         char var1 = this.bsGetUByte();
         char var2 = this.bsGetUByte();
         char var3 = this.bsGetUByte();
         char var4 = this.bsGetUByte();
         char var5 = this.bsGetUByte();
         char var6 = this.bsGetUByte();
         if (var1 == 23 && var2 == 'r' && var3 == 'E' && var4 == '8' && var5 == 'P' && var6 == 144) {
            if (!this.complete()) {
               continue;
            }

            return;
         }

         if (var1 == '1' && var2 == 'A' && var3 == 'Y' && var4 == '&' && var5 == 'S' && var6 == 'Y') {
            this.storedBlockCRC = this.bsGetInt();
            this.blockRandomised = this.bsR(1) == 1;
            if (this.data == null) {
               this.data = new BZip2CompressorInputStream.Data(this.blockSize100k);
            }

            this.getAndMoveToFrontDecode();
            this.crc.initialiseCRC();
            this.currentState = 1;
            return;
         }

         this.currentState = 0;
         throw new IOException("bad block header");
      }
   }

   private void endBlock() {
      this.computedBlockCRC = this.crc.getFinalCRC();
      if (this.storedBlockCRC != this.computedBlockCRC) {
         this.computedCombinedCRC = this.storedCombinedCRC << 1 | this.storedCombinedCRC >>> 31;
         this.computedCombinedCRC = this.computedCombinedCRC ^ this.storedBlockCRC;
         throw new IOException("BZip2 CRC error");
      }

      this.computedCombinedCRC = this.computedCombinedCRC << 1 | this.computedCombinedCRC >>> 31;
      this.computedCombinedCRC = this.computedCombinedCRC ^ this.computedBlockCRC;
   }

   private boolean complete() {
      this.storedCombinedCRC = this.bsGetInt();
      this.currentState = 0;
      this.data = null;
      if (this.storedCombinedCRC != this.computedCombinedCRC) {
         throw new IOException("BZip2 CRC error");
      } else {
         return !this.decompressConcatenated || !this.init(false);
      }
   }

   @Override
   public void close() {
      InputStream var1 = this.in;
      if (var1 != null) {
         try {
            if (var1 != System.in) {
               var1.close();
            }
         } finally {
            this.data = null;
            this.in = null;
         }
      }
   }

   private int bsR(int var1) {
      int var2 = this.bsLive;
      int var3 = this.bsBuff;
      if (var2 < var1) {
         InputStream var4 = this.in;

         do {
            int var5 = var4.read();
            if (var5 < 0) {
               throw new IOException("unexpected end of stream");
            }

            var3 = var3 << 8 | var5;
            var2 += 8;
         } while (var2 < var1);

         this.bsBuff = var3;
      }

      this.bsLive = var2 - var1;
      return var3 >> var2 - var1 & (1 << var1) - 1;
   }

   private boolean bsGetBit() {
      int var1 = this.bsLive;
      int var2 = this.bsBuff;
      if (var1 < 1) {
         int var3 = this.in.read();
         if (var3 < 0) {
            throw new IOException("unexpected end of stream");
         }

         var2 = var2 << 8 | var3;
         var1 += 8;
         this.bsBuff = var2;
      }

      this.bsLive = var1 - 1;
      return (var2 >> var1 - 1 & 1) != 0;
   }

   private char bsGetUByte() {
      return (char)this.bsR(8);
   }

   private int bsGetInt() {
      return ((this.bsR(8) << 8 | this.bsR(8)) << 8 | this.bsR(8)) << 8 | this.bsR(8);
   }

   private static void hbCreateDecodeTables(int[] var0, int[] var1, int[] var2, char[] var3, int var4, int var5, int var6) {
      int var7 = var4;
      int var8 = 0;

      while (var7 <= var5) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var7) {
               var2[var8++] = var9;
            }
         }

         var7++;
      }

      var7 = 23;

      while (--var7 > 0) {
         var1[var7] = 0;
         var0[var7] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      var7 = 1;
      var8 = var1[0];

      while (var7 < 23) {
         var8 += var1[var7];
         var1[var7] = var8;
         var7++;
      }

      var7 = var4;
      var8 = 0;
      int var19 = var1[var7];

      while (var7 <= var5) {
         int var10 = var1[var7 + 1];
         var8 += var10 - var19;
         var19 = var10;
         var0[var7] = var8 - 1;
         var8 <<= 1;
         var7++;
      }

      for (int var15 = var4 + 1; var15 <= var5; var15++) {
         var1[var15] = (var0[var15 - 1] + 1 << 1) - var1[var15];
      }
   }

   private void recvDecodingTables() {
      BZip2CompressorInputStream.Data var1 = this.data;
      boolean[] var2 = var1.inUse;
      byte[] var3 = var1.recvDecodingTables_pos;
      byte[] var4 = var1.selector;
      byte[] var5 = var1.selectorMtf;
      int var6 = 0;

      for (int var7 = 0; var7 < 16; var7++) {
         if (this.bsGetBit()) {
            var6 |= 1 << var7;
         }
      }

      int var15 = 256;

      while (--var15 >= 0) {
         var2[var15] = false;
      }

      for (int var16 = 0; var16 < 16; var16++) {
         if ((var6 & 1 << var16) != 0) {
            int var8 = var16 << 4;

            for (int var9 = 0; var9 < 16; var9++) {
               if (this.bsGetBit()) {
                  var2[var8 + var9] = true;
               }
            }
         }
      }

      this.makeMaps();
      var15 = this.nInUse + 2;
      int var18 = this.bsR(3);
      int var19 = this.bsR(15);

      for (int var10 = 0; var10 < var19; var10++) {
         int var11 = 0;

         while (this.bsGetBit()) {
            var11++;
         }

         var5[var10] = (byte)var11;
      }

      int var20 = var18;

      while (--var20 >= 0) {
         var3[var20] = (byte)var20;
      }

      for (int var21 = 0; var21 < var19; var21++) {
         int var23 = var5[var21] & 255;
         byte var12 = var3[var23];

         while (var23 > 0) {
            var3[var23] = var3[var23 - 1];
            var23--;
         }

         var3[0] = var12;
         var4[var21] = var12;
      }

      char[][] var22 = var1.temp_charArray2d;

      for (int var24 = 0; var24 < var18; var24++) {
         int var25 = this.bsR(5);
         char[] var13 = var22[var24];

         for (int var14 = 0; var14 < var15; var14++) {
            while (this.bsGetBit()) {
               var25 += this.bsGetBit() ? -1 : 1;
            }

            var13[var14] = (char)var25;
         }
      }

      this.createHuffmanDecodingTables(var15, var18);
   }

   private void createHuffmanDecodingTables(int var1, int var2) {
      BZip2CompressorInputStream.Data var3 = this.data;
      char[][] var4 = var3.temp_charArray2d;
      int[] var5 = var3.minLens;
      int[][] var6 = var3.limit;
      int[][] var7 = var3.base;
      int[][] var8 = var3.perm;

      for (int var9 = 0; var9 < var2; var9++) {
         char var10 = ' ';
         char var11 = 0;
         char[] var12 = var4[var9];
         int var13 = var1;

         while (--var13 >= 0) {
            char var14 = var12[var13];
            if (var14 > var11) {
               var11 = var14;
            }

            if (var14 < var10) {
               var10 = var14;
            }
         }

         hbCreateDecodeTables(var6[var9], var7[var9], var8[var9], var4[var9], var10, var11, var1);
         var5[var9] = var10;
      }
   }

   private void getAndMoveToFrontDecode() {
      this.origPtr = this.bsR(24);
      this.recvDecodingTables();
      InputStream var1 = this.in;
      BZip2CompressorInputStream.Data var2 = this.data;
      byte[] var3 = var2.ll8;
      int[] var4 = var2.unzftab;
      byte[] var5 = var2.selector;
      byte[] var6 = var2.seqToUnseq;
      char[] var7 = var2.getAndMoveToFrontDecode_yy;
      int[] var8 = var2.minLens;
      int[][] var9 = var2.limit;
      int[][] var10 = var2.base;
      int[][] var11 = var2.perm;
      int var12 = this.blockSize100k * 100000;

      for (int var13 = 256; --var13 >= 0; var4[var13] = 0) {
         var7[var13] = (char)var13;
      }

      int var30 = 0;
      int var14 = 49;
      int var15 = this.nInUse + 1;
      int var16 = this.getAndMoveToFrontDecode0(0);
      int var17 = this.bsBuff;
      int var18 = this.bsLive;
      int var19 = -1;
      int var20 = var5[var30] & 255;
      int[] var21 = var10[var20];
      int[] var22 = var9[var20];
      int[] var23 = var11[var20];
      int var24 = var8[var20];

      while (var16 != var15) {
         if (var16 != 0 && var16 != 1) {
            if (++var19 >= var12) {
               throw new IOException("block overrun");
            }

            char var33 = var7[var16 - 1];
            var4[var6[var33] & 0xFF]++;
            var3[var19] = var6[var33];
            if (var16 <= 16) {
               int var35 = var16 - 1;

               while (var35 > 0) {
                  var7[var35--] = var7[var35];
               }
            } else {
               System.arraycopy(var7, 0, var7, 1, var16 - 1);
            }

            var7[0] = var33;
            if (var14 == 0) {
               var14 = 49;
               var20 = var5[++var30] & 255;
               var21 = var10[var20];
               var22 = var9[var20];
               var23 = var11[var20];
               var24 = var8[var20];
            } else {
               var14--;
            }

            int var36;
            for (var36 = var24; var18 < var36; var18 += 8) {
               int var37 = var1.read();
               if (var37 < 0) {
                  throw new IOException("unexpected end of stream");
               }

               var17 = var17 << 8 | var37;
            }

            int var38 = var17 >> var18 - var36 & (1 << var36) - 1;

            for (var18 -= var36; var38 > var22[var36]; var38 = var38 << 1 | var17 >> --var18 & 1) {
               var36++;

               while (var18 < 1) {
                  int var40 = var1.read();
                  if (var40 < 0) {
                     throw new IOException("unexpected end of stream");
                  }

                  var17 = var17 << 8 | var40;
                  var18 += 8;
               }
            }

            var16 = var23[var38 - var21[var36]];
         } else {
            int var25 = -1;
            byte var26 = 1;

            while (true) {
               if (var16 == 0) {
                  var25 += var26;
               } else {
                  if (var16 != 1) {
                     var26 = var6[var7[0]];
                     var4[var26 & 0xFF] = var4[var26 & 0xFF] + var25 + 1;

                     while (var25-- >= 0) {
                        var3[++var19] = var26;
                     }

                     if (var19 >= var12) {
                        throw new IOException("block overrun");
                     }
                     break;
                  }

                  var25 += var26 << 1;
               }

               if (var14 == 0) {
                  var14 = 49;
                  var20 = var5[++var30] & 255;
                  var21 = var10[var20];
                  var22 = var9[var20];
                  var23 = var11[var20];
                  var24 = var8[var20];
               } else {
                  var14--;
               }

               int var27;
               for (var27 = var24; var18 < var27; var18 += 8) {
                  int var28 = var1.read();
                  if (var28 < 0) {
                     throw new IOException("unexpected end of stream");
                  }

                  var17 = var17 << 8 | var28;
               }

               int var39 = var17 >> var18 - var27 & (1 << var27) - 1;

               for (var18 -= var27; var39 > var22[var27]; var39 = var39 << 1 | var17 >> --var18 & 1) {
                  var27++;

                  while (var18 < 1) {
                     int var29 = var1.read();
                     if (var29 < 0) {
                        throw new IOException("unexpected end of stream");
                     }

                     var17 = var17 << 8 | var29;
                     var18 += 8;
                  }
               }

               var16 = var23[var39 - var21[var27]];
               var26 <<= 1;
            }
         }
      }

      this.last = var19;
      this.bsLive = var18;
      this.bsBuff = var17;
   }

   private int getAndMoveToFrontDecode0(int var1) {
      InputStream var2 = this.in;
      BZip2CompressorInputStream.Data var3 = this.data;
      int var4 = var3.selector[var1] & 255;
      int[] var5 = var3.limit[var4];
      int var6 = var3.minLens[var4];
      int var7 = this.bsR(var6);
      int var8 = this.bsLive;

      int var9;
      for (var9 = this.bsBuff; var7 > var5[var6]; var7 = var7 << 1 | var9 >> --var8 & 1) {
         var6++;

         while (var8 < 1) {
            int var10 = var2.read();
            if (var10 < 0) {
               throw new IOException("unexpected end of stream");
            }

            var9 = var9 << 8 | var10;
            var8 += 8;
         }
      }

      this.bsLive = var8;
      this.bsBuff = var9;
      return var3.perm[var4][var7 - var3.base[var4][var6]];
   }

   private int setupBlock() {
      if (this.currentState != 0 && this.data != null) {
         int[] var1 = this.data.cftab;
         int[] var2 = this.data.initTT(this.last + 1);
         byte[] var3 = this.data.ll8;
         var1[0] = 0;
         System.arraycopy(this.data.unzftab, 0, var1, 1, 256);
         int var4 = 1;
         int var5 = var1[0];

         while (var4 <= 256) {
            var5 += var1[var4];
            var1[var4] = var5;
            var4++;
         }

         var4 = 0;
         var5 = this.last;

         while (var4 <= var5) {
            var2[var1[var3[var4] & 0xFF]++] = var4++;
         }

         if (this.origPtr >= 0 && this.origPtr < var2.length) {
            this.su_tPos = var2[this.origPtr];
            this.su_count = 0;
            this.su_i2 = 0;
            this.su_ch2 = 256;
            if (this.blockRandomised) {
               this.su_rNToGo = 0;
               this.su_rTPos = 0;
               return this.setupRandPartA();
            } else {
               return this.setupNoRandPartA();
            }
         } else {
            throw new IOException("stream corrupted");
         }
      } else {
         return -1;
      }
   }

   private int setupRandPartA() {
      if (this.su_i2 <= this.last) {
         this.su_chPrev = this.su_ch2;
         int var1 = this.data.ll8[this.su_tPos] & 255;
         this.su_tPos = this.data.tt[this.su_tPos];
         if (this.su_rNToGo == 0) {
            this.su_rNToGo = Rand.rNums(this.su_rTPos) - 1;
            if (++this.su_rTPos == 512) {
               this.su_rTPos = 0;
            }
         } else {
            this.su_rNToGo--;
         }

         int var2;
         this.su_ch2 = var2 = var1 ^ (this.su_rNToGo == 1 ? 1 : 0);
         this.su_i2++;
         this.currentState = 3;
         this.crc.updateCRC(var2);
         return var2;
      } else {
         this.endBlock();
         this.initBlock();
         return this.setupBlock();
      }
   }

   private int setupNoRandPartA() {
      if (this.su_i2 <= this.last) {
         this.su_chPrev = this.su_ch2;
         int var1 = this.data.ll8[this.su_tPos] & 255;
         this.su_ch2 = var1;
         this.su_tPos = this.data.tt[this.su_tPos];
         this.su_i2++;
         this.currentState = 6;
         this.crc.updateCRC(var1);
         return var1;
      } else {
         this.currentState = 5;
         this.endBlock();
         this.initBlock();
         return this.setupBlock();
      }
   }

   private int setupRandPartB() {
      if (this.su_ch2 != this.su_chPrev) {
         this.currentState = 2;
         this.su_count = 1;
         return this.setupRandPartA();
      }

      if (++this.su_count >= 4) {
         this.su_z = (char)(this.data.ll8[this.su_tPos] & 0xFF);
         this.su_tPos = this.data.tt[this.su_tPos];
         if (this.su_rNToGo == 0) {
            this.su_rNToGo = Rand.rNums(this.su_rTPos) - 1;
            if (++this.su_rTPos == 512) {
               this.su_rTPos = 0;
            }
         } else {
            this.su_rNToGo--;
         }

         this.su_j2 = 0;
         this.currentState = 4;
         if (this.su_rNToGo == 1) {
            this.su_z = (char)(this.su_z ^ 1);
         }

         return this.setupRandPartC();
      } else {
         this.currentState = 2;
         return this.setupRandPartA();
      }
   }

   private int setupRandPartC() {
      if (this.su_j2 < this.su_z) {
         this.crc.updateCRC(this.su_ch2);
         this.su_j2++;
         return this.su_ch2;
      } else {
         this.currentState = 2;
         this.su_i2++;
         this.su_count = 0;
         return this.setupRandPartA();
      }
   }

   private int setupNoRandPartB() {
      if (this.su_ch2 != this.su_chPrev) {
         this.su_count = 1;
         return this.setupNoRandPartA();
      } else if (++this.su_count >= 4) {
         this.su_z = (char)(this.data.ll8[this.su_tPos] & 0xFF);
         this.su_tPos = this.data.tt[this.su_tPos];
         this.su_j2 = 0;
         return this.setupNoRandPartC();
      } else {
         return this.setupNoRandPartA();
      }
   }

   private int setupNoRandPartC() {
      if (this.su_j2 < this.su_z) {
         int var1 = this.su_ch2;
         this.crc.updateCRC(var1);
         this.su_j2++;
         this.currentState = 7;
         return var1;
      } else {
         this.su_i2++;
         this.su_count = 0;
         return this.setupNoRandPartA();
      }
   }

   public static boolean matches(byte[] var0, int var1) {
      if (var1 < 3) {
         return false;
      } else if (var0[0] != 66) {
         return false;
      } else {
         return var0[1] != 90 ? false : var0[2] == 104;
      }
   }

   private static final class Data {
      final boolean[] inUse = new boolean[256];
      final byte[] seqToUnseq = new byte[256];
      final byte[] selector = new byte[18002];
      final byte[] selectorMtf = new byte[18002];
      final int[] unzftab = new int[256];
      final int[][] limit = new int[6][258];
      final int[][] base = new int[6][258];
      final int[][] perm = new int[6][258];
      final int[] minLens = new int[6];
      final int[] cftab = new int[257];
      final char[] getAndMoveToFrontDecode_yy = new char[256];
      final char[][] temp_charArray2d = new char[6][258];
      final byte[] recvDecodingTables_pos = new byte[6];
      int[] tt;
      byte[] ll8;

      Data(int var1) {
         this.ll8 = new byte[var1 * 100000];
      }

      int[] initTT(int var1) {
         int[] var2 = this.tt;
         if (var2 == null || var2.length < var1) {
            this.tt = var2 = new int[var1];
         }

         return var2;
      }
   }
}
