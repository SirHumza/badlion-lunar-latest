package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOIHOROOIOOCOIHCRIRIRIRRICIIHC;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOIHOROOIOOCOIHCRIRIRIRRICIIHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private boolean HCCHIIRCCOHHCHRRCRCRHHCIHOIHRC;
   private List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> COCCRORHOCIIOIIOHCRCOCCIRHOHHH;
   private final Map<String, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH> OHCHHRRHICOCROCIRRCOCROCRRICCR = new HashMap<>();
   private final Set<String> RIROHROCORIIHIIHCHROIOICIHHCOI = new LinkedHashSet<>();
   private final IRCRRHRCIRHIHIHROHCRRHIIHHHHCH OOCCCOIHHOICHCRHHCCIHOIHIHHCRR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRCIHRIHOHORIROHIROORCOCCHOOI(
         "quickplayUIKeybind"
      )
      .OHHRIOHROOIHOROCIRHCHORIHRRRRI(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_R)
      .IHCOIHIICIIHOOIICCHHCRORHORHCI(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      super(false);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHHOCHOCHOCCHIIICRHRRROICHHIIC,
         var0 -> var0.RIORIRIHOIRCIROHCRHHCHIHIRHRIH()
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL)
      );
   }

   @Override
   public String getId() {
      return "QUICKPLAY";
   }

   @Override
   public void COIHORRCHRRCHOCIRHHRRIOIHRIHCC(boolean var1) {
      if (var1 && !this.HCCHIIRCCOHHCHRRCRCRHHCIHOIHRC) {
         new Thread(() -> {
            Path var1x = IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHIRHHICRHCCHRHIIIOIRRROCRHRIH.resolve("hypixel/quickplay.json");

            try {
               String var2 = Files.readString(var1x);
               ArrayList var3 = new ArrayList();

               for (JsonElement var5 : JsonParser.parseString(var2).getAsJsonArray()) {
                  var3.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5));
               }

               this.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(ImmutableList.copyOf(var3));
            } catch (Exception var6) {
               HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, "Load QuickPlay Games");
            }
         }).start();
         this.HCCHIIRCCOHHCHRRCRCRHHCIHOIHRC = true;
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.CRRRICCRROCOHHOHIICIHORCOORRRH(this.OOCCCOIHHOICHCRHHCCIHOIHIHHCRR);
      this.OOCCCOIHHOICHCRHHCCIHOIHIHHCRR
         .OOCCRCRCOHIIORCCORCRCIRRROIOOR(
            () -> {
               if (this.CRCCHCHOCRROOHCORCCOOIIHIIROHR()) {
                  this.mc
                     .bridge$displayScreen(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new CRRRICCRROCOHHOHIICIHORCOORRRH())
                     );
               }
            }
         );
   }

   @Override
   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR().OOROOCCIRCCRHOIOIORIHCHHOOCCOR("bugfroggy").RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   @Override
   public void load(JsonObject var1) {
      super.load(var1);
      JsonObject var2 = var1.getAsJsonObject();
      if (var2.has("qpKeyBinds")) {
         JsonObject var3 = var2.get("qpKeyBinds").getAsJsonObject();

         for (Entry var5 : var3.entrySet()) {
            String var6 = (String)var5.getKey();
            JsonObject var7 = ((JsonElement)var5.getValue()).getAsJsonObject();
            this.OOIRIOIHHIOOIHIHHIHROCIHHIRCHI(var6).load(var7);
         }
      }

      if (var2.has("qpFavorites")) {
         this.RIROHROCORIIHIIHCHROIOICIHHCOI.clear();

         for (JsonElement var10 : var2.getAsJsonArray("qpFavorites")) {
            this.RIROHROCORIIHIIHCHROIOICIHHCOI.add(var10.getAsString());
         }
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      super.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      if (this.COCCRORHOCIIOIIOHCRCOCCIRHOHHH != null && !this.COCCRORHOCIIOIIOHCRCOCCIRHOHHH.isEmpty()) {
         JsonObject var2 = new JsonObject();

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : this.COCCRORHOCIIOIIOHCRCOCCIRHOHHH) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var2);
         }

         var1.add("qpKeyBinds", var2);
         JsonArray var6 = new JsonArray();

         for (String var5 : this.RIROHROCORIIHIIHCHROIOICIHHCOI) {
            var6.add(new JsonPrimitive(var5));
         }

         var1.add("qpFavorites", var6);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, JsonObject var2) {
      if (this.OHCHHRRHICOCROCIRRCOCROCRRICCR.containsKey(var1.getKey())) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var3 = this.OHCHHRRHICOCROCIRRCOCROCRRICCR.get(var1.getKey());
         JsonObject var4 = new JsonObject();
         var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4);
         var2.add(var1.getKey(), var4);
      }

      if (var1.OOROHHOIIHIHCCIIROIOOCCRRHCIHC() != null) {
         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var1.OOROHHOIIHIHCCIIROIOOCCRRHCIHC()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var2);
         }
      }
   }

   public IRCRRHRCIRHIHIHROHCRRHIIHHHHCH IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (!this.OHCHHRRHICOCROCIRRCOCROCRRICCR.containsKey(var1.getKey())) {
         this.OOIRIOIHHIOOIHIHHIHROCIHHIRCHI(var1.getKey());
      }

      return this.OHCHHRRHICOCROCIRRCOCROCRRICCR.get(var1.getKey());
   }

   private IRCRRHRCIRHIHIHROHCRRHIIHHHHCH OOIRIOIHHIOOIHIHHIHROCIHHIRCHI(String var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var2 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRCIHRIHOHORIROHIROORCOCCHOOI(var1)
         .IHCOIHIICIIHOOIICCHHCRORHORHCI(true)
         .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      this.OHCHHRRHICOCROCIRRCOCROCRRICCR.put(var1, var2);
      var2.OOCCRCRCOHIIORCCORCRCIRRROIOOR(() -> {
         if (this.CRCCHCHOCRROOHCORCCOOIIHIIROHR()) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2x = this.HCOOCHIICIIHIHHOHOORCHOIRRIRIO(var1);
            if (var2x != null) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$sendCommand(var2x.OIHHRHCRRHHICOIHIIHHIICIHIRCCI());
            }
         }
      });
      return var2;
   }

   private boolean CRCCHCHOCRROOHCORCCOOIIHIIROHR() {
      return this.isEnabled();
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonElement var1) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      JsonObject var3 = var1.getAsJsonObject();
      var2.HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(var3.get("key").getAsString());
      var2.setName(var3.get("name").getAsString());
      if (var3.has("icon")) {
         var2.RHIHOOOHCIRRIOCRRRHRIHIORICOHI(var3.get("icon").getAsString());
      }

      if (var3.has("command")) {
         var2.RHOIRCHRIHOORCICHIRHCORCIORRRR(var3.get("command").getAsString());
      }

      if (var3.has("modes")) {
         ArrayList var4 = new ArrayList();

         for (JsonElement var6 : var3.get("modes").getAsJsonArray()) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
            var4.add(var7);
            var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
         }

         var2.RCCCROCHCICCROHCOCCRRROCIIHCCH(ImmutableList.copyOf(var4));
      }

      return var2;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HCOOCHIICIIHIHHOHOORCHOIRRIRIO(String var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.COCCRORHOCIIOIIOHCRCOCCIRHOHHH);
   }

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2) {
      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var2) {
         if (var4.getKey().equals(var1)) {
            return var4;
         }

         if (var4.OOROHHOIIHIHCCIIROIOOCCRRHCIHC() != null) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4.OOROHHOIIHIHCCIIROIOOCCRRHCIHC());
            if (var5 != null) {
               return var5;
            }
         }
      }

      return null;
   }

   @Override
   public boolean HOCIIHOCHHORRHHOIOOHOCIRCOOIHR() {
      return false;
   }

   @Generated
   public boolean HCHICORCHHOHCOCRHCIRICHCRHIHHO() {
      return this.HCCHIIRCCOHHCHRRCRCRHHCIHOIHRC;
   }

   @Generated
   public List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CHIOHRCOCICOOIIRCIOHICOORCRHOH() {
      return this.COCCRORHOCIIOIIOHCRCOCCIRHOHHH;
   }

   @Generated
   public void OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1) {
      this.COCCRORHOCIIOIIOHCRCOCCIRHOHHH = var1;
   }

   @Generated
   public Set<String> HICICOHHCRCOCIHCRCICIOCRHOOIOH() {
      return this.RIROHROCORIIHIIHCHROIOICIHHCOI;
   }
}
