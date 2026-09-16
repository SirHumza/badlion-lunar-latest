package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   SELF("SELF", null),
   ASTRONAUT("ASTRONAUT", "slim"),
   ASTRONAUT_DARK("ASTRONAUT_DARK", "slim"),
   WHITE("WHITE", "default");

   final String id;
   RCIROOOOICRHCCRRCIORHHIRCOIIIC skinLocation;
   final String skinType;

   CRRRICCRROCOHHOHIICIHORCOORRRH(String var3, String var4) {
      this.id = var3;
      this.skinType = var4;
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC getSkinLocation() {
      if (this.skinLocation == null && this != SELF) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
            this.skinLocation = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "skins/" + this.id.toLowerCase() + "_1.7.png");
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$bindTexture(this.skinLocation);
         } else {
            this.skinLocation = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "skins/" + this.id.toLowerCase() + ".png");
         }
      }

      return this.skinLocation;
   }

   @Override
   public String toString() {
      return this.id;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public String getSkinType() {
      return this.skinType;
   }
}
