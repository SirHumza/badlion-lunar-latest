package com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Nodes() {
   @NotNull
   private final BetterJson elm;

   public Nodes(@NotNull BetterJson var1) {
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

   public Optional<Double> crystalline() {
      return this.elm.get("crystalline").asDouble();
   }

   public Optional<Double> dailyEffect() {
      return this.elm.get("daily_effect").asDouble();
   }

   public Optional<Double> dailyGrind() {
      return this.elm.get("daily_grind").asDouble();
   }

   public Optional<Double> dailyPowder() {
      return this.elm.get("daily_powder").asDouble();
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

   public Optional<Double> experienceOrbs() {
      return this.elm.get("experience_orbs").asDouble();
   }

   public Optional<Double> forgeTime() {
      return this.elm.get("forge_time").asDouble();
   }

   public Optional<Double> fortunate() {
      return this.elm.get("fortunate").asDouble();
   }

   public Optional<Double> frontLoaded() {
      return this.elm.get("front_loaded").asDouble();
   }

   public Optional<Double> frozenSolid() {
      return this.elm.get("frozen_solid").asDouble();
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

   public Optional<Double> hungryForMore() {
      return this.elm.get("hungry_for_more").asDouble();
   }

   public Optional<Double> keepItCool() {
      return this.elm.get("keep_it_cool").asDouble();
   }

   public Optional<Double> lonesomeMiner() {
      return this.elm.get("lonesome_miner").asDouble();
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

   public Optional<Double> miningExperience() {
      return this.elm.get("mining_experience").asDouble();
   }

   public Optional<Double> miningFortune() {
      return this.elm.get("mining_fortune").asDouble();
   }

   public Optional<Double> miningFortune2() {
      return this.elm.get("mining_fortune_2").asDouble();
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

   public Optional<Double> miningSpeed2() {
      return this.elm.get("mining_speed_2").asDouble();
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

   public Optional<Double> pickaxeToss() {
      return this.elm.get("pickaxe_toss").asDouble();
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

   public Optional<Double> ragsToRiches() {
      return this.elm.get("rags_to_riches").asDouble();
   }

   public Optional<Double> sheerForce() {
      return this.elm.get("sheer_force").asDouble();
   }

   public Optional<Double> special0() {
      return this.elm.get("special_0").asDouble();
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

   public Optional<Boolean> toggleDailyEffect() {
      return this.elm.get("toggle_daily_effect").asBool();
   }

   public Optional<Boolean> toggleEfficientMiner() {
      return this.elm.get("toggle_efficient_miner").asBool();
   }

   public Optional<Boolean> toggleFortunate() {
      return this.elm.get("toggle_fortunate").asBool();
   }

   public Optional<Boolean> toggleKeepItCool() {
      return this.elm.get("toggle_keep_it_cool").asBool();
   }

   public Optional<Boolean> toggleLonesomeMiner() {
      return this.elm.get("toggle_lonesome_miner").asBool();
   }

   public Optional<Boolean> toggleMinersBlessing() {
      return this.elm.get("toggle_miners_blessing").asBool();
   }

   public Optional<Boolean> toggleMiningFortune() {
      return this.elm.get("toggle_mining_fortune").asBool();
   }

   public Optional<Boolean> toggleMiningMadness() {
      return this.elm.get("toggle_mining_madness").asBool();
   }

   public Optional<Boolean> toggleMole() {
      return this.elm.get("toggle_mole").asBool();
   }

   public Optional<Boolean> toggleProfessional() {
      return this.elm.get("toggle_professional").asBool();
   }

   public Optional<Boolean> toggleSubterraneanFisher() {
      return this.elm.get("toggle_subterranean_fisher").asBool();
   }

   public Optional<Boolean> toggleSurveyor() {
      return this.elm.get("toggle_surveyor").asBool();
   }

   public Optional<Double> vanguardSeeker() {
      return this.elm.get("vanguard_seeker").asDouble();
   }

   public Optional<Double> warmHearted() {
      return this.elm.get("warm_hearted").asDouble();
   }
}
