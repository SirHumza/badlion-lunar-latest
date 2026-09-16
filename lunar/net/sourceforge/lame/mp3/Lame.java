package net.sourceforge.lame.mp3;

import net.sourceforge.lame.mpg.Interface;
import net.sourceforge.lame.mpg.MPGLib;

public class Lame {
   public static final int QUALITY_LOWEST = 9;
   public static final int QUALITY_LOW = 7;
   public static final int QUALITY_MIDDLE_LOW = 6;
   public static final int QUALITY_MIDDLE = 5;
   public static final int QUALITY_HIGH = 2;
   public static final int QUALITY_HIGHEST = 1;
   public static final long LAME_ID = -487877L;
   public static final int V9 = 410;
   public static final int V8 = 420;
   public static final int V7 = 430;
   public static final int V6 = 440;
   public static final int V5 = 450;
   public static final int V4 = 460;
   public static final int V3 = 470;
   public static final int V2 = 480;
   public static final int V1 = 490;
   public static final int V0 = 500;
   public static final int R3MIX = 1000;
   public static final int STANDARD = 1001;
   public static final int EXTREME = 1002;
   public static final int INSANE = 1003;
   public static final int STANDARD_FAST = 1004;
   public static final int EXTREME_FAST = 1005;
   public static final int MEDIUM = 1006;
   public static final int MEDIUM_FAST = 1007;
   static final int LAME_MAXALBUMART = 131072;
   public static final int LAME_MAXMP3BUFFER = 147456;
   private static final int QUALITY_DEFAULT = 3;
   private LameGlobalFlags gfp;
   private GainAnalysis ga;
   private BitStream bs;
   private Presets p;
   private QuantizePVT qupvt;
   private Quantize qu;
   private PsyModel psy;
   private VBRTag vbr;
   private ID3Tag id3;
   private MPGLib mpglib;
   private Encoder enc;
   private GetAudio gaud;
   private Reservoir rv;
   private Takehiro tak;
   private Parse parse;
   private BRHist hist;
   private MPGLib mpg;
   private Interface intf;
   private Version version = new Version();

   public Lame() {
      this.gfp = new LameGlobalFlags();
      this.gaud = new GetAudio();
      this.ga = new GainAnalysis();
      this.bs = new BitStream();
      this.p = new Presets();
      this.qupvt = new QuantizePVT();
      this.qu = new Quantize();
      this.vbr = new VBRTag();
      this.id3 = new ID3Tag();
      this.rv = new Reservoir();
      this.tak = new Takehiro();
      this.parse = new Parse();
      this.hist = new BRHist();
      this.psy = new PsyModel();
      this.enc = new Encoder();
      this.mpg = new MPGLib();
      this.intf = new Interface();
      this.enc.setModules(this.bs, this.psy, this.qupvt, this.vbr);
      this.bs.setModules(this.ga, this.mpg, this.vbr);
      this.id3.setModules(this.bs);
      this.p.setModules(this);
      this.qu.setModules(this.bs, this.rv, this.qupvt, this.tak);
      this.qupvt.setModules(this.tak, this.rv, this.enc.psy);
      this.rv.setModules(this.bs);
      this.tak.setModules(this.qupvt);
      this.vbr.setModules(this, this.bs);
      this.gaud.setModules(this.parse, this.mpg);
      this.parse.setModules(this.id3, this.p);
      this.mpg.setModules(this.intf);
      this.intf.setModules(this.vbr);
      this.lame_init();
   }

   public LameGlobalFlags getFlags() {
      return this.gfp;
   }

   public Parse getParser() {
      return this.parse;
   }

   public GetAudio getAudio() {
      return this.gaud;
   }

   public VBRTag getVbr() {
      return this.vbr;
   }

   public ID3Tag getId3() {
      return this.id3;
   }

   public BRHist getHist() {
      return this.hist;
   }

   private float filter_coef(float var1) {
      if (var1 > 1.0) {
         return 0.0F;
      } else {
         return var1 <= 0.0 ? 1.0F : (float)Math.cos((Math.PI / 2) * var1);
      }
   }

   private void lame_init_params_ppflt() {
      LameInternalFlags var1 = this.gfp.internal_flags;
      int var2 = 32;
      int var3 = -1;
      if (var1.lowpass1 > 0.0F) {
         int var4 = 999;

         for (int var5 = 0; var5 <= 31; var5++) {
            float var6 = (float)(var5 / 31.0);
            if (var6 >= var1.lowpass2) {
               var2 = Math.min(var2, var5);
            }

            if (var1.lowpass1 < var6 && var6 < var1.lowpass2) {
               var4 = Math.min(var4, var5);
            }
         }

         if (var4 == 999) {
            var1.lowpass1 = (var2 - 0.75F) / 31.0F;
         } else {
            var1.lowpass1 = (var4 - 0.75F) / 31.0F;
         }

         var1.lowpass2 = var2 / 31.0F;
      }

      if (var1.highpass2 > 0.0F && var1.highpass2 < 0.021774193548387097) {
         var1.highpass1 = 0.0F;
         var1.highpass2 = 0.0F;
         System.err.println("Warning: highpass filter disabled.  highpass frequency too small\n");
      }

      if (var1.highpass2 > 0.0F) {
         int var10 = -1;

         for (int var12 = 0; var12 <= 31; var12++) {
            float var14 = var12 / 31.0F;
            if (var14 <= var1.highpass1) {
               var3 = Math.max(var3, var12);
            }

            if (var1.highpass1 < var14 && var14 < var1.highpass2) {
               var10 = Math.max(var10, var12);
            }
         }

         var1.highpass1 = var3 / 31.0F;
         if (var10 == -1) {
            var1.highpass2 = (var3 + 0.75F) / 31.0F;
         } else {
            var1.highpass2 = (var10 + 0.75F) / 31.0F;
         }
      }

      for (int var11 = 0; var11 < 32; var11++) {
         float var9 = var11 / 31.0F;
         double var13;
         if (var1.highpass2 > var1.highpass1) {
            var13 = this.filter_coef((var1.highpass2 - var9) / (var1.highpass2 - var1.highpass1 + 1.0E-20F));
         } else {
            var13 = 1.0;
         }

         double var7;
         if (var1.lowpass2 > var1.lowpass1) {
            var7 = this.filter_coef((var9 - var1.lowpass1) / (var1.lowpass2 - var1.lowpass1 + 1.0E-20F));
         } else {
            var7 = 1.0;
         }

         var1.amp_filter[var11] = (float)(var13 * var7);
      }
   }

   private void optimum_bandwidth(Lame.LowPassHighPass var1, int var2) {
      Lame.BandPass[] var3 = new Lame.BandPass[]{
         new Lame.BandPass(8, 2000),
         new Lame.BandPass(16, 3700),
         new Lame.BandPass(24, 3900),
         new Lame.BandPass(32, 5500),
         new Lame.BandPass(40, 7000),
         new Lame.BandPass(48, 7500),
         new Lame.BandPass(56, 10000),
         new Lame.BandPass(64, 11000),
         new Lame.BandPass(80, 13500),
         new Lame.BandPass(96, 15100),
         new Lame.BandPass(112, 15600),
         new Lame.BandPass(128, 17000),
         new Lame.BandPass(160, 17500),
         new Lame.BandPass(192, 18600),
         new Lame.BandPass(224, 19400),
         new Lame.BandPass(256, 19700),
         new Lame.BandPass(320, 20500)
      };
      int var4 = this.nearestBitrateFullIndex(var2);
      var1.lowerlimit = var3[var4].lowpass;
   }

