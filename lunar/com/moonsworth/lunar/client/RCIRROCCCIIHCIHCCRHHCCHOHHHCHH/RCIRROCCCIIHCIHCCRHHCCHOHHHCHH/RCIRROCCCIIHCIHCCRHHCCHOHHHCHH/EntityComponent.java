package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.common.v1.EntityId;
import com.lunarclient.apollo.entity.v1.FlipEntityMessage;
import com.lunarclient.apollo.entity.v1.OverrideRainbowSheepMessage;
import com.lunarclient.apollo.entity.v1.ResetFlipedEntityMessage;
import com.lunarclient.apollo.entity.v1.ResetRainbowSheepMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.Generated;

public class CORCOCICIRIOHROHROIIOOHICCHCRR
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private Set<Object> HCCOIRHHOOHICHHIOOOIRORRCRIRRO = new HashSet<>();
   private Set<Object> HOIRROCROIIHIROHORIOOROCCHOCHI = new HashSet<>();

   public CORCOCICIRIOHROHROIIOOHICCHCRR() {
      super("entity", "Entity");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(OverrideRainbowSheepMessage.class, ResetRainbowSheepMessage.class, FlipEntityMessage.class, ResetFlipedEntityMessage.class);
   }

   @Override
   protected void onEnable() {
      this.HCCOIRHHOOHICHHIOOOIRORRCRIRRO.clear();
      this.HOIRROCROIIHIROHORIOOROCCHOCHI.clear();
   }

   @Override
   protected void onDisable() {
      this.HCCOIRHHOOHICHHIOOOIRORRCRIRRO.clear();
      this.HOIRROCROIIHIROHORIOOROCCHOCHI.clear();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OverrideRainbowSheepMessage.class, var1x -> this.HCCOIRHHOOHICHHIOOOIRORRCRIRRO.addAll(this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1x.getEntityIdsList()))
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ResetRainbowSheepMessage.class, var1x -> this.HCCOIRHHOOHICHHIOOOIRORRCRIRRO.removeAll(this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1x.getEntityIdsList()))
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         FlipEntityMessage.class, var1x -> this.HOIRROCROIIHIROHORIOOROCCHOCHI.addAll(this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1x.getEntityIdsList()))
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ResetFlipedEntityMessage.class, var1x -> this.HOIRROCROIIHIROHORIOOROCCHOCHI.removeAll(this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1x.getEntityIdsList()))
      );
   }

   public boolean CCIOORRIHHRCIORHOROIHRRORIORHH() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 25;
   }

   public boolean CORCOCICIRIOHROHROIIOOHICCHCRR(UUID var1) {
      return this.HCCOIRHHOOHICHHIOOOIRORRCRIRRO.contains(var1);
   }

   public boolean OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(int var1) {
      return this.HCCOIRHHOOHICHHIOOOIRORRCRIRRO.contains(var1);
   }

   public boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(UUID var1) {
      return this.HOIRROCROIIHIROHORIOOROCCHOCHI.contains(var1);
   }

   public boolean RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(int var1) {
      return this.HOIRROCROIIHIROHORIOOROCCHOCHI.contains(var1);
   }

   private Set<Object> IHIRRIIORRHORHRORIHOROIRCORCOO(List<EntityId> var1) {
      boolean var2 = this.CCIOORRIHHRCIORHOROIHRRORIORHH();
      return var1.stream().map(NetworkTypes::fromProtobuf).map(var1x -> var2 ? var1x.getEntityUuid() : var1x.getEntityId()).collect(Collectors.toSet());
   }

   @Generated
   public Set<Object> ICICOHORIOOHIRIHIHCHIHCHROOCOO() {
      return this.HCCOIRHHOOHICHHIOOOIRORRCRIRRO;
   }

   @Generated
   public Set<Object> RIICOOCCRRRICCHOHORHHCHIOOOCHI() {
      return this.HOIRROCROIIHIROHORIOOROCCHOCHI;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Set<Object> var1) {
      this.HCCOIRHHOOHICHHIOOOIRORRCRIRRO = var1;
   }

   @Generated
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Set<Object> var1) {
      this.HOIRROCROIIHIROHORIOOROCCHOCHI = var1;
   }
}
