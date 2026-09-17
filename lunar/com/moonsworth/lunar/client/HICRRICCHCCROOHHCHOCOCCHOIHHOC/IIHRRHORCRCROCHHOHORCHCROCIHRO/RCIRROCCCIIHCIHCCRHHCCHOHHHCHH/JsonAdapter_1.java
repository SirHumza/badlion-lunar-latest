package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;
import com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import org.jetbrains.annotations.Nullable;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public boolean OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Collection<String> var1) {
      boolean var2 = false;

      for (String var4 : var1) {
         try {
            var2 |= this.OROCRHCRIIOROIRROOCCOOICIHOROH(var4);
         } catch (Throwable var6) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var6, "[TextureUpdater] Error while updating %s", var4
            );
         }
      }

      return var2;
   }

   protected Set<String> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1, String var2) {
      HashSet var3 = new HashSet();
      var3.add(var2);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
         .CCRHOCCCRCICIRORCOOHHIHCRHIIOR()
         .HRRORCIHIHROCIRCRHOORROIOCOCCH()
         .flatMap(var1x -> var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1))
         .map(RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::OOHROHROHCOOHOCHOHCOIHCRROHCII)
         .ifPresent(var3::addAll);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1) {
         return var3;
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6 && var2.contains("ancient_debris_side")) {
         var2 = "ancient_debris";
      }

      HashSet var4 = new HashSet();

      try {
         this.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH("blockstates", var2).forEach(var2x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, var2x, var4));
      } catch (IOException var9) {
         return var3;
      }

      for (String var6 : var4) {
         try {
            this.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH("models/block", var6).forEach(var1x -> {
               if (var1x.isJsonObject()) {
                  OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1x.getAsJsonObject(), "textures").ifPresent(var1xx -> {
                     for (Entry var3x : var1xx.entrySet()) {
                        if (!"particle".equals(var3x.getKey())) {
                           String var4x;
                           if (((JsonElement)var3x.getValue()).isJsonObject()) {
                              var4x = ((JsonElement)var3x.getValue()).getAsJsonObject().get("sprite").getAsString();
                           } else {
                              var4x = ((JsonElement)var3x.getValue()).getAsString();
                           }

                           var3.add(HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOCOOOIHOOIOHCOHICOHRCRCRIIHC(var4x));
                        }
                     }
                  });
               }
            });
         } catch (IOException var8) {
         }
      }

      return var3;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable String var1, JsonElement var2, Set<String> var3) {
      if (var2.isJsonObject()) {
         for (Entry var5 : var2.getAsJsonObject().entrySet()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((String)var5.getKey(), (JsonElement)var5.getValue(), var3);
         }
      } else if (var2.isJsonArray()) {
         for (JsonElement var7 : var2.getAsJsonArray()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, var7, var3);
         }
      } else if (var2.isJsonPrimitive() && "model".equals(var1)) {
         var3.add(var2.getAsString());
      }
   }

   private List<JsonElement> ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(String var1, String var2) {
      String var3 = "minecraft";
      if (var2.contains(":")) {
         String[] var4 = var2.split(":");
         var3 = var4[0];
         var2 = var4[1];
      }

      if (var2.contains("/")) {
         var2 = var2.split("/")[1];
      }

      if (!var1.endsWith("/")) {
         var1 = var1 + "/";
      }

      RCIROOOOICRHCCRRCIORHHIRCOIIIC var5 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var3, var1 + var2 + ".json");
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getResourceManager()
         .bridge$getAllResources(var5)
         .stream()
         .map(var0 -> JsonParser.parseReader(new InputStreamReader(var0.bridge$getInputStream())))
         .filter(Objects::nonNull)
         .toList();
   }

   protected abstract boolean OROCRHCRIIOROIRROOCCOOICIHOROH(String var1);

   public void CRCIRHHIIIROIRCIIOCIHOHHHCRHIC() {
   }

   public void IHIIICHIOORRRCCHHORHCOHRHIICOH() {
   }
}
