package net.sourceforge.lame.mp3;

import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.Arrays;

public class VBRTag {
   public static final int NUMTOCENTRIES = 100;
   private static final int VBRHEADERSIZE = 120;
   private static final int LAMEHEADERSIZE = 156;
   public static final int MAXFRAMESIZE = 2880;
   private static final int FRAMES_FLAG = 1;
   private static final int BYTES_FLAG = 2;
   private static final int TOC_FLAG = 4;
   private static final int VBR_SCALE_FLAG = 8;
   private static final int XING_BITRATE1 = 128;
   private static final int XING_BITRATE2 = 64;
   private static final int XING_BITRATE25 = 32;
   private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
   private static final String VBRTag0 = "Xing";
   private static final String VBRTag1 = "Info";
   private static int[] crc16Lookup = new int[]{
      0,
      49345,
      49537,
      320,
      49921,
      960,
      640,
      49729,
      50689,
      1728,
      1920,
      51009,
      1280,
      50625,
      50305,
      1088,
      52225,
      3264,
      3456,
      52545,
      3840,
      53185,
      52865,
      3648,
      2560,
      51905,
      52097,
      2880,
      51457,
      2496,
      2176,
      51265,
      55297,
      6336,
      6528,
      55617,
      6912,
      56257,
      55937,
      6720,
      7680,
      57025,
      57217,
      8000,
      56577,
      7616,
      7296,
      56385,
      5120,
      54465,
      54657,
      5440,
      55041,
      6080,
      5760,
      54849,
      53761,
      4800,
      4992,
      54081,
      4352,
      53697,
      53377,
      4160,
      61441,
      12480,
      12672,
      61761,
      13056,
      62401,
      62081,
      12864,
      13824,
      63169,
      63361,
      14144,
      62721,
      13760,
      13440,
      62529,
      15360,
      64705,
      64897,
      15680,
      65281,
      16320,
      16000,
      65089,
      64001,
      15040,
      15232,
      64321,
      14592,
      63937,
      63617,
      14400,
      10240,
      59585,
      59777,
      10560,
      60161,
      11200,
      10880,
      59969,
      60929,
      11968,
      12160,
      61249,
      11520,
      60865,
      60545,
      11328,
      58369,
      9408,
      9600,
      58689,
      9984,
      59329,
      59009,
      9792,
      8704,
      58049,
      58241,
      9024,
      57601,
      8640,
      8320,
      57409,
      40961,
      24768,
      24960,
      41281,
      25344,
      41921,
      41601,
      25152,
      26112,
      42689,
      42881,
      26432,
      42241,
      26048,
      25728,
      42049,
      27648,
      44225,
      44417,
      27968,
      44801,
      28608,
      28288,
      44609,
      43521,
      27328,
      27520,
      43841,
      26880,
      43457,
      43137,
      26688,
      30720,
      47297,
      47489,
      31040,
      47873,
      31680,
      31360,
      47681,
      48641,
      32448,
      32640,
      48961,
      32000,
      48577,
      48257,
      31808,
      46081,
      29888,
      30080,
      46401,
      30464,
      47041,
      46721,
      30272,
      29184,
      45761,
      45953,
      29504,
      45313,
      29120,
      28800,
      45121,
      20480,
      37057,
      37249,
      20800,
      37633,
      21440,
      21120,
      37441,
      38401,
      22208,
      22400,
      38721,
      21760,
      38337,
      38017,
      21568,
      39937,
      23744,
      23936,
      40257,
      24320,
      40897,
      40577,
      24128,
      23040,
      39617,
      39809,
      23360,
      39169,
      22976,
      22656,
      38977,
      34817,
      18624,
      18816,
      35137,
      19200,
      35777,
      35457,
      19008,
      19968,
      36545,
      36737,
      20288,
      36097,
      19904,
      19584,
      35905,
      17408,
      33985,
      34177,
      17728,
      34561,
      18368,
      18048,
      34369,
      33281,
      17088,
      17280,
      33601,
      16640,
      33217,
      32897,
      16448
   };
   Lame lame;
   BitStream bs;
   private Version version = new Version();

