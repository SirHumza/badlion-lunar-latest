package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Override
   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonElement var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HRHHIRHOCROHRRCRHIHCRIIRIOHHOH().clear();

      for (JsonElement var3 : var1.getAsJsonArray()) {
         JsonObject var4 = var3.getAsJsonObject();
         String var5 = null;
         if (var4.has("resource")) {
            JsonElement var6 = var4.get("resource");
            if (!var6.isJsonNull()) {
               var5 = var6.getAsString();
            }
         }

         String var7 = var4.get("pattern").getAsString();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HRHHIRHOCROHRRCRHIHCRIIRIOHHOH()
            .OHHRCRIOOCIORORHIOHRICRHHORCIH()
            .add(new com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var7, var5));
      }
   }
}
