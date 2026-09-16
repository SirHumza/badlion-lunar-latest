package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Locale;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Override
   public String getCommand() {
      return "partytransfer";
   }

   @Override
   public List<String> getAliases() {
      return List.of("pt", "ptme");
   }

   @Override
   public boolean OCHCROHHIHROOORIIHHHRHCORHRCOI() {
      return true;
   }

   @Override
   public boolean CCOCRCCIOIOCOORHHHOOHCIOCCCOHR() {
      return false;
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1,
      String var2,
      String[] var3,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
   ) {
      String var5 = null;
      if (var3.length == 0) {
         var5 = var2;
      } else {
         com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IHIIROIOIHOHCHICOIIIHOHHCOIOCI()
            .RHHHROHCOCIHRRRORROICHHRIOHHHC()
            .HRCRROOCRCHHRRHCORICIOHHRHRRHR()
            .HRCOOHCRCHOCHOIHIHHHCRHOCCOHRR()
            .orElse(null);
         if (var6 == null) {
            return;
         }

         String var7 = var3[0].toLowerCase(Locale.ROOT);

         for (String var9 : var6.IOICCIIRHOOCCHIOOCRRHRCROOHCCC()) {
            String var10 = var9.toLowerCase(Locale.ROOT);
            if (var10.equals(var7)) {
               var5 = var9;
               break;
            }

            if (var10.startsWith(var7)) {
               if (var5 != null) {
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

               var5 = var9;
            }
         }
      }

      this.RICHICIRHOHRCOCHCOIIRHICOCIHHH("/p transfer " + var5);
   }
}