   public final void setModules(Lame var1, BitStream var2) {
      this.lame = var1;
      this.bs = var2;
   }

   private void addVbr(VBRSeekInfo var1, int var2) {
      var1.nVbrNumFrames++;
      var1.sum += var2;
      var1.seen++;
      if (var1.seen >= var1.want) {
         if (var1.pos < var1.size) {
            var1.bag[var1.pos] = var1.sum;
            var1.pos++;
            var1.seen = 0;
         }

         if (var1.pos == var1.size) {
            for (byte var3 = 1; var3 < var1.size; var3 += 2) {
               var1.bag[var3 / 2] = var1.bag[var3];
            }

            var1.want *= 2;
            var1.pos /= 2;
         }
      }
   }

   private void xingSeekTable(VBRSeekInfo var1, byte[] var2) {
      if (var1.pos > 0) {
         for (int var3 = 1; var3 < 100; var3++) {
            float var4 = var3 / 100.0F;
            int var7 = (int)Math.floor(var4 * var1.pos);
            if (var7 > var1.pos - 1) {
               var7 = var1.pos - 1;
            }

            float var5 = var1.bag[var7];
            float var6 = var1.sum;
            int var8 = (int)(256.0 * var5 / var6);
            if (var8 > 255) {
               var8 = 255;
            }

            var2[var3] = (byte)var8;
         }
      }
   }

   public final void addVbrFrame(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      int var3 = Tables.bitrate_table[var1.getMpegVersion()][var2.bitrate_index];
      assert var2.VBR_seek_table.bag != null;
      this.addVbr(var2.VBR_seek_table, var3);
   }

   private int extractInteger(byte[] var1, int var2) {
      int var3 = var1[var2 + 0] & 255;
      var3 <<= 8;
      var3 |= var1[var2 + 1] & 255;
      var3 <<= 8;
      var3 |= var1[var2 + 2] & 255;
      var3 <<= 8;
      return var3 | var1[var2 + 3] & 0xFF;
   }

   private void createInteger(byte[] var1, int var2, int var3) {
      var1[var2 + 0] = (byte)(var3 >> 24 & 0xFF);
      var1[var2 + 1] = (byte)(var3 >> 16 & 0xFF);
      var1[var2 + 2] = (byte)(var3 >> 8 & 0xFF);
      var1[var2 + 3] = (byte)(var3 & 0xFF);
   }

   private void createShort(byte[] var1, int var2, int var3) {
      var1[var2 + 0] = (byte)(var3 >> 8 & 0xFF);
      var1[var2 + 1] = (byte)(var3 & 0xFF);
   }

   private boolean isVbrTag(byte[] var1, int var2) {
      return new String(var1, var2, "Xing".length(), ISO_8859_1).equals("Xing") || new String(var1, var2, "Info".length(), ISO_8859_1).equals("Info");
   }

   private byte shiftInBitsValue(byte var1, int var2, int var3) {
      return (byte)(var1 << var2 | var3 & ~(-1 << var2));
   }

