package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import lombok.Generated;

public enum OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   ICE_FILL(-132, -492),
   ICE_PATH(-60, -276),
   BLAZE_LOWER(-96, -204),
   BLAZE_UPPER(-60, -204),
   TP_MAZE(-60, -456),
   THREE_WEIRDOS(-60, -96),
   WATER_BOARD(-60, -60),
   TIC_TAC_TOE(-96, -168),
   QUIZ(-60, -600),
   BOULDER(-60, -564),
   BOMB(-60, -636),
   CREEPER_BEAMS(-60, -528);

   private final int x;
   private final int y;

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR getByCoords(int var0, int var1) {
      for (OOROOCCIRCCRHOIOIORIHCHHOOCCOR var5 : values()) {
         if (var5.x == var0 && var5.y == var1) {
            return var5;
         }
      }

      return null;
   }

   @Generated
   public int getX() {
      return this.x;
   }

   @Generated
   public int getY() {
      return this.y;
   }

   @Generated
   OOROOCCIRCCRHOIOIORIHCHHOOCCOR(int var3, int var4) {
      this.x = var3;
      this.y = var4;
   }
}
