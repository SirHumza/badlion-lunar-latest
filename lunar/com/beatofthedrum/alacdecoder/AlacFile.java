package com.beatofthedrum.alacdecoder;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

class AlacFile {
   private static final Logger logger = System.getLogger(AlacFile.class.getName());
   static int RICE_THRESHOLD = 8;
   byte[] inputBuffer;
   int ibIndex = 0;
   int inputBufferBitAccumulator = 0;
   int sampleSize = 0;
   int numChannels = 0;
   int bytesPerSample = 0;
   LeadingZeros lz = new LeadingZeros();
   private static final int bufferSize = 16384;
   int[] predicterrorBufferA = new int[16384];
   int[] predicterrorBufferB = new int[16384];
   int[] outputSamplesBufferA = new int[16384];
   int[] outputsamplesBufferB = new int[16384];
   int[] uncompressedBytesBufferA = new int[16384];
   int[] uncompressedBytesBufferB = new int[16384];
   int setInfo_maxSamplesPerFrame = 0;
   int setInfo_7A = 0;
   int setInfo_sampleSize = 0;
   int setInfo_riceHistoryMult = 0;
   int setInfo_riceInitialHistory = 0;
   int setInfo_riceKModifier = 0;
   int setInfo_7f = 0;
   int setInfo_80 = 0;
   int setInfo_82 = 0;
   int setInfo_86 = 0;
   int setInfo_8a_rate = 0;
   public int[] predictorCoefTable = new int[1024];
   public int[] predictorCoefTableA = new int[1024];
   public int[] predictorCoefTableB = new int[1024];

   private static int[] predictorDecompressFirAdapt(int[] var0, int var1, int var2, int[] var3, int var4, int var5) {
      int var6 = 0;
      int var8 = 0;
      int[] var7 = var0;
      if (var4 == 0) {
         if (var1 <= 1) {
            return var7;
         }

         int var23 = 0;
         var23 = (var1 - 1) * 4;
         System.arraycopy(var0, 1, var7, 1, var23);
         return var7;
      } else if (var4 == 31) {
         if (var1 <= 1) {
            return var7;
         }

         for (int var22 = 0; var22 < var1 - 1; var22++) {
            int var28 = 0;
            int var30 = 0;
            var28 = var7[var22];
            var30 = var0[var22 + 1];
            var8 = 32 - var2;
            var7[var22 + 1] = var28 + var30 << var8 >> var8;
         }

         return var7;
      } else {
         if (var4 > 0) {
            for (int var9 = 0; var9 < var4; var9++) {
               int var10 = 0;
               var10 = var7[var9] + var0[var9 + 1];
               var8 = 32 - var2;
               var10 = var10 << var8 >> var8;
               var7[var9 + 1] = var10;
            }
         }

         if (var4 > 0) {
            var6 = 0;

            for (int var21 = var4 + 1; var21 < var1; var21++) {
               int var11 = 0;
               int var13 = var0[var21];

               for (int var27 = 0; var27 < var4; var27++) {
                  var11 += (var7[var6 + var4 - var27] - var7[var6]) * var3[var27];
               }

               int var12 = (1 << var5 - 1) + var11;
               var12 >>= var5;
               var12 = var12 + var7[var6] + var13;
               var8 = 32 - var2;
               var12 = var12 << var8 >> var8;
               var7[var6 + var4 + 1] = var12;
               if (var13 > 0) {
                  for (int var35 = var4 - 1; var35 >= 0 && var13 > 0; var35--) {
                     int var37 = var7[var6] - var7[var6 + var4 - var35];
                     int var39 = Integer.compare(var37, 0);
                     var3[var35] -= var39;
                     var37 *= var39;
                     var13 -= (var37 >> var5) * (var4 - var35);
                  }
               } else if (var13 < 0) {
                  for (int var14 = var4 - 1; var14 >= 0 && var13 < 0; var14--) {
                     int var15 = var7[var6] - var7[var6 + var4 - var14];
                     int var16 = -Integer.compare(var15, 0);
                     var3[var14] -= var16;
                     var15 *= var16;
                     var13 -= (var15 >> var5) * (var4 - var14);
                  }
               }

               var6++;
            }
         }

         return var7;
      }
   }

