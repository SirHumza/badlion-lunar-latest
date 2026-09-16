package net.sourceforge.lame.mp3;

import java.beans.PropertyChangeSupport;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {
   private static final int MAX_NOGAP = 200;
   private static final int MAX_WIDTH = 79;
   private Lame lame;
   private Usage usage = new Usage();
   private Version version = new Version();
   private PropertyChangeSupport support = new PropertyChangeSupport(this);
   private double last_time = 0.0;
   private int oldPercent;
   private int curPercent;
   private int oldConsoleX;

   public static final void main(String[] var0) {
      try {
         new Main().run(var0);
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   public PropertyChangeSupport getSupport() {
      return this.support;
   }

   private int parse_args_from_string(String var1, StringBuilder var2, StringBuilder var3) {
      if (var1 != null && var1.length() != 0) {
         StringTokenizer var4 = new StringTokenizer(var1, " ");
         ArrayList var5 = new ArrayList();

         while (var4.hasMoreTokens()) {
            var5.add(var4.nextToken());
         }

         return this.lame.getParser().parse_args(this.lame.getFlags(), var5, var2, var3, null, null);
      } else {
         return 0;
      }
   }

   private DataOutput init_files(String var1, String var2, FrameSkip var3) {
      if (var1.equals(var2)) {
         System.err.println("Input file and Output file are the same. Abort.");
         return null;
      }

      this.lame.getAudio().initInFile(this.lame.getFlags(), var1, var3);

      try {
         FileOutputStream var4 = new FileOutputStream(var2);
         return new DataOutputStream(new BufferedOutputStream(var4, 1048576));
      } catch (FileNotFoundException var5) {
         System.err.printf("Can't init outfile '%s'\n", var2);
         return null;
      }
   }

   private void lame_decoder(DataOutput var1, int var2, String var3, String var4, FrameSkip var5) {
      float[][] var6 = new float[2][1152];
      int var8 = 0;
      int var10 = this.lame.getFlags().getInNumChannels();
      if (this.lame.getParser().silent < 10) {
         System.out
            .printf(
               "\rinput:  %s%s(%g kHz, %d channel%s, ",
               var3,
               var3.length() > 26 ? "\n\t" : "  ",
               this.lame.getFlags().getInSampleRate() / 1000.0,
               var10,
               var10 != 1 ? "s" : ""
            );
      }

      switch (this.lame.getParser().getInputFormat()) {
         case sf_mp123:
            throw new RuntimeException("Internal error.  Aborting.");
         case sf_mp3:
            if (var2 == 0) {
               if (var5.getEncoderDelay() <= -1 && var5.getEncoderPadding() <= -1) {
                  var2 = this.lame.getFlags().getEncoderDelay() + 528 + 1;
               } else {
                  if (var5.getEncoderDelay() > -1) {
                     var2 = var5.getEncoderDelay() + 528 + 1;
                  }

                  if (var5.getEncoderPadding() > -1) {
                     var8 = var5.getEncoderPadding() - 529;
                  }
               }
            } else {
               var2 += 529;
            }

            if (this.lame.getParser().silent < 10) {
               System.out
                  .printf("MPEG-%d%s Layer %s", 2 - this.lame.getFlags().getMpegVersion(), this.lame.getFlags().getOutSampleRate() < 16000 ? ".5" : "", "III");
            }
            break;
         case sf_mp2:
            var2 += 241;
            if (this.lame.getParser().silent < 10) {
               System.out
                  .printf("MPEG-%d%s Layer %s", 2 - this.lame.getFlags().getMpegVersion(), this.lame.getFlags().getOutSampleRate() < 16000 ? ".5" : "", "II");
            }
            break;
         case sf_mp1:
            var2 += 241;
            if (this.lame.getParser().silent < 10) {
               System.out
                  .printf("MPEG-%d%s Layer %s", 2 - this.lame.getFlags().getMpegVersion(), this.lame.getFlags().getOutSampleRate() < 16000 ? ".5" : "", "I");
            }
            break;
         case sf_raw:
            if (this.lame.getParser().silent < 10) {
               System.out.printf("raw PCM data");
            }

            this.lame.getParser().getMp3InputData().setNumSamples(this.lame.getFlags().num_samples);
            this.lame.getParser().getMp3InputData().setFrameSize(1152);
            var2 = 0;
            break;
         case sf_wave:
            if (this.lame.getParser().silent < 10) {
               System.out.printf("Microsoft WAVE");
            }

            this.lame.getParser().getMp3InputData().setNumSamples(this.lame.getFlags().num_samples);
            this.lame.getParser().getMp3InputData().setFrameSize(1152);
            var2 = 0;
            break;
         case sf_aiff:
            if (this.lame.getParser().silent < 10) {
               System.out.printf("SGI/Apple AIFF");
            }

            this.lame.getParser().getMp3InputData().setNumSamples(this.lame.getFlags().num_samples);
            this.lame.getParser().getMp3InputData().setFrameSize(1152);
            var2 = 0;
            break;
         default:
            if (this.lame.getParser().silent < 10) {
               System.out.printf("unknown");
            }

            this.lame.getParser().getMp3InputData().setNumSamples(this.lame.getFlags().num_samples);
            this.lame.getParser().getMp3InputData().setFrameSize(1152);
            var2 = 0;
            assert false;
      }

      if (this.lame.getParser().silent < 10) {
         System.out.printf(")\noutput: %s%s(16 bit, Microsoft WAVE)\n", var4, var4.length() > 45 ? "\n\t" : "  ");
         if (var2 > 0) {
            System.out.printf("skipping initial %d samples (encoder+decoder delay)\n", var2);
         }

         if (var8 > 0) {
            System.out.printf("skipping final %d samples (encoder padding-decoder delay)\n", var8);
         }
      }

      if (!this.lame.getParser().embedded) {
         System.out.print("|");

         for (int var11 = 0; var11 < 77; var11++) {
            System.out.print("=");
         }

         System.out.println("|");
      }

      this.oldPercent = this.curPercent = this.oldConsoleX = 0;
      if (!this.lame.getParser().disable_wav_header) {
         this.lame.getAudio().WriteWaveHeader(var1, Integer.MAX_VALUE, this.lame.getFlags().getInSampleRate(), var10, 16);
      }

      double var16 = -(var2 + var8);
      this.lame
         .getParser()
         .getMp3InputData()
         .setTotalFrames(this.lame.getParser().getMp3InputData().getNumSamples() / this.lame.getParser().getMp3InputData().getFrameSize());
      assert var10 >= 1 && var10 <= 2;

      int var7;
      do {
         var7 = this.lame.getAudio().get_audio16(this.lame.getFlags(), var6);
         if (var7 >= 0) {
            this.lame
               .getParser()
               .getMp3InputData()
               .setFramesDecodedCounter(
                  this.lame.getParser().getMp3InputData().getFramesDecodedCounter() + var7 / this.lame.getParser().getMp3InputData().getFrameSize()
               );
            var16 += var7;
            if (this.lame.getParser().silent <= 0 || this.lame.getParser().embedded) {
               this.timestatus(this.lame.getParser().getMp3InputData().getFramesDecodedCounter(), this.lame.getParser().getMp3InputData().getTotalFrames());
            }

            int var9;
            var2 -= var9 = var2 < var7 ? var2 : var7;
            if (var8 > 1152 && this.lame.getParser().getMp3InputData().getFramesDecodedCounter() + 2 > this.lame.getParser().getMp3InputData().getTotalFrames()
               )
             {
               var7 -= var8 - 1152;
               var8 = 1152;
            } else if (this.lame.getParser().getMp3InputData().getFramesDecodedCounter() == this.lame.getParser().getMp3InputData().getTotalFrames()
               && var7 != 0) {
               var7 -= var8;
            }

            for (; var9 < var7; var9++) {
               if (this.lame.getParser().disable_wav_header) {
                  if (this.lame.getParser().swapbytes) {
                     this.WriteBytesSwapped(var1, var6[0], var9);
                  } else {
                     this.WriteBytes(var1, var6[0], var9);
                  }

                  if (var10 == 2) {
                     if (this.lame.getParser().swapbytes) {
                        this.WriteBytesSwapped(var1, var6[1], var9);
                     } else {
                        this.WriteBytes(var1, var6[1], var9);
                     }
                  }
               } else {
                  this.lame.getAudio().write16BitsLowHigh(var1, (int)var6[0][var9] & 65535);
                  if (var10 == 2) {
                     this.lame.getAudio().write16BitsLowHigh(var1, (int)var6[1][var9] & 65535);
                  }
               }
            }
         }
      } while (var7 > 0);

      if (this.lame.getParser().silent <= 0) {
         for (int var14 = this.curPercent; var14 < 100; var14++) {
            this.progressStep(var14);
            this.curPercent++;
         }

         System.out.println();
      }

      int var15 = 2 * var10;
      assert var15 > 0;
      if (var16 <= 0.0) {
         if (this.lame.getParser().silent < 10) {
            System.err.println("WAVE file contains 0 PCM samples");
         }

         var16 = 0.0;
      } else if (var16 > 4294967248L / var15) {
         if (this.lame.getParser().silent < 10) {
            System.err.println("Very huge WAVE file, can't set filesize accordingly");
         }

         var16 = -48.0;
      } else {
         var16 *= var15;
      }

      ((Closeable)var1).close();
      if (!this.lame.getParser().disable_wav_header) {
         RandomAccessFile var13 = new RandomAccessFile(var4, "rw");
         this.lame.getAudio().WriteWaveHeader(var13, (int)var16, this.lame.getFlags().getInSampleRate(), var10, 16);
         var13.close();
      }

      if (!this.lame.getParser().embedded) {
         System.out.print("|");

         for (int var18 = 0; var18 < 77; var18++) {
            System.out.print("=");
         }

         System.out.println("|");
      }
   }

   private void print_lame_tag_leading_info() {
      if (this.lame.getFlags().bWriteVbrTag) {
         System.out.println("Writing LAME Tag...");
      }
   }

   private void print_trailing_info() {
      if (this.lame.getFlags().bWriteVbrTag) {
         System.out.println("done\n");
      }

      if (this.lame.getFlags().isFindReplayGain()) {
         int var1 = this.lame.getFlags().internal_flags.RadioGain;
         System.out.printf("ReplayGain: %s%.1fdB\n", var1 > 0 ? "+" : "", var1 / 10.0F);
         if (var1 > 510 || var1 < -510) {
            System.out.println("WARNING: ReplayGain exceeds the -51dB to +51dB range. Such a result is too\n         high to be stored in the header.");
         }
      }

      if (this.lame.getParser().print_clipping_info && this.lame.getFlags().decode_on_the_fly) {
         float var3 = this.lame.getFlags().internal_flags.noclipGainChange / 10.0F;
         float var2 = this.lame.getFlags().internal_flags.noclipScale;
         if (var3 > 0.0) {
            System.out
               .printf(
                  "WARNING: clipping occurs at the current gain. Set your decoder to decrease\n         the  gain  by  at least %.1fdB or encode again ", var3
               );
            if (var2 > 0.0F) {
               System.out.printf(Locale.US, "using  --scale %.2f\n", var2);
               System.out.print("         or less (the value under --scale is approximate).\n");
            } else {
               System.out
                  .print("using --scale <arg>\n         (For   a   suggestion  on  the  optimal  value  of  <arg>  encode\n         with  --scale 1  first)\n");
            }
         } else if (var3 > -0.1) {
            System.out.print("\nThe waveform does not clip and is less than 0.1dB away from full scale.\n");
         } else {
            System.out.printf("\nThe waveform does not clip and is at least %.1fdB away from full scale.\n", -var3);
         }
      }
   }

   private int write_xing_frame(RandomAccessFile var1) {
      byte[] var2 = new byte[147456];
      int var3 = this.lame.getVbr().getLameTagFrame(this.lame.getFlags(), var2);
      if (var3 > var2.length) {
         System.err.printf("Error writing LAME-tag frame: buffer too small: buffer size=%d  frame size=%d\n", var2.length, var3);
         return -1;
      }

      if (var3 <= 0) {
         return 0;
      }

      try {
         var1.write(var2, 0, var3);
         return var3;
      } catch (IOException var5) {
         System.err.println("Error writing LAME-tag");
         return -1;
      }
   }

   private int lame_encoder(DataOutput var1, boolean var2, String var3, String var4) {
      byte[] var5 = new byte[147456];
      float[][] var6 = new float[2][1152];
      this.encoder_progress_begin(var3, var4);
      int var8 = this.lame.getId3().lame_get_id3v2_tag(this.lame.getFlags(), var5, var5.length);
      if (var8 > var5.length) {
         this.encoder_progress_end();
         System.err.printf("Error writing ID3v2 tag: buffer too small: buffer size=%d  ID3v2 size=%d\n", var5.length, var8);
         return 1;
      }

      try {
         var1.write(var5, 0, var8);
      } catch (IOException var15) {
         this.encoder_progress_end();
         System.err.printf("Error writing ID3v2 tag \n");
         return 1;
      }

      int var9 = var8;

      int var7;
      do {
         var7 = this.lame.getAudio().get_audio(this.lame.getFlags(), var6);
         if (var7 >= 0) {
            this.encoder_progress();
            var8 = this.lame.encodeBuffer(var6[0], var6[1], var7, var5);
            if (var8 < 0) {
               if (var8 == -1) {
                  System.err.printf("mp3 buffer is not big enough... \n");
               } else {
                  System.err.printf("mp3 internal error:  error code=%d\n", var8);
               }

               return 1;
            }

            try {
               var1.write(var5, 0, var8);
            } catch (IOException var14) {
               this.encoder_progress_end();
               System.err.printf("Error writing mp3 output \n");
               return 1;
            }
         }
      } while (var7 > 0);

      if (var2) {
         var8 = this.lame.lame_encode_flush_nogap(var5, var5.length);
      } else {
         var8 = this.lame.encodeFlush(var5);
      }

      if (var8 < 0) {
         if (var8 == -1) {
            System.err.printf("mp3 buffer is not big enough... \n");
         } else {
            System.err.printf("mp3 internal error:  error code=%d\n", var8);
         }

         return 1;
      } else {
         this.encoder_progress_end();

         try {
            var1.write(var5, 0, var8);
         } catch (IOException var13) {
            this.encoder_progress_end();
            System.err.printf("Error writing mp3 output \n");
            return 1;
         }

         var8 = this.lame.getId3().lame_get_id3v1_tag(this.lame.getFlags(), var5, var5.length);
         if (var8 > var5.length) {
            System.err.printf("Error writing ID3v1 tag: buffer too small: buffer size=%d  ID3v1 size=%d\n", var5.length, var8);
         } else if (var8 > 0) {
            try {
               var1.write(var5, 0, var8);
            } catch (IOException var12) {
               this.encoder_progress_end();
               System.err.printf("Error writing ID3v1 tag \n");
               return 1;
            }
         }

         if (this.lame.getParser().silent <= 0) {
            this.print_lame_tag_leading_info();
         }

         try {
            ((Closeable)var1).close();
            RandomAccessFile var10 = new RandomAccessFile(var4, "rw");
            var10.seek(var9);
            this.write_xing_frame(var10);
            var10.close();
         } catch (IOException var11) {
            System.err.printf("fatal error: can't update LAME-tag frame!\n");
         }

         this.print_trailing_info();
         return 0;
      }
   }

   private void brhist_init_package() {
      if (this.lame.getParser().brhist) {
         if (this.lame.getHist().brhist_init(this.lame.getFlags(), this.lame.getFlags().VBR_min_bitrate_kbps, this.lame.getFlags().VBR_max_bitrate_kbps) != 0) {
            this.lame.getParser().brhist = false;
         }
      } else {
         this.lame.getHist().brhist_init(this.lame.getFlags(), 128, 128);
      }
   }

   private void parse_nogap_filenames(int var1, String var2, StringBuilder var3, StringBuilder var4) {
      var3.setLength(0);
      var3.append(var4);
      if (0 == var1) {
         var3.setLength(0);
         var3.append(var2);
         if (var3.toString().endsWith(".wav")) {
            var3.setLength(0);
            var3.append(var3.substring(0, var3.length() - 4) + ".mp3");
         } else {
            var3.setLength(0);
            var3.append(var3 + ".mp3");
         }
      } else {
         int var5 = var2.lastIndexOf(System.getProperty("file.separator"));
         if (var5 == 0 || !var3.toString().endsWith(System.getProperty("file.separator")) && !var3.toString().endsWith(":")) {
            if (var5 == 0 && (!var3.toString().endsWith(System.getProperty("file.separator")) || var3.toString().endsWith(":"))) {
               var3.append(System.getProperty("file.separator"));
            }
         } else {
            var5++;
         }

         var3.append(var2.substring(var5));
         if (var3.toString().endsWith(".wav")) {
            String var6 = var3.substring(0, var3.length() - 4) + ".mp3";
            var3.setLength(0);
            var3.append(var6);
         } else {
            String var7 = var3 + ".mp3";
            var3.setLength(0);
            var3.append(var7);
         }
      }
   }

   public int run(String[] var1) {
      this.lame = new Lame();
      StringBuilder var2 = new StringBuilder();
      StringBuilder var3 = new StringBuilder();
      StringBuilder var4 = new StringBuilder();
      FrameSkip var5 = new FrameSkip();
      byte var6 = 0;
      int var7 = 200;
      String[] var8 = new String[var7];
      this.lame.getParser().setInputFormat(GetAudio.SoundFileFormat.sf_unknown);
      if (var1.length < 1) {
         System.err.println(this.version.getVersion());
         System.err.println();
         this.usage.print(System.err);
         this.lame.close();
         return 1;
      }

      this.parse_args_from_string(System.getenv("LAMEOPT"), var4, var2);
      ArrayList var10 = new ArrayList();

      for (int var11 = 0; var11 < var1.length; var11++) {
         var10.add(var1[var11]);
      }

      Parse.NoGap var16 = new Parse.NoGap();
      int var12 = this.lame.getParser().parse_args(this.lame.getFlags(), var10, var4, var2, var8, var16);
      var7 = var16.num_nogap;
      if (var12 < 0) {
         this.lame.close();
         return var12 == -2 ? 0 : 1;
      }

      if (this.lame.getParser().update_interval < 0.0) {
         this.lame.getParser().update_interval = 2.0F;
      }

      if (var2.length() != 0 && var7 > 0) {
         var3 = var2;
         var6 = 1;
      }

      DataOutput var9;
      if (var7 > 0) {
         this.parse_nogap_filenames(var6, var8[0], var2, var3);
         var9 = this.init_files(var8[0], var2.toString(), var5);
      } else {
         var9 = this.init_files(var4.toString(), var2.toString(), var5);
      }

      if (var9 == null) {
         this.lame.close();
         return -1;
      }

      this.lame.getFlags().setWriteId3tagAutomatic(false);
      int var13 = this.lame.initParams();
      if (var13 < 0) {
         if (var13 == -1) {
            this.usage.printBitrates(System.err);
         }

         System.err.println("fatal error during initialization");
         this.lame.close();
         return var13;
      } else {
         if (this.lame.getParser().silent > 0) {
            this.lame.getParser().brhist = false;
         }

         if (this.lame.getFlags().decode_only) {
            if (this.lame.getParser().mp3_delay_set) {
               this.lame_decoder(var9, this.lame.getParser().mp3_delay, var4.toString(), var2.toString(), var5);
            } else {
               this.lame_decoder(var9, 0, var4.toString(), var2.toString(), var5);
            }
         } else if (var7 > 0) {
            for (int var17 = 0; var17 < var7; var17++) {
               boolean var14 = var17 != var7 - 1;
               if (var17 > 0) {
                  this.parse_nogap_filenames(var6, var8[var17], var2, var3);
                  var9 = this.init_files(var8[var17], var2.toString(), var5);
                  this.lame.lame_init_bitstream();
               }

               this.brhist_init_package();
               this.lame.getFlags().internal_flags.nogap_total = var7;
               this.lame.getFlags().internal_flags.nogap_current = var17;
               var12 = this.lame_encoder(var9, var14, var8[var17], var2.toString());
               ((Closeable)var9).close();
               this.lame.getAudio().close_infile();
            }
         } else {
            this.brhist_init_package();
            var12 = this.lame_encoder(var9, false, var4.toString(), var2.toString());
            ((Closeable)var9).close();
            this.lame.getAudio().close_infile();
         }

         this.lame.close();
         return var12;
      }
   }

   private void encoder_progress_begin(String var1, String var2) {
      if (this.lame.getParser().silent < 10) {
         this.lame.lame_print_config();
         System.out.printf("Encoding %s%s to %s\n", var1, var1.length() + var2.length() < 66 ? "" : "\n     ", var2);
         System.out.printf("Encoding as %g kHz ", 0.001 * this.lame.getFlags().getOutSampleRate());
         String[][] var3 = new String[][]{{"stereo", "j-stereo", "dual-ch", "single-ch"}, {"stereo", "force-ms", "dual-ch", "single-ch"}};
         switch (this.lame.getFlags().getVBR()) {
            case vbr_rh:
               System.out
                  .printf(
                     "%s MPEG-%d%s Layer III VBR(q=%g) qval=%d\n",
                     var3[this.lame.getFlags().force_ms ? 1 : 0][this.lame.getFlags().getMode().getNumMode()],
                     2 - this.lame.getFlags().getMpegVersion(),
                     this.lame.getFlags().getOutSampleRate() < 16000 ? ".5" : "",
                     this.lame.getFlags().getVBRQuality() + this.lame.getFlags().VBR_q_frac,
                     this.lame.getFlags().getQuality()
                  );
               break;
            case vbr_mt:
            case vbr_mtrh:
               System.out
                  .printf(
                     "%s MPEG-%d%s Layer III VBR(q=%d)\n",
                     var3[this.lame.getFlags().force_ms ? 1 : 0][this.lame.getFlags().getMode().getNumMode()],
                     2 - this.lame.getFlags().getMpegVersion(),
                     this.lame.getFlags().getOutSampleRate() < 16000 ? ".5" : "",
                     this.lame.getFlags().getQuality()
                  );
               break;
            case vbr_abr:
               System.out
                  .printf(
                     "%s MPEG-%d%s Layer III (%gx) average %d kbps qval=%d\n",
                     var3[this.lame.getFlags().force_ms ? 1 : 0][this.lame.getFlags().getMode().getNumMode()],
                     2 - this.lame.getFlags().getMpegVersion(),
                     this.lame.getFlags().getOutSampleRate() < 16000 ? ".5" : "",
                     0.1 * (int)(10.0 * this.lame.getFlags().compression_ratio + 0.5),
                     this.lame.getFlags().VBR_mean_bitrate_kbps,
                     this.lame.getFlags().getQuality()
                  );
               break;
            default:
               System.out
                  .printf(
                     "%s MPEG-%d%s Layer III (%gx) %3d kbps qval=%d\n",
                     var3[this.lame.getFlags().force_ms ? 1 : 0][this.lame.getFlags().getMode().getNumMode()],
                     2 - this.lame.getFlags().getMpegVersion(),
                     this.lame.getFlags().getOutSampleRate() < 16000 ? ".5" : "",
                     0.1 * (int)(10.0 * this.lame.getFlags().compression_ratio + 0.5),
                     this.lame.getFlags().getBitRate(),
                     this.lame.getFlags().getQuality()
                  );
         }

         if (this.lame.getParser().silent <= -10) {
            this.lame.lame_print_internals();
         }

         if (!this.lame.getParser().embedded) {
            System.out.print("|");

            for (int var4 = 0; var4 < 77; var4++) {
               System.out.print("=");
            }

            System.out.println("|");
         }

         this.oldPercent = this.curPercent = this.oldConsoleX = 0;
      }
   }

   private void encoder_progress() {
      if (this.lame.getParser().silent <= 0 || this.lame.getParser().embedded) {
         int var1 = this.lame.getFlags().frameNum;
         if (this.lame.getParser().update_interval <= 0.0F) {
            if (var1 % 100 != 0) {
               return;
            }
         } else {
            if (var1 != 0 && var1 != 9) {
               double var2 = System.currentTimeMillis();
               double var4 = var2 - this.last_time;
               if (var4 >= 0.0 && var4 < this.lame.getParser().update_interval) {
                  return;
               }
            }

            this.last_time = System.currentTimeMillis();
         }

         if (this.lame.getParser().brhist) {
            this.lame.getHist().brhist_jump_back();
         }

         this.timestatus(this.lame.getFlags().frameNum, this.lame_get_totalframes());
         if (this.lame.getParser().brhist) {
            this.lame.getHist().brhist_disp(this.lame.getFlags());
         }
      }
   }

   private void encoder_progress_end() {
      if (this.lame.getParser().silent <= 0 || this.lame.getParser().embedded) {
         if (this.lame.getParser().brhist) {
            this.lame.getHist().brhist_jump_back();
         }

         this.timestatus(this.lame.getFlags().frameNum, this.lame_get_totalframes());
         if (this.lame.getParser().brhist) {
            this.lame.getHist().brhist_disp(this.lame.getFlags());
         }

         if (!this.lame.getParser().embedded) {
            System.out.print("|");

            for (int var1 = 0; var1 < 77; var1++) {
               System.out.print("=");
            }

            System.out.println("|");
         }
      }
   }

   private void timestatus(int var1, int var2) {
      int var3;
      if (var1 < var2) {
         var3 = (int)(100.0 * var1 / var2 + 0.5);
      } else {
         var3 = 100;
      }

      if (this.oldPercent != var3) {
         this.progressStep(var3);
         this.curPercent++;
      }

      this.oldPercent = var3;
   }

   private void progressStep(int var1) {
      float var2 = var1 * 79.0F / 100.0F;
      if ((int)var2 != this.oldConsoleX && !this.lame.getParser().embedded) {
         System.out.print(".");
      }

      this.oldConsoleX = (int)var2;
      this.support.firePropertyChange("progress", this.oldPercent, var1);
   }

   private int lame_get_totalframes() {
      return (int)(
         2.0
            + (double)this.lame.getFlags().num_samples
               * this.lame.getFlags().getOutSampleRate()
               / ((double)this.lame.getFlags().getInSampleRate() * this.lame.getFlags().getFrameSize())
      );
   }

   private void WriteBytesSwapped(DataOutput var1, float[] var2, int var3) {
      var1.writeShort((int)var2[var3]);
   }

   private void WriteBytes(DataOutput var1, float[] var2, int var3) {
      var1.write((int)var2[var3] & 0xFF);
      var1.write(((int)var2[var3] & 65535) >> 8 & 0xFF);
   }
}
