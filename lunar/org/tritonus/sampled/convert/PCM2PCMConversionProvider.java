package org.tritonus.sampled.convert;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Arrays;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.ArraySet;
import org.tritonus.share.sampled.AudioFormats;
import org.tritonus.share.sampled.AudioUtils;
import org.tritonus.share.sampled.FloatSampleBuffer;
import org.tritonus.share.sampled.TConversionTool;
import org.tritonus.share.sampled.convert.TSimpleFormatConversionProvider;
import org.tritonus.share.sampled.convert.TSynchronousFilteredAudioInputStream;

public class PCM2PCMConversionProvider extends TSimpleFormatConversionProvider {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioConverter");
   private static final boolean ONLY_FLOAT_CONVERSION = false;
   public static final Encoding PCM_SIGNED = Encoding.PCM_SIGNED;
   public static final Encoding PCM_UNSIGNED = Encoding.PCM_UNSIGNED;
   private static final int ALL = -1;
   private static final AudioFormat[] OUTPUT_FORMATS = new AudioFormat[]{
      new AudioFormat(PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, false),
      new AudioFormat(PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 24, -1, -1, -1.0F, false),
      new AudioFormat(PCM_SIGNED, -1.0F, 24, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 32, -1, -1, -1.0F, false),
      new AudioFormat(PCM_SIGNED, -1.0F, 32, -1, -1, -1.0F, true)
   };
   private static final int UNSIGNED8 = 1;
   private static final int SIGNED8 = 2;
   private static final int BIG_ENDIAN16 = 3;
   private static final int LITTLE_ENDIAN16 = 4;
   private static final int BIG_ENDIAN24 = 5;
   private static final int LITTLE_ENDIAN24 = 6;
   private static final int BIG_ENDIAN32 = 7;
   private static final int LITTLE_ENDIAN32 = 8;
   private static final int CONVERT_NOT_POSSIBLE = 0;
   private static final int CONVERT_SIGN = 1;
   private static final int CONVERT_BYTE_ORDER16 = 2;
   private static final int CONVERT_BYTE_ORDER24 = 3;
   private static final int CONVERT_BYTE_ORDER32 = 4;
   private static final int CONVERT_16LTO8S = 5;
   private static final int CONVERT_16LTO8U = 6;
   private static final int CONVERT_16BTO8S = 7;
   private static final int CONVERT_16BTO8U = 8;
   private static final int CONVERT_8STO16L = 9;
   private static final int CONVERT_8STO16B = 10;
   private static final int CONVERT_8UTO16L = 11;
   private static final int CONVERT_8UTO16B = 12;
   private static final int CONVERT_ONLY_EXPAND_CHANNELS = 13;
   private static final int CONVERT_FLOAT = 100;
   private static final int CONVERT_NONE = 101;

   public PCM2PCMConversionProvider() {
      super(Arrays.asList(OUTPUT_FORMATS), Arrays.asList(OUTPUT_FORMATS));
   }

   @Override
   public AudioInputStream getAudioInputStream(AudioFormat var1, AudioInputStream var2) {
      AudioFormat var3 = var2.getFormat();
      if (AudioFormats.matches(var3, var1)) {
         return var2;
      }

      if (doMatch(var1.getFrameRate(), var3.getFrameRate()) && doMatch(var1.getSampleRate(), var3.getSampleRate())) {
         var1 = this.replaceNotSpecified(var3, var1);
         int var4 = this.getFormatType(var3);
         int var5 = this.getFormatType(var1);
         int var6 = this.getConversionType(var4, var3.getChannels(), var5, var1.getChannels());
         logger.log(
            Level.TRACE,
            "PCM2PCM: sourceType="
               + formatType2Str(var4)
               + ", "
               + var3.getChannels()
               + "ch targetType="
               + formatType2Str(var5)
               + ", "
               + var1.getChannels()
               + "ch conversionType="
               + conversionType2Str(var6)
         );
         if (var6 == 0) {
            throw new IllegalArgumentException("format conversion not supported");
         } else {
            return new PCM2PCMConversionProvider.PCM2PCMStream(var2, var1, var6);
         }
      } else {
         throw new IllegalArgumentException("format conversion not supported");
      }
   }

   @Override
   public AudioFormat[] getTargetFormats(Encoding var1, AudioFormat var2) {
      logger.log(Level.TRACE, ">PCM2PCMFormatConversionProvider.getTargetFormats(AudioFormat.Encoding, AudioFormat):");
      logger.log(Level.TRACE, "checking out possible target formats");
      logger.log(Level.TRACE, "from: " + var2);
      logger.log(Level.TRACE, "to  : " + var1);
      if (this.isConversionSupported(var1, var2)) {
         ArraySet var3 = new ArraySet();

         for (AudioFormat var5 : this.getCollectionTargetFormats()) {
            var5 = this.replaceNotSpecified(var2, var5);
            if (this.isConversionSupported(var5, var2)) {
               var3.add(var5);
            }
         }

         logger.log(Level.TRACE, "<found " + var3.size() + " matching formats.");
         return var3.toArray(EMPTY_FORMAT_ARRAY);
      } else {
         logger.log(Level.TRACE, "<returning empty array.");
         return EMPTY_FORMAT_ARRAY;
      }
   }

