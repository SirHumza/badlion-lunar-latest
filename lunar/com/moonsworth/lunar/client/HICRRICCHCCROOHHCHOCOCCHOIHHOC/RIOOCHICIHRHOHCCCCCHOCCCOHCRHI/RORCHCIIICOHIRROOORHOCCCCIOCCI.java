package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import lombok.Generated;

public class RORCHCIIICOHIRROOORHOCCCCIOCCI
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, JsonObject>
   implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH HCHHCRRCHHHCOHCCCHCHOORCCIHORI = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();

   @Override
   protected Map<String, JsonObject> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      return new HashMap<>();
   }

   @Override
   public String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() {
      return "ui-state.json";
   }

   @Override
   public void init() {
      super.init();
      this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
   }

   @Override
   public void load(JsonObject var1) {
      this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().clear();

      for (Entry var3 : var1.entrySet()) {
         if (((JsonElement)var3.getValue()).isJsonObject()) {
            this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().put((String)var3.getKey(), ((JsonElement)var3.getValue()).getAsJsonObject());
         }
      }

      this.HIIRCHIIRCCHHROCOICCCCIHHROROO();
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      for (Entry var3 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().entrySet()) {
         var1.add((String)var3.getKey(), (JsonElement)var3.getValue());
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Double var2, Double var3, Double var4, Double var5, Boolean var6, Boolean var7) {
      if (var1 != null && !var1.isBlank()) {
         JsonObject var8 = this.ORHOHHHCOOCCOHIHIHOIOOOOOHOORI("windows");
         JsonObject var9 = var8.has(var1) && var8.get(var1).isJsonObject() ? var8.getAsJsonObject(var1).deepCopy() : new JsonObject();
         if (var2 != null) {
            var9.addProperty("width", var2);
         }

         if (var3 != null) {
            var9.addProperty("height", var3);
         }

         if (var4 != null) {
            var9.addProperty("x", var4);
         }

         if (var5 != null) {
            var9.addProperty("y", var5);
         }

         if (var6 != null) {
            var9.addProperty("fullscreen", var6);
         }

         if (var7 != null) {
            var9.addProperty("shown", var7);
         }

         var8.add(var1, var9);
         this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
         this.HIIRCHIIRCCHHROCOICCCCIHHROROO();
      }
   }

   public void IIHHICHCCCOHCHROIRIHICCHHOROCR(String var1, String var2) {
      if (var1 != null && !var1.isBlank()) {
         JsonObject var3 = this.ORHOHHHCOOCCOHIHIHOIOOOOOHOORI("sorts");
         var3.addProperty(var1, var2);
         this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
         this.HIIRCHIIRCCHHROCOICCCCIHHROROO();
      }
   }

   public void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(JsonObject var1) {
      if (var1 != null) {
         this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().put("quickNavigation", var1);
         this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
         this.HIIRCHIIRCCHHROCOICCCCIHHROROO();
      }
   }

   private JsonObject ORHOHHHCOOCCOHIHIHOIOOOOOHOORI(String var1) {
      return this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().computeIfAbsent(var1, var0 -> new JsonObject());
   }

   private void HIIRCHIIRCCHHROCOICCCCIHHROROO() {
      for (Entry var2 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().entrySet()) {
         this.HCHHCRRCHHHCOHCCCHCHOORCCIHORI.IIHRRHORCRCROCHHOHORCHCROCIHRO((String)var2.getKey(), ((JsonObject)var2.getValue()).deepCopy());
      }
   }

   @Generated
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.HCHHCRRCHHHCOHCCCHCHOORCCIHORI;
   }
}
