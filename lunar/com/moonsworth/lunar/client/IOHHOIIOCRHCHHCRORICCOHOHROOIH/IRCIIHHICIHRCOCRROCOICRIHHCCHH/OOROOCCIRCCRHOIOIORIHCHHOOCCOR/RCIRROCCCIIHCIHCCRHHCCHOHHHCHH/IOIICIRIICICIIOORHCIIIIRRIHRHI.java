package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.webosr.javascript.CallbackJS;

public class IOIICIRIICICIIOORHCIIIIRRIHRHI
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRCCCRCHIRRCRORCOROHHOHCCOIORH = null;

   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .OIOOIHRRCRIIOCCRROOOROOIOCCOHO()
         .CORROIRHRRIHCRHIROHHORCCHIIRCO();
   }

   @Override
   public JsonElement provide() {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .OIOOIHRRCRIIOCCRROOOROOIOCCOHO()
         .CHRRCCOOHCCRRCIRRIOCIROCOOCIHO();
      return this.HRRORHCRHHRROHIOROOOORRIRRCCIC();
   }

   @CallbackJS("addJam")
   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Integer var0, int var1) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC();
      var2.OIROOCRCIRRRCICRHCCIRCCHRIRHRR(var0).ifPresent(var2x -> {
         var2x.IHIIIRHOOCHRCCCCIORIROCOIRRHCC(var1);
         var2.CRHCHHCHHICCHOHOHHCOICCRIRHHRR();
         var2.OOIHIRRHCRHOCRCCCIHIHIIHOOIOIH();
         var2.RORCCRRCOHOHHOHOCOOIRORHIRIICR();
      });
   }

   @CallbackJS("removeJam")
   public static void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(Integer var0) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC();
      var1.OIROOCRCIRRRCICRHCCIRCCHRIRHRR(var0).ifPresent(var1x -> {
         var1x.IHIIIRHOOCHRCCCCIORIROCOIRRHCC(0);
         var1.CRHCHHCHHICCHOHOHHCOICCRIRHHRR();
         var1.OOIHIRRHCRHOCRCCCIHIHIIHOOIOIH();
         var1.RORCCRRCOHOHHOHOCOOIRORHIRIICR();
      });
   }

   @CallbackJS("previewJam")
   public static void HRRHRCCOOIOIIIRORIOOORORHOORIH(Integer var0) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .OIOOIHRRCRIIOCCRROOOROOIOCCOHO()
         .HRRIOCHRORRIIHCHCHOOOCHHCHORIC()
         .stream()
         .filter(var1 -> var1.getJamId() == var0)
         .findFirst()
         .ifPresent(
            var0x -> {
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCCIIOHOROCIICCOOORHCHRRCHROHC()
                  .get(var0x.getJamId());
               if (var1 != null) {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                     .CIICCRHHHOHOIOHCHRHOORCICRCORC("Previewing \"" + var1.getName() + "\"");
                  if (CRCCCRCHIRRCRORCOROHHOHCCOIORH != null) {
                     try {
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                           .bridge$getSoundHandler()
                           .bridge$destroySound(CRCCCRCHIRRCRORCOROHHOHCCOIORH.getSource());
                        CRCCCRCHIRRCRORCOROHHOHCCOIORH = null;
                     } catch (Exception var3) {
                        var3.printStackTrace();
                     }
                  }

                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .OIOOIHRRCRIIOCCRROOOROOIOCCOHO()
                     .CORCOCICIRIOHROHROIIOOHICCHCRR(
                        var1.OHRRCHIHIROCICRICCCOIRCCOROIIH().toString(),
                        var1x -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                           .bridge$submit(
                              () -> {
                                 Object var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                                    .bridge$getSoundHandler()
                                    .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                       var1x,
                                       IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                          .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                                          .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                                          .IROHIRRRICIICHIHHHCOIIORHCRHOH()
                                          .get(),
                                       false
                                    );
                                 if (var2 != null) {
                                    CRCCCRCHIRRCRORCOROHHOHCCOIORH = new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                       System.currentTimeMillis(), var2, var1x, var1.getId()
                                    );
                                 }
                              }
                           )
                     );
               }
            }
         );
   }

   @CallbackJS("stopPreview")
   public static void RRRRRCICOIOOIHIICIROHICHCOIRII() {
      if (CRCCCRCHIRRCRORCOROHHOHCCOIORH != null) {
         try {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getSoundHandler()
               .bridge$destroySound(CRCCCRCHIRRCRORCOROHHOHCCOIORH.getSource());
            CRCCCRCHIRRCRORCOROHHOHCCOIORH = null;
         } catch (Exception var1) {
            var1.printStackTrace();
         }
      }
   }
}
