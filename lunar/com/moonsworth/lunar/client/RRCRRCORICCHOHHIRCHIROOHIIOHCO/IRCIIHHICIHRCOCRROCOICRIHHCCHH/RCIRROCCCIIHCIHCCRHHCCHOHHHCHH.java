package com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.lunarclient.apollo.module.limb.ArmorPiece;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import mchorse.emoticons.capabilities.cosmetic.EmoteController;
import mchorse.emoticons.skin_n_bones.api.animation.AnimationMesh;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJArmature;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJBone;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, HRCHROOHRIHCRCRHRIIROCIRHOIRHH> {
   private final CORCOCICIRIOHROHROIIOOHICCHCRR CCHIRIHIOHIRRIORROIHHRIROOHCOC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
      this.CCHIRIHIOHIRRIORROIHHRIROOHCOC = var1;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10
   ) {
      if (!var2.bridge$isInvisible() && !var2.bridge$isInvisibleToPlayer() && !var2.bridge$isSpectator()) {
         List var11 = this.CCHIRIHIOHIRRIORROIHHRIROOHCOC
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2.bridge$getUniqueID(), var0 -> var0 == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.BODYWEAR || var0 == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HAT
            );
         if (!var11.isEmpty()) {
            EmoteController var12 = (EmoteController)EmoteController.get(var2);
            boolean var13 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
               .RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var2);

            for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var15 : var11) {
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var16 = var15.OOICHRIOOOOIOHOIHOIRIRROCHRIOO();
               if (var16 != null && !var16.RIOOHOOCORIROCOHRORRHHCIIORRCO() && var16.RCIIIRRHHHHRHRIRHHROIRICHIHROC().canShowCosmetic()) {
                  com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 = this.CCHIRIHIOHIRRIORROIHHRIROOHCOC
                     .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var16.ROICHIIIIOCIOCHRCHOIRORIHCCIRI());
                  if (var17 != null) {
                     IRCIIHHICIHRCOCRROCOICRIHHCCHH var18 = var17.RHHIRHCIOIORIIRCROOIOIRCIOHIII();
                     if (!this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var2)) {
                        var1.push();
                        if (var13) {
                           if (var16.RCIIIRRHHHHRHRIRHHROIRICHIHROC().getRenderAs() == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HAT) {
                              if (var12.animator != null) {
                                 BOBJArmature var19 = ((AnimationMesh)var12.animator.animation.meshes.get(0)).armature;
                                 var12.animator.setupMatrix((BOBJBone)var19.bones.get("head"));
                              }
                           } else {
                              if (var18 != IRCIIHHICIHRCOCRROCOICRIHHCCHH.BODY) {
                                 var1.pop();
                                 continue;
                              }

                              if (var12.animator != null) {
                                 BOBJArmature var20 = ((AnimationMesh)var12.animator.animation.meshes.get(0)).armature;
                                 var12.animator.setupMatrix((BOBJBone)var20.bones.get("low_body"));
                              }
                           }
                        }

                        var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(1.0F, 1.0F, 1.0F, 1.0F);
                        com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           var1, var2, var3, var15, var17, var10, var7, var6, false, var13, true
                        );
                        var1.pop();
                     }
                  }
               }
            }
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1, HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2, HHCCIRHCCCIIRHCROHIORHIRHHIORH var3, int var4, int var5
   ) {
      boolean var6 = var2.bridge$isEmoting();
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2.bridge$getWornCosmetics(), var0 -> var0 == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.BODYWEAR || var0 == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HAT, var4
      );
      if (var7 != null) {
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = var7.OOICHRIOOOOIOHOIHOIRIRROCHRIOO();
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = var8.RCIIIRRHHHHRHRIRHHROIRICHIHROC();
         if (var9.canShowCosmetic()) {
            com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = this.CCHIRIHIOHIRRIORROIHHRIROOHCOC
               .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8.ROICHIIIIOCIOCHRCHOIRORIHCCIRI());
            if (var10 != null) {
               if (!this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var2)) {
                  if (var6) {
                     boolean var11 = var10.RHHIRHCIOIORIIRCROOIOIRCIOHIII() == IRCIIHHICIHRCOCRROCOICRIHHCCHH.BODY;
                     if (!var11 && var9.getRenderAs() != RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HAT) {
                        return;
                     }

                     EmoteController var12 = var2.bridge$getEmoteController();
                     if (var12 != null) {
                        if (var12.emote != null && !var12.emote.shouldRenderBodywear()) {
                           return;
                        }

                        if (var12.animator != null) {
                           BOBJArmature var13 = ((AnimationMesh)var12.animator.animation.meshes.get(0)).armature;
                           String var14 = var11 ? "low_body" : "head";
                           var12.animator.setupMatrix((BOBJBone)var13.bones.get(var14), var1.CIRRHHHIRCHOHHCRCIHROHHRIOCOHO());
                           if (var11) {
                              var1.translate(0.0, 0.35F, 0.0);
                           }
                        }
                     }
                  }

                  RCIROOOOICRHCCRRCIORHHIRCOIIIC var15 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4).orElse(null);
                  if (var15 != null) {
                     IRRCCOICORICIHCHRHIHIHROIRHOCR var16 = this.RCIROOOOICRHCCRRCIORHHIRCOIIIC(var15).get();
                     if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 39 && var1.isOutlineBufferSource() && !var16.bridge$isOutline()) {
                        var16 = var16.bridge$getOutline().orElse(null);
                        if (var16 == null) {
                           return;
                        }
                     }

                     com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var1, var2, var3, var16, var7, var10, 0.0F, false, var6, var5
                     );
                  }
               }
            }
         }
      }
   }

   public Optional<RCIROOOOICRHCCRRCIORHHIRCOIIIC> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, int var2) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.bridge$getWornCosmetics(), var0 -> var0 == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.BODYWEAR || var0 == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HAT, var2
      );
      if (var3 == null) {
         return Optional.empty();
      }

      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = var3.OOICHRIOOOOIOHOIHOIRIRROCHRIOO();
      com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = this.CCHIRIHIOHIRRIORROIHHRIROOHCOC
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4.ROICHIIIIOCIOCHRCHOIRORIHCCIRI());
      if (var5 == null) {
         return Optional.empty();
      }

      RCIROOOOICRHCCRRCIORHHIRCOIIIC var6;
      if (var5.isDynamic()) {
         var6 = var4.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1).bridge$getPath().lastIndexOf(46) != -1
            ? var4.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1)
            : var5.IIHHORHOROOCIHHCORRRCIRHOIICCH();
      } else {
         var6 = var5.IIHHORHOROOCIHHCORRRCIRHOIICCH();
      }

      Optional var7 = this.CCHIRIHIOHIRRIORROIHHRIROOHCOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var1.bridge$getUniqueID());
      if (var7.isEmpty()) {
         return Optional.empty();
      }

      var7.map(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRRCCOICORICIHCHRHIHIHROIRHOCR::OOIIHHIHCIROIOOCOCHHROIRCROOHI
         )
         .filter(CRRRICCRROCOHHOHIICIHORCOORRRH.class::isInstance)
         .map(CRRRICCRROCOHHOHIICIHORCOORRRH.class::cast)
         .ifPresent(CRRRICCRROCOHHOHIICIHORCOORRRH::HICOOCROHIOCRCIIRROOOCRHRHOOOC);
      return Optional.of(var6);
   }

   public int IRCIIHHICIHRCOCRROCOICRIHHCCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      if (!var1.bridge$isInvisible() && !var1.bridge$isSpectator()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
         boolean var3 = var2.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            var0 -> var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHHCCIOICIIRRIRCHROOCCHRIHOROC()
               || !var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer()
         );
         return (
                  var1.bridge$isInvisibleToPlayer()
                     || var1.bridge$isSelf()
                        && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$getThirdPersonView() == 0
               )
               && !var3
            ? 0
            : CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1.bridge$getWornCosmetics(), var0 -> var0 == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.BODYWEAR || var0 == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HAT
            );
      } else {
         return 0;
      }
   }

   @Override
   public Optional<IRRCCOICORICIHCHRHIHIHROIRHOCR> RCIROOOOICRHCCRRCIORHHIRCOIIIC(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      return Optional.of(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IHHHRIICRCOOIOCOHICOCROCOHROOO
            .get(var1)
      );
   }

   @Override
   public boolean HCRHIHCHCOCRHOOHIOCOICHCHROIIO() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 8;
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .IIHRRHORCRCROCHHOHORCHCROCIHRO(var1);
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2
   ) {
      if (!var1.RHHIRHCIOIORIIRCROOIOIRCIOHIII().hasArmorSlot()) {
         return false;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = var2.bridge$getArmor(
         var1.RHHIRHCIOIORIIRCROOIOIRCIOHIII().getArmorSlot()
      );
      if (var3 != null && !var3.bridge$isEmpty()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4 = var1.RHHIRHCIOIORIIRCROOIOIRCIOHIII()
            .getArmorSlot();
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OCROCOHRIHRIRHRROHRRCHCORRCCHH();
         Optional var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class);
         if (var6.isPresent()) {
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var7 = (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var6.get();
            Set var8 = var7.ICOHIOIHHOIOHIOIICHICIRHOORCOI().get(var2.bridge$getUniqueID());
            if (var8 != null) {
               if (var4 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HEAD
                  && var8.contains(ArmorPiece.HELMET)) {
                  return false;
               }

               if (var4 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CHEST
                  && var8.contains(ArmorPiece.CHESTPLATE)) {
                  return false;
               }

               if (var4 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.LEGS
                  && var8.contains(ArmorPiece.LEGGINGS)) {
                  return false;
               }

               if (var4 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.FEET
                  && var8.contains(ArmorPiece.BOOTS)) {
                  return false;
               }
            }
         }

         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
         if (var4 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HEAD
            && var9.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2)) {
            return false;
         }

         if (var4 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CHEST
            && var9.CRRRICCRROCOHHOHIICIHORCOORRRH(var2)) {
            return false;
         }

         if (var4 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.LEGS
            && var9.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2)) {
            return false;
         }

         if (var4 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.FEET
            && var9.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2)) {
            return false;
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6) {
            Optional var10 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR();
            if (var10.isPresent()
               && ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var10.get())
                  .getConfig()
                  .hasFastRender()) {
               return true;
            }
         }

         return !var1.RICHIIORICCHROCCRIORORHOOIRIRH();
      } else {
         return false;
      }
   }
}