   private static void deinterlace16(int[] var0, int[] var1, int[] var2, int var3, int var4, int var5, int var6) {
      if (var4 > 0) {
         if (0 != var6) {
            for (int var12 = 0; var12 < var4; var12++) {
               int var14 = 0;
               int var17 = 0;
               int var10 = 0;
               int var11 = 0;
               var17 = var0[var12];
               var14 = var1[var12];
               var11 = var17 - (var14 * var6 >> var5);
               var10 = var11 + var14;
               var2[var12 * var3] = var10;
               var2[var12 * var3 + 1] = var11;
            }
         } else {
            for (int var7 = 0; var7 < var4; var7++) {
               int var8 = 0;
               int var9 = 0;
               var8 = var0[var7];
               var9 = var1[var7];
               var2[var7 * var3] = var8;
               var2[var7 * var3 + 1] = var9;
            }
         }
      }
   }

   private static void deinterlace24(int[] var0, int[] var1, int var2, int[] var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9) {
      if (var7 > 0) {
         if (var9 != 0) {
            for (int var16 = 0; var16 < var7; var16++) {
               int var19 = 0;
               int var23 = 0;
               int var25 = 0;
               int var14 = 0;
               var23 = var0[var16];
               var19 = var1[var16];
               var14 = var23 - (var19 * var9 >> var8);
               var25 = var14 + var19;
               if (var2 != 0) {
                  int var15 = ~(-1 << var2 * 8);
                  var25 <<= var2 * 8;
                  var14 <<= var2 * 8;
                  var25 |= var3[var16] & var15;
                  var14 |= var4[var16] & var15;
               }

               var5[var16 * var6 * 3] = var25 & 0xFF;
               var5[var16 * var6 * 3 + 1] = var25 >> 8 & 0xFF;
               var5[var16 * var6 * 3 + 2] = var25 >> 16 & 0xFF;
               var5[var16 * var6 * 3 + 3] = var14 & 0xFF;
               var5[var16 * var6 * 3 + 4] = var14 >> 8 & 0xFF;
               var5[var16 * var6 * 3 + 5] = var14 >> 16 & 0xFF;
            }
         } else {
            for (int var10 = 0; var10 < var7; var10++) {
               int var11 = 0;
               int var12 = 0;
               var11 = var0[var10];
               var12 = var1[var10];
               if (var2 != 0) {
                  int var13 = ~(-1 << var2 * 8);
                  var11 <<= var2 * 8;
                  var12 <<= var2 * 8;
                  var11 |= var3[var10] & var13;
                  var12 |= var4[var10] & var13;
               }

               var5[var10 * var6 * 3] = var11 & 0xFF;
               var5[var10 * var6 * 3 + 1] = var11 >> 8 & 0xFF;
               var5[var10 * var6 * 3 + 2] = var11 >> 16 & 0xFF;
               var5[var10 * var6 * 3 + 3] = var12 & 0xFF;
               var5[var10 * var6 * 3 + 4] = var12 >> 8 & 0xFF;
               var5[var10 * var6 * 3 + 5] = var12 >> 16 & 0xFF;
            }
         }
      }
   }

   public static AlacFile create(int var0, int var1) {
      AlacFile var2 = new AlacFile();
      var2.sampleSize = var0;
      var2.numChannels = var1;
      var2.bytesPerSample = var0 / 8 * var1;
      return var2;
   }

