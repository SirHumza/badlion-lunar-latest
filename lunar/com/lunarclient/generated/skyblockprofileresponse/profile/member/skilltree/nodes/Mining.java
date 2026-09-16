package com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree.nodes;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Mining() {
   @NotNull
   private final BetterJson elm;

   public Mining(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> anomalousDesire() {
      return this.elm.get("anomalous_desire").asDouble();
   }

   public Optional<Double> blockhead() {
      return this.elm.get("blockhead").asDouble();
   }

   public Optional<Double> coreOfTheMountain() {
      return this.elm.get("core_of_the_mountain").asDouble();
   }

   public Optional<Double> crystalline() {
      return this.elm.get("crystalline").asDouble();
   }

   public Optional<Double> crystallized() {
      return this.elm.get("crystallized").asDouble();
   }

   public Optional<Double> dailyGrind() {
      return this.elm.get("daily_grind").asDouble();
   }

   public Optional<Double> dailyPowder() {
      return this.elm.get("daily_powder").asDouble();
   }

   public Optional<Double> deadMansChest() {
      return this.elm.get("dead_mans_chest").asDouble();
   }

   public Optional<Double> dustCollector() {
      return this.elm.get("dust_collector").asDouble();
   }

   public Optional<Double> eagerAdventurer() {
      return this.elm.get("eager_adventurer").asDouble();
   }

   public Optional<Double> efficientMiner() {
      return this.elm.get("efficient_miner").asDouble();
   }

   public Optional<Double> excavator() {
      return this.elm.get("excavator").asDouble();
   }

   public Optional<Double> fortunateMineman() {
      return this.elm.get("fortunate_mineman").asDouble();
   }

   public Optional<Double> frontLoaded() {
      return this.elm.get("front_loaded").asDouble();
   }

   public Optional<Double> frozenSolid() {
      return this.elm.get("frozen_solid").asDouble();
   }

   public Optional<Double> gemLover() {
      return this.elm.get("gem_lover").asDouble();
   }

   public Optional<Double> gemstoneInfusion() {
      return this.elm.get("gemstone_infusion").asDouble();
   }

   public Optional<Double> giftsFromTheDeparted() {
      return this.elm.get("gifts_from_the_departed").asDouble();
   }

   public Optional<Double> goblinKiller() {
      return this.elm.get("goblin_killer").asDouble();
   }

   public Optional<Double> greatExplorer() {
      return this.elm.get("great_explorer").asDouble();
   }

   public Optional<Double> hazardousMiner() {
      return this.elm.get("hazardous_miner").asDouble();
   }

   public Optional<Double> keenEye() {
      return this.elm.get("keen_eye").asDouble();
   }

   public Optional<Double> keepItCool() {
      return this.elm.get("keep_it_cool").asDouble();
   }

   public Optional<Double> lonesomeMiner() {
      return this.elm.get("lonesome_miner").asDouble();
   }

   public Optional<Double> luckOfTheCave() {
      return this.elm.get("luck_of_the_cave").asDouble();
   }

   public Optional<Double> maniacMiner() {
      return this.elm.get("maniac_miner").asDouble();
   }

   public Optional<Double> metalHead() {
      return this.elm.get("metal_head").asDouble();
   }

   public Optional<Double> minersBlessing() {
      return this.elm.get("miners_blessing").asDouble();
   }

   public Optional<Double> mineshaftMayhem() {
      return this.elm.get("mineshaft_mayhem").asDouble();
   }

   public Optional<Double> miningFortune() {
      return this.elm.get("mining_fortune").asDouble();
   }

   public Optional<Double> miningMadness() {
      return this.elm.get("mining_madness").asDouble();
   }

   public Optional<Double> miningMaster() {
      return this.elm.get("mining_master").asDouble();
   }

   public Optional<Double> miningSpeed() {
      return this.elm.get("mining_speed").asDouble();
   }

   public Optional<Double> miningSpeedBoost() {
      return this.elm.get("mining_speed_boost").asDouble();
   }

   public Optional<Double> mole() {
      return this.elm.get("mole").asDouble();
   }

   public Optional<Double> noStoneUnturned() {
      return this.elm.get("no_stone_unturned").asDouble();
   }

   public Optional<Double> oldSchool() {
      return this.elm.get("old_school").asDouble();
   }

   public Optional<Double> orbiter() {
      return this.elm.get("orbiter").asDouble();
   }

   public Optional<Double> pickobulus() {
      return this.elm.get("pickobulus").asDouble();
   }

   public Optional<Double> powderBuff() {
      return this.elm.get("powder_buff").asDouble();
   }

   public Optional<Double> precisionMining() {
      return this.elm.get("precision_mining").asDouble();
   }

   public Optional<Double> professional() {
      return this.elm.get("professional").asDouble();
   }

   public Optional<Double> quickForge() {
      return this.elm.get("quick_forge").asDouble();
   }

   public Optional<Double> ragsToRiches() {
      return this.elm.get("rags_to_riches").asDouble();
   }

   public Optional<Double> seasonedMineman() {
      return this.elm.get("seasoned_mineman").asDouble();
   }

   public Optional<Double> sheerForce() {
      return this.elm.get("sheer_force").asDouble();
   }

   public Optional<Double> skyMall() {
      return this.elm.get("sky_mall").asDouble();
   }

   public Optional<Double> speedyMineman() {
      return this.elm.get("speedy_mineman").asDouble();
   }

   public Optional<Double> starPowder() {
      return this.elm.get("star_powder").asDouble();
   }

   public Optional<Double> steadyHand() {
      return this.elm.get("steady_hand").asDouble();
   }

   public Optional<Double> strongArm() {
      return this.elm.get("strong_arm").asDouble();
   }

   public Optional<Double> subterraneanFisher() {
      return this.elm.get("subterranean_fisher").asDouble();
   }

   public Optional<Double> subzeroMining() {
      return this.elm.get("subzero_mining").asDouble();
   }

   public Optional<Double> surveyor() {
      return this.elm.get("surveyor").asDouble();
   }

   public Optional<Double> titaniumInsanium() {
      return this.elm.get("titanium_insanium").asDouble();
   }

   public Optional<Boolean> toggleAnomalousDesire() {
      return this.elm.get("toggle_anomalous_desire").asBool();
   }

   public Optional<Boolean> toggleBlockhead() {
      return this.elm.get("toggle_blockhead").asBool();
   }

   public Optional<Boolean> toggleCoreOfTheMountain() {
      return this.elm.get("toggle_core_of_the_mountain").asBool();
   }

   public Optional<Boolean> toggleCrystalline() {
      return this.elm.get("toggle_crystalline").asBool();
   }

   public Optional<Boolean> toggleCrystallized() {
      return this.elm.get("toggle_crystallized").asBool();
   }

   public Optional<Boolean> toggleDailyGrind() {
      return this.elm.get("toggle_daily_grind").asBool();
   }

   public Optional<Boolean> toggleDailyPowder() {
      return this.elm.get("toggle_daily_powder").asBool();
   }

   public Optional<Boolean> toggleDeadMansChest() {
      return this.elm.get("toggle_dead_mans_chest").asBool();
   }

   public Optional<Boolean> toggleDustCollector() {
      return this.elm.get("toggle_dust_collector").asBool();
   }

   public Optional<Boolean> toggleEagerAdventurer() {
      return this.elm.get("toggle_eager_adventurer").asBool();
   }

   public Optional<Boolean> toggleEfficientMiner() {
      return this.elm.get("toggle_efficient_miner").asBool();
   }

   public Optional<Boolean> toggleExcavator() {
      return this.elm.get("toggle_excavator").asBool();
   }

   public Optional<Boolean> toggleFortunateMineman() {
      return this.elm.get("toggle_fortunate_mineman").asBool();
   }

   public Optional<Boolean> toggleFrontLoaded() {
      return this.elm.get("toggle_front_loaded").asBool();
   }

   public Optional<Boolean> toggleFrozenSolid() {
      return this.elm.get("toggle_frozen_solid").asBool();
   }

   public Optional<Boolean> toggleGemLover() {
      return this.elm.get("toggle_gem_lover").asBool();
   }

   public Optional<Boolean> toggleGemstoneInfusion() {
      return this.elm.get("toggle_gemstone_infusion").asBool();
   }

   public Optional<Boolean> toggleGiftsFromTheDeparted() {
      return this.elm.get("toggle_gifts_from_the_departed").asBool();
   }

   public Optional<Boolean> toggleGoblinKiller() {
      return this.elm.get("toggle_goblin_killer").asBool();
   }

   public Optional<Boolean> toggleGreatExplorer() {
      return this.elm.get("toggle_great_explorer").asBool();
   }

   public Optional<Boolean> toggleHazardousMiner() {
      return this.elm.get("toggle_hazardous_miner").asBool();
   }

   public Optional<Boolean> toggleKeenEye() {
      return this.elm.get("toggle_keen_eye").asBool();
   }

   public Optional<Boolean> toggleKeepItCool() {
      return this.elm.get("toggle_keep_it_cool").asBool();
   }

   public Optional<Boolean> toggleLonesomeMiner() {
      return this.elm.get("toggle_lonesome_miner").asBool();
   }

   public Optional<Boolean> toggleLuckOfTheCave() {
      return this.elm.get("toggle_luck_of_the_cave").asBool();
   }

   public Optional<Boolean> toggleManiacMiner() {
      return this.elm.get("toggle_maniac_miner").asBool();
   }

   public Optional<Boolean> toggleMetalHead() {
      return this.elm.get("toggle_metal_head").asBool();
   }

   public Optional<Boolean> toggleMinersBlessing() {
      return this.elm.get("toggle_miners_blessing").asBool();
   }

   public Optional<Boolean> toggleMineshaftMayhem() {
      return this.elm.get("toggle_mineshaft_mayhem").asBool();
   }

   public Optional<Boolean> toggleMiningFortune() {
      return this.elm.get("toggle_mining_fortune").asBool();
   }

   public Optional<Boolean> toggleMiningMadness() {
      return this.elm.get("toggle_mining_madness").asBool();
   }

   public Optional<Boolean> toggleMiningMaster() {
      return this.elm.get("toggle_mining_master").asBool();
   }

   public Optional<Boolean> toggleMiningSpeed() {
      return this.elm.get("toggle_mining_speed").asBool();
   }

   public Optional<Boolean> toggleMiningSpeedBoost() {
      return this.elm.get("toggle_mining_speed_boost").asBool();
   }

   public Optional<Boolean> toggleMole() {
      return this.elm.get("toggle_mole").asBool();
   }

   public Optional<Boolean> toggleNoStoneUnturned() {
      return this.elm.get("toggle_no_stone_unturned").asBool();
   }

   public Optional<Boolean> toggleOldSchool() {
      return this.elm.get("toggle_old_school").asBool();
   }

   public Optional<Boolean> toggleOrbiter() {
      return this.elm.get("toggle_orbiter").asBool();
   }

   public Optional<Boolean> togglePickaxeToss() {
      return this.elm.get("toggle_pickaxe_toss").asBool();
   }

   public Optional<Boolean> togglePickobulus() {
      return this.elm.get("toggle_pickobulus").asBool();
   }

   public Optional<Boolean> togglePowderBuff() {
      return this.elm.get("toggle_powder_buff").asBool();
   }

   public Optional<Boolean> togglePrecisionMining() {
      return this.elm.get("toggle_precision_mining").asBool();
   }

   public Optional<Boolean> toggleProfessional() {
      return this.elm.get("toggle_professional").asBool();
   }

   public Optional<Boolean> toggleQuickForge() {
      return this.elm.get("toggle_quick_forge").asBool();
   }

   public Optional<Boolean> toggleRagsToRiches() {
      return this.elm.get("toggle_rags_to_riches").asBool();
   }

   public Optional<Boolean> toggleSeasonedMineman() {
      return this.elm.get("toggle_seasoned_mineman").asBool();
   }

   public Optional<Boolean> toggleSheerForce() {
      return this.elm.get("toggle_sheer_force").asBool();
   }

   public Optional<Boolean> toggleSkyMall() {
      return this.elm.get("toggle_sky_mall").asBool();
   }

   public Optional<Boolean> toggleSpeedyMineman() {
      return this.elm.get("toggle_speedy_mineman").asBool();
   }

   public Optional<Boolean> toggleStarPowder() {
      return this.elm.get("toggle_star_powder").asBool();
   }

   public Optional<Boolean> toggleSteadyHand() {
      return this.elm.get("toggle_steady_hand").asBool();
   }

   public Optional<Boolean> toggleStrongArm() {
      return this.elm.get("toggle_strong_arm").asBool();
   }

   public Optional<Boolean> toggleSubterraneanFisher() {
      return this.elm.get("toggle_subterranean_fisher").asBool();
   }

   public Optional<Boolean> toggleSubzeroMining() {
      return this.elm.get("toggle_subzero_mining").asBool();
   }

   public Optional<Boolean> toggleSurveyor() {
      return this.elm.get("toggle_surveyor").asBool();
   }

   public Optional<Boolean> toggleTitaniumInsanium() {
      return this.elm.get("toggle_titanium_insanium").asBool();
   }

   public Optional<Boolean> toggleVanguardSeeker() {
      return this.elm.get("toggle_vanguard_seeker").asBool();
   }

   public Optional<Boolean> toggleVeinSeeker() {
      return this.elm.get("toggle_vein_seeker").asBool();
   }

   public Optional<Boolean> toggleWarmHeart() {
      return this.elm.get("toggle_warm_heart").asBool();
   }

   public Optional<Double> vanguardSeeker() {
      return this.elm.get("vanguard_seeker").asDouble();
   }

   public Optional<Double> veinSeeker() {
      return this.elm.get("vein_seeker").asDouble();
   }

   public Optional<Double> warmHeart() {
      return this.elm.get("warm_heart").asDouble();
   }
}
