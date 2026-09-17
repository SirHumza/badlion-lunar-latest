package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   private String IHCHORIIHRCCORIIRHIOCCRRIIIHCR = null;
   private boolean CROORHOCROORRRCIICCOOHOROCIRIC = false;
   private boolean IHORHCICRRHOOCOICRRHHRIIIOHOOR = false;
   private boolean HOCOROIIRHHCCHHIIOIICCHRIIRIIC = false;
   private boolean persistent = true;
   private JsonArray RIIIICCIIRICHOICIOHOROROROICHO = new JsonArray();

   @Override
   public void load(JsonObject var1) {
      if (var1.has("avatar") && !var1.get("avatar").isJsonNull()) {
         this.IHCHORIIHRCCORIIRHIOCCRRIIIHCR = var1.get("avatar").getAsString();
      }

      this.CROORHOCROORRRCIICCOOHOROCIRIC = var1.get("eligibleForMigration").getAsBoolean();
      this.IHORHCICRRHOOCOICRRHHRIIIOHOOR = var1.get("hasMultipleProfiles").getAsBoolean();
      this.HOCOROIIRHHCCHHIIOIICCHRIIRIIC = var1.get("legacy").getAsBoolean();
      this.persistent = var1.get("persistent").getAsBoolean();
      this.RIIIICCIIRICHOICIOHOROROROICHO = var1.getAsJsonArray("userProperites");
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      if (this.IHCHORIIHRCCORIIRHIOCCRRIIIHCR != null) {
         var1.addProperty("avatar", this.IHCHORIIHRCCORIIRHIOCCRRIIIHCR);
      }

      var1.addProperty("eligibleForMigration", this.CROORHOCROORRRCIICCOOHOROCIRIC);
      var1.addProperty("hasMultipleProfiles", this.IHORHCICRRHOOCOICRRHHRIIIOHOOR);
      var1.addProperty("legacy", this.HOCOROIIRHHCCHHIIOIICCHRIIRIIC);
      var1.addProperty("persistent", this.persistent);
      var1.add("userProperites", this.RIIIICCIIRICHOICIOHOROROROICHO);
   }
}
