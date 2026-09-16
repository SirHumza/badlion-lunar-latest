package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Nullable
   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      return null;
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("title", this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("reportABug"));
      var1.addProperty("shortDescription", this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("shortDescriptionChars"));
      var1.addProperty("description", this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("description"));
      JsonArray var2 = new JsonArray();

      for (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()) {
         var2.add(var6.toString());
      }

      var1.add("categories", var2);
      return var1;
   }

   @Override
   public String getLanguagePath() {
      return "gui.bug";
   }
}
