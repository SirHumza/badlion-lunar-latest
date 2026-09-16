package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   protected static final List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> CHRROIIRICRCCIORHRIIOCHCCROHOH;
   private List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHCIOROICIOHRCOICCIOCHOHICROHO = null;

   protected abstract boolean RHHRHIRCRHIHRROIHHIRICHIRIHCCI();

   protected abstract List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> OOIIHORRRIRHCIIHOORCCROHOCIIHC();

   @Nullable
   protected abstract String RRHCOHIOHRCIIOROOHOCOOOCHOHOIH(String var1);

   protected abstract int HORIRRHCOHOHHRIRHRIOIIRCCHRHCO(String var1);

   @NotNull
   @Override
   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> OCRIOCRIHRIRCCOHOOOHOCHHHOORRR() {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.RHRRIHCHRHCCROOHIHROIHHOROCHRH
         && this.HHCIOROICIOHRCOICCIOCHOHICROHO == null
         && this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI()) {
         this.HHCIOROICIOHRCOICCIOCHOHICROHO = new CopyOnWriteArrayList<>();
         this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(this.OROCCHOOOIIOHCIRIRROOCHHIOICRC().OIICOIRRRCOICHCHCHRICOIOHHOOCR() + "tierlists", true)
            .thenAccept(
               var1 -> {
                  if (var1.isEmpty()) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        "Unable to fetch %s gamemodes!", this.HRCOORIIIRROIORCCIIOCRCCRCCRRH()
                     );
                  } else {
                     JsonElement var2 = var1.get();
                     if (!var2.isJsonNull() && var2.isJsonObject()) {
                        JsonObject var3 = var2.getAsJsonObject();
                        ArrayList var4 = new ArrayList();

                        for (String var6 : var3.keySet()) {
                           JsonObject var7 = var3.getAsJsonObject(var6);
                           String var8 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(var7, "title")
                              .orElseGet(() -> StringUtils.capitalize(var6));
                           var4.add(
                              new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                                 var6, var8, Optional.ofNullable(this.RRHCOHIOHRCIIOROOHOCOOOCHOHOIH(var6)), this.HORIRRHCOHOHHRIRHRIOIIRCCHRHCO(var6)
                              )
                           );
                        }

                        this.HHCIOROICIOHRCOICCIOCHOHICROHO.clear();
                        this.HHCIOROICIOHRCOICCIOCHOHICROHO.addAll(var4);
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           "Got %s %s gamemodes", var4.size(), this.HRCOORIIIRROIORCCIIOCRCCRCCRRH()
                        );
                     } else {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           "Unable to fetch %s gamemodes (invalid json)!", this.HRCOORIIIRROIORCCIIOCRCCRCCRRH()
                        );
                     }
                  }
               }
            );
      }

      return this.HHCIOROICIOHRCOICCIOCHOHICROHO != null && !this.HHCIOROICIOHRCOICCIOCHOHICROHO.isEmpty()
         ? this.HHCIOROICIOHRCOICCIOCHOHICROHO
         : this.OOIIHORRRIRHCIIHOORCCROHOCIIHC();
   }

   @Override
   protected CRRRICCRROCOHHOHIICIHORCOORRRH RRORCOIRRIICOOICOIOCORHORCHCOC(UUID var1) {
      if (var1 == null) {
         return null;
      }

      String var2 = this.OROCCHOOOIIOHCIRIRROOCHHIOICRC().OIICOIRRRCOICHCHCHRICOIOHHOOCR() + "profile/" + var1.toString().replace("-", "");
      Optional var3 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var2, false).get();
      if (var3.isEmpty()) {
         throw new Exception("Error while fetching");
      }

      JsonElement var4 = (JsonElement)var3.get();
      if (!var4.isJsonNull() && var4.isJsonObject()) {
         JsonObject var5 = var4.getAsJsonObject();
         if (var5.isEmpty()) {
            return null;
         }

         RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = null;

         try {
            var6 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(var5, "region").map(RRCRRCORICCHOHHIRCHIROOHIIOHCO::fromString).orElse(null);
         } catch (Exception var8) {
         }

         return new CRRRICCRROCOHHOHIICIHORCOORRRH(
            Optional.ofNullable(var6),
            OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var5, "overall"),
            OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var5, "points"),
            this.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var5)
         );
      } else {
         return null;
      }
   }

   private Map<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCRCRCOHIIORCCORCRCIRRROIOOR(
      JsonObject var1
   ) {
      JsonObject var2 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, "rankings").orElse(null);
      if (var2 == null) {
         return Collections.emptyMap();
      }

      String var3 = this.HRCOORIIIRROIORCCIIOCRCCRCCRRH();
      HashMap var4 = new HashMap();

      for (String var6 : var2.keySet()) {
         Optional var7 = this.ROICOCHCIHIRICHOOCHHCRHCHOORIR(var6);
         if (var7.isEmpty()) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Invalid " + var3 + " gamemode %s", var6
            );
         } else if (!var2.get(var6).isJsonObject()) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Malformed ranking object " + var3
            );
         } else {
            JsonObject var8 = var2.get(var6).getAsJsonObject();
            OptionalInt var9 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var8, "tier");
            OptionalInt var10 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var8, "pos");
            if (!var9.isEmpty() && !var10.isEmpty()) {
               OptionalInt var11 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var8, "peak_tier");
               OptionalInt var12 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var8, "peak_pos");
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var13 = null;
               if (var11.isPresent() && var12.isPresent()) {
                  var13 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var11.getAsInt(), var12.getAsInt());
               }

               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var14 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var7.get(),
                  new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var9.getAsInt(), var10.getAsInt()),
                  Optional.ofNullable(var13),
                  OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.IOIICIRIICICIIOORHCIIIIRRIHRHI(var8, "retired")
               );
               var4.put(
                  (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var7.get(),
                  var14
               );
            } else {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Malformed ranking " + var3
               );
            }
         }
      }

      return var4;
   }

   static {
      ArrayList var0 = new ArrayList();

      for (int var1 = 1; var1 <= 5; var1++) {
         var0.add(new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, 0));
         var0.add(new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, 1));
      }

      CHRROIIRICRCCIORHRIIOCHCCROHOH = var0;
   }
}
