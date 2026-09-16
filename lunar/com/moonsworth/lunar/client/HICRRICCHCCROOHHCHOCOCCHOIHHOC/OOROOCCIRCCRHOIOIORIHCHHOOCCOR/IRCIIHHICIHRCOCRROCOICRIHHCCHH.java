package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.File;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
   }

   @Override
   public File CCOICRRHOHHHHROOOROIHIRHHCCIHI() {
      String var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir() + File.separator + "config" + File.separator;
      return new File(var1, this.OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC());
   }

   @Override
   public String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() {
      return "lunar_option_overrides.json";
   }

   @Override
   public void load(JsonObject var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Applying Config option overrides"
      );
      JsonElement var2 = var1.get("mods");
      if (var2 != null && var2.isJsonObject()) {
         JsonObject var3 = var2.getAsJsonObject();
         IHIRRIIORRHORHRORIHOROIRCORCOO var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR();

         for (Entry var6 : var3.entrySet()) {
            try {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = var4.COCOCRIOIHOCHHRIOICCICIOIHHOHH(
                  (String)var6.getKey()
               );
               if (var7 != null) {
                  JsonElement var8 = (JsonElement)var6.getValue();
                  if (var8.isJsonObject()) {
                     JsonObject var9 = var8.getAsJsonObject();
                     this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7, var9);
                     IHHCHHHCRIHOOCOIOOCRIIICIOROIR var10 = var7.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC);
                     if (var10 != null) {
                        for (HCHRIROHHHCORIOCROOCHRCIOROOCI var12 : var10.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO()) {
                           this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var9);
                        }
                     }
                  }
               }
            } catch (Exception var13) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Couldn't apply config mod override for [%s]: %s", var6.getKey(), var13
               );
            }
         }
      }

      JsonElement var14 = var1.get("settings");
      if (var14 != null && var14.isJsonObject()) {
         JsonObject var15 = var14.getAsJsonObject();
         Map var16 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHHIHROORHHOOCCOOCHRIRHRHCRHIH().RHHCIRRROCHIIHOCRIIHIHOOCCCRCR();

         for (Entry var18 : var16.entrySet()) {
            String var19 = ((CIOHHCORHRCCRICCCORIHCRHCCCRRR)var18.getKey()).name();
            JsonElement var20 = var15.get(var19);
            if (var20 != null && var20.isJsonObject()) {
               JsonObject var21 = var20.getAsJsonObject();

               for (HCHRIROHHHCORIOCROOCHRCIOROOCI var23 : ((com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH)var18.getValue())
                  .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23, var21);
               }
            }
         }
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, JsonObject var2) {
      JsonElement var3 = var2.get("enabled");
      if (var3 != null && var3.isJsonPrimitive()) {
         var1.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IOCHHHIIRIHOIRHHICHICCRIHOIOHC)
            .ifPresent(
               var2x -> var2x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1,
                  com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CLIENT_OVERRIDE,
                  var3.getAsBoolean()
               )
            );
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI var1, JsonObject var2) {
      try {
         JsonElement var3 = var2.get(var1.getId());
         if (var3 == null) {
            return;
         }

         if (var1.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRROHCRHORRICIOHCIIHHHORHHHHHH)) {
            return;
         }

         com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR
         );
         if (var4 == null) {
            return;
         }

         Optional var5 = var1.RIROICHCRROROHCCROOCCCCOCHCCRI(var3);
         if (var5.isEmpty()) {
            return;
         }

         Object var6 = var5.get();
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1,
            com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CLIENT_OVERRIDE,
            var6
         );
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, null);
      } catch (Exception var7) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Couldn't apply config option override for [%s]: %s", var1.getId(), var7
         );
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
   }

   @Override
   public void HRIIIOIIRHOHORIRICIOIORRIRCHHO() {
   }
}