   @Override
   public boolean isConversionSupported(AudioFormat var1, AudioFormat var2) {
      var1 = this.replaceNotSpecified(var2, var1);
      boolean var3 = AudioFormats.matches(var2, var1)
         || doMatch(var1.getFrameRate(), var2.getFrameRate())
            && doMatch(var1.getSampleRate(), var2.getSampleRate())
            && this.getConversionType(this.getFormatType(var2), var2.getChannels(), this.getFormatType(var1), var1.getChannels()) != 0;
      logger.log(Level.TRACE, ">PCM2PCM: isConversionSupported(AudioFormat, AudioFormat):");
      logger.log(Level.TRACE, "checking if conversion possible");
      logger.log(Level.TRACE, "from: " + var2);
      logger.log(Level.TRACE, "to  : " + var1);
      logger.log(Level.TRACE, "< result : " + var3);
      return var3;
   }

   private int getFormatType(AudioFormat var1) {
      byte var2 = 0;
      Encoding var3 = var1.getEncoding();
      boolean var4 = var1.isBigEndian();
      int var5 = var1.getSampleSizeInBits();
      if (var3.equals(PCM_SIGNED)) {
         if (var5 == 32) {
            if (var4) {
               var2 = 7;
            } else {
               var2 = 8;
            }
         } else if (var5 == 24) {
            if (var4) {
               var2 = 5;
            } else {
               var2 = 6;
            }
         } else if (var5 == 16) {
            if (var4) {
               var2 = 3;
            } else {
               var2 = 4;
            }
         } else if (var5 == 8) {
            var2 = 2;
         }
      } else if (var3.equals(PCM_UNSIGNED) && var5 == 8) {
         var2 = 1;
      }

      return var2;
   }

   private int getConversionType(int var1, int var2, int var3, int var4) {
      if (var1 != 0 && var3 != 0 && (var2 == 1 || var4 == 1 || var4 == var2)) {
         if (var1 == var3) {
            if (var2 == var4) {
               return 101;
            }

            if (var2 == 1 && var4 > 1) {
               return 13;
            }
         }

         if (var2 == 1 && var4 >= 1 || var2 == var4) {
            if (var1 == 1 && var3 == 2 || var1 == 2 && var3 == 1) {
               return 1;
            }

            if (var1 == 3 && var3 == 4 || var1 == 4 && var3 == 3) {
               return 2;
            }

            if (var1 == 5 && var3 == 6 || var1 == 6 && var3 == 5) {
               return 3;
            }

            if (var1 == 7 && var3 == 8 || var1 == 8 && var3 == 7) {
               return 4;
            }

            if (var1 == 2 && var3 == 4) {
               return 9;
            }

            if (var1 == 2 && var3 == 3) {
               return 10;
            }

            if (var1 == 1 && var3 == 4) {
               return 11;
            }

            if (var1 == 1 && var3 == 3) {
               return 12;
            }
         }

         return 100;
      } else {
         return 0;
      }
   }

   private static String formatType2Str(int var0) {
      return switch (var0) {
         case 0 -> "unsupported";
         case 1 -> "UNSIGNED8";
         case 2 -> "SIGNED8";
         case 3 -> "BIG_ENDIAN16";
         case 4 -> "LITTLE_ENDIAN16";
         case 5 -> "BIG_ENDIAN24";
         case 6 -> "LITTLE_ENDIAN24";
         case 7 -> "BIG_ENDIAN32";
         case 8 -> "LITTLE_ENDIAN32";
         default -> "unknown";
      };
   }

   protected static String conversionType2Str(int var0) {
      return switch (var0) {
         case 0 -> "CONVERT_NOT_POSSIBLE";
         case 1 -> "CONVERT_SIGN";
         case 2 -> "CONVERT_BYTE_ORDER16";
         case 3 -> "CONVERT_BYTE_ORDER24";
         case 4 -> "CONVERT_BYTE_ORDER32";
         case 5 -> "CONVERT_16LTO8S";
         case 6 -> "CONVERT_16LTO8U";
         case 7 -> "CONVERT_16BTO8S";
         case 8 -> "CONVERT_16BTO8U";
         case 9 -> "CONVERT_8STO16L";
         case 10 -> "CONVERT_8STO16B";
         case 11 -> "CONVERT_8UTO16L";
         case 12 -> "CONVERT_8UTO16B";
         case 13 -> "CONVERT_ONLY_EXPAND_CHANNELS";
         case 100 -> "CONVERT_FLOAT";
         case 101 -> "CONVERT_NONE";
         default -> "unknown";
      };
   }

