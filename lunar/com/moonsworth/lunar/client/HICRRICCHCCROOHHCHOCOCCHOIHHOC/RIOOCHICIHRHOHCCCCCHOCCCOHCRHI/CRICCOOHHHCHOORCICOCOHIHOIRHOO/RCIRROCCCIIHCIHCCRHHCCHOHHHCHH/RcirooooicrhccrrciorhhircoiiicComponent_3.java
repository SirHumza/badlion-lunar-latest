package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private JsonArray HOIIHORIRHRRHHOOIRORRHHROORHOC = new JsonArray();
   private JsonArray RRIORHCROORHRRROOHCIHCORCHHOOC = new JsonArray();
   private JsonArray ORROCHIHOHRICIOIOCHHHHRHIOCHIH = new JsonArray();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      JsonObject var3 = new JsonObject();
      String var4 = var2.asMojangType();
      int var5 = var2.getCount();
      JsonArray var6 = new JsonArray();

      for (int var7 = 0; var7 < var5; var7++) {
         var6.add(0);
      }

      var3.addProperty("name", var1);
      var3.addProperty("type", var4);
      var3.addProperty("count", var5);
      var3.add("values", var6);
      this.RRIORHCROORHRRROOHCIHCORCHHOOC.add(var3);
      return this;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIHHROORCIRHOHOHRCROROROOIOOIO(String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("name", var1);
      this.HOIIHORIRHRRHHOOIRORRHHROORHOC.add(var2);
      return this;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HCHCICHCRROORRRHIOHIIHHCRCHHII(String var1) {
      this.ORROCHIHOHRICIOIOCHHHHRHIOCHIH.add(var1);
      return this;
   }

   public JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, RCIROOOOICRHCCRRCIORHHIRCOIIIC var2) {
      JsonObject var3 = new JsonObject();
      String var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 26 ? var1.toString() : var1.bridge$getPath();
      String var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 26 ? var2.toString() : var2.bridge$getPath();
      var3.addProperty("vertex", var4);
      var3.addProperty("fragment", var5);
      var3.add("samplers", this.HOIIHORIRHRRHHOOIRORRHHROORHOC);
      var3.add("uniforms", this.RRIORHCROORHRRROOHCIHCORCHHOOC);
      var3.add("attributes", this.ORROCHIHOHRICIOIOCHHHHRHIOCHIH);
      return var3;
   }
}
