package com.mxgraph.util;

import java.util.Arrays;

public class mxBase64 {
   private static final char[] CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
   private static final int[] IA = new int[256];

   public static final char[] encodeToChar(byte[] var0, boolean var1) {
      int var2 = var0 != null ? var0.length : 0;
      if (var2 == 0) {
         return new char[0];
      }

      int var3 = var2 / 3 * 3;
      int var4 = (var2 - 1) / 3 + 1 << 2;
      int var5 = var4 + (var1 ? (var4 - 1) / 76 << 1 : 0);
      char[] var6 = new char[var5];
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      while (var7 < var3) {
         int var10 = (var0[var7++] & 255) << 16 | (var0[var7++] & 255) << 8 | var0[var7++] & 255;
         var6[var8++] = CA[var10 >>> 18 & 63];
         var6[var8++] = CA[var10 >>> 12 & 63];
         var6[var8++] = CA[var10 >>> 6 & 63];
         var6[var8++] = CA[var10 & 63];
         if (var1) {
            if (++var9 == 19 && var8 < var5 - 2) {
               var6[var8++] = '\r';
               var6[var8++] = '\n';
               var9 = 0;
            }
         }
      }

      var7 = var2 - var3;
      if (var7 > 0) {
         var8 = (var0[var3] & 255) << 10 | (var7 == 2 ? (var0[var2 - 1] & 255) << 2 : 0);
         var6[var5 - 4] = CA[var8 >> 12];
         var6[var5 - 3] = CA[var8 >>> 6 & 63];
         var6[var5 - 2] = var7 == 2 ? CA[var8 & 63] : '=';
         var6[var5 - 1] = '=';
      }

      return var6;
   }

   public static final byte[] decode(char[] var0) {
      int var1 = var0 != null ? var0.length : 0;
      if (var1 == 0) {
         return new byte[0];
      }

      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         if (IA[var0[var3]] < 0) {
            var2++;
         }
      }

      if ((var1 - var2) % 4 != 0) {
         return null;
      }

      int var11 = 0;
      int var4 = var1;

      while (var4 > 1) {
         if (IA[var0[--var4]] > 0) {
            break;
         }

         if (var0[var4] == '=') {
            var11++;
         }
      }

      var4 = ((var1 - var2) * 6 >> 3) - var11;
      byte[] var5 = new byte[var4];
      int var6 = 0;
      int var7 = 0;

      while (var7 < var4) {
         int var8 = 0;

         for (int var9 = 0; var9 < 4; var9++) {
            int var10 = IA[var0[var6++]];
            if (var10 >= 0) {
               var8 |= var10 << 18 - var9 * 6;
            } else {
               var9--;
            }
         }

         var5[var7++] = (byte)(var8 >> 16);
         if (var7 < var4) {
            var5[var7++] = (byte)(var8 >> 8);
            if (var7 < var4) {
               var5[var7++] = (byte)var8;
            }
         }
      }