   private int optimum_samplefreq(int var1, int var2) {
      char var3 = '걄';
      if (var2 >= 48000) {
         var3 = '뮀';
      } else if (var2 >= 44100) {
         var3 = '걄';
      } else if (var2 >= 32000) {
         var3 = 32000;
      } else if (var2 >= 24000) {
         var3 = 24000;
      } else if (var2 >= 22050) {
         var3 = 22050;
      } else if (var2 >= 16000) {
         var3 = 16000;
      } else if (var2 >= 12000) {
         var3 = 12000;
      } else if (var2 >= 11025) {
         var3 = 11025;
      } else if (var2 >= 8000) {
         var3 = 8000;
      }

      if (var1 == -1) {
         return var3;
      }

      if (var1 <= 15960) {
         var3 = '걄';
      }

      if (var1 <= 15250) {
         var3 = 32000;
      }

      if (var1 <= 11220) {
         var3 = 24000;
      }

      if (var1 <= 9970) {
         var3 = 22050;
      }

      if (var1 <= 7230) {
         var3 = 16000;
      }

      if (var1 <= 5420) {
         var3 = 12000;
      }

      if (var1 <= 4510) {
         var3 = 11025;
      }

      if (var1 <= 3970) {
         var3 = 8000;
      }

      if (var2 < var3) {
         if (var2 > 44100) {
            return 48000;
         } else if (var2 > 32000) {
            return 44100;
         } else if (var2 > 24000) {
            return 32000;
         } else if (var2 > 22050) {
            return 24000;
         } else if (var2 > 16000) {
            return 22050;
         } else if (var2 > 12000) {
            return 16000;
         } else if (var2 > 11025) {
            return 12000;
         } else {
            return var2 > 8000 ? 11025 : 8000;
         }
      } else {
         return var3;
      }
   }

   private void lame_init_qval() {
      LameInternalFlags var1 = this.gfp.internal_flags;
      switch (this.gfp.getQuality()) {
         case 0:
            var1.psymodel = 1;
            if (var1.noise_shaping == 0) {
               var1.noise_shaping = 1;
            }

            if (var1.substep_shaping == 0) {
               var1.substep_shaping = 2;
            }

            var1.noise_shaping_amp = 2;
            var1.noise_shaping_stop = 1;
            if (var1.subblock_gain == -1) {
               var1.subblock_gain = 1;
            }

            var1.use_best_huffman = 1;
            var1.full_outer_loop = 0;
            break;
         case 1:
            var1.psymodel = 1;
            if (var1.noise_shaping == 0) {
               var1.noise_shaping = 1;
            }

            if (var1.substep_shaping == 0) {
               var1.substep_shaping = 2;
            }

            var1.noise_shaping_amp = 2;
            var1.noise_shaping_stop = 1;
            if (var1.subblock_gain == -1) {
               var1.subblock_gain = 1;
            }

            var1.use_best_huffman = 1;
            var1.full_outer_loop = 0;
            break;
         case 2:
            var1.psymodel = 1;
            if (var1.noise_shaping == 0) {
               var1.noise_shaping = 1;
            }

            if (var1.substep_shaping == 0) {
               var1.substep_shaping = 2;
            }

            var1.noise_shaping_amp = 1;
            var1.noise_shaping_stop = 1;
            if (var1.subblock_gain == -1) {
               var1.subblock_gain = 1;
            }

            var1.use_best_huffman = 1;
            var1.full_outer_loop = 0;
            break;
         case 3:
            var1.psymodel = 1;
            if (var1.noise_shaping == 0) {
               var1.noise_shaping = 1;
            }

            var1.noise_shaping_amp = 1;
            var1.noise_shaping_stop = 1;
            if (var1.subblock_gain == -1) {
               var1.subblock_gain = 1;
            }

            var1.use_best_huffman = 1;
            var1.full_outer_loop = 0;
            break;
         case 4:
            var1.psymodel = 1;
            if (var1.noise_shaping == 0) {
               var1.noise_shaping = 1;
            }

            var1.noise_shaping_amp = 0;
            var1.noise_shaping_stop = 0;
            if (var1.subblock_gain == -1) {
               var1.subblock_gain = 1;
            }

            var1.use_best_huffman = 1;
            var1.full_outer_loop = 0;
            break;
         case 5:
            var1.psymodel = 1;
            if (var1.noise_shaping == 0) {
               var1.noise_shaping = 1;
            }

            var1.noise_shaping_amp = 0;
            var1.noise_shaping_stop = 0;
            if (var1.subblock_gain == -1) {
               var1.subblock_gain = 1;
            }

            var1.use_best_huffman = 0;
            var1.full_outer_loop = 0;
            break;
         case 6:
            var1.psymodel = 1;
            if (var1.noise_shaping == 0) {
               var1.noise_shaping = 1;
            }

            var1.noise_shaping_amp = 0;
            var1.noise_shaping_stop = 0;
            if (var1.subblock_gain == -1) {
               var1.subblock_gain = 1;
            }

            var1.use_best_huffman = 0;
            var1.full_outer_loop = 0;
            break;
         case 8:
            this.gfp.setQuality(7);
         case 7:
            var1.psymodel = 1;
            var1.noise_shaping = 0;
            var1.noise_shaping_amp = 0;
            var1.noise_shaping_stop = 0;
            var1.use_best_huffman = 0;
            var1.full_outer_loop = 0;
            break;
         case 9:
         default:
            var1.psymodel = 0;
            var1.noise_shaping = 0;
            var1.noise_shaping_amp = 0;
            var1.noise_shaping_stop = 0;
            var1.use_best_huffman = 0;
            var1.full_outer_loop = 0;
      }
   }

   private double linear_int(double var1, double var3, double var5) {
      return var1 + var5 * (var3 - var1);
   }

   private int FindNearestBitrate(int var1, int var2, int var3) {
      if (var3 < 16000) {
         var2 = 2;
      }

      int var4 = Tables.bitrate_table[var2][1];

      for (int var5 = 2; var5 <= 14; var5++) {
         if (Tables.bitrate_table[var2][var5] > 0 && Math.abs(Tables.bitrate_table[var2][var5] - var1) < Math.abs(var4 - var1)) {
            var4 = Tables.bitrate_table[var2][var5];
         }
      }

      return var4;
   }

   public final int nearestBitrateFullIndex(int var1) {
      int[] var2 = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      var6 = var2[16];
      var5 = 16;
      var4 = var2[16];
      var3 = 16;

      for (int var7 = 0; var7 < 16; var7++) {
         if (Math.max(var1, var2[var7 + 1]) != var1) {
            var6 = var2[var7 + 1];
            var5 = var7 + 1;
            var4 = var2[var7];
            var3 = var7;
            break;
         }
      }

      return var6 - var1 > var1 - var4 ? var3 : var5;
   }

   private int map2MP3Frequency(int var1) {
      if (var1 <= 8000) {
         return 8000;
      } else if (var1 <= 11025) {
         return 11025;
      } else if (var1 <= 12000) {
         return 12000;
      } else if (var1 <= 16000) {
         return 16000;
      } else if (var1 <= 22050) {
         return 22050;
      } else if (var1 <= 24000) {
         return 24000;
      } else if (var1 <= 32000) {
         return 32000;
      } else {
         return var1 <= 44100 ? 44100 : 48000;
      }
   }

   private int SmpFrqIndex(int var1) {
      switch (var1) {
         case 8000:
            this.gfp.setMpegVersion(0);
            return 2;
         case 11025:
            this.gfp.setMpegVersion(0);
            return 0;
         case 12000:
            this.gfp.setMpegVersion(0);
            return 1;
         case 16000:
            this.gfp.setMpegVersion(0);
            return 2;
         case 22050:
            this.gfp.setMpegVersion(0);
            return 0;
         case 24000:
            this.gfp.setMpegVersion(0);
            return 1;
         case 32000:
            this.gfp.setMpegVersion(1);
            return 2;
         case 44100:
            this.gfp.setMpegVersion(1);
            return 0;
         case 48000:
            this.gfp.setMpegVersion(1);
            return 1;
         default:
            this.gfp.setMpegVersion(0);
            return -1;
      }
   }

