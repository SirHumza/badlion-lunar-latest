package com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static final int OOORIOOHHOOCOCHRCHCCRRHORHIOCI = 8;

   public static BufferedImage RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BufferedImage var0, IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1, boolean var2, int var3) {
      if (var2) {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1 == IHHCHHHCRIHOOCOIOOCRIIICIOROIR.LOW, var3);
      } else {
         return var1 == IHHCHHHCRIHOOCOIOOCRIIICIOROIR.LOW ? CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var3) : var0;
      }
   }

   public static boolean HOHCCHOIOHOHHOROHOIIHOOHORRHRO(RCIROOOOICRHCCRRCIORHHIRCOIIIC var0) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR();
      if (var1 == null) {
         return false;
      }

      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR var2 = var1.HCCICHCRRIICICCHCIRCRRIIRROHHC();
      return var2 == null ? false : var2.HCCOIHROCRHHOOHHOHCCHRCHRORHHO().contains(var0);
   }

   public static BufferedImage IRCIIHHICIHRCOCRROCOICRIHHCCHH(BufferedImage var0, int var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, false, var1);
   }

   public static BufferedImage HHCCIRHCCCIIRHCROHIORHIRHHIORH(BufferedImage var0, int var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, true, var1);
   }

   private static BufferedImage RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BufferedImage var0, boolean var1, int var2) {
      float var3 = (float)var0.getWidth() / var0.getHeight();
      if (Math.abs(var3 - 2.0F) > 0.01F) {
         return var1 ? CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var2) : var0;
      }

      int var4 = var0.getHeight();
      if (var1) {
         var4 = Math.min(var0.getHeight(), 32 * var2);
      }

      int var5 = var4 * 2;
      int var6 = RORCHCIIICOHIRROOORHOCCCCIOCCI(var4, 17, 32);
      int var7 = RORCHCIIICOHIRROOORHOCCCCIOCCI(var5, 22, 64);
      BufferedImage var8 = new BufferedImage(var7, var6, 2);
      Graphics var9 = var8.getGraphics();
      var9.drawImage(var0, 0, 0, var5, var4, null);
      var9.dispose();
      return var8;
   }

   private static BufferedImage CRRRICCRROCOHHOHIICIHORCOORRRH(BufferedImage var0, int var1) {
      if (var0.getWidth() <= 17 * var1) {
         return var0;
      }

      int var2 = 22 * var1;
      int var3 = RORCHCIIICOHIRROOORHOCCCCIOCCI(var0.getHeight(), var2, var0.getWidth());
      BufferedImage var4 = new BufferedImage(var2, var3, 2);
      Graphics var5 = var4.getGraphics();
      var5.drawImage(var0, 0, 0, var2, var3, null);
      var5.dispose();
      return var4;
   }

   private static int RORCHCIIICOHIRROOORHOCCCCIOCCI(int var0, int var1, int var2) {
      long var3 = (long)var0 * var1;
      var3 += var2 - 1;
      return (int)(var3 / var2);
   }
}
