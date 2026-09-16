package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Perks() {
   @NotNull
   private final BetterJson elm;

   public Perks(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> agathaFigFortune() {
      return this.elm.get("agatha_fig_fortune").asDouble();
   }

   public Optional<Double> agathaFigPersonalBest() {
      return this.elm.get("agatha_fig_personal_best").asDouble();
   }

   public Optional<Double> agathaMangroveFortune() {
      return this.elm.get("agatha_mangrove_fortune").asDouble();
   }

   public Optional<Double> agathaMangrovePersonalBest() {
      return this.elm.get("agatha_mangrove_personal_best").asDouble();
   }

   public Optional<Double> agathaPower() {
      return this.elm.get("agatha_power").asDouble();
   }

   public Optional<Double> axed() {
      return this.elm.get("axed").asDouble();
   }

   public Optional<Double> bane() {
      return this.elm.get("bane").asDouble();
   }

   public Optional<Double> blessingOfTime() {
      return this.elm.get("blessing_of_time").asDouble();
   }

   public Optional<Double> catacombsBossLuck() {
      return this.elm.get("catacombs_boss_luck").asDouble();
   }

   public Optional<Double> catacombsCritDamage() {
      return this.elm.get("catacombs_crit_damage").asDouble();
   }

   public Optional<Double> catacombsDefense() {
      return this.elm.get("catacombs_defense").asDouble();
   }

   public Optional<Double> catacombsHealth() {
      return this.elm.get("catacombs_health").asDouble();
   }

   public Optional<Double> catacombsIntelligence() {
      return this.elm.get("catacombs_intelligence").asDouble();
   }

   public Optional<Double> catacombsLooting() {
      return this.elm.get("catacombs_looting").asDouble();
   }

   public Optional<Double> catacombsStrength() {
      return this.elm.get("catacombs_strength").asDouble();
   }

   public Optional<Double> chilledToTheBone() {
      return this.elm.get("chilled_to_the_bone").asDouble();
   }

   public Optional<Double> coldEfficiency() {
      return this.elm.get("cold_efficiency").asDouble();
   }

   public Optional<Double> combatWisdomInEnd() {
      return this.elm.get("combat_wisdom_in_end").asDouble();
   }

   public Optional<Double> cooledForges() {
      return this.elm.get("cooled_forges").asDouble();
   }

   public Optional<Double> crimsonTraining() {
      return this.elm.get("crimson_training").asDouble();
   }

   public Optional<Double> cutLoose() {
      return this.elm.get("cut_loose").asDouble();
   }

   public Optional<Double> diamondInTheRough() {
      return this.elm.get("diamond_in_the_rough").asDouble();
   }

   public Optional<Double> dragonReforgesBuff() {
      return this.elm.get("dragon_reforges_buff").asDouble();
   }

   public Optional<Double> drakePiper() {
      return this.elm.get("drake_piper").asDouble();
   }

   public Optional<Double> dungeonbreakerSecrets() {
      return this.elm.get("dungeonbreaker_secrets").asDouble();
   }

   public Optional<Double> dwarvenExpertise() {
      return this.elm.get("dwarven_expertise").asDouble();
   }

   public Optional<Double> dwarvenTraining() {
      return this.elm.get("dwarven_training").asDouble();
   }

   public Optional<Double> eagerMiner() {
      return this.elm.get("eager_miner").asDouble();
   }

   public Optional<Double> edragCd() {
      return this.elm.get("edrag_cd").asDouble();
   }

   public Optional<Double> empoweredAgility() {
      return this.elm.get("empowered_agility").asDouble();
   }

   public Optional<Double> extremePressure() {
      return this.elm.get("extreme_pressure").asDouble();
   }

   public Optional<Double> feroVsDragons() {
      return this.elm.get("fero_vs_dragons").asDouble();
   }

   public Optional<Double> flatDamageVsEnder() {
      return this.elm.get("flat_damage_vs_ender").asDouble();
   }

   public Optional<Double> forbiddenBlessing() {
      return this.elm.get("forbidden_blessing").asDouble();
   }

   public Optional<Double> forestTraining() {
      return this.elm.get("forest_training").asDouble();
   }

   public Optional<Double> freshToolsKuudra() {
      return this.elm.get("fresh_tools_kuudra").asDouble();
   }

   public Optional<Double> frozenSkin() {
      return this.elm.get("frozen_skin").asDouble();
   }

   public Optional<Double> fungusFortuna() {
      return this.elm.get("fungus_fortuna").asDouble();
   }

   public Optional<Double> harenaFortuna() {
      return this.elm.get("harena_fortuna").asDouble();
   }

   public Optional<Double> headstartKuudra() {
      return this.elm.get("headstart_kuudra").asDouble();
   }

   public Optional<Double> heartOfGold() {
      return this.elm.get("heart_of_gold").asDouble();
   }

   public Optional<Double> highRoller() {
      return this.elm.get("high_roller").asDouble();
   }

   public Optional<Double> incZealotsOdds() {
      return this.elm.get("inc_zealots_odds").asDouble();
   }

   public Optional<Double> increasedSupChances() {
      return this.elm.get("increased_sup_chances").asDouble();
   }

   public Optional<Double> lumberjack() {
      return this.elm.get("lumberjack").asDouble();
   }

   public Optional<Double> manaAfterEnderKill() {
      return this.elm.get("mana_after_ender_kill").asDouble();
   }

   public Optional<Double> masterKuudra() {
      return this.elm.get("master_kuudra").asDouble();
   }

   public Optional<Double> midasLure() {
      return this.elm.get("midas_lure").asDouble();
   }

   public Optional<Double> permanentDefense() {
      return this.elm.get("permanent_defense").asDouble();
   }

   public Optional<Double> permanentHealth() {
      return this.elm.get("permanent_health").asDouble();
   }

   public Optional<Double> permanentIntelligence() {
      return this.elm.get("permanent_intelligence").asDouble();
   }

   public Optional<Double> permanentSpeed() {
      return this.elm.get("permanent_speed").asDouble();
   }

   public Optional<Double> permanentStrength() {
      return this.elm.get("permanent_strength").asDouble();
   }

   public Optional<Double> prehistorian() {
      return this.elm.get("prehistorian").asDouble();
   }

   public Optional<Double> radiantFisher() {
      return this.elm.get("radiant_fisher").asDouble();
   }

   public Optional<Double> resourceful() {
      return this.elm.get("resourceful").asDouble();
   }

   public Optional<Double> returnToSender() {
      return this.elm.get("return_to_sender").asDouble();
   }

   public Optional<Double> reviveStone() {
      return this.elm.get("revive_stone").asDouble();
   }

   public Optional<Double> rhinestoneInfusion() {
      return this.elm.get("rhinestone_infusion").asDouble();
   }

   public Optional<Double> seasonOfJoy() {
      return this.elm.get("season_of_joy").asDouble();
   }

   public Optional<Double> sleightOfHand() {
      return this.elm.get("sleight_of_hand").asDouble();
   }

   public Optional<Double> spiderTraining() {
      return this.elm.get("spider_training").asDouble();
   }

   public Optional<Double> strongarmKuudra() {
      return this.elm.get("strongarm_kuudra").asDouble();
   }

   public Optional<Double> tasty() {
      return this.elm.get("tasty").asDouble();
   }

   public Optional<Double> toxophilite() {
      return this.elm.get("toxophilite").asDouble();
   }

   public Optional<Double> trapped() {
      return this.elm.get("trapped").asDouble();
   }

   public Optional<Double> treasuresOfTheEarth() {
      return this.elm.get("treasures_of_the_earth").asDouble();
   }

   public Optional<Double> unbreaking() {
      return this.elm.get("unbreaking").asDouble();
   }

   public Optional<Double> unbridledRage() {
      return this.elm.get("unbridled_rage").asDouble();
   }

   public Optional<Double> underPressure() {
      return this.elm.get("under_pressure").asDouble();
   }

   public Optional<Double> verminControl() {
      return this.elm.get("vermin_control").asDouble();
   }

   public Optional<Double> witherPiper() {
      return this.elm.get("wither_piper").asDouble();
   }
}
