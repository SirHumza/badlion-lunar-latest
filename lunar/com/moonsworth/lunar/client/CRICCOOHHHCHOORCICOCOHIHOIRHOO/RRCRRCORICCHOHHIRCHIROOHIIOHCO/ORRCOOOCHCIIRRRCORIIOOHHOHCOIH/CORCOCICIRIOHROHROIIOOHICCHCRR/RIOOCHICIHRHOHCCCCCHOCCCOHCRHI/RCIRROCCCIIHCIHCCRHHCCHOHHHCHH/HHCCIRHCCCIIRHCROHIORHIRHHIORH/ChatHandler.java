package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.util.HashSet;
import java.util.Set;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   HEALER(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO().CROCRIHOIOIIRCCHCOHIIOOHIOHOHO(),
      "Healer",
      NamedTextColor.LIGHT_PURPLE
   ),
   ARCHER(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO().CIORICCOOCHHRRRCCHOIRIOOHCORHR(),
      "Archer",
      NamedTextColor.GREEN
   ),
   TANK(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO().OROCRHCRIIOROIRROOCCOOICIHOROH(),
      "Tank",
      NamedTextColor.GRAY
   ),
   MAGE(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO().CHRRCCIRORIICIIHRCHCORRHROCCHH(),
      "Mage",
      NamedTextColor.AQUA
   ),
   BERSERK(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO().ORRRHORHHCRHHOHOCRRHRIRHIRIOOO(),
      "Berserk",
      NamedTextColor.RED
   );

   private final char firstLetter = this.name().charAt(0);
   private final IIRHCHHOICHRICOOCRORCCIOOIHOIR item;
   private final String chatDisplayName;
   private final NamedTextColor color;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3, String var4, NamedTextColor var5
   ) {
      this.item = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3);
      this.chatDisplayName = var4;
      this.color = var5;
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH fromFirstLetter(char var0) {
      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
         if (var4.firstLetter == var0) {
            return var4;
         }
      }

      com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         new IllegalStateException("Unrecognized first letter: " + var0), "DungeonClass"
      );
      return null;
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH fromDisplayName(String var0) {
      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
         if (var4.chatDisplayName.equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   public char getFirstLetter() {
      return this.chatDisplayName.charAt(0);
   }

   public static Set<String> ids() {
      HashSet var0 = new HashSet();

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : values()) {
         var0.add(var4.chatDisplayName);
      }

      return var0;
   }

   @Generated
   public IIRHCHHOICHRICOOCRORCCIOOIHOIR getItem() {
      return this.item;
   }

   @Generated
   public String getChatDisplayName() {
      return this.chatDisplayName;
   }

   @Generated
   public NamedTextColor getColor() {
      return this.color;
   }
}
