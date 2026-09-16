package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Experience() {
   @NotNull
   private final BetterJson elm;

   public Experience(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> skillAlchemy() {
      return this.elm.get("SKILL_ALCHEMY").asDouble();
   }

   public Optional<Double> skillCarpentry() {
      return this.elm.get("SKILL_CARPENTRY").asDouble();
   }

   public Optional<Double> skillCombat() {
      return this.elm.get("SKILL_COMBAT").asDouble();
   }

   public Optional<Double> skillDungeoneering() {
      return this.elm.get("SKILL_DUNGEONEERING").asDouble();
   }

   public Optional<Double> skillEnchanting() {
      return this.elm.get("SKILL_ENCHANTING").asDouble();
   }

   public Optional<Double> skillFarming() {
      return this.elm.get("SKILL_FARMING").asDouble();
   }

   public Optional<Double> skillFishing() {
      return this.elm.get("SKILL_FISHING").asDouble();
   }

   public Optional<Double> skillForaging() {
      return this.elm.get("SKILL_FORAGING").asDouble();
   }

   public Optional<Double> skillHunting() {
      return this.elm.get("SKILL_HUNTING").asDouble();
   }

   public Optional<Double> skillMining() {
      return this.elm.get("SKILL_MINING").asDouble();
   }

   public Optional<Double> skillRunecrafting() {
      return this.elm.get("SKILL_RUNECRAFTING").asDouble();
   }

   public Optional<Double> skillSocial() {
      return this.elm.get("SKILL_SOCIAL").asDouble();
   }

   public Optional<Double> skillTaming() {
      return this.elm.get("SKILL_TAMING").asDouble();
   }
}