   public final int BitrateIndex(int var1, int var2, int var3) {
      if (var3 < 16000) {
         var2 = 2;
      }

      for (int var4 = 0; var4 <= 14; var4++) {
         if (Tables.bitrate_table[var2][var4] > 0 && Tables.bitrate_table[var2][var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   private float blackman(float var1, float var2, int var3) {
      float var4 = (float)(Math.PI * var2);
      var1 /= var3;
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      float var5 = var1 - 0.5F;
      float var6 = 0.42F - 0.5F * (float)Math.cos(2.0F * var1 * Math.PI) + 0.08F * (float)Math.cos(4.0F * var1 * Math.PI);
      return Math.abs(var5) < 1.0E-9 ? (float)(var4 / Math.PI) : (float)(var6 * Math.sin(var3 * var4 * var5) / (Math.PI * var3 * var5));
   }

   private int gcd(int var1, int var2) {
      return var2 != 0 ? this.gcd(var2, var1 % var2) : var1;
   }

   private int fill_buffer_resample(float[] var1, int var2, int var3, float[] var4, int var5, int var6, Lame.NumUsed var7, int var8) {
      LameInternalFlags var9 = this.gfp.internal_flags;
      int var11 = 0;
      int var13 = this.gfp.getOutSampleRate() / this.gcd(this.gfp.getOutSampleRate(), this.gfp.getInSampleRate());
      if (var13 > 320) {
         var13 = 320;
      }

      float var14 = Math.abs(var9.resample_ratio - Math.floor(0.5 + var9.resample_ratio)) < 1.0E-4 ? 1.0F : 0.0F;
      float var15 = 1.0F / (float)var9.resample_ratio;
      if (var15 > 1.0) {
         var15 = 1.0F;
      }

      int var16 = 31;
      if (0 == var16 % 2) {
         var16--;
      }

      var16 = (int)(var16 + var14);
      int var17 = var16 + 1;
      if (var9.fill_buffer_resample_init == 0) {
         var9.inbuf_old[0] = new float[var17];
         var9.inbuf_old[1] = new float[var17];

         for (int var10 = 0; var10 <= 2 * var13; var10++) {
            var9.blackfilt[var10] = new float[var17];
         }

         var9.itime[0] = 0.0;
         var9.itime[1] = 0.0;

         for (var11 = 0; var11 <= 2 * var13; var11++) {
            float var18 = 0.0F;
            float var19 = (var11 - var13) / (2.0F * var13);

            for (int var26 = 0; var26 <= var16; var26++) {
               var18 += var9.blackfilt[var11][var26] = this.blackman(var26 - var19, var15, var16);
            }

            for (int var27 = 0; var27 <= var16; var27++) {
               var9.blackfilt[var11][var27] = var9.blackfilt[var11][var27] / var18;
            }
         }

         var9.fill_buffer_resample_init = 1;
      }

      float[] var33 = var9.inbuf_old[var8];

      int var12;
      for (var12 = 0; var12 < var3; var12++) {
         double var34 = var12 * var9.resample_ratio;
         var11 = (int)Math.floor(var34 - var9.itime[var8]);
         if (var16 + var11 - var16 / 2 >= var6) {
            break;
         }

         float var22 = (float)(var34 - var9.itime[var8] - (var11 + 0.5 * (var16 % 2)));
         assert Math.abs(var22) <= 0.501;
         int var21 = (int)Math.floor(var22 * 2.0F * var13 + var13 + 0.5);
         float var23 = 0.0F;

         for (int var28 = 0; var28 <= var16; var28++) {
            int var24 = var28 + var11 - var16 / 2;
            assert var24 < var6;
            assert var24 + var17 >= 0;
            float var25 = var24 < 0 ? var33[var17 + var24] : var4[var5 + var24];
            var23 += var25 * var9.blackfilt[var21][var28];
         }

         var1[var2 + var12] = var23;
      }

      var7.num_used = Math.min(var6, var16 + var11 - var16 / 2);
      var9.itime[var8] = var9.itime[var8] + (var7.num_used - var12 * var9.resample_ratio);
      if (var7.num_used >= var17) {
         for (int var29 = 0; var29 < var17; var29++) {
            var33[var29] = var4[var5 + var7.num_used + var29 - var17];
         }
      } else {
         int var35 = var17 - var7.num_used;

         int var30;
         for (var30 = 0; var30 < var35; var30++) {
            var33[var30] = var33[var30 + var7.num_used];
         }

         for (var11 = 0; var30 < var17; var11++) {
            var33[var30] = var4[var5 + var11];
            var30++;
         }

         assert var11 == var7.num_used;
      }

      return var12;
   }

   private void fill_buffer(float[][] var1, float[][] var2, int var3, int var4, Lame.InOut var5) {
      LameInternalFlags var6 = this.gfp.internal_flags;
      if (!(var6.resample_ratio < 0.9999) && !(var6.resample_ratio > 1.0001)) {
         var5.n_out = Math.min(this.gfp.getFrameSize(), var4);
         var5.n_in = var5.n_out;

         for (int var9 = 0; var9 < var5.n_out; var9++) {
            var1[0][var6.mf_size + var9] = var2[0][var3 + var9];
            if (var6.channels_out == 2) {
               var1[1][var6.mf_size + var9] = var2[1][var3 + var9];
            }
         }
      } else {
         for (int var7 = 0; var7 < var6.channels_out; var7++) {
            Lame.NumUsed var8 = new Lame.NumUsed();
            var5.n_out = this.fill_buffer_resample(var1[var7], var6.mf_size, this.gfp.getFrameSize(), var2[var7], var3, var4, var8, var7);
            var5.n_in = var8.num_used;
         }
      }
   }

   public final int initParams() {
      LameInternalFlags var1 = this.gfp.internal_flags;
      var1.Class_ID = 0L;
      if (var1.ATH == null) {
         var1.ATH = new ATH();
      }

      if (var1.PSY == null) {
         var1.PSY = new PSY();
      }

      if (var1.rgdata == null) {
         var1.rgdata = new ReplayGain();
      }

      var1.channels_in = this.gfp.getInNumChannels();
      if (var1.channels_in == 1) {
         this.gfp.setMode(MPEGMode.MONO);
      }

      var1.channels_out = this.gfp.getMode() == MPEGMode.MONO ? 1 : 2;
      var1.mode_ext = 2;
      if (this.gfp.getMode() == MPEGMode.MONO) {
         this.gfp.force_ms = false;
      }

      if (this.gfp.getVBR() == VbrMode.vbr_off && this.gfp.VBR_mean_bitrate_kbps != 128 && this.gfp.getBitRate() == 0) {
         this.gfp.setBitRate(this.gfp.VBR_mean_bitrate_kbps);
      }

      if (this.gfp.getVBR() != VbrMode.vbr_off && this.gfp.getVBR() != VbrMode.vbr_mtrh && this.gfp.getVBR() != VbrMode.vbr_mt) {
         this.gfp.free_format = false;
      }

      if (this.gfp.getVBR() == VbrMode.vbr_off && this.gfp.getBitRate() == 0 && BitStream.EQ(this.gfp.compression_ratio, 0.0F)) {
         this.gfp.compression_ratio = 11.025F;
      }

      if (this.gfp.getVBR() == VbrMode.vbr_off && this.gfp.compression_ratio > 0.0F) {
         if (this.gfp.getOutSampleRate() == 0) {
            this.gfp.setOutSampleRate(this.map2MP3Frequency((int)(0.97 * this.gfp.getInSampleRate())));
         }

         this.gfp.setBitRate((int)(this.gfp.getOutSampleRate() * 16 * var1.channels_out / (1000.0F * this.gfp.compression_ratio)));
         var1.samplerate_index = this.SmpFrqIndex(this.gfp.getOutSampleRate());
         if (!this.gfp.free_format) {
            this.gfp.setBitRate(this.FindNearestBitrate(this.gfp.getBitRate(), this.gfp.getMpegVersion(), this.gfp.getOutSampleRate()));
         }
      }

      if (this.gfp.getOutSampleRate() != 0) {
         if (this.gfp.getOutSampleRate() < 16000) {
            this.gfp.VBR_mean_bitrate_kbps = Math.max(this.gfp.VBR_mean_bitrate_kbps, 8);
            this.gfp.VBR_mean_bitrate_kbps = Math.min(this.gfp.VBR_mean_bitrate_kbps, 64);
         } else if (this.gfp.getOutSampleRate() < 32000) {
            this.gfp.VBR_mean_bitrate_kbps = Math.max(this.gfp.VBR_mean_bitrate_kbps, 8);
            this.gfp.VBR_mean_bitrate_kbps = Math.min(this.gfp.VBR_mean_bitrate_kbps, 160);
         } else {
            this.gfp.VBR_mean_bitrate_kbps = Math.max(this.gfp.VBR_mean_bitrate_kbps, 32);
            this.gfp.VBR_mean_bitrate_kbps = Math.min(this.gfp.VBR_mean_bitrate_kbps, 320);
         }
      }

      if (this.gfp.lowpassfreq == 0) {
         double var2 = 16000.0;
         switch (this.gfp.getVBR()) {
            case vbr_off:
               Lame.LowPassHighPass var21 = new Lame.LowPassHighPass();
               this.optimum_bandwidth(var21, this.gfp.getBitRate());
               var2 = var21.lowerlimit;
               break;
            case vbr_abr:
               Lame.LowPassHighPass var20 = new Lame.LowPassHighPass();
               this.optimum_bandwidth(var20, this.gfp.VBR_mean_bitrate_kbps);
               var2 = var20.lowerlimit;
               break;
            case vbr_rh:
               int[] var19 = new int[]{19500, 19000, 18600, 18000, 17500, 16000, 15600, 14900, 12500, 10000, 3950};
               if (0 <= this.gfp.getVBRQuality() && this.gfp.getVBRQuality() <= 9) {
                  double var24 = var19[this.gfp.getVBRQuality()];
                  double var27 = var19[this.gfp.getVBRQuality() + 1];
                  double var28 = this.gfp.VBR_q_frac;
                  var2 = this.linear_int(var24, var27, var28);
                  break;
               }

               var2 = 19500.0;
               break;
            default:
               int[] var4 = new int[]{19500, 19000, 18500, 18000, 17500, 16500, 15500, 14500, 12500, 9500, 3950};
               if (0 <= this.gfp.getVBRQuality() && this.gfp.getVBRQuality() <= 9) {
                  double var5 = var4[this.gfp.getVBRQuality()];
                  double var7 = var4[this.gfp.getVBRQuality() + 1];
                  double var9 = this.gfp.VBR_q_frac;
                  var2 = this.linear_int(var5, var7, var9);
               } else {
                  var2 = 19500.0;
               }
         }

         if (this.gfp.getMode() == MPEGMode.MONO && (this.gfp.getVBR() == VbrMode.vbr_off || this.gfp.getVBR() == VbrMode.vbr_abr)) {
            var2 *= 1.5;
         }

         this.gfp.lowpassfreq = (int)var2;
      }

      if (this.gfp.getOutSampleRate() == 0) {
         if (2 * this.gfp.lowpassfreq > this.gfp.getInSampleRate()) {
            this.gfp.lowpassfreq = this.gfp.getInSampleRate() / 2;
         }

         this.gfp.setOutSampleRate(this.optimum_samplefreq(this.gfp.lowpassfreq, this.gfp.getInSampleRate()));
      }

      this.gfp.lowpassfreq = Math.min(20500, this.gfp.lowpassfreq);
      this.gfp.lowpassfreq = Math.min(this.gfp.getOutSampleRate() / 2, this.gfp.lowpassfreq);
      if (this.gfp.getVBR() == VbrMode.vbr_off) {
         this.gfp.compression_ratio = this.gfp.getOutSampleRate() * 16 * var1.channels_out / (1000.0F * this.gfp.getBitRate());
      }

      if (this.gfp.getVBR() == VbrMode.vbr_abr) {
         this.gfp.compression_ratio = this.gfp.getOutSampleRate() * 16 * var1.channels_out / (1000.0F * this.gfp.VBR_mean_bitrate_kbps);
      }

      if (!this.gfp.bWriteVbrTag) {
         this.gfp.setFindReplayGain(false);
         this.gfp.decode_on_the_fly = false;
         var1.findPeakSample = false;
      }

      var1.findReplayGain = this.gfp.isFindReplayGain();
      var1.decode_on_the_fly = this.gfp.decode_on_the_fly;
      if (var1.decode_on_the_fly) {
         var1.findPeakSample = true;
      }

      if (var1.findReplayGain && this.ga.InitGainAnalysis(var1.rgdata, this.gfp.getOutSampleRate()) == 0) {
         this.gfp.internal_flags = null;
         return -6;
      }

      if (var1.decode_on_the_fly && !this.gfp.decode_only) {
         if (var1.hip != null) {
            this.mpglib.hip_decode_exit(var1.hip);
         }

         var1.hip = this.mpglib.hip_decode_init();
      }

      var1.mode_gr = this.gfp.getOutSampleRate() <= 24000 ? 1 : 2;
      this.gfp.setFrameSize(576 * var1.mode_gr);
      this.gfp.setEncoderDelay(576);
      var1.resample_ratio = (double)this.gfp.getInSampleRate() / this.gfp.getOutSampleRate();
      switch (this.gfp.getVBR()) {
         case vbr_abr:
            this.gfp.compression_ratio = this.gfp.getOutSampleRate() * 16 * var1.channels_out / (1000.0F * this.gfp.VBR_mean_bitrate_kbps);
            break;
         case vbr_rh:
         case vbr_mt:
         case vbr_mtrh:
            float[] var12 = new float[]{5.7F, 6.5F, 7.3F, 8.2F, 10.0F, 11.9F, 13.0F, 14.0F, 15.0F, 16.5F};
            this.gfp.compression_ratio = var12[this.gfp.getVBRQuality()];
            break;
         default:
            this.gfp.compression_ratio = this.gfp.getOutSampleRate() * 16 * var1.channels_out / (1000.0F * this.gfp.getBitRate());
      }

      if (this.gfp.getMode() == MPEGMode.NOT_SET) {
         this.gfp.setMode(MPEGMode.JOINT_STEREO);
      }

      if (this.gfp.highpassfreq > 0) {
         var1.highpass1 = 2.0F * this.gfp.highpassfreq;
         if (this.gfp.highpasswidth >= 0) {
            var1.highpass2 = 2.0F * (this.gfp.highpassfreq + this.gfp.highpasswidth);
         } else {
            var1.highpass2 = 2.0F * this.gfp.highpassfreq;
         }

         var1.highpass1 = var1.highpass1 / this.gfp.getOutSampleRate();
         var1.highpass2 = var1.highpass2 / this.gfp.getOutSampleRate();
      } else {
         var1.highpass1 = 0.0F;
         var1.highpass2 = 0.0F;
      }

      if (this.gfp.lowpassfreq > 0) {
         var1.lowpass2 = 2.0F * this.gfp.lowpassfreq;
         if (this.gfp.lowpasswidth >= 0) {
            var1.lowpass1 = 2.0F * (this.gfp.lowpassfreq - this.gfp.lowpasswidth);
            if (var1.lowpass1 < 0.0F) {
               var1.lowpass1 = 0.0F;
            }
         } else {
            var1.lowpass1 = 2.0F * this.gfp.lowpassfreq;
         }

         var1.lowpass1 = var1.lowpass1 / this.gfp.getOutSampleRate();
         var1.lowpass2 = var1.lowpass2 / this.gfp.getOutSampleRate();
      } else {
         var1.lowpass1 = 0.0F;
         var1.lowpass2 = 0.0F;
      }

      this.lame_init_params_ppflt();
      var1.samplerate_index = this.SmpFrqIndex(this.gfp.getOutSampleRate());
      if (var1.samplerate_index < 0) {
         this.gfp.internal_flags = null;
         return -1;
      }

      if (this.gfp.getVBR() == VbrMode.vbr_off) {
         if (this.gfp.free_format) {
            var1.bitrate_index = 0;
         } else {
            this.gfp.setBitRate(this.FindNearestBitrate(this.gfp.getBitRate(), this.gfp.getMpegVersion(), this.gfp.getOutSampleRate()));
            var1.bitrate_index = this.BitrateIndex(this.gfp.getBitRate(), this.gfp.getMpegVersion(), this.gfp.getOutSampleRate());
            if (var1.bitrate_index <= 0) {
               this.gfp.internal_flags = null;
               return -1;
            }
         }
      } else {
         var1.bitrate_index = 1;
      }

      if (this.gfp.analysis) {
         this.gfp.bWriteVbrTag = false;
      }

      if (var1.pinfo != null) {
         this.gfp.bWriteVbrTag = false;
      }

      this.bs.init_bit_stream_w(var1);
      int var13 = var1.samplerate_index + 3 * this.gfp.getMpegVersion() + 6 * (this.gfp.getOutSampleRate() < 16000 ? 1 : 0);

      for (int var3 = 0; var3 < 23; var3++) {
         var1.scalefac_band.l[var3] = this.qupvt.sfBandIndex[var13].l[var3];
      }

      for (int var14 = 0; var14 < 7; var14++) {
         int var22 = (var1.scalefac_band.l[22] - var1.scalefac_band.l[21]) / 6;
         int var25 = var1.scalefac_band.l[21] + var14 * var22;
         var1.scalefac_band.psfb21[var14] = var25;
      }

      var1.scalefac_band.psfb21[6] = 576;

      for (int var15 = 0; var15 < 14; var15++) {
         var1.scalefac_band.s[var15] = this.qupvt.sfBandIndex[var13].s[var15];
      }

      for (int var16 = 0; var16 < 7; var16++) {
         int var23 = (var1.scalefac_band.s[13] - var1.scalefac_band.s[12]) / 6;
         int var26 = var1.scalefac_band.s[12] + var16 * var23;
         var1.scalefac_band.psfb12[var16] = var26;
      }

      var1.scalefac_band.psfb12[6] = 192;
      if (this.gfp.getMpegVersion() == 1) {
         var1.sideinfo_len = var1.channels_out == 1 ? 21 : 36;
      } else {
         var1.sideinfo_len = var1.channels_out == 1 ? 13 : 21;
      }

      if (this.gfp.error_protection) {
         var1.sideinfo_len += 2;
      }

      this.lame_init_bitstream();
      var1.Class_ID = -487877L;

      for (int var17 = 0; var17 < 19; var17++) {
         var1.nsPsy.pefirbuf[var17] = 700 * var1.mode_gr * var1.channels_out;
      }

      if (this.gfp.ATHtype == -1) {
         this.gfp.ATHtype = 4;
      }

      assert this.gfp.getVBRQuality() <= 9;
      assert this.gfp.getVBRQuality() >= 0;
      switch (this.gfp.getVBR()) {
         case vbr_rh:
            this.p.apply_preset(this.gfp, 500 - this.gfp.getVBRQuality() * 10, 0);
            var1.PSY.mask_adjust = this.gfp.maskingadjust;
            var1.PSY.mask_adjust_short = this.gfp.maskingadjust_short;
            if (this.gfp.experimentalY) {
               var1.sfb21_extra = false;
            } else {
               var1.sfb21_extra = this.gfp.getOutSampleRate() > 44000;
            }

            if (this.gfp.getQuality() > 6) {
               this.gfp.setQuality(6);
            }

            if (this.gfp.getQuality() < 0) {
               this.gfp.setQuality(3);
            }

            var1.iteration_loop = new VBROldIterationLoop(this.qu);
            break;
         case vbr_mt:
            this.gfp.setVBR(VbrMode.vbr_mtrh);
         case vbr_mtrh:
            if (this.gfp.useTemporal == null) {
               this.gfp.useTemporal = false;
            }

            this.p.apply_preset(this.gfp, 500 - this.gfp.getVBRQuality() * 10, 0);
            if (this.gfp.getQuality() < 0) {
               this.gfp.setQuality(3);
            }

            if (this.gfp.getQuality() < 5) {
               this.gfp.setQuality(0);
            }

            if (this.gfp.getQuality() > 5) {
               this.gfp.setQuality(5);
            }

            var1.PSY.mask_adjust = this.gfp.maskingadjust;
            var1.PSY.mask_adjust_short = this.gfp.maskingadjust_short;
            if (this.gfp.experimentalY) {
               var1.sfb21_extra = false;
            } else {
               var1.sfb21_extra = this.gfp.getOutSampleRate() > 44000;
            }

            var1.iteration_loop = new VBRNewIterationLoop(this.qu);
            break;
         default:
            var1.sfb21_extra = false;
            if (this.gfp.getQuality() < 0) {
               this.gfp.setQuality(3);
            }

            VbrMode var18 = this.gfp.getVBR();
            if (var18 == VbrMode.vbr_off) {
               this.gfp.VBR_mean_bitrate_kbps = this.gfp.getBitRate();
            }

            this.p.apply_preset(this.gfp, this.gfp.VBR_mean_bitrate_kbps, 0);
            this.gfp.setVBR(var18);
            var1.PSY.mask_adjust = this.gfp.maskingadjust;
            var1.PSY.mask_adjust_short = this.gfp.maskingadjust_short;
            if (var18 == VbrMode.vbr_off) {
               var1.iteration_loop = new CBRNewIterationLoop(this.qu);
            } else {
               var1.iteration_loop = new ABRIterationLoop(this.qu);
            }
      }

      if (this.gfp.getVBR() != VbrMode.vbr_off) {
         var1.VBR_min_bitrate = 1;
         var1.VBR_max_bitrate = 14;
         if (this.gfp.getOutSampleRate() < 16000) {
            var1.VBR_max_bitrate = 8;
         }

         if (this.gfp.VBR_min_bitrate_kbps != 0) {
            this.gfp.VBR_min_bitrate_kbps = this.FindNearestBitrate(this.gfp.VBR_min_bitrate_kbps, this.gfp.getMpegVersion(), this.gfp.getOutSampleRate());
            var1.VBR_min_bitrate = this.BitrateIndex(this.gfp.VBR_min_bitrate_kbps, this.gfp.getMpegVersion(), this.gfp.getOutSampleRate());
            if (var1.VBR_min_bitrate < 0) {
               return -1;
            }
         }

         if (this.gfp.VBR_max_bitrate_kbps != 0) {
            this.gfp.VBR_max_bitrate_kbps = this.FindNearestBitrate(this.gfp.VBR_max_bitrate_kbps, this.gfp.getMpegVersion(), this.gfp.getOutSampleRate());
            var1.VBR_max_bitrate = this.BitrateIndex(this.gfp.VBR_max_bitrate_kbps, this.gfp.getMpegVersion(), this.gfp.getOutSampleRate());
            if (var1.VBR_max_bitrate < 0) {
               return -1;
            }
         }

         this.gfp.VBR_min_bitrate_kbps = Tables.bitrate_table[this.gfp.getMpegVersion()][var1.VBR_min_bitrate];
         this.gfp.VBR_max_bitrate_kbps = Tables.bitrate_table[this.gfp.getMpegVersion()][var1.VBR_max_bitrate];
         this.gfp.VBR_mean_bitrate_kbps = Math.min(Tables.bitrate_table[this.gfp.getMpegVersion()][var1.VBR_max_bitrate], this.gfp.VBR_mean_bitrate_kbps);
         this.gfp.VBR_mean_bitrate_kbps = Math.max(Tables.bitrate_table[this.gfp.getMpegVersion()][var1.VBR_min_bitrate], this.gfp.VBR_mean_bitrate_kbps);
      }

      if (this.gfp.tune) {
         var1.PSY.mask_adjust = var1.PSY.mask_adjust + this.gfp.tune_value_a;
         var1.PSY.mask_adjust_short = var1.PSY.mask_adjust_short + this.gfp.tune_value_a;
      }

      this.lame_init_qval();
      if (this.gfp.athaa_type < 0) {
         var1.ATH.useAdjust = 3;
      } else {
         var1.ATH.useAdjust = this.gfp.athaa_type;
      }

      var1.ATH.aaSensitivityP = (float)Math.pow(10.0, this.gfp.athaa_sensitivity / -10.0);
      if (this.gfp.short_blocks == null) {
         this.gfp.short_blocks = ShortBlock.short_block_allowed;
      }

      if (this.gfp.short_blocks == ShortBlock.short_block_allowed && (this.gfp.getMode() == MPEGMode.JOINT_STEREO || this.gfp.getMode() == MPEGMode.STEREO)) {
         this.gfp.short_blocks = ShortBlock.short_block_coupled;
      }

      if (this.gfp.quant_comp < 0) {
         this.gfp.quant_comp = 1;
      }

      if (this.gfp.quant_comp_short < 0) {
         this.gfp.quant_comp_short = 0;
      }

      if (this.gfp.msfix < 0.0F) {
         this.gfp.msfix = 0.0F;
      }

      this.gfp.exp_nspsytune |= 1;
      if (this.gfp.internal_flags.nsPsy.attackthre < 0.0F) {
         this.gfp.internal_flags.nsPsy.attackthre = 4.4F;
      }

      if (this.gfp.internal_flags.nsPsy.attackthre_s < 0.0F) {
         this.gfp.internal_flags.nsPsy.attackthre_s = 25.0F;
      }

      if (this.gfp.scale < 0.0F) {
         this.gfp.scale = 1.0F;
      }

      if (this.gfp.ATHtype < 0) {
         this.gfp.ATHtype = 4;
      }

      if (this.gfp.ATHcurve < 0.0F) {
         this.gfp.ATHcurve = 4.0F;
      }

      if (this.gfp.athaa_loudapprox < 0) {
         this.gfp.athaa_loudapprox = 2;
      }

      if (this.gfp.interChRatio < 0.0F) {
         this.gfp.interChRatio = 0.0F;
      }

      if (this.gfp.useTemporal == null) {
         this.gfp.useTemporal = true;
      }

      var1.slot_lag = var1.frac_SpF = 0;
      if (this.gfp.getVBR() == VbrMode.vbr_off) {
         var1.slot_lag = var1.frac_SpF = (int)((this.gfp.getMpegVersion() + 1) * 72000L * this.gfp.getBitRate() % this.gfp.getOutSampleRate());
      }

      this.qupvt.iteration_init(this.gfp);
      this.psy.psymodel_init(this.gfp);
      return 0;
   }

   public final void lame_print_config() {
      LameInternalFlags var1 = this.gfp.internal_flags;
      double var2 = this.gfp.getOutSampleRate();
      double var4 = this.gfp.getOutSampleRate() * var1.resample_ratio;
      System.out.println(this.version.getVersion());
      if (this.gfp.getInNumChannels() == 2 && var1.channels_out == 1) {
         System.out.printf("Autoconverting from stereo to mono. Setting encoding to mono mode.\n");
      }

      if (BitStream.NEQ((float)var1.resample_ratio, 1.0F)) {
         System.out.printf("Resampling:  input %g kHz  output %g kHz\n", 0.001 * var4, 0.001 * var2);
      }

      if (var1.highpass2 > 0.0) {
         System.out.printf("Using polyphase highpass filter, transition band: %5.0f Hz - %5.0f Hz\n", 0.5 * var1.highpass1 * var2, 0.5 * var1.highpass2 * var2);
      }

      if (!(0.0 < var1.lowpass1) && !(0.0 < var1.lowpass2)) {
         System.out.printf("polyphase lowpass filter disabled\n");
      } else {
         System.out.printf("Using polyphase lowpass filter, transition band: %5.0f Hz - %5.0f Hz\n", 0.5 * var1.lowpass1 * var2, 0.5 * var1.lowpass2 * var2);
      }

      if (this.gfp.free_format) {
         System.err.printf("Warning: many decoders cannot handle free format bitstreams\n");
         if (this.gfp.getBitRate() > 320) {
            System.err.printf("Warning: many decoders cannot handle free format bitrates >320 kbps (see documentation)\n");
         }
      }
   }

   public final void lame_print_internals() {
      LameInternalFlags var1 = this.gfp.internal_flags;
      System.err.printf("\nmisc:\n\n");
      System.err.printf("\tscaling: %g\n", this.gfp.scale);
      System.err.printf("\tch0 (left) scaling: %g\n", this.gfp.scale_left);
      System.err.printf("\tch1 (right) scaling: %g\n", this.gfp.scale_right);
      String var2;
      switch (var1.use_best_huffman) {
         case 1:
            var2 = "best (outside loop)";
            break;
         case 2:
            var2 = "best (inside loop, slow)";
            break;
         default:
            var2 = "normal";
      }

      System.err.printf("\thuffman search: %s\n", var2);
      System.err.printf("\texperimental Y=%d\n", this.gfp.experimentalY);
      System.err.printf("\t...\n");
      System.err.printf("\nstream format:\n\n");
      switch (this.gfp.getMpegVersion()) {
         case 0:
            var2 = "2.5";
            break;
         case 1:
            var2 = "1";
            break;
         case 2:
            var2 = "2";
            break;
         default:
            var2 = "?";
      }

      System.err.printf("\tMPEG-%s Layer 3\n", var2);
      switch (this.gfp.getMode()) {
         case JOINT_STEREO:
            var2 = "joint stereo";
            break;
         case STEREO:
            var2 = "stereo";
            break;
         case DUAL_CHANNEL:
            var2 = "dual channel";
            break;
         case MONO:
            var2 = "mono";
            break;
         case NOT_SET:
            var2 = "not set (error)";
            break;
         default:
            var2 = "unknown (error)";
      }

      System.err.printf("\t%d channel - %s\n", var1.channels_out, var2);
      switch (this.gfp.getVBR()) {
         case vbr_off:
            var2 = "off";
            break;
         default:
            var2 = "all";
      }

      System.err.printf("\tpadding: %s\n", var2);
      if (VbrMode.vbr_default == this.gfp.getVBR()) {
         var2 = "(default)";
      } else if (this.gfp.free_format) {
         var2 = "(free format)";
      } else {
         var2 = "";
      }

      switch (this.gfp.getVBR()) {
         case vbr_off:
            System.err.printf("\tconstant bitrate - CBR %s\n", var2);
            break;
         case vbr_abr:
            System.err.printf("\tvariable bitrate - ABR %s\n", var2);
            break;
         case vbr_rh:
            System.err.printf("\tvariable bitrate - VBR rh %s\n", var2);
            break;
         case vbr_mt:
            System.err.printf("\tvariable bitrate - VBR mt %s\n", var2);
            break;
         case vbr_mtrh:
            System.err.printf("\tvariable bitrate - VBR mtrh %s\n", var2);
            break;
         default:
            System.err.printf("\t ?? oops, some new one ?? \n");
      }

      if (this.gfp.bWriteVbrTag) {
         System.err.printf("\tusing LAME Tag\n");
      }

      System.err.printf("\t...\n");
      System.err.printf("\npsychoacoustic:\n\n");
      switch (this.gfp.short_blocks) {
         case short_block_allowed:
            var2 = "allowed";
            break;
         case short_block_coupled:
            var2 = "channel coupled";
            break;
         case short_block_dispensed:
            var2 = "dispensed";
            break;
         case short_block_forced:
            var2 = "forced";
            break;
         default:
            var2 = "?";
      }

      System.err.printf("\tusing short blocks: %s\n", var2);
      System.err.printf("\tsubblock gain: %d\n", var1.subblock_gain);
      System.err.printf("\tadjust masking: %g dB\n", var1.PSY.mask_adjust);
      System.err.printf("\tadjust masking short: %g dB\n", var1.PSY.mask_adjust_short);
      System.err.printf("\tquantization comparison: %d\n", this.gfp.quant_comp);
      System.err.printf("\t ^ comparison short blocks: %d\n", this.gfp.quant_comp_short);
      System.err.printf("\tnoise shaping: %d\n", var1.noise_shaping);
      System.err.printf("\t ^ amplification: %d\n", var1.noise_shaping_amp);
      System.err.printf("\t ^ stopping: %d\n", var1.noise_shaping_stop);
      var2 = "using";
      if (this.gfp.ATHshort) {
         var2 = "the only masking for short blocks";
      }

      if (this.gfp.ATHonly) {
         var2 = "the only masking";
      }

      if (this.gfp.noATH) {
         var2 = "not used";
      }

      System.err.printf("\tATH: %s\n", var2);
      System.err.printf("\t ^ type: %d\n", this.gfp.ATHtype);
      System.err.printf("\t ^ shape: %g%s\n", this.gfp.ATHcurve, " (only for type 4)");
      System.err.printf("\t ^ level adjustement: %g\n", this.gfp.ATHlower);
      System.err.printf("\t ^ adjust type: %d\n", var1.ATH.useAdjust);
      System.err.printf("\t ^ adjust sensitivity power: %f\n", var1.ATH.aaSensitivityP);
      System.err.printf("\t ^ adapt threshold type: %d\n", this.gfp.athaa_loudapprox);
      System.err.printf("\texperimental psy tunings by Naoki Shibata\n");
      System.err
         .printf(
            "\t   adjust masking bass=%g dB, alto=%g dB, treble=%g dB, sfb21=%g dB\n",
            10.0 * Math.log10(var1.nsPsy.longfact[0]),
            10.0 * Math.log10(var1.nsPsy.longfact[7]),
            10.0 * Math.log10(var1.nsPsy.longfact[14]),
            10.0 * Math.log10(var1.nsPsy.longfact[21])
         );
      var2 = this.gfp.useTemporal ? "yes" : "no";
      System.err.printf("\tusing temporal masking effect: %s\n", var2);
      System.err.printf("\tinterchannel masking ratio: %g\n", this.gfp.interChRatio);
      System.err.printf("\t...\n");
      System.err.printf("\n");
   }

   private int lame_encode_frame(float[] var1, float[] var2, byte[] var3, int var4, int var5) {
      int var6 = this.enc.lame_encode_mp3_frame(this.gfp, var1, var2, var3, var4, var5);
      this.gfp.frameNum++;
      return var6;
   }

   private void update_inbuffer_size(LameInternalFlags var1, int var2) {
      if (var1.in_buffer_0 == null || var1.in_buffer_nsamples < var2) {
         var1.in_buffer_0 = new float[var2];
         var1.in_buffer_1 = new float[var2];
         var1.in_buffer_nsamples = var2;
      }
   }

   private int calcNeeded() {
      int var1 = 1024 + this.gfp.getFrameSize() - 272;
      var1 = Math.max(var1, 512 + this.gfp.getFrameSize() - 32);
      assert 3984 >= var1;
      return var1;
   }

   private int lame_encode_buffer_sample(float[] var1, float[] var2, int var3, byte[] var4, int var5, int var6) {
      LameInternalFlags var7 = this.gfp.internal_flags;
      int var8 = 0;
      float[][] var14 = new float[2][];
      float[][] var15 = new float[2][];
      if (var7.Class_ID != -487877L) {
         return -3;
      }

      if (var3 == 0) {
         return 0;
      }

      int var13 = this.bs.copy_buffer(var7, var4, var5, var6, 0);
      if (var13 < 0) {
         return var13;
      }

      var5 += var13;
      var8 += var13;
      var15[0] = var1;
      var15[1] = var2;
      if (BitStream.NEQ(this.gfp.scale, 0.0F) && BitStream.NEQ(this.gfp.scale, 1.0F)) {
         for (int var10 = 0; var10 < var3; var10++) {
            var15[0][var10] = var15[0][var10] * this.gfp.scale;
            if (var7.channels_out == 2) {
               var15[1][var10] = var15[1][var10] * this.gfp.scale;
            }
         }
      }

      if (BitStream.NEQ(this.gfp.scale_left, 0.0F) && BitStream.NEQ(this.gfp.scale_left, 1.0F)) {
         for (int var24 = 0; var24 < var3; var24++) {
            var15[0][var24] = var15[0][var24] * this.gfp.scale_left;
         }
      }

      if (BitStream.NEQ(this.gfp.scale_right, 0.0F) && BitStream.NEQ(this.gfp.scale_right, 1.0F)) {
         for (int var25 = 0; var25 < var3; var25++) {
            var15[1][var25] = var15[1][var25] * this.gfp.scale_right;
         }
      }

      if (this.gfp.getInNumChannels() == 2 && var7.channels_out == 1) {
         for (int var26 = 0; var26 < var3; var26++) {
            var15[0][var26] = 0.5F * (var15[0][var26] + var15[1][var26]);
            var15[1][var26] = 0.0F;
         }
      }

      int var12 = this.calcNeeded();
      var14[0] = var7.mfbuf[0];
      var14[1] = var7.mfbuf[1];
      int var16 = 0;

      while (var3 > 0) {
         float[][] var17 = new float[2][];
         int var18 = 0;
         int var19 = 0;
         var17[0] = var15[0];
         var17[1] = var15[1];
         Lame.InOut var20 = new Lame.InOut();
         this.fill_buffer(var14, var17, var16, var3, var20);
         var18 = var20.n_in;
         var19 = var20.n_out;
         if (var7.findReplayGain
            && !var7.decode_on_the_fly
            && this.ga.AnalyzeSamples(var7.rgdata, var14[0], var7.mf_size, var14[1], var7.mf_size, var19, var7.channels_out) == 0) {
            return -6;
         }

         var3 -= var18;
         var16 += var18;
         if (var7.channels_out == 2) {
         }

         var7.mf_size += var19;
         assert var7.mf_size <= 3984;
         if (var7.mf_samples_to_encode < 1) {
            var7.mf_samples_to_encode = 1728;
         }

         var7.mf_samples_to_encode += var19;
         if (var7.mf_size >= var12) {
            int var21 = var6 - var8;
            if (var6 == 0) {
               var21 = 0;
            }

            int var9 = this.lame_encode_frame(var14[0], var14[1], var4, var5, var21);
            if (var9 < 0) {
               return var9;
            }

            var5 += var9;
            var8 += var9;
            var7.mf_size = var7.mf_size - this.gfp.getFrameSize();
            var7.mf_samples_to_encode = var7.mf_samples_to_encode - this.gfp.getFrameSize();

            for (int var11 = 0; var11 < var7.channels_out; var11++) {
               for (int var27 = 0; var27 < var7.mf_size; var27++) {
                  var14[var11][var27] = var14[var11][var27 + this.gfp.getFrameSize()];
               }
            }
         }
      }

      assert var3 == 0;
      return var8;
   }

   private int lame_encode_buffer(short[] var1, short[] var2, int var3, byte[] var4, int var5, int var6) {
      LameInternalFlags var7 = this.gfp.internal_flags;
      float[][] var8 = new float[2][];
      if (var7.Class_ID != -487877L) {
         return -3;
      }

      if (var3 == 0) {
         return 0;
      }

      this.update_inbuffer_size(var7, var3);
      var8[0] = var7.in_buffer_0;
      var8[1] = var7.in_buffer_1;

      for (int var9 = 0; var9 < var3; var9++) {
         var8[0][var9] = var1[var9];
         if (var7.channels_in > 1) {
            var8[1][var9] = var2[var9];
         }
      }

      return this.lame_encode_buffer_sample(var8[0], var8[1], var3, var4, var5, var6);
   }

   public int encodeBuffer(float[] var1, float[] var2, int var3, byte[] var4) {
      LameInternalFlags var5 = this.gfp.internal_flags;
      float[][] var6 = new float[2][];
      if (var5.Class_ID != -487877L) {
         return -3;
      }

      if (var3 == 0) {
         return 0;
      }

      this.update_inbuffer_size(var5, var3);
      var6[0] = var5.in_buffer_0;
      var6[1] = var5.in_buffer_1;

      for (int var7 = 0; var7 < var3; var7++) {
         var6[0][var7] = var1[var7] * 1.5258789E-5F;
         if (var5.channels_in > 1) {
            var6[1][var7] = var2[var7] * 1.5258789E-5F;
         }
      }

      return this.lame_encode_buffer_sample(var6[0], var6[1], var3, var4, 0, var4.length);
   }

   public final int lame_encode_flush_nogap(byte[] var1, int var2) {
      LameInternalFlags var3 = this.gfp.internal_flags;
      this.bs.flush_bitstream(this.gfp);
      return this.bs.copy_buffer(var3, var1, 0, var2, 1);
   }

   public final void lame_init_bitstream() {
      LameInternalFlags var1 = this.gfp.internal_flags;
      this.gfp.frameNum = 0;
      if (this.gfp.isWriteId3tagAutomatic()) {
         this.id3.id3tag_write_v2(this.gfp);
      }

      var1.bitrate_stereoMode_Hist = new int[16][5];
      var1.bitrate_blockType_Hist = new int[16][6];
      var1.PeakSample = 0.0F;
      if (this.gfp.bWriteVbrTag) {
         this.vbr.InitVbrTag(this.gfp);
      }
   }

   public final int encodeFlush(byte[] var1) {
      LameInternalFlags var2 = this.gfp.internal_flags;
      short[][] var3 = new short[2][1152];
      int var4 = 0;
      int var9 = var2.mf_samples_to_encode - 1152;
      int var10 = this.calcNeeded();
      if (var2.mf_samples_to_encode < 1) {
         return 0;
      }

      int var5 = 0;
      if (this.gfp.getInSampleRate() != this.gfp.getOutSampleRate()) {
         var9 = (int)(var9 + 16.0 * this.gfp.getOutSampleRate() / this.gfp.getInSampleRate());
      }

      int var7 = this.gfp.getFrameSize() - var9 % this.gfp.getFrameSize();
      if (var7 < 576) {
         var7 += this.gfp.getFrameSize();
      }

      this.gfp.encoder_padding = var7;
      int var8 = (var9 + var7) / this.gfp.getFrameSize();
      int var11 = 0;

      while (var8 > 0 && var4 >= 0) {
         int var12 = var10 - var2.mf_size;
         int var13 = this.gfp.frameNum;
         var12 *= this.gfp.getInSampleRate();
         var12 /= this.gfp.getOutSampleRate();
         if (var12 > 1152) {
            var12 = 1152;
         }

         if (var12 < 1) {
            var12 = 1;
         }

         int var6 = var1.length - var5;
         if (var1.length == 0) {
            var6 = 0;
         }

         var4 = this.lame_encode_buffer(var3[0], var3[1], var12, var1, var11, var6);
         var11 += var4;
         var5 += var4;
         var8 -= var13 != this.gfp.frameNum ? 1 : 0;
      }

      var2.mf_samples_to_encode = 0;
      if (var4 < 0) {
         return var4;
      }

      int var17 = var1.length - var5;
      if (var1.length == 0) {
         var17 = 0;
      }

      this.bs.flush_bitstream(this.gfp);
      var4 = this.bs.copy_buffer(var2, var1, var11, var17, 1);
      if (var4 < 0) {
         return var4;
      }

      var11 += var4;
      var5 += var4;
      var17 = var1.length - var5;
      if (var1.length == 0) {
         var17 = 0;
      }

      if (this.gfp.isWriteId3tagAutomatic()) {
         this.id3.id3tag_write_v1(this.gfp);
         var4 = this.bs.copy_buffer(var2, var1, var11, var17, 0);
         if (var4 < 0) {
            return var4;
         }

         var5 += var4;
      }

      return var5;
   }

   public final int close() {
      byte var1 = 0;
      if (this.gfp != null && this.gfp.class_id == -487877L) {
         LameInternalFlags var2 = this.gfp.internal_flags;
         this.gfp.class_id = 0L;
         if (null == var2 || var2.Class_ID != -487877L) {
            var1 = -3;
         }

         var2.Class_ID = 0L;
         this.gfp.internal_flags = null;
         this.gfp.lame_allocated_gfp = 0;
      }

      return var1;
   }

   private void lame_init_old() {
      this.gfp.class_id = -487877L;
      LameInternalFlags var1 = this.gfp.internal_flags = new LameInternalFlags();
      this.gfp.setMode(MPEGMode.NOT_SET);
      this.gfp.original = 1;
      this.gfp.setInSampleRate(44100);
      this.gfp.setInNumChannels(2);
      this.gfp.num_samples = -1;
      this.gfp.bWriteVbrTag = true;
      this.gfp.setQuality(-1);
      this.gfp.short_blocks = null;
      var1.subblock_gain = -1;
      this.gfp.lowpassfreq = 0;
      this.gfp.highpassfreq = 0;
      this.gfp.lowpasswidth = -1;
      this.gfp.highpasswidth = -1;
      this.gfp.setVBR(VbrMode.vbr_off);
      this.gfp.setVBRQuality(4);
      this.gfp.ATHcurve = -1.0F;
      this.gfp.VBR_mean_bitrate_kbps = 128;
      this.gfp.VBR_min_bitrate_kbps = 0;
      this.gfp.VBR_max_bitrate_kbps = 0;
      this.gfp.VBR_hard_min = 0;
      var1.VBR_min_bitrate = 1;
      var1.VBR_max_bitrate = 13;
      this.gfp.quant_comp = -1;
      this.gfp.quant_comp_short = -1;
      this.gfp.msfix = -1.0F;
      var1.resample_ratio = 1.0;
      var1.OldValue[0] = 180;
      var1.OldValue[1] = 180;
      var1.CurrentStep[0] = 4;
      var1.CurrentStep[1] = 4;
      var1.masking_lower = 1.0F;
      var1.nsPsy.attackthre = -1.0F;
      var1.nsPsy.attackthre_s = -1.0F;
      this.gfp.scale = -1.0F;
      this.gfp.athaa_type = -1;
      this.gfp.ATHtype = -1;
      this.gfp.athaa_loudapprox = -1;
      this.gfp.athaa_sensitivity = 0.0F;
      this.gfp.useTemporal = null;
      this.gfp.interChRatio = -1.0F;
      var1.mf_samples_to_encode = 1728;
      this.gfp.encoder_padding = 0;
      var1.mf_size = 528;
      this.gfp.setFindReplayGain(false);
      this.gfp.decode_on_the_fly = false;
      var1.decode_on_the_fly = false;
      var1.findReplayGain = false;
      var1.findPeakSample = false;
      var1.RadioGain = 0;
      var1.AudiophileGain = 0;
      var1.noclipGainChange = 0;
      var1.noclipScale = -1.0F;
      this.gfp.preset = 0;
      this.gfp.setWriteId3tagAutomatic(true);
   }

   private final void lame_init() {
      this.lame_init_old();
      this.gfp.lame_allocated_gfp = 1;
   }

   public final void lame_bitrate_kbps(int[] var1) {
      if (null != var1) {
         if (null != this.gfp) {
            LameInternalFlags var2 = this.gfp.internal_flags;
            if (null != var2) {
               if (this.gfp.free_format) {
                  for (int var3 = 0; var3 < 14; var3++) {
                     var1[var3] = -1;
                  }

                  var1[0] = this.gfp.getBitRate();
               } else {
                  for (int var4 = 0; var4 < 14; var4++) {
                     var1[var4] = Tables.bitrate_table[this.gfp.getMpegVersion()][var4 + 1];
                  }
               }
            }
         }
      }
   }

   public final void lame_bitrate_hist(int[] var1) {
      if (null != var1) {
         if (null != this.gfp) {
            LameInternalFlags var2 = this.gfp.internal_flags;
            if (null != var2) {
               if (this.gfp.free_format) {
                  for (int var3 = 0; var3 < 14; var3++) {
                     var1[var3] = 0;
                  }

                  var1[0] = var2.bitrate_stereoMode_Hist[0][4];
               } else {
                  for (int var4 = 0; var4 < 14; var4++) {
                     var1[var4] = var2.bitrate_stereoMode_Hist[var4 + 1][4];
                  }
               }
            }
         }
      }
   }

   public final void lame_stereo_mode_hist(int[] var1) {
      if (null != var1) {
         if (null != this.gfp) {
            LameInternalFlags var2 = this.gfp.internal_flags;
            if (null != var2) {
               for (int var3 = 0; var3 < 4; var3++) {
                  var1[var3] = var2.bitrate_stereoMode_Hist[15][var3];
               }
            }
         }
      }
   }

   public final void lame_bitrate_stereo_mode_hist(int[][] var1) {
      if (null != var1) {
         if (null != this.gfp) {
            LameInternalFlags var2 = this.gfp.internal_flags;
            if (null != var2) {
               if (this.gfp.free_format) {
                  for (int var3 = 0; var3 < 14; var3++) {
                     for (int var4 = 0; var4 < 4; var4++) {
                        var1[var3][var4] = 0;
                     }
                  }

                  for (int var5 = 0; var5 < 4; var5++) {
                     var1[0][var5] = var2.bitrate_stereoMode_Hist[0][var5];
                  }
               } else {
                  for (int var6 = 0; var6 < 14; var6++) {
                     for (int var7 = 0; var7 < 4; var7++) {
                        var1[var6][var7] = var2.bitrate_stereoMode_Hist[var6 + 1][var7];
                     }
                  }
               }
            }
         }
      }
   }

   public final void lame_block_type_hist(int[] var1) {
      if (null != var1) {
         if (null != this.gfp) {
            LameInternalFlags var2 = this.gfp.internal_flags;
            if (null != var2) {
               for (int var3 = 0; var3 < 6; var3++) {
                  var1[var3] = var2.bitrate_blockType_Hist[15][var3];
               }
            }
         }
      }
   }

   public final void lame_bitrate_block_type_hist(int[][] var1) {
      if (null != var1) {
         if (null != this.gfp) {
            LameInternalFlags var2 = this.gfp.internal_flags;
            if (null != var2) {
               if (this.gfp.free_format) {
                  for (int var3 = 0; var3 < 14; var3++) {
                     for (int var4 = 0; var4 < 6; var4++) {
                        var1[var3][var4] = 0;
                     }
                  }

                  for (int var5 = 0; var5 < 6; var5++) {
                     var1[0][var5] = var2.bitrate_blockType_Hist[0][var5];
                  }
               } else {
                  for (int var6 = 0; var6 < 14; var6++) {
                     for (int var7 = 0; var7 < 6; var7++) {
                        var1[var6][var7] = var2.bitrate_blockType_Hist[var6 + 1][var7];
                     }
                  }
               }
            }
         }
      }
   }

   private static class BandPass {
      public int lowpass;

      public BandPass(int var1, int var2) {
         this.lowpass = var2;
      }
   }

   protected static class InOut {
      int n_in;
      int n_out;
   }

   protected static class LowPassHighPass {
      double lowerlimit;
   }

   protected static class NumUsed {
      int num_used;
   }
}
