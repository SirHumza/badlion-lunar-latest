package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import lombok.Generated;

public enum CORCOCICIRIOHROHROIIOOHICCHCRR {
   INFO("info"),
   SUCCESS("success"),
   WARNING("warning"),
   ERROR("error");

   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC icon;

   CORCOCICIRIOHROHROIIOOHICCHCRR(String var3) {
      this.icon = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "icons/notifications/" + var3 + "-24x24.png");
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC getIcon() {
      return this.icon;
   }
}
