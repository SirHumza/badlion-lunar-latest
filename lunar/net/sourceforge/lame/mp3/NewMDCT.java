package net.sourceforge.lame.mp3;

import java.util.Arrays;

public class NewMDCT {
   private static final float[] enwindow = new float[]{
      -0.1482524F,
      32.30814F,
      296.40344F,
      883.1345F,
      11113.947F,
      1057.2714F,
      305.74026F,
      30.825928F,
      3.8533187F,
      59.42901F,
      709.59F,
      5281.911F,
      -5829.6646F,
      -817.62933F,
      -76.916565F,
      -4.5942698F,
      0.90634716F,
      0.19603428F,
      -0.15466693F,
      34.324387F,
      301.80673F,
      817.59955F,
      11573.796F,
      1181.252F,
      321.59732F,
      31.23202F,
      3.7107093F,
      53.650944F,
      684.16736F,
      5224.566F,
      -6366.3916F,
      -908.97656F,
      -89.83069F,
      -5.4113975F,
      0.8206788F,
      0.39018065F,
      -0.16070889F,
      36.147034F,
      304.11813F,
      732.7429F,
      11989.61F,
      1300.0122F,
      335.2849F,
      31.488161F,
      3.3738759F,
      47.23224F,
      652.7372F,
      5132.414F,
      -6909.087F,
      -1001.99896F,
      -103.62186F,
      -6.104916F,
      0.7416505F,
      0.5805693F,
      -0.16636367F,
      37.751648F,
      303.01105F,
      627.97473F,
      12358.763F,
      1412.278F,
      346.74966F,
      31.598288F,
      3.1598632F,
      40.578785F,
      616.1671F,
      5007.833F,
      -7454.04F,
      -1095.796F,
      -118.24411F,
      -6.8184686F,
      0.6681786F,
      0.76536685F,
      -0.17161769F,
      39.11552F,
      298.3413F,
      503.5259F,
      12679.589F,
      1516.5822F,
      355.98505F,
      31.39524F,
      2.916421F,
      33.79717F,
      574.89435F,
      4853.2354F,
      -7997.57F,
      -1189.7623F,
      -133.64447F,
      -7.720277F,
      0.5993769F,
      0.9427935F,
      -0.17645824F,
      40.218792F,
      289.9982F,
      359.32263F,
      12950.259F,
      1612.1014F,
      362.85068F,
      31.045921F,
      2.822222F,
      26.988861F,
      529.89966F,
      4671.3716F,
      -8535.899F,
      -1282.5898F,
      -149.58554F,
      -8.643495F,
      0.53451115F,
      1.1111405F,
      -0.3617474F,
      41.0443F,
      277.54633F,
      195.6386F,
      13169.438F,
      1697.6434F,
      367.40985F,
      30.557037F,
      2.5314734F,
      20.070154F,
      481.5021F,
      4464.97F,
      -9065.369F,
      -1373.6284F,
      -166.16605F,
      -9.582893F,
      0.47296476F,
      1.2687865F,
      -0.36970684F,
      41.393208F,
      261.29358F,
      12.935476F,
      13336.131F,
      1772.5087F,
      369.76532F,
      29.751324F,
      2.4023192F,
      13.304795F,
      430.56158F,
      4237.0566F,
      -9581.932F,
      -1461.6913F,
      -183.12733F,
      -10.71801F,
      0.41421357F,
      1.4142135F,
      -0.3767756F,
      41.619484F,
      241.05426F,
      -187.94664F,
      13450.063F,
      1836.1538F,
      369.49088F,
      29.001848F,
      2.0714757F,
      6.779591F,
      377.77676F,
      3990.3862F,
      -10081.71F,
      -1545.9475F,
      -200.37631F,
      -11.864482F,
      0.35780573F,
      1.5460209F,
      -0.38293672F,
      41.151646F,
      216.47685F,
      -406.15695F,
      13511.137F,
      1887.8076F,
      367.30252F,
      28.136213F,
      1.9138807F,
      0.38293672F,
      323.85364F,
      3728.1475F,
      -10561.233F,
      -1625.2025F,
      -217.62526F,
      -13.015432F,
      0.3033467F,
      1.6629392F,
      -0.5822629F,
      40.35639F,
      188.20071F,
      -640.2706F,
      13519.214F,
      1927.6023F,
      362.81976F,
      26.968822F,
      1.7463819F,
      -5.626507F,
      269.30167F,
      3453.3862F,
      -11016.1455F,
      -1698.657F,
      -234.76587F,
      -14.163513F,
      0.25048697F,
      1.7638426F,
      -0.588718F,
      39.23429F,
      155.76096F,
      -889.24927F,
      13475.471F,
      1955.0535F,
      356.44507F,
      25.894953F,
      1.5695032F,
      -11.181939F,
      214.80882F,
      3169.1638F,
      -11443.32F,
      -1765.1588F,
      -251.68909F,
      -15.49756F,
      0.19891237F,
      1.847759F,
      -0.7912582F,
      37.393692F,
      119.69948F,
      -1151.0957F,
      13380.445F,
      1970.3951F,
      348.0196F,
      24.731487F,
      1.3850131F,
      -16.42141F,
      161.05031F,
      2878.3323F,
      -11838.991F,
      -1823.9858F,
      -268.2855F,
      -16.817245F,
      0.148336F,
      1.9138807F,
      -0.79606426F,
      35.23221F,
      80.01928F,
      -1424.0212F,
      13235.794F,
      1973.804F,
      337.99088F,
      23.28916F,
      1.3934255F,
      -21.09967F,
      108.483475F,
      2583.7007F,
      -12199.726F,
      -1874.2781F,
      -284.2467F,
      -18.113697F,
      0.0984914F,
      1.9615705F,
      -0.9987954F,
      32.56308F,
      36.958363F,
      -1706.0753F,
      13043.287F,
      1965.383F,
      326.4318F,
      22.175018F,
      1.1986383F,
      -25.371246F,
      57.535057F,
      2288.419F,
      -12522.674F,
      -1914.84F,
      -299.2624F,
      -19.378056F,
      0.04912685F,
      1.9903694F,
      10612.803F,
      5302.158F,
      929.77625F,
      728.8011F,
      288.09766F,
      64.91738F,
      30.125004F,
      4.1014566F,
      12804.798F,
      1945.5516F,
      313.4245F,
      20.801594F,
      1995.1556F,
      9.000838F,
      -29.20218F
   };
   private static final int NS = 12;
   private static final int NL = 36;
   private static final float[][] win = new float[][]{
      {
            2.3821917E-13F,
            6.423306E-13F,
            9.400849E-13F,
            1.122435E-12F,
            1.1838404E-12F,
            1.122435E-12F,
            9.400849E-13F,
            6.423306E-13F,
            2.3821917E-13F,
            5.456116E-12F,
            4.8789852E-12F,
            4.240449E-12F,
            3.559909E-12F,
            2.8580434E-12F,
            2.1561776E-12F,
            1.4756378E-12F,
            8.371015E-13F,
            2.5997062E-13F,
            -5.456116E-12F,
            -4.8789852E-12F,
            -4.240449E-12F,
            -3.559909E-12F,
            -2.8580434E-12F,
            -2.1561776E-12F,
            -1.4756378E-12F,
            -8.371015E-13F,
            -2.5997062E-13F,
            -2.3821917E-13F,
            -6.423306E-13F,
            -9.400849E-13F,
            -1.122435E-12F,
            -1.1838404E-12F,
            -1.122435E-12F,
            -9.400849E-13F,
            -6.423306E-13F,
            -2.3821917E-13F
      },
      {
            2.3821917E-13F,
            6.423306E-13F,
            9.400849E-13F,
            1.122435E-12F,
            1.1838404E-12F,
            1.122435E-12F,
            9.400849E-13F,
            6.423306E-13F,
            2.3821917E-13F,
            5.456116E-12F,
            4.8789852E-12F,
            4.240449E-12F,
            3.559909E-12F,
            2.8580434E-12F,
            2.1561776E-12F,
            1.4756378E-12F,
            8.371015E-13F,
            2.5997062E-13F,
            -5.461314E-12F,
            -4.9210857E-12F,
            -4.343405E-12F,
            -3.7326683E-12F,
            -3.093524E-12F,
            -2.4308357E-12F,
            -1.734679E-12F,
            -9.748254E-13F,
            -2.797435E-13F,
            0.0F,
            0.0F,
            0.0F,
            0.0F,
            0.0F,
            0.0F,
            -2.2837483E-13F,
            -4.037859E-13F,
            -2.1465475E-13F
      },
      {
            0.1316525F,
            0.41421357F,
            0.767327F,
            1.0913085F,
            1.3032254F,
            1.5696856F,
            1.9209821F,
            2.4142137F,
            3.1715949F,
            4.5107083F,
            7.595754F,
            22.903765F,
            0.9848077F,
            0.64278764F,
            0.34202015F,
            0.9396926F,
            -0.17364818F,
            -0.76604444F,
            0.8660254F,
            0.5F,
            -0.51449573F,
            -0.47173196F,
            -0.31337744F,
            -0.1819132F,
            -0.09457419F,
            -0.040965583F,
            -0.014198569F,
            -0.0036999746F,
            0.8574929F,
            0.881742F,
            0.94962865F,
            0.9833146F,
            0.9955178F,
            0.9991606F,
            0.9998992F,
            0.99999315F
      },
      {
            0.0F,
            0.0F,
            0.0F,
            0.0F,
            0.0F,
            0.0F,
            2.2837483E-13F,
            4.037859E-13F,
            2.1465475E-13F,
            5.461314E-12F,
            4.9210857E-12F,
            4.343405E-12F,
            3.7326683E-12F,
            3.093524E-12F,
            2.4308357E-12F,
            1.734679E-12F,
            9.748254E-13F,
            2.797435E-13F,
            -5.456116E-12F,
            -4.8789852E-12F,
            -4.240449E-12F,
            -3.559909E-12F,
            -2.8580434E-12F,
            -2.1561776E-12F,
            -1.4756378E-12F,
            -8.371015E-13F,
            -2.5997062E-13F,
            -2.3821917E-13F,
            -6.423306E-13F,
            -9.400849E-13F,
            -1.122435E-12F,
            -1.1838404E-12F,
            -1.122435E-12F,
            -9.400849E-13F,
            -6.423306E-13F,
            -2.3821917E-13F
      }
   };
   private static final float[] tantab_l = win[2];
   private static final float[] cx = win[2];
   private static final float[] ca = win[2];
   private static final float[] cs = win[2];
   private static final int[] order = new int[]{
      0, 1, 16, 17, 8, 9, 24, 25, 4, 5, 20, 21, 12, 13, 28, 29, 2, 3, 18, 19, 10, 11, 26, 27, 6, 7, 22, 23, 14, 15, 30, 31
   };

