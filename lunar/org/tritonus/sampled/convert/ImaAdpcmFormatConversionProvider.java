package org.tritonus.sampled.convert;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Arrays;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.AudioFormats;
import org.tritonus.share.sampled.convert.TEncodingFormatConversionProvider;
import org.tritonus.share.sampled.convert.TSynchronousFilteredAudioInputStream;

public class ImaAdpcmFormatConversionProvider extends TEncodingFormatConversionProvider {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioConverter");
   private static final Encoding IMA_ADPCM = new Encoding("IMA_ADPCM");
   private static final Encoding PCM_SIGNED = new Encoding("PCM_SIGNED");
   private static final AudioFormat[] INPUT_FORMATS = new AudioFormat[]{
      new AudioFormat(IMA_ADPCM, -1.0F, 4, 1, -1, -1.0F, false),
      new AudioFormat(IMA_ADPCM, -1.0F, 4, 1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 16, 1, 2, -1.0F, false),
      new AudioFormat(PCM_SIGNED, -1.0F, 16, 1, 2, -1.0F, true)
   };
   static final int[] indexTable = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
   static final int[] stepsizeTable = new int[]{
      7,
      8,
      9,
      10,
      11,
      12,
      13,
      14,
      16,
      17,
      19,
      21,
      23,
      25,
      28,
      31,
      34,
      37,
      41,
      45,
      50,
      55,
      60,
      66,
      73,
      80,
      88,
      97,
      107,
      118,
      130,
      143,
      157,
      173,
      190,
      209,
      230,
      253,
      279,
      307,
      337,
      371,
      408,
      449,
      494,
      544,
      598,
      658,
      724,
      796,
      876,
      963,
      1060,
      1166,
      1282,
      1411,
      1552,
      1707,
      1878,
      2066,
      2272,
      2499,
      2749,
      3024,
      3327,
      3660,
      4026,
      4428,
      4871,
      5358,
      5894,
      6484,
      7132,
      7845,
      8630,
      9493,
      10442,
      11487,
      12635,
      13899,
      15289,
      16818,
      18500,
      20350,
      22385,
      24623,
      27086,
      29794,
      32767
   };

   public ImaAdpcmFormatConversionProvider() {
      super(Arrays.asList(INPUT_FORMATS), Arrays.asList(INPUT_FORMATS));
   }

   @Override
   public AudioInputStream getAudioInputStream(AudioFormat var1, AudioInputStream var2) {
      logger.log(Level.TRACE, ">ImaAdpcmFormatConversionProvider.getAudioInputStream(): begin");
      logger.log(Level.TRACE, "checking if conversion supported");
      logger.log(Level.TRACE, "from: " + var2.getFormat());
      logger.log(Level.TRACE, "to: " + var1);
      var1 = this.getDefaultTargetFormat(var1, var2.getFormat());
      if (this.isConversionSupported(var1, var2.getFormat())) {
         TSynchronousFilteredAudioInputStream var3;
         if (var1.getEncoding().equals(IMA_ADPCM)) {
            logger.log(Level.TRACE, "conversion supported; trying to create EncodedImaAdpcmAudioInputStream");
            var3 = new ImaAdpcmFormatConversionProvider.EncodedImaAdpcmAudioInputStream(var2, var1);
         } else {
            logger.log(Level.TRACE, "conversion supported; trying to create DecodedImaAdpcmAudioInputStream");
            var3 = new ImaAdpcmFormatConversionProvider.DecodedImaAdpcmAudioInputStream(var2, var1);
         }

         logger.log(Level.TRACE, "<ImaAdpcmFormatConversionProvider.getAudioInputStream(): end");
         return var3;
      } else {
         logger.log(Level.TRACE, "<conversion not supported; throwing IllegalArgumentException");
         throw new IllegalArgumentException("conversion not supported");
      }
   }

