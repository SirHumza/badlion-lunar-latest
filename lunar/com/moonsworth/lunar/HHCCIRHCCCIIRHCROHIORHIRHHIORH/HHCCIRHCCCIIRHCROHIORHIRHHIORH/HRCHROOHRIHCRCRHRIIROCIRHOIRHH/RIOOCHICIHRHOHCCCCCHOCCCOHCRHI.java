package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

public interface RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   int NO_OVERLAY = 655360;

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$vertex(double var1, double var3, double var5);

   default RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1, double var3) {
      return this.bridge$vertex(var1, var3, 0.0);
   }

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$color(int var1, int var2, int var3, int var4);

   default RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var1) {
      int var2 = var1 >> 24 & 0xFF;
      int var3 = var1 >> 16 & 0xFF;
      int var4 = var1 >> 8 & 0xFF;
      int var5 = var1 & 0xFF;
      return this.bridge$color(var3, var4, var5, var2);
   }

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$uv(float var1, float var2);

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$overlayCoords(int var1, int var2);

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$uv2(int var1, int var2);

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$normal(float var1, float var2, float var3);

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$vertex(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3,
      float var4
   );

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$normal(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      float var2,
      float var3,
      float var4
   );

   void bridge$endVertex();

   void bridge$vertex(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   );
}
