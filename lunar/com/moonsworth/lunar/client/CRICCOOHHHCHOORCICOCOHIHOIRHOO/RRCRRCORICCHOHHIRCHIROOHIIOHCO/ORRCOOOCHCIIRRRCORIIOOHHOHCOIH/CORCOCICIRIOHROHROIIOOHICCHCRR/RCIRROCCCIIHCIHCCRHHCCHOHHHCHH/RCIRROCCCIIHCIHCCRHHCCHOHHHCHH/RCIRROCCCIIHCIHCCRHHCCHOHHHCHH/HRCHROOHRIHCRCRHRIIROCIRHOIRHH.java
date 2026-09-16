package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Locale;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Override
   public String getCommand() {
      return "kick";
   }

   @Override
   public List<String> getAliases() {
      return List.of("k");
   }

   @Override
   public boolean OCHCROHHIHROOORIIHHHRHCORHRCOI() {
      return true;
   }

   @Override
   public boolean isEnabledByDefault() {
      return false;
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1,
      String var2,
      String[] var3,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
   ) {
      if (var3.length >= 1) {
         com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IHIIROIOIHOHCHICOIIIHOHHCOIOCI()
            .RHHHROHCOCIHRRRORROICHHRIOHHHC()
            .HRCRROOCRCHHRRHCORICIOHHRHRRHR()
            .HRCOOHCRCHOCHOIHIHHHCRHOCCOHRR()
            .orElse(null);
         if (var5 != null) {
            String var6 = var3[0].toLowerCase(Locale.ROOT);
            String var7 = null;

            for (String var9 : var5.IOICCIIRHOOCCHIOOCRRHRCROOHCCC()) {
               String var10 = var9.toLowerCase(Locale.ROOT);
               if (var10.equals(var6)) {
                  var7 = var9;
                  break;
               }

               if (var10.startsWith(var6)) {
                  if (var7 != null) {
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                              "multiplePartyMembers", var3[0]
                           )
                        );
                     return;
                  }

                  var7 = var9;
               }
            }

            this.RICHICIRHOHRCOCHCOIIRHICOCIHHH("/p kick " + var7);
         }
      }
   }
}
