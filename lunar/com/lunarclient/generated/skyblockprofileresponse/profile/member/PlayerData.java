package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata.ActiveEffect;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata.Experience;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata.GardenChips;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata.PausedEffect;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata.Perks;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata.TempStatBuff;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PlayerData() {
   @NotNull
   private final BetterJson elm;

   public PlayerData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> achievementSpawnedIslandTypes() {
      return this.elm.get("achievement_spawned_island_types").asListOpt(BetterJson::asString);
   }

   public SafeList<ActiveEffect> activeEffects() {
      return this.elm.get("active_effects").asList(ActiveEffect::new);
   }

   public List<String> craftedGenerators() {
      return this.elm.get("crafted_generators").asListOpt(BetterJson::asString);
   }

   public Optional<Double> deathCount() {
      return this.elm.get("death_count").asDouble();
   }

   public List<String> disabledPotionEffects() {
      return this.elm.get("disabled_potion_effects").asListOpt(BetterJson::asString);
   }

   public Experience experience() {
      return new Experience(this.elm.get("experience"));
   }

   public Optional<Double> fastestTargetPractice() {
      return this.elm.get("fastest_target_practice").asDouble();
   }

   public Optional<Double> fishingTreasureCaught() {
      return this.elm.get("fishing_treasure_caught").asDouble();
   }

   public GardenChips gardenChips() {
      return new GardenChips(this.elm.get("garden_chips"));
   }

   public Optional<Double> lastDeath() {
      return this.elm.get("last_death").asDouble();
   }

   public SafeList<PausedEffect> pausedEffects() {
      return this.elm.get("paused_effects").asList(PausedEffect::new);
   }

   public Perks perks() {
      return new Perks(this.elm.get("perks"));
   }

   public Optional<Double> reaperPeppersEaten() {
      return this.elm.get("reaper_peppers_eaten").asDouble();
   }

   public SafeList<TempStatBuff> tempStatBuffs() {
      return this.elm.get("temp_stat_buffs").asList(TempStatBuff::new);
   }

   public List<String> unlockedCollTiers() {
      return this.elm.get("unlocked_coll_tiers").asListOpt(BetterJson::asString);
   }

   public List<String> visitedModes() {
      return this.elm.get("visited_modes").asListOpt(BetterJson::asString);
   }

   public List<String> visitedZones() {
      return this.elm.get("visited_zones").asListOpt(BetterJson::asString);
   }
}
