package org.tritonus.share.sampled;

import java.util.List;
import java.util.Random;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

public class FloatSampleTools {
   public static final float DEFAULT_DITHER_BITS = 0.7F;
   private static Random random = null;
   static final int F_8 = 1;
   static final int F_16 = 2;
   static final int F_24_3 = 3;
   static final int F_24_4 = 4;
   static final int F_32 = 5;
   static final int F_SAMPLE_WIDTH_MASK = 7;
   static final int F_SIGNED = 8;
   static final int F_BIGENDIAN = 16;
   static final int CT_8S = 9;
   static final int CT_8U = 1;
   static final int CT_16SB = 26;
   static final int CT_16SL = 10;
   static final int CT_24_3SB = 27;
   static final int CT_24_3SL = 11;
   static final int CT_24_4SB = 28;
   static final int CT_24_4SL = 12;
   static final int CT_32SB = 29;
   static final int CT_32SL = 13;
   private static final float twoPower7 = 128.0F;
   private static final float twoPower15 = 32768.0F;
   private static final float twoPower23 = 8388608.0F;
   private static final float twoPower31 = 2.1474836E9F;
   private static final float invTwoPower7 = 0.0078125F;
   private static final float invTwoPower15 = 3.0517578E-5F;
   private static final float invTwoPower23 = 1.1920929E-7F;
   private static final float invTwoPower31 = 4.656613E-10F;

   private FloatSampleTools() {
   }

   static void checkSupportedSampleSize(int var0, int var1, int var2) {
      if (var0 != 24 || var2 != 4 * var1) {
         if (var0 * var1 != var2 * 8) {
            throw new IllegalArgumentException("unsupported sample size: " + var0 + " bits stored in " + var2 / var1 + " bytes.");
         }
      }
   }

   static int getFormatType(AudioFormat var0) {
      boolean var1 = var0.getEncoding().equals(Encoding.PCM_SIGNED);
      if (!var1 && !var0.getEncoding().equals(Encoding.PCM_UNSIGNED)) {
         throw new IllegalArgumentException("unsupported encoding: only PCM encoding supported.");
      }

      if (!var1 && var0.getSampleSizeInBits() != 8) {
         throw new IllegalArgumentException("unsupported encoding: only 8-bit can be unsigned");
      }

      checkSupportedSampleSize(var0.getSampleSizeInBits(), var0.getChannels(), var0.getFrameSize());
      return getFormatType(var0.getSampleSizeInBits(), var0.getFrameSize() / var0.getChannels(), var1, var0.isBigEndian());
   }

   static int getFormatType(int var0, int var1, boolean var2, boolean var3) {
      byte var4 = 0;
      if (var0 == 24 || var1 == var0 / 8) {
         if (var0 == 8) {
            var4 = 1;
         } else if (var0 == 16) {
            var4 = 2;
         } else if (var0 == 24) {
            if (var1 == 3) {
               var4 = 3;
            } else if (var1 == 4) {
               var4 = 4;
            }
         } else if (var0 == 32) {
            var4 = 5;
         }
      }

      if (var4 == 0) {
         throw new IllegalArgumentException("ConversionTool: unsupported sample size of " + var0 + " bits per sample in " + var1 + " bytes.");
      }

      if (!var2 && var1 > 1) {
         throw new IllegalArgumentException("ConversionTool: unsigned samples larger than 8 bit are not supported");
      }

      if (var2) {
         var4 |= 8;
      }

      if (var3 && var0 != 8) {
         var4 |= 16;
      }

      return var4;
   }

   static int getSampleSize(int var0) {
      switch (var0 & 7) {
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 4;
         case 5:
            return 4;
         default:
            return 0;
      }
   }

   static String formatType2Str(int var0) {
      String var1 = var0 + ": ";
      switch (var0 & 7) {
         case 1:
            var1 = var1 + "8bit";
            break;
         case 2:
            var1 = var1 + "16bit";
            break;
         case 3:
            var1 = var1 + "24_3bit";
            break;
         case 4:
            var1 = var1 + "24_4bit";
            break;
         case 5:
            var1 = var1 + "32bit";
      }

      var1 = var1 + ((var0 & 8) == 8 ? " signed" : " unsigned");
      if ((var0 & 7) != 1) {
         var1 = var1 + ((var0 & 16) == 16 ? " big endian" : " little endian");
      }

      return var1;
   }

