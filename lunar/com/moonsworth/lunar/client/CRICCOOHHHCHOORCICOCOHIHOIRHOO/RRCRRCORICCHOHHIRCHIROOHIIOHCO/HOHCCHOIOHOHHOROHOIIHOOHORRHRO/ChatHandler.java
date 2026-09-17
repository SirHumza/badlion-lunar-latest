package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIIIRHIHROIRCROHHROIHIIHRCRRHO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final CRRRICCRROCOHHOHIICIHORCOORRRH ORHOIHHOHCIHIRHCOCOHOCHRHICRRC;
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO RHHICHHIHCCRRCHIIRHHHOOHHRHIIO;

   public void OCHIHOOCOHCHCHCIRHCOOCOROHOCII(String var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.ORHOIHHOHCIHIRHCOCOHOCHRHICRRC
         .IICCCOCIIOROCRIIOICHIROORRCIHR
         .getTierProvider();
      String var3 = this.ORHOIHHOHCIHIRHCOCOHOCHRHICRRC.IICCCOCIIOROCRIIOICHIROORRCIHR.HHIIHOHROCCHOHCRIOCIICIIRIHRRI().niceName();
      GameProfile var4 = this.RCRIOOCOCROIHHOIIRCHORCRHIOCHO(var1);
      CRRRICCRROCOHHOHIICIHORCOORRRH.CICIHRHCIHOROOIHHCRHIIOHRIRRII
         .execute(
            () -> {
               try {
                  GameProfile var5 = var4 != null ? var4 : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
                  if (var5 == null) {
                     this.IHIRRIIORRHORHRORIHOROIRCORCOO(Component.text("[TierTagger] Couldn't find player " + var1 + ".").color(NamedTextColor.RED));
                     return;
                  }

                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var6 = var2.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(
                     var5.getId()
                  );
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.getName(), var6, var3);
               } catch (Exception var7) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var7, "Tier lookup failed for %s", var1
                  );
                  this.IHIRRIIORRHORHRORIHOROIRCORCOO(Component.text("[TierTagger] Failed to look up " + var1 + ".").color(NamedTextColor.RED));
               }
            }
         );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var2, String var3) {
      if (var2 != null && !var2.RHHCHROCOOCOHHIHIRHRIRRIIHRCCH().isEmpty()) {
         this.IHIRRIIORRHORHRORIHOROIRCORCOO(Component.text("[TierTagger] " + var1 + "'s tiers (" + var3 + "):").color(TextColor.color(5636095)));
         if (var2.ORHROIHIHCHRIIHOIIHHHCOHRIOOCC().isPresent() || var2.CIOHOCIHRRHOHOIRIHCCRCHIICIHOR().isPresent()) {
            Component var4 = Component.text("Overall: ").color(NamedTextColor.GRAY);
            if (var2.ORHROIHIHCHRIIHOIIHHHCOHRIOOCC().isPresent()) {
               var4 = var4.append(Component.text("#" + var2.ORHROIHIHCHRIIHOIIHHHCOHRIOOCC().getAsInt()).color(NamedTextColor.WHITE));
               if (var2.OICCIHOCIHOCIORIHHOICROHOCHHRC().isPresent()) {
                  var4 = var4.append(Component.text(" (" + var2.OICCIHOCIHOCIORIHHOICROHOCHHRC().getAsInt() + " points)").color(NamedTextColor.GRAY));
               }
            }

            if (var2.CIOHOCIHRRHOHOIRIHCCRCHIICIHOR().isPresent()) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = var2.CIOHOCIHRRHOHOIRIHCCRCHIICIHOR()
                  .get();
               var4 = var4.append(Component.text(" " + var5.name()).color(TextColor.color(var5.color)));
            }

            this.IHIRRIIORRHORHRORIHOROIRCORCOO(var4);
         }

         var2.RHHCHROCOOCOHHIHIRHRIRRIIHRCCH()
            .values()
            .stream()
            .sorted(Comparator.comparingInt(var0 -> var0.OCIIOOCHCRHICHOHRIHHRHOIHROCOR().ICOOROHCRRRIOOOCHCIOOCOCCCOCHC()))
            .forEach(
               var1x -> {
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2x = var1x.ROHRRHHRHCCCCHRCIHCHRHHCHCCHHC();
                  String var3x = var2x.OHCRCOHIRIICORIOHHCHOCCIOORCOO().map(var0 -> var0 + " ").orElse("");
                  Component var4x = Component.text()
                     .append(Component.text(var3x + var2x.niceName()).color(TextColor.color(var2x.HICHRICIIOOIHIIRHCCOHOHICHHOCC())))
                     .append(Component.text(": ").color(NamedTextColor.GRAY))
                     .append(
                        this.RHHICHHIHCCRRCHIIRHHHOOHHRHIIO
                           .OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(
                              var1x.OCIIOOCHCRHICHOHRIHHRHOIHROCOR().tier(), var1x.OCIIOOCHCRHICHOHRIHHRHOIHROCOR().OCOIRHHHHIOCRICORCORRRHCIIROII()
                           )
                     )
                     .build();
                  if (var1x.IICOORROIHOICHCRHOIHCOCRORCRRI().orElse(false)) {
                     var4x = var4x.append(Component.text(" (retired)").color(NamedTextColor.GRAY));
                  }

                  this.IHIRRIIORRHORHRORIHOROIRCORCOO(var4x);
               }
            );
      } else {
         this.IHIRRIIORRHORHRORIHOROIRCORCOO(Component.text("[TierTagger] " + var1 + " has no tiers on " + var3 + ".").color(NamedTextColor.GRAY));
      }
   }

   @Nullable
   private GameProfile RCRIOOCOCROIHHOIIRCHORCRHIOCHO(String var1) {
      List var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGuiIngame().bridge$getPlayerInfoList();
      if (var2 != null) {
         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var4 : var2) {
            GameProfile var5 = var4.bridge$getGameProfile();
            if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1)) {
               return var5;
            }
         }
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      if (var7 != null) {
         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 : var7.bridge$getPlayerEntities()) {
            GameProfile var6 = var9.bridge$getGameProfile();
            if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var1)) {
               return var6;
            }
         }
      }

      return null;
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable GameProfile var1, String var2) {
      return var1 != null
         && var1.getId() != null
         && var2.equalsIgnoreCase(var1.getName())
         && !IIIIRHIHROIRCROHHROIHIIHRCRRHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getName(), var1.getId(), true);
   }

   @Nullable
   private GameProfile RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      Optional var3 = var2.RHOCHHIRRCHHHOHOIRROIROHHHIHIO("https://api.mojang.com/users/profiles/minecraft/" + var1, false).get();
      if (var3.isEmpty()) {
         throw new Exception("Mojang profile request failed");
      }

      JsonElement var4 = (JsonElement)var3.get();
      if (!var4.isJsonNull() && var4.isJsonObject()) {
         JsonObject var5 = var4.getAsJsonObject();
         if (var5.has("id") && var5.has("name")) {
            UUID var6 = UUID.fromString(
               var5.get("id").getAsString().replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{12})", "$1-$2-$3-$4-$5")
            );
            return new GameProfile(var6, var5.get("name").getAsString());
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void IHIRRIIORRHORHRORIHOROIRCORCOO(Component var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$schedule(
            () -> {
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() != null) {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
                     .bridge$addChatMessage(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(var1)
                     );
               }
            }
         );
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1, RRCRRCORICCHOHHIRCHIROOHIIOHCO var2) {
      this.ORHOIHHOHCIHIRHCOCOHOCHRHICRRC = var1;
      this.RHHICHHIHCCRRCHIIRHHHOOHHRHIIO = var2;
   }
}