      return var5;
   }

   public static final byte[] decodeFast(char[] var0) {
      int var1 = var0.length;
      if (var1 == 0) {
         return new byte[0];
      }

      int var2 = 0;
      int var3 = var1 - 1;

      while (var2 < var3 && IA[var0[var2]] < 0) {
         var2++;
      }

      while (var3 > 0 && IA[var0[var3]] < 0) {
         var3--;
      }

      int var4 = var0[var3] == '=' ? (var0[var3 - 1] == '=' ? 2 : 1) : 0;
      int var5 = var3 - var2 + 1;
      int var6 = var1 > 76 ? (var0[76] == '\r' ? var5 / 78 : 0) << 1 : 0;
      int var7 = ((var5 - var6) * 6 >> 3) - var4;
      byte[] var8 = new byte[var7];
      int var9 = 0;
      int var10 = 0;
      int var11 = var7 / 3 * 3;

      while (var9 < var11) {
         int var12 = IA[var0[var2++]] << 18 | IA[var0[var2++]] << 12 | IA[var0[var2++]] << 6 | IA[var0[var2++]];
         var8[var9++] = (byte)(var12 >> 16);
         var8[var9++] = (byte)(var12 >> 8);
         var8[var9++] = (byte)var12;
         if (var6 > 0) {
            if (++var10 == 19) {
               var2 += 2;
               var10 = 0;
            }
         }
      }

      if (var9 < var7) {
         var10 = 0;

         for (int var19 = 0; var2 <= var3 - var4; var19++) {
            var10 |= IA[var0[var2++]] << 18 - var19 * 6;
         }

         for (byte var20 = 16; var9 < var7; var20 -= 8) {
            var8[var9++] = (byte)(var10 >> var20);
         }
      }

      return var8;
   }

   public static final byte[] encodeToByte(byte[] var0, boolean var1) {
      int var2 = var0 != null ? var0.length : 0;
      if (var2 == 0) {
         return new byte[0];
      }

      int var3 = var2 / 3 * 3;
      int var4 = (var2 - 1) / 3 + 1 << 2;
      int var5 = var4 + (var1 ? (var4 - 1) / 76 << 1 : 0);
      byte[] var6 = new byte[var5];
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      while (var7 < var3) {
         int var10 = (var0[var7++] & 255) << 16 | (var0[var7++] & 255) << 8 | var0[var7++] & 255;
         var6[var8++] = (byte)CA[var10 >>> 18 & 63];
         var6[var8++] = (byte)CA[var10 >>> 12 & 63];
         var6[var8++] = (byte)CA[var10 >>> 6 & 63];
         var6[var8++] = (byte)CA[var10 & 63];
         if (var1) {
            if (++var9 == 19 && var8 < var5 - 2) {
               var6[var8++] = 13;
               var6[var8++] = 10;
               var9 = 0;
            }
         }
      }

      var7 = var2 - var3;
      if (var7 > 0) {
         var8 = (var0[var3] & 255) << 10 | (var7 == 2 ? (var0[var2 - 1] & 255) << 2 : 0);
         var6[var5 - 4] = (byte)CA[var8 >> 12];
         var6[var5 - 3] = (byte)CA[var8 >>> 6 & 63];
         var6[var5 - 2] = var7 == 2 ? (byte)CA[var8 & 63] : 61;
         var6[var5 - 1] = 61;
      }

      return var6;
   }

   public static final byte[] decode(byte[] var0) {
      int var1 = var0.length;
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         if (IA[var0[var3] & 0xFF] < 0) {
            var2++;
         }
      }

      if ((var1 - var2) % 4 != 0) {
         return null;
      }

      int var11 = 0;
      int var4 = var1;

      while (var4 > 1) {
         if (IA[var0[--var4] & 0xFF] > 0) {
            break;
         }

         if (var0[var4] == 61) {
            var11++;
         }
      }

      var4 = ((var1 - var2) * 6 >> 3) - var11;
      byte[] var5 = new byte[var4];
      int var6 = 0;
      int var7 = 0;

      while (var7 < var4) {
         int var8 = 0;

         for (int var9 = 0; var9 < 4; var9++) {
            int var10 = IA[var0[var6++] & 0xFF];
            if (var10 >= 0) {
               var8 |= var10 << 18 - var9 * 6;
            } else {
               var9--;
            }
         }

         var5[var7++] = (byte)(var8 >> 16);
         if (var7 < var4) {
            var5[var7++] = (byte)(var8 >> 8);
            if (var7 < var4) {
               var5[var7++] = (byte)var8;
            }
         }
      }

      return var5;
   }

   public static final byte[] decodeFast(byte[] var0) {
      int var1 = var0.length;
      if (var1 == 0) {
         return new byte[0];
      }

      int var2 = 0;
      int var3 = var1 - 1;

      while (var2 < var3 && IA[var0[var2] & 0xFF] < 0) {
         var2++;
      }

      while (var3 > 0 && IA[var0[var3] & 0xFF] < 0) {
         var3--;
      }

      int var4 = var0[var3] == 61 ? (var0[var3 - 1] == 61 ? 2 : 1) : 0;
      int var5 = var3 - var2 + 1;
      int var6 = var1 > 76 ? (var0[76] == 13 ? var5 / 78 : 0) << 1 : 0;
      int var7 = ((var5 - var6) * 6 >> 3) - var4;
      byte[] var8 = new byte[var7];
      int var9 = 0;
      int var10 = 0;
      int var11 = var7 / 3 * 3;

      while (var9 < var11) {
         int var12 = IA[var0[var2++]] << 18 | IA[var0[var2++]] << 12 | IA[var0[var2++]] << 6 | IA[var0[var2++]];
         var8[var9++] = (byte)(var12 >> 16);
         var8[var9++] = (byte)(var12 >> 8);
         var8[var9++] = (byte)var12;
         if (var6 > 0) {
            if (++var10 == 19) {
               var2 += 2;
               var10 = 0;
            }
         }
      }

      if (var9 < var7) {
         var10 = 0;

         for (int var19 = 0; var2 <= var3 - var4; var19++) {
            var10 |= IA[var0[var2++]] << 18 - var19 * 6;
         }

         for (byte var20 = 16; var9 < var7; var20 -= 8) {
            var8[var9++] = (byte)(var10 >> var20);
         }
      }

      return var8;
   }

   public static final String encodeToString(byte[] var0, boolean var1) {
      return new String(encodeToChar(var0, var1));
   }

   public static final byte[] decode(String var0) {
      int var1 = var0 != null ? var0.length() : 0;
      if (var1 == 0) {
         return new byte[0];
      }

      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         if (IA[var0.charAt(var3)] < 0) {
            var2++;
         }
      }

      if ((var1 - var2) % 4 != 0) {
         return null;
      }

      int var11 = 0;
      int var4 = var1;

      while (var4 > 1) {
         if (IA[var0.charAt(--var4)] > 0) {
            break;
         }

         if (var0.charAt(var4) == '=') {
            var11++;
         }
      }

      var4 = ((var1 - var2) * 6 >> 3) - var11;
      byte[] var5 = new byte[var4];
      int var6 = 0;
      int var7 = 0;

      while (var7 < var4) {
         int var8 = 0;

         for (int var9 = 0; var9 < 4; var9++) {
            int var10 = IA[var0.charAt(var6++)];
            if (var10 >= 0) {
               var8 |= var10 << 18 - var9 * 6;
            } else {
               var9--;
            }
         }

         var5[var7++] = (byte)(var8 >> 16);
         if (var7 < var4) {
            var5[var7++] = (byte)(var8 >> 8);
            if (var7 < var4) {
               var5[var7++] = (byte)var8;
            }
         }
      }

      return var5;
   }

   public static final byte[] decodeFast(String var0) {
      int var1 = var0.length();
      if (var1 == 0) {
         return new byte[0];
      }

      int var2 = 0;
      int var3 = var1 - 1;

      while (var2 < var3 && IA[var0.charAt(var2) & 0xFF] < 0) {
         var2++;
      }

      while (var3 > 0 && IA[var0.charAt(var3) & 0xFF] < 0) {
         var3--;
      }

      int var4 = var0.charAt(var3) == '=' ? (var0.charAt(var3 - 1) == '=' ? 2 : 1) : 0;
      int var5 = var3 - var2 + 1;
      int var6 = var1 > 76 ? (var0.charAt(76) == '\r' ? var5 / 78 : 0) << 1 : 0;
      int var7 = ((var5 - var6) * 6 >> 3) - var4;
      byte[] var8 = new byte[var7];
      int var9 = 0;
      int var10 = 0;
      int var11 = var7 / 3 * 3;

      while (var9 < var11) {
         int var12 = IA[var0.charAt(var2++)] << 18 | IA[var0.charAt(var2++)] << 12 | IA[var0.charAt(var2++)] << 6 | IA[var0.charAt(var2++)];
         var8[var9++] = (byte)(var12 >> 16);
         var8[var9++] = (byte)(var12 >> 8);
         var8[var9++] = (byte)var12;
         if (var6 > 0) {
            if (++var10 == 19) {
               var2 += 2;
               var10 = 0;
            }
         }
      }

      if (var9 < var7) {
         var10 = 0;

         for (int var19 = 0; var2 <= var3 - var4; var19++) {
            var10 |= IA[var0.charAt(var2++)] << 18 - var19 * 6;
         }

         for (byte var20 = 16; var9 < var7; var20 -= 8) {
            var8[var9++] = (byte)(var10 >> var20);
         }
      }

      return var8;
   }

   static {
      Arrays.fill(IA, -1);
      int var0 = 0;
      int var1 = CA.length;

      while (var0 < var1) {
         IA[CA[var0]] = var0++;
      }

      IA[61] = 0;
   }
}
