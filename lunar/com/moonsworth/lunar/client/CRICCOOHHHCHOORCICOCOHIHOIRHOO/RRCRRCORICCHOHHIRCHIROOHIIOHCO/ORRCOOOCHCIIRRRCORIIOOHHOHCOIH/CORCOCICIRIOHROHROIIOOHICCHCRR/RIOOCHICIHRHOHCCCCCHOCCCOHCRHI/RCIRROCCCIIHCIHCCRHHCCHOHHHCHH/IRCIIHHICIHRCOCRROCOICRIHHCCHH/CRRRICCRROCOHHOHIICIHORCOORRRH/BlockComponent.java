package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import java.util.function.Function;
import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   CHEST(true, -16711936, var0 -> !var0.CICOCHRRRCOCOHROCHHRRHCHHIORII().get(), "routeInteractionTypeChest"),
   SKULL(true, -16711936, var0 -> !var0.CICOCHRRRCOCOHROCHHRRHCHHIORII().get(), "routeInteractionTypeSkull"),
   LEVER(true, -256, var0 -> !var0.IIICRHORCCRRROCORRIRCORHRRIHHI().get(), "routeInteractionTypeLever"),
   MUSHROOM(true, -256, var0 -> !var0.RCHOOORCIROICRCROCOOHHICRIORRR().get(), "routeInteractionTypeMushroom"),
   ITEM_DROP(true, -16711936, var0 -> !var0.CICOCHRRRCOCOHROCHHRRHCHHIORII().get(), "routeInteractionTypeItemDrop"),
   BAT(false, -16711936, var0 -> !var0.CICOCHRRRCOCOHROCHHRRHCHHIORII().get(), "routeInteractionTypeBat"),
   TNT(false, -65536, var0 -> !var0.IIICRHHRHIRIOIHICICRRIOCRHOCRR().get(), "routeInteractionTypeTnt"),
   ETHERWARP(false, -16776961, var0 -> !var0.IOOCORICOOCCIICCCHCOHHHCCIOROI().get(), "routeInteractionTypeEtherwarp"),
   BREAK_BLOCK(false, -65281, var0 -> !var0.RIHORIICIHOIICIORHCHHHRIHCRIOC().get(), "routeInteractionTypeBlock"),
   PEARL(false, -16755456, var0 -> !var0.CIORIHRCOROOHOICRCCRIIOHCICIIC().get(), "routeInteractionTypePearl");

   private final boolean seperatesSections;
   private final int color;
   private final Function<HICHRCOHCCRHOHCICOOCHOIHCCHIRI, Boolean> shouldRenderSetting;
   private final String text;

   public boolean isSectionSeparator() {
      return this.seperatesSections;
   }

   public int getColor() {
      return this.color;
   }

   public int getColorAlpha() {
      return this.color & 1157627903;
   }

   public boolean shouldRender() {
      return this.shouldRenderSetting.apply(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HORCOCRHHOIIOCCIRRHHRCORCCHIIO());
   }

   public String getText() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         this.text
      );
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var3, int var4, Function<HICHRCOHCCRHOHCICOOCHOIHCCHIRI, Boolean> var5, String var6) {
      this.seperatesSections = var3;
      this.color = var4;
      this.shouldRenderSetting = var5;
      this.text = var6;
   }
}