   static class PCM2PCMStream extends TSynchronousFilteredAudioInputStream {
      private int conversionType;
      private boolean needExpandChannels;
      private boolean needMixDown;
      private AudioFormat intermediateFloatBufferFormat;
      private FloatSampleBuffer floatBuffer = null;

      public PCM2PCMStream(AudioInputStream var1, AudioFormat var2, int var3) {
         super(
            var1,
            new AudioFormat(
               var2.getEncoding(),
               var1.getFormat().getSampleRate(),
               var2.getSampleSizeInBits(),
               var2.getChannels(),
               AudioUtils.getFrameSize(var2.getChannels(), var2.getSampleSizeInBits()),
               var1.getFormat().getFrameRate(),
               var2.isBigEndian(),
               var2.properties()
            )
         );
         PCM2PCMConversionProvider.logger.log(Level.TRACE, "PCM2PCMStream: constructor. ConversionType=" + PCM2PCMConversionProvider.conversionType2Str(var3));
         this.conversionType = var3;
         this.needExpandChannels = var1.getFormat().getChannels() < var2.getChannels();
         this.needMixDown = var1.getFormat().getChannels() > var2.getChannels();
         if (this.needMixDown && var3 != 100) {
            throw new IllegalArgumentException("PCM2PCMStream: MixDown only possible with CONVERT_FLOAT");
         }

         if (this.needMixDown && var2.getChannels() != 1) {
            throw new IllegalArgumentException("PCM2PCMStream: MixDown only possible with target channel count=1");
         }

         if (this.needExpandChannels && var1.getFormat().getChannels() != 1) {
            throw new IllegalArgumentException("PCM2PCMStream: Expanding channels only possible with source channel count=1");
         }

         if (var3 == 100) {
            int var4 = this.needExpandChannels ? 1 : var2.getChannels();
            this.intermediateFloatBufferFormat = new AudioFormat(
               var2.getEncoding(),
               var1.getFormat().getSampleRate(),
               var2.getSampleSizeInBits(),
               var4,
               AudioUtils.getFrameSize(var4, var2.getSampleSizeInBits()),
               var1.getFormat().getFrameRate(),
               var2.isBigEndian(),
               var2.properties()
            );
            this.enableConvertInPlace();
         }

         if (!this.needExpandChannels && (var3 == 1 || var3 == 2 || var3 == 3 || var3 == 4)) {
            this.enableConvertInPlace();
         }

         this.enableFloatConversion();
      }

      private static void do16BTO8S(byte[] var0, int var1, byte[] var2, int var3, int var4) {
         while (var4 > 0) {
            var2[var3++] = var0[var1++];
            var4--;
            var1++;
         }
      }

      private static void do16BTO8U(byte[] var0, int var1, byte[] var2, int var3, int var4) {
         while (var4 > 0) {
            var2[var3++] = (byte)(var0[var1++] + 128);
            var4--;
            var1++;
         }
      }

      private static void do8STO16L(byte[] var0, byte[] var1, int var2, int var3) {
         int var4 = 0;

         while (var3 > 0) {
            var1[var2++] = 0;
            var1[var2++] = var0[var4++];
            var3--;
         }
      }

      private static void do8UTO16L(byte[] var0, byte[] var1, int var2, int var3) {
         int var4 = 0;

         while (var3 > 0) {
            var1[var2++] = 0;
            var1[var2++] = (byte)(var0[var4++] + 128);
            var3--;
         }
      }

      private static void do8STO16B(byte[] var0, byte[] var1, int var2, int var3) {
         int var4 = 0;

         while (var3 > 0) {
            var1[var2++] = var0[var4++];
            var1[var2++] = 0;
            var3--;
         }
      }

      private static void do8UTO16B(byte[] var0, byte[] var1, int var2, int var3) {
         int var4 = 0;

         while (var3 > 0) {
            var1[var2++] = (byte)(var0[var4++] + 128);
            var1[var2++] = 0;
            var3--;
         }
      }

