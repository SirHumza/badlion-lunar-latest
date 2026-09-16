package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORHIROIIRRHORRHHOOORCCHRHRIRRH;
   private static final int OCRIIOIOHCRORICICCHHOCOCRIHHIO = 99999;

   @NotNull
   @Override
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OROCCHOOOIIOHCIRIRROOCHHIOICRC() {
      return ORHIROIIRRHORRHHOOORCCHRHRIRRH;
   }

   @NotNull
   @Override
   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> OCRIOCRIHRIRCCOHOOOHOCHHHOORRR() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HOIRIRRRHRRIHIICHCCORRCCIRICRO()
         .OCRIOCRIHRIRCCOHOOOHOCHHHOORRR();
   }

   @Override
   protected CRRRICCRROCOHHOHIICIHORCOORRRH RRORCOIRRIICOOICOIOCORHORCHCOC(UUID var1) {
      if (var1 == null) {
         return null;
      }

      Optional var2 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(this.OROCCHOOOIIOHCIRIRROOCHHIOICRC().OIICOIRRRCOICHCHCHRICOIOHHOOCR() + var1, false).get();
      if (var2.isEmpty()) {
         throw new Exception("Error while fetching");
      }

      JsonElement var3 = (JsonElement)var2.get();
      if (!var3.isJsonNull() && var3.isJsonObject()) {
         JsonObject var4 = var3.getAsJsonObject();
         if (var4.isEmpty()) {
            return null;
         }

         int var5 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var4, "globalPosition").orElse(-1);
         return new CRRRICCRROCOHHOHIICIHORCOORRRH(
            Optional.empty(),
            var5 > 0 && var5 != 99999 ? OptionalInt.of(var5) : OptionalInt.empty(),
            OptionalInt.empty(),
            this.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var4)
         );
      } else {
         return null;
      }
   }

   private Map<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH, HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCRCRCOHIIORCCORCRCIRRROIOOR(
      JsonObject var1
   ) {
      JsonObject var2 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1, "data").orElse(null);
      if (var2 == null) {
         return Collections.emptyMap();
      }

      HashMap var3 = new HashMap();

      for (String var5 : var2.keySet()) {
         Optional var6 = this.ROICOCHCIHIRICHOOCHHCRHCHOORIR(var5);
         if (var6.isEmpty()) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Invalid pvphq ladder %s", var5
            );
         } else if (!var2.get(var5).isJsonObject()) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Malformed pvphq ladder object"
            );
         } else {
            JsonObject var7 = var2.getAsJsonObject(var5);
            String var8 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(var7, "grantedTier").orElse(null);
            if (var8 == null) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Malformed pvphq ladder"
               );
            } else if (!this.IHICORCROOROHCIHIHCOIHRRHICICO(var7)) {
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var9 = this.OHIRCIHHORIICCIRCCROCCCOIICOHR(var8);
               if (var9 == null) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     "Found unsupported pvphq tier (%s), skipping", var8
                  );
               } else {
                  HHCCIRHCCCIIRHCROHIORHIRHHIORH var10 = new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var6.get(),
                     var9,
                     Optional.empty(),
                     Optional.empty()
                  );
                  var3.put(
                     (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var6.get(),
                     var10
                  );
               }
            }
         }
      }

      return var3;
   }

   private boolean IHICORCROOROHCIHIHCOIHRRHICICO(JsonObject var1) {
      OptionalInt var2 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var1, "placementGames");
      OptionalInt var3 = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var1, "placementTarget");
      return !var2.isEmpty() && !var3.isEmpty() ? var2.getAsInt() < var3.getAsInt() : false;
   }

   @Nullable
   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI OHIRCIHHORIICCIRCCROCCCOIICOHR(String var1) {
      String var2 = var1.toUpperCase(Locale.ROOT);
      if (var2.length() == 3 && var2.charAt(1) == 'T') {
         byte var3 = switch (var2.charAt(0)) {
            case 'H' -> 0;
            case 'L' -> 1;
            case 'M' -> 2;
            default -> -1;
         };
         int var4 = var2.charAt(2) - '0';
         if (var3 != -1 && var4 >= 1 && var4 <= 5) {
            return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4, var3);
         }

         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Invalid PvpHQ tier (2): " + var1
         );
         return null;
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Invalid PvpHQ tier (1): " + var1
         );
         return null;
      }
   }

   static {
      ArrayList var0 = new ArrayList();

      for (int var1 = 1; var1 <= 5; var1++) {
         var0.add(new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, 0));
         var0.add(new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, 2));
         var0.add(new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, 1));
      }

      ORHIROIIRRHORRHHOOORCCHRHRIRRH = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RIROICHCRROROHCCROOCCCCOCHCCRI.RCOCHHICCIRHIRORROCIRHRIHOIHIC() + "/tier-tagger/pvphq/", var0, false, false
      );
   }
}
