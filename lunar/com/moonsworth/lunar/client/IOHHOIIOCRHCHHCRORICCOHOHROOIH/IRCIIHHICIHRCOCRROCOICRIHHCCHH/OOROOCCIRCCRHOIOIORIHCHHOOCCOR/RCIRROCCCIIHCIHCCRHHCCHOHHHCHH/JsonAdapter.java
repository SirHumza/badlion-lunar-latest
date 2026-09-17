package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.webosr.javascript.CallbackJS;

public class IRRCCOICORICIHCHRHIHIHROIRHOCR
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @CallbackJS("ping")
   public static void CCRIIHCIOCOROCCOHHHCOIOCOOHIHC(String var0) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .COIIOIICHIIHIIRCOHCHIHHRHROCRO()
         .RROOHOHRIIOIRCIORHRHIRCICIROCO(var0)
         .whenComplete((var1, var2) -> {
            JsonElement var3;
            if (var2 != null) {
               JsonObject var4 = new JsonObject();
               var4.addProperty("status", "error");
               var4.addProperty("address", var0);
               var4.addProperty("ping", -1);
               var4.addProperty("playersOnline", -1);
               var4.addProperty("playersMax", -1);
               var4.addProperty("error", "Unable to ping server.");
               var3 = var4;
            } else {
               var3 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJsonTree(var1);
            }

            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(() -> IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var3));
         });
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, JsonElement var1) {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
      if (var2 != null && var2.COIHRHIHIHIIRCCOHOIHHOOIRRCOII().HHIICHIOCCIICOCROHHHOCIRCOHROO() != null) {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.COIHRHIHIHIIRCCOHOIHHOOIRRCOII().HHIICHIOCCIICOCROHHHOCIRCOHROO(), "serverPing:result", var1);
      }
   }

   @Override
   public JsonElement provide() {
      return null;
   }

   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      return null;
   }
}
