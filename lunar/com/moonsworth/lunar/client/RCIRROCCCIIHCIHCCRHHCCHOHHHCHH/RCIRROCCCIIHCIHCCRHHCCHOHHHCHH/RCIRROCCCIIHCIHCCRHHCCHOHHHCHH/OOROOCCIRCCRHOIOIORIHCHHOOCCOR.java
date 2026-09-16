package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.cosmetic.v1.BodyOptions;
import com.lunarclient.apollo.cosmetic.v1.Cosmetic;
import com.lunarclient.apollo.cosmetic.v1.DisplaySprayMessage;
import com.lunarclient.apollo.cosmetic.v1.Emote;
import com.lunarclient.apollo.cosmetic.v1.EquipNpcCosmeticsMessage;
import com.lunarclient.apollo.cosmetic.v1.HatOptions;
import com.lunarclient.apollo.cosmetic.v1.RemoveSprayMessage;
import com.lunarclient.apollo.cosmetic.v1.ResetNpcCosmeticsMessage;
import com.lunarclient.apollo.cosmetic.v1.ResetNpcEmotesMessage;
import com.lunarclient.apollo.cosmetic.v1.ResetSpraysMessage;
import com.lunarclient.apollo.cosmetic.v1.StartNpcEmoteMessage;
import com.lunarclient.apollo.cosmetic.v1.StopNpcEmoteMessage;
import com.lunarclient.apollo.cosmetic.v1.UnequipNpcCosmeticsMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOCCRCRCOHIIORCCORCRCIRRROIOOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final UUID IIOIIRHIHIHROIHHOROOHCHCOOCRIC = new UUID(0L, 0L);
   private final Set<UUID> OHCROCICCCORCIRCIHRRCIORCHOHRH = new HashSet<>();
   private final Set<UUID> HOHHOCRCRCHRRHHOIIHOCOIOCOIRRO = new HashSet<>();

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
      super("cosmetic", "Cosmetic");
   }

   @Override
   protected void onDisable() {
      for (UUID var2 : this.OHCROCICCCORCIRCIHRRCIORCHOHRH) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCRIIICORIICOIIOHIIHICCCOCRICC().removePlayer(var2);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IOHRIRCHOCIOIOIHIHOCCCHOHOHOCH().CHHIICHRIIROIOHIHIIROICOCCROCI(var2);
      }

      this.OHCROCICCCORCIRCIHRRCIORCHOHRH.clear();
      this.RCIOHCHIIOOHHRRHHRHOOORCCIIHIR();
      this.ORHIORRHIHICOOIOCIIHOIHRHHRHOC();
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(
         EquipNpcCosmeticsMessage.class,
         UnequipNpcCosmeticsMessage.class,
         ResetNpcCosmeticsMessage.class,
         DisplaySprayMessage.class,
         RemoveSprayMessage.class,
         ResetSpraysMessage.class,
         StartNpcEmoteMessage.class,
         StopNpcEmoteMessage.class,
         ResetNpcEmotesMessage.class
      );
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         EquipNpcCosmeticsMessage.class,
         var1x -> {
            UUID var2 = NetworkTypes.fromProtobuf(var1x.getNpcUuid());
            ArrayList var3 = new ArrayList();
            HashMap var4 = new HashMap();
            if (var1x.getCopyLocalCosmetics()
               && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIOHCIIORCIOIHHCOHHIHIHCHOCRC()
               )
             {
               for (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HCCICHCRRIICICCHCIRCRRIIRROHHC()
                  .HRHIHIRHRCHHRORRRCORHOCIRHRIOR(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID())) {
                  int var7 = (int)var6.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().RCOCIIHHOIHOOCCCIICCRHHRRCCCCH();
                  var3.add(var7);
                  var4.put(var7, var6.OICIHICHOHCIHIHIHHIRHIIRIHRCRR());
               }
            }

            for (Cosmetic var9 : var1x.getCosmeticsList()) {
               var3.add(var9.getId());
               com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var10 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9);
               if (var10 != null) {
                  var4.put(var9.getId(), var10);
               }
            }

            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var4);
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UnequipNpcCosmeticsMessage.class, var1x -> {
         UUID var2 = NetworkTypes.fromProtobuf(var1x.getNpcUuid());
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1x.getCosmeticIdsList());
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetNpcCosmeticsMessage.class, var1x -> {
         UUID var2 = NetworkTypes.fromProtobuf(var1x.getNpcUuid());
         this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2);
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DisplaySprayMessage.class,
         var1x -> {
            ApolloBlockLocation var2 = NetworkTypes.fromProtobuf(var1x.getLocation());
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.byId(
               var1x.getFacingValue() - 1
            );
            int var4 = (int)(NetworkTypes.fromProtobuf(var1x.getDuration()).toMillis() / 50L);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x.getSprayId(), var2, var3, var1x.getRotation(), var4);
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RemoveSprayMessage.class,
         var1x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x.getSprayId(), var1x.hasLocation() ? NetworkTypes.fromProtobuf(var1x.getLocation()) : null)
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetSpraysMessage.class, var1x -> this.RCIOHCHIIOOHHRRHHRHOOORCCIIHIR());
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StartNpcEmoteMessage.class, var1x -> {
         UUID var2 = NetworkTypes.fromProtobuf(var1x.getNpcUuid());
         Emote var3 = var1x.getEmote();
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3.getId(), var3.getMetadata());
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StopNpcEmoteMessage.class, var1x -> {
         UUID var2 = NetworkTypes.fromProtobuf(var1x.getNpcUuid());
         this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetNpcEmotesMessage.class, var1x -> this.ORHIORRHIHICOOIOCIIHOIHRHHRHOC());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, List<Integer> var2, @Nullable Map<Integer, CRRRICCRROCOHHOHIICIHORCOORRRH> var3) {
      if (this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1)) {
         List var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
            var2
         );
         if (var4 != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HCCICHCRRIICICCHCIRCRRIIRROHHC().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var4, var3);
            this.OHCROCICCCORCIRCIHRRCIORCHOHRH.add(var1);
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, List<Integer> var2) {
      if (this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1)) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HCCICHCRRIICICCHCIRCRRIIRROHHC().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
      }
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(UUID var1) {
      if (this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1)) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCRIIICORIICOIIOHIIHICCCOCRICC().removePlayer(var1);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IOHRIRCHOCIOIOIHIHOCCCHOHOHOCH().CHHIICHRIIROIOHIHIIROICOCCROCI(var1);
         this.OHCROCICCCORCIRCIHRRCIORCHOHRH.remove(var1);
      }
   }

   private boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(UUID var1) {
      return var1.getLeastSignificantBits() == 0L;
   }

   @Nullable
   private CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Cosmetic var1) {
      com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = new com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
      switch (var1.getOptionsCase()) {
         case HAT_OPTIONS:
            HatOptions var4 = var1.getHatOptions();
            var2.RORCHCIIICOHIRROOORHOCCCCIOCCI(var4.getShowOverHelmet());
            var2.RCCCROCHCICCROHCOCCRRROCIIHCCH(var4.getShowOverSkinLayer());
            var2.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var4.getHeightOffset());
            break;
         case CLOAK_OPTIONS:
            var2.CRHROHHHCIHHCOHCOORCRIHHIICROR(var1.getCloakOptions().getUseClothPhysics());
            break;
         case PET_OPTIONS:
            var2.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1.getPetOptions().getFlipShoulder());
            break;
         case BODY_OPTIONS:
            BodyOptions var3 = var1.getBodyOptions();
            var2.IOHHOIIOCRHCHHCRORICCOHOHROOIH(var3.getShowOverChestplate());
            var2.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var3.getShowOverLeggings());
            var2.RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var3.getShowOverBoots());
            break;
         case OPTIONS_NOT_SET:
            return null;
      }

      return var2;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1,
      ApolloBlockLocation var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3,
      float var4,
      int var5
   ) {
      if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIOCHOIICCIORCOROIROHICCHIOHIC(
         var1
      )) {
         OOCCRCRCOHIIORCCORCRCIRRROIOOR var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RHOOIIHCIOORCHHHRCHORROICICIHO();
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = var6.HIHROCOCCHRHHRROHCRCCHOIRCHIHI(
            var1
         );
         if (var7 != null) {
            CRHROHHHCIHHCOHCOORCRIHHIICROR var8 = CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var2.getX(), var2.getY(), var2.getZ());
            CRHROHHHCIHHCOHCOORCRIHHIICROR var9 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var3);
            Vector3f var10 = OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(true, var9, var3);
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH var11 = var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var7, var10, var3, var4, false
            );
            if (var11 != null) {
               var11.IIHHICHCCCOHCHROIRIHICCHHOROCR(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI.ROCHOOHIHIHCIRHCICIOHHCIOHHHRH
                     + Math.max(var5, 1)
               );
               var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIOIIRHIHIHROIHHOROOHCHCOOCRIC, var11, 100, false);
            }
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, @Nullable ApolloBlockLocation var2) {
      LinkedList var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RHOOIIHCIOORCHHHRCHORROICICIHO()
         .HRIROROCRRHCORIHICIHCCHRIRHCHR()
         .get(IIOIIRHIHIHROIHHOROOHCHCOOCRIC);
      if (var3 != null) {
         CRHROHHHCIHHCOHCOORCRIHHIICROR var4 = var2 != null
            ? CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var2.getX(), var2.getY(), var2.getZ())
            : null;
         var3.removeIf(var2x -> {
            if (var2x.ORRRORHRCOHCHRRHRIRORRIRCRHCRH().getId() != var1) {
               return false;
            }

            if (var4 == null) {
               return true;
            }

            Vector3f var3x = OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(true, var4, var2x.CIOIOIORCOOOOOOCRIOCOIRHOCRRIH());
            return var2x.HRIRRHCHRHCIHIRROCIIRHHCIOCOOR().equals(var3x);
         });
      }
   }

   public void RCIOHCHIIOOHHRRHHRHOOORCCIIHIR() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RHOOIIHCIOORCHHHRCHORROICICIHO()
         .HRIROROCRRHCORIHICIHCCHRIRHCHR()
         .remove(IIOIIRHIHIHROIHHOROOHCHCOOCRIC);
   }

   private CRHROHHHCIHHCOHCOORCRIHHIICROR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      CRHROHHHCIHHCOHCOORCRIHHIICROR var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      return var2.getDirection()
            == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.POSITIVE
         ? CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            var1.bridge$xCoord() + var2.getOffsetX(), var1.bridge$yCoord() + var2.getOffsetY(), var1.bridge$zCoord() + var2.getOffsetZ()
         )
         : var1;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, int var2, int var3) {
      if (this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1)) {
         if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RICRIHOOHROHICCHHIIHRHCORHIOHR(
            var2
         )) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH()
               .bridge$getPlayerByUniqueId(var1)
               .orElse(null);
            if (var4 != null) {
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC();
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = var5.RCCRRRIHRRHCIIHRIOHHROHIOOCRIC(
                  var2
               );
               if (var6 != null) {
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var6, var3, null, 0);
                  this.HOHHOCRCRCHRRHHOIIHOCOIOCOIRRO.add(var1);
               }
            }
         }
      }
   }

   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(UUID var1) {
      if (this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1)) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH()
            .bridge$getPlayerByUniqueId(var1)
            .orElse(null);
         if (var2 != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, false, false);
         }

         this.HOHHOCRCRCHRRHHOIIHOCOIOCOIRRO.remove(var1);
      }
   }

   public void ORHIORRHIHICOOIOCIIHOIHRHHRHOC() {
      for (UUID var2 : this.HOHHOCRCRCHRRHHOIIHOCOIOCOIRRO) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH()
            .bridge$getPlayerByUniqueId(var2)
            .orElse(null);
         if (var3 != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, false, false);
         }
      }

      this.HOHHOCRCRCHRRHHOIIHOCOIOCOIRRO.clear();
   }

   @Generated
   public Set<UUID> RIRCHOHRCRCHRIICIRHHIHOIHOOOCI() {
      return this.OHCROCICCCORCIRCIHRRCIORCHOHRH;
   }

   @Generated
   public Set<UUID> HRRHOHICIIHHHCIHHHOIHCCRRCOOHH() {
      return this.HOHHOCRCRCHRRHHOIIHOCOIOCOIRRO;
   }
}
