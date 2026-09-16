package org.tritonus.share.sampled;

public class TConversionTool {
   private static final boolean ZEROTRAP = true;
   private static final short BIAS = 132;
   private static final int CLIP = 32635;
   private static final int[] exp_lut1 = new int[]{
      0,
      0,
      1,
      1,
      2,
      2,
      2,
      2,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      4,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      6,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7,
      7
   };
   private static final short[] u2l = new short[]{
      -32124,
      -31100,
      -30076,
      -29052,
      -28028,
      -27004,
      -25980,
      -24956,
      -23932,
      -22908,
      -21884,
      -20860,
      -19836,
      -18812,
      -17788,
      -16764,
      -15996,
      -15484,
      -14972,
      -14460,
      -13948,
      -13436,
      -12924,
      -12412,
      -11900,
      -11388,
      -10876,
      -10364,
      -9852,
      -9340,
      -8828,
      -8316,
      -7932,
      -7676,
      -7420,
      -7164,
      -6908,
      -6652,
      -6396,
      -6140,
      -5884,
      -5628,
      -5372,
      -5116,
      -4860,
      -4604,
      -4348,
      -4092,
      -3900,
      -3772,
      -3644,
      -3516,
      -3388,
      -3260,
      -3132,
      -3004,
      -2876,
      -2748,
      -2620,
      -2492,
      -2364,
      -2236,
      -2108,
      -1980,
      -1884,
      -1820,
      -1756,
      -1692,
      -1628,
      -1564,
      -1500,
      -1436,
      -1372,
      -1308,
      -1244,
      -1180,
      -1116,
      -1052,
      -988,
      -924,
      -876,
      -844,
      -812,
      -780,
      -748,
      -716,
      -684,
      -652,
      -620,
      -588,
      -556,
      -524,
      -492,
      -460,
      -428,
      -396,
      -372,
      -356,
      -340,
      -324,
      -308,
      -292,
      -276,
      -260,
      -244,
      -228,
      -212,
      -196,
      -180,
      -164,
      -148,
      -132,
      -120,
      -112,
      -104,
      -96,
      -88,
      -80,
      -72,
      -64,
      -56,
      -48,
      -40,
      -32,
      -24,
      -16,
      -8,
      0,
      32124,
      31100,
      30076,
      29052,
      28028,
      27004,
      25980,
      24956,
      23932,
      22908,
      21884,
      20860,
      19836,
      18812,
      17788,
      16764,
      15996,
      15484,
      14972,
      14460,
      13948,
      13436,
      12924,
      12412,
      11900,
      11388,
      10876,
      10364,
      9852,
      9340,
      8828,
      8316,
      7932,
      7676,
      7420,
      7164,
      6908,
      6652,
      6396,
      6140,
      5884,
      5628,
      5372,
      5116,
      4860,
      4604,
      4348,
      4092,
      3900,
      3772,
      3644,
      3516,
      3388,
      3260,
      3132,
      3004,
      2876,
      2748,
      2620,
      2492,
      2364,
      2236,
      2108,
      1980,
      1884,
      1820,
      1756,
      1692,
      1628,
      1564,
      1500,
      1436,
      1372,
      1308,
      1244,
      1180,
      1116,
      1052,
      988,
      924,
      876,
      844,
      812,
      780,
      748,
      716,
      684,
      652,
      620,
      588,
      556,
      524,
      492,
      460,
      428,
      396,
      372,
      356,
      340,
      324,
      308,
      292,
      276,
      260,
      244,
      228,
      212,
      196,
      180,
      164,
      148,
      132,
      120,
      112,
      104,
      96,
      88,
      80,
      72,
      64,
      56,
      48,
      40,
      32,
      24,
      16,
      8,
      0
   };
   private static final byte QUANT_MASK = 15;
   private static final byte SEG_SHIFT = 4;
   private static final short[] seg_end = new short[]{255, 511, 1023, 2047, 4095, 8191, 16383, 32767};
   private static final short[] a2l = new short[]{
      -5504,
      -5248,
      -6016,
      -5760,
      -4480,
      -4224,
      -4992,
      -4736,
      -7552,
      -7296,
      -8064,
      -7808,
      -6528,
      -6272,
      -7040,
      -6784,
      -2752,
      -2624,
      -3008,
      -2880,
      -2240,
      -2112,
      -2496,
      -2368,
      -3776,
      -3648,
      -4032,
      -3904,
      -3264,
      -3136,
      -3520,
      -3392,
      -22016,
      -20992,
      -24064,
      -23040,
      -17920,
      -16896,
      -19968,
      -18944,
      -30208,
      -29184,
      -32256,
      -31232,
      -26112,
      -25088,
      -28160,
      -27136,
      -11008,
      -10496,
      -12032,
      -11520,
      -8960,
      -8448,
      -9984,
      -9472,
      -15104,
      -14592,
      -16128,
      -15616,
      -13056,
      -12544,
      -14080,
      -13568,
      -344,
      -328,
      -376,
      -360,
      -280,
      -264,
      -312,
      -296,
      -472,
      -456,
      -504,
      -488,
      -408,
      -392,
      -440,
      -424,
      -88,
      -72,
      -120,
      -104,
      -24,
      -8,
      -56,
      -40,
      -216,
      -200,
      -248,
      -232,
      -152,
      -136,
      -184,
      -168,
      -1376,
      -1312,
      -1504,
      -1440,
      -1120,
      -1056,
      -1248,
      -1184,
      -1888,
      -1824,
      -2016,
      -1952,
      -1632,
      -1568,
      -1760,
      -1696,
      -688,
      -656,
      -752,
      -720,
      -560,
      -528,
      -624,
      -592,
      -944,
      -912,
      -1008,
      -976,
      -816,
      -784,
      -880,
      -848,
      5504,
      5248,
      6016,
      5760,
      4480,
      4224,
      4992,
      4736,
      7552,
      7296,
      8064,
      7808,
      6528,
      6272,
      7040,
      6784,
      2752,
      2624,
      3008,
      2880,
      2240,
      2112,
      2496,
      2368,
      3776,
      3648,
      4032,
      3904,
      3264,
      3136,
      3520,
      3392,
      22016,
      20992,
      24064,
      23040,
      17920,
      16896,
      19968,
      18944,
      30208,
      29184,
      32256,
      31232,
      26112,
      25088,
      28160,
      27136,
      11008,
      10496,
      12032,
      11520,
      8960,
      8448,
      9984,
      9472,
      15104,
      14592,
      16128,
      15616,
      13056,
      12544,
      14080,
      13568,
      344,
      328,
      376,
      360,
      280,
      264,
      312,
      296,
      472,
      456,
      504,
      488,
      408,
      392,
      440,
      424,
      88,
      72,
      120,
      104,
      24,
      8,
      56,
      40,
      216,
      200,
      248,
      232,
      152,
      136,
      184,
      168,
      1376,
      1312,
      1504,
      1440,
      1120,
      1056,
      1248,
      1184,
      1888,
      1824,
      2016,
      1952,
      1632,
      1568,
      1760,
      1696,
      688,
      656,
      752,
      720,
      560,
      528,
      624,
      592,
      944,
      912,
      1008,
      976,
      816,
      784,
      880,
      848
   };
   private static final byte[] u2a = new byte[]{
      -86,
      -85,
      -88,
      -87,
      -82,
      -81,
      -84,
      -83,
      -94,
      -93,
      -96,
      -95,
      -90,
      -89,
      -92,
      -91,
      -70,
      -69,
      -72,
      -71,
      -66,
      -65,
      -68,
      -67,
      -78,
      -77,
      -80,
      -79,
      -74,
      -73,
      -76,
      -75,
      -118,
      -117,
      -120,
      -119,
      -114,
      -113,
      -116,
      -115,
      -126,
      -125,
      -128,
      -127,
      -122,
      -121,
      -124,
      -123,
      -101,
      -104,
      -103,
      -98,
      -97,
      -100,
      -99,
      -110,
      -109,
      -112,
      -111,
      -106,
      -105,
      -108,
      -107,
      -22,
      -24,
      -23,
      -18,
      -17,
      -20,
      -19,
      -30,
      -29,
      -32,
      -31,
      -26,
      -25,
      -28,
      -27,
      -6,
      -8,
      -2,
      -1,
      -4,
      -3,
      -14,
      -13,
      -16,
      -15,
      -10,
      -9,
      -12,
      -11,
      -53,
      -55,
      -49,
      -51,
      -62,
      -61,
      -64,
      -63,
      -58,
      -57,
      -60,
      -59,
      -38,
      -37,
      -40,
      -39,
      -34,
      -33,
      -36,
      -35,
      -46,
      -46,
      -45,
      -45,
      -48,
      -48,
      -47,
      -47,
      -42,
      -42,
      -41,
      -41,
      -44,
      -44,
      -43,
      -43,
      42,
      43,
      40,
      41,
      46,
      47,
      44,
      45,
      34,
      35,
      32,
      33,
      38,
      39,
      36,
      37,
      58,
      59,
      56,
      57,
      62,
      63,
      60,
      61,
      50,
      51,
      48,
      49,
      54,
      55,
      52,
      53,
      10,
      11,
      8,
      9,
      14,
      15,
      12,
      13,
      2,
      3,
      0,
      1,
      6,
      7,
      4,
      5,
      27,
      24,
      25,
      30,
      31,
      28,
      29,
      18,
      19,
      16,
      17,
      22,
      23,
      20,
      21,
      106,
      104,
      105,
      110,
      111,
      108,
      109,
      98,
      99,
      96,
      97,
      102,
      103,
      100,
      101,
      122,
      120,
      126,
      127,
      124,
      125,
      114,
      115,
      112,
      113,
      118,
      119,
      116,
      117,
      75,
      73,
      79,
      77,
      66,
      67,
      64,
      65,
      70,
      71,
      68,
      69,
      90,
      91,
      88,
      89,
      94,
      95,
      92,
      93,
      82,
      82,
      83,
      83,
      80,
      80,
      81,
      81,
      86,
      86,
      87,
      87,
      84,
      84,
      85,
      85
   };
   private static final byte[] a2u = new byte[]{
      -86,
      -85,
      -88,
      -87,
      -82,
      -81,
      -84,
      -83,
      -94,
      -93,
      -96,
      -95,
      -90,
      -89,
      -92,
      -91,
      -71,
      -70,
      -73,
      -72,
      -67,
      -66,
      -69,
      -68,
      -79,
      -78,
      -80,
      -80,
      -75,
      -74,
      -77,
      -76,
      -118,
      -117,
      -120,
      -119,
      -114,
      -113,
      -116,
      -115,
      -126,
      -125,
      -128,
      -127,
      -122,
      -121,
      -124,
      -123,
      -102,
      -101,
      -104,
      -103,
      -98,
      -97,
      -100,
      -99,
      -110,
      -109,
      -112,
      -111,
      -106,
      -105,
      -108,
      -107,
      -30,
      -29,
      -32,
      -31,
      -26,
      -25,
      -28,
      -27,
      -35,
      -35,
      -36,
      -36,
      -33,
      -33,
      -34,
      -34,
      -12,
      -10,
      -16,
      -14,
      -4,
      -2,
      -8,
      -6,
      -22,
      -21,
      -24,
      -23,
      -18,
      -17,
      -20,
      -19,
      -56,
      -55,
      -58,
      -57,
      -52,
      -51,
      -54,
      -53,
      -64,
      -63,
      -65,
      -65,
      -60,
      -59,
      -62,
      -61,
      -42,
      -41,
      -44,
      -43,
      -38,
      -37,
      -40,
      -39,
      -49,
      -49,
      -50,
      -50,
      -46,
      -45,
      -48,
      -47,
      42,
      43,
      40,
      41,
      46,
      47,
      44,
      45,
      34,
      35,
      32,
      33,
      38,
      39,
      36,
      37,
      57,
      58,
      55,
      56,
      61,
      62,
      59,
      60,
      49,
      50,
      48,
      48,
      53,
      54,
      51,
      52,
      10,
      11,
      8,
      9,
      14,
      15,
      12,
      13,
      2,
      3,
      0,
      1,
      6,
      7,
      4,
      5,
      26,
      27,
      24,
      25,
      30,
      31,
      28,
      29,
      18,
      19,
      16,
      17,
      22,
      23,
      20,
      21,
      98,
      99,
      96,
      97,
      102,
      103,
      100,
      101,
      93,
      93,
      92,
      92,
      95,
      95,
      94,
      94,
      116,
      118,
      112,
      114,
      124,
      126,
      120,
      122,
      106,
      107,
      104,
      105,
      110,
      111,
      108,
      109,
      72,
      73,
      70,
      71,
      76,
      77,
      74,
      75,
      64,
      65,
      63,
      63,
      68,
      69,
      66,
      67,
      86,
      87,
      84,
      85,
      90,
      91,
      88,
      89,
      79,
      79,
      78,
      78,
      82,
      83,
      80,
      81
   };