   private void window_subband(float[] var1, int var2, float[] var3) {
      byte var4 = 10;
      int var5 = var2 + 238 - 14 - 286;

      for (int var6 = -15; var6 < 0; var6++) {
         float var7 = enwindow[var4 + -10];
         float var8 = var1[var5 + -224] * var7;
         float var9 = var1[var2 + 224] * var7;
         var7 = enwindow[var4 + -9];
         var8 += var1[var5 + -160] * var7;
         var9 += var1[var2 + 160] * var7;
         var7 = enwindow[var4 + -8];
         var8 += var1[var5 + -96] * var7;
         var9 += var1[var2 + 96] * var7;
         var7 = enwindow[var4 + -7];
         var8 += var1[var5 + -32] * var7;
         var9 += var1[var2 + 32] * var7;
         var7 = enwindow[var4 + -6];
         var8 += var1[var5 + 32] * var7;
         var9 += var1[var2 + -32] * var7;
         var7 = enwindow[var4 + -5];
         var8 += var1[var5 + 96] * var7;
         var9 += var1[var2 + -96] * var7;
         var7 = enwindow[var4 + -4];
         var8 += var1[var5 + 160] * var7;
         var9 += var1[var2 + -160] * var7;
         var7 = enwindow[var4 + -3];
         var8 += var1[var5 + 224] * var7;
         var9 += var1[var2 + -224] * var7;
         var7 = enwindow[var4 + -2];
         var8 += var1[var2 + -256] * var7;
         var9 -= var1[var5 + 256] * var7;
         var7 = enwindow[var4 + -1];
         var8 += var1[var2 + -192] * var7;
         var9 -= var1[var5 + 192] * var7;
         var7 = enwindow[var4 + 0];
         var8 += var1[var2 + -128] * var7;
         var9 -= var1[var5 + 128] * var7;
         var7 = enwindow[var4 + 1];
         var8 += var1[var2 + -64] * var7;
         var9 -= var1[var5 + 64] * var7;
         var7 = enwindow[var4 + 2];
         var8 += var1[var2 + 0] * var7;
         var9 -= var1[var5 + 0] * var7;
         var7 = enwindow[var4 + 3];
         var8 += var1[var2 + 64] * var7;
         var9 -= var1[var5 + -64] * var7;
         var7 = enwindow[var4 + 4];
         var8 += var1[var2 + 128] * var7;
         var9 -= var1[var5 + -128] * var7;
         var7 = enwindow[var4 + 5];
         var8 += var1[var2 + 192] * var7;
         var9 -= var1[var5 + -192] * var7;
         var8 *= enwindow[var4 + 6];
         var7 = var9 - var8;
         var3[30 + var6 * 2] = var9 + var8;
         var3[31 + var6 * 2] = enwindow[var4 + 7] * var7;
         var4 += 18;
         var2--;
         var5++;
      }

      float var125 = var1[var2 + -16] * enwindow[var4 + -10];
      float var10 = var1[var2 + -32] * enwindow[var4 + -2];
      var125 += (var1[var2 + -48] - var1[var2 + 16]) * enwindow[var4 + -9];
      var10 += var1[var2 + -96] * enwindow[var4 + -1];
      var125 += (var1[var2 + -80] + var1[var2 + 48]) * enwindow[var4 + -8];
      var10 += var1[var2 + -160] * enwindow[var4 + 0];
      var125 += (var1[var2 + -112] - var1[var2 + 80]) * enwindow[var4 + -7];
      var10 += var1[var2 + -224] * enwindow[var4 + 1];
      var125 += (var1[var2 + -144] + var1[var2 + 112]) * enwindow[var4 + -6];
      var10 -= var1[var2 + 32] * enwindow[var4 + 2];
      var125 += (var1[var2 + -176] - var1[var2 + 144]) * enwindow[var4 + -5];
      var10 -= var1[var2 + 96] * enwindow[var4 + 3];
      var125 += (var1[var2 + -208] + var1[var2 + 176]) * enwindow[var4 + -4];
      var10 -= var1[var2 + 160] * enwindow[var4 + 4];
      var125 += (var1[var2 + -240] - var1[var2 + 208]) * enwindow[var4 + -3];
      var10 -= var1[var2 + 224];
      float var150 = var10 - var125;
      float var166 = var10 + var125;
      var125 = var3[14];
      var10 = var3[15] - var125;
      var3[31] = var166 + var125;
      var3[30] = var150 + var10;
      var3[15] = var150 - var10;
      var3[14] = var166 - var125;
      var10 = var3[28] - var3[0];
      var3[0] += var3[28];
      var3[28] = var10 * enwindow[var4 + -36 + 7];
      var10 = var3[29] - var3[1];
      var3[1] += var3[29];
      var3[29] = var10 * enwindow[var4 + -36 + 7];
      var10 = var3[26] - var3[2];
      var3[2] += var3[26];
      var3[26] = var10 * enwindow[var4 + -72 + 7];
      var10 = var3[27] - var3[3];
      var3[3] += var3[27];
      var3[27] = var10 * enwindow[var4 + -72 + 7];
      var10 = var3[24] - var3[4];
      var3[4] += var3[24];
      var3[24] = var10 * enwindow[var4 + -108 + 7];
      var10 = var3[25] - var3[5];
      var3[5] += var3[25];
      var3[25] = var10 * enwindow[var4 + -108 + 7];
      var10 = var3[22] - var3[6];
      var3[6] += var3[22];
      var3[22] = var10 * 1.4142135F;
      var10 = var3[23] - var3[7];
      var3[7] += var3[23];
      var3[23] = var10 * 1.4142135F - var3[7];
      var3[7] -= var3[6];
      var3[22] -= var3[7];
      var3[23] -= var3[22];
      var10 = var3[6];
      var3[6] = var3[31] - var10;
      var3[31] += var10;
      var10 = var3[7];
      var3[7] = var3[30] - var10;
      var3[30] += var10;
      var10 = var3[22];
      var3[22] = var3[15] - var10;
      var3[15] += var10;
      var10 = var3[23];
      var3[23] = var3[14] - var10;
      var3[14] += var10;
      var10 = var3[20] - var3[8];
      var3[8] += var3[20];
      var3[20] = var10 * enwindow[var4 + -180 + 7];
      var10 = var3[21] - var3[9];
      var3[9] += var3[21];
      var3[21] = var10 * enwindow[var4 + -180 + 7];
      var10 = var3[18] - var3[10];
      var3[10] += var3[18];
      var3[18] = var10 * enwindow[var4 + -216 + 7];
      var10 = var3[19] - var3[11];
      var3[11] += var3[19];
      var3[19] = var10 * enwindow[var4 + -216 + 7];
      var10 = var3[16] - var3[12];
      var3[12] += var3[16];
      var3[16] = var10 * enwindow[var4 + -252 + 7];
      var10 = var3[17] - var3[13];
      var3[13] += var3[17];
      var3[17] = var10 * enwindow[var4 + -252 + 7];
      var10 = -var3[20] + var3[24];
      var3[20] += var3[24];
      var3[24] = var10 * enwindow[var4 + -216 + 7];
      var10 = -var3[21] + var3[25];
      var3[21] += var3[25];
      var3[25] = var10 * enwindow[var4 + -216 + 7];
      var10 = var3[4] - var3[8];
      var3[4] += var3[8];
      var3[8] = var10 * enwindow[var4 + -216 + 7];
      var10 = var3[5] - var3[9];
      var3[5] += var3[9];
      var3[9] = var10 * enwindow[var4 + -216 + 7];
      var10 = var3[0] - var3[12];
      var3[0] += var3[12];
      var3[12] = var10 * enwindow[var4 + -72 + 7];
      var10 = var3[1] - var3[13];
      var3[1] += var3[13];
      var3[13] = var10 * enwindow[var4 + -72 + 7];
      var10 = var3[16] - var3[28];
      var3[16] += var3[28];
      var3[28] = var10 * enwindow[var4 + -72 + 7];
      var10 = -var3[17] + var3[29];
      var3[17] += var3[29];
      var3[29] = var10 * enwindow[var4 + -72 + 7];
      var10 = 1.4142135F * (var3[2] - var3[10]);
      var3[2] += var3[10];
      var3[10] = var10;
      var10 = 1.4142135F * (var3[3] - var3[11]);
      var3[3] += var3[11];
      var3[11] = var10;
      var10 = 1.4142135F * (-var3[18] + var3[26]);
      var3[18] += var3[26];
      var3[26] = var10 - var3[18];
      var10 = 1.4142135F * (-var3[19] + var3[27]);
      var3[19] += var3[27];
      var3[27] = var10 - var3[19];
      var10 = var3[2];
      var3[19] -= var3[3];
      var3[3] -= var10;
      var3[2] = var3[31] - var10;
      var3[31] += var10;
      var10 = var3[3];
      var3[11] -= var3[19];
      var3[18] -= var10;
      var3[3] = var3[30] - var10;
      var3[30] += var10;
      var10 = var3[18];
      var3[27] -= var3[11];
      var3[19] -= var10;
      var3[18] = var3[15] - var10;
      var3[15] += var10;
      var10 = var3[19];
      var3[10] -= var10;
      var3[19] = var3[14] - var10;
      var3[14] += var10;
      var10 = var3[10];
      var3[11] -= var10;
      var3[10] = var3[23] - var10;
      var3[23] += var10;
      var10 = var3[11];
      var3[26] -= var10;
      var3[11] = var3[22] - var10;
      var3[22] += var10;
      var10 = var3[26];
      var3[27] -= var10;
      var3[26] = var3[7] - var10;
      var3[7] += var10;
      var10 = var3[27];
      var3[27] = var3[6] - var10;
      var3[6] += var10;
      var10 = 1.4142135F * (var3[0] - var3[4]);
      var3[0] += var3[4];
      var3[4] = var10;
      var10 = 1.4142135F * (var3[1] - var3[5]);
      var3[1] += var3[5];
      var3[5] = var10;
      var10 = 1.4142135F * (var3[16] - var3[20]);
      var3[16] += var3[20];
      var3[20] = var10;
      var10 = 1.4142135F * (var3[17] - var3[21]);
      var3[17] += var3[21];
      var3[21] = var10;
      var10 = -1.4142135F * (var3[8] - var3[12]);
      var3[8] += var3[12];
      var3[12] = var10 - var3[8];
      var10 = -1.4142135F * (var3[9] - var3[13]);
      var3[9] += var3[13];
      var3[13] = var10 - var3[9];
      var10 = -1.4142135F * (var3[25] - var3[29]);
      var3[25] += var3[29];
      var3[29] = var10 - var3[25];
      var10 = -1.4142135F * (var3[24] + var3[28]);
      var3[24] -= var3[28];
      var3[28] = var10 - var3[24];
      var10 = var3[24] - var3[16];
      var3[24] = var10;
      var10 = var3[20] - var10;
      var3[20] = var10;
      var10 = var3[28] - var10;
      var3[28] = var10;
      var10 = var3[25] - var3[17];
      var3[25] = var10;
      var10 = var3[21] - var10;
      var3[21] = var10;
      var10 = var3[29] - var10;
      var3[29] = var10;
      var10 = var3[17] - var3[1];
      var3[17] = var10;
      var10 = var3[9] - var10;
      var3[9] = var10;
      var10 = var3[25] - var10;
      var3[25] = var10;
      var10 = var3[5] - var10;
      var3[5] = var10;
      var10 = var3[21] - var10;
      var3[21] = var10;
      var10 = var3[13] - var10;
      var3[13] = var10;
      var10 = var3[29] - var10;
      var3[29] = var10;
      var10 = var3[1] - var3[0];
      var3[1] = var10;
      var10 = var3[16] - var10;
      var3[16] = var10;
      var10 = var3[17] - var10;
      var3[17] = var10;
      var10 = var3[8] - var10;
      var3[8] = var10;
      var10 = var3[9] - var10;
      var3[9] = var10;
      var10 = var3[24] - var10;
      var3[24] = var10;
      var10 = var3[25] - var10;
      var3[25] = var10;
      var10 = var3[4] - var10;
      var3[4] = var10;
      var10 = var3[5] - var10;
      var3[5] = var10;
      var10 = var3[20] - var10;
      var3[20] = var10;
      var10 = var3[21] - var10;
      var3[21] = var10;
      var10 = var3[12] - var10;
      var3[12] = var10;
      var10 = var3[13] - var10;
      var3[13] = var10;
      var10 = var3[28] - var10;
      var3[28] = var10;
      var10 = var3[29] - var10;
      var3[29] = var10;
      var10 = var3[0];
      var3[0] += var3[31];
      var3[31] -= var10;
      var10 = var3[1];
      var3[1] += var3[30];
      var3[30] -= var10;
      var10 = var3[16];
      var3[16] += var3[15];
      var3[15] -= var10;
      var10 = var3[17];
      var3[17] += var3[14];
      var3[14] -= var10;
      var10 = var3[8];
      var3[8] += var3[23];
      var3[23] -= var10;
      var10 = var3[9];
      var3[9] += var3[22];
      var3[22] -= var10;
      var10 = var3[24];
      var3[24] += var3[7];
      var3[7] -= var10;
      var10 = var3[25];
      var3[25] += var3[6];
      var3[6] -= var10;
      var10 = var3[4];
      var3[4] += var3[27];
      var3[27] -= var10;
      var10 = var3[5];
      var3[5] += var3[26];
      var3[26] -= var10;
      var10 = var3[20];
      var3[20] += var3[11];
      var3[11] -= var10;
      var10 = var3[21];
      var3[21] += var3[10];
      var3[10] -= var10;
      var10 = var3[12];
      var3[12] += var3[19];
      var3[19] -= var10;
      var10 = var3[13];
      var3[13] += var3[18];
      var3[18] -= var10;
      var10 = var3[28];
      var3[28] += var3[3];
      var3[3] -= var10;
      var10 = var3[29];
      var3[29] += var3[2];
      var3[2] -= var10;
   }

