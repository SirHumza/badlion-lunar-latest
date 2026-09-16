package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

public class Base64 {
   public static final int DEFAULT = 0;
   public static final int NO_PADDING = 1;
   public static final int NO_WRAP = 2;
   public static final int CRLF = 4;
   public static final int URL_SAFE = 8;
   public static final int NO_CLOSE = 16;

   public static byte[] decode(String var0, int var1) {
      return decode(var0.getBytes(), var1);
   }

   public static byte[] decode(byte[] var0, int var1) {
      return decode(var0, 0, var0.length, var1);
   }

   public static byte[] decode(byte[] var0, int var1, int var2, int var3) {
      Base64.Decoder var4 = new Base64.Decoder(var3, new byte[var2 * 3 / 4]);
      if (!var4.process(var0, var1, var2, true)) {
         throw new IllegalArgumentException("bad base-64");
      }

      if (var4.op == var4.output.length) {
         return var4.output;
      }

      byte[] var5 = new byte[var4.op];
      System.arraycopy(var4.output, 0, var5, 0, var4.op);
      return var5;
   }

   public static String encodeToString(byte[] var0, int var1) {
      try {
         return new String(encode(var0, var1), "US-ASCII");
      } catch (UnsupportedEncodingException var3) {
         throw new AssertionError(var3);
      }
   }

   public static String encodeToString(byte[] var0, int var1, int var2, int var3) {
      try {
         return new String(encode(var0, var1, var2, var3), "US-ASCII");
      } catch (UnsupportedEncodingException var5) {
         throw new AssertionError(var5);
      }
   }

   public static byte[] encode(byte[] var0, int var1) {
      return encode(var0, 0, var0.length, var1);
   }

   public static byte[] encode(byte[] var0, int var1, int var2, int var3) {
      Base64.Encoder var4 = new Base64.Encoder(var3, null);
      int var5 = var2 / 3 * 4;
      if (var4.do_padding) {
         if (var2 % 3 > 0) {
            var5 += 4;
         }
      } else {
         switch (var2 % 3) {
            case 0:
            default:
               break;
            case 1:
               var5 += 2;
               break;
            case 2:
               var5 += 3;
         }
      }

      if (var4.do_newline && var2 > 0) {
         var5 += ((var2 - 1) / 57 + 1) * (var4.do_cr ? 2 : 1);
      }

      var4.output = new byte[var5];
      var4.process(var0, var1, var2, true);
      assert var4.op == var5;
      return var4.output;
   }

   private Base64() {
   }

   abstract static class Coder {
      public byte[] output;
      public int op;

      public abstract boolean process(byte[] var1, int var2, int var3, boolean var4);

      public abstract int maxOutputSize(int var1);
   }

   static class Decoder extends Base64.Coder {
      private static final int[] DECODE = new int[]{
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         62,
         -1,
         -1,
         -1,
         63,
         52,
         53,
         54,
         55,
         56,
         57,
         58,
         59,
         60,
         61,
         -1,
         -1,
         -1,
         -2,
         -1,
         -1,
         -1,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         40,
         41,
         42,
         43,
         44,
         45,
         46,
         47,
         48,
         49,
         50,
         51,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1
      };
      private static final int[] DECODE_WEBSAFE = new int[]{
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         62,
         -1,
         -1,
         52,
         53,
         54,
         55,
         56,
         57,
         58,
         59,
         60,
         61,
         -1,
         -1,
         -1,
         -2,
         -1,
         -1,
         -1,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         -1,
         -1,
         -1,
         -1,
         63,
         -1,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         40,
         41,
         42,
         43,
         44,
         45,
         46,
         47,
         48,
         49,
         50,
         51,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1
      };
      private static final int SKIP = -1;
      private static final int EQUALS = -2;
      private int state;
      private int value;
      private final int[] alphabet;

      public Decoder(int var1, byte[] var2) {
         this.output = var2;
         this.alphabet = (var1 & 8) == 0 ? DECODE : DECODE_WEBSAFE;
         this.state = 0;
         this.value = 0;
      }

      @Override
      public int maxOutputSize(int var1) {
         return var1 * 3 / 4 + 10;
      }

