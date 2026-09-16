package com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree.nodes;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Foraging() {
   @NotNull
   private final BetterJson elm;

   public Foraging(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> _250Gifts() {
      return this.elm.get("250_gifts").asDouble();
   }

   public Optional<Double> axeToss() {
      return this.elm.get("axe_toss").asDouble();
   }

   public Optional<Double> centerOfTheForest() {
      return this.elm.get("center_of_the_forest").asDouble();
   }

   public Optional<Double> collector() {
      return this.elm.get("collector").asDouble();
   }

   public Optional<Double> dailyWishes() {
      return this.elm.get("daily_wishes").asDouble();
   }

   public Optional<Double> damageBoost() {
      return this.elm.get("damage_boost").asDouble();
   }

   public Optional<Double> deepWaters() {
      return this.elm.get("deep_waters").asDouble();
   }

   public Optional<Double> earlyBird() {
      return this.elm.get("early_bird").asDouble();
   }

   public Optional<Double> efficientForager() {
      return this.elm.get("efficient_forager").asDouble();
   }

   public Optional<Double> essenceFortune() {
      return this.elm.get("essence_fortune").asDouble();
   }

   public Optional<Double> foragingFortune() {
      return this.elm.get("foraging_fortune").asDouble();
   }

   public Optional<Double> foragingMadness() {
      return this.elm.get("foraging_madness").asDouble();
   }

   public Optional<Double> forestSpeed() {
      return this.elm.get("forest_speed").asDouble();
   }

   public Optional<Double> forestStrength() {
      return this.elm.get("forest_strength").asDouble();
   }

   public Optional<Double> galateasMight() {
      return this.elm.get("galateas_might").asDouble();
   }

   public Optional<Double> halfEmpty() {
      return this.elm.get("half_empty").asDouble();
   }

   public Optional<Double> halfFull() {
      return this.elm.get("half_full").asDouble();
   }

   public Optional<Double> homingAxe() {
      return this.elm.get("homing_axe").asDouble();
   }

   public Optional<Double> huntersLuck() {
      return this.elm.get("hunters_luck").asDouble();
   }

   public Optional<Double> lottery() {
      return this.elm.get("lottery").asDouble();
   }

   public Optional<Double> luckOfTheForest() {
      return this.elm.get("luck_of_the_forest").asDouble();
   }

   public Optional<Double> maniacSlicer() {
      return this.elm.get("maniac_slicer").asDouble();
   }

   public Optional<Double> monsterHunter() {
      return this.elm.get("monster_hunter").asDouble();
   }

   public Optional<Double> precisionCutting() {
      return this.elm.get("precision_cutting").asDouble();
   }

   public Optional<Double> ricochet() {
      return this.elm.get("ricochet").asDouble();
   }

   public Optional<Double> speedBoost() {
      return this.elm.get("speed_boost").asDouble();
   }

   public Optional<Double> strengthBoost() {
      return this.elm.get("strength_boost").asDouble();
   }

   public Optional<Double> sweep() {
      return this.elm.get("sweep").asDouble();
   }

   public Optional<Boolean> toggle250Gifts() {
      return this.elm.get("toggle_250_gifts").asBool();
   }

   public Optional<Boolean> toggleAxeToss() {
      return this.elm.get("toggle_axe_toss").asBool();
   }

   public Optional<Boolean> toggleCenterOfTheForest() {
      return this.elm.get("toggle_center_of_the_forest").asBool();
   }

   public Optional<Boolean> toggleCollector() {
      return this.elm.get("toggle_collector").asBool();
   }

   public Optional<Boolean> toggleDailyWishes() {
      return this.elm.get("toggle_daily_wishes").asBool();
   }

   public Optional<Boolean> toggleDamageBoost() {
      return this.elm.get("toggle_damage_boost").asBool();
   }

   public Optional<Boolean> toggleDeepWaters() {
      return this.elm.get("toggle_deep_waters").asBool();
   }

   public Optional<Boolean> toggleEarlyBird() {
      return this.elm.get("toggle_early_bird").asBool();
   }

   public Optional<Boolean> toggleEfficientForager() {
      return this.elm.get("toggle_efficient_forager").asBool();
   }

   public Optional<Boolean> toggleEssenceFortune() {
      return this.elm.get("toggle_essence_fortune").asBool();
   }

   public Optional<Boolean> toggleForagingFortune() {
      return this.elm.get("toggle_foraging_fortune").asBool();
   }

   public Optional<Boolean> toggleForagingMadness() {
      return this.elm.get("toggle_foraging_madness").asBool();
   }

   public Optional<Boolean> toggleForestSpeed() {
      return this.elm.get("toggle_forest_speed").asBool();
   }

   public Optional<Boolean> toggleForestStrength() {
      return this.elm.get("toggle_forest_strength").asBool();
   }

   public Optional<Boolean> toggleGalateasMight() {
      return this.elm.get("toggle_galateas_might").asBool();
   }

   public Optional<Boolean> toggleHalfEmpty() {
      return this.elm.get("toggle_half_empty").asBool();
   }

   public Optional<Boolean> toggleHalfFull() {
      return this.elm.get("toggle_half_full").asBool();
   }

   public Optional<Boolean> toggleHomingAxe() {
      return this.elm.get("toggle_homing_axe").asBool();
   }

   public Optional<Boolean> toggleHuntersLuck() {
      return this.elm.get("toggle_hunters_luck").asBool();
   }

   public Optional<Boolean> toggleLottery() {
      return this.elm.get("toggle_lottery").asBool();
   }

   public Optional<Boolean> toggleLuckOfTheForest() {
      return this.elm.get("toggle_luck_of_the_forest").asBool();
   }

   public Optional<Boolean> toggleManiacSlicer() {
      return this.elm.get("toggle_maniac_slicer").asBool();
   }

   public Optional<Boolean> toggleMonsterHunter() {
      return this.elm.get("toggle_monster_hunter").asBool();
   }

   public Optional<Boolean> togglePrecisionCutting() {
      return this.elm.get("toggle_precision_cutting").asBool();
   }

   public Optional<Boolean> toggleRicochet() {
      return this.elm.get("toggle_ricochet").asBool();
   }

   public Optional<Boolean> toggleSpeedBoost() {
      return this.elm.get("toggle_speed_boost").asBool();
   }

   public Optional<Boolean> toggleStrengthBoost() {
      return this.elm.get("toggle_strength_boost").asBool();
   }

   public Optional<Boolean> toggleSweep() {
      return this.elm.get("toggle_sweep").asBool();
   }

   public Optional<Boolean> toggleTreeWhisperer() {
      return this.elm.get("toggle_tree_whisperer").asBool();
   }

   public Optional<Double> treeWhisperer() {
      return this.elm.get("tree_whisperer").asDouble();
   }
}
