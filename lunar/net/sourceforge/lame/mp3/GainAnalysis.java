package net.sourceforge.lame.mp3;

import java.util.Arrays;

public class GainAnalysis {
   public static final int GAIN_NOT_ENOUGH_SAMPLES = -24601;
   public static final int GAIN_ANALYSIS_ERROR = 0;
   public static final int GAIN_ANALYSIS_OK = 1;
   public static final int INIT_GAIN_ANALYSIS_ERROR = 0;
   public static final int INIT_GAIN_ANALYSIS_OK = 1;
   static final float STEPS_per_dB = 100.0F;
   static final float MAX_dB = 120.0F;
   private static final float PINK_REF = 64.82F;
   private static final int YULE_ORDER = 10;
   static final int MAX_ORDER = 10;
   private static final float RMS_PERCENTILE = 0.95F;
   private static final int MAX_SAMP_FREQ = 48000;
   private static final int RMS_WINDOW_TIME_NUMERATOR = 1;
   private static final int RMS_WINDOW_TIME_DENOMINATOR = 20;
   static final int MAX_SAMPLES_PER_WINDOW = 2401;
   private static final float[][] ABYule = new float[][]{
      {
            0.038575996F,
            -3.846646F,
            -0.021603672F,
            7.8150167F,
            -0.0012339532F,
            -11.341703F,
            -9.291678E-5F,
            13.055042F,
            -0.016552603F,
            -12.287599F,
            0.021615269F,
            9.482938F,
            -0.020740451F,
            -5.8725786F,
            0.0059429808F,
            2.7546587F,
            0.0030642801F,
            -0.8698438F,
            1.2025322E-4F,
            0.13919315F,
            0.0028846369F
      },
      {
            0.054186564F,
            -3.4784596F,
            -0.029110078F,
            6.363178F,
            -0.008487094F,
            -8.547515F,
            -0.008511657F,
            9.476936F,
            -0.008349909F,
            -8.814987F,
            0.022452932F,
            6.8540154F,
            -0.025963385F,
            -4.39471F,
            0.016248649F,
            2.196117F,
            -0.0024087904F,
            -0.751043F,
            0.006746137F,
            0.13149318F,
            -0.0018776378F
      },
      {
            0.154573F,
            -2.3789883F,
            -0.09331049F,
            2.8486814F,
            -0.062478803F,
            -2.6457717F,
            0.021635419F,
            2.2369766F,
            -0.055883933F,
            -1.6714815F,
            0.047814768F,
            1.0059595F,
            0.002223126F,
            -0.4595346F,
            0.031740926F,
            0.16378164F,
            -0.013905894F,
            -0.050320778F,
            0.0065142065F,
            0.023478974F,
            -0.008813627F
      },
      {
            0.30296907F,
            -1.6127317F,
            -0.22613989F,
            1.079775F,
            -0.08587324F,
            -0.2565626F,
            0.032829303F,
            -0.16276719F,
            -0.009157029F,
            -0.22638893F,
            -0.023641411F,
            0.391208F,
            -0.0058445605F,
            -0.2213814F,
            0.062761016F,
            0.045002352F,
            -8.280867E-6F,
            0.020058518F,
            0.002058619F,
            0.003024391F,
            -0.02950135F
      },
      {
            0.33642304F,
            -1.4985898F,
            -0.2557224F,
            0.87350273F,
            -0.1182857F,
            0.122050226F,
            0.11921149F,
            -0.80774945F,
            -0.0783449F,
            0.47854796F,
            -0.004699779F,
            -0.124534585F,
            -0.0058950023F,
            -0.040675104F,
            0.05724228F,
            0.08333755F,
            0.00832044F,
            -0.04237348F,
            -0.016353814F,
            0.029772073F,
            -0.017601766F
      },
      {
            0.44915256F,
            -0.6282062F,
            -0.14351757F,
            0.29661784F,
            -0.22784394F,
            -0.37256372F,
            -0.014191401F,
            0.0021376787F,
            0.040782627F,
            -0.4202982F,
            -0.12398163F,
            0.2219965F,
            0.040975653F,
            0.0061342437F,
            0.10478503F,
            0.067476206F,
            -0.018638877F,
            0.057848204F,
            -0.031934284F,
            0.032227542F,
            0.0054190774F
      },
      {
            0.5661947F,
            -1.0480033F,
            -0.7546446F,
            0.29156312F,
            0.16242138F,
            -0.26806F,
            0.16744244F,
            0.008199996F,
            -0.18901604F,
            0.45054734F,
            0.30931783F,
            -0.33032402F,
            -0.2756296F,
            0.06739368F,
            0.006473107F,
            -0.047842544F,
            0.08647504F,
            0.016399078F,
            -0.037889846F,
            0.018073643F,
            -0.005882154F
      },
      {
            0.581005F,
            -0.51035327F,
            -0.53174907F,
            -0.31863564F,
            -0.142898F,
            -0.20256414F,
            0.17520705F,
            0.14728154F,
            0.023779452F,
            0.3895264F,
            0.15558448F,
            -0.23313272F,
            -0.2534479F,
            -0.05246019F,
            0.016284624F,
            -0.025059618F,
            0.06920468F,
            0.024423573F,
            -0.037216116F,
            0.01818801F,
            -0.007496188F
      },
      {
            0.5364879F,
            -0.2504987F,
            -0.42163035F,
            -0.43193942F,
            -0.002759536F,
            -0.03424681F,
            0.042678423F,
            -0.046783287F,
            -0.102148645F,
            0.264083F,
            0.14590773F,
            0.1511313F,
            -0.024598649F,
            -0.17556493F,
            -0.11202315F,
            -0.1882301F,
            -0.04060034F,
            0.054777205F,
            0.047886655F,
            0.0470441F,
            -0.022179369F
      }
   };
   private static final float[][] ABButter = new float[][]{
      {0.9862119F, -1.9722338F, -1.9724238F, 0.972614F, 0.9862119F},
      {0.98500174F, -1.9697785F, -1.9700035F, 0.9702285F, 0.98500174F},
      {0.9793893F, -1.9583538F, -1.9587786F, 0.9592035F, 0.9793893F},
      {0.97531843F, -1.9500276F, -1.9506369F, 0.95124614F, 0.97531843F},
      {0.9731652F, -1.9456103F, -1.9463304F, 0.9470507F, 0.9731652F},
      {0.96454513F, -1.9278328F, -1.9290903F, 0.93034774F, 0.96454513F},
      {0.9600914F, -1.9185895F, -1.9201828F, 0.9217762F, 0.9600914F},
      {0.95856917F, -1.9154211F, -1.9171383F, 0.9188556F, 0.95856917F},
      {0.94597685F, -1.8890331F, -1.8919537F, 0.89487433F, 0.94597685F}
   };

