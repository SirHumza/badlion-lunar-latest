package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIIIRHIHROIRCROHHROIHIIHRCRRHO;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;

public final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   public static final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RIHHCROROROHHROICCIRHOICCOOIHC = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI();

   @Override
   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH ROROORRHRIIOOIIIOIOCCORHORRRII() {
      return (var1, var2) -> {
         String var3 = var2.CIHCOIIRIOOCOCRHHHHRCCIOHCRCCH().toLowerCase(Locale.ROOT);
         HashSet var4 = new HashSet();
         Stream.concat(
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .RORROHRORCOOOOHRROHIOHCRHHCRCO()
                  .OHHRCRIOOCIORORHIOHRICRHHORCIH()
                  .stream()
                  .map(com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH::getName),
               Stream.concat(
                  Objects.requireNonNull(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGuiIngame().bridge$getPlayerInfoList())
                     .stream()
                     .map(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH::bridge$getGameProfile
                     )
                     .filter(var0 -> !IIIIRHIHROIRCROHHROIHIIHRCRRHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getName(), var0.getId(), true))
                     .map(GameProfile::getName),
                  this.RIRCHCCICOCIIRHOHIROHHHHRROHHC()
               )
            )
            .filter(var1x -> var1x.toLowerCase(Locale.ROOT).startsWith(var3))
            .forEach(var2x -> {
               if (var4.add(var2x)) {
                  var2.OHRCIORHOCHOORCRHHOHRRRCCOICCO(var2x);
               }
            });
      };
   }

   private Stream<String> RIRCHCCICOCIIRHOHIROHHHHRROHHC() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      return var1 == null
         ? Stream.empty()
         : var1.bridge$getPlayerEntities()
            .stream()
            .filter(
               var0 -> !IIIIRHIHROIRCROHHROIHIIHRCRRHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var0.bridge$getGameProfile().getName(), var0.bridge$getGameProfile().getId(), true
               )
            )
            .map(var0 -> var0.bridge$getGameProfile().getName());
   }
}
