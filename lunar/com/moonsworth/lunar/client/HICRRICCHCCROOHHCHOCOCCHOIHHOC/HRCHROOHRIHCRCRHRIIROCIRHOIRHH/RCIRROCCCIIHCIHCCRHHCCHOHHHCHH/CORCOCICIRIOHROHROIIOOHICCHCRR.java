package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;

public class CORCOCICIRIOHROHROIIOOHICCHCRR
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Override
   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonElement var1) {
      JsonArray var2 = var1.getAsJsonArray();
      ArrayList var3 = new ArrayList(var2.size());
      ArrayList var4 = new ArrayList(var2.size());
      Iterator var5 = var2.iterator();

      while (true) {
         JsonObject var7;
         ArrayList var8;
         boolean var12;
         boolean var16;
         boolean var17;
         do {
            if (!var5.hasNext()) {
               if (!var4.isEmpty()) {
                  var4.forEach(IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().OORRROHOHHOOROORRRCCCOCCOOCCHI()::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
               } else {
                  var3.forEach(IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().OORRROHOHHOOROORRRCCCOCCOOCCHI()::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
               }

               return;
            }

            JsonElement var6 = (JsonElement)var5.next();
            var7 = var6.getAsJsonObject();
            var8 = new ArrayList();

            for (JsonElement var10 : var7.get("versions").getAsJsonArray()) {
               Optional var11 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.get(var10.getAsString());
               if (!var11.isEmpty()) {
                  var8.add((com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var11.get());
               }
            }

            var16 = false;
            if (var7.has("removable")) {
               var16 = var7.get("removable").getAsBoolean();
            }

            var17 = false;
            if (!var7.has("modpacks")) {
               break;
            }

            JsonArray var18 = var7.get("modpacks").getAsJsonArray();
            if (var18.isEmpty()) {
               break;
            }

            var17 = true;
            var12 = false;

            for (JsonElement var14 : var18) {
               String var15 = var14.getAsString();
               if (Objects.equals(var15, IRRCHICCRHCHRRCHIOHIIRIORIRHRI.HOOHROHCIHOICOCOIICCOCOICROIRR)
                  || Objects.equals(var15, IRRCHICCRHCHRRCHIOHIIRIORIRHRI.RHHRRICCIHHIHRHIORRRRRROCHIHHH)) {
                  var12 = true;
                  break;
               }
            }
         } while (!var12);

         com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var19 = new com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var7.get("name").getAsString(),
            var7.get("ip").getAsString(),
            var7.get("expirationDate").getAsLong(),
            var8.contains(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion()),
            var16
         );
         if (var17) {
            var4.add(var19);
         } else {
            var3.add(var19);
         }
      }
   }
}