   private void filterYule(float[] var1, int var2, float[] var3, int var4, int var5, float[] var6) {
      while (var5-- != 0) {
         var3[var4] = 1.0E-10F
            + var1[var2 + 0] * var6[0]
            - var3[var4 - 1] * var6[1]
            + var1[var2 - 1] * var6[2]
            - var3[var4 - 2] * var6[3]
            + var1[var2 - 2] * var6[4]
            - var3[var4 - 3] * var6[5]
            + var1[var2 - 3] * var6[6]
            - var3[var4 - 4] * var6[7]
            + var1[var2 - 4] * var6[8]
            - var3[var4 - 5] * var6[9]
            + var1[var2 - 5] * var6[10]
            - var3[var4 - 6] * var6[11]
            + var1[var2 - 6] * var6[12]
            - var3[var4 - 7] * var6[13]
            + var1[var2 - 7] * var6[14]
            - var3[var4 - 8] * var6[15]
            + var1[var2 - 8] * var6[16]
            - var3[var4 - 9] * var6[17]
            + var1[var2 - 9] * var6[18]
            - var3[var4 - 10] * var6[19]
            + var1[var2 - 10] * var6[20];
         var4++;
         var2++;
      }
   }

   private void filterButter(float[] var1, int var2, float[] var3, int var4, int var5, float[] var6) {
      while (var5-- != 0) {
         var3[var4] = var1[var2 + 0] * var6[0] - var3[var4 - 1] * var6[1] + var1[var2 - 1] * var6[2] - var3[var4 - 2] * var6[3] + var1[var2 - 2] * var6[4];
         var4++;
         var2++;
      }
   }