   protected AudioFormat getDefaultTargetFormat(AudioFormat var1, AudioFormat var2) {
      logger.log(Level.TRACE, "ImaAdpcmFormatConversionProvider.getDefaultTargetFormat(): target format: " + var1);
      logger.log(Level.TRACE, "ImaAdpcmFormatConversionProvider.getDefaultTargetFormat(): source format: " + var2);
      AudioFormat var3 = null;

      for (AudioFormat var5 : this.getCollectionTargetFormats()) {
         if (AudioFormats.matches(var1, var5)) {
            var3 = var5;
         }
      }

      if (var3 == null) {
         throw new IllegalArgumentException("conversion not supported");
      }

      logger.log(Level.TRACE, "ImaAdpcmFormatConversionProvider.getDefaultTargetFormat(): new target format: " + var3);
      var3 = new AudioFormat(
         var1.getEncoding(),
         var2.getSampleRate(),
         var3.getSampleSizeInBits(),
         var3.getChannels(),
         var3.getFrameSize(),
         var2.getSampleRate(),
         var3.isBigEndian()
      );
      logger.log(Level.TRACE, "ImaAdpcmFormatConversionProvider.getDefaultTargetFormat(): really new target format: " + var3);
      return var3;
   }

   public static class DecodedImaAdpcmAudioInputStream extends TSynchronousFilteredAudioInputStream {
      private ImaAdpcmFormatConversionProvider.ImaAdpcmState m_state;

      public DecodedImaAdpcmAudioInputStream(AudioInputStream var1, AudioFormat var2) {
         super(var1, var2);
         ImaAdpcmFormatConversionProvider.logger.log(Level.TRACE, "DecodedImaAdpcmAudioInputStream.<init>(): begin");
         this.m_state = new ImaAdpcmFormatConversionProvider.ImaAdpcmState();
         ImaAdpcmFormatConversionProvider.logger.log(Level.TRACE, "DecodedImaAdpcmAudioInputStream.<init>(): end");
      }

      @Override
      protected int convert(byte[] var1, byte[] var2, int var3, int var4) {
         ImaAdpcmFormatConversionProvider.logger.log(Level.TRACE, "DecodedImaAdpcmAudioInputStream.convert(): begin");
         byte var13 = 0;
         int var15 = var4;
         int var5 = 0;
         int var6 = var3;
         int var10 = this.m_state.valprev;
         int var12 = this.m_state.index;
         int var9 = ImaAdpcmFormatConversionProvider.stepsizeTable[var12];
         boolean var14 = false;

         while (var15 > 0) {
            int var8;
            if (var14) {
               var8 = var13 & 15;
            } else {
               var13 = var1[var5];
               var5++;
               var8 = var13 >> 4 & 15;
            }

            var14 = !var14;
            var12 += ImaAdpcmFormatConversionProvider.indexTable[var8];
            if (var12 < 0) {
               var12 = 0;
            }

            if (var12 > 88) {
               var12 = 88;
            }

            int var7 = var8 & 8;
            var8 &= 7;
            int var11 = var9 >> 3;
            if ((var8 & 4) != 0) {
               var11 += var9;
            }

            if ((var8 & 2) != 0) {
               var11 += var9 >> 1;
            }

            if ((var8 & 1) != 0) {
               var11 += var9 >> 2;
            }

            if (var7 != 0) {
               var10 -= var11;
            } else {
               var10 += var11;
            }

            if (var10 > 32767) {
               var10 = 32767;
            } else if (var10 < -32768) {
               var10 = -32768;
            }

            var9 = ImaAdpcmFormatConversionProvider.stepsizeTable[var12];
            if (this.isBigEndian()) {
               var2[var6++] = (byte)(var10 >> 8);
               var2[var6++] = (byte)(var10 & 0xFF);
            } else {
               var2[var6++] = (byte)(var10 & 0xFF);
               var2[var6++] = (byte)(var10 >> 8);
            }

            var15--;
         }

         this.m_state.valprev = var10;
         this.m_state.index = var12;
         ImaAdpcmFormatConversionProvider.logger.log(Level.TRACE, "DecodedImaAdpcmAudioInputStream.convert(): end");
         return var4;
      }

