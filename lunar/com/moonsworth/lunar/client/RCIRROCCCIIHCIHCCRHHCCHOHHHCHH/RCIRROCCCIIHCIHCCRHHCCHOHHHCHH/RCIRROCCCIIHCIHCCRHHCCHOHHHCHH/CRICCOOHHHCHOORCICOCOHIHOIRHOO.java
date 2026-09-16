package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.Color;
import java.util.function.IntConsumer;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public CRICCOOHHHCHOORCICOCOHIHOIRHOO() {
      super("glint", "Glint");
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
         120
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var1
   ) {
      if (!var1.isCancelled()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var2 = var1.HHIIOHOORHHCCHRHHRCIORCROORCOI();
         if (!var2.OOICHHIHHIHROCCRRRIIIIRIRICCIH()) {
            IntConsumer var3 = var1.CRICRCIOOOHIIHROORIRCCORIHICCO();
            if (var3 != null) {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var4 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1.HOICHCICORRCCOCICIIROIIRIIRHHR();
               if (var4 != null) {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                     var4
                  );
                  if (var5 != null) {
                     String var6 = var5.bridge$getString("glint");
                     int var7 = var5.bridge$getInteger("glint");
                     if (var7 != 0 || !var6.isEmpty()) {
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                           .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                           .IIIIIHICORRCOHCCIHRIRHRCRCCRIH();
                        if (var8 != null) {
                           com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .CIRCCCHCCCROROIIOIHIOROIHCHRCH();
                           if (!var6.isEmpty()) {
                              var7 = Color.decode(var6).getRGB();
                              var9.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.getId(), "Hex");
                           } else {
                              var9.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.getId(), "RGB");
                           }

                           com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = var1.COOCHHRROHRCCIOIOHRRIIOHCIRCCH();
                           if (var10
                                 == com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GUI
                              || var10
                                 == com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ITEM
                              )
                            {
                              var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var7);
                              var1.setCancelled(true);
                           } else if (var10
                                 == com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.EQUIPPED_ARMOR
                              && var1.HCICROIHRHRCORRHCOIHIHCCCCHRHH() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var11
                              )
                            {
                              var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                 var2, () -> var3.accept(-1), var11.CCHHCROIOCRIIRICHRRIIHCHCOHHOI() + var2.HOHIHCIHIHRCOOIOCOHIOHROHHIOHR(), var7
                              );
                              var1.setCancelled(true);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