   private int ResetSampleFrequency(ReplayGain var1, long var2) {
      for (int var4 = 0; var4 < 10; var4++) {
         var1.linprebuf[var4] = var1.lstepbuf[var4] = var1.loutbuf[var4] = var1.rinprebuf[var4] = var1.rstepbuf[var4] = var1.routbuf[var4] = 0.0F;
      }

      switch ((int)var2) {
         case 8000:
            var1.freqindex = 8;
            break;
         case 11025:
            var1.freqindex = 7;
            break;
         case 12000:
            var1.freqindex = 6;
            break;
         case 16000:
            var1.freqindex = 5;
            break;
         case 22050:
            var1.freqindex = 4;
            break;
         case 24000:
            var1.freqindex = 3;
            break;
         case 32000:
            var1.freqindex = 2;
            break;
         case 44100:
            var1.freqindex = 1;
            break;
         case 48000:
            var1.freqindex = 0;
            break;
         default:
            return 0;
      }

      var1.sampleWindow = (int)((var2 * 1L + 20L - 1L) / 20L);
      var1.lsum = 0.0;
      var1.rsum = 0.0;
      var1.totsamp = 0;
      Arrays.fill(var1.A, 0);
      return 1;
   }

   public final int InitGainAnalysis(ReplayGain var1, long var2) {
      if (this.ResetSampleFrequency(var1, var2) != 1) {
         return 0;
      }

      var1.linpre = 10;
      var1.rinpre = 10;
      var1.lstep = 10;
      var1.rstep = 10;
      var1.lout = 10;
      var1.rout = 10;
      Arrays.fill(var1.B, 0);
      return 1;
   }

   private double fsqr(double var1) {
      return var1 * var1;
   }