   public static void byte2float(byte[] var0, int var1, List<float[]> var2, int var3, int var4, AudioFormat var5) {
      byte2float(var0, var1, var2, var3, var4, var5, true);
   }

   public static void byte2float(byte[] var0, int var1, Object[] var2, int var3, int var4, AudioFormat var5) {
      byte2float(var0, var1, var2, var3, var4, var5, true);
   }

   public static void byte2float(byte[] var0, int var1, Object[] var2, int var3, int var4, AudioFormat var5, boolean var6) {
      int var7 = var5.getChannels();
      if (!var6 && var7 > var2.length) {
         var7 = var2.length;
      }

      if (var2.length < var7) {
         throw new ArrayIndexOutOfBoundsException("too few channel output array");
      }

      for (int var8 = 0; var8 < var7; var8++) {
         float[] var9 = (float[])var2[var8];
         if (var9.length < var4 + var3) {
            var9 = new float[var4 + var3];
            var2[var8] = var9;
         }

         byte2floatGeneric(var0, var1, var5.getFrameSize(), var9, var3, var4, var5);
         var1 += var5.getFrameSize() / var5.getChannels();
      }
   }

   public static void byte2float(byte[] var0, int var1, List<float[]> var2, int var3, int var4, AudioFormat var5, boolean var6) {
      int var7 = var5.getChannels();
      if (!var6 && var7 > var2.size()) {
         var7 = var2.size();
      }

      for (int var8 = 0; var8 < var7; var8++) {
         float[] var9;
         if (var2.size() < var8) {
            var9 = new float[var4 + var3];
            var2.add(var9);
         } else {
            var9 = (float[])var2.get(var8);
            if (var9.length < var4 + var3) {
               var9 = new float[var4 + var3];
               var2.set(var8, var9);
            }
         }

         byte2floatGeneric(var0, var1, var5.getFrameSize(), var9, var3, var4, var5);
         var1 += var5.getFrameSize() / var5.getChannels();
      }
   }

   public static void byte2float(int var0, byte[] var1, int var2, float[] var3, int var4, int var5, AudioFormat var6) {
      if (var0 >= var6.getChannels()) {
         throw new IllegalArgumentException("channel out of bounds");
      }

      if (var3.length < var5 + var4) {
         throw new IllegalArgumentException("data is too small");
      }

      var2 += var6.getFrameSize() / var6.getChannels() * var0;
      byte2floatGeneric(var1, var2, var6.getFrameSize(), var3, var4, var5, var6);
   }

   public static void byte2floatInterleaved(byte[] var0, int var1, float[] var2, int var3, int var4, AudioFormat var5) {
      byte2floatGeneric(var0, var1, var5.getFrameSize() / var5.getChannels(), var2, var3, var4 * var5.getChannels(), var5);
   }

   static void byte2floatGeneric(byte[] var0, int var1, int var2, float[] var3, int var4, int var5, AudioFormat var6) {
      int var7 = getFormatType(var6);
      byte2floatGeneric(var0, var1, var2, var3, var4, var5, var7);
   }

   static void byte2floatGeneric(byte[] var0, int var1, int var2, float[] var3, int var4, int var5, int var6) {
      int var7 = var4 + var5;
      int var8 = var1;
      int var9 = var4;

      while (var9 < var7) {
         switch (var6) {
            case 1:
               var3[var9] = ((var0[var8] & 255) - 128) * 0.0078125F;
               break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
               throw new IllegalArgumentException("unsupported format=" + formatType2Str(var6));
            case 9:
               var3[var9] = var0[var8] * 0.0078125F;
               break;
            case 10:
               var3[var9] = (var0[var8 + 1] << 8 | var0[var8] & 0xFF) * 3.0517578E-5F;
               break;
            case 11:
               var3[var9] = (var0[var8 + 2] << 16 | (var0[var8 + 1] & 255) << 8 | var0[var8] & 0xFF) * 1.1920929E-7F;
               break;
            case 12:
               var3[var9] = (var0[var8 + 3] << 16 | (var0[var8 + 2] & 255) << 8 | var0[var8 + 1] & 0xFF) * 1.1920929E-7F;
               break;
            case 13:
               var3[var9] = (var0[var8 + 3] << 24 | (var0[var8 + 2] & 255) << 16 | (var0[var8 + 1] & 255) << 8 | var0[var8] & 0xFF) * 4.656613E-10F;
               break;
            case 26:
               var3[var9] = (var0[var8] << 8 | var0[var8 + 1] & 0xFF) * 3.0517578E-5F;
               break;
            case 27:
               var3[var9] = (var0[var8] << 16 | (var0[var8 + 1] & 255) << 8 | var0[var8 + 2] & 0xFF) * 1.1920929E-7F;
               break;
            case 28:
               var3[var9] = (var0[var8 + 1] << 16 | (var0[var8 + 2] & 255) << 8 | var0[var8 + 3] & 0xFF) * 1.1920929E-7F;
               break;
            case 29:
               var3[var9] = (var0[var8] << 24 | (var0[var8 + 1] & 255) << 16 | (var0[var8 + 2] & 255) << 8 | var0[var8 + 3] & 0xFF) * 4.656613E-10F;
         }

         var9++;
         var8 += var2;
      }
   }

