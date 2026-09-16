package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @SerializedName("id")
   private final int CHIOIHCHRIHIOORIHIOCHOHHIHRHCO;
   @SerializedName("name")
   private String name;
   @SerializedName("type")
   private String type;
   @SerializedName("metadata")
   private JsonObject CRCRIHORROOHHHROCCIIOOCOOIIIOC;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, JsonObject var2) {
      this.CHIOIHCHRIHIOORIHIOCHOHHIHRHCO = var1;
      this.CRCRIHORROOHHHROCCIIOOCOOIIIOC = var2;
   }

   public int id() {
      return this.CHIOIHCHRIHIOORIHIOCHOHHIHRHCO;
   }

   public JsonObject RRRHORHHRHRHIRCRIOIIIROOCCICRO() {
      return this.CRCRIHORROOHHHROCCIIOOCOOIIIOC;
   }

   @Generated
   public void RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(JsonObject var1) {
      this.CRCRIHORROOHHHROCCIIOOCOOIIIOC = var1;
   }
}
