package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.PlayerLocation;
import com.lunarclient.apollo.module.packetenrichment.PacketEnrichmentModule;
import com.lunarclient.apollo.module.packetenrichment.raytrace.RayTraceResult;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.packetenrichment.v1.PacketInfo;
import com.lunarclient.apollo.packetenrichment.v1.PlayerAttackMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerChatCloseMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerChatOpenMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerInfo;
import com.lunarclient.apollo.packetenrichment.v1.PlayerInventoryCloseMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerInventoryOpenMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerUseItemBucketMessage;
import com.lunarclient.apollo.packetenrichment.v1.PlayerUseItemMessage;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lombok.Generated;

public class IRRCCOICORICIHCHRHIHIHROIRHOCR
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Map<UUID, Double> RRHCHHHRCRHIORIOOOOHRRRIRIHCOH = new HashMap<>();
   private boolean CRRHHROHICICIRORROROCCRHOOCRRC;

   public IRRCCOICORICIHCHRHIHIHROIRHOCR() {
      super("packet_enrichment", "PacketEnrichment");
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
   }

   @Override
   protected void onEnable() {
      this.RRHCHHHRCRHIORIOOOOHRRRIRIHCOH.clear();
      this.CRRHHROHICICIRORROROCCRHOOCRRC = false;
   }

   @Override
   protected void onDisable() {
      this.RRHCHHHRCRHIORIOOOOHRRRIRIHCOH.clear();
      this.CRRHHROHICICIRORROROCCRHOOCRRC = false;
   }

   @Override
   public Collection<Option<?, ?, ?>> IOHHOCRCCCIRHRCORCRCCCOCIOCCRH() {
      return List.of(
         PacketEnrichmentModule.PLAYER_ATTACK_PACKET,
         PacketEnrichmentModule.PLAYER_CHAT_OPEN_PACKET,
         PacketEnrichmentModule.PLAYER_CHAT_CLOSE_PACKET,
         PacketEnrichmentModule.PLAYER_INVENTORY_OPEN_PACKET,
         PacketEnrichmentModule.PLAYER_INVENTORY_CLOSE_PACKET,
         PacketEnrichmentModule.PLAYER_USE_ITEM_PACKET,
         PacketEnrichmentModule.PLAYER_USE_ITEM_BUCKET_PACKET
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC var1
   ) {
      if (var1.IIRROICRRIIIIHICIHIOOHIOOOHIRI() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
         && var1.HCHOOIOHICCRIOIICHCHOIIRRRIHCI() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
         )
       {
         Double var10 = this.RRHCHHHRCRHIORIOOOOHRRRIRIHCOH.remove(var3.bridge$getUniqueID());
         if (var10 != null) {
            PacketInfo var5 = this.CIHRRCOCHCHOHRHOIRROIICRCHOROC();
            PlayerInfo var6 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
            PlayerInfo var7 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3);
            if (var6 != null && var7 != null) {
               PlayerAttackMessage var8 = PlayerAttackMessage.newBuilder()
                  .setPacketInfo(var5)
                  .setTargetInfo(var7)
                  .setAttackerInfo(var6)
                  .setDistance(var10)
                  .build();
               this.sendPacket(var8);
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var2 = var1.RCORHIHICHCOORRRHCHCRICCHICOOO();
      boolean var3 = (
            var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
               || var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         )
         && var2 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
      if (var3 != this.CRRHHROHICICIRORROROCCRHOOCRRC) {
         this.CRRHHROHICICIRORROROCCRHOOCRRC = var3;
         boolean var4 = var3
            ? this.getOptions().<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_INVENTORY_OPEN_PACKET)
            : this.getOptions().<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_INVENTORY_CLOSE_PACKET);
         if (var4) {
            this.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var3);
         }
      }
   }

   public void IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RHRIRROIOROICIOOCCOHOOROHHCOCO() != null) {
         PlayerInfo var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
         if (var2 != null) {
            GeneratedMessageV3 var3;
            if (var1) {
               var3 = PlayerInventoryOpenMessage.newBuilder().setPacketInfo(this.CIHRRCOCHCHOHRHOIRROIICRCHOROC()).setPlayerInfo(var2).build();
            } else {
               var3 = PlayerInventoryCloseMessage.newBuilder().setPacketInfo(this.CIHRRCOCHCHOHRHOIRROIICRCHOROC()).setPlayerInfo(var2).build();
            }

            this.sendPacket(var3);
         }
      }
   }

   public void RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(boolean var1) {
      PlayerInfo var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
      if (var2 != null) {
         GeneratedMessageV3 var3;
         if (var1) {
            var3 = PlayerChatOpenMessage.newBuilder().setPacketInfo(this.CIHRRCOCHCHOHRHOIRROIICRCHOROC()).setPlayerInfo(var2).build();
         } else {
            var3 = PlayerChatCloseMessage.newBuilder().setPacketInfo(this.CIHRRCOCHCHOHRHOIRROIICRCHOROC()).setPlayerInfo(var2).build();
         }

         this.sendPacket(var3);
      }
   }

   public void OIHCOHRCICCCRHRCROOCIOIRRHHHIH(boolean var1) {
      PlayerInfo var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
      if (var2 != null) {
         PlayerUseItemMessage var3 = PlayerUseItemMessage.newBuilder()
            .setPacketInfo(this.CIHRRCOCHCHOHRHOIRROIICRCHOROC())
            .setPlayerInfo(var2)
            .setMainHand(var1)
            .build();
         this.sendPacket(var3);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RayTraceResult var1) {
      PlayerInfo var2 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
      if (var2 != null) {
         PlayerUseItemBucketMessage var3 = PlayerUseItemBucketMessage.newBuilder()
            .setPacketInfo(this.CIHRRCOCHCHOHRHOIRROIICRCHOROC())
            .setPlayerInfo(var2)
            .setRayTraceResult(NetworkTypes.toProtobuf(var1))
            .build();
         this.sendPacket(var3);
      }
   }

   private PlayerInfo IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      PlayerLocation var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      if (var2 == null) {
         return null;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getCurrentServerData();
      if (var3 == null) {
         return null;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var1.bridge$getMovementInput();
      return PlayerInfo.newBuilder()
         .setPlayerUuid(NetworkTypes.toProtobuf(var1.bridge$getUniqueID()))
         .setLocation(var2)
         .setSneaking(var1.bridge$isSneaking())
         .setSprinting(var1.bridge$isSprinting())
         .setJumping(var4.bridge$isJumping())
         .setForwardSpeed(var4.bridge$getForwardSpeed())
         .setStrafeSpeed(var4.bridge$getStrafeSpeed())
         .build();
   }

   private PlayerInfo IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      PlayerLocation var2 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      if (var2 == null) {
         return null;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getCurrentServerData();
      return var3 == null
         ? null
         : PlayerInfo.newBuilder()
            .setPlayerUuid(NetworkTypes.toProtobuf(var1.bridge$getUniqueID()))
            .setLocation(var2)
            .setSneaking(var1.bridge$isSneaking())
            .setSprinting(var1.bridge$isSprinting())
            .build();
   }

   private PlayerLocation HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      return var1 == null
         ? null
         : PlayerLocation.newBuilder()
            .setLocation(
               Location.newBuilder()
                  .setWorld(IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().getWorld())
                  .setX(var1.bridge$getPosX())
                  .setY(var1.bridge$getPosY())
                  .setZ(var1.bridge$getPosZ())
                  .build()
            )
            .setYaw((float)var1.bridge$getRotationYaw())
            .setPitch((float)var1.bridge$getRotationPitch())
            .build();
   }

   public PacketInfo CIHRRCOCHCHOHRHOIRROIICRCHOROC() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(System.currentTimeMillis());
   }

   public PacketInfo RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(long var1) {
      return PacketInfo.newBuilder().setInstantiationTime(NetworkTypes.toProtobuf(var1)).build();
   }

   @Generated
   public Map<UUID, Double> RHIIIIHIICHCCOHRRCHIOIOOHHOOHO() {
      return this.RRHCHHHRCRHIORIOOOOHRRRIRIHCOH;
   }

   @Generated
   public boolean HCHIOICHRIRIRIIOCICIORRHOCHIHH() {
      return this.CRRHHROHICICIRORROROCCRHOOCRRC;
   }
}
