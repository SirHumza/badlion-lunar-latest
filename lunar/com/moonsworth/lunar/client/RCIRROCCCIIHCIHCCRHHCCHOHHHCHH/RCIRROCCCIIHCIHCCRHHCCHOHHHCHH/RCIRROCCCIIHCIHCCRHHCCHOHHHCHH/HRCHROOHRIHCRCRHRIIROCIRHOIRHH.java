package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.common.icon.AdvancedResourceLocationIcon;
import com.lunarclient.apollo.common.icon.Icon;
import com.lunarclient.apollo.common.icon.ItemStackIcon;
import com.lunarclient.apollo.common.icon.SimpleResourceLocationIcon;
import com.lunarclient.apollo.cooldown.v1.CooldownStyle;
import com.lunarclient.apollo.cooldown.v1.DisplayCooldownMessage;
import com.lunarclient.apollo.cooldown.v1.RemoveCooldownMessage;
import com.lunarclient.apollo.cooldown.v1.ResetCooldownsMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.Set;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
      super("cooldown", "Cooldown");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(DisplayCooldownMessage.class, RemoveCooldownMessage.class, ResetCooldownsMessage.class);
   }

   @Override
   protected void onEnable() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHCHHRRROOOIIHHRHCCOHIIOOOCCHI();
   }

   @Override
   protected void onDisable() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHCHHRRROOOIIHHRHCCOHIIOOOCCHI();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DisplayCooldownMessage.class, var1x -> {
         if (var1x.hasIcon()) {
            String var2 = var1x.getName();
            long var3 = NetworkTypes.fromProtobuf(var1x.getDuration()).toMillis();
            Icon var5 = NetworkTypes.fromProtobuf(var1x.getIcon());
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var5, var1x.hasStyle() ? var1x.getStyle() : null);
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RemoveCooldownMessage.class,
         var0 -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCICIIIHORIIRRCIRRIHORHOHIHCH(
            var0.getName()
         )
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ResetCooldownsMessage.class,
         var0 -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHCHHRRROOOIIHHRHCCOHIIOOOCCHI()
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, long var2, Icon var4, CooldownStyle var5) {
      if (var4 instanceof ItemStackIcon var11) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var12 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var11
         );
         if (var12 != null) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var1, var2, var12, var5
               )
            );
         }
      } else {
         String var7 = null;
         if (var4 instanceof AdvancedResourceLocationIcon var8) {
            var7 = var8.getResourceLocation();
         } else if (var4 instanceof SimpleResourceLocationIcon var9) {
            var7 = var9.getResourceLocation();
         }

         if (var7 == null) {
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               null, var7
            );
         } else {
            RCIROOOOICRHCCRRCIORHHIRCOIIIC var6;
            try {
               var6 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var7);
            } catch (Exception var10) {
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var10, var7
               );
               return;
            }

            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1, var2, var6, var4, var5
               )
            );
         }
      }
   }
}