   public void decodeEntropyRice(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var4;
      int var9 = 0;
      byte var10 = 0;

      while (var9 < var2) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         var13 = 31 - var5 - this.lz.countLeadingZeros((var8 >> 9) + 3);
         if (var13 < 0) {
            var13 += var5;
         } else {
            var13 = var5;
         }

         var11 = this.decodeEntropyValue(var3, var13, -1);
         var11 += var10;
         var12 = (var11 + 1) / 2;
         if ((var11 & 1) != 0) {
            var12 *= -1;
         }

         var1[var9] = var12;
         var10 = 0;
         var8 += var11 * var6 - (var8 * var6 >> 9);
         if (var11 > 65535) {
            var8 = 65535;
         }

         if (var8 < 128 && var9 + 1 < var2) {
            int var14 = 0;
            var10 = 1;
            var13 = this.lz.countLeadingZeros(var8) + (var8 + 16) / 64 - 24;
            var14 = this.decodeEntropyValue(16, var13, var7);
            if (var14 > 0) {
               int var15 = 0;
               var15 = var14;

               for (int var16 = 0; var16 < var15; var16++) {
                  var1[var9 + 1 + var16] = 0;
               }

               var9 += var14;
            }

            if (var14 > 65535) {
               var10 = 0;
            }

            var8 = 0;
         }

         var9++;
      }
   }

   public int decodeFrame(byte[] var1, int[] var2, int var3) {
      int var5 = this.setInfo_maxSamplesPerFrame;
      this.inputBuffer = var1;
      this.inputBufferBitAccumulator = 0;
      this.ibIndex = 0;
      int var4 = this.readBits(3);
      var3 = var5 * this.bytesPerSample;
      if (var4 == 0) {
         int var11 = 0;
         this.readBits(4);
         this.readBits(12);
         int var6 = this.readBits(1);
         int var9 = this.readBits(2);
         int var7 = this.readBits(1);
         if (var6 != 0) {
            var5 = this.readBits(32);
            var3 = var5 * this.bytesPerSample;
         }

         int var8 = this.setInfo_sampleSize - var9 * 8;
         if (var7 == 0) {
            int[] var33 = this.predictorCoefTable;
            this.readBits(8);
            this.readBits(8);
            int var53 = this.readBits(4);
            int var60 = this.readBits(4);
            int var10 = this.readBits(3);
            int var41 = this.readBits(5);

            for (int var16 = 0; var16 < var41; var16++) {
               var11 = this.readBits(16);
               if (var11 > 32767) {
                  var11 -= 65536;
               }

               var33[var16] = var11;
            }

            if (var9 != 0) {
               for (int var68 = 0; var68 < var5; var68++) {
                  this.uncompressedBytesBufferA[var68] = this.readBits(var9 * 8);
               }
            }

            this.decodeEntropyRice(
               this.predicterrorBufferA,
               var5,
               var8,
               this.setInfo_riceInitialHistory,
               this.setInfo_riceKModifier,
               var10 * (this.setInfo_riceHistoryMult / 4),
               (1 << this.setInfo_riceKModifier) - 1
            );
            if (var53 == 0) {
               this.outputSamplesBufferA = predictorDecompressFirAdapt(this.predicterrorBufferA, var5, var8, var33, var41, var60);
            } else {
               logger.log(Level.WARNING, "FIXME: unhandled predicition type: " + var53);
            }
         } else {
            if (this.setInfo_sampleSize <= 16) {
               for (int var13 = 0; var13 < var5; var13++) {
                  int var14 = this.readBits(this.setInfo_sampleSize);
                  int var12 = 32 - this.setInfo_sampleSize;
                  var14 = var14 << var12 >> var12;
                  this.outputSamplesBufferA[var13] = var14;
               }
            } else {
               int var32 = 8388608;

               for (int var40 = 0; var40 < var5; var40++) {
                  int var49 = this.readBits(16);
                  var49 <<= this.setInfo_sampleSize - 16;
                  var49 |= this.readBits(this.setInfo_sampleSize - 16);
                  int var15 = var49 & 16777215;
                  var49 = (var15 ^ var32) - var32;
                  this.outputSamplesBufferA[var40] = var49;
               }
            }

            var9 = 0;
         }

         switch (this.setInfo_sampleSize) {
            case 16:
               for (int var35 = 0; var35 < var5; var35++) {
                  int var44 = this.outputSamplesBufferA[var35];
                  var2[var35 * this.numChannels] = var44;
                  var2[var35 * this.numChannels + 1] = 0;
               }
               break;
            case 20:
            case 32:
               logger.log(Level.WARNING, "FIXME: unimplemented sample size " + this.setInfo_sampleSize);
               break;
            case 24:
               for (int var34 = 0; var34 < var5; var34++) {
                  int var42 = this.outputSamplesBufferA[var34];
                  if (var9 != 0) {
                     int var54 = 0;
                     var42 <<= var9 * 8;
                     var54 = ~(-1 << var9 * 8);
                     var42 |= this.uncompressedBytesBufferA[var34] & var54;
                  }

                  var2[var34 * this.numChannels * 3] = var42 & 0xFF;
                  var2[var34 * this.numChannels * 3 + 1] = var42 >> 8 & 0xFF;
                  var2[var34 * this.numChannels * 3 + 2] = var42 >> 16 & 0xFF;
                  var2[var34 * this.numChannels * 3 + 3] = 0;
                  var2[var34 * this.numChannels * 3 + 4] = 0;
                  var2[var34 * this.numChannels * 3 + 5] = 0;
               }
         }
      } else if (var4 == 1) {
         this.readBits(4);
         this.readBits(12);
         int var25 = this.readBits(1);
         int var28 = this.readBits(2);
         int var26 = this.readBits(1);
         if (var25 != 0) {
            var5 = this.readBits(32);
            var3 = var5 * this.bytesPerSample;
         }

         int var27 = this.setInfo_sampleSize - var28 * 8 + 1;
         int var29;
         int var31;
         if (var26 == 0) {
            int[] var39 = this.predictorCoefTableA;
            int[] var17 = this.predictorCoefTableB;
            int var22 = 0;
            var29 = this.readBits(8);
            var31 = this.readBits(8);
            int var59 = this.readBits(4);
            int var67 = this.readBits(4);
            int var73 = this.readBits(3);
            int var47 = this.readBits(5);

            for (int var23 = 0; var23 < var47; var23++) {
               var22 = this.readBits(16);
               if (var22 > 32767) {
                  var22 -= 65536;
               }

               var39[var23] = var22;
            }

            int var19 = this.readBits(4);
            int var20 = this.readBits(4);
            int var21 = this.readBits(3);
            int var18 = this.readBits(5);

            for (int var76 = 0; var76 < var18; var76++) {
               var22 = this.readBits(16);
               if (var22 > 32767) {
                  var22 -= 65536;
               }

               var17[var76] = var22;
            }

            if (var28 != 0) {
               for (int var77 = 0; var77 < var5; var77++) {
                  this.uncompressedBytesBufferA[var77] = this.readBits(var28 * 8);
                  this.uncompressedBytesBufferB[var77] = this.readBits(var28 * 8);
               }
            }

            this.decodeEntropyRice(
               this.predicterrorBufferA,
               var5,
               var27,
               this.setInfo_riceInitialHistory,
               this.setInfo_riceKModifier,
               var73 * (this.setInfo_riceHistoryMult / 4),
               (1 << this.setInfo_riceKModifier) - 1
            );
            if (var59 == 0) {
               this.outputSamplesBufferA = predictorDecompressFirAdapt(this.predicterrorBufferA, var5, var27, var39, var47, var67);
            } else {
               logger.log(Level.WARNING, "FIXME: unhandled predicition type: " + var59);
            }

            this.decodeEntropyRice(
               this.predicterrorBufferB,
               var5,
               var27,
               this.setInfo_riceInitialHistory,
               this.setInfo_riceKModifier,
               var21 * (this.setInfo_riceHistoryMult / 4),
               (1 << this.setInfo_riceKModifier) - 1
            );
            if (var19 == 0) {
               this.outputsamplesBufferB = predictorDecompressFirAdapt(this.predicterrorBufferB, var5, var27, var17, var18, var20);
            } else {
               logger.log(Level.WARNING, "FIXME: unhandled predicition type: " + var19);
            }
         } else {
            if (this.setInfo_sampleSize <= 16) {
               for (int var45 = 0; var45 < var5; var45++) {
                  int var56 = this.readBits(this.setInfo_sampleSize);
                  int var61 = this.readBits(this.setInfo_sampleSize);
                  int var36 = 32 - this.setInfo_sampleSize;
                  var56 = var56 << var36 >> var36;
                  var61 = var61 << var36 >> var36;
                  this.outputSamplesBufferA[var45] = var56;
                  this.outputsamplesBufferB[var45] = var61;
               }
            } else {
               int var46 = 8388608;

               for (int var58 = 0; var58 < var5; var58++) {
                  int var63 = this.readBits(16);
                  var63 <<= this.setInfo_sampleSize - 16;
                  var63 |= this.readBits(this.setInfo_sampleSize - 16);
                  int var37 = var63 & 16777215;
                  var63 = (var37 ^ var46) - var46;
                  int var69 = this.readBits(16);
                  var69 <<= this.setInfo_sampleSize - 16;
                  var69 |= this.readBits(this.setInfo_sampleSize - 16);
                  var37 = var69 & 16777215;
                  var69 = (var37 ^ var46) - var46;
                  this.outputSamplesBufferA[var58] = var63;
                  this.outputsamplesBufferB[var58] = var69;
               }
            }

            var28 = 0;
            var29 = 0;
            var31 = 0;
         }

         switch (this.setInfo_sampleSize) {
            case 16:
               deinterlace16(this.outputSamplesBufferA, this.outputsamplesBufferB, var2, this.numChannels, var5, var29, var31);
               break;
            case 20:
            case 32:
            default:
               logger.log(Level.WARNING, "FIXME: unimplemented sample size " + this.setInfo_sampleSize);
               break;
            case 24:
               deinterlace24(
                  this.outputSamplesBufferA,
                  this.outputsamplesBufferB,
                  var28,
                  this.uncompressedBytesBufferA,
                  this.uncompressedBytesBufferB,
                  var2,
                  this.numChannels,
                  var5,
                  var29,
                  var31
               );
         }
      }

      return var3;
   }

   public int decodeEntropyValue(int var1, int var2, int var3) {
      int var4 = 0;

      while (var4 <= RICE_THRESHOLD && this.readBit() != 0) {
         var4++;
      }

      if (var4 > RICE_THRESHOLD) {
         int var5 = 0;
         var5 = this.readBits(var1);
         var5 &= -1 >> 32 - var1;
         var4 = var5;
      } else if (var2 != 1) {
         int var8 = this.readBits(var2);
         var4 *= (1 << var2) - 1 & var3;
         if (var8 > 1) {
            var4 += var8 - 1;
         } else {
            this.unreadBits(1);
         }
      }

      return var4;
   }

   void unreadBits(int var1) {
      int var2 = this.inputBufferBitAccumulator - var1;
      this.ibIndex += var2 >> 3;
      this.inputBufferBitAccumulator = var2 & 7;
      if (this.inputBufferBitAccumulator < 0) {
         this.inputBufferBitAccumulator *= -1;
      }
   }

   int readBit() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;
      var3 = this.inputBuffer[this.ibIndex] & 255;
      var1 = var3;
      var1 <<= this.inputBufferBitAccumulator;
      var1 = var1 >> 7 & 1;
      var2 = this.inputBufferBitAccumulator + 1;
      this.ibIndex += var2 / 8;
      this.inputBufferBitAccumulator = var2 % 8;
      return var1;
   }

   int readBits(int var1) {
      int var2 = 0;
      if (var1 > 16) {
         var1 -= 16;
         var2 = this.readBits16(16) << var1;
      }

      return var2 | this.readBits16(var1);
   }

   int readBits16(int var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      var4 = this.inputBuffer[this.ibIndex] & 255;
      var5 = this.inputBuffer[this.ibIndex + 1] & 255;
      var6 = this.inputBuffer[this.ibIndex + 2] & 255;
      var2 = var4 << 16 | var5 << 8 | var6;
      var2 <<= this.inputBufferBitAccumulator;
      var2 &= 16777215;
      var2 >>= 24 - var1;
      var3 = this.inputBufferBitAccumulator + var1;
      this.ibIndex += var3 >> 3;
      this.inputBufferBitAccumulator = var3 & 7;
      return var2;
   }

   public void setAlacInfo(int[] var1) {
      int var2 = 0;
      var2 += 4;
      var2 += 4;
      var2 += 4;
      var2 += 4;
      var2 += 4;
      var2 += 4;
      this.setInfo_maxSamplesPerFrame = (var1[var2] << 24) + (var1[var2 + 1] << 16) + (var1[var2 + 2] << 8) + var1[var2 + 3];
      var2 += 4;
      this.setInfo_7A = var1[var2];
      this.setInfo_sampleSize = var1[++var2];
      this.setInfo_riceHistoryMult = var1[++var2] & 0xFF;
      this.setInfo_riceInitialHistory = var1[++var2] & 0xFF;
      this.setInfo_riceKModifier = var1[++var2] & 0xFF;
      this.setInfo_7f = var1[++var2];
      this.setInfo_80 = (var1[++var2] << 8) + var1[var2 + 1];
      var2 += 2;
      this.setInfo_82 = (var1[var2] << 24) + (var1[var2 + 1] << 16) + (var1[var2 + 2] << 8) + var1[var2 + 3];
      var2 += 4;
      this.setInfo_86 = (var1[var2] << 24) + (var1[var2 + 1] << 16) + (var1[var2 + 2] << 8) + var1[var2 + 3];
      var2 += 4;
      this.setInfo_8a_rate = (var1[var2] << 24) + (var1[var2 + 1] << 16) + (var1[var2 + 2] << 8) + var1[var2 + 3];
      var2 += 4;
   }
}
