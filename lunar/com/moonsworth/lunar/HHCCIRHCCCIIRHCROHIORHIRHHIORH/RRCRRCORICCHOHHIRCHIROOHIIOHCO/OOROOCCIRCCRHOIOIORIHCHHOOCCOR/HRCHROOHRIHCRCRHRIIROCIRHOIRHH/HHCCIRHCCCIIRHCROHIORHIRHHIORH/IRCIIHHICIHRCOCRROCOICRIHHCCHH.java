package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH;
import com.moonsworth.lunar.lib.adventure.text.Component;
import javax.annotation.Nullable;
import org.joml.Math;

public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   double bridge$getPosX();

   double bridge$getPosY();

   double bridge$getPosZ();

   double bridge$getMotionX();

   double bridge$getMotionY();

   double bridge$getMotionZ();

   float bridge$ageInTicks();

   float bridge$getWidth();

   float bridge$getHeight();

   float bridge$getEyeHeight();

   double bridge$distanceToCameraSq();

   boolean bridge$isInvisible();

   boolean bridge$isVisiblyCrouching();

   boolean bridge$isDiscrete();

   boolean bridge$isOnFire();

   int bridge$getEntityId();

   default int bridge$getBlockX() {
      return (int)Math.floor(this.bridge$getPosX());
   }

   default int bridge$getBlockY() {
      return (int)Math.floor(this.bridge$getPosY());
   }

   default int bridge$getBlockZ() {
      return (int)Math.floor(this.bridge$getPosZ());
   }

   default OHIIIOHIRIRCCRRIOIICCHHIORRHOH HOCRIORCCCIHIIHHHORIHOOCHOCORH() {
      return OHIIIOHIRIRCCRRIOIICCHHIORRHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   @Nullable
   CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getPassengerOffset(
      @Nullable com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   );

   @Nullable
   Component bridge$getCustomName();

   @Nullable
   default Component bridge$getDisplayNameTag() {
      return this.bridge$getCustomName();
   }

   @Nullable
   CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getNameTagAttachment();

   default int bridge$getOutlineColor() {
      return -1;
   }
}
