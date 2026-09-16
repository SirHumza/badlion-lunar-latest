package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import com.moonsworth.webosr.javascript.CallbackJS;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final IIHRHCCOOHOOOOCHRRCOROOIOHCOOO OOHCICROCIHROHHOCCIIOHCHOOIICO = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
      .HOHHHORIIORRRROHRIIRCHCCICHHCI();

   @Nullable
   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      return null;
   }

   @Override
   public JsonElement provide() {
      JsonArray var1 = new JsonArray();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : OOHCICROCIHROHHOCCIIOHCHOOIICO.IOCICCICOCORRIOCHHORCHCRCOHHHR()) {
         var1.add(var3.provide());
      }

      return var1;
   }

   @CallbackJS("searchForWaypoints")
   public static void RICCOOCHIHHCROOCCRCOIRHCCCCICH() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> {
               for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 : OOHCICROCIHROHHOCCIIOHCHOOIICO.IOCICCICOCORRIOCHHORCHCRCOHHHR()) {
                  ORCOCORROHIROCCIORORRRRCHIOOCH.RHOHHCCOOIHIIRCORRRIORCRIIOHHI()
                     .execute(
                        () -> {
                           JsonObject var1x = var1.provide().getAsJsonObject();

                           try {
                              JsonObject var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
                              if (var2 != null) {
                                 var1x.add("decoded", var2);
                              }
                           } catch (Exception var3) {
                              com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                                 "Waypoints", var3.getMessage()
                              );
                           }

                           com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                 com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                                    .COIHRHIHIHIIRCCOHOIHHOOIRRCOII()
                                    .HHIICHIOCCIICOCROHHHOCIRCOHROO(),
                                 "waypoints:searchResult",
                                 var1x
                              );
                        }
                     );
               }
            }
         );
   }

   @CallbackJS("importWaypoints")
   public static String HORIHOCOIORHOOROIROICICICRHHHR(String var0) {
      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : OOHCICROCIHROHHOCCIIOHCHOOIICO.IOCICCICOCORRIOCHHORCHCRCOHHHR()) {
         if (var2.getName().equals(var0)) {
            JsonObject var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
            if (var3 != null) {
               return var3.toString();
            }
         }
      }

      return null;
   }

   private static JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0
   ) {
      try {
         List var1 = var0.HHOICCCRHIIOIHIHHHRIROIHOROIHI();
         JsonObject var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HOHHHORIIORRRROHRIIRCHCCICHHCI()
            .HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
         JsonObject var3 = new JsonObject();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HOHHHORIIORRRROHRIIRCHCCICHHCI().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1);
         var3.add("context", var2);
         return var3;
      } catch (IOException var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
