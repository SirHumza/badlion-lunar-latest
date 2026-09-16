package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import javax.vecmath.Matrix4f;
import lombok.Generated;
import lombok.NonNull;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @NonNull
   private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH HHHOHCIICOIIIHOIHIHHCIIICOCCHI;
   @NonNull
   private final Matrix4f HCHHHOIHIIHCOIHORRIRICCCCHHIRH;
   @NonNull
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH OHRHRRCOOCHHHCRROOCOOCRIOHCRCO;
   private final float RIRROCIRCRRHROHHIOCIROOCRIROII;

   @NonNull
   @Generated
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH HIRHCCCROOHORORRRRCHICHROHRRIH() {
      return this.HHHOHCIICOIIIHOIHIHHCIIICOCCHI;
   }

   @NonNull
   @Generated
   public Matrix4f HROCHOOIHOCIIIOOCRCRICHORIRHHC() {
      return this.HCHHHOIHIIHCOIHORRIRICCCCHHIRH;
   }

   @NonNull
   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH OHHHCIIHROIIIRCCHOCROHORIICOCC() {
      return this.OHRHRRCOOCHHHCRROOCOOCRIOHCRCO;
   }

   @Generated
   public float HOHIHCIHIHRCOOIOCOHIOHROHHIOHR() {
      return this.RIRROCIRCRRHROHHIOCIROOCRIROII;
   }

   @Generated
   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      @NonNull HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, @NonNull Matrix4f var2, @NonNull HHCCIRHCCCIIRHCROHIORHIRHHIORH var3, float var4
   ) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("modelMatrix is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("model is marked non-null but is null");
      }

      this.HHHOHCIICOIIIHOIHIHHCIIICOCCHI = var1;
      this.HCHHHOIHIIHCOIHORRIRICCCCHHIRH = var2;
      this.OHRHRRCOOCHHHCRROOCOOCRIOHCRCO = var3;
      this.RIRROCIRCRRHROHHIOCIROOCRIROII = var4;
   }
}