   private void mdct_short(float[] var1, int var2) {
      for (int var3 = 0; var3 < 3; var3++) {
         float var7 = var1[var2 + 6] * win[2][0] - var1[var2 + 15];
         float var4 = var1[var2 + 0] * win[2][2] - var1[var2 + 9];
         float var5 = var7 + var4;
         float var6 = var7 - var4;
         var7 = var1[var2 + 15] * win[2][0] + var1[var2 + 6];
         var4 = var1[var2 + 9] * win[2][2] + var1[var2 + 0];
         float var8 = var7 + var4;
         float var9 = -var7 + var4;
         var4 = (var1[var2 + 3] * win[2][1] - var1[var2 + 12]) * 2.069978E-11F;
         var7 = (var1[var2 + 12] * win[2][1] + var1[var2 + 3]) * 2.069978E-11F;
         var1[var2 + 0] = var5 * 1.9075252E-11F + var4;
         var1[var2 + 15] = -var8 * 1.9075252E-11F + var7;
         var6 = var6 * 0.8660254F * 1.9075252E-11F;
         var8 = var8 * 0.5F * 1.9075252E-11F + var7;
         var1[var2 + 3] = var6 - var8;
         var1[var2 + 6] = var6 + var8;
         var5 = var5 * 0.5F * 1.9075252E-11F - var4;
         var9 = var9 * 0.8660254F * 1.9075252E-11F;
         var1[var2 + 9] = var5 + var9;
         var1[var2 + 12] = var5 - var9;
         var2++;
      }
   }

