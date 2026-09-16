package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.nametag.v1.OverrideNametagMessage;
import com.lunarclient.apollo.nametag.v1.ResetNametagMessage;
import com.lunarclient.apollo.nametag.v1.ResetNametagsMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final ConcurrentHashMap<UUID, Boolean> OHIHHORORHROIOICRRCCROHHCIOCIO = new ConcurrentHashMap<>();

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR() {
      super("nametag", "Nametag");
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class,
         this::IRCIIHHICIHRCOCRROCOICRIHHCCHH
      );
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(OverrideNametagMessage.class, ResetNametagMessage.class, ResetNametagsMessage.class);
   }

   @Override
   protected void onEnable() {
      this.CORIIICHOHRCCCHIHRRCOORRCCICIH();
   }

   @Override
   protected void onDisable() {
      this.CORIIICHOHRCCCHIHRRCOORRCCICIH();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OverrideNametagMessage.class,
         var1x -> {
            if (var1x.hasPlayerUuid()) {
               UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
               List var3 = var1x.getAdventureJsonLinesList()
                  .stream()
                  .map(
                     com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH::IRRCHIRICCIHCCIHOHRCHRHRHCRCOH
                  )
                  .filter(Objects::nonNull)
                  .toList();
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .IOOOCCROCOCHCICCHIHOCCRHROHOHC()
                  .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                  .put(var2, var3);
               switch (var1x.getVisibilityOverride()) {
                  case NAMETAG_VISIBILITY_OVERRIDE_SHOWN:
                     this.OHIHHORORHROIOICRRCCROHHCIOCIO.put(var2, true);
                     break;
                  case NAMETAG_VISIBILITY_OVERRIDE_HIDDEN:
                     this.OHIHHORORHROIOICRRCCROHHCIOCIO.put(var2, false);
                     break;
                  default:
                     this.OHIHHORORHROIOICRRCCROHHCIOCIO.remove(var2);
               }
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ResetNametagMessage.class,
         var1x -> {
            if (var1x.hasPlayerUuid()) {
               UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .IOOOCCROCOCHCICCHIHOCCRHROHOHC()
                  .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                  .remove(var2);
               this.OHIHHORORHROIOICRRCCROHHCIOCIO.remove(var2);
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetNametagsMessage.class, var1x -> this.CORIIICHOHRCCCHIHRRCOORRCCICIH());
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var1
   ) {
      if (!var1.isCancelled()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RRICIOOIOOOHHIOIHOCIORIOHCRCHH().isEnabled()) {
            if (var1.CCCHCRRRIRRHICOOIOCHCHRCRICHOC() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2
               )
             {
               List var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IOOOCCROCOCHCICCHIHOCCRHROHOHC()
                  .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                  .get(var2.bridge$getUniqueID());
               if (var4 != null) {
                  var1.getLines().clear();
                  var1.getLines().addAll(var4);
               }
            }
         }
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RICRIRRCOHRCOCRRHHCRHRROOIOHHR var1
   ) {
      this.OHIHHORORHROIOICRRCCROHHCIOCIO.clear();
   }

   public boolean IIRHCHHOICHRICOOCRORCCIOOIHOIR(UUID var1) {
      return this.OHIHHORORHROIOICRRCCROHHCIOCIO.getOrDefault(var1, false);
   }

   public boolean OHHRIOHROOIHOROCIRHCHORIHRRRRI(UUID var1) {
      return !this.OHIHHORORHROIOICRRCCROHHCIOCIO.getOrDefault(var1, true);
   }

   private void CORIIICHOHRCCCHIHRRCOORRCCICIH() {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().IOOOCCROCOCHCICCHIHOCCRHROHOHC().clear();
      this.OHIHHORORHROIOICRRCCROHHCIOCIO.clear();
   }
}
