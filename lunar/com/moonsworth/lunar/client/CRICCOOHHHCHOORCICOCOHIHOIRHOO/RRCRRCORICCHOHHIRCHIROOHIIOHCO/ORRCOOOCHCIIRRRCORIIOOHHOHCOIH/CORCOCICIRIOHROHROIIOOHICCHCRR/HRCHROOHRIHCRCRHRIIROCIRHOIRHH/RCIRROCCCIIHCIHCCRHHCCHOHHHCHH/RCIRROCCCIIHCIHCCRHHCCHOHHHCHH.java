package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   SQUARE("square", getTexture("square"), getTexture("square_border")),
   ROUNDED_SQUARE("roundedSquare", getTexture("rounded_square"), getTexture("rounded_square_border")),
   CIRCLE("circle", getTexture("circle"), getTexture("circle_border"));

   private final String id;
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC buttonTexture;
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC borderTexture;

   private static RCIROOOOICRHCCRRCIORHHIRCOIIIC getTexture(String var0) {
      return RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "skyblock/inventorybuttons/" + var0 + ".png");
   }

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, RCIROOOOICRHCCRRCIORHHIRCOIIIC var4, RCIROOOOICRHCCRRCIORHHIRCOIIIC var5) {
      this.id = var3;
      this.buttonTexture = var4;
      this.borderTexture = var5;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC getButtonTexture() {
      return this.buttonTexture;
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC getBorderTexture() {
      return this.borderTexture;
   }
}
