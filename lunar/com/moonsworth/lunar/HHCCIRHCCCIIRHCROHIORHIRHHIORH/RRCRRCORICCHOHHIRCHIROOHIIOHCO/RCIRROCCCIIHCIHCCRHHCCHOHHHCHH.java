package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import lombok.Generated;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   double bridge$getPosX();

   double bridge$getPosY();

   double bridge$getPosZ();

   float bridge$getYaw();

   float bridge$getPitch();

   void bridge$setEyeHeight(float var1);

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final float HCHIIOHRCHCCHOIOHICRROIHIRHIHR;
      private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH OCOIORCRROIOOCHORHHHROCHCCIHRR;

      private static double lerp(double var0, double var2, double var4) {
         return var0 + (var2 - var0) * var4;
      }

      @Override
      public double bridge$getPosX() {
         return lerp(
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.RHRCCCOORROCRICCICHHCCCCIICIHH(),
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.bridge$getPosX(),
            this.HCHIIOHRCHCCHOIOHICRROIHIRHIHR
         );
      }

      @Override
      public double bridge$getPosY() {
         return lerp(
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.IICIIHIHHRCIIRHCRROHIHHOICROIR(),
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.bridge$getPosY(),
            this.HCHIIOHRCHCCHOIOHICRROIHIRHIHR
         );
      }

      @Override
      public double bridge$getPosZ() {
         return lerp(
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.RHOROIIHICOCIICIICRHHOOOROIIOO(),
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.bridge$getPosZ(),
            this.HCHIIOHRCHCCHOIOHICRROIHIRHIHR
         );
      }

      @Override
      public float bridge$getYaw() {
         return (float)lerp(
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.bridge$getPreviousRotationYaw(),
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.bridge$getRotationYaw(),
            this.HCHIIOHRCHCCHOIOHICRROIHIRHIHR
         );
      }

      @Override
      public float bridge$getPitch() {
         return (float)lerp(
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.bridge$getPreviousRotationPitch(),
            this.OCOIORCRROIOOCHORHHHROCHCCIHRR.bridge$getRotationPitch(),
            this.HCHIIOHRCHCCHOIOHICRROIHIRHIHR
         );
      }

      @Override
      public void bridge$setEyeHeight(float var1) {
      }

      public boolean OCRHORIRHHHIIOCOOCHICOOCIHORCC() {
         return this.OCOIORCRROIOOCHORHHHROCHCCIHRR instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1 && var1.IHHRIHOOOHHHROCIHOCCRHIIIIOHRH();
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         float var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var2
      ) {
         this.HCHIIOHRCHCCHOIOHICRROIHIRHIHR = var1;
         this.OCOIORCRROIOOCHORHHHROCHCCIHRR = var2;
      }
   }
}
