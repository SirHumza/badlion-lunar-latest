package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;
import java.util.Objects;

public class IHCRORHRORIICHRHRCHRRIRRHHOCOO
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRHIHIRHRCHHRORRRCORHOCIRHRIOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         && var3.has("options")) {
         var3 = var3.getAsJsonObject("options");
         String var4 = "snaplookKey";
         if (var3.has(var4) && !var3.get(var4).isJsonNull()) {
            String var5 = "mode";
            String var6;
            if (var3.has(var5) && !var3.get(var5).isJsonNull()) {
               var6 = var3.get(var5).getAsString();
            } else {
               var6 = "ThirdPerson";
            }

            if (Objects.equals(var6, "Forward")) {
               var3.add("forwardPersonKey", var3.get(var4));
               var3.addProperty("thirdPersonKey", "KEY_NONE");
            } else {
               var3.add("thirdPersonKey", var3.get(var4));
               var3.addProperty("forwardPersonKey", "KEY_NONE");
            }
         }
      }
   }
}
