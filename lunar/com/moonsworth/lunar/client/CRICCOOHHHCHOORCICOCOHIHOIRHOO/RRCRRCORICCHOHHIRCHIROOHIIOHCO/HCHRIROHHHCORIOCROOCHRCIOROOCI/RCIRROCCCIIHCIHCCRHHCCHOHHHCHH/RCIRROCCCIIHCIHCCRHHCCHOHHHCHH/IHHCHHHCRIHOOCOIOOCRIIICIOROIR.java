package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      float var2,
      int var3,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
   ) {
      var4.push();
      float var5 = 5 * Math.round(var1.getWidth() / var1.getHeight());
      float var6 = 5.0F;
      var4.scale(var1.getWidth() / var5, var1.getHeight() / var6, 1.0F);
      int var7 = (int)var5;
      int var8 = (int)var6;
      int var9 = var7 * var8;
      int var10 = (int)Math.ceil(var9 * var2);
      int var11 = var10;
      int var12 = 0;
      int var13 = 0;

      for (int var14 = 0; var10 > 0; var14++) {
         int var15 = var11 - var10;
         switch (var14 % 4) {
            case 0:
               float var21 = (float)var7 / var9;
               float var24 = (float)var15 / var9;
               float var27 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH((var2 - var24) / var21, 0.0F, 1.0F);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var13, var12, var7 * var27, 1.0F, var3);
               var12++;
               var8--;
               var10 -= var7;
               break;
            case 1:
               float var20 = (float)var8 / var9;
               float var23 = (float)var15 / var9;
               float var26 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH((var2 - var23) / var20, 0.0F, 1.0F);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var13 + var7 - 1, var12, 1.0F, var8 * var26, var3);
               var7--;
               var10 -= var8;
               break;
            case 2:
               float var19 = (float)var7 / var9;
               float var22 = (float)var15 / var9;
               float var25 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH((var2 - var22) / var19, 0.0F, 1.0F);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var13, var12 + var8 - 1, var7 * var25, 1.0F, var3);
               var8--;
               var10 -= var7;
               break;
            case 3:
               float var16 = (float)var8 / var9;
               float var17 = (float)var15 / var9;
               float var18 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH((var2 - var17) / var16, 0.0F, 1.0F);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var13, var12, 1.0F, var8 * var18, var3);
               var13++;
               var7--;
               var10 -= var8;
         }
      }

      var4.pop();
   }
}