   final void mdct_long(float[] var1, int var2, float[] var3) {
      float var6 = var3[17] - var3[9];
      float var8 = var3[15] - var3[11];
      float var9 = var3[14] - var3[12];
      float var10 = var3[0] + var3[8];
      float var11 = var3[1] + var3[7];
      float var12 = var3[2] + var3[6];
      float var13 = var3[3] + var3[5];
      var1[var2 + 17] = var10 + var12 - var13 - (var11 - var3[4]);
      float var5 = (var10 + var12 - var13) * cx[19] + (var11 - var3[4]);
      float var4 = (var6 - var8 - var9) * cx[18];
      var1[var2 + 5] = var4 + var5;
      var1[var2 + 6] = var4 - var5;
      float var7 = (var3[16] - var3[10]) * cx[18];
      var11 = var11 * cx[19] + var3[4];
      var4 = var6 * cx[12] + var7 + var8 * cx[13] + var9 * cx[14];
      var5 = -var10 * cx[16] + var11 - var12 * cx[17] + var13 * cx[15];
      var1[var2 + 1] = var4 + var5;
      var1[var2 + 2] = var4 - var5;
      var4 = var6 * cx[13] - var7 - var8 * cx[14] + var9 * cx[12];
      var5 = -var10 * cx[17] + var11 - var12 * cx[15] + var13 * cx[16];
      var1[var2 + 9] = var4 + var5;
      var1[var2 + 10] = var4 - var5;
      var4 = var6 * cx[14] - var7 + var8 * cx[12] - var9 * cx[13];
      var5 = var10 * cx[15] - var11 + var12 * cx[16] - var13 * cx[17];
      var1[var2 + 13] = var4 + var5;
      var1[var2 + 14] = var4 - var5;
      var6 = var3[8] - var3[0];
      var8 = var3[6] - var3[2];
      var9 = var3[5] - var3[3];
      var10 = var3[17] + var3[9];
      var11 = var3[16] + var3[10];
      var12 = var3[15] + var3[11];
      var13 = var3[14] + var3[12];
      var1[var2 + 0] = var10 + var12 + var13 + (var11 + var3[13]);
      var4 = (var10 + var12 + var13) * cx[19] - (var11 + var3[13]);
      var5 = (var6 - var8 + var9) * cx[18];
      var1[var2 + 11] = var4 + var5;
      var1[var2 + 12] = var4 - var5;
      var7 = (var3[7] - var3[1]) * cx[18];
      var11 = var3[13] - var11 * cx[19];
      var4 = var10 * cx[15] - var11 + var12 * cx[16] + var13 * cx[17];
      var5 = var6 * cx[14] + var7 + var8 * cx[12] + var9 * cx[13];
      var1[var2 + 3] = var4 + var5;
      var1[var2 + 4] = var4 - var5;
      var4 = -var10 * cx[17] + var11 - var12 * cx[15] - var13 * cx[16];
      var5 = var6 * cx[13] + var7 - var8 * cx[14] - var9 * cx[12];
      var1[var2 + 7] = var4 + var5;
      var1[var2 + 8] = var4 - var5;
      var4 = -var10 * cx[16] + var11 - var12 * cx[17] - var13 * cx[15];
      var5 = var6 * cx[12] - var7 + var8 * cx[13] - var9 * cx[14];
      var1[var2 + 15] = var4 + var5;
      var1[var2 + 16] = var4 - var5;
   }

