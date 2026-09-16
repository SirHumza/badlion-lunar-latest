package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record TrophyFish() {
   @NotNull
   private final BetterJson elm;

   public TrophyFish(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> blobfish() {
      return this.elm.get("blobfish").asDouble();
   }

   public Optional<Double> blobfishBronze() {
      return this.elm.get("blobfish_bronze").asDouble();
   }

   public Optional<Double> blobfishDiamond() {
      return this.elm.get("blobfish_diamond").asDouble();
   }

   public Optional<Double> blobfishGold() {
      return this.elm.get("blobfish_gold").asDouble();
   }

   public Optional<Double> blobfishSilver() {
      return this.elm.get("blobfish_silver").asDouble();
   }

   public Optional<Double> flyfish() {
      return this.elm.get("flyfish").asDouble();
   }

   public Optional<Double> flyfishBronze() {
      return this.elm.get("flyfish_bronze").asDouble();
   }

   public Optional<Double> flyfishDiamond() {
      return this.elm.get("flyfish_diamond").asDouble();
   }

   public Optional<Double> flyfishGold() {
      return this.elm.get("flyfish_gold").asDouble();
   }

   public Optional<Double> flyfishSilver() {
      return this.elm.get("flyfish_silver").asDouble();
   }

   public Optional<Double> goldenFish() {
      return this.elm.get("golden_fish").asDouble();
   }

   public Optional<Double> goldenFishBronze() {
      return this.elm.get("golden_fish_bronze").asDouble();
   }

   public Optional<Double> goldenFishDiamond() {
      return this.elm.get("golden_fish_diamond").asDouble();
   }

   public Optional<Double> goldenFishGold() {
      return this.elm.get("golden_fish_gold").asDouble();
   }

   public Optional<Double> goldenFishSilver() {
      return this.elm.get("golden_fish_silver").asDouble();
   }

   public Optional<Double> gusher() {
      return this.elm.get("gusher").asDouble();
   }

   public Optional<Double> gusherBronze() {
      return this.elm.get("gusher_bronze").asDouble();
   }

   public Optional<Double> gusherDiamond() {
      return this.elm.get("gusher_diamond").asDouble();
   }

   public Optional<Double> gusherGold() {
      return this.elm.get("gusher_gold").asDouble();
   }

   public Optional<Double> gusherSilver() {
      return this.elm.get("gusher_silver").asDouble();
   }

   public Optional<Double> karateFish() {
      return this.elm.get("karate_fish").asDouble();
   }

   public Optional<Double> karateFishBronze() {
      return this.elm.get("karate_fish_bronze").asDouble();
   }

   public Optional<Double> karateFishDiamond() {
      return this.elm.get("karate_fish_diamond").asDouble();
   }

   public Optional<Double> karateFishGold() {
      return this.elm.get("karate_fish_gold").asDouble();
   }

   public Optional<Double> karateFishSilver() {
      return this.elm.get("karate_fish_silver").asDouble();
   }

   public Optional<String> lastCaught() {
      return this.elm.get("last_caught").asString();
   }

   public Optional<Double> lavaHorse() {
      return this.elm.get("lava_horse").asDouble();
   }

   public Optional<Double> lavaHorseBronze() {
      return this.elm.get("lava_horse_bronze").asDouble();
   }

   public Optional<Double> lavaHorseDiamond() {
      return this.elm.get("lava_horse_diamond").asDouble();
   }

   public Optional<Double> lavaHorseGold() {
      return this.elm.get("lava_horse_gold").asDouble();
   }

   public Optional<Double> lavaHorseSilver() {
      return this.elm.get("lava_horse_silver").asDouble();
   }

   public Optional<Double> manaRay() {
      return this.elm.get("mana_ray").asDouble();
   }

   public Optional<Double> manaRayBronze() {
      return this.elm.get("mana_ray_bronze").asDouble();
   }

   public Optional<Double> manaRayDiamond() {
      return this.elm.get("mana_ray_diamond").asDouble();
   }

   public Optional<Double> manaRayGold() {
      return this.elm.get("mana_ray_gold").asDouble();
   }

   public Optional<Double> manaRaySilver() {
      return this.elm.get("mana_ray_silver").asDouble();
   }

   public Optional<Double> moldfin() {
      return this.elm.get("moldfin").asDouble();
   }

   public Optional<Double> moldfinBronze() {
      return this.elm.get("moldfin_bronze").asDouble();
   }

   public Optional<Double> moldfinDiamond() {
      return this.elm.get("moldfin_diamond").asDouble();
   }

   public Optional<Double> moldfinGold() {
      return this.elm.get("moldfin_gold").asDouble();
   }

   public Optional<Double> moldfinSilver() {
      return this.elm.get("moldfin_silver").asDouble();
   }

   public Optional<Double> obfuscatedFish1() {
      return this.elm.get("obfuscated_fish_1").asDouble();
   }

   public Optional<Double> obfuscatedFish1Bronze() {
      return this.elm.get("obfuscated_fish_1_bronze").asDouble();
   }

   public Optional<Double> obfuscatedFish1Diamond() {
      return this.elm.get("obfuscated_fish_1_diamond").asDouble();
   }

   public Optional<Double> obfuscatedFish1Gold() {
      return this.elm.get("obfuscated_fish_1_gold").asDouble();
   }

   public Optional<Double> obfuscatedFish1Silver() {
      return this.elm.get("obfuscated_fish_1_silver").asDouble();
   }

   public Optional<Double> obfuscatedFish2() {
      return this.elm.get("obfuscated_fish_2").asDouble();
   }

   public Optional<Double> obfuscatedFish2Bronze() {
      return this.elm.get("obfuscated_fish_2_bronze").asDouble();
   }

   public Optional<Double> obfuscatedFish2Diamond() {
      return this.elm.get("obfuscated_fish_2_diamond").asDouble();
   }

   public Optional<Double> obfuscatedFish2Gold() {
      return this.elm.get("obfuscated_fish_2_gold").asDouble();
   }

   public Optional<Double> obfuscatedFish2Silver() {
      return this.elm.get("obfuscated_fish_2_silver").asDouble();
   }

   public Optional<Double> obfuscatedFish3() {
      return this.elm.get("obfuscated_fish_3").asDouble();
   }

   public Optional<Double> obfuscatedFish3Bronze() {
      return this.elm.get("obfuscated_fish_3_bronze").asDouble();
   }

   public Optional<Double> obfuscatedFish3Diamond() {
      return this.elm.get("obfuscated_fish_3_diamond").asDouble();
   }

   public Optional<Double> obfuscatedFish3Gold() {
      return this.elm.get("obfuscated_fish_3_gold").asDouble();
   }

   public Optional<Double> obfuscatedFish3Silver() {
      return this.elm.get("obfuscated_fish_3_silver").asDouble();
   }

   public List<Double> rewards() {
      return this.elm.get("rewards").asListOpt(BetterJson::asDouble);
   }

   public Optional<Double> skeletonFish() {
      return this.elm.get("skeleton_fish").asDouble();
   }

   public Optional<Double> skeletonFishBronze() {
      return this.elm.get("skeleton_fish_bronze").asDouble();
   }

   public Optional<Double> skeletonFishDiamond() {
      return this.elm.get("skeleton_fish_diamond").asDouble();
   }

   public Optional<Double> skeletonFishGold() {
      return this.elm.get("skeleton_fish_gold").asDouble();
   }

   public Optional<Double> skeletonFishSilver() {
      return this.elm.get("skeleton_fish_silver").asDouble();
   }

   public Optional<Double> slugfish() {
      return this.elm.get("slugfish").asDouble();
   }

   public Optional<Double> slugfishBronze() {
      return this.elm.get("slugfish_bronze").asDouble();
   }

   public Optional<Double> slugfishDiamond() {
      return this.elm.get("slugfish_diamond").asDouble();
   }

   public Optional<Double> slugfishGold() {
      return this.elm.get("slugfish_gold").asDouble();
   }

   public Optional<Double> slugfishSilver() {
      return this.elm.get("slugfish_silver").asDouble();
   }

   public Optional<Double> soulFish() {
      return this.elm.get("soul_fish").asDouble();
   }

   public Optional<Double> soulFishBronze() {
      return this.elm.get("soul_fish_bronze").asDouble();
   }

   public Optional<Double> soulFishDiamond() {
      return this.elm.get("soul_fish_diamond").asDouble();
   }

   public Optional<Double> soulFishGold() {
      return this.elm.get("soul_fish_gold").asDouble();
   }

   public Optional<Double> soulFishSilver() {
      return this.elm.get("soul_fish_silver").asDouble();
   }

   public Optional<Double> steamingHotFlounder() {
      return this.elm.get("steaming_hot_flounder").asDouble();
   }

   public Optional<Double> steamingHotFlounderBronze() {
      return this.elm.get("steaming_hot_flounder_bronze").asDouble();
   }

   public Optional<Double> steamingHotFlounderDiamond() {
      return this.elm.get("steaming_hot_flounder_diamond").asDouble();
   }

   public Optional<Double> steamingHotFlounderGold() {
      return this.elm.get("steaming_hot_flounder_gold").asDouble();
   }

   public Optional<Double> steamingHotFlounderSilver() {
      return this.elm.get("steaming_hot_flounder_silver").asDouble();
   }

   public Optional<Double> sulphurSkitter() {
      return this.elm.get("sulphur_skitter").asDouble();
   }

   public Optional<Double> sulphurSkitterBronze() {
      return this.elm.get("sulphur_skitter_bronze").asDouble();
   }

   public Optional<Double> sulphurSkitterDiamond() {
      return this.elm.get("sulphur_skitter_diamond").asDouble();
   }

   public Optional<Double> sulphurSkitterGold() {
      return this.elm.get("sulphur_skitter_gold").asDouble();
   }

   public Optional<Double> sulphurSkitterSilver() {
      return this.elm.get("sulphur_skitter_silver").asDouble();
   }

   public Optional<Double> totalCaught() {
      return this.elm.get("total_caught").asDouble();
   }

   public Optional<Double> vanille() {
      return this.elm.get("vanille").asDouble();
   }

   public Optional<Double> vanilleBronze() {
      return this.elm.get("vanille_bronze").asDouble();
   }

   public Optional<Double> vanilleDiamond() {
      return this.elm.get("vanille_diamond").asDouble();
   }

   public Optional<Double> vanilleGold() {
      return this.elm.get("vanille_gold").asDouble();
   }

   public Optional<Double> vanilleSilver() {
      return this.elm.get("vanille_silver").asDouble();
   }

   public Optional<Double> volcanicStonefish() {
      return this.elm.get("volcanic_stonefish").asDouble();
   }

   public Optional<Double> volcanicStonefishBronze() {
      return this.elm.get("volcanic_stonefish_bronze").asDouble();
   }

   public Optional<Double> volcanicStonefishDiamond() {
      return this.elm.get("volcanic_stonefish_diamond").asDouble();
   }

   public Optional<Double> volcanicStonefishGold() {
      return this.elm.get("volcanic_stonefish_gold").asDouble();
   }

   public Optional<Double> volcanicStonefishSilver() {
      return this.elm.get("volcanic_stonefish_silver").asDouble();
   }
}