   public static void convertSign8(byte[] var0, int var1, int var2) {
      var2 += var1;

      for (int var3 = var1; var3 < var2; var3++) {
         var0[var3] = (byte)(var0[var3] + 128);
      }
   }

   public static void swapOrder16(byte[] var0, int var1, int var2) {
      int var3 = var2 * 2 + var1 - 1;
      int var4 = var1;

      while (var4 < var3) {
         byte var5 = var0[var4];
         var0[var4++] = var0[var4];
         var0[var4++] = var5;
      }
   }

   public static void swapOrder24(byte[] var0, int var1, int var2) {
      int var3 = var2 * 3 + var1 - 2;

      for (int var4 = var1; var4 < var3; var4++) {
         byte var5 = var0[var4];
         var0[var4++] = var0[var4 + 1];
         var0[++var4] = var5;
      }
   }

   public static void swapOrder32(byte[] var0, int var1, int var2) {
      int var3 = var2 * 4 + var1 - 3;

      for (int var4 = var1; var4 < var3; var4++) {
         byte var5 = var0[var4];
         var0[var4] = var0[var4 + 3];
         var0[var4 + 3] = var5;
         var5 = var0[++var4];
         var0[var4++] = var0[var4];
         var0[var4++] = var5;
      }
   }

   public static void convertSign8(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      while (var4 > 0) {
         var2[var3++] = (byte)(var0[var1++] + 128);
         var4--;
      }
   }

