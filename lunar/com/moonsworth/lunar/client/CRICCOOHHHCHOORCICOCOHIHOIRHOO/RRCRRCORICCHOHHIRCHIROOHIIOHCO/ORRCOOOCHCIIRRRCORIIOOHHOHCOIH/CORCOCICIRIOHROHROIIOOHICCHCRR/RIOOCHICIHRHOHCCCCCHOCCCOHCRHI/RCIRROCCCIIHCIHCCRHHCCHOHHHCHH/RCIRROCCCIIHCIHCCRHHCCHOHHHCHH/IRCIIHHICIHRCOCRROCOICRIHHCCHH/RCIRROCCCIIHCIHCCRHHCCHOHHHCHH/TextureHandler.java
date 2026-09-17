package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.Locale;
import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   FANCY_GREEN(16, 16),
   FANCY_WHITE(16, 16),
   FANCY_CROSS(16, 16),
   FANCY_UNKNOWN(16, 16),
   HIGHRES_GREEN(21, 22),
   HIGHRES_WHITE(21, 22),
   HIGHRES_CROSS(21, 22),
   HIGHRES_UNKNOWN(21, 22),
   HYPIXEL_OLD_GREEN(7, 7),
   HYPIXEL_OLD_WHITE(8, 8),
   HYPIXEL_OLD_CROSS(8, 8),
   HYPIXEL_OLD_UNKNOWN(7, 7),
   HYPIXEL_NEW_GREEN(18, 18),
   HYPIXEL_NEW_WHITE(18, 18),
   HYPIXEL_NEW_CROSS(8, 8),
   HYPIXEL_NEW_UNKNOWN(10, 18),
   VANILLA_MAP_PLAYER(5, 7);

   private final int textureWidth;
   private final int textureHeight;
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC image;

   HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var3, int var4) {
      this.textureWidth = var3;
      this.textureHeight = var4;
      this.image = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "skyblock/dungeon/map_icon/" + this.name().toLowerCase(Locale.ROOT) + ".png");
   }

   @Generated
   public int getTextureWidth() {
      return this.textureWidth;
   }

   @Generated
   public int getTextureHeight() {
      return this.textureHeight;
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC getImage() {
      return this.image;
   }
}
