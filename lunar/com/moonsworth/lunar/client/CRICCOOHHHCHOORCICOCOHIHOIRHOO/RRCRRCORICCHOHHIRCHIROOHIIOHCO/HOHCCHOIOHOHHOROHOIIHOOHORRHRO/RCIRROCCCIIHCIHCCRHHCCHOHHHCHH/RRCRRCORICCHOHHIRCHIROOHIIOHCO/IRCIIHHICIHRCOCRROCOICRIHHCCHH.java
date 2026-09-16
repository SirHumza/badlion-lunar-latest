package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final CRRRICCRROCOHHOHIICIHORCOORRRH OCHHCHOCCRRCOOHIRORCOIHRCCORIH = new CRRRICCRROCOHHOHIICIHORCOORRRH(
      Optional.empty(), OptionalInt.empty(), OptionalInt.empty(), Collections.emptyMap()
   );
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRCIRRIRROIHHOCCOHIRIHOHCOCIHR;
   private List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHCIOROICIOHRCOICCIOCHOHICROHO = null;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      List var1 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO()
         .ICRCOROICHCHIOIIOIRCROHIOCHCHO()
         .values()
         .stream()
         .map(var0 -> new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0.tier(), var0.OCOIRHHHHIOCRICORCORRRHCIIROII()))
         .sorted(Comparator.comparingInt(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI::ICOOROHCRRRIOOOCHCIOOCOCCCOCHC))
         .collect(Collectors.toCollection(ArrayList::new));
      if (var1.isEmpty()) {
         for (int var2 = 1; var2 <= 5; var2++) {
            var1.add(new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2, 0));
            var1.add(new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2, 1));
         }
      }

      this.RRCIRRIRROIHHOCCOHIRIHOHCOCIHR = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO()
            .HHHROHCHIRRRRRRCOCIOCIRHIIROHO(),
         var1,
         true,
         false
      );
   }

   @NotNull
   @Override
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OROCCHOOOIIOHCIRIRROOCHHIOICRC() {
      return this.RRCIRRIRROIHHOCCOHIRIHOHCOCIHR;
   }

   @NotNull
   @Override
   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> OCRIOCRIHRIRCCOHOOOHOCHHHOORRR() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO();
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.RHRRIHCHRHCCROOHIHROIHHOROCHRH && this.HHCIOROICIOHRCOICCIOCHOHICROHO == null && var1.isLoaded()) {
         this.HHCIOROICIOHRCOICCIOCHOHICROHO = new CopyOnWriteArrayList<>();
         String var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 1 ? var1.HRCOOCCHCRRHIRRICHCIHRCRHRICIR() : var1.ORRICRCOCRCIROOCHRORIRRCIOORHC();
         this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(this.RRCIRRIRROIHHOCCOHIRIHOHCOCIHR.OIICOIRRRCOICHCHCHRICOIOHHOOCR() + var2, true)
            .thenAccept(
               var2x -> {
                  if (var2x.isEmpty()) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        "Unable to fetch tiertests gamemodes!"
                     );
                  } else {
                     JsonElement var3 = var2x.get();
                     if (!var3.isJsonNull() && var3.isJsonObject()) {
                        JsonObject var4 = var3.getAsJsonObject();
                        if (!var4.has("data")) {
                           com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                              "No tiertests gamemodes array!"
                           );
                        } else {
                           JsonArray var5 = var4.getAsJsonArray("data");
                           ArrayList var6 = new ArrayList();

                           for (JsonElement var8 : var5) {
                              if (var8.isJsonObject()) {
                                 JsonObject var9 = var8.getAsJsonObject();
                                 if (var9.has("name")) {
                                    String var10 = var9.get("name").getAsString();
                                    var6.add(
                                       new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                                          var10,
                                          this.CORCOCICIRIOHROHROIIOOHICCHCRR(var9, var10),
                                          Optional.ofNullable(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var9, var10, var1)),
                                          this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, var10, var1)
                                       )
                                    );
                                 }
                              }
                           }

                           this.HHCIOROICIOHRCOICCIOCHOHICROHO.clear();
                           this.HHCIOROICIOHRCOICCIOCHOHICROHO.addAll(var6);
                           com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                              "Got %s tiertests gamemodes", var6.size()
                           );
                        }
                     } else {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           "Unable to fetch tiertests gamemodes (invalid json)!"
                        );
                     }
                  }
               }
            );
      }

      return this.HHCIOROICIOHRCOICCIOCHOHICROHO != null && !this.HHCIOROICIOHRCOICCIOCHOHICROHO.isEmpty()
         ? this.HHCIOROICIOHRCOICCIOCHOHICROHO
         : var1.OOIIHORRRIRHCIIHOORCCROHOCIIHC();
   }

   private int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var1,
      String var2,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      if (var1.has("colorHex")) {
         String var4 = var1.get("colorHex").getAsString();

         try {
            return Color.decode(var4).getRGB();
         } catch (Exception var6) {
         }
      }

      return var3.HORIRRHCOHOHHRIRHRIOIIRCCHRHCO(var2);
   }

   @Nullable
   private String IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      JsonObject var1,
      String var2,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      String var4 = var3.RRHCOHIOHRCIIOROOHOCOOOCHOHOIH(var2);
      if (var4 != null) {
         return var4;
      } else {
         return var1.has("unicode") ? var1.get("unicode").getAsString() : null;
      }
   }

   private String CORCOCICIRIOHROHROIIOOHICCHCRR(JsonObject var1, String var2) {
      if (!var1.has("beautifiedName")) {
         return this.capitalize(var2);
      }

      String var3 = var1.get("beautifiedName").getAsString();
      return var3.trim().isEmpty() ? this.capitalize(var2) : var3;
   }

   private String capitalize(String var1) {
      return var1.isEmpty() ? "" : Character.toUpperCase(var1.charAt(0)) + var1.substring(1).toLowerCase(Locale.ROOT);
   }

   @Override
   protected CRRRICCRROCOHHOHIICIHORCOORRRH RRORCOIRRIICOOICOIOCORHORCHCOC(UUID var1) {
      if (var1 == null) {
         return null;
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCRCCCCCHCICRCIHIIRRHHCOIHOIRO();
      String var3 = String.format(this.RRCIRRIRROIHHOCCOHIRIHOHCOCIHR.OIICOIRRRCOICHCHCHRICOIOHHOOCR() + var2.RHCROIICCOOIICIRIHIOICHIRHOIOI(), var1);
      Optional var4 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var3, false).get();
      if (var4.isEmpty()) {
         throw new Exception("Error while fetching");
      }

      JsonElement var5 = (JsonElement)var4.get();
      if (!var5.isJsonNull() && var5.isJsonObject()) {
         JsonObject var6 = var5.getAsJsonObject();
         JsonArray var7 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.IOHIHIIHCCCCCIHRORIOIOORCIOHII(var6, "data").orElse(null);
         if (var7 != null && !var7.isEmpty()) {
            HashMap var8 = new HashMap();
            RRCRRCORICCHOHHIRCHIROOHIIOHCO var9 = null;
            int var10 = -1;
            int var11 = -1;

            for (JsonElement var13 : var7) {
               JsonObject var14 = var13.getAsJsonObject();
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var15 = this.CCIHHRIOOOOCOHRCIHOHROOICIORCC(
                  var14
               );
               if (var15 != null) {
                  if (var9 == null) {
                     var9 = this.CRHROHHHCIHHCOHCOORCRIHHIICROR(var14);
                  }

                  if (var10 == -1 || var11 == -1) {
                     String var16 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 1 ? "rankModern" : "rankLegacy";
                     JsonObject var17 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var14, var16).orElse(null);
                     if (var17 != null) {
                        var10 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var17, "points").orElse(-1);
                        var11 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var17, "rank").orElse(-1);
                     }
                  }

                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var18 = var2.OCRCCHCOORIOHCHOOCIIICRRHHRRIO(
                     var14.get("tier").getAsString().toUpperCase(Locale.ROOT)
                  );
                  if (var18 == null) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        "[TierTests] Found unsupported tier (%s), skipping (!!)", var14.get("tier").getAsString()
                     );
                  } else {
                     HHCCIRHCCCIIRHCROHIORHIRHHIORH var19 = new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        var15, new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var18.tier(), var18.OCOIRHHHHIOCRICORCORRRHCIIROII()), Optional.empty(), Optional.empty()
                     );
                     var8.put(var15, var19);
                  }
               }
            }

            return var8.isEmpty()
               ? OCHHCHOCCRRCOOHIRORCOIHRCCORIH
               : new CRRRICCRROCOHHOHIICIHORCOORRRH(
                  Optional.ofNullable(var9),
                  var10 == -1 ? OptionalInt.empty() : OptionalInt.of(var10),
                  var11 == -1 ? OptionalInt.empty() : OptionalInt.of(var11),
                  var8
               );
         } else {
            return null;
         }
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Unable to fetch tiertests ranking for %s (%s)!", var1, var5.toString()
         );
         return null;
      }
   }

   private com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCIHHRIOOOOCOHRCIHOHROOICIORCC(
      JsonObject var1
   ) {
      String var2 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, "gamemode")
         .flatMap(var0 -> OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(var0, "name"))
         .orElse(null);
      if (var2 == null) {
         return null;
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.ROICOCHCIHIRICHOOCHHCRHCHOORIR(
            var2
         )
         .orElse(null);
      if (var3 == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "[TierTests] Found unsupported gamemode (%s), skipping", var2
         );
      }

      return var3;
   }

   private RRCRRCORICCHOHHIRCHIROOHIIOHCO CRHROHHHCIHHCOHCOORCRIHHIICROR(JsonObject var1) {
      String var2 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, "user")
         .flatMap(var0 -> OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(var0, "region"))
         .orElse(null);
      if (var2 == null) {
         return null;
      }

      try {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.fromString(var2);
      } catch (IllegalArgumentException var4) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Unable to parse tiertests region %s", var2
         );
         return null;
      }
   }
}
