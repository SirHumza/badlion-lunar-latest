package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import java.util.Optional;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static String HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DUNGEON_ROUTES) String var0,
      Object... var1
   ) {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("features.SKYBLOCK.dungeonRoutes", var0, var1);
   }

   public static Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      String var1,
      TextColor var2
   ) {
      TextComponent var3 = Component.text(HHCCIRHCCCIIRHCROHIORHIRHHIORH("no"), NamedTextColor.RED);
      TextComponent var4 = Component.text(HHCCIRHCCCIIRHCROHIORHIRHHIORH("yes"), NamedTextColor.GREEN);
      return Component.text(var0.ROCCHOHOIICCCROOHIHHHRORHCCIRI(), var2)
         .hoverEvent(
            HoverEvent.showText(
               ((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)((TextComponent)Component.text(
                                                                  HHCCIRHCCCIIRHCROHIORHIRHHIORH("roomIdColon")
                                                               )
                                                               .append(Component.text(var1, NamedTextColor.YELLOW)))
                                                            .appendNewline())
                                                         .append(Component.text(HHCCIRHCCCIIRHCROHIORHIRHHIORH("routeNameColon"))))
                                                      .append(Component.text(var0.ROCCHOHOIICCCROOHIHHHRORHCCIRI(), NamedTextColor.YELLOW)))
                                                   .appendNewline())
                                                .append(Component.text(HHCCIRHCCCIIRHCROHIORHIRHHIORH("aoteNeededColon"))))
                                             .append(var0.CIOHHHHCRHHIICOCOIHCIICOICCHRC().needsAote() ? var4 : var3))
                                          .appendNewline())
                                       .append(Component.text(HHCCIRHCCCIIRHCROHIORHIRHHIORH("etherwarpNeededColon"))))
                                    .append(var0.CIOHHHHCRHHIICOCOIHCIICOICCHRC().needsEtherwarp() ? var4 : var3))
                                 .appendNewline())
                              .append(Component.text(HHCCIRHCCCIIRHCROHIORHIRHHIORH("pickaxeNeededColon"))))
                           .append(var0.CIOHHHHCRHHIICOCOIHCIICOICCHRC().getPickaxeTier().getFullDisplayComponent()))
                        .appendNewline())
                     .append(Component.text(HHCCIRHCCCIIRHCROHIORHIRHHIORH("pearlsNeededColon"))))
                  .append(var0.CIOHHHHCRHHIICOCOIHCIICOICCHRC().isPearls() ? var4 : var3)
            )
         );
   }

   public static Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var0,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      Component var2 = Component.text("");
      if (var0 == null) {
         return var2.append(Component.text("null", NamedTextColor.GRAY));
      }

      boolean var3 = true;

      for (String var7 : var0.split(";")) {
         if (!var3) {
            var2 = var2.append(Component.text(";", NamedTextColor.GRAY));
         }

         var3 = false;
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHOHCRIHHOOICHHHHIHRHRCCCHHHC(
            var7
         );
         if (var8 == null) {
            var2 = var2.append(Component.text(var7, NamedTextColor.RED));
         } else {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HORCOCRHHOIIOCCIRRHHRCORCCHIIO()
               .CORCCCIRRHHRHHCIIIHCOCCHRHCORC();
            Optional var10 = var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9);
            if (var10.isPresent()) {
               var2 = var2.append(
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     ((HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var10.get()).RRICIOCOCICRHRIHICCHHHRIROCHCO(), var1.getBlcID(), NamedTextColor.AQUA
                  )
               );
            } else {
               var2 = var2.append(
                  Component.text(var8.ORHOROHCOHHHIICCROIROICORHHIIH(), NamedTextColor.RED)
                     .hoverEvent(HoverEvent.showText(Component.text(HHCCIRHCCCIIRHCROHIORHIRHHIORH("unableToFindRoute"))))
               );
            }

            var2 = var2.append(Component.text(":", NamedTextColor.WHITE))
               .append(Component.text(String.valueOf(var8.HHRIHOIHORCOIOOIROICHCRRHCCRIR()), NamedTextColor.YELLOW));
         }
      }

      return var2;
   }

   public static Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0
   ) {
      Component var1 = Component.text(var0.text);
      if (var0.text.length() > 50) {
         var1 = Component.text(var0.text.substring(0, 47)).append(Component.text("...", NamedTextColor.GRAY));
      }

      return var1.hoverEvent(
         HoverEvent.showText(
            Component.text(
               HHCCIRHCCCIIRHCROHIORHIRHHIORH("nameColon", var0.text)
                  + "\n"
                  + HHCCIRHCCCIIRHCROHIORHIRHHIORH("xColon", Math.round(var0.pos.x))
                  + "\n"
                  + HHCCIRHCCCIIRHCROHIORHIRHHIORH("yColon", Math.round(var0.pos.y))
                  + "\n"
                  + HHCCIRHCCCIIRHCROHIORHIRHHIORH("zColon", Math.round(var0.pos.z))
            )
         )
      );
   }

   public static String IOOHRICRRRCHOIROCOIORIHCRHIHRH(String var0) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HORCOCRHHOIIOCCIRRHHRCORCCHIIO()
         .CORCCCIRRHHRHHCIIIHCOCCHRHCORC();
      StringBuilder var2 = new StringBuilder();
      boolean var3 = true;

      for (String var7 : var0.split(";")) {
         if (!var3) {
            var2.append(";");
         }

         var3 = false;
         if (!var7.contains(":")) {
            var7 = var7 + ":0";
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
         String var9 = var8.bridge$getName() + "-" + var7;
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var10 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHOHCRIHHOOICHHHHIHRHRCCCHHHC(
            var7
         );
         if (var10 != null && var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1).isEmpty()) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var11 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHOHCRIHHOOICHHHHIHRHRCCCHHHC(
               var9
            );
            if (var11 != null && var11.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1).isPresent()) {
               var7 = var9;
            }
         }

         var2.append(var7);
      }

      return var2.toString();
   }
}