   public final void mdct_sub48(LameInternalFlags var1, float[] var2, float[] var3) {
      float[] var4 = var2;
      short var5 = 286;

      for (int var6 = 0; var6 < var1.channels_out; var6++) {
         for (int var7 = 0; var7 < var1.mode_gr; var7++) {
            GrInfo var9 = var1.l3_side.tt[var7][var6];
            float[] var10 = var9.xr;
            byte var11 = 0;
            float[][] var12 = var1.sb_sample[var6][1 - var7];
            byte var13 = 0;

            for (int var14 = 0; var14 < 9; var14++) {
               this.window_subband(var4, var5, var12[var13]);
               this.window_subband(var4, var5 + 32, var12[var13 + 1]);
               var13 += 2;
               var5 += 64;

               for (byte var8 = 1; var8 < 32; var8 += 2) {
                  var12[var13 - 1][var8] = var12[var13 - 1][var8] * -1.0F;
               }
            }

            for (int var22 = 0; var22 < 32; var11 += 18) {
               int var23 = var9.block_type;
               float[][] var15 = var1.sb_sample[var6][var7];
               float[][] var16 = var1.sb_sample[var6][1 - var7];
               if (var9.mixed_block_flag != 0 && var22 < 2) {
                  var23 = 0;
               }

               if (var1.amp_filter[var22] < 1.0E-12) {
                  Arrays.fill(var10, var11 + 0, var11 + 18, 0.0F);
               } else {
                  if (var1.amp_filter[var22] < 1.0) {
                     for (int var17 = 0; var17 < 18; var17++) {
                        var16[var17][order[var22]] = var16[var17][order[var22]] * var1.amp_filter[var22];
                     }
                  }

                  if (var23 == 2) {
                     for (int var25 = -3; var25 < 0; var25++) {
                        float var27 = win[2][var25 + 3];
                        var10[var11 + var25 * 3 + 9] = var15[9 + var25][order[var22]] * var27 - var15[8 - var25][order[var22]];
                        var10[var11 + var25 * 3 + 18] = var15[14 - var25][order[var22]] * var27 + var15[15 + var25][order[var22]];
                        var10[var11 + var25 * 3 + 10] = var15[15 + var25][order[var22]] * var27 - var15[14 - var25][order[var22]];
                        var10[var11 + var25 * 3 + 19] = var16[2 - var25][order[var22]] * var27 + var16[3 + var25][order[var22]];
                        var10[var11 + var25 * 3 + 11] = var16[3 + var25][order[var22]] * var27 - var16[2 - var25][order[var22]];
                        var10[var11 + var25 * 3 + 20] = var16[8 - var25][order[var22]] * var27 + var16[9 + var25][order[var22]];
                     }

                     this.mdct_short(var10, var11);
                  } else {
                     float[] var24 = new float[18];

                     for (int var18 = -9; var18 < 0; var18++) {
                        float var19 = win[var23][var18 + 27] * var16[var18 + 9][order[var22]] + win[var23][var18 + 36] * var16[8 - var18][order[var22]];
                        float var20 = win[var23][var18 + 9] * var15[var18 + 9][order[var22]] - win[var23][var18 + 18] * var15[8 - var18][order[var22]];
                        var24[var18 + 9] = var19 - var20 * tantab_l[3 + var18 + 9];
                        var24[var18 + 18] = var19 * tantab_l[3 + var18 + 9] + var20;
                     }

                     this.mdct_long(var10, var11, var24);
                  }
               }

               if (var23 != 2 && var22 != 0) {
                  for (int var26 = 7; var26 >= 0; var26--) {
                     float var28 = var10[var11 + var26] * ca[20 + var26] + var10[var11 + -1 - var26] * cs[28 + var26];
                     float var29 = var10[var11 + var26] * cs[28 + var26] - var10[var11 + -1 - var26] * ca[20 + var26];
                     var10[var11 + -1 - var26] = var28;
                     var10[var11 + var26] = var29;
                  }
               }

               var22++;
            }
         }

         var4 = var3;
         var5 = 286;
         if (var1.mode_gr == 1) {
            for (int var21 = 0; var21 < 18; var21++) {
               System.arraycopy(var1.sb_sample[var6][1][var21], 0, var1.sb_sample[var6][0][var21], 0, 32);
            }
         }
      }
   }
}
