package com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.crystals.CrystalData;
import org.jetbrains.annotations.NotNull;

public record Crystals() {
   @NotNull
   private final BetterJson elm;

   public Crystals(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public CrystalData amberCrystal() {
      return new CrystalData(this.elm.get("amber_crystal"));
   }

   public CrystalData amethystCrystal() {
      return new CrystalData(this.elm.get("amethyst_crystal"));
   }

   public CrystalData aquamarineCrystal() {
      return new CrystalData(this.elm.get("aquamarine_crystal"));
   }

   public CrystalData citrineCrystal() {
      return new CrystalData(this.elm.get("citrine_crystal"));
   }

   public CrystalData jadeCrystal() {
      return new CrystalData(this.elm.get("jade_crystal"));
   }

   public CrystalData jasperCrystal() {
      return new CrystalData(this.elm.get("jasper_crystal"));
   }

   public CrystalData onyxCrystal() {
      return new CrystalData(this.elm.get("onyx_crystal"));
   }

   public CrystalData opalCrystal() {
      return new CrystalData(this.elm.get("opal_crystal"));
   }

   public CrystalData peridotCrystal() {
      return new CrystalData(this.elm.get("peridot_crystal"));
   }

   public CrystalData rubyCrystal() {
      return new CrystalData(this.elm.get("ruby_crystal"));
   }

   public CrystalData sapphireCrystal() {
      return new CrystalData(this.elm.get("sapphire_crystal"));
   }

   public CrystalData topazCrystal() {
      return new CrystalData(this.elm.get("topaz_crystal"));
   }
}
