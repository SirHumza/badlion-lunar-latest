package org.tritonus.sampled.convert;

import java.util.Arrays;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.AudioFormats;
import org.tritonus.share.sampled.TConversionTool;
import org.tritonus.share.sampled.convert.TEncodingFormatConversionProvider;
import org.tritonus.share.sampled.convert.TSynchronousFilteredAudioInputStream;

public class LawDecoder extends TEncodingFormatConversionProvider {
   private static final AudioFormat[] INPUT_FORMATS = LawEncoder.LAW_FORMATS;
   private static final AudioFormat[] OUTPUT_FORMATS = new AudioFormat[]{
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, false),
      new AudioFormat(Encoding.PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, true)
   };

   public LawDecoder() {
      super(Arrays.asList(INPUT_FORMATS), Arrays.asList(OUTPUT_FORMATS));
   }

   @Override
   public AudioInputStream getAudioInputStream(AudioFormat var1, AudioInputStream var2) {
      AudioFormat var3 = var2.getFormat();
      if (AudioFormats.matches(var3, var1)) {
         return var2;
      }

      if (doMatch(var1.getFrameRate(), var3.getFrameRate()) && doMatch(var1.getChannels(), var3.getChannels()) && doMatch(var3.getSampleSizeInBits(), 8)) {
         if (var3.getEncoding().equals(Encoding.ULAW)) {
            return new LawDecoder.FromUlawStream(var2, var1);
         }

         if (var3.getEncoding().equals(Encoding.ALAW)) {
            return new LawDecoder.FromAlawStream(var2, var1);
         }
      }

      throw new IllegalArgumentException("format conversion not supported");
   }

   private static AudioFormat createTargetFormat(AudioFormat var0, AudioFormat var1) {
      return new AudioFormat(
         var1.getEncoding(),
         var0.getSampleRate(),
         var1.getSampleSizeInBits(),
         var0.getChannels(),
         var1.getSampleSizeInBits() * var0.getChannels() / 8,
         var0.getFrameRate(),
         var1.isBigEndian()
      );
   }

   static class FromAlawStream extends TSynchronousFilteredAudioInputStream {
      private int convertType = LawEncoder.getConvertType(this.getFormat(), 5);

      public FromAlawStream(AudioInputStream var1, AudioFormat var2) {
         super(var1, LawDecoder.createTargetFormat(var1.getFormat(), var2));
         if (this.convertType == 0) {
            throw new IllegalArgumentException("format conversion not supported");
         }

         if (var2.getSampleSizeInBits() == 8) {
            this.enableConvertInPlace();
         }
      }

      @Override
      protected int convert(byte[] var1, byte[] var2, int var3, int var4) {
         int var5 = var4 * this.getFormat().getChannels();
         switch (this.convertType) {
            case 1:
               TConversionTool.alaw2pcm8(var1, 0, var2, var3, var5, false);
               break;
            case 2:
               TConversionTool.alaw2pcm8(var1, 0, var2, var3, var5, true);
               break;
            case 3:
               TConversionTool.alaw2pcm16(var1, 0, var2, var3, var5, true);
               break;
            case 4:
               TConversionTool.alaw2pcm16(var1, 0, var2, var3, var5, false);
            case 5:
            default:
               break;
            case 6:
               TConversionTool.alaw2ulaw(var1, 0, var2, var3, var5);
         }

         return var4;
      }

      @Override
      protected void convertInPlace(byte[] var1, int var2, int var3) {
         int var4 = var3 * this.format.getChannels();
         switch (this.convertType) {
            case 1:
               TConversionTool.alaw2pcm8(var1, var2, var4, false);
               break;
            case 2:
               TConversionTool.alaw2pcm8(var1, var2, var4, true);
               break;
            case 6:
               TConversionTool.alaw2ulaw(var1, var2, var4);
               break;
            default:
               throw new RuntimeException("FromAlawStream: Call to convertInPlace, but it cannot convert in place. (convertType=" + this.convertType + ")");
         }
      }
   }

   static class FromUlawStream extends TSynchronousFilteredAudioInputStream {
      private int convertType = LawEncoder.getConvertType(this.getFormat(), 6);

      public FromUlawStream(AudioInputStream var1, AudioFormat var2) {
         super(var1, LawDecoder.createTargetFormat(var1.getFormat(), var2));
         if (this.convertType == 0) {
            throw new IllegalArgumentException("format conversion not supported");
         }

         if (var2.getSampleSizeInBits() == 8) {
            this.enableConvertInPlace();
         }
      }

      @Override
      protected int convert(byte[] var1, byte[] var2, int var3, int var4) {
         int var5 = var4 * this.getFormat().getChannels();
         switch (this.convertType) {
            case 1:
               TConversionTool.ulaw2pcm8(var1, 0, var2, var3, var5, false);
               break;
            case 2:
               TConversionTool.ulaw2pcm8(var1, 0, var2, var3, var5, true);
               break;
            case 3:
               TConversionTool.ulaw2pcm16(var1, 0, var2, var3, var5, true);
               break;
            case 4:
               TConversionTool.ulaw2pcm16(var1, 0, var2, var3, var5, false);
               break;
            case 5:
               TConversionTool.ulaw2alaw(var1, 0, var2, var3, var5);
         }

         return var4;
      }

      @Override
      protected void convertInPlace(byte[] var1, int var2, int var3) {
         int var4 = var3 * this.format.getChannels();
         switch (this.convertType) {
            case 1:
               TConversionTool.ulaw2pcm8(var1, var2, var4, false);
               break;
            case 2:
               TConversionTool.ulaw2pcm8(var1, var2, var4, true);
               break;
            case 3:
            case 4:
            default:
               throw new RuntimeException("FromUlawStream: Call to convertInPlace, but it cannot convert in place. (convertType=" + this.convertType + ")");
            case 5:
               TConversionTool.ulaw2alaw(var1, var2, var4);
         }
      }
   }
}
