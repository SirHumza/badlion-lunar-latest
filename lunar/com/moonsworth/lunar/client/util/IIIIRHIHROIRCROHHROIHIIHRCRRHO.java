package com.moonsworth.lunar.client.util;

import java.util.UUID;
import lombok.Generated;

public final class IIIIRHIHROIRCROHHROIHIIHRCRRHO {
   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, UUID var1, boolean var2) {
      if (var1.version() == 4 || var2 && var1.version() == 1) {
         if (var0.contains(" ")) {
            return true;
         } else {
            return var0.isBlank() ? true : var0.contains("§");
         }
      } else {
         return true;
      }
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0,
      boolean var1
   ) {
      if (var0.bridge$isSelf()) {
         return false;
      }

      if (var0 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         )
       {
         String var2 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0)
            .bridge$getTeamName()
            .orElse("");
         if (var2.contains("npc") || var2.startsWith("CIT-")) {
            return true;
         }
      }

      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.bridge$getName(), var0.bridge$getUniqueID(), var1);
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0,
      boolean var1
   ) {
      if (var0.bridge$isSelf()) {
         return false;
      }

      if (var0 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         )
       {
         String var2 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0)
            .bridge$getTeamName()
            .orElse("");
         if (var2.contains("npc") || var2.startsWith("CIT-")) {
            return true;
         }
      }

      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.bridge$getName(), var0.bridge$getUniqueID(), var1);
   }

   @Generated
   private IIIIRHIHROIRCROHHROIHIIHRCRRHO() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
