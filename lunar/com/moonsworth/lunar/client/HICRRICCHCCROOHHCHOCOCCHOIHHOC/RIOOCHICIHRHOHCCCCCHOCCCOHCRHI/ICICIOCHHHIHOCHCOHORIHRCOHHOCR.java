package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RRORCOIRRIICOOICOIOCORHORCHCOC;
import io.netty.util.internal.ConcurrentSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public final class ICICIOCHHHIHOCHCOHORIHRCOHHOCR
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH>
   implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final Set<String> IHCORRRIOIRCHCOORCIROHCHCIRRIO = new ConcurrentSet();
   private final Map<String, ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OCCHIRICHHHIRICOOCRCOHCRCIRROR = new ConcurrentHashMap<>();

   @Override
   public void init() {
      super.init();
      this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
   }

   @Override
   protected Map<String, com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      return new LinkedHashMap<>();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      if (!var1.RRRORIHCCIORHIIHOHRRRCHOICCICI() || !this.IHCORRRIOIRCHCOORCIROHCHCIRRIO.contains(var1.HHIOHCROORIRCOCICOCIHIIIHOCHIH())) {
         super.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().put(var1.HHIOHCROORIRCOCICOCIHIIIHOCHIH(), var1);
      }
   }

   public boolean CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .get(var1.bridge$serverIP());
      return var2.RRRORIHCCIORHIIHOHRRRCHOICCICI();
   }

   private boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return var1.RRRORIHCCIORHIIHOHRRRCHOICCICI() && this.IHCORRRIOIRCHCOORCIROHCHCIRRIO.contains(var1.HHIOHCROORIRCOCICOCIHIIIHOCHIH())
         ? false
         : var1.CCHRIROICCHCRIOHIRIOCIOCROHRHH();
   }

   @Override
   public Map<String, com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH> RHHCIRRROCHIIHOCRIIHIHOOCCCRCR() {
      LinkedHashMap var1 = new LinkedHashMap(super.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR());
      RRORCOIRRIICOOICOIOCORHORCHCOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, this::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
      return var1;
   }

   public Map<String, com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH> RCCOHRIIRRIHHHHCRIOHRHRRHIOIOH() {
      LinkedHashMap var1 = new LinkedHashMap(super.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR());
      RRORCOIRRIICOOICOIOCORHORCHCOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, this::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
      RRORCOIRRIICOOICOIOCORHORCHCOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         var1, com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH::COHCHRIIRIORHOCIICHRIHCOCCCORH
      );
      return var1;
   }

   @Override
   public String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() {
      return "pinned_manager.json";
   }

   @Override
   public void load(JsonObject var1) {
      for (JsonElement var3 : var1.getAsJsonArray("removed")) {
         this.IHCORRRIOIRCHCOORCIROHCHCIRRIO.add(var3.getAsString());
      }

      JsonElement var7 = var1.get("packChoices");
      if (var7 != null && var7.isJsonObject()) {
         for (Entry var4 : var7.getAsJsonObject().entrySet()) {
            if (((JsonElement)var4.getValue()).isJsonPrimitive()) {
               try {
                  this.OCCHIRICHHHIRICOOCRCOHCRCIRROR
                     .put(
                        (String)var4.getKey(),
                        ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.valueOf(((JsonElement)var4.getValue()).getAsString())
                     );
               } catch (IllegalArgumentException var6) {
               }
            }
         }
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      JsonArray var2 = new JsonArray();

      for (String var4 : this.IHCORRRIOIRCHCOORCIROHCHCIRRIO) {
         var2.add(new JsonPrimitive(var4));
      }

      var1.add("removed", var2);
      JsonObject var6 = new JsonObject();

      for (Entry var5 : this.OCCHIRICHHHIRICOOCRCOHCRCIRROR.entrySet()) {
         var6.addProperty((String)var5.getKey(), ((ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var5.getValue()).name());
      }

      var1.add("packChoices", var6);
   }

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      this.IHCORRRIOIRCHCOORCIROHCHCIRRIO.add(var1.bridge$serverIP());
      this.OCCHIRICHHHIRICOOCRCOHCRCIRROR.remove(var1.bridge$serverIP());
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(this::HRIIIOIIRHOHORIRICIOIORRIRCHHO);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
      if (this.OCCHIRICHHHIRICOOCRCOHCRCIRROR.put(var1, var2) != var2) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(this::HRIIIOIIRHOHORIRICIOIORRIRCHHO);
      }
   }

   public void OOHRICHCIIIICRCOOHCORHHIHICOHO(String var1) {
      if (this.OCCHIRICHHHIRICOOCRCOHCRCIRROR.remove(var1) != null) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(this::HRIIIOIIRHOHORIRICIOIORRIRCHHO);
      }
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.OCCHIRICHHHIRICOOCRCOHCRCIRROR.get(var1.bridge$serverIP());
      if (var2 == ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ENABLED) {
         var1.bridge$enableResourcePack();
      } else if (var2 == ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DISABLED) {
         var1.bridge$disableResourcePack();
      }
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      ENABLED,
      DISABLED;
   }
}
