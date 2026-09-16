package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH;

import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.websocket.marker.v1.BroadcastNewMarkerRequest;
import com.lunarclient.websocket.marker.v1.Marker;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIIIRHIHROIRCROHHROIHIIHRCRRHO;
import com.moonsworth.lunar.client.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import lombok.Generated;
import org.joml.Vector3d;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static final double IOCCOHIIORHRCIIIHCOIOIHRICICOC = Math.sqrt(3.0);
   private static final int ORRICRRROIOROCIIICHOHORCOCCHOI = 12;
   private final CRRRICCRROCOHHOHIICIHORCOORRRH HHHOHIOCCRICICIRHOCIIRHHIIOCCO;
   private final List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HHCIRIIOCCOHIIHICOORIHIHIHHOHI = new ArrayList<>();

   protected boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
      if (var2 == null) {
         return false;
      }

      double var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$getRenderDistance()
         * 16.0
         * IOCCOHIIORHRCIIIHCOIOIHRICICOC;
      var3 = Math.floor(var3 / 16.0) * 16.0;
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var5 = (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)com.moonsworth.lunar.client.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOHHIRRRHIORHOCHCORHHIHROCROH
         )
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, var3, IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTimer().RIRIOIIHRIRRHRROHRORICOHOIOHHH()
         )
         .OCOHORHCROHICRRIHCIHHRRCIHICRI(
            var1x -> {
               if (var1x == IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getRenderViewEntity()
                  || !var1x.bridge$isAlive()
                  || var1x.bridge$isInvisible()
                  || var1x.bridge$isInvisibleTo(var2)) {
                  return false;
               } else {
                  return var1x instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2x
                     ? !IIIIRHIHROIRCROHHROIHIIHRCRRHO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        var2x,
                        com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
                        )
                     )
                     : var1x instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH
                        || var1x.bridge$canBeCollidedWith();
               }
            }
         )
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               true, 0.2F, IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTimer().RIRIOIIHRIRRHRROHRORICOHOIOHHH()
            )
         )
         .OHCOIORHOCCRICIHIOIRHRIRROCHRR()
         .CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(var2.bridge$getWorld());
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)com.moonsworth.lunar.client.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.OICIICOCOHRIOHIIHROIOICIIHRIOR
         )
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, var3, IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTimer().RIRIOIIHRIRRHRROHRORICOHOIOHHH()
         )
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (var0, var1x) -> {
               if (!var1x.bridge$isAir() && !var1x.bridge$isWater() && !var1x.bridge$isFoliage() && !var1x.bridge$isFlower()) {
                  String var2x = var1x.bridge$getRegistryName();
                  if ("minecraft:barrier".equals(var2x)
                     || "minecraft:fire".equals(var2x)
                     || "minecraft:soul_fire".equals(var2x)
                     || "minecraft:end_portal".equals(var2x)
                     || "minecraft:portal".equals(var2x)
                     || "minecraft:nether_portal".equals(var2x)) {
                     return false;
                  } else {
                     return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 5
                        ? !"minecraft:snow_layer".equals(var2x)
                        : !"minecraft:snow".equals(var2x)
                           && !"minecraft:structure_void".equals(var2x)
                           && !"minecraft:structure_block".equals(var2x)
                           && !"minecraft:light".equals(var2x)
                           && !"minecraft:jigsaw".equals(var2x);
                  }
               } else {
                  return false;
               }
            }
         )
         .OHCOIORHOCCRICIHIOIRHRIRROCHRR()
         .CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(var2.bridge$getWorld());
      Vector3d var7 = var5.isSuccessful() ? var5.HCICROIHRHRCORRHCOIHIHCCCCHRHH().bridge$getEyePosition().RCICCRIHIORCCCRCCORIROCOIIORHC() : null;
      Vector3d var8 = var6.isSuccessful() ? var6.IIHOCOIHHIROCHIHHCCCORRCOHCHRC().RCICCRIHIORCCCRCCORIROCOIIORHC() : null;
      if (var7 != null && var8 != null) {
         Vector3d var9 = var2.bridge$getEyePosition(
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTimer().RIRIOIIHRIRRHRROHRORICOHOIOHHH()
            )
            .RCICCRIHIORCCCRCCORIROCOIIORHC();
         double var10 = var9.distance(var7);
         double var12 = var9.distance(var8);
         if (var10 <= var12) {
            var8 = null;
         } else {
            var7 = null;
         }
      }

      if (var7 == null && var8 == null) {
         return false;
      }

      Vector3d var18 = null;
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var19 = null;
      Optional var11 = Optional.empty();
      if (var7 != null) {
         var18 = var7;
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var20 = var5.HCICROIHRHRCORRHCOIHIHCCCCHRHH();
         if (var20.bridge$isMinecart() || var20.bridge$isBoat()) {
            var18 = new Vector3d(var20.bridge$getPosX(), var20.bridge$getPosY(), var20.bridge$getPosZ());
            var19 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ITEM;
            var11 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICOCCHOORHRIHCHORRORIOOCRIHROR()
               .ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var20.bridge$getPickResult());
         } else if (var20 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var13
            )
          {
            var19 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ITEM;
            var11 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICOCCHOORHRIHCHORRORIOOCRIHROR()
               .ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var13.bridge$getItemStack());
         } else if (var20 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var14
            )
          {
            var19 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.PLAYER;
            var11 = Optional.of(
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var14.bridge$getUniqueID(), var2.bridge$canSeeName(var14) ? var14.bridge$getDisplayNameComponent() : null, var14.bridge$showHat()
               )
            );
         } else {
            var19 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ENTITY;
            var11 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICHORHOHRHRIRRICHOCROHIHRRIHO()
               .ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var20);
         }
      }

      if (var8 != null) {
         RORCHCIIICOHIRROOORHOCCCCIOCCI var21 = var6.HRICRCHIIHIIICIHCICRHOOCRCCHIO();
         if (var8.x + var8.y + var8.z == 0.0) {
            var18 = new Vector3d(var21.bridge$toJoml());
         } else {
            var18 = var8;
         }

         var19 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.BLOCK;
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var23 = var2.bridge$getWorld()
            .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var21);
         if (var23 != null) {
            IIRHCHHOICHRICOOCRORCCIOOIHOIR var25 = var23.bridge$getStack(var21);
            if (var25 != null && var25.bridge$getItem() != null && !var25.bridge$isEmpty()) {
               var11 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICOCCHOORHRIHCHORRORIOOCRIHROR()
                  .ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var25);
            } else {
               String var15 = var23.bridge$getRegistryName();
               if ("minecraft:lava".equals(var15) || "minecraft:flowing_lava".equals(var15)) {
                  var15 = "minecraft:lava_bucket";
               }

               Optional var16 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICHHRRHHCCCCIRHCORIHIRHHOCHIOO(
                  var15
               );
               if (var16.isPresent()) {
                  var11 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICOCCHOORHRIHCHORRORIOOCRIHROR()
                     .ICICIOCHHHIHOCHCOHORIHRCOHHOCR((IIRHCHHOICHRICOOCRORCCIOOIHOIR)var16.get());
               }
            }
         }
      }

      if (CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "[Markers] typeKey = %s", var11
         );
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var22 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var19,
         (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var11.orElse(
            null
         ),
         var1
      );
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var24 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2.bridge$getUniqueID(), var2.bridge$getName(), IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION, var18, var22
      );
      this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.add(var24);
      this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO.CRRRICCRROCOHHOHIICIHORCOORRRH(var24);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var24);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var24);
      return true;
   }

   protected void ORCOOCHRICHOIHHIHIOHCHCRIOHRCR() {
      long var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
      long var3 = TimeUnit.SECONDS.toMillis(this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO.HOIRCHORIIRCCOIOOORORHOCHIICIO().get().intValue());
      Iterator var5 = this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.iterator();

      while (var5.hasNext()) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var5.next();
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = var6.IRIOHHORCOORCRIHCCCCCRCIRROCOH();
         long var8 = var7 != null && var7.OOHHCOCROHCRHHOHIOHICRCHIIRHCC() != null ? var7.OOHHCOCROHCRHHOHIOHICRCHIIRHCC() : var3;
         long var10 = var6.CCRCIRRHRRHCIHHORIHOIROHIOORHR() ? var6.ORCRHCRCOHCCIRCHRCIHIORHIIIIRC() : var6.RRHICORHOHRIORCHRIHCICOIIORCRR();
         if (var1 - var10 >= var8) {
            var5.remove();
         } else {
            var6.IHIRRIIORRHORHRORIHOROIRCORCOO(var1 - var6.RRHICORHOHRIORCHRIHCICOIIORCRR());
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      Vector3d var2 = var1.ROOCCHRHHIIOICICHIIRRHCOCOCIHC();
      double var3 = var2.x;
      double var5 = var2.y;
      double var7 = var2.z;
      Iterator var9 = this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.iterator();

      while (var9.hasNext()) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var9.next();
         if (var10 != var1 && !var10.CCRCIRRHRRHCIHHORIHOIROHIOORHR()) {
            if (var10.getOwnerId().equals(var1.getOwnerId())) {
               var2 = var10.ROOCCHRHHIIOICICHIIRRHCOCOCIHC();
               double var11 = var2.x - var3;
               double var13 = var2.y - var5;
               double var15 = var2.z - var7;
               if (var11 * var11 + var13 * var13 + var15 * var15 <= 1.8225000000000002) {
                  var9.remove();
                  continue;
               }
            }

            if (this.RRHHHIRCCRIRICHIHIIHCCOIIOIHOC() > 12L) {
               boolean var19 = var10.CHOOHRRRIHRORIICRROCOIHHICRRRR != null && !var10.CHOOHRRRIHRORIICRROCOIHHICRRRR.ORORHCIIHOHCOHCCIIRCOHOCCHHCHR();
               boolean var12 = var10.HCRHICOIHCRROHHICOCIIHCCIRICHH()
                  >= TimeUnit.SECONDS.toMillis(this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO.HOIRCHORIIRCCOIOOORORHOCHIICIO().get().intValue());
               if (var19 || var12) {
                  var9.remove();
               }
            }
         }
      }

      while (this.RRHHHIRCCRIRICHIHIIHCCOIIOIHOC() > 12L) {
         int var18 = -1;

         for (int var20 = 0; var20 < this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.size(); var20++) {
            if (!this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.get(var20).CCRCIRRHRRHCIHHORIHOIROHIOORHR()) {
               var18 = var20;
               break;
            }
         }

         if (var18 == -1) {
            break;
         }

         this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.remove(var18);
      }
   }

   private long RRHHHIRCCRIRICHIHIIHCCOIIOIHOC() {
      return this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.stream().filter(var0 -> !var0.CCRCIRRHRRHCIHHORIHOIROHIOORHR()).count();
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      List var2 = this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO
         .OHHHRRIOICOCIIOCICIOOCIIHOORHH()
         .IHRICIIOIHRRCCICRRHIRICOCIHOCH()
         .stream()
         .map(CCHORHIOORICCIRIHRIIHIICORIORO::IRIHOIRCHIRRCRIOORCOICORHHORHH)
         .toList();
      if (var2.isEmpty()) {
         if (CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "[Markers] Not broadcasting marker because no receivers"
            );
         }
      } else {
         Marker var3 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO.OHHHRRIOICOCIIOCICIOOCIIHOORHH().IRHCCRHIRHOIICICRCOHROIHRRHHHO()
         );
         if (CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR) {
            String var4 = this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO
               .OHHHRRIOICOCIIOCICIOOCIIHOORHH()
               .IHRICIIOIHRRCCICRRHIRICOCIHOCH()
               .stream()
               .map(UUID::toString)
               .collect(Collectors.joining(","));
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "[Markers] Broadcasting marker to [%s]: %s", var4, var3
            );
         }

         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(
               var2x -> var2x.HHOHOCIOHIHHCCOCIOROCIHRORCIHI()
                  .broadcastNewMarker(null, BroadcastNewMarkerRequest.newBuilder().addAllReceiverUuids(var2).setMarker(var3).build(), var0x -> {})
            );
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, Marker var2) {
      if (this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO.isEnabled()) {
         if (CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "[Markers] Received external marker from %s", var1
            );
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
         if (var3 != null && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null) {
            Vector3f var4 = var2.getPosition();
            float var5 = var4.getX() - var3.bridge$getBlockX();
            float var6 = var4.getY() - var3.bridge$getBlockY();
            float var7 = var4.getZ() - var3.bridge$getBlockZ();
            float var8 = var5 * var5 + var6 * var6 + var7 * var7;
            if (var8 > 1048576.0F) {
               if (CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     "[Markers] Discarding marker from %s because too far away %.2f", var1, Math.sqrt(var8)
                  );
               }
            } else {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRICRRCHRHCCOOHCHHCRCCIRRICRHO(
                  var2.getSource()
               );
               if (this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO.OHHHRRIOICOCIIOCICIOOCIIHOORHH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, var1)) {
                  if (CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR) {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        "[Markers] Adding external marker %s", var2
                     );
                  }

                  String var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$getClientPacketListener()
                     .bridge$getPlayerInfo(var1)
                     .bridge$getGameProfile()
                     .getName();
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1, var10, var9.HOHIIROCCIIOOIOCHRHROIOICOIHCH(), var2
                  );
                  this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.add(var11);
                  this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO.CRRRICCRROCOHHOHIICIHORCOORRRH(var11);
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11);
               }
            }
         }
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI) {
         if (var4.CCRCIRRHRRHCIHHORIHOIROHIOORHR() && var4.IRIOHHORCOORCRIHCCCCCRCIRROCOH().getId().equals(var2.getId())) {
            var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
            return;
         }
      }

      this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.add(var1);
      this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
   }

   public void HIOCCRCCCRICORCIIHHRIRROICHRIC(String var1) {
      this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI
         .removeIf(var1x -> var1x.CCRCIRRHRRHCIHHORIHOIROHIOORHR() && var1x.IRIOHHORCOORCRIHCCCCCRCIRROCOH().getId().equals(var1));
   }

   public void ROIRHCRRCOHHRIOOORIRORIRCROORH() {
      this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI.removeIf(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::CCRCIRRHRRHCIHHORIHOIROHIOORHR);
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.HHHOHIOCCRICICIRHOCIIRHHIIOCCO = var1;
   }

   @Generated
   public List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ICOCCRORHRRHCHHIOHRRRRRHIOICRC() {
      return this.HHCIRIIOCCOHIIHICOORIHIHIHHOHI;
   }
}