   public static void swapOrder16(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      while (var4 > 0) {
         var2[var3++] = var0[var1 + 1];
         var2[var3++] = var0[var1++];
         var1++;
         var4--;
      }
   }

   public static void swapOrder24(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      while (var4 > 0) {
         var2[var3++] = var0[var1 + 2];
         int var9 = ++var3;
         var3++;
         var2[var9] = var0[var1++];
         var1++;
         var1++;
         var4--;
      }
   }

   public static void swapOrder32(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      while (var4 > 0) {
         var2[var3++] = var0[var1 + 3];
         var2[var3++] = var0[var1 + 2];
         var2[var3++] = var0[var1 + 1];
         var2[var3++] = var0[var1++];
         var1++;
         var1++;
         var1++;
         var4--;
      }
   }

   public static short bytesToShort16(byte var0, byte var1) {
      return (short)(var0 << 8 | var1 & 0xFF);
   }

   public static short bytesToShort16(byte[] var0, int var1, boolean var2) {
      return var2 ? (short)(var0[var1] << 8 | var0[var1 + 1] & 0xFF) : (short)(var0[var1 + 1] << 8 | var0[var1] & 0xFF);
   }

   public static int bytesToInt16(byte var0, byte var1) {
      return var0 << 8 | var1 & 0xFF;
   }

