package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.function.Consumer;
import lombok.Generated;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static boolean isRunning = false;
   private static final int RCOHOCOOROROHIHOCICRCCHCHICIHH = 8;
   private static final int CRHCCORHCIICICHIIIIHIIIRHCHROH = 560;
   private static final int RICOROHCOROOHIOIOHRHOHOORHRIRC = 125;
   private static final int OORCHRCORHRCHRRIHCRCCIICHCOICI = 70;
   private boolean reset = false;
   private final Consumer<RHOCHHIRRCHHHOHOIRROIROHHHIHIO> OCIHOHRHOCIRCCROHHHIHIICCIHHOC = var1 -> this.reset = true;

   public void start() {
      if (GraphicsEnvironment.isHeadless()) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Unable to start polling detection thread in headless client!"
         );
      } else if (!isRunning) {
         isRunning = true;
         Thread var1 = new Thread(this::OOCRCIIORICICIRIIOOCOOCRHROCCH);
         var1.setName("PollingRateDetectionThread");
         var1.start();
         this.handle(RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class, this.OCIHOHRHOCIRCCROHHHIHIICCIHHOC);
      }
   }

   public void OOCRCIIORICICIRIIOOCOOCRHROCCH() {
      boolean var1 = false;
      int var2 = 32;
      int var3 = 0;
      long var4 = 0L;
      long var6 = 0L;
      Point var8 = null;
      long var9 = System.currentTimeMillis();
      int var11 = 0;
      int var12 = 0;

      while (true) {
         if (this.reset) {
            this.reset = false;
            var3 = 0;
            var4 = 0L;
            var6 = 0L;
            var8 = null;
            var9 = System.currentTimeMillis();
            var11 = 0;
            var12 = 0;
         }

         if (var11 > 0) {
            var11--;
         } else {
            if (var12 > 100) {
               var1 = true;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var15) {
            }

            var11 = var12;
         }

         PointerInfo var13 = MouseInfo.getPointerInfo();
         if (var13 != null) {
            Point var14 = var13.getLocation();
            if (!var14.equals(var8)) {
               var8 = var14;
               var6++;
            }

            var4++;
            if (System.currentTimeMillis() - var9 >= 125L) {
               if (var4 / 2L < 70L) {
                  var12++;
               }

               if (var6 - 1L >= 70L) {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$submit(
                        () -> {
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0 = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                              CORCOCICIRIOHROHROIIOOHICCHCRR.WARNING.getIcon(),
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                 .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                                 .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("polling_rate", "title"),
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                 .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                                 .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("polling_rate", "desc")
                           );
                           var0.ORCOCORROHIROCCIORORRRRCHIOOCH(6000L);
                           com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                              .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                              .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .OOCROCIOHHCIIROICOCRHCCCHRCIOI()
                              .CIOHHCORHRCCRICCCORIHCRHCCCRRR("event:lunar.polling_rate", 1);
                        }
                     );
                  break;
               }

               if (var6 + 14L >= 70L) {
                  var12 += 2;
               } else if (var6 + 35L >= 70L) {
                  var12++;
               } else if (var6 != 0L) {
                  if (++var3 > 30) {
                     break;
                  }
               } else {
                  var3 = 0;
               }

               var6 = 0L;
               var4 = 0L;
               if (var1) {
                  if (var2-- == 0) {
                     break;
                  }
               } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RRHHORCCRCHCROOIOCOHOHCOOIOIOH() != HHCCIRHCCCIIRHCROHIORHIRHHIORH.class) {
                  var1 = true;
               }

               var9 = System.currentTimeMillis();
            }
         }
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .CRRRICCRROCOHHOHIICIHORCOORRRH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class, this.OCIHOHRHOCIRCCROHHHIHIICCIHHOC)
         );
   }
}