      private static void expandChannels(byte[] var0, int var1, int var2, int var3, int var4) {
         int var5 = var1 + var3 * var2;
         int var6 = var1 + var3 * var4 * var2;
         switch (var3) {
            case 1:
               if (var4 == 2) {
                  while (var2 > 0) {
                     var0[--var6] = var0[--var5];
                     var0[--var6] = var0[var5];
                     var2--;
                  }

                  return;
               }

               while (var2 > 0) {
                  var5--;

                  for (int var17 = 0; var17 < var4; var17++) {
                     var0[--var6] = var0[var5];
                  }

                  var2--;
               }

               return;
            case 2:
               if (var4 == 2) {
                  while (var2 > 0) {
                     var0[--var6] = var0[--var5];
                     var0[--var6] = var0[var5 - 1];
                     var0[--var6] = var0[var5];
                     var0[--var6] = var0[--var5];
                     var2--;
                  }

                  return;
               }

               while (var2 > 0) {
                  var5--;

                  for (int var16 = 0; var16 < var4; var16++) {
                     var0[--var6] = var0[var5];
                     var0[--var6] = var0[var5 - 1];
                  }

                  var5--;
                  var2--;
               }

               return;
            default:
               while (var2 > 0) {
                  for (int var7 = 0; var7 < var4; var7++) {
                     for (int var8 = 1; var8 <= var3; var8++) {
                        var0[--var6] = var0[var5 - var8];
                     }
                  }

                  var5 -= var3;
                  var2--;
               }
         }
      }

      private void doFloatConversion(FloatSampleBuffer var1) {
         this.doFloatConversion(var1, this.needExpandChannels);
      }

      private void doFloatConversion(FloatSampleBuffer var1, boolean var2) {
         if (this.needMixDown) {
            var1.mixDownChannels();
         }

         if (var2) {
            var1.expandChannel(this.getFormat().getChannels());
         }
      }

      private void doFloatConversion(byte[] var1, int var2, byte[] var3, int var4, int var5) {
         int var6 = var5 * ((this.getOriginalStream().getFormat().getSampleSizeInBits() + 7) / 8);
         if (this.floatBuffer == null) {
            this.floatBuffer = new FloatSampleBuffer();
         }

         this.floatBuffer.initFromByteArray(var1, var2, var6, this.getOriginalStream().getFormat());
         this.doFloatConversion(this.floatBuffer, false);
         this.floatBuffer.convertToByteArray(var3, var4, this.intermediateFloatBufferFormat);
      }

      @Override
      protected int convert(byte[] var1, byte[] var2, int var3, int var4) {
         int var5 = var4 * this.getOriginalStream().getFormat().getChannels();
         switch (this.conversionType) {
            case 1:
               TConversionTool.convertSign8(var1, 0, var2, var3, var5);
               break;
            case 2:
               TConversionTool.swapOrder16(var1, 0, var2, var3, var5);
               break;
            case 3:
               TConversionTool.swapOrder24(var1, 0, var2, var3, var5);
               break;
            case 4:
               TConversionTool.swapOrder32(var1, 0, var2, var3, var5);
               break;
            case 5:
               do16BTO8S(var1, 1, var2, var3, var5);
               break;
            case 6:
               do16BTO8U(var1, 1, var2, var3, var5);
               break;
            case 7:
               do16BTO8S(var1, 0, var2, var3, var5);
               break;
            case 8:
               do16BTO8U(var1, 0, var2, var3, var5);
               break;
            case 9:
               do8STO16L(var1, var2, var3, var5);
               break;
            case 10:
               do8STO16B(var1, var2, var3, var5);
               break;
            case 11:
               do8UTO16L(var1, var2, var3, var5);
               break;
            case 12:
               do8UTO16B(var1, var2, var3, var5);
               break;
            case 13:
               System.arraycopy(var1, 0, var2, var3, var4 * this.getOriginalStream().getFormat().getFrameSize());
               break;
            case 100:
               this.doFloatConversion(var1, 0, var2, var3, var5);
               break;
            default:
               throw new RuntimeException("PCM2PCMStream: Call to convert with unknown conversionType.");
         }

         if (this.needExpandChannels) {
            expandChannels(var2, var3, var4, (this.getFormat().getSampleSizeInBits() + 7) / 8, this.getFormat().getChannels());
         }

         return var4;
      }

      @Override
      protected void convertInPlace(byte[] var1, int var2, int var3) {
         int var4 = var3 * this.getOriginalStream().getFormat().getChannels();
         switch (this.conversionType) {
            case 1:
               TConversionTool.convertSign8(var1, var2, var4);
               break;
            case 2:
               TConversionTool.swapOrder16(var1, var2, var4);
               break;
            case 3:
               TConversionTool.swapOrder24(var1, var2, var4);
               break;
            case 4:
               TConversionTool.swapOrder32(var1, var2, var4);
               break;
            case 100:
               this.doFloatConversion(var1, var2, var1, var2, var4);
               if (this.needExpandChannels) {
                  expandChannels(var1, var2, var3, (this.getFormat().getSampleSizeInBits() + 7) / 8, this.getFormat().getChannels());
               }
               break;
            default:
               throw new RuntimeException("PCM2PCMStream: Call to convertInPlace, but it cannot convert in place.");
         }
      }

      @Override
      protected void convert(FloatSampleBuffer var1, int var2, int var3) {
         this.doFloatConversion(var1);
      }
   }
}