   private void setLameTagFrameHeader(LameGlobalFlags var1, byte[] var2) {
      LameInternalFlags var3 = var1.internal_flags;
      var2[0] = this.shiftInBitsValue(var2[0], 8, 255);
      var2[1] = this.shiftInBitsValue(var2[1], 3, 7);
      var2[1] = this.shiftInBitsValue(var2[1], 1, var1.getOutSampleRate() < 16000 ? 0 : 1);
      var2[1] = this.shiftInBitsValue(var2[1], 1, var1.getMpegVersion());
      var2[1] = this.shiftInBitsValue(var2[1], 2, 1);
      var2[1] = this.shiftInBitsValue(var2[1], 1, !var1.error_protection ? 1 : 0);
      var2[2] = this.shiftInBitsValue(var2[2], 4, var3.bitrate_index);
      var2[2] = this.shiftInBitsValue(var2[2], 2, var3.samplerate_index);
      var2[2] = this.shiftInBitsValue(var2[2], 1, 0);
      var2[2] = this.shiftInBitsValue(var2[2], 1, var1.extension);
      var2[3] = this.shiftInBitsValue(var2[3], 2, var1.getMode().getNumMode());
      var2[3] = this.shiftInBitsValue(var2[3], 2, var3.mode_ext);
      var2[3] = this.shiftInBitsValue(var2[3], 1, var1.copyright);
      var2[3] = this.shiftInBitsValue(var2[3], 1, var1.original);
      var2[3] = this.shiftInBitsValue(var2[3], 2, var1.emphasis);
      var2[0] = -1;
      byte var4 = (byte)(var2[1] & 241);
      int var5;
      if (1 == var1.getMpegVersion()) {
         var5 = 128;
      } else if (var1.getOutSampleRate() < 16000) {
         var5 = 32;
      } else {
         var5 = 64;
      }

      if (var1.getVBR() == VbrMode.vbr_off) {
         var5 = var1.getBitRate();
      }

      byte var6;
      if (var1.free_format) {
         var6 = 0;
      } else {
         var6 = (byte)(16 * this.lame.BitrateIndex(var5, var1.getMpegVersion(), var1.getOutSampleRate()));
      }

      if (var1.getMpegVersion() == 1) {
         var2[1] = (byte)(var4 | 10);
         var4 = (byte)(var2[2] & 13);
         var2[2] = (byte)(var6 | var4);
      } else {
         var2[1] = (byte)(var4 | 2);
         var4 = (byte)(var2[2] & 13);
         var2[2] = (byte)(var6 | var4);
      }
   }

   public final VBRTagData getVbrTag(byte[] var1) {
      VBRTagData var2 = new VBRTagData();
      int var3 = 0;
      var2.flags = 0;
      int var4 = var1[var3 + 1] >> 3 & 1;
      int var5 = var1[var3 + 2] >> 2 & 3;
      int var6 = var1[var3 + 3] >> 6 & 3;
      int var7 = var1[var3 + 2] >> 4 & 15;
      var7 = Tables.bitrate_table[var4][var7];
      if (var1[var3 + 1] >> 4 == 14) {
         var2.samprate = Tables.samplerate_table[2][var5];
      } else {
         var2.samprate = Tables.samplerate_table[var4][var5];
      }

      if (var4 != 0) {
         if (var6 != 3) {
            var3 += 36;
         } else {
            var3 += 21;
         }
      } else if (var6 != 3) {
         var3 += 21;
      } else {
         var3 += 13;
      }

      if (!this.isVbrTag(var1, var3)) {
         return null;
      }

      var3 += 4;
      var2.hId = var4;
      int var8 = var2.flags = this.extractInteger(var1, var3);
      var3 += 4;
      if ((var8 & 1) != 0) {
         var2.frames = this.extractInteger(var1, var3);
         var3 += 4;
      }

      if ((var8 & 2) != 0) {
         var2.bytes = this.extractInteger(var1, var3);
         var3 += 4;
      }

      if ((var8 & 4) != 0) {
         if (var2.toc != null) {
            for (int var9 = 0; var9 < 100; var9++) {
               var2.toc[var9] = var1[var3 + var9];
            }
         }

         var3 += 100;
      }

      var2.vbrScale = -1;
      if ((var8 & 8) != 0) {
         var2.vbrScale = this.extractInteger(var1, var3);
         var3 += 4;
      }

      var2.headersize = (var4 + 1) * 72000 * var7 / var2.samprate;
      var3 += 21;
      int var16 = var1[var3 + 0] << 4;
      var16 += var1[var3 + 1] >> 4;
      int var10 = (var1[var3 + 1] & 15) << 8;
      var10 += var1[var3 + 2] & 255;
      if (var16 < 0 || var16 > 3000) {
         var16 = -1;
      }

      if (var10 < 0 || var10 > 3000) {
         var10 = -1;
      }

      var2.encDelay = var16;
      var2.encPadding = var10;
      return var2;
   }

