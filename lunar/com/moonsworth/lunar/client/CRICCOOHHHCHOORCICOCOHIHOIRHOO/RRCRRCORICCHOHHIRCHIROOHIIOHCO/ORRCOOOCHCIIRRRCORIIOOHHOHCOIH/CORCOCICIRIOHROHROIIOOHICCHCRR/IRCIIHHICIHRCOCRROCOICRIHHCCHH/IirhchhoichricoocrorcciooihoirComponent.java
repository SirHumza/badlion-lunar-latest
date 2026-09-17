package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.COOCCHICCCIIICRHIOCOCIOOORCOCC;
import com.moonsworth.lunar.client.util.IOHOOIOHCHICOCHIICHCICCOHRCIII;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private static final Pattern HOOIORCCOIHIROIHRRHIIOROOCOCHR = Pattern.compile("^Rabbit \\w+ - \\[(?<level>\\d{1,3})].*$");
   private final int HIOCCOCRCIHIRIIOIIHCCOCCOICHRR;
   private final boolean ORCIHIIIOIHIHCRCIRIOCRHOIOOHCH;

   public String CHROCRRCIIIRICOIOCROCCROCOHRHH() {
      return this.ORCIHIIIOIHIHCRCIRIOCRHOIOOHCH
         ? this.HCIHORIHHCOOORRIOHIHIICCRHHOHC(this.HIOCCOCRCIHIRIIOIIHCCOCCOICHRR) + this.HIOCCOCRCIHIRIIOIIHCCOCCOICHRR
         : this.HIOCCOCRCIHIRIIOIIHCCOCCOICHRR + "";
   }

   private String HCIHORIHHCOOORRIOHIHIICCRHHOHC(int var1) {
      if (var1 >= 220) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.AQUA.toString();
      } else if (var1 >= 200) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.LIGHT_PURPLE.toString();
      } else if (var1 >= 175) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.GOLD.toString();
      } else if (var1 >= 125) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.DARK_PURPLE.toString();
      } else if (var1 >= 75) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BLUE.toString();
      } else {
         return var1 >= 10
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.GREEN.toString()
            : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.WHITE.toString();
      }
   }

   public static Optional<RRCRRCORICCHOHHIRCHIROOHIIOHCO> IIIIRHIHROIRCROHHROIHIIHRCRRHO(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 != null && !var0.bridge$isEmpty()) {
         String var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
            var0.bridge$getDisplayName()
         );
         Matcher var2 = HOOIORCCOIHIROIHRRHIIOROOCOCHR.matcher(var1);
         if (var2.matches()) {
            int var5 = COOCCHICCCIIICRHIOCOCIOOORCOCC.IOORROIRICCOCCOOCCIROIIIHRCCCC(var2.group("level"));
            return Optional.of(new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5, true));
         } else {
            String var3 = var1.substring(var1.lastIndexOf(" ") + 1);
            if (IOHOOIOHCHICOCHIICHCICCOHRCIII.COOCRCHRIOOCHCIHCIOCHHIOOIRHIC(var3)) {
               int var4 = IOHOOIOHCHICOCHIICHCICCOHRCIII.RHOOIIHCIOORCHHHRCHORROICICIHO(var3);
               return Optional.of(new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var4, false));
            } else {
               return Optional.empty();
            }
         }
      } else {
         return Optional.empty();
      }
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var1, boolean var2) {
      this.HIOCCOCRCIHIRIIOIIHCCOCCOICHRR = var1;
      this.ORCIHIIIOIHIHCRCIRIOCRHOIOOHCH = var2;
   }

   @Generated
   public int getLevel() {
      return this.HIOCCOCRCIHIRIIOIIHCCOCCOICHRR;
   }

   @Generated
   public boolean IHICOORRROIIIRICIORRCCROCOIHIO() {
      return this.ORCIHIIIOIHIHCRCIRIOCRHOIOOHCH;
   }
}