      @Override
      public boolean process(byte[] var1, int var2, int var3, boolean var4) {
         if (this.state == 6) {
            return false;
         }

         int var5 = var2;
         var3 += var2;
         int var6 = this.state;
         int var7 = this.value;
         int var8 = 0;
         byte[] var9 = this.output;
         int[] var10 = this.alphabet;

         while (var5 < var3) {
            if (var6 == 0) {
               while (
                  var5 + 4 <= var3
                     && (
                           var7 = var10[var1[var5] & 0xFF] << 18
                              | var10[var1[var5 + 1] & 0xFF] << 12
                              | var10[var1[var5 + 2] & 0xFF] << 6
                              | var10[var1[var5 + 3] & 0xFF]
                        )
                        >= 0
               ) {
                  var9[var8 + 2] = (byte)var7;
                  var9[var8 + 1] = (byte)(var7 >> 8);
                  var9[var8] = (byte)(var7 >> 16);
                  var8 += 3;
                  var5 += 4;
               }

               if (var5 >= var3) {
                  break;
               }
            }

            int var11 = var10[var1[var5++] & 0xFF];
            switch (var6) {
               case 0:
                  if (var11 >= 0) {
                     var7 = var11;
                     var6++;
                  } else if (var11 != -1) {
                     this.state = 6;
                     return false;
                  }
                  break;
               case 1:
                  if (var11 >= 0) {
                     var7 = var7 << 6 | var11;
                     var6++;
                  } else if (var11 != -1) {
                     this.state = 6;
                     return false;
                  }
                  break;
               case 2:
                  if (var11 >= 0) {
                     var7 = var7 << 6 | var11;
                     var6++;
                  } else if (var11 == -2) {
                     var9[var8++] = (byte)(var7 >> 4);
                     var6 = 4;
                  } else if (var11 != -1) {
                     this.state = 6;
                     return false;
                  }
                  break;
               case 3:
                  if (var11 >= 0) {
                     var7 = var7 << 6 | var11;
                     var9[var8 + 2] = (byte)var7;
                     var9[var8 + 1] = (byte)(var7 >> 8);
                     var9[var8] = (byte)(var7 >> 16);
                     var8 += 3;
                     var6 = 0;
                  } else if (var11 == -2) {
                     var9[var8 + 1] = (byte)(var7 >> 2);
                     var9[var8] = (byte)(var7 >> 10);
                     var8 += 2;
                     var6 = 5;
                  } else if (var11 != -1) {
                     this.state = 6;
                     return false;
                  }
                  break;
               case 4:
                  if (var11 == -2) {
                     var6++;
                  } else if (var11 != -1) {
                     this.state = 6;
                     return false;
                  }
                  break;
               case 5:
                  if (var11 != -1) {
                     this.state = 6;
                     return false;
                  }
            }
         }

         if (!var4) {
            this.state = var6;
            this.value = var7;
            this.op = var8;
            return true;
         }

         switch (var6) {
            case 0:
            case 5:
            default:
               break;
            case 1:
               this.state = 6;
               return false;
            case 2:
               var9[var8++] = (byte)(var7 >> 4);
               break;
            case 3:
               var9[var8++] = (byte)(var7 >> 10);
               var9[var8++] = (byte)(var7 >> 2);
               break;
            case 4:
               this.state = 6;
               return false;
         }

         this.state = var6;
         this.op = var8;
         return true;
      }
   }

   static class Encoder extends Base64.Coder {
      public static final int LINE_GROUPS = 19;
      private static final byte[] ENCODE = new byte[]{
         65,
         66,
         67,
         68,
         69,
         70,
         71,
         72,
         73,
         74,
         75,
         76,
         77,
         78,
         79,
         80,
         81,
         82,
         83,
         84,
         85,
         86,
         87,
         88,
         89,
         90,
         97,
         98,
         99,
         100,
         101,
         102,
         103,
         104,
         105,
         106,
         107,
         108,
         109,
         110,
         111,
         112,
         113,
         114,
         115,
         116,
         117,
         118,
         119,
         120,
         121,
         122,
         48,
         49,
         50,
         51,
         52,
         53,
         54,
         55,
         56,
         57,
         43,
         47
      };
      private static final byte[] ENCODE_WEBSAFE = new byte[]{
         65,
         66,
         67,
         68,
         69,
         70,
         71,
         72,
         73,
         74,
         75,
         76,
         77,
         78,
         79,
         80,
         81,
         82,
         83,
         84,
         85,
         86,
         87,
         88,
         89,
         90,
         97,
         98,
         99,
         100,
         101,
         102,
         103,
         104,
         105,
         106,
         107,
         108,
         109,
         110,
         111,
         112,
         113,
         114,
         115,
         116,
         117,
         118,
         119,
         120,
         121,
         122,
         48,
         49,
         50,
         51,
         52,
         53,
         54,
         55,
         56,
         57,
         45,
         95
      };
      private final byte[] tail;
      int tailLen;
      private int count;
      public final boolean do_padding;
      public final boolean do_newline;
      public final boolean do_cr;
      private final byte[] alphabet;

