package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import lombok.Generated;

public enum CIOHHCORHRCCRICCCORIHCRHCCCRRR implements com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   GENERAL("general", "general-52x52", RORCHCIIICOHIRROOORHOCCCCIOCCI.GENERAL),
   PERFORMANCE("performance", "performance-52x52", RORCHCIIICOHIRROOORHOCCCCIOCCI.PERFORMANCE),
   CONTROLS("controls", "controls-52x52", RORCHCIIICOHIRROOORHOCCCCIOCCI.CONTROLS);

   private final String category;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC resource;
   private final RORCHCIIICOHIRROOORHOCCCCIOCCI scope;

   CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var3,
      String var4,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var5
   ) {
      this.category = var3;
      this.resource = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
         "lunar", "ui/setting/" + var4 + ".png"
      );
      this.scope = var5;
   }

   @Override
   public String toString() {
      return this.category;
   }

   @Override
   public String getLanguagePath() {
      return "gui.settings";
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC getResource() {
      return this.resource;
   }

   @Generated
   public RORCHCIIICOHIRROOORHOCCCCIOCCI getScope() {
      return this.scope;
   }
}