      protected int getSampleSizeInBytes() {
         return this.getFormat().getFrameSize() / this.getFormat().getChannels();
      }

      protected int getFrameSize() {
         return this.getFormat().getFrameSize();
      }

      private boolean isBigEndian() {
         return this.getFormat().isBigEndian();
      }
   }

   public static class EncodedImaAdpcmAudioInputStream extends TSynchronousFilteredAudioInputStream {
      private ImaAdpcmFormatConversionProvider.ImaAdpcmState m_state;

      public EncodedImaAdpcmAudioInputStream(AudioInputStream var1, AudioFormat var2) {
         super(var1, var2);
         ImaAdpcmFormatConversionProvider.logger.log(Level.TRACE, "EncodedImaAdpcmAudioInputStream.<init>(): begin");
         this.m_state = new ImaAdpcmFormatConversionProvider.ImaAdpcmState();
         ImaAdpcmFormatConversionProvider.logger.log(Level.TRACE, "EncodedImaAdpcmAudioInputStream.<init>(): end");
      }

      @Override
      protected int convert(byte[] var1, byte[] var2, int var3, int var4) {
         ImaAdpcmFormatConversionProvider.logger.log(Level.TRACE, "EncodedImaAdpcmAudioInputStream.convert(): begin");
         int var15 = 0;
         int var17 = var4;
         byte var5 = 0;
         int var6 = var3;
         int var12 = this.m_state.valprev;
         int var14 = this.m_state.index;
         int var11 = ImaAdpcmFormatConversionProvider.stepsizeTable[var14];
         boolean var16 = true;

         while (var17 > 0) {
            int var7 = this.isBigEndian() ? var1[var5] << 8 | var1[var5 + 1] & 0xFF : var1[var5 + 1] << 8 | var1[var5] & 0xFF;
            var5 += 2;
            int var10 = var7 - var12;
            int var8 = var10 < 0 ? 8 : 0;
            if (var8 != 0) {
               var10 = -var10;
            }

            int var9 = 0;
            int var13 = var11 >> 3;
            if (var10 >= var11) {
               var9 = 4;
               var10 -= var11;
               var13 += var11;
            }

            var11 >>= 1;
            if (var10 >= var11) {
               var9 |= 2;
               var10 -= var11;
               var13 += var11;
            }

            var11 >>= 1;
            if (var10 >= var11) {
               var9 |= 1;
               var13 += var11;
            }

            if (var8 != 0) {
               var12 -= var13;
            } else {
               var12 += var13;
            }

            if (var12 > 32767) {
               var12 = 32767;
            } else if (var12 < -32768) {
               var12 = -32768;
            }

            var9 |= var8;
            var14 += ImaAdpcmFormatConversionProvider.indexTable[var9];
            if (var14 < 0) {
               var14 = 0;
            }

            if (var14 > 88) {
               var14 = 88;
            }

            var11 = ImaAdpcmFormatConversionProvider.stepsizeTable[var14];
            if (var16) {
               var15 = var9 << 4 & 240;
            } else {
               var2[var6++] = (byte)(var9 & 15 | var15);
            }

            var16 = !var16;
            var17--;
         }

         if (!var16) {
            var2[var6++] = (byte)var15;
         }

         this.m_state.valprev = var12;
         this.m_state.index = var14;
         ImaAdpcmFormatConversionProvider.logger.log(Level.TRACE, "EncodedImaAdpcmAudioInputStream.convert(): end");
         return var4;
      }

      protected int getSampleSizeInBytes() {
         return this.getFormat().getFrameSize() / this.getFormat().getChannels();
      }

      protected int getFrameSize() {
         return this.getFormat().getFrameSize();
      }

      private boolean isBigEndian() {
         return this.getFormat().isBigEndian();
      }
   }

   private static class ImaAdpcmState {
      public int valprev;
      public int index;
   }
}
