package net.sourceforge.lame.lowlevel;

import java.nio.ByteBuffer;
import net.sourceforge.lame.mp3.FrameSkip;
import net.sourceforge.lame.mp3.GetAudio;
import net.sourceforge.lame.mp3.Lame;
import net.sourceforge.lame.mp3.LameGlobalFlags;
import net.sourceforge.lame.mp3.MP3Data;

public class LameDecoder {
   private Lame lame = new Lame();

   public LameDecoder(String var1) {
      this.lame.getFlags().setWriteId3tagAutomatic(false);
      this.lame.initParams();
      this.lame.getParser().setInputFormat(GetAudio.SoundFileFormat.sf_mp3);
      FrameSkip var2 = new FrameSkip();
      this.lame.getAudio().initInFile(this.lame.getFlags(), var1, var2);
      int var3 = 0;
      int var4 = 0;
      if (this.lame.getParser().silent < 10) {
         System.out
            .printf(
               "\rinput:  %s%s(%g kHz, %d channel%s, ",
               var1,
               var1.length() > 26 ? "\n\t" : "  ",
               this.lame.getFlags().getInSampleRate() / 1000.0,
               this.lame.getFlags().getInNumChannels(),
               this.lame.getFlags().getInNumChannels() != 1 ? "s" : ""
            );
      }

      if (var2.getEncoderDelay() <= -1 && var2.getEncoderPadding() <= -1) {
         var3 = this.lame.getFlags().getEncoderDelay() + 528 + 1;
      } else {
         if (var2.getEncoderDelay() > -1) {
            var3 = var2.getEncoderDelay() + 528 + 1;
         }

         if (var2.getEncoderPadding() > -1) {
            var4 = var2.getEncoderPadding() - 529;
         }
      }

      System.out.printf("MPEG-%d%s Layer %s", 2 - this.lame.getFlags().getMpegVersion(), this.lame.getFlags().getOutSampleRate() < 16000 ? ".5" : "", "III");
      System.out.printf(")\noutput: (16 bit, Microsoft WAVE)\n");
      if (var3 > 0) {
         System.out.printf("skipping initial %d samples (encoder+decoder delay)\n", var3);
      }

      if (var4 > 0) {
         System.out.printf("skipping final %d samples (encoder padding-decoder delay)\n", var4);
      }

      int var5 = this.lame.getParser().getMp3InputData().getNumSamples() / this.lame.getParser().getMp3InputData().getFrameSize();
      this.lame.getParser().getMp3InputData().setTotalFrames(var5);
      assert this.lame.getFlags().getInNumChannels() >= 1 && this.lame.getFlags().getInNumChannels() <= 2;
   }

   public final boolean decode(ByteBuffer var1) {
      float[][] var2 = new float[2][1152];
      LameGlobalFlags var3 = this.lame.getFlags();
      int var4 = this.lame.getAudio().get_audio16(var3, var2);
      if (var4 >= 0) {
         MP3Data var5 = this.lame.getParser().getMp3InputData();
         int var6 = var5.getFramesDecodedCounter() + var4 / var5.getFrameSize();
         var5.setFramesDecodedCounter(var6);

         for (int var7 = 0; var7 < var4; var7++) {
            int var8 = (int)var2[0][var7] & 65535;
            var1.array()[(var7 << var3.getInNumChannels()) + 0] = (byte)(var8 & 0xFF);
            var1.array()[(var7 << var3.getInNumChannels()) + 1] = (byte)(var8 >> 8 & 0xFF);
            if (var3.getInNumChannels() == 2) {
               var8 = (int)var2[1][var7] & 65535;
               var1.array()[(var7 << var3.getInNumChannels()) + 2] = (byte)(var8 & 0xFF);
               var1.array()[(var7 << var3.getInNumChannels()) + 3] = (byte)(var8 >> 8 & 0xFF);
            }
         }
      }

      return var4 > 0;
   }

   public final void close() {
      this.lame.close();
   }

   public final int getChannels() {
      return this.lame.getFlags().getInNumChannels();
   }

   public final int getSampleRate() {
      return this.lame.getFlags().getInSampleRate();
   }

   public final int getFrameSize() {
      return this.lame.getFlags().getFrameSize();
   }
}
