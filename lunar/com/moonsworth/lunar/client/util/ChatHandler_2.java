package com.moonsworth.lunar.client.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.apache.commons.lang3.text.WordUtils;

public final class IOCCCRIHOCHRCHRHCRHROIRIRHHHIR {
   private static final Pattern CCCRIOIIRIOHOOHOCHOICHRCCOOHRH = Pattern.compile("(.+) (?:<- .+)?");
   private static String server;

   public static void CIRHHCOHHCCIOROICORIRHHRIIROCH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() == null
         || IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentServerData() == null) {
         server = null;
      } else if (!com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
      )) {
         server = null;
      } else {
         String var0 = OCCCCIROIIHCCIRCRRCHHOCOOOCOIC();
         if (var0 == null) {
            server = null;
         } else {
            server = WordUtils.capitalize(RORROHRORCOOOOHRROHIOHCRHHCRCO(var0).toLowerCase(), null);
         }
      }
   }

   public static String RORROHRORCOOOOHRROHIOHCRHHCRCO(String var0) {
      var0 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.stripColor(var0);
      return var0.equalsIgnoreCase("skyblock co-op") ? "SKYBLOCK" : var0;
   }

   private static String OCCCCIROIIHCCIRCRRCHHOCOOOCOIC() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getWorld()
         .bridge$getScoreboard();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = null;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = var0.bridge$getPlayersTeam(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPlayer().bridge$getName()
      );
      if (var2 != null) {
         int var3 = var2.bridge$getChatFormat().getColorIndex();
         if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion()
            == com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORIIROOCCCIHOHRIRIICCRHOICROOC) {
            var1 = var0.bridge$getObjectiveInDisplaySlot(1);
         } else if (var3 >= 0) {
            try {
               var1 = var0.bridge$getObjectiveInDisplaySlot(3 + var3);
            } catch (ArrayIndexOutOfBoundsException var5) {
            }
         }
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var1 != null
         ? var1
         : var0.bridge$getObjectiveInDisplaySlot(1);
      return var6 == null
         ? null
         : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
               var6.bridge$getDisplayName()
            )
         );
   }

   public static boolean OIICRCOIOOHOOHORCRCIOHRCOIIHIC(String var0) {
      return server != null && server.equalsIgnoreCase(var0);
   }

   public static boolean IORIICHCCOROCHIIIICCCOCIHCHHHO(String var0) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPlayer() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPlayer().bridge$getClientBrand().isPresent()) {
         String var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPlayer().bridge$getClientBrand().get();
         if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OOICHHIHHIHROCCRRRIIIIRIRICCIH()) {
            return var1.startsWith(var0);
         }

         Matcher var2 = CCCRIOIIRIOHOOHOCHOICHRCCOOHRH.matcher(var1);
         if (var2.find()) {
            return var2.group(1).startsWith(var0);
         }
      }

      return false;
   }

   @Generated
   private IOCCCRIHOCHRCHRHCRHROIRIRHHHIR() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   @Generated
   public static String getServer() {
      return server;
   }
}
