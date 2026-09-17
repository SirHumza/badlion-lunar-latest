package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.Sets;
import com.google.protobuf.Message;
import com.lunarclient.apollo.limb.v1.HideArmorPiecesMessage;
import com.lunarclient.apollo.limb.v1.HideBodyPartMessage;
import com.lunarclient.apollo.limb.v1.ResetArmorPiecesMessage;
import com.lunarclient.apollo.limb.v1.ResetBodyPartMessage;
import com.lunarclient.apollo.module.limb.ArmorPiece;
import com.lunarclient.apollo.module.limb.BodyPart;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.lunarclient.apollo.network.NetworkTypes;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.Generated;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Map<UUID, Set<ArmorPiece>> OHCOROOHHRHOIOCHIOOHIIOHROOCCO = new HashMap<>();
   private final Map<UUID, Set<BodyPart>> RCHRROROIOHCRRRCRCRHORHICHRCHO = new HashMap<>();

   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR() {
      super("limb", "Limb");
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(HideArmorPiecesMessage.class, ResetArmorPiecesMessage.class, HideBodyPartMessage.class, ResetBodyPartMessage.class);
   }

   @Override
   protected void onEnable() {
      this.OHCOROOHHRHOIOCHIOOHIIOHROOCCO.clear();
      this.RCHRROROIOHCRRRCRCRHORHICHRCHO.clear();
   }

   @Override
   protected void onDisable() {
      this.OHCOROOHHRHOIOCHIOOHIIOHROOCCO.clear();
      this.RCHRROROIOHCRRRCRCRHORHICHRCHO.clear();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HideArmorPiecesMessage.class, var1x -> {
         if (var1x.hasPlayerUuid()) {
            UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
            Set var3 = this.IOIICIRIICICIIOORHCIIIIRRIHRHI(var1x.getArmorPiecesList());
            this.OHCOROOHHRHOIOCHIOOHIIOHROOCCO.computeIfAbsent(var2, var0 -> Sets.newHashSet()).addAll(var3);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetArmorPiecesMessage.class, var1x -> {
         if (var1x.hasPlayerUuid()) {
            UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
            Set var3 = this.IOIICIRIICICIIOORHCIIIIRRIHRHI(var1x.getArmorPiecesList());
            this.OHCOROOHHRHOIOCHIOOHIIOHROOCCO.computeIfAbsent(var2, var0 -> Sets.newHashSet()).removeAll(var3);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HideBodyPartMessage.class, var1x -> {
         if (var1x.hasPlayerUuid()) {
            UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
            Set var3 = this.HHRIICOIOORCHCOIICOOIHIRHHICRI(var1x.getBodyPartsList());
            this.RCHRROROIOHCRRRCRCRHORHICHRCHO.computeIfAbsent(var2, var0 -> Sets.newHashSet()).addAll(var3);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetBodyPartMessage.class, var1x -> {
         if (var1x.hasPlayerUuid()) {
            UUID var2 = NetworkTypes.fromProtobuf(var1x.getPlayerUuid());
            Set var3 = this.HHRIICOIOORCHCOIICOOIHIRHHICRI(var1x.getBodyPartsList());
            this.RCHRROROIOHCRRRCRCRHORHICHRCHO.computeIfAbsent(var2, var0 -> Sets.newHashSet()).removeAll(var3);
         }
      });
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (var1.HOIIROHHIIROROHCRROHCORIOHCIHH() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
         && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 0 || var2.bridge$isMainModel())) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .<com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               LimbModule.class
            )
            .ifPresent(var1x -> {
               IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2x = (IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var1x;
               Set var3 = var2x.HHHRCHICIIHIRIOROHHCIOCCCRRORR().get(var1.HIRHCCCROOHORORRRRCHICHROHRRIH().bridge$getUniqueID());
               if (var3 != null && !var3.isEmpty()) {
                  var1.CRIRROHICRHRROCIHOHRCICCRCORHO().addAll(var3);
               }
            });
      }
   }

   private Set<ArmorPiece> IOIICIRIICICIIOORHCIIIIRRIHRHI(List<com.lunarclient.apollo.limb.v1.ArmorPiece> var1) {
      ArmorPiece[] var2 = ArmorPiece.values();
      return var1.stream().map(var1x -> var2[var1x.ordinal() - 1]).collect(Collectors.toSet());
   }

   private Set<BodyPart> HHRIICOIOORCHCOIICOOIHIRHHICRI(List<com.lunarclient.apollo.limb.v1.BodyPart> var1) {
      BodyPart[] var2 = BodyPart.values();
      return var1.stream().map(var1x -> var2[var1x.ordinal() - 1]).collect(Collectors.toSet());
   }

   @Generated
   public Map<UUID, Set<ArmorPiece>> ICOHIOIHHOIOHIOIICHICIRHOORCOI() {
      return this.OHCOROOHHRHOIOCHIOOHIIOHROOCCO;
   }

   @Generated
   public Map<UUID, Set<BodyPart>> HHHRCHICIIHIRIOROHHCIOCCCRRORR() {
      return this.RCHRROROIOHCRRRCRCRHORHICHRCHO;
   }
}
