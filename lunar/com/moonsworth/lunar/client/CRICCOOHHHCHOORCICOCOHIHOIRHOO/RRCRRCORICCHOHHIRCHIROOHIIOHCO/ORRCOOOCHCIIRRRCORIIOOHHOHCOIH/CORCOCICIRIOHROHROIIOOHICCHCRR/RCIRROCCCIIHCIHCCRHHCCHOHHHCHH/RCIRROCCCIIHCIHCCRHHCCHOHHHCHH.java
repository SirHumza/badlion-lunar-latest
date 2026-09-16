package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import lombok.Generated;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final TextComponent ICOIORHIROCOCIHCICHRRCIHOHHCCR = (TextComponent)((TextComponent)Component.text("[", NamedTextColor.WHITE)
         .append(Component.text("LC", NamedTextColor.AQUA)))
      .append(Component.text("] ", NamedTextColor.WHITE));

   public static void OROORIICIOOOOIHIRHRHOIOCIHRRIO(String var0) {
      sendMessage(Component.text(var0, NamedTextColor.GOLD));
   }

   public static Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Component var0, String var1) {
      return var0.append(Component.text(" ")).append(ICOIORHIROCOCIHCICHRRCIHOHHCCR).append(Component.text(var1, NamedTextColor.GOLD));
   }

   public static void sendMessage(Component var0) {
      HICRRICCHCCROOHHCHOCOCCHOIHHOC(ICOIORHIROCOCIHCICHRRCIHOHHCCR.append(var0));
   }

   public static void HICRRICCHCCROOHHCHOCOCCHOIHHOC(Component var0) {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGuiIngame();
      if (var1 != null) {
         IHIRRIIORRHORHRORIHOROIRCORCOO var2 = var1.bridge$getChatGUI();
         if (var2 != null) {
            var2.bridge$addMessage(RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(var0));
         }
      }
   }

   public static void IIRHCHHOICHRICOOCRORCCIOOIHOIR(String var0, boolean var1) {
      if (var1) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .ORCOCORROHIROCCIORORRRRCHIOOCH("SkyBlock Mod", "Feature " + var0 + " has been toggled [ON]");
      } else {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .ORCOCORROHIROCCIORORRRRCHIOOCH("SkyBlock Mod", "Feature " + var0 + " has been toggled [OFF]");
      }
   }

   @Generated
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