   public final int AnalyzeSamples(ReplayGain var1, float[] var2, int var3, float[] var4, int var5, int var6, int var7) {
      if (var6 == 0) {
         return 1;
      }

      int var14 = 0;
      int var12 = var6;
      switch (var7) {
         case 1:
            var4 = var2;
            var5 = var3;
         case 2:
            if (var6 < 10) {
               System.arraycopy(var2, var3, var1.linprebuf, 10, var6);
               System.arraycopy(var4, var5, var1.rinprebuf, 10, var6);
            } else {
               System.arraycopy(var2, var3, var1.linprebuf, 10, 10);
               System.arraycopy(var4, var5, var1.rinprebuf, 10, 10);
            }
            break;
         default:
            return 0;
      }

      while (var12 > 0) {
         int var13 = var12 > var1.sampleWindow - var1.totsamp ? var1.sampleWindow - var1.totsamp : var12;
         int var8;
         float[] var9;
         int var10;
         float[] var11;
         if (var14 < 10) {
            var8 = var1.linpre + var14;
            var9 = var1.linprebuf;
            var10 = var1.rinpre + var14;
            var11 = var1.rinprebuf;
            if (var13 > 10 - var14) {
               var13 = 10 - var14;
            }
         } else {
            var8 = var3 + var14;
            var9 = var2;
            var10 = var5 + var14;
            var11 = var4;
         }

         this.filterYule(var9, var8, var1.lstepbuf, var1.lstep + var1.totsamp, var13, ABYule[var1.freqindex]);
         this.filterYule(var11, var10, var1.rstepbuf, var1.rstep + var1.totsamp, var13, ABYule[var1.freqindex]);
         this.filterButter(var1.lstepbuf, var1.lstep + var1.totsamp, var1.loutbuf, var1.lout + var1.totsamp, var13, ABButter[var1.freqindex]);
         this.filterButter(var1.rstepbuf, var1.rstep + var1.totsamp, var1.routbuf, var1.rout + var1.totsamp, var13, ABButter[var1.freqindex]);
         var8 = var1.lout + var1.totsamp;
         var9 = var1.loutbuf;
         var10 = var1.rout + var1.totsamp;
         var11 = var1.routbuf;

         for (int var15 = var13 % 8; var15-- != 0; var1.rsum = var1.rsum + this.fsqr(var11[var10++])) {
            var1.lsum = var1.lsum + this.fsqr(var9[var8++]);
         }

         for (int var23 = var13 / 8; var23-- != 0; var10 += 8) {
            var1.lsum = var1.lsum
               + (
                  this.fsqr(var9[var8 + 0])
                     + this.fsqr(var9[var8 + 1])
                     + this.fsqr(var9[var8 + 2])
                     + this.fsqr(var9[var8 + 3])
                     + this.fsqr(var9[var8 + 4])
                     + this.fsqr(var9[var8 + 5])
                     + this.fsqr(var9[var8 + 6])
                     + this.fsqr(var9[var8 + 7])
               );
            var8 += 8;
            var1.rsum = var1.rsum
               + (
                  this.fsqr(var11[var10 + 0])
                     + this.fsqr(var11[var10 + 1])
                     + this.fsqr(var11[var10 + 2])
                     + this.fsqr(var11[var10 + 3])
                     + this.fsqr(var11[var10 + 4])
                     + this.fsqr(var11[var10 + 5])
                     + this.fsqr(var11[var10 + 6])
                     + this.fsqr(var11[var10 + 7])
               );
         }

         var12 -= var13;
         var14 += var13;
         var1.totsamp += var13;
         if (var1.totsamp == var1.sampleWindow) {
            double var16 = 1000.0 * Math.log10((var1.lsum + var1.rsum) / var1.totsamp * 0.5 + 1.0E-37);
            int var18 = var16 <= 0.0 ? 0 : (int)var16;
            if (var18 >= var1.A.length) {
               var18 = var1.A.length - 1;
            }

            var1.A[var18]++;
            var1.lsum = var1.rsum = 0.0;
            System.arraycopy(var1.loutbuf, var1.totsamp, var1.loutbuf, 0, 10);
            System.arraycopy(var1.routbuf, var1.totsamp, var1.routbuf, 0, 10);
            System.arraycopy(var1.lstepbuf, var1.totsamp, var1.lstepbuf, 0, 10);
            System.arraycopy(var1.rstepbuf, var1.totsamp, var1.rstepbuf, 0, 10);
            var1.totsamp = 0;
         }

         if (var1.totsamp > var1.sampleWindow) {
            return 0;
         }
      }

      if (var6 < 10) {
         System.arraycopy(var1.linprebuf, var6, var1.linprebuf, 0, 10 - var6);
         System.arraycopy(var1.rinprebuf, var6, var1.rinprebuf, 0, 10 - var6);
         System.arraycopy(var2, var3, var1.linprebuf, 10 - var6, var6);
         System.arraycopy(var4, var5, var1.rinprebuf, 10 - var6, var6);
      } else {
         System.arraycopy(var2, var3 + var6 - 10, var1.linprebuf, 0, 10);
         System.arraycopy(var4, var5 + var6 - 10, var1.rinprebuf, 0, 10);
      }

      return 1;
   }

   private float analyzeResult(int[] var1, int var2) {
      int var4 = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         var4 += var1[var3];
      }

      if (var4 == 0) {
         return -24601.0F;
      }

      int var5 = (int)Math.ceil(var4 * 0.050000012F);
      int var6 = var2;

      while (var6-- > 0 && (var5 -= var1[var6]) > 0) {
      }

      return 64.82F - var6 / 100.0F;
   }

   public final float GetTitleGain(ReplayGain var1) {
      float var2 = this.analyzeResult(var1.A, var1.A.length);

      for (int var3 = 0; var3 < var1.A.length; var3++) {
         var1.B[var3] = var1.B[var3] + var1.A[var3];
         var1.A[var3] = 0;
      }

      for (int var4 = 0; var4 < 10; var4++) {
         var1.linprebuf[var4] = var1.lstepbuf[var4] = var1.loutbuf[var4] = var1.rinprebuf[var4] = var1.rstepbuf[var4] = var1.routbuf[var4] = 0.0F;
      }

      var1.totsamp = 0;
      var1.lsum = var1.rsum = 0.0;
      return var2;
   }
}