   public final void InitVbrTag(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      int var3;
      if (1 == var1.getMpegVersion()) {
         var3 = 128;
      } else if (var1.getOutSampleRate() < 16000) {
         var3 = 32;
      } else {
         var3 = 64;
      }

      if (var1.getVBR() == VbrMode.vbr_off) {
         var3 = var1.getBitRate();
      }

      int var4 = (var1.getMpegVersion() + 1) * 72000 * var3 / var1.getOutSampleRate();
      int var5 = var2.sideinfo_len + 156;
      var2.VBR_seek_table.TotalFrameSize = var4;
      if (var4 >= var5 && var4 <= 2880) {
         var2.VBR_seek_table.nVbrNumFrames = 0;
         var2.VBR_seek_table.nBytesWritten = 0;
         var2.VBR_seek_table.sum = 0;
         var2.VBR_seek_table.seen = 0;
         var2.VBR_seek_table.want = 1;
         var2.VBR_seek_table.pos = 0;
         if (var2.VBR_seek_table.bag == null) {
            var2.VBR_seek_table.bag = new int[400];
            var2.VBR_seek_table.size = 400;
         }

         byte[] var6 = new byte[2880];
         this.setLameTagFrameHeader(var1, var6);
         int var7 = var2.VBR_seek_table.TotalFrameSize;

         for (int var8 = 0; var8 < var7; var8++) {
            this.bs.add_dummy_byte(var1, var6[var8] & 255, 1);
         }
      } else {
         var1.bWriteVbrTag = false;
      }
   }

   private int crcUpdateLookup(int var1, int var2) {
      int var3 = var2 ^ var1;
      return var2 >> 8 ^ crc16Lookup[var3 & 0xFF];
   }

   public final void updateMusicCRC(int[] var1, byte[] var2, int var3, int var4) {
      for (int var5 = 0; var5 < var4; var5++) {
         var1[0] = this.crcUpdateLookup(var2[var3 + var5], var1[0]);
      }
   }

