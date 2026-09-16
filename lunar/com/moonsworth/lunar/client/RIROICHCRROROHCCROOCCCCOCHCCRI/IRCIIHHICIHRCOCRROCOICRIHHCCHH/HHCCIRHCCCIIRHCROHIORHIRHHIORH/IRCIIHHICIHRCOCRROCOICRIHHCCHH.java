package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   IN_WORLD(false, false),
   IN_WORLD_PLAYER_MODEL(true, false),
   IN_COSMETIC_PLAYER_MODEL(true, false),
   IN_COSMETIC_PLAYER_GUI_MODEL(true, true),
   IN_COSMETIC_PLAYER_GUI(false, true);

   private final boolean usesPlayer;
   private final boolean inGui;

   @Generated
   public boolean isUsesPlayer() {
      return this.usesPlayer;
   }

   @Generated
   public boolean isInGui() {
      return this.inGui;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var3, boolean var4) {
      this.usesPlayer = var3;
      this.inGui = var4;
   }
}
