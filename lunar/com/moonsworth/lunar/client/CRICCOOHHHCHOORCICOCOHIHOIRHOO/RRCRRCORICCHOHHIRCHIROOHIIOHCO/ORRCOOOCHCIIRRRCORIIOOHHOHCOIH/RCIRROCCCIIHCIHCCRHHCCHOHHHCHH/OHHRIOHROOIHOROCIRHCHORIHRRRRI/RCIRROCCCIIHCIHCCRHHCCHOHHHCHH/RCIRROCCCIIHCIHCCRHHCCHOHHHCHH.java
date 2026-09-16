package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   BLUE(NamedTextColor.BLUE, "SLICE_OF_BLUEBERRY_CAKE"),
   RED(NamedTextColor.RED, "SLICE_OF_RED_VELVET_CAKE"),
   GREEN(NamedTextColor.GREEN, "SLICE_OF_GREEN_VELVET_CAKE"),
   YELLOW(NamedTextColor.YELLOW, "SLICE_OF_CHEESECAKE"),
   PINK(NamedTextColor.LIGHT_PURPLE, "SLICE_OF_STRAWBERRY_SHORTCAKE");

   private static final Pattern ICON_PATTERN = Pattern.compile("§(?<color>[0-9a-f])⛃");
   private final NamedTextColor color;
   private final String sliceId;

   public int getHighlightColor() {
      return this.color.value() | 0xFF000000;
   }

   @Nullable
   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH byItem(@Nullable IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 == null) {
         return null;
      }

      String var1 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.CHHIICHRIIROIOHIHIIROICOCCROCI(
         var0
      );

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : values()) {
         if (var5.sliceId.equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   @Nullable
   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH of(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
   ) {
      if (var0.bridge$getGameProfile() == null) {
         return null;
      }

      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      if (var1 == null) {
         return null;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = var1.bridge$getScoreBoard();
      if (var2 == null) {
         return null;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = var2.bridge$getPlayersTeam(
         var0.bridge$getGameProfile().getName()
      );
      if (var3 == null) {
         return null;
      }

      Matcher var4 = ICON_PATTERN.matcher(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(
            var3.bridge$getPrefixAndSuffix()
         )
      );
      if (!var4.find()) {
         return null;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getByCode(
         var4.group("color").charAt(0)
      );
      return var5 == null ? null : byColor(var5.getAdventureColor());
   }

   @Nullable
   private static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH byColor(NamedTextColor var0) {
      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
         if (var4.color == var0) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   public NamedTextColor getColor() {
      return this.color;
   }

   @Generated
   public String getSliceId() {
      return this.sliceId;
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(NamedTextColor var3, String var4) {
      this.color = var3;
      this.sliceId = var4;
   }
}