   public static int bytesToInt16(byte[] var0, int var1, boolean var2) {
      return var2 ? var0[var1] << 8 | var0[var1 + 1] & 0xFF : var0[var1 + 1] << 8 | var0[var1] & 0xFF;
   }

   public static int bytesToInt24(byte[] var0, int var1, boolean var2) {
      return var2
         ? var0[var1] << 16 | (var0[var1 + 1] & 0xFF) << 8 | var0[var1 + 2] & 0xFF
         : var0[var1 + 2] << 16 | (var0[var1 + 1] & 0xFF) << 8 | var0[var1] & 0xFF;
   }

   public static int bytesToInt32(byte[] var0, int var1, boolean var2) {
      return var2
         ? var0[var1] << 24 | (var0[var1 + 1] & 0xFF) << 16 | (var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF
         : var0[var1 + 3] << 24 | (var0[var1 + 2] & 0xFF) << 16 | (var0[var1 + 1] & 0xFF) << 8 | var0[var1] & 0xFF;
   }

   public static void shortToBytes16(short var0, byte[] var1, int var2, boolean var3) {
      intToBytes16(var0, var1, var2, var3);
   }

   public static void intToBytes16(int var0, byte[] var1, int var2, boolean var3) {
      if (var3) {
         var1[var2++] = (byte)(var0 >> 8);
         var1[var2] = (byte)(var0 & 0xFF);
      } else {
         var1[var2++] = (byte)(var0 & 0xFF);
         var1[var2] = (byte)(var0 >> 8);
      }
   }

   public static void intToBytes24(int var0, byte[] var1, int var2, boolean var3) {
      if (var3) {
         var1[var2++] = (byte)(var0 >> 16);
         var1[var2++] = (byte)(var0 >>> 8 & 0xFF);
         var1[var2] = (byte)(var0 & 0xFF);
      } else {
         var1[var2++] = (byte)(var0 & 0xFF);
         var1[var2++] = (byte)(var0 >>> 8 & 0xFF);
         var1[var2] = (byte)(var0 >> 16);
      }
   }

   public static void intToBytes32(int var0, byte[] var1, int var2, boolean var3) {
      if (var3) {
         var1[var2++] = (byte)(var0 >> 24);
         var1[var2++] = (byte)(var0 >>> 16 & 0xFF);
         var1[var2++] = (byte)(var0 >>> 8 & 0xFF);
         var1[var2] = (byte)(var0 & 0xFF);
      } else {
         var1[var2++] = (byte)(var0 & 0xFF);
         var1[var2++] = (byte)(var0 >>> 8 & 0xFF);
         var1[var2++] = (byte)(var0 >>> 16 & 0xFF);
         var1[var2] = (byte)(var0 >> 24);
      }
   }

   public static byte linear2ulaw(int var0) {
      if (var0 > 32767) {
         var0 = 32767;
      } else if (var0 < -32768) {
         var0 = -32768;
      }

      int var1 = var0 >> 8 & 128;
      if (var1 != 0) {
         var0 = -var0;
      }

      if (var0 > 32635) {
         var0 = 32635;
      }

      var0 += 132;
      int var2 = exp_lut1[var0 >> 7 & 0xFF];
      int var3 = var0 >> var2 + 3 & 15;
      int var4 = ~(var1 | var2 << 4 | var3);
      if (var4 == 0) {
         var4 = 2;
      }

      return (byte)var4;
   }

   public static short ulaw2linear(byte var0) {
      return u2l[var0 & 0xFF];
   }

   public static void pcm162ulaw(byte[] var0, int var1, int var2, boolean var3) {
      int var4 = var1;
      int var5 = var4;
      if (var3) {
         while (var2 > 0) {
            var0[var5++] = linear2ulaw(bytesToInt16(var0[var4], var0[var4 + 1]));
            var4++;
            var4++;
            var2--;
         }
      } else {
         while (var2 > 0) {
            var0[var5++] = linear2ulaw(bytesToInt16(var0[var4 + 1], var0[var4]));
            var4++;
            var4++;
            var2--;
         }
      }
   }

   public static void pcm162ulaw(byte[] var0, int var1, byte[] var2, int var3, int var4, boolean var5) {
      int var6 = var1;
      int var7 = var3;
      if (var5) {
         while (var4 > 0) {
            var2[var7++] = linear2ulaw(bytesToInt16(var0[var6], var0[var6 + 1]));
            var6++;
            var6++;
            var4--;
         }
      } else {
         while (var4 > 0) {
            var2[var7++] = linear2ulaw(bytesToInt16(var0[var6 + 1], var0[var6]));
            var6++;
            var6++;
            var4--;
         }
      }
   }

   public static void pcm82ulaw(byte[] var0, int var1, int var2, boolean var3) {
      var2 += var1;
      if (var3) {
         for (int var4 = var1; var4 < var2; var4++) {
            var0[var4] = linear2ulaw(var0[var4] << 8);
         }
      } else {
         for (int var6 = var1; var6 < var2; var6++) {
            var0[var6] = linear2ulaw((byte)(var0[var6] + 128) << 8);
         }
      }
   }

   public static void pcm82ulaw(byte[] var0, int var1, byte[] var2, int var3, int var4, boolean var5) {
      int var6 = var3;
      int var7 = var1;
      if (var5) {
         while (var4 > 0) {
            var2[var6++] = linear2ulaw(var0[var7++] << 8);
            var4--;
         }
      } else {
         while (var4 > 0) {
            var2[var6++] = linear2ulaw((byte)(var0[var7++] + 128) << 8);
            var4--;
         }
      }
   }

   public static void ulaw2pcm16(byte[] var0, int var1, byte[] var2, int var3, int var4, boolean var5) {
      int var6 = var3;
      int var7 = var1;

      while (var4 > 0) {
         intToBytes16(u2l[var0[var7++] & 0xFF], var2, var6++, var5);
         var6++;
         var4--;
      }
   }

   public static void ulaw2pcm8(byte[] var0, int var1, int var2, boolean var3) {
      var2 += var1;
      if (var3) {
         for (int var4 = var1; var4 < var2; var4++) {
            var0[var4] = (byte)(u2l[var0[var4] & 0xFF] >> 8 & 0xFF);
         }
      } else {
         for (int var6 = var1; var6 < var2; var6++) {
            var0[var6] = (byte)((u2l[var0[var6] & 0xFF] >> 8) + 128);
         }
      }
   }

   public static void ulaw2pcm8(byte[] var0, int var1, byte[] var2, int var3, int var4, boolean var5) {
      int var6 = var1;
      int var7 = var3;
      if (var5) {
         while (var4 > 0) {
            var2[var7++] = (byte)(u2l[var0[var6++] & 0xFF] >> 8 & 0xFF);
            var4--;
         }
      } else {
         while (var4 > 0) {
            var2[var7++] = (byte)((u2l[var0[var6++] & 0xFF] >> 8) + 128);
            var4--;
         }
      }
   }

   public static byte linear2alaw(short var0) {
      byte var2 = 8;
      byte var1;
      if (var0 >= 0) {
         var1 = -43;
      } else {
         var1 = 85;
         var0 = (short)(-var0 - 8);
      }

      for (int var4 = 0; var4 < 8; var4++) {
         if (var0 <= seg_end[var4]) {
            var2 = (byte)var4;
            break;
         }
      }

      if (var2 >= 8) {
         return (byte)((127 ^ var1) & 0xFF);
      }

      byte var3 = (byte)(var2 << 4);
      if (var2 < 2) {
         var3 = (byte)(var3 | var0 >> 4 & 15);
      } else {
         var3 = (byte)(var3 | var0 >> var2 + 3 & 15);
      }

      return (byte)((var3 ^ var1) & 0xFF);
   }

   public static short alaw2linear(byte var0) {
      return a2l[var0 & 0xFF];
   }

   public static void pcm162alaw(byte[] var0, int var1, int var2, boolean var3) {
      int var4 = var1;
      int var5 = var4;
      if (var3) {
         while (var2 > 0) {
            var0[var5++] = linear2alaw(bytesToShort16(var0[var4], var0[var4 + 1]));
            var4++;
            var4++;
            var2--;
         }
      } else {
         while (var2 > 0) {
            var0[var5++] = linear2alaw(bytesToShort16(var0[var4 + 1], var0[var4]));
            var4++;
            var4++;
            var2--;
         }
      }
   }

   public static void pcm162alaw(byte[] var0, int var1, byte[] var2, int var3, int var4, boolean var5) {
      int var6 = var1;
      int var7 = var3;
      if (var5) {
         while (var4 > 0) {
            var2[var7++] = linear2alaw(bytesToShort16(var0[var6], var0[var6 + 1]));
            var6++;
            var6++;
            var4--;
         }
      } else {
         while (var4 > 0) {
            var2[var7++] = linear2alaw(bytesToShort16(var0[var6 + 1], var0[var6]));
            var6++;
            var6++;
            var4--;
         }
      }
   }

   public static void pcm82alaw(byte[] var0, int var1, int var2, boolean var3) {
      var2 += var1;
      if (var3) {
         for (int var4 = var1; var4 < var2; var4++) {
            var0[var4] = linear2alaw((short)(var0[var4] << 8));
         }
      } else {
         for (int var6 = var1; var6 < var2; var6++) {
            var0[var6] = linear2alaw((short)((byte)(var0[var6] + 128) << 8));
         }
      }
   }

   public static void pcm82alaw(byte[] var0, int var1, byte[] var2, int var3, int var4, boolean var5) {
      int var6 = var3;
      int var7 = var1;
      if (var5) {
         while (var4 > 0) {
            var2[var6++] = linear2alaw((short)(var0[var7++] << 8));
            var4--;
         }
      } else {
         while (var4 > 0) {
            var2[var6++] = linear2alaw((short)((byte)(var0[var7++] + 128) << 8));
            var4--;
         }
      }
   }

   public static void alaw2pcm8(byte[] var0, int var1, int var2, boolean var3) {
      var2 += var1;
      if (var3) {
         for (int var4 = var1; var4 < var2; var4++) {
            var0[var4] = (byte)(a2l[var0[var4] & 0xFF] >> 8 & 0xFF);
         }
      } else {
         for (int var6 = var1; var6 < var2; var6++) {
            var0[var6] = (byte)((a2l[var0[var6] & 0xFF] >> 8) + 128);
         }
      }
   }

   public static void alaw2pcm8(byte[] var0, int var1, byte[] var2, int var3, int var4, boolean var5) {
      int var6 = var1;
      int var7 = var3;
      if (var5) {
         while (var4 > 0) {
            var2[var7++] = (byte)(a2l[var0[var6++] & 0xFF] >> 8 & 0xFF);
            var4--;
         }
      } else {
         while (var4 > 0) {
            var2[var7++] = (byte)((a2l[var0[var6++] & 0xFF] >> 8) + 128);
            var4--;
         }
      }
   }

   public static void alaw2pcm16(byte[] var0, int var1, byte[] var2, int var3, int var4, boolean var5) {
      int var6 = var3;
      int var7 = var1;

      while (var4 > 0) {
         intToBytes16(a2l[var0[var7++] & 0xFF], var2, var6++, var5);
         var6++;
         var4--;
      }
   }

   public static byte ulaw2alaw(byte var0) {
      return u2a[var0 & 0xFF];
   }

   public static void ulaw2alaw(byte[] var0, int var1, int var2) {
      var2 += var1;

      for (int var3 = var1; var3 < var2; var3++) {
         var0[var3] = u2a[var0[var3] & 0xFF];
      }
   }

   public static void ulaw2alaw(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      int var5 = var3;
      int var6 = var1;

      while (var4 > 0) {
         var2[var6++] = u2a[var0[var5++] & 0xFF];
         var4--;
      }
   }

   public static byte alaw2ulaw(byte var0) {
      return a2u[var0 & 0xFF];
   }

   public static void alaw2ulaw(byte[] var0, int var1, int var2) {
      var2 += var1;

      for (int var3 = var1; var3 < var2; var3++) {
         var0[var3] = a2u[var0[var3] & 0xFF];
      }
   }

   public static void alaw2ulaw(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      int var5 = var3;
      int var6 = var1;

      while (var4 > 0) {
         var2[var5++] = a2u[var0[var6++] & 0xFF];
         var4--;
      }
   }

   public static void changeOrderOrSign(byte[] var0, int var1, int var2, int var3) {
      switch (var3) {
         case 1:
            convertSign8(var0, var1, var2);
            break;
         case 2:
            swapOrder16(var0, var1, var2 / 2);
            break;
         case 3:
            swapOrder24(var0, var1, var2 / 3);
            break;
         case 4:
            swapOrder32(var0, var1, var2 / 4);
      }
   }

   public static void changeOrderOrSign(byte[] var0, int var1, byte[] var2, int var3, int var4, int var5) {
      switch (var5) {
         case 1:
            convertSign8(var0, var1, var2, var3, var4);
            break;
         case 2:
            swapOrder16(var0, var1, var2, var3, var4 / 2);
            break;
         case 3:
            swapOrder24(var0, var1, var2, var3, var4 / 3);
            break;
         case 4:
            swapOrder32(var0, var1, var2, var3, var4 / 4);
      }
   }
}
