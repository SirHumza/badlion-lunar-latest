package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.ImmutableList;
import com.lunarclient.generated.SkyblockProfileResponse;
import com.lunarclient.minecraft.hypixel.skyblock.SkyBlockProfilesUtil;
import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final Pattern IROOIICIRHCIIHROROHIORIIOOOICC = Pattern.compile("^ Opened Rooms: (?<amount>[0-9]+)$");
   private static final Pattern IORCHRRRROIRROCROCHIRHIHCOHRIC = Pattern.compile("^ Completed Rooms: (?<amount>[0-9]+)$");
   private static final Pattern CHCRHROCRHHOOCCRRHRORCOHRROICR = Pattern.compile("^ Secrets Found: (?<amount>[0-9.]+)%$");
   private static final Pattern CHICCRIOOROHRIHIRHHHCHICHCHIIH = Pattern.compile("^ Secrets Found: (?<amount>[0-9.]+)$");
   private static final Pattern RCROCOOCCRCHIIHHHRRHCRIORIOCOH = Pattern.compile("^ Crypts: (?<amount>[0-9]+)$");
   private static final Pattern CHCCOROOOIICHHRIIOIIIOCRCICRHO = Pattern.compile("^Cleared: (?<percentage>[0-9]+)% \\((?<score>[0-9]+)\\)$");
   private static final Pattern OHCIROOOCCIOOORIIICOHOIHHCCICR = Pattern.compile("^Time Elapsed: (?<amount>.+)");
   private static final Pattern RHRCIOCHOHOIORORCRHRRCICOCRHRH = Pattern.compile("^Puzzles: \\(\\d\\)$");
   private final OOROOCCIRCCRHOIOIORIHCHHOOCCOR OICRCCHHHIHIIICOHRHRIRIIRORIOH = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class);
   private final CORCOCICIRIOHROHROIIOOHICCHCRR HORIIOCIIIROORCHRCHCROOOHIIRIH = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(CORCOCICIRIOHROHROIIOOHICCHCRR.class);
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRHHRIIOIHOOIROOCIRHORIROOHCRC = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class);
   private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH IRCCHORORCCHRHRCRCHCICOHOOCCIO = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class);
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH IIRICHHIIHORRHICRHRCOCCCRRHRHC = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(IRCIIHHICIHRCOCRROCOICRIHHCCHH.class);
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH CHRHHRHHCOCCCRRHIHOICROCOHOIIC = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
   );
   private int deaths;
   private boolean RIRHCHHHHHRCHIIHHHHOCRROCIIRRO;
   private boolean OROIIHICIHCOHRCHROICHIOIRHROHH;
   private boolean IORRICOICHOHCROORCCCIIOOORRHII;
   private boolean HOHOCHICRHRIOCRCCICHIROORICOIC;
   private boolean HIOCIOHOCCCICHIHRORCHCHOHRROCI;
   private boolean ORIHOOIHCCROHRRIRCORIHHCHHHRIH;
   private boolean HCROOOIHRIORCOCOCROHCHCRCCIOOR;
   private OOOOCCOOOHCHCIIHOIHCRIIOOROHRC IORCHICCORHCOORICIHRIIROORHORH;
   private final com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Boolean> OCHHIICCHRRORRCHRORRROIHIIOIHO = com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      this, false
   );
   private int HIIOHCRRIOIIHRIRCOHRHOOOIHOROO;
   private int OICCOHOCRRIIRHIORHCIRRIRHIHROO;
   private int CIROHOCCIIIOCHRRRCRRHIORRICIOR;
   private int OHCRHOHOICICOCCHCCHIHRRCICIHRR;
   private int HHIHRHOOIHOOROOCOCHOCRHRHRIHIO;
   private int CCHIHOICHCRRCOHIIRHHCCIHIICIRI;
   private int CCHCOHCOIRIOORIRHOHRRCRHCCRIRO;
   private int RRCIIHOORRRHHIIRIRIHIIROCCHCHC;
   private int OCIOOOHOIHRIRROICCIOORCIIHIHOR;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      this.handle(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         this::IRCIIHHICIHRCOCRROCOICRIHHCCHH
      );
      this.handle(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, this::HHCCIRHCCCIIRHCROHIORHIRHHIORH);
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         this::OCOHORHCROHICRRIHCIHHRRCIHICRI
      );
      this.handle(IIRHCHHOICHRICOOCRORCCIOOIHOIR.class, this::RIOOCHICIHRHOHCCCCCHOCCCOHCRHI);
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR.class,
         this::CRRRICCRROCOHHOHIICIHORCOORRRH
      );
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.deaths = 0;
      this.OROIIHICIHCOHRCHROICHIOIRHROHH = false;
      this.RIRHCHHHHHRCHIIHHHHOCRROCIIRRO = false;
      this.HOHOCHICRHRIOCRCCICHIROORICOIC = false;
      this.HIOCIOHOCCCICHIHRORCHCHOHRROCI = false;
      this.ORIHOOIHCCROHRRIRCORIHHCHHHRIH = false;
      this.HCROOOIHRIORCOCOCROHCHCRCCIOOR = false;
      this.IORCHICCORHCOORICIHRIIROORHORH = null;
      this.OCHHIICCHRRORRCHRORRROIHIIOIHO.set(false);
      this.IORRICOICHOHCROORCCCIIOOORRHII = false;
      this.OHCRHOHOICICOCCHCCHIHRRCICIHRR = 0;
      this.HHIHRHOOIHOOROOCOCHOCRHRHRIHIO = 0;
      this.CCHIHOICHCRRCOHIIRHHCCIHIICIRI = 0;
      this.OCIOOOHOIHRIRROICCIOORCIIHIHOR = 0;
      this.RRCIIHOORRRHHIIRIRIHIIROCCHCHC = 0;
      this.CCHCOHCOIRIOORIRHOHRRCRHCCRIRO = 0;
      this.HIIOHCRRIOIIHRIRCOHRHOOOIHOROO = 0;
      this.OICCOHOCRRIIRHIORHCIRRIRHIHROO = 0;
      this.CIROHOCCIIIOCHRRRCRRHIORRICIOR = 0;
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1) {
      if (OCOHORHCROHICRRIHCIHHRRCIHICRI.HIOIORCICHOHCHCHRRIRHIIIOHICIH()
         == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.DUNGEON
         )
       {
         ImmutableList var2 = this.OICRCCHHHIHIIICOHRHRIRIIRORIOH.IRHHRCCHCIOOOIRHHCHROHROHOHCII();
         ImmutableList var3 = this.HORIIOCIIIROORCHRCHCROOOHIIRIH.IRHHRCCHCIOOOIRHHCHROHROHOHCII();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this.CRHHRIIOIHOOIROOCIRHORIROOHCRC
            .OCOCIIRHCIOCIOICHICIOOCROIOHIC();
         float var5 = 0.0F;
         int var6 = 0;
         int var7 = 0;

         for (String var9 : var2) {
            Matcher var10 = CHCCOROOOIICHHRIIOIIIOCRCICRHO.matcher(var9);
            if (var10.find()) {
               var5 = Integer.parseInt(var10.group("percentage")) / 100.0F;
               var7 = Integer.parseInt(var10.group("score"));
            }

            var10 = OHCIROOOCCIOOORIIICOHOIHHCCICR.matcher(var9);
            if (var10.find()) {
               var6 = this.ROHIRHRRROOCCHOCIIOIRIOCRIRHII(var10.group("amount"));
            }
         }

         int var23 = 0;
         int var24 = 0;
         float var26 = 0.0F;
         int var11 = 0;
         this.OHCRHOHOICICOCCHCCHIHRRCICIHRR = 0;
         int var12 = 0;

         for (String var14 : var3) {
            Matcher var15 = IROOIICIRHCIIHROROHIORIIOOOICC.matcher(var14);
            if (var15.find()) {
               var23 = Integer.parseInt(var15.group("amount"));
            } else {
               var15 = IORCHRRRROIRROCROCHIRHIHCOHRIC.matcher(var14);
               if (var15.find()) {
                  var24 = Integer.parseInt(var15.group("amount"));
               } else {
                  var15 = CHCRHROCRHHOOCCRRHRORCOHRROICR.matcher(var14);
                  if (var15.find()) {
                     var26 = Float.parseFloat(var15.group("amount")) / 100.0F;
                  } else {
                     var15 = CHICCRIOOROHRIHIRHHHCHICHCHIIH.matcher(var14);
                     if (var15.find()) {
                        var11 = Integer.parseInt(var15.group("amount"));
                     } else {
                        var15 = RCROCOOCCRCHIIHHHRRHCRIORIOCOH.matcher(var14);
                        if (var15.find()) {
                           this.OHCRHOHOICICOCCHCCHIHRRCICIHRR = Integer.parseInt(var15.group("amount"));
                        } else {
                           var15 = RHRCIOCHOHOIORORCRHRRCICOCRHRH.matcher(var14);
                           if (var15.find()) {
                              int var16 = var3.indexOf(var14) + 1;

                              while (var16 < var3.size()) {
                                 String var17 = (String)var3.get(var16);
                                 if (!var17.contains("✦") && !var17.contains("✖")) {
                                    if (!var17.contains("✔")) {
                                       break;
                                    }

                                    var16++;
                                 } else if (var17.contains("Higher Or Lower") && this.IORRICOICHOHCROORCCCIIOOORRHII) {
                                    var16++;
                                 } else {
                                    var16++;
                                    var12++;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var23 != 0 && var24 != 0) {
            int var27 = Math.round(var24 / var5);
            if (!this.OCHHIICCHRRORRCHRORRROIHIIOIHO.get()) {
               var24++;
            }

            if (!this.HCROOOIHRIORCOCOCROHCHCRCCIOOR) {
               var24++;
            }

            float var28 = (float)var24 / var27;
            this.HIIOHCRRIOIIHRIRCOHRHOOOIHOROO = var11;
            this.OICCOHOCRRIIRHIORHCIRRIRHIHROO = Math.round(var11 / var26);
            int var34 = (int)Math.floor(60.0F * var28);
            int var35 = (int)Math.floor(40.0F * (var26 / var4.getRequiredSecretPercentage()));
            int var36 = Math.min(var34 + var35, 100);
            this.RRCIIHOORRRHHIIRIRIHIIROCCHCHC = var36;
            int var18 = 100;
            var18 -= this.RHOORRIIOCHIRRHOHOOHIROHCRICRO(var4.getTimeLimit(), var6);
            this.CCHCOHCOIRIOORIRHOHRRCRHCCRIRO = var18;
            int var19 = 20 + (int)Math.floor(80.0F * var28) - 10 * var12 - this.deaths * 2;
            var19 = Math.min(var19, 100);
            int var20 = this.deaths * 2;
            if (this.OROIIHICIHCOHRCHROICHIOIRHROHH && this.deaths > 0) {
               var19++;
               var20--;
            }

            this.CCHIHOICHCRRCOHIIRHHCCIHIICIRI = var19;
            int var21 = Math.min(this.OHCRHOHOICICOCCHCCHIHRRCICIHRR, 5);
            if (var4.getNumber() >= 6 && this.HOHOCHICRHRIOCRCCICHIROORICOIC) {
               var21 += 2;
            }

            if (this.HIOCIOHOCCCICHIHRORCHCHOHRROCI) {
               var21++;
            }

            if (this.ORIHOOIHCCROHRRIRCORIHHCHHHRIH) {
               var21++;
            }

            this.OCIOOOHOIHRIRROICCIOORCIIHIHOR = var21;
            this.HHIHRHOOIHOOROOCOCHOCRHRHRIHIO = var36 + var19 + var18 + var21;
            IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var22 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IHIIROIOIHOHCHICOIIIHOHHCOIOCI()
               .OHROOCHOHIORORCCORICCRHRCHHIHO()
               .get();
            if (var22 == IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.DISABLED && this.IRCCHORORCCHRHRCRCHCICOHOOCCIO.IICIIHIHHRCIIRHCRROHIHHOICROIR("EZPZ")) {
               this.HHIHRHOOIHOOROOCOCHOCRHRHRIHIO += 10;
            } else if (var22 == IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.FORCE_ON) {
               this.HHIHRHOOIHOOROOCOCHOCRHRHRIHIO += 10;
            }

            this.CIROHOCCIIIOCHRRRCRRHIORRICIOR = (int)Math.ceil(
               this.OICCOHOCRRIIRHIORHCIRRIRHIHROO * var4.getRequiredSecretPercentage() * ((40.0 - var21 + var20) / 40.0)
            );
            if (this.OCHHIICCHRRORRCHRORRROIHIIOIHO.get()) {
               this.HHIHRHOOIHOOROOCOCHOCRHRHRIHIO = var7;
            }

            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
                  () -> new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     this.HHIHRHOOIHOOROOCOCHOCRHRHRIHIO
                  )
               );
         }
      }
   }

   private void OCOHORHCROHICRRIHCIHHRRCIHICRI(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (OCOHORHCROHICRRIHCIHHRRCIHICRI.HIOIORCICHOHCHCHRRIRHIIIOHICIH()
         == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.DUNGEON
         )
       {
         String var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(
               var1.RRCIOIRIRCCHCRCOOICRRORCRIHHRC()
            )
            .trim();
         String var3 = var2.toLowerCase();
         if (var2.startsWith(String.valueOf('☠')) && var2.endsWith("and became a ghost.")) {
            this.deaths++;
            String var4 = var2.split(" ")[1];
            if (var4.equals("You")) {
               var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPlayer().bridge$getName();
            }

            this.ICIOCCCCCCHRRHIRHOORHROOIROHOR(var4);
            if (this.deaths == 1) {
               for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var6 : IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getPlayer()
                  .bridge$getSendQueue()
                  .bridge$getPlayerInfoMap()) {
                  GameProfile var7 = var6.bridge$getGameProfile();
                  if (var7.getName().equals(var4)) {
                     String var8 = var7.getId().toString().replace("-", "");
                     this.CCICHRCORROHIOCIOIRHOICHRRIRHO(var8);
                  }
               }
            }
         } else if (this.HOHOCHICRHRIOCRCCICHIROORICOIC || !var3.contains("mimic dead!") && !var3.contains("mimic killed!")) {
            if (this.IORRICOICHOHCROORCCCIIOOORRHII || !var3.contains("blaze done!") && !var3.contains("blaze finished!")) {
               if (!this.HCROOOIHRIORCOCOCROHCHCRCCIOOR && var2.equals("[BOSS] The Watcher: You have proven yourself. You may pass.")) {
                  this.IORCHICCORHCOORICIHRIIROORHORH = OOOOCCOOOHCHCIIHOIHCRIIOOROHRC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCICCOCIHIRIHIIHIRRHORCHIIHIOI()
                     .RORCOCROCHRHROIIOCIOIRHIIIICOI()
                     .CHCIRRHIOCIRHHRCOOOHIOOIOOOOHH()
                     .IICCOOCHCHROORHHIIHROHCCRHRCOR(4000L)
                     .OHRHHOOHHCRORRROIROCHORCROHHCI()
                     .HRHIIHCRHHIIHCHCOHHHROORIIHOCR();
               } else if (!this.HIOCIOHOCCCICHIHRORCHCHOHRROCI && var2.equals("A Prince falls. +1 Bonus Score")) {
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCCIHCOCHOHOOHIHCRCORCCCOCCOCH(
                     "/pc Prince Dead!"
                  );
                  this.HIOCIOHOCCCICHIHRORCHCHOHRROCI = true;
               } else if (this.HIOCIOHOCCCICHIHRORCHCHOHRROCI || !var3.contains("prince dead!") && !var3.contains("prince killed!")) {
                  if (!this.ORIHOOIHCCROHRRIRCORIHHCHHHRIH && var2.equals("A Bat has been slain. +1 Bonus Score")) {
                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCCIHCOCHOHOOHIHCRCORCCCOCCOCH(
                        "/pc Bat Dead!"
                     );
                     this.ORIHOOIHCCROHRRIRCORIHHCHHHRIH = true;
                  } else if (!this.ORIHOOIHCCROHRRIRCORIHHCHHHRIH && (var3.contains("bat dead!") || var3.contains("bat killed!"))) {
                     this.ORIHOOIHCCROHRRIRCORIHHCHHHRIH = true;
                  }
               } else {
                  this.HIOCIOHOCCCICHIHRORCHCHOHRROCI = true;
               }
            } else {
               this.IORRICOICHOHCROORCCCIIOOORRHII = true;
            }
         } else {
            this.HOHOCHICRHRIOCRCCICHIROORICOIC = true;
         }

         if (!this.OCHHIICCHRRORRCHRORRROIHIIOIHO.get()) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = this.CRHHRIIOIHOOIROOCIRHORIROOHCRC
               .OCOCIIRHCIOCIOICHICIOOCROIOHIC();
            if (!var9.isBossFloor()) {
               return;
            }

            String var10 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getBossMessage(
               var9.getNumber()
            );
            if (var2.equals(var10)) {
               this.OCHHIICCHRRORRCHRORRROIHIIOIHO.set(true);
            }
         }
      }
   }

   private void ICIOCCCCCCHRRHIRHOORHROOIROHOR(String var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.IIRICHHIIHORRHICRHRCOCCCRRHRHC
         .OCHICCHCROOOHRHCIIIIHORRCRCROO()
         .orElse(null);
      if (var2 != null) {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var2.getPlayers()) {
            if (var4.ORICICIICROCRICRHRHHRCHHRCRHOR(true).equals(var1)) {
               var4.HRICOCHOHORIIOHCROIOHHRHRCIRHH();
               break;
            }
         }
      }
   }

   private void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      if (OCOHORHCROHICRRIHCIHHRRCIHICRI.HIOIORCICHOHCHCHRRIRHIIIOHICIH()
         == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.DUNGEON
         )
       {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = var1.HCICROIHRHRCORRHCOIHIHCCCCHRHH();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
         if (var3 != null) {
            if (!(var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3) > 100.0)) {
               Component var4 = var2.bridge$getCustomName();
               if (var4 != null) {
                  String var5 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(
                     var4
                  );
                  if (var5.contains(" Mimic ")) {
                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCCIHCOCHOHOOHIHCRCORCCCOCCOCH(
                        "/pc Mimic Dead!"
                     );
                     this.HOHOCHICRHRIOCRCCICHIROORICOIC = true;
                  }
               }
            }
         }
      }
   }

   private int RHOORRIIOCHIRRHOHOOHIROHCRICRO(int var1, int var2) {
      if (var1 >= var2) {
         return 0;
      }

      float var3 = 0.0F;
      float var4 = (float)var2 / var1;
      if (var4 > 1.6) {
         var3 += 18.666666F;
         var3 += (var4 - 1.6F) / 0.07F;
      } else if (var4 > 1.5) {
         var3 += 17.0F;
         var3 += (var4 - 1.5F) / 0.06F;
      } else if (var4 > 1.4) {
         var3 += 15.0F;
         var3 += (var4 - 1.4F) / 0.05F;
      } else if (var4 > 1.2) {
         var3 += 10.0F;
         var3 += (var4 - 1.2F) / 0.04F;
      } else {
         var3 += (var4 - 1.0F) / 0.02F;
      }

      return (int)var3;
   }

   private int ROHIRHRRROOCCHOCIIOIRIOCRIRHII(String var1) {
      String[] var2 = var1.split(" ");
      int var3 = 0;

      try {
         for (String var7 : var2) {
            int var8 = Integer.parseInt(var7.substring(0, var7.length() - 1));
            if (var7.endsWith("s")) {
               var3 += var8;
            } else if (var7.endsWith("m")) {
               var3 += var8 * 60;
            } else if (var7.endsWith("h")) {
               var3 += var8 * 3600;
            }
         }

         return var3;
      } catch (Exception var9) {
         System.err.println("Error parsing time string.");
         return -1;
      }
   }

   private void CCICHRCORROHIOCIOIRHOICHRRIRHO(String var1) {
      this.RIRHCHHHHHRCHIIHHHHOCRROCIIRRO = true;
      ORCOCORROHIROCCIORORRRRCHIOOCH.IOHHOIIOCRHCHHCRORICCOHOHROOIH(
         () -> {
            SkyblockProfileResponse var2 = SkyBlockProfilesUtil.getProfilesSync(var1);
            if (var2 != null) {
               boolean var3 = var2.profiles()
                  .find(var0 -> var0.selected().orElse(false))
                  .members()
                  .get(var1)
                  .petsData()
                  .pets()
                  .stream()
                  .anyMatch(var0 -> "SPIRIT".equals(var0.type().orElse("")) && "LEGENDARY".equals(var0.tier().orElse("")));
               ORCOCORROHIROCCIORORRRRCHIOOCH.RHCHRCOCCOIIIHCHRHIRCORHRHRICR(() -> this.RCCICOCCCHROHOCCHIHORIHHCOHOHH(var3));
            }
         }
      );
   }

   private void RCCICOCCCHROHOCCHIHORIHHCOHOHH(boolean var1) {
      this.OROIIHICIHCOHRCHROICHIOIRHROHH = var1;
      this.RIRHCHHHHHRCHIIHHHHOCRROCIIRRO = false;
   }

   public boolean RCRHRHCCROORIRRICRRCCRRRIHIIRC() {
      return this.OCHHIICCHRRORRCHRORRROIHIIOIHO.get();
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR var1
   ) {
      if (this.IORCHICCORHCOORICIHRIIROORHORH != null && this.IORCHICCORHCOORICIHRIIROORHORH.get() <= 0L) {
         this.HCROOOIHRIORCOCOCROHCHCRCCIOOR = true;
         this.IORCHICCORHCOORICIHRIIROORHORH.destroy();
         this.IORCHICCORHCOORICIHRIIROORHORH = null;
      }
   }

   @Generated
   public int HHIRCOHHHICIOOICICICIIHOORROCI() {
      return this.deaths;
   }

   @Generated
   public boolean CIHRHCCCOHOORCIHIHICIOHROROORC() {
      return this.RIRHCHHHHHRCHIIHHHHOCRROCIIRRO;
   }

   @Generated
   public boolean CCHHRCCCOOOIICRRRHCOIRRHOHCCOR() {
      return this.OROIIHICIHCOHRCHROICHIOIRHROHH;
   }

   @Generated
   public boolean CCCORHOCRIHOCIOHRCRHIRHORHCRRC() {
      return this.IORRICOICHOHCROORCCCIIOOORRHII;
   }

   @Generated
   public boolean HIOCIHIOIHRRROHOORCHCOIOIOIRIO() {
      return this.HOHOCHICRHRIOCRCCICHIROORICOIC;
   }

   @Generated
   public boolean OOOIRHOOHIROHICRCRCCIROHHHICIR() {
      return this.HIOCIOHOCCCICHIHRORCHCHOHRROCI;
   }

   @Generated
   public boolean HROORIOHCRRHOORRHCRHOCHICCIOHI() {
      return this.ORIHOOIHCCROHRRIRCORIHHCHHHRIH;
   }

   @Generated
   public boolean HIHRHRHCCHOHCCHCOOOIIIOROIIRIR() {
      return this.HCROOOIHRIORCOCOCROHCHCRCCIOOR;
   }

   @Generated
   public int OOROIRCIIOIRICORICOCOCIRRHIHHH() {
      return this.HIIOHCRRIOIIHRIRCOHRHOOOIHOROO;
   }

   @Generated
   public int IOOICCOHIOROOCIRHOIHHROCHIRHRO() {
      return this.OICCOHOCRRIIRHIORHCIRRIRHIHROO;
   }

   @Generated
   public int RIRRCOHHCCRCCRHORIHCCRIRRRRCRR() {
      return this.CIROHOCCIIIOCHRRRCRRHIORRICIOR;
   }

   @Generated
   public int RCORHHORCOIIHIROIHHHHIRIOIIRCR() {
      return this.OHCRHOHOICICOCCHCCHIHRRCICIHRR;
   }

   @Generated
   public int RIHHHORRIICOOIRCROCHIRIIIOOIIO() {
      return this.HHIHRHOOIHOOROOCOCHOCRHRHRIHIO;
   }

   @Generated
   public int HIRHIIHOIOICOCCIIHOCCIORCROHRH() {
      return this.CCHIHOICHCRRCOHIIRHHCCIHIICIRI;
   }

   @Generated
   public int ORHROCHHOORCCOCHHRCHIRIHROHHRI() {
      return this.CCHCOHCOIRIOORIRHOHRRCRHCCRIRO;
   }

   @Generated
   public int IRHORRIOICHCRRORIROICHICCOCOIC() {
      return this.RRCIIHOORRRHHIIRIRIHIIROCCHCHC;
   }

   @Generated
   public int CIOIIHHCCOOCHRRHCRICOOCRCHIOII() {
      return this.OCIOOOHOIHRIRROICCIOORCIIHIHOR;
   }
}
