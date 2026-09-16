package org.tritonus.sampled.convert;

import java.util.Arrays;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.AudioFormats;
import org.tritonus.share.sampled.TConversionTool;
import org.tritonus.share.sampled.convert.TEncodingFormatConversionProvider;
import org.tritonus.share.sampled.convert.TSynchronousFilteredAudioInputStream;

public class LawEncoder extends TEncodingFormatConversionProvider {
   static final int ALL = -1;
   static final AudioFormat[] LAW_FORMATS = new AudioFormat[]{
      new AudioFormat(Encoding.ALAW, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.ALAW, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.ULAW, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.ULAW, -1.0F, 8, -1, -1, -1.0F, true)
   };
   private static final AudioFormat[] INPUT_FORMATS = new AudioFormat[]{
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.ULAW, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.ULAW, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.ALAW, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.ALAW, -1.0F, 8, -1, -1, -1.0F, true)
   };
   private static final AudioFormat[] OUTPUT_FORMATS = LAW_FORMATS;
   static final int UNSIGNED8 = 1;
   static final int SIGNED8 = 2;
   static final int BIG_ENDIAN16 = 3;
   static final int LITTLE_ENDIAN16 = 4;
   static final int ALAW8 = 5;
   static final int ULAW8 = 6;

   public LawEncoder() {
      super(Arrays.asList(INPUT_FORMATS), Arrays.asList(OUTPUT_FORMATS));
   }

   @Override
   public AudioInputStream getAudioInputStream(AudioFormat var1, AudioInputStream var2) {
      AudioFormat var3 = var2.getFormat();
      if (AudioFormats.matches(var3, var1)) {
         return var2;
      }

      if (doMatch(var1.getFrameRate(), var3.getFrameRate()) && doMatch(var1.getChannels(), var3.getChannels()) && doMatch(var1.getSampleSizeInBits(), 8)) {
         if (var1.getEncoding().equals(Encoding.ULAW)) {
            return new LawEncoder.ToUlawStream(var2);
         }

         if (var1.getEncoding().equals(Encoding.ALAW)) {
            return new LawEncoder.ToAlawStream(var2);
         }
      }

      throw new IllegalArgumentException("format conversion not supported");
   }

   static int getConvertType(AudioFormat var0, int var1) {
      byte var2 = 0;
      Encoding var3 = var0.getEncoding();
      boolean var4 = var0.isBigEndian();
      int var5 = var0.getSampleSizeInBits();
      if (var3.equals(Encoding.PCM_SIGNED)) {
         if (var5 == 16) {
            if (var4) {
               var2 = 3;
            } else {
               var2 = 4;
            }
         } else if (var5 == 8) {
            var2 = 2;
         }
      } else if (var3.equals(Encoding.PCM_UNSIGNED)) {
         if (var5 == 8) {
            var2 = 1;
         }
      } else if (var3.equals(Encoding.ALAW)) {
         var2 = 5;
      } else if (var3.equals(Encoding.ULAW)) {
         var2 = 6;
      }

      if (var2 == var1) {
         var2 = 0;
      }

      return var2;
   }

   private static AudioFormat createTargetFormat(AudioFormat var0, Encoding var1) {
      return new AudioFormat(var1, var0.getSampleRate(), 8, var0.getChannels(), var0.getChannels(), var0.getSampleRate(), false);
   }

   static class ToAlawStream extends TSynchronousFilteredAudioInputStream {
      private int convertType;

      public ToAlawStream(AudioInputStream var1) {
         super(var1, LawEncoder.createTargetFormat(var1.getFormat(), Encoding.ALAW));
         this.convertType = LawEncoder.getConvertType(var1.getFormat(), 5);
         if (this.convertType == 0) {
            throw new IllegalArgumentException("format conversion not supported");
         }

         if (var1.getFormat().getSampleSizeInBits() == 8) {
            this.enableConvertInPlace();
         }
      }

      @Override
      protected int convert(byte[] var1, byte[] var2, int var3, int var4) {
         int var5 = var4 * this.getFormat().getChannels();
         switch (this.convertType) {
            case 1:
               TConversionTool.pcm82alaw(var1, 0, var2, var3, var5, false);
               break;
            case 2:
               TConversionTool.pcm82alaw(var1, 0, var2, var3, var5, true);
               break;
            case 3:
               TConversionTool.pcm162alaw(var1, 0, var2, var3, var5, true);
               break;
            case 4:
               TConversionTool.pcm162alaw(var1, 0, var2, var3, var5, false);
            case 5:
            default:
               break;
            case 6:
               TConversionTool.ulaw2alaw(var1, 0, var2, var3, var5);
         }

         return var4;
      }

      @Override
      protected void convertInPlace(byte[] var1, int var2, int var3) {
         int var4 = var3 * this.getFormat().getChannels();
         switch (this.convertType) {
            case 1:
               TConversionTool.pcm82alaw(var1, var2, var4, false);
               break;
            case 2:
               TConversionTool.pcm82alaw(var1, var2, var4, true);
               break;
            case 6:
               TConversionTool.ulaw2alaw(var1, var2, var4);
               break;
            default:
               throw new RuntimeException("ToAlawStream: Call to convertInPlace, but it cannot convert in place.");
         }
      }
   }

   static class ToUlawStream extends TSynchronousFilteredAudioInputStream {
      private int convertType;

      public ToUlawStream(AudioInputStream var1) {
         super(var1, LawEncoder.createTargetFormat(var1.getFormat(), Encoding.ULAW));
         this.convertType = LawEncoder.getConvertType(var1.getFormat(), 6);
         if (this.convertType == 0) {
            throw new IllegalArgumentException("format conversion not supported");
         }

         if (var1.getFormat().getSampleSizeInBits() == 8) {
            this.enableConvertInPlace();
         }
      }

      @Override
      protected int convert(byte[] var1, byte[] var2, int var3, int var4) {
         int var5 = var4 * this.getFormat().getChannels();
         switch (this.convertType) {
            case 1:
               TConversionTool.pcm82ulaw(var1, 0, var2, var3, var5, false);
               break;
            case 2:
               TConversionTool.pcm82ulaw(var1, 0, var2, var3, var5, true);
               break;
            case 3:
               TConversionTool.pcm162ulaw(var1, 0, var2, var3, var5, true);
               break;
            case 4:
               TConversionTool.pcm162ulaw(var1, 0, var2, var3, var5, false);
               break;
            case 5:
               TConversionTool.alaw2ulaw(var1, 0, var2, var3, var5);
         }

         return var4;
      }

      @Override
      protected void convertInPlace(byte[] var1, int var2, int var3) {
         int var4 = var3 * this.getFormat().getChannels();
         switch (this.convertType) {
            case 1:
               TConversionTool.pcm82ulaw(var1, var2, var4, false);
               break;
            case 2:
               TConversionTool.pcm82ulaw(var1, var2, var4, true);
               break;
            case 3:
            case 4:
            default:
               throw new RuntimeException("ToUlawStream: Call to convertInPlace, but it cannot convert in place.");
            case 5:
               TConversionTool.alaw2ulaw(var1, var2, var4);
         }
      }
   }
}
