package net.sourceforge.lame.mpg;

public class Common {
   public static final int[][][] tabsel_123 = new int[][][]{
      {
            {0, 32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448},
            {0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384},
            {0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320}
      },
      {
            {0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256},
            {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160},
            {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}
      }
   };
   public static final int[] freqs = new int[]{44100, 48000, 32000, 22050, 24000, 16000, 11025, 12000, 8000};
   private static final int MAX_INPUT_FRAMESIZE = 4096;
   private static final String[] modes = new String[]{"Stereo", "Joint-Stereo", "Dual-Channel", "Single-Channel"};
   private static final String[] layers = new String[]{"Unknown", "I", "II", "III"};
   public float[][] muls = new float[27][64];

   public final boolean head_check(long var1, int var3) {
      int var4 = (int)(4L - (var1 >> 17 & 3L));
      if ((var1 & 4292870144L) != 4292870144L) {
         return false;
      } else if (var4 == 4) {
         return false;
      } else if (var3 > 0 && var4 != var3) {
         return false;
      } else if ((var1 >> 12 & 15L) == 15L) {
         return false;
      } else {
         return (var1 >> 10 & 3L) == 3L ? false : (var1 & 3L) != 2L;
      }
   }

   public final int decode_header(Frame var1, long var2) {
      if ((var2 & 1048576L) != 0L) {
         var1.lsf = (var2 & 524288L) != 0L ? 0 : 1;
         var1.mpeg25 = false;
      } else {
         var1.lsf = 1;
         var1.mpeg25 = true;
      }

      var1.lay = (int)(4L - (var2 >> 17 & 3L));
      if ((var2 >> 10 & 3L) == 3L) {
         throw new RuntimeException("Stream error");
      }

      if (var1.mpeg25) {
         var1.sampling_frequency = (int)(6L + (var2 >> 10 & 3L));
      } else {
         var1.sampling_frequency = (int)((var2 >> 10 & 3L) + var1.lsf * 3);
      }

      var1.error_protection = (var2 >> 16 & 1L) == 0L;
      if (var1.mpeg25) {
         var1.bitrate_index = (int)(var2 >> 12 & 15L);
      }

      var1.bitrate_index = (int)(var2 >> 12 & 15L);
      var1.padding = (int)(var2 >> 9 & 1L);
      var1.extension = (int)(var2 >> 8 & 1L);
      var1.mode = (int)(var2 >> 6 & 3L);
      var1.mode_ext = (int)(var2 >> 4 & 3L);
      var1.copyright = (int)(var2 >> 3 & 1L);
      var1.original = (int)(var2 >> 2 & 1L);
      var1.emphasis = (int)(var2 & 3L);
      var1.stereo = var1.mode == 3 ? 1 : 2;
      switch (var1.lay) {
         case 1:
            var1.framesize = tabsel_123[var1.lsf][0][var1.bitrate_index] * 12000;
            var1.framesize = var1.framesize / freqs[var1.sampling_frequency];
            var1.framesize = (var1.framesize + var1.padding << 2) - 4;
            var1.down_sample = 0;
            var1.down_sample_sblimit = 32 >> var1.down_sample;
            break;
         case 2:
            var1.framesize = tabsel_123[var1.lsf][1][var1.bitrate_index] * 144000;
            var1.framesize = var1.framesize / freqs[var1.sampling_frequency];
            var1.framesize = var1.framesize + (var1.padding - 4);
            var1.down_sample = 0;
            var1.down_sample_sblimit = 32 >> var1.down_sample;
            break;
         case 3:
            if (var1.framesize > 4096) {
               System.err.printf("Frame size too big.\n");
               var1.framesize = 4096;
               return 0;
            }

            if (var1.bitrate_index == 0) {
               var1.framesize = 0;
            } else {
               var1.framesize = tabsel_123[var1.lsf][2][var1.bitrate_index] * 144000;
               var1.framesize = var1.framesize / (freqs[var1.sampling_frequency] << var1.lsf);
               var1.framesize = var1.framesize + var1.padding - 4;
            }
            break;
         default:
            System.err.printf("Sorry, layer %d not supported\n", var1.lay);
            return 0;
      }

      return 1;
   }

   public final void print_header(Frame var1) {
      System.err
         .printf(
            "MPEG %s, Layer: %s, Freq: %d, mode: %s, modext: %d, BPF : %d\n",
            var1.mpeg25 ? "2.5" : (var1.lsf != 0 ? "2.0" : "1.0"),
            layers[var1.lay],
            freqs[var1.sampling_frequency],
            modes[var1.mode],
            var1.mode_ext,
            var1.framesize + 4
         );
      System.err
         .printf(
            "Channels: %d, copyright: %s, original: %s, CRC: %s, emphasis: %d.\n",
            var1.stereo,
            var1.copyright != 0 ? "Yes" : "No",
            var1.original != 0 ? "Yes" : "No",
            var1.error_protection ? "Yes" : "No",
            var1.emphasis
         );
      System.err.printf("Bitrate: %d Kbits/s, Extension value: %d\n", tabsel_123[var1.lsf][var1.lay - 1][var1.bitrate_index], var1.extension);
   }

   public final void print_header_compact(Frame var1) {
      System.err
         .printf(
            "MPEG %s layer %s, %d kbit/s, %d Hz %s\n",
            var1.mpeg25 ? "2.5" : (var1.lsf != 0 ? "2.0" : "1.0"),
            layers[var1.lay],
            tabsel_123[var1.lsf][var1.lay - 1][var1.bitrate_index],
            freqs[var1.sampling_frequency],
            modes[var1.mode]
         );
   }

   public final int getbits(MPGLib.mpstr_tag var1, int var2) {
      if (var2 > 0 && null != var1.wordpointer) {
         long var3 = var1.wordpointer[var1.wordpointerPos + 0] & 0xFF;
         var3 <<= 8;
         var3 |= var1.wordpointer[var1.wordpointerPos + 1] & 0xFF;
         var3 <<= 8;
         var3 |= var1.wordpointer[var1.wordpointerPos + 2] & 0xFF;
         var3 <<= var1.bitindex;
         var3 &= 16777215L;
         var1.bitindex += var2;
         var3 >>= 24 - var2;
         var1.wordpointerPos = var1.wordpointerPos + (var1.bitindex >> 3);
         var1.bitindex &= 7;
         return (int)var3;
      } else {
         return 0;
      }
   }

   public final int getbits_fast(MPGLib.mpstr_tag var1, int var2) {
      long var3 = var1.wordpointer[var1.wordpointerPos + 0] & 0xFF;
      var3 <<= 8;
      var3 |= var1.wordpointer[var1.wordpointerPos + 1] & 0xFF;
      var3 <<= var1.bitindex;
      var3 &= 65535L;
      var1.bitindex += var2;
      var3 >>= 16 - var2;
      var1.wordpointerPos = var1.wordpointerPos + (var1.bitindex >> 3);
      var1.bitindex &= 7;
      return (int)var3;
   }

   public final int set_pointer(MPGLib.mpstr_tag var1, int var2) {
      if (var1.fsizeold < 0 && var2 > 0) {
         System.err.printf("hip: Can't step back %d bytes!\n", var2);
         return -1;
      }

      byte[] var3 = var1.bsspace[1 - var1.bsnum];
      short var4 = 512;
      var1.wordpointerPos -= var2;
      if (var2 != 0) {
         System.arraycopy(var3, var4 + var1.fsizeold - var2, var1.wordpointer, var1.wordpointerPos, var2);
      }

      var1.bitindex = 0;
      return 0;
   }
}