   private int putLameVBR(LameGlobalFlags var1, int var2, byte[] var3, int var4, int var5) {
      LameInternalFlags var6 = var1.internal_flags;
      int var7 = 0;
      int var8 = var1.getEncoderDelay();
      int var9 = var1.encoder_padding;
      int var10 = 100 - 10 * var1.getVBRQuality() - var1.getQuality();
      String var11 = this.version.getLameVeryShortVersion();
      byte var13 = 0;
      int[] var15 = new int[]{1, 5, 3, 2, 4, 0, 3};
      int var16 = (int)(var1.lowpassfreq / 100.0 + 0.5 > 255.0 ? 255.0 : var1.lowpassfreq / 100.0 + 0.5);
      int var17 = 0;
      int var18 = 0;
      byte var19 = 0;
      int var20 = var1.internal_flags.noise_shaping;
      byte var21 = 0;
      byte var22 = 0;
      byte var23 = 0;
      int var24 = 0;
      int var25 = 0;
      boolean var26 = (var1.exp_nspsytune & 1) != 0;
      boolean var27 = (var1.exp_nspsytune & 2) != 0;
      boolean var28 = false;
      boolean var29 = false;
      int var30 = var1.internal_flags.nogap_total;
      int var31 = var1.internal_flags.nogap_current;
      int var32 = var1.ATHtype;
      int var33 = 0;
      int var34;
      switch (var1.getVBR()) {
         case vbr_abr:
            var34 = var1.VBR_mean_bitrate_kbps;
            break;
         case vbr_off:
            var34 = var1.getBitRate();
            break;
         default:
            var34 = var1.VBR_min_bitrate_kbps;
      }

      int var12;
      if (var1.getVBR().ordinal() < var15.length) {
         var12 = var15[var1.getVBR().ordinal()];
      } else {
         var12 = 0;
      }

      int var14 = 16 * var13 + var12;
      if (var6.findReplayGain) {
         if (var6.RadioGain > 510) {
            var6.RadioGain = 510;
         }

         if (var6.RadioGain < -510) {
            var6.RadioGain = -510;
         }

         int var51 = 8192;
         var51 |= 3072;
         if (var6.RadioGain >= 0) {
            var18 = var51 | var6.RadioGain;
         } else {
            var51 |= 512;
            var18 = var51 | -var6.RadioGain;
         }
      }

      if (var6.findPeakSample) {
         var17 = Math.abs((int)(var6.PeakSample / 32767.0 * Math.pow(2.0, 23.0) + 0.5));
      }

      if (var30 != -1) {
         if (var31 > 0) {
            var29 = true;
         }

         if (var31 < var30 - 1) {
            var28 = true;
         }
      }

      var33 = var32 + ((var26 ? 1 : 0) << 4) + ((var27 ? 1 : 0) << 5) + ((var28 ? 1 : 0) << 6) + ((var29 ? 1 : 0) << 7);
      if (var10 < 0) {
         var10 = 0;
      }

      switch (var1.getMode()) {
         case MONO:
            var21 = 0;
            break;
         case STEREO:
            var21 = 1;
            break;
         case DUAL_CHANNEL:
            var21 = 2;
            break;
         case JOINT_STEREO:
            if (var1.force_ms) {
               var21 = 4;
            } else {
               var21 = 3;
            }
            break;
         case NOT_SET:
         default:
            var21 = 7;
      }

      if (var1.getInSampleRate() <= 32000) {
         var23 = 0;
      } else if (var1.getInSampleRate() == 48000) {
         var23 = 2;
      } else if (var1.getInSampleRate() > 48000) {
         var23 = 3;
      } else {
         var23 = 1;
      }

      if (var1.short_blocks == ShortBlock.short_block_forced
         || var1.short_blocks == ShortBlock.short_block_dispensed
         || var1.lowpassfreq == -1 && var1.highpassfreq == -1
         || var1.scale_left < var1.scale_right
         || var1.scale_left > var1.scale_right
         || var1.disable_reservoir && var1.getBitRate() < 320
         || var1.noATH
         || var1.ATHonly
         || var32 == 0
         || var1.getInSampleRate() <= 32000) {
         var22 = 1;
      }

      var24 = var20 + (var21 << 2) + (var22 << 5) + (var23 << 6);
      var25 = var6.nMusicCRC;
      this.createInteger(var3, var4 + var7, var10);
      var7 += 4;

      for (int var35 = 0; var35 < 9; var35++) {
         var3[var4 + var7 + var35] = (byte)var11.charAt(var35);
      }

      var7 += 9;
      var3[var4 + var7] = (byte)var14;
      var3[var4 + ++var7] = (byte)var16;
      this.createInteger(var3, var4 + ++var7, var17);
      var7 += 4;
      this.createShort(var3, var4 + var7, var18);
      var7 += 2;
      this.createShort(var3, var4 + var7, var19);
      var7 += 2;
      var3[var4 + var7] = (byte)var33;
      var7++;
      if (var34 >= 255) {
         var3[var4 + var7] = -1;
      } else {
         var3[var4 + var7] = (byte)var34;
      }

      var3[var4 + ++var7] = (byte)(var8 >> 4);
      var3[var4 + var7 + 1] = (byte)((var8 << 4) + (var9 >> 8));
      var3[var4 + var7 + 2] = (byte)var9;
      var7 += 3;
      var3[var4 + var7] = (byte)var24;
      int var10002 = ++var7;
      var7++;
      var3[var4 + var10002] = 0;
      this.createShort(var3, var4 + var7, var1.preset);
      var7 += 2;
      this.createInteger(var3, var4 + var7, var2);
      var7 += 4;
      this.createShort(var3, var4 + var7, var25);
      var7 += 2;

      for (int var59 = 0; var59 < var7; var59++) {
         var5 = this.crcUpdateLookup(var3[var4 + var59], var5);
      }

      this.createShort(var3, var4 + var7, var5);
      return var7 + 2;
   }