   private static byte quantize8(float var0, float var1) {
      if (var1 != 0.0F) {
         var0 += random.nextFloat() * var1;
      }

      if (var0 >= 127.0F) {
         return 127;
      } else {
         return var0 <= -128.0F ? -128 : (byte)(var0 < 0.0F ? var0 - 0.5F : var0 + 0.5F);
      }
   }

   private static int quantize16(float var0, float var1) {
      if (var1 != 0.0F) {
         var0 += random.nextFloat() * var1;
      }

      if (var0 >= 32767.0F) {
         return 32767;
      } else {
         return var0 <= -32768.0F ? -32768 : (int)(var0 < 0.0F ? var0 - 0.5F : var0 + 0.5F);
      }
   }

   private static int quantize24(float var0, float var1) {
      if (var1 != 0.0F) {
         var0 += random.nextFloat() * var1;
      }

      if (var0 >= 8388607.0F) {
         return 8388607;
      } else {
         return var0 <= -8388608.0F ? -8388608 : (int)(var0 < 0.0F ? var0 - 0.5F : var0 + 0.5F);
      }
   }

   private static int quantize32(float var0, float var1) {
      if (var1 != 0.0F) {
         var0 += random.nextFloat() * var1;
      }

      if (var0 >= 2.1474836E9F) {
         return Integer.MAX_VALUE;
      } else {
         return var0 <= -2.1474836E9F ? Integer.MIN_VALUE : (int)(var0 < 0.0F ? var0 - 0.5F : var0 + 0.5F);
      }
   }

   public static void float2byte(List<float[]> var0, int var1, byte[] var2, int var3, int var4, AudioFormat var5, float var6) {
      for (int var7 = 0; var7 < var5.getChannels(); var7++) {
         float[] var8 = (float[])var0.get(var7);
         float2byteGeneric(var8, var1, var2, var3, var5.getFrameSize(), var4, var5, var6);
         var3 += var5.getFrameSize() / var5.getChannels();
      }
   }

   public static void float2byte(Object[] var0, int var1, byte[] var2, int var3, int var4, AudioFormat var5, float var6) {
      int var7 = var5.getChannels();

      for (int var8 = 0; var8 < var7; var8++) {
         float[] var9 = (float[])var0[var8];
         float2byteGeneric(var9, var1, var2, var3, var5.getFrameSize(), var4, var5, var6);
         var3 += var5.getFrameSize() / var5.getChannels();
      }
   }

   static void float2byte(Object[] var0, int var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, float var8) {
      int var9 = var7 / var6;

      for (int var10 = 0; var10 < var6; var10++) {
         float[] var11 = (float[])var0[var10];
         float2byteGeneric(var11, var1, var2, var3, var7, var4, var5, var8);
         var3 += var9;
      }
   }

   public static void float2byteInterleaved(float[] var0, int var1, byte[] var2, int var3, int var4, AudioFormat var5, float var6) {
      float2byteGeneric(var0, var1, var2, var3, var5.getFrameSize() / var5.getChannels(), var4 * var5.getChannels(), var5, var6);
   }

   static void float2byteGeneric(float[] var0, int var1, byte[] var2, int var3, int var4, int var5, AudioFormat var6, float var7) {
      int var8 = getFormatType(var6);
      float2byteGeneric(var0, var1, var2, var3, var4, var5, var8, var7);
   }