      public Encoder(int var1, byte[] var2) {
         this.output = var2;
         this.do_padding = (var1 & 1) == 0;
         this.do_newline = (var1 & 2) == 0;
         this.do_cr = (var1 & 4) != 0;
         this.alphabet = (var1 & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
         this.tail = new byte[2];
         this.tailLen = 0;
         this.count = this.do_newline ? 19 : -1;
      }

      @Override
      public int maxOutputSize(int var1) {
         return var1 * 8 / 5 + 10;
      }

      @Override
      public boolean process(byte[] var1, int var2, int var3, boolean var4) {
         byte[] var5 = this.alphabet;
         byte[] var6 = this.output;
         int var7 = 0;
         int var8 = this.count;
         int var9 = var2;
         var3 += var2;
         int var10 = -1;
         switch (this.tailLen) {
            case 0:
            default:
               break;
            case 1:
               if (var9 + 2 <= var3) {
                  var10 = (this.tail[0] & 255) << 16 | (var1[var9++] & 255) << 8 | var1[var9++] & 255;
                  this.tailLen = 0;
               }
               break;
            case 2:
               if (var9 + 1 <= var3) {
                  var10 = (this.tail[0] & 255) << 16 | (this.tail[1] & 255) << 8 | var1[var9++] & 255;
                  this.tailLen = 0;
               }
         }

         if (var10 != -1) {
            var6[var7++] = var5[var10 >> 18 & 63];
            var6[var7++] = var5[var10 >> 12 & 63];
            var6[var7++] = var5[var10 >> 6 & 63];
            var6[var7++] = var5[var10 & 63];
            if (--var8 == 0) {
               if (this.do_cr) {
                  var6[var7++] = 13;
               }

               var6[var7++] = 10;
               var8 = 19;
            }
         }

         while (var9 + 3 <= var3) {
            var10 = (var1[var9] & 255) << 16 | (var1[var9 + 1] & 255) << 8 | var1[var9 + 2] & 255;
            var6[var7] = var5[var10 >> 18 & 63];
            var6[var7 + 1] = var5[var10 >> 12 & 63];
            var6[var7 + 2] = var5[var10 >> 6 & 63];
            var6[var7 + 3] = var5[var10 & 63];
            var9 += 3;
            var7 += 4;
            if (--var8 == 0) {
               if (this.do_cr) {
                  var6[var7++] = 13;
               }

               var6[var7++] = 10;
               var8 = 19;
            }
         }

         if (var4) {
            if (var9 - this.tailLen == var3 - 1) {
               int var11 = 0;
               var10 = ((this.tailLen > 0 ? this.tail[var11++] : var1[var9++]) & 255) << 4;
               this.tailLen -= var11;
               var6[var7++] = var5[var10 >> 6 & 63];
               var6[var7++] = var5[var10 & 63];
               if (this.do_padding) {
                  var6[var7++] = 61;
                  var6[var7++] = 61;
               }

               if (this.do_newline) {
                  if (this.do_cr) {
                     var6[var7++] = 13;
                  }

                  var6[var7++] = 10;
               }
            } else if (var9 - this.tailLen == var3 - 2) {
               int var24 = 0;
               var10 = ((this.tailLen > 1 ? this.tail[var24++] : var1[var9++]) & 255) << 10
                  | ((this.tailLen > 0 ? this.tail[var24++] : var1[var9++]) & 255) << 2;
               this.tailLen -= var24;
               var6[var7++] = var5[var10 >> 12 & 63];
               var6[var7++] = var5[var10 >> 6 & 63];
               var6[var7++] = var5[var10 & 63];
               if (this.do_padding) {
                  var6[var7++] = 61;
               }

               if (this.do_newline) {
                  if (this.do_cr) {
                     var6[var7++] = 13;
                  }

                  var6[var7++] = 10;
               }
            } else if (this.do_newline && var7 > 0 && var8 != 19) {
               if (this.do_cr) {
                  var6[var7++] = 13;
               }

               var6[var7++] = 10;
            }

            assert this.tailLen == 0;
            assert var9 == var3;
         } else if (var9 == var3 - 1) {
            this.tail[this.tailLen++] = var1[var9];
         } else if (var9 == var3 - 2) {
            this.tail[this.tailLen++] = var1[var9];
            this.tail[this.tailLen++] = var1[var9 + 1];
         }

         this.op = var7;
         this.count = var8;
         return true;
      }
   }
}