   private int skipId3v2(RandomAccessFile var1) {
      var1.seek(0L);
      byte[] var2 = new byte[10];
      var1.readFully(var2);
      int var3;
      if (!new String(var2, "ISO-8859-1").startsWith("ID3")) {
         var3 = ((var2[6] & 127) << 21 | (var2[7] & 127) << 14 | (var2[8] & 127) << 7 | var2[9] & 127) + var2.length;
      } else {
         var3 = 0;
      }

      return var3;
   }

   public final int getLameTagFrame(LameGlobalFlags var1, byte[] var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (!var1.bWriteVbrTag) {
         return 0;
      }

      if (var3.Class_ID != -487877L) {
         return 0;
      }

      if (var3.VBR_seek_table.pos <= 0) {
         return 0;
      }

      if (var2.length < var3.VBR_seek_table.TotalFrameSize) {
         return var3.VBR_seek_table.TotalFrameSize;
      }

      Arrays.fill(var2, 0, var3.VBR_seek_table.TotalFrameSize, (byte)0);
      this.setLameTagFrameHeader(var1, var2);
      byte[] var4 = new byte[100];
      if (var1.free_format) {
         for (int var5 = 1; var5 < 100; var5++) {
            var4[var5] = (byte)(255 * var5 / 100);
         }
      } else {
         this.xingSeekTable(var3.VBR_seek_table, var4);
      }

      int var9 = var3.sideinfo_len;
      if (var1.error_protection) {
         var9 -= 2;
      }

      if (var1.getVBR() == VbrMode.vbr_off) {
         var2[var9++] = (byte)"Info".charAt(0);
         var2[var9++] = (byte)"Info".charAt(1);
         var2[var9++] = (byte)"Info".charAt(2);
         var2[var9++] = (byte)"Info".charAt(3);
      } else {
         var2[var9++] = (byte)"Xing".charAt(0);
         var2[var9++] = (byte)"Xing".charAt(1);
         var2[var9++] = (byte)"Xing".charAt(2);
         var2[var9++] = (byte)"Xing".charAt(3);
      }

      this.createInteger(var2, var9, 15);
      var9 += 4;
      this.createInteger(var2, var9, var3.VBR_seek_table.nVbrNumFrames);
      var9 += 4;
      int var6 = var3.VBR_seek_table.nBytesWritten + var3.VBR_seek_table.TotalFrameSize;
      this.createInteger(var2, var9, var6);
      var9 += 4;
      System.arraycopy(var4, 0, var2, var9, var4.length);
      var9 += var4.length;
      if (var1.error_protection) {
         this.bs.CRC_writeheader(var3, var2);
      }

      int var7 = 0;

      for (int var8 = 0; var8 < var9; var8++) {
         var7 = this.crcUpdateLookup(var2[var8], var7);
      }

      var9 += this.putLameVBR(var1, var6, var2, var9, var7);
      return var3.VBR_seek_table.TotalFrameSize;
   }

   public final int putVbrTag(LameGlobalFlags var1, RandomAccessFile var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var3.VBR_seek_table.pos <= 0) {
         return -1;
      }

      var2.seek(var2.length());
      if (var2.length() == 0L) {
         return -1;
      }

      int var4 = this.skipId3v2(var2);
      var2.seek(var4);
      byte[] var5 = new byte[2880];
      int var6 = this.getLameTagFrame(var1, var5);
      if (var6 > var5.length) {
         return -1;
      }

      if (var6 < 1) {
         return 0;
      }

      var2.write(var5, 0, var6);
      return 0;
   }
}
