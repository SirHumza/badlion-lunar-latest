package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Collection;
import java.util.Optional;

public interface CORCOCICIRIOHROHROIIOOHICCHCRR
   extends CRRRICCRROCOHHOHIICIHORCOORRRH,
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   Optional<CORCOCICIRIOHROHROIIOOHICCHCRR> bridge$getLastAttacker();

   int bridge$getLastAttackerTime();

   @Override
   int bridge$getHurtTime();

   int bridge$getCurrentHurtTime();

   int bridge$getMaxHurtTime();

   boolean bridge$wasJustHurt();

   boolean bridge$isPotionActive(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getActivePotionEffect(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   );

   Collection<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$getActivePotionEffects();

   int bridge$getArmSwingAnimationEnd();

   float bridge$getPreviousRotationYawOffset();

   void bridge$setBodyYRot(float var1);

   float bridge$getRotationYawHead();

   void bridge$setRotationYawHead(float var1);

   float bridge$getPrevRotationYawHead();

   void bridge$setPrevRotationYawHead(float var1);

   float bridge$getPrevRenderYawOffset();

   IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getEquipmentInSlot(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1
   );

   int bridge$getTotalArmorValue();

   @Override
   default com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getHeadItem() {
      return this.bridge$getEquipmentInSlot(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HEAD
      );
   }

   float bridge$getHealth();

   default float bridge$getUnboundedHealth() {
      return this.bridge$getHealth();
   }

   default void bridge$setUnboundedHealth(float var1) {
   }

   float bridge$getMoveForward();

   IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getHeldItem();

   @Deprecated
   String bridge$getDisplayName();

   Component bridge$getDisplayNameComponent();

   Component bridge$getDisplayNameComponentWithHover();

   default boolean bridge$isSwimming() {
      return false;
   }

   default boolean bridge$isElytraFlying() {
      return false;
   }

   long bridge$getLastAttackedMillis();

   long bridge$getLastHurtMillis();

   long bridge$getLastDamagedMillis();

   float bridge$getMaxHealth();

   void bridge$calculateEntityAnimation();

   @Override
   default float bridge$getScale() {
      return 1.0F;
   }

   @Override
   default boolean bridge$hasRedOverlay() {
      return this.bridge$getHurtTime() > 0 || this.bridge$getDeathTime() > 0.0F;
   }

   boolean bridge$canShieldBeAttacked(double var1, double var3, double var5);

   @Override
   default Component bridge$getCustomName() {
      return this.bridge$getDisplayNameComponent();
   }

   boolean bridge$isHostile();
}
