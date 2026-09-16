package com.moonsworth.lunar.client.util;

import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public final class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   public static final List<NamedTextColor> RHCHHORHHCOCCOCHOOIHROCCCIRRCH = Collections.unmodifiableList(
      Arrays.asList(
         NamedTextColor.BLACK,
         NamedTextColor.DARK_BLUE,
         NamedTextColor.DARK_GREEN,
         NamedTextColor.DARK_AQUA,
         NamedTextColor.DARK_RED,
         NamedTextColor.DARK_PURPLE,
         NamedTextColor.GOLD,
         NamedTextColor.GRAY,
         NamedTextColor.DARK_GRAY,
         NamedTextColor.BLUE,
         NamedTextColor.GREEN,
         NamedTextColor.AQUA,
         NamedTextColor.RED,
         NamedTextColor.LIGHT_PURPLE,
         NamedTextColor.YELLOW,
         NamedTextColor.WHITE
      )
   );
   private static final int IHORHIIRICIIHCCHOHCRHHHRHCICII = 24;
   private static final int CHOIRIHHOHRHIOHIOCRHRICCIROCHR = 16;
   private static final int CCRIOHIIOIOHHRCCHCCOOORRHRCIHR = 8;
   private static final int OHHIRIOHORHCOOIRRRIIOIOIOHHHRC = 255;
   public static final int CRHOOOHRHIRIICRRCIICRRCRCHICRI = -16777216;
   public static final int ROCRHIHCOOHROOHCCHOOOIIHCIOCCO = 16711680;
   public static final int IRRRCOCIHCIROOCOICHOIOIHCOHHCC = 65280;
   public static final int ORCRCICHICCICRRHCCOCIROOIROHIR = 255;
   public static final int OIIHICCCHOHCROOCOROHOHHOHHCCCC = -1;
   public static final int RROROHOIIRHHIIOOHHRICOCHOHIIHO = 0;
   private static final float OIOROOCOIIOHHICIIHCHIROOHRHHCH = 0.16666667F;
   private static final float IOCOHCRICRHCRRRRORIIHICHIORHIR = 0.003921569F;
   private static final float IORHCCIIRHIHCROIICRROROCIOCRHH = 255.0F;

   public static @Range(from = 0L, to = 255L) int OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static @Range(from = 0L, to = 255L) int IHHOOOHOIIOHRROCHCOOIIHHCOIHII(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static @Range(from = 0L, to = 255L) int IHCOIHIICIIHOOIICCHHCRORHORHCI(int var0) {
      return var0 & 0xFF;
   }

   public static @Range(from = 0L, to = 255L) int HOHROOIORCHOIIOOIIHHIHRCOCHIRO(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static @Range(from = 0L, to = 1L) float RCHRHOCCORRRCRORCHIIRRIIIRRCRR(int var0) {
      return OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0) * 0.003921569F;
   }

   public static @Range(from = 0L, to = 1L) float HOHHRHCIOCRCHCOOOHORROICORCCCC(int var0) {
      return IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0) * 0.003921569F;
   }

   public static @Range(from = 0L, to = 1L) float RICIORHICRROHOCHRRCRIHCROOCIIC(int var0) {
      return IHCOIHIICIIHOOIICCHHCRORHORHCI(var0) * 0.003921569F;
   }

   public static @Range(from = 0L, to = 1L) float HRCRHOOIROHCIIRHIIROHHROHRHHCR(int var0) {
      return HOHROOIORCHOIIOOIIHHIHRCOCHIRO(var0) * 0.003921569F;
   }

   public static @Range(from = 0L, to = 1L) float HRHICOCCOOHROCCIHHOHORHIHHHHOO(@Range(from = 0L, to = 255L) int var0) {
      return var0 * 0.003921569F;
   }

   public static int ORHIOICIOCRRHOOCOHRORIHICHRCRR(
      @Range(from = 0L, to = 255L) int var0,
      @Range(from = 0L, to = 255L) int var1,
      @Range(from = 0L, to = 255L) int var2,
      @Range(from = 0L, to = 255L) int var3
   ) {
      return (var3 & 0xFF) << 24 | (var0 & 0xFF) << 16 | (var1 & 0xFF) << 8 | var2 & 0xFF;
   }

   public static int IHIRRIIORRHORHRORIHOROIRCORCOO(
      @Range(from = 0L, to = 1L) float var0,
      @Range(from = 0L, to = 1L) float var1,
      @Range(from = 0L, to = 1L) float var2,
      @Range(from = 0L, to = 1L) float var3
   ) {
      return ORHIOICIOCRRHOOCOHRORIHICHRCRR((int)(var0 * 255.0F + 0.5F), (int)(var1 * 255.0F + 0.5F), (int)(var2 * 255.0F + 0.5F), (int)(var3 * 255.0F + 0.5F));
   }

   public static int OOCCRCRCOHIIORCCORCRCIRRROIOOR(
      @Range(from = 0L, to = 255L) int var0, @Range(from = 0L, to = 255L) int var1, @Range(from = 0L, to = 255L) int var2
   ) {
      return ORHIOICIOCRRHOOCOHRORIHICHRCRR(var0, var1, var2, 255);
   }

   public static int IHCRORHRORIICHRHRCHRRIRRHHOCOO(
      @Range(from = 0L, to = 1L) float var0, @Range(from = 0L, to = 1L) float var1, @Range(from = 0L, to = 1L) float var2
   ) {
      return IHIRRIIORRHORHRORIHOROIRCORCOO(var0, var1, var2, 1.0F);
   }

   public static int IOCIIROIRCOHIRHHHROHCOOHIICIHI(int var0, @Range(from = 0L, to = 255L) int var1) {
      return HOHROOIORCHOIIOOIIHHIHRCOCHIRO(var0) < var1 ? HRHRORCIRICHCCCCCHICOOICIRHRIO(var0, var1) : var0;
   }

   public static float[] CCHHIOROOICROROOCOHHCRRICCOCRO(int var0) {
      return new float[]{
         OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0) * 0.003921569F,
         IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0) * 0.003921569F,
         IHCOIHIICIIHOOIICCHHCRORHORHCI(var0) * 0.003921569F
      };
   }

   public static float[] HOCHCOORIOCIICCIRCCHCCOCOIRHRC(int var0) {
      return new float[]{
         OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0) * 0.003921569F,
         IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0) * 0.003921569F,
         IHCOIHIICIIHOOIICCHHCRORHORHCI(var0) * 0.003921569F,
         HOHROOIORCHOIIOOIIHHIHRCOCHIRO(var0) * 0.003921569F
      };
   }

   public static int OCOHIOCHOCHRCCROORRIIIHIOHOIIR(int var0) {
      return var0 & 0xFF000000 | IHCOIHIICIIHOOIICCHHCRORHORHCI(var0) << 16 | IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0) << 8 | OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0);
   }

   public static int RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var0, @Range(from = 0L, to = 1L) float var1) {
      if (var1 == 1.0F) {
         return var0;
      }

      int var2 = (int)(HOHROOIORCHOIIOOIIHHIHRCOCHIRO(var0) * var1);
      return HRHRORCIRICHCCCCCHICOOICIRHRIO(var0, RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.CRHROHHHCIHHCOHCOORCRIHHIICROR(var2, 0, 255));
   }

   public static int CCRHOICIRORRHOOOCIHHHHCHCICHOH(int var0, @Range(from = 0L, to = 255L) int var1) {
      return var1 << 16 | var0 & -16711681;
   }

   public static int CCHORHIOORICCIRIHRIIHIICORIORO(int var0, @Range(from = 0L, to = 255L) int var1) {
      return var1 << 8 | var0 & -65281;
   }

   public static int OCIIROIOORRIOIIIRHIRRCCIIRRROH(int var0, @Range(from = 0L, to = 255L) int var1) {
      return var1 | var0 & -256;
   }

   public static int HRHRORCIRICHCCCCCHICOOICIRHRIO(int var0, @Range(from = 0L, to = 255L) int var1) {
      return var1 << 24 | var0 & 16777215;
   }

   public static int HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int var0, @Range(from = 0L, to = 1L) float var1) {
      return (int)(var1 * 255.0F) << 16 | var0 & -16711681;
   }

   public static int OOROOCCIRCCRHOIOIORIHCHHOOCCOR(int var0, @Range(from = 0L, to = 1L) float var1) {
      return (int)(var1 * 255.0F) << 8 | var0 & -65281;
   }

   public static int CORCOCICIRIOHROHROIIOOHICCHCRR(int var0, @Range(from = 0L, to = 1L) float var1) {
      return (int)(var1 * 255.0F) | var0 & -256;
   }

   public static int CRICCOOHHHCHOORCICOCOHIHOIRHOO(int var0, @Range(from = 0L, to = 1L) float var1) {
      return (int)(var1 * 255.0F) << 24 | var0 & 16777215;
   }

   public static int ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(int var0, int var1) {
      if (var1 == -1) {
         return var0;
      } else {
         return var0 == -1
            ? var1
            : ORHIOICIOCRRHOOCOHRORIHICHRCRR(
               HOHCCHOIOHOHHOROHOIIHOOHORRHRO(OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0), OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var1)),
               HOHCCHOIOHOHHOROHOIIHOOHORRHRO(IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0), IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var1)),
               HOHCCHOIOHOHHOROHOIIHOOHORRHRO(IHCOIHIICIIHOOIICCHHCRORHORHCI(var0), IHCOIHIICIIHOOIICCHHCRORHORHCI(var1)),
               HOHCCHOIOHOHHOROHOIIHOOHORRHRO(HOHROOIORCHOIIOOIIHHIHRCOCHIRO(var0), HOHROOIORCHOIIOOIIHHIHRCOCHIRO(var1))
            );
      }
   }

   private static int HOHCCHOIOHOHHOROHOIIHOOHORRHRO(@Range(from = 0L, to = 255L) int var0, @Range(from = 0L, to = 255L) int var1) {
      return (int)(var0 * var1 * 0.003921569F);
   }

   public static int[] HCOCHRHICOOCHHIHOHIRRHOIRHCHHH(int var0) {
      return new int[]{OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0), IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0), IHCOIHIICIIHOOIICCHHCRORHORHCI(var0)};
   }

   public static int[] CHCCIROOIHCCRCIHCIOIHRIIHROIRO(int var0) {
      return new int[]{
         OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0), IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0), IHCOIHIICIIHOOIICCHHCRORHORHCI(var0), HOHROOIORCHOIIOOIIHHIHRCOCHIRO(var0)
      };
   }

   public static int ICORRRIOCIIRICCCOIHCRRIORHOIIC(int var0) {
      return var0 | 0xFF000000;
   }

   public static int RCRICHOCHHHCRCORROOIHCROOIICOC(int var0) {
      return (var0 & 16579836) >> 2 | var0 & 0xFF000000;
   }

   public static int IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(int var0, @Range(from = 0L, to = 255L) int var1) {
      float var2 = var1 * 0.003921569F;
      int var3 = (int)((var0 >> 16 & 0xFF) * var2);
      int var4 = (int)((var0 >> 8 & 0xFF) * var2);
      int var5 = (int)((var0 & 0xFF) * var2);
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6 ? 0xFF000000 | var3 << 16 | var4 << 8 | var5 : 0xFF000000 | var5 << 16 | var4 << 8 | var3;
   }

   public static int HICHRCOHCCRHOHCICOOCHOIHCCHIRI(int var0, @Range(from = 0L, to = 1L) float var1) {
      if (var1 >= 1.0F) {
         return var0;
      }

      if (var1 <= 0.0F) {
         return var0 & 0xFF000000;
      }

      int var2 = (int)((var0 >> 16 & 0xFF) * var1);
      int var3 = (int)((var0 >> 8 & 0xFF) * var1);
      int var4 = (int)((var0 & 0xFF) * var1);
      return var0 & 0xFF000000 | var2 << 16 | var3 << 8 | var4;
   }

   public static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var0, int var1, @Range(from = 0L, to = 1L) float var2) {
      float var3 = 1.0F - var2;
      int var4 = (int)((var0 >> 16 & 0xFF) * var2 + (var1 >> 16 & 0xFF) * var3);
      int var5 = (int)((var0 >> 8 & 0xFF) * var2 + (var1 >> 8 & 0xFF) * var3);
      int var6 = (int)((var0 & 0xFF) * var2 + (var1 & 0xFF) * var3);
      return 0xFF000000 | var4 << 16 | var5 << 8 | var6;
   }

   public static int IICCOOCHCHROORHHIIHROHCCRHRCOR(int var0, int var1) {
      float var2 = HRCRHOOIROHCIIRHIIROHHROHRHHCR(var0);
      float var3 = RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var0);
      float var4 = HOHHRHCIOCRCHCOOOHORROICORCCCC(var0);
      float var5 = RICIORHICRROHOCHRRCRIHCROOCIIC(var0);
      float var6 = HRCRHOOIROHCIIRHIIROHHROHRHHCR(var1);
      float var7 = RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var1);
      float var8 = HOHHRHCIOCRCHCOOOHORROICORCCCC(var1);
      float var9 = RICIORHICRROHOCHRRCRIHCROOCIIC(var1);
      float var10 = 1.0F - var6;
      float var11 = var6 + var2 * var10;
      if (var11 == 0.0F) {
         return 0;
      }

      int var12 = (int)((var7 * var6 + var3 * var2 * var10) / var11 * 255.0F);
      int var13 = (int)((var8 * var6 + var4 * var2 * var10) / var11 * 255.0F);
      int var14 = (int)((var9 * var6 + var5 * var2 * var10) / var11 * 255.0F);
      return (int)(var11 * 255.0F) << 24 | var12 << 16 | var13 << 8 | var14;
   }

   @Nullable
   public static NamedTextColor IIHRRHORCRCROCHHOHORCHCROCIHRO(char var0) {
      return switch (var0) {
         case '0' -> NamedTextColor.BLACK;
         case '1' -> NamedTextColor.DARK_BLUE;
         case '2' -> NamedTextColor.DARK_GREEN;
         case '3' -> NamedTextColor.DARK_AQUA;
         case '4' -> NamedTextColor.DARK_RED;
         case '5' -> NamedTextColor.DARK_PURPLE;
         case '6' -> NamedTextColor.GOLD;
         case '7' -> NamedTextColor.GRAY;
         case '8' -> NamedTextColor.DARK_GRAY;
         case '9' -> NamedTextColor.BLUE;
         default -> null;
         case 'a' -> NamedTextColor.GREEN;
         case 'b' -> NamedTextColor.AQUA;
         case 'c' -> NamedTextColor.RED;
         case 'd' -> NamedTextColor.LIGHT_PURPLE;
         case 'e' -> NamedTextColor.YELLOW;
         case 'f' -> NamedTextColor.WHITE;
      };
   }

   public static int ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
      @Range(from = 0L, to = 1L) float var0, @Range(from = 0L, to = 1L) float var1, @Range(from = 0L, to = 1L) float var2
   ) {
      int var3;
      int var4;
      int var5;
      if (var1 == 0.0F) {
         var3 = var4 = var5 = (int)(var2 * 255.0F + 0.5F);
      } else {
         float var6 = (var0 - (float)Math.floor(var0)) * 6.0F;
         float var7 = var6 - (float)Math.floor(var6);
         float var8 = var2 * (1.0F - var1);
         float var9 = var2 * (1.0F - var1 * var7);
         float var10 = var2 * (1.0F - var1 * (1.0F - var7));
         switch ((int)var6) {
            case 0:
               var3 = (int)(var2 * 255.0F + 0.5F);
               var4 = (int)(var10 * 255.0F + 0.5F);
               var5 = (int)(var8 * 255.0F + 0.5F);
               break;
            case 1:
               var3 = (int)(var9 * 255.0F + 0.5F);
               var4 = (int)(var2 * 255.0F + 0.5F);
               var5 = (int)(var8 * 255.0F + 0.5F);
               break;
            case 2:
               var3 = (int)(var8 * 255.0F + 0.5F);
               var4 = (int)(var2 * 255.0F + 0.5F);
               var5 = (int)(var10 * 255.0F + 0.5F);
               break;
            case 3:
               var3 = (int)(var8 * 255.0F + 0.5F);
               var4 = (int)(var9 * 255.0F + 0.5F);
               var5 = (int)(var2 * 255.0F + 0.5F);
               break;
            case 4:
               var3 = (int)(var10 * 255.0F + 0.5F);
               var4 = (int)(var8 * 255.0F + 0.5F);
               var5 = (int)(var2 * 255.0F + 0.5F);
               break;
            case 5:
               var3 = (int)(var2 * 255.0F + 0.5F);
               var4 = (int)(var8 * 255.0F + 0.5F);
               var5 = (int)(var9 * 255.0F + 0.5F);
               break;
            default:
               var3 = 0;
               var4 = 0;
               var5 = 0;
         }
      }

      return 0xFF000000 | var3 << 16 | var4 << 8 | var5;
   }

   public static float[] ICOIOIRCHCIOCHCOHOHIOOCORIICRO(int var0) {
      return OHIIIOHIRIRCCRRIOIICCHHIORRHOH(OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0), IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0), IHCOIHIICIIHOOIICCHHCRORHORHCI(var0));
   }

   public static float[] OHIIIOHIRIRCCRRIOIICCHHIORRHOH(
      @Range(from = 0L, to = 255L) int var0, @Range(from = 0L, to = 255L) int var1, @Range(from = 0L, to = 255L) int var2
   ) {
      float[] var3 = new float[3];
      int var4 = Math.max(var0, var1);
      if (var2 > var4) {
         var4 = var2;
      }

      int var5 = Math.min(var0, var1);
      if (var2 < var5) {
         var5 = var2;
      }

      float var8 = var4 * 0.003921569F;
      float var7;
      if (var4 != 0) {
         var7 = (float)(var4 - var5) / var4;
      } else {
         var7 = 0.0F;
      }

      float var6;
      if (var7 == 0.0F) {
         var6 = 0.0F;
      } else {
         float var9 = (float)(var4 - var0) / (var4 - var5);
         float var10 = (float)(var4 - var1) / (var4 - var5);
         float var11 = (float)(var4 - var2) / (var4 - var5);
         if (var0 == var4) {
            var6 = var11 - var10;
         } else if (var1 == var4) {
            var6 = 2.0F + var9 - var11;
         } else {
            var6 = 4.0F + var10 - var9;
         }

         var6 *= 0.16666667F;
         if (var6 < 0.0F) {
            var6++;
         }
      }

      var3[0] = var6;
      var3[1] = var7;
      var3[2] = var8;
      return var3;
   }

   public static @Range(from = 0L, to = 1L) float ROIOORIOHOHIOIHRHCOCCCCORROIRH(int var0) {
      return IHICORCROOROHCIHIHCOIHRRHICICO(OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0), IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0), IHCOIHIICIIHOOIICCHHCRORHORHCI(var0));
   }

   public static @Range(from = 0L, to = 1L) float IHICORCROOROHCIHIHCOIHRRHICICO(
      @Range(from = 0L, to = 255L) int var0, @Range(from = 0L, to = 255L) int var1, @Range(from = 0L, to = 255L) int var2
   ) {
      int var3 = Math.max(var0, var1);
      if (var2 > var3) {
         var3 = var2;
      }

      int var4 = Math.min(var0, var1);
      if (var2 < var4) {
         var4 = var2;
      }

      float var6;
      if (var3 != 0) {
         var6 = (float)(var3 - var4) / var3;
      } else {
         var6 = 0.0F;
      }

      float var5;
      if (var6 == 0.0F) {
         var5 = 0.0F;
      } else {
         float var7 = (float)(var3 - var0) / (var3 - var4);
         float var8 = (float)(var3 - var1) / (var3 - var4);
         float var9 = (float)(var3 - var2) / (var3 - var4);
         if (var0 == var3) {
            var5 = var9 - var8;
         } else if (var1 == var3) {
            var5 = 2.0F + var7 - var9;
         } else {
            var5 = 4.0F + var8 - var7;
         }

         var5 *= 0.16666667F;
         if (var5 < 0.0F) {
            var5++;
         }
      }

      return var5;
   }

   public static @Range(from = 0L, to = 1L) float ORHRIOIOHHHCHOOCCHOICOCRIRICRR(int var0) {
      return HCHRIROHHHCORIOCROOCHRCIOROOCI(OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0), IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0), IHCOIHIICIIHOOIICCHHCRORHORHCI(var0));
   }

   public static @Range(from = 0L, to = 1L) float HCHRIROHHHCORIOCROOCHRCIOROOCI(
      @Range(from = 0L, to = 255L) int var0, @Range(from = 0L, to = 255L) int var1, @Range(from = 0L, to = 255L) int var2
   ) {
      int var3 = Math.max(var0, var1);
      if (var2 > var3) {
         var3 = var2;
      }

      int var4 = Math.min(var0, var1);
      if (var2 < var4) {
         var4 = var2;
      }

      float var5;
      if (var3 != 0) {
         var5 = (float)(var3 - var4) / var3;
      } else {
         var5 = 0.0F;
      }

      return var5;
   }

   public static @Range(from = 0L, to = 1L) float HRHRIHRROHHORROCHCOHICRROHRRIO(int var0) {
      return CCIHHRIOOOOCOHRCIHOHROOICIORCC(OICIOHIRRIIOIHOOHOCHIIOHHIRCCO(var0), IHHOOOHOIIOHRROCHCOOIIHHCOIHII(var0), IHCOIHIICIIHOOIICCHHCRORHORHCI(var0));
   }

   public static @Range(from = 0L, to = 1L) float CCIHHRIOOOOCOHRCIHOHROOICIORCC(
      @Range(from = 0L, to = 255L) int var0, @Range(from = 0L, to = 255L) int var1, @Range(from = 0L, to = 255L) int var2
   ) {
      int var3 = Math.max(var0, var1);
      if (var2 > var3) {
         var3 = var2;
      }

      return var3 * 0.003921569F;
   }

   public static int ICIIOHIRRHRORROIIHCIRCIIOIHCHR(String var0) {
      if (var0.startsWith("#")) {
         var0 = var0.substring(1);
      } else if (var0.startsWith("0x") || var0.startsWith("0X")) {
         var0 = var0.substring(2);
      }

      if (var0.length() == 6) {
         var0 = "FF" + var0;
      } else if (var0.length() != 8) {
         throw new IllegalArgumentException("Invalid hex string: " + var0);
      }

      return (int)Long.parseLong(var0, 16);
   }

   public static String HICHRCOHCCRHOHCICOOCHOIHCCHIRI(int var0, boolean var1) {
      return "#" + StringUtils.leftPad(Integer.toHexString(var1 ? var0 : var0 & 16777215), var1 ? 8 : 6, "0").toUpperCase(Locale.ROOT);
   }

   public static int IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(float var0, float var1, float var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, 0);
   }

   public static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var0, float var1, float var2, int var3) {
      Color var4 = Color.getHSBColor(var0, var1, var2);
      return HRHRORCIRICHCCCCCHICOOICIRHRIO(var4.getRGB(), var3);
   }

   public static int CRRRICCRROCOHHOHIICIHORCOORRRH(int var0, int var1, float var2) {
      float var3 = RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var0);
      float var4 = HOHHRHCIOCRCHCOOOHORROICORCCCC(var0);
      float var5 = RICIORHICRROHOCHRRCRIHCROOCIIC(var0);
      float var6 = HRCRHOOIROHCIIRHIIROHHROHRHHCR(var0);
      float var7 = RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var1);
      float var8 = HOHHRHCIOCRCHCOOOHORROICORCCCC(var1);
      float var9 = RICIORHICRROHOCHRRCRIHCROOCIIC(var1);
      float var10 = HRCRHOOIROHCIIRHIIROHHROHRHHCR(var1);
      float var11 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.lerp(var3, var7, var2);
      float var12 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.lerp(var4, var8, var2);
      float var13 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.lerp(var5, var9, var2);
      float var14 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.lerp(var6, var10, var2);
      return IHIRRIIORRHORHRORIHOROIRCORCOO(var11, var12, var13, var14);
   }

   @Generated
   private OCOHORHCROHICRRIHCIHHRRCIHICRI() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
