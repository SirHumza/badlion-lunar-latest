package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.awt.Color;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   DEFAULT_LIGHT(-3750202),
   DEFAULT_DARK(-12566464),
   DARK_BLUE(-13617840);

   public final int mainColor;
   public final int searchNoMatchOverlay;
   public final int panelBackground;
   public final int panelBorderRight;
   public final int panelBorderLeft;
   public final int panelBorderOut;
   public final int insetBackground;
   public final int insetBorderRight;
   public final int insetBorderLeft;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var3) {
      Color var4 = new Color(var3);
      this.mainColor = var3;
      this.searchNoMatchOverlay = -1728053248;
      this.panelBorderOut = -16777216;
      this.panelBackground = var4.getRGB();
      this.panelBorderLeft = var4.brighter().getRGB();
      this.panelBorderRight = var4.darker().darker().darker().getRGB();
      this.insetBackground = var4.darker().getRGB();
      this.insetBorderLeft = var4.darker().darker().darker().getRGB();
      this.insetBorderRight = var4.brighter().getRGB();
   }
}