   static void float2byteGeneric(float[] var0, int var1, byte[] var2, int var3, int var4, int var5, int var6, float var7) {
      if (var1 >= 0 && var1 + var5 <= var0.length && var5 >= 0) {
         if (var3 >= 0 && var3 + var5 * var4 < var2.length + var4 && var4 >= getSampleSize(var6)) {
            if (var7 != 0.0F && random == null) {
               random = new Random();
            }

            int var8 = var1 + var5;
            int var10 = var3;

            for (int var11 = var1; var11 < var8; var10 += var4) {
               switch (var6) {
                  case 1:
                     var2[var10] = (byte)(quantize8(var0[var11] * 128.0F, var7) + 128);
                     break;
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                  case 24:
                  case 25:
                  default:
                     throw new IllegalArgumentException("unsupported format=" + formatType2Str(var6));
                  case 9:
                     var2[var10] = quantize8(var0[var11] * 128.0F, var7);
                     break;
                  case 10:
                     int var18 = quantize16(var0[var11] * 32768.0F, var7);
                     var2[var10 + 1] = (byte)(var18 >> 8);
                     var2[var10] = (byte)(var18 & 0xFF);
                     break;
                  case 11:
                     int var17 = quantize24(var0[var11] * 8388608.0F, var7);
                     var2[var10 + 2] = (byte)(var17 >> 16);
                     var2[var10 + 1] = (byte)(var17 >>> 8 & 0xFF);
                     var2[var10] = (byte)(var17 & 0xFF);
                     break;
                  case 12:
                     int var16 = quantize24(var0[var11] * 8388608.0F, var7);
                     var2[var10 + 3] = (byte)(var16 >> 16);
                     var2[var10 + 2] = (byte)(var16 >>> 8 & 0xFF);
                     var2[var10 + 1] = (byte)(var16 & 0xFF);
                     var2[var10 + 0] = 0;
                     break;
                  case 13:
                     int var15 = quantize32(var0[var11] * 2.1474836E9F, var7);
                     var2[var10 + 3] = (byte)(var15 >> 24);
                     var2[var10 + 2] = (byte)(var15 >>> 16 & 0xFF);
                     var2[var10 + 1] = (byte)(var15 >>> 8 & 0xFF);
                     var2[var10] = (byte)(var15 & 0xFF);
                     break;
                  case 26:
                     int var14 = quantize16(var0[var11] * 32768.0F, var7);
                     var2[var10] = (byte)(var14 >> 8);
                     var2[var10 + 1] = (byte)(var14 & 0xFF);
                     break;
                  case 27:
                     int var13 = quantize24(var0[var11] * 8388608.0F, var7);
                     var2[var10] = (byte)(var13 >> 16);
                     var2[var10 + 1] = (byte)(var13 >>> 8 & 0xFF);
                     var2[var10 + 2] = (byte)(var13 & 0xFF);
                     break;
                  case 28:
                     int var12 = quantize24(var0[var11] * 8388608.0F, var7);
                     var2[var10 + 0] = 0;
                     var2[var10 + 1] = (byte)(var12 >> 16);
                     var2[var10 + 2] = (byte)(var12 >>> 8 & 0xFF);
                     var2[var10 + 3] = (byte)(var12 & 0xFF);
                     break;
                  case 29:
                     int var9 = quantize32(var0[var11] * 2.1474836E9F, var7);
                     var2[var10] = (byte)(var9 >> 24);
                     var2[var10 + 1] = (byte)(var9 >>> 16 & 0xFF);
                     var2[var10 + 2] = (byte)(var9 >>> 8 & 0xFF);
                     var2[var10 + 3] = (byte)(var9 & 0xFF);
               }

               var11++;
            }
         } else {
            throw new IllegalArgumentException(
               "invalid output index: output.length="
                  + var2.length
                  + " outByteOffset="
                  + var3
                  + " outByteStep="
                  + var4
                  + " sampleCount="
                  + var5
                  + " format="
                  + formatType2Str(var6)
            );
         }
      } else {
         throw new IllegalArgumentException("invalid input index: input.length=" + var0.length + " inOffset=" + var1 + " sampleCount=" + var5);
      }
   }
}
