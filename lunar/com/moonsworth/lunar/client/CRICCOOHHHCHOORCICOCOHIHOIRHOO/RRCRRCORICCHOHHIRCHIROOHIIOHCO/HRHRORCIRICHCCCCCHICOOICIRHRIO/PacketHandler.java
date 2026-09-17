package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRHRORCIRICHCCCCCHICOOICIRHRIO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.ICICIOCHHHIHOCHCOHORIHRCOHHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import lombok.Generated;
import org.joml.Vector3f;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final float RIRCHHIRIHIHHIIROORRRIICHIRRIH = 32.0F;
   private static final float HCHCICORCOOIIOCOHICHIROROHCCCO = 128.0F;
   private final CRRRICCRROCOHHOHIICIHORCOORRRH COCHRRIRHRIIORIOOICHCHRHIOCICH = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(CRRRICCRROCOHHOHIICIHORCOORRRH.class);
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH RRRCIHROIOORHCHHHIHCOCRCHROICC = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(HHCCIRHCCCIIRHCROHIORHIRHHIORH.class);
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI HHROHHIHCIHOIRHHHOOOCRHOHCCOCI = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("apolloTeams")
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIIRHHIOICCCIRIRCRRHIRIOCCRIO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "teamviewHypixel"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI ICHHRHRICIOCHIRIIRCCHHROOIOOHH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR(
         "hypixelTeamColor"
      )
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(-13893823)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI CCORIICHCOCIIOHCOIROOOHIIIOICR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR(
         "hypixelPartyColor"
      )
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(-604620)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHIHCOHOIRHRRIHHHCCIROICIRIHHR = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   private final Set<String> HIORCCCOOOCOOIIRCIHCCOHIIHIROH = new HashSet<>();
   private final Set<UUID> OHOCOROIOHRRCICCRCROROROHOHOOO = new HashSet<>();

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      super(true);
      this.handle(RRCRRCORICCHOHHIRCHIROOHIIOHCO.class, this::HHCCIRHCCCIIRHCROHIORHIRHHIORH);
      this.handle(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, this::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
   }

   @Override
   public String getId() {
      return "TEAM_VIEW";
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GENERAL,
         var1x -> {
            var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(this.HHROHHIHCIHOIRHHHOOOCRHOHCCOCI);
            var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.RCIIRHHIOICCCIRIRCRRHIRIOCCRIO,
                  var1xx -> var1xx.CRRRICCRROCOHHOHIICIHORCOORRRH(this.ICHHRHRICIOCHIRIIRCCHHROOIOOHH, this.CCORIICHCOCIIOHCOIROOOHIIIOICR)
               )
               .HRICOCOIOCCCICCIORHIIIIOROCOHC(1);
         }
      );
   }

   @Override
   public void COIHORRCHRRCHOCIRHHRRIOIHRIHCC(boolean var1) {
      this.HIORCCCOOOCOOIIRCIHCCOHIIHIROH.clear();
      this.OHOCOROIOHRRCICCRCROROROHOHOOO.clear();
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      OCOHORHCROHICRRIHCIHHRRCIHICRI var2 = var1.HHIIOHOORHHCCHRHHRCIORCROORCOI();
      float var3 = this.mc.bridge$getTimer().RIRIOIIHRIRRHRROHRORICOHOIOHHH();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.IHRHHIOIIICOROOORIOHCIROIRCOHH();
      if (var4 != null
         && (
            !com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OOICHHIHHIHROCCRRRIIIIRIRICCIH()
               || !var4.bridge$getCamera().isEmpty()
         )) {
         float var5 = (float)var4.bridge$renderPosX();
         float var6 = (float)var4.bridge$renderPosY();
         float var7 = (float)var4.bridge$renderPosZ();
         double var8 = (this.mc.bridge$getPlayer().bridge$getRotationPitch() + 90.0) * Math.PI / 180.0;
         double var10 = (this.mc.bridge$getPlayer().bridge$getRotationYaw() + 90.0) * Math.PI / 180.0;
         if (this.mc.bridge$getGameSettings().bridge$getThirdPersonView() == 2) {
            var10 = (this.mc.bridge$getPlayer().bridge$getRotationYaw() - 90.0) * Math.PI / 180.0;
         }

         CRHROHHHCIHHCOHCOORCRIHHIICROR var12 = CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR.sin(var8) * ICICIOCHHHIHOCHCOHORIHRCOHHOCR.HRHRORCIRICHCCCCCHICOOICIRHRIO(var10),
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR.HRHRORCIRICHCCCCCHICOOICIRHRIO(var8),
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR.sin(var8) * ICICIOCHHHIHOCHCOHORIHRCOHHOCR.sin(var10)
         );
         if (this.HHROHHIHCIHOIRHHHOOOCRHOHCCOCI.get()) {
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRHROHHHCIHHCOHCOORCRIHHIICROR var13 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .RHIIORHOIHHICHORHRIRHIIROCHOHO();

            for (com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var15 : var13.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
               .values()) {
               Component var16 = var15.HCHCCRIRROCHOOIHRRHROIRIRICCII();
               int var17 = var15.getColor();
               Optional var18 = this.mc.bridge$getWorld().bridge$getPlayerByUniqueId(var15.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI());
               var18.ifPresentOrElse(var9 -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var16, var3, var9, var17, var12, var5, var6, var7), () -> {
                  if (var13.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var15)) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var16, var17, var12, var5, var6, var7, var15);
                  }
               });
            }
         }

         if (this.RCIIRHHIOICCCIRIRCRRHIRIOCCRIO.get()
            && com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
            )) {
            this.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
               var7x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var2,
                  var7x.bridge$getDisplayNameComponent(),
                  var3,
                  var7x,
                  this.ICHHRHRICIOCHIRIIRCCHHROOIOOHH.CHRHCORIRCORHHIIROCRORHIROICOC(),
                  var12,
                  var5,
                  var6,
                  var7
               )
            );
            this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
               var7x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var2,
                  var7x.bridge$getDisplayNameComponent(),
                  var3,
                  var7x,
                  this.CCORIICHCOCIIOHCOIROOOHIIIOICR.CHRHCORIRCORHHIIROCRORHIROICOC(),
                  var12,
                  var5,
                  var6,
                  var7
               )
            );
         }
      }
   }

   public void IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
      Consumer<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1
   ) {
      for (UUID var3 : this.OHOCOROIOHRRCICCRCROROROHOHOOO) {
         this.mc.bridge$getWorld().bridge$getPlayerByUniqueId(var3).filter(IRCIIHHICIHRCOCRROCOICRIHHCCHH::HICRRICCHCCROOHHCHOCOCCHOIHHOC).ifPresent(var1);
      }
   }

   public void RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
      Consumer<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1
   ) {
      for (String var3 : this.HIORCCCOOOCOOIIRCIHCCOHIIHIROH) {
         this.mc
            .bridge$getWorld()
            .bridge$getPlayerByName(var3)
            .filter(var1x -> HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1x) && !this.OHOCOROIOHRRCICCRCROROROHOHOOO.contains(var1x.bridge$getUniqueID()))
            .ifPresent(var1);
      }
   }

   private static boolean HICRRICCHCCROOHHCHOCOCCHOIHHOC(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
   ) {
      return !var0.bridge$isSelf() && !var0.bridge$isSneaking() && !var0.bridge$isInvisibleToPlayer() && !var0.bridge$isInvisible();
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1) {
      this.HIORCCCOOOCOOIIRCIHCCOHIIHIROH.clear();
      this.OHOCOROIOHRRCICCRCROROROHOHOOO.clear();
      if (this.RCIIRHHIOICCCIRIRCRRHIRIOCCRIO.get()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
         && this.RCIIRHHIOICCCIRIRCRRHIRIOCCRIO.get()
         && com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
         )) {
         if (!this.HHIHCOHOIRHRRIHHHCCIROICIRIHHR.isLoaded()) {
            try {
               this.HHIHCOHOIRHRRIHHHCCIROICIRIHHR.load();
            } catch (Exception var3) {
               com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var3, "Loading Hypixel TeamView data json"
               );
            }
         }

         if (!this.HHIHCOHOIRHRRIHHHCCIROICIRIHHR.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.RRRCIHROIOORHCHHHIHCOCRCHROICC.RRRCHORHHHIHOCIOCRICCOIOOHHCOO())) {
            if (this.HHIHCOHOIRHRRIHHHCCIROICIRIHHR.CRRRICCRROCOHHOHIICIHORCOORRRH(this.RRRCIHROIOORHCHHHIHCOCRCHROICC.RRRCHORHHHIHOCIOCRICCOIOOHHCOO())) {
               this.COCHRRIRHRIIORIOOICHCHRHIOCICH
                  .HRCOOHCRCHOCHOIHIHHHCRHOCCOHRR()
                  .map(
                     com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH::IOICCIIRHOOCCHIOOCRRHRCROOHCCC
                  )
                  .ifPresent(this.HIORCCCOOOCOOIIRCIHCCOHIIHIROH::addAll);
            } else {
               this.HCCORIHRIRRICHHRCRIIROHIHOHHOI();
            }
         }
      }
   }

   private void HCCORIHRIRRICHHRCRIIROHIHOHHOI() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getClientPacketListener();
      if (var1 != null) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = var1.bridge$getPlayerInfo(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID()
         );
         if (var2 != null) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
               .bridge$getWorld()
               .bridge$getScoreBoard();
            if (var3 != null) {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var3.bridge$getObjectiveInDisplaySlot(
                  1
               );
               if (var4 != null) {
                  for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 : var3.bridge$getSortedScores(
                     var4
                  )) {
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = var3.bridge$getPlayersTeam(
                        var7.bridge$getPlayerName()
                     );
                     Component var9 = var7.bridge$getPlayerComponent();
                     if (var8 != null) {
                        var9 = var8.bridge$formatString(var9);
                     }

                     if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.startsWith(
                           var9, "Waiting..."
                        )
                        || com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.startsWith(
                           var9, "Starting in "
                        )) {
                        return;
                     }
                  }

                  Component var12 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getFirstColoredComponent(
                     var2.bridge$formatName()
                  );
                  if (var12 != null) {
                     int var13 = 0;
                     int var14 = 0;

                     for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var10 : var1.bridge$getPlayerInfoMap()) {
                        if (var10 != var2) {
                           Component var11 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getFirstColoredComponent(
                              var10.bridge$formatName()
                           );
                           if (var11 != null) {
                              var13++;
                              if (Objects.equals(var12.style(), var11.style())) {
                                 var14++;
                                 this.OHOCOROIOHRRCICCRCROROROHOHOOO.add(var10.bridge$getGameProfile().getId());
                              }
                           }
                        }
                     }

                     if (var13 == var14) {
                        this.OHOCOROIOHRRCICCRCROROROHOHOOO.clear();
                     }
                  }
               }
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      int var3,
      CRHROHHHCIHHCOHCOORCRIHHIICROR var4,
      float var5,
      float var6,
      float var7,
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8
   ) {
      CRHROHHHCIHHCOHCOORCRIHHIICROR var9 = var8.RRRRHORROHCHCRCHIRRHORRHRICIRR();
      CRHROHHHCIHHCOHCOORCRIHHIICROR var10 = var8.OHHHOOOCOCCHIOOIHCRIIRRHRHOCCH();
      if (var9 != null && var10 != null) {
         double var11 = var9.bridge$xCoord();
         double var13 = var9.bridge$yCoord();
         double var15 = var9.bridge$zCoord();
         double var17 = var10.bridge$xCoord();
         double var19 = var10.bridge$yCoord();
         double var21 = var10.bridge$zCoord();
         double var23 = var8.HIRIRHRRIRICICOCRORIRIHHRCCOIO();
         float var25 = (float)(var17 + (var11 - var17) * var23 - var5);
         float var26 = (float)(var19 + (var13 - var19) * var23 - var6);
         float var27 = (float)(var21 + (var15 - var21) * var23 - var7);
         float var28 = (float)Math.sqrt(var25 * var25 + var26 * var26 + var27 * var27);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var25, var26 + 3.0F, var27, var4, var28, true);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      float var3,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var4,
      int var5,
      CRHROHHHCIHHCOHCOORCRIHHIICROR var6,
      float var7,
      float var8,
      float var9
   ) {
      if (var4 != this.mc.bridge$getPlayer()) {
         double var10 = var4.bridge$getPosX();
         double var12 = var4.bridge$getPosY();
         double var14 = var4.bridge$getPosZ();
         double var16 = var4.bridge$lastTickX();
         double var18 = var4.bridge$lastTickY();
         double var20 = var4.bridge$lastTickZ();
         float var22 = (float)(var16 + (var10 - var16) * var3 - var7);
         float var23 = (float)(var18 + (var12 - var18) * var3 - var8);
         float var24 = (float)(var20 + (var14 - var20) * var3 - var9);
         float var25 = (float)Math.sqrt(var22 * var22 + var23 * var23 + var24 * var24);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var5, var22, var23 + 3.0F, var24, var6, var25, false);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      int var3,
      float var4,
      float var5,
      float var6,
      CRHROHHHCIHHCOHCOORCRIHHIICROR var7,
      float var8,
      boolean var9
   ) {
      byte var10 = 6;
      byte var11 = 8;
      var1.push();
      Vector3f var12 = new Vector3f(var4, var5, var6);
      float var13 = Math.min(var8, 128.0F);
      float var14 = 0.016666668F * (1.0F + var13 * 0.15F);
      if (var8 > 32.0F) {
         var12.mul(32.0F / var8);
         var14 *= 32.0F / var13;
      }

      CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var12);
      var1.scale(-var14, -var14, var14);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var10, -(var11 / 2.0F) - var11, var11);
      var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI::OIIHIOIORRHHRCRRCCORRHHCHRHORH);
      if (var9) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var15 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR();
         String var16 = "(" + (int)var8 + "m)";
         CRHROHHHCIHHCOHCOORCRIHHIICROR var17 = CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var4, var5, var6).bridge$normalize();
         var15.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var16, var15.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var16, 0.0F), 10.0F, 2030043135, true);
         if (var2 != null && var7.bridge$dotProduct(var17) > 0.99) {
            var15.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var15.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, 0.0F), 20.0F, 2030043135, true);
         }
      }

      var1.pop();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, int var2, float var3, float var4, float var5) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var6 = var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCCICRHCOIHOHHOCCORCHRORCCCRR
      );
      float var7 = (var2 >> 16 & 0xFF) / 255.0F;
      float var8 = (var2 >> 8 & 0xFF) / 255.0F;
      float var9 = (var2 & 0xFF) / 255.0F;
      var1.push();
      var1.scale(0.5F, 0.5F, 0.5F);
      var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(45.0F, 0.0F, 0.0F, 1.0F);
      var1.translate(var3 * 2.0F, 0.0, 0.0);
      var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(90.0F, 0.0F, 0.0F, -1.0F);
      var6.HICHHHOOCRROHCCCCOOHOCHHOIOHCR();
      var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(-var3, var4, 0.0).CIOHHCORHRCCRICCCORIHCRHCCCRRR(var7, var8, var9, 0.75F).RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
      var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(-var3, var4 + var5 / 2.0F, 0.0)
         .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var7, var8, var9, 0.75F)
         .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
      var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, var4 + var5 / 2.0F, 0.0)
         .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var7, var8, var9, 0.75F)
         .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
      var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, var4, 0.0).CIOHHCORHRCCRICCCORIHCRHCCCRRR(var7, var8, var9, 0.75F).RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
      var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BATCHED
      );
      var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(90.0F, 0.0F, 0.0F, -1.0F);
      var1.translate(var3 * 2.0F + 3.0F, var5 / 2.0F + 2.0F, 0.0);
      var6.HICHHHOOCRROHCCCCOOHOCHHOIOHCR();
      var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(-var3 / 2.0F, var4, 0.0).CIOHHCORHRCCRICCCORIHCRHCCCRRR(var7, var8, var9, 0.75F).RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
      var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(-var3 / 2.0F, var4 + var5 / 2.0F, 0.0)
         .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var7, var8, var9, 0.75F)
         .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
      var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3 - 1.0F, var4 + var5 / 2.0F, 0.0)
         .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var7, var8, var9, 0.75F)
         .RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
      var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3 - 1.0F, var4, 0.0).CIOHHCORHRCCRICCCORIHCRHCCCRRR(var7, var8, var9, 0.75F).RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC();
      var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BATCHED
      );
      var1.pop();
   }

   @Override
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCOCHOCIRORHHORHCROHOIOCRCHIO
         )
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   @Generated
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI ICHCHHIOIHRHHRHCHHICCIIOHIIHIH() {
      return this.ICHHRHRICIOCHIRIIRCCHHROOIOOHH;
   }

   @Generated
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI OOIHRIICCCCRRCRCHCHOCCRCCOIHRI() {
      return this.CCORIICHCOCIIOHCOIROOOHIIIOICR;
   }
}
