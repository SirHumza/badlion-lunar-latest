package com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Map;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final Map<String, Integer> OCRHHOCHICRRHHORHCOOHOHOCCHHHH = Map.of("offVanilla", 256, "high", 100, "medium", 48, "low", 28, "lowest", 16);

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Object var2,
      JsonObject var3
   ) {
      if (var2 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO
         )
       {
         this.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var3, "entities");
         this.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var3, "tileEntities");
      }
   }

   private void RICRIRRCOHRCOCRRHHCRHRROOIOHHR(JsonObject var1, String var2) {
      JsonElement var3 = var1.get(var2);
      if (var3 != null && !var3.isJsonNull() && var3 instanceof JsonPrimitive var4 && !var4.isNumber()) {
         String var5 = var4.getAsString();
         Integer var6 = OCRHHOCHICRRHHORHCOOHOHOCCHHHH.get(var5);
         if (var6 != null) {
            var1.addProperty(var2, var6);
         }
      }
   }
}
