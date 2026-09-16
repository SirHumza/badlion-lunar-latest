package com.lunarclient.generated.skyblockprofileresponse.profile.member.attributes;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Stacks() {
   @NotNull
   private final BetterJson elm;

   public Stacks(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> accessorySize() {
      return this.elm.get("accessory_size").asDouble();
   }

   public Optional<Double> almighty() {
      return this.elm.get("almighty").asDouble();
   }

   public Optional<Double> animalExpertise() {
      return this.elm.get("animal_expertise").asDouble();
   }

   public Optional<Double> arachno() {
      return this.elm.get("arachno").asDouble();
   }

   public Optional<Double> arachnoResistance() {
      return this.elm.get("arachno_resistance").asDouble();
   }

   public Optional<Double> atomizedCrystals() {
      return this.elm.get("atomized_crystals").asDouble();
   }

   public Optional<Double> atomizedGlacite() {
      return this.elm.get("atomized_glacite").asDouble();
   }

   public Optional<Double> atomizedMithril() {
      return this.elm.get("atomized_mithril").asDouble();
   }

   public Optional<Double> attackSpeed() {
      return this.elm.get("attack_speed").asDouble();
   }

   public Optional<Double> battleExperience() {
      return this.elm.get("battle_experience").asDouble();
   }

   public Optional<Double> battleFrog() {
      return this.elm.get("battle_frog").asDouble();
   }

   public Optional<Double> bayouBiter() {
      return this.elm.get("bayou_biter").asDouble();
   }

   public Optional<Double> beaconZealot() {
      return this.elm.get("beacon_zealot").asDouble();
   }

   public Optional<Double> berryEnjoyer() {
      return this.elm.get("berry_enjoyer").asDouble();
   }

   public Optional<Double> berryMogul() {
      return this.elm.get("berry_mogul").asDouble();
   }

   public Optional<Double> bigGameHunter() {
      return this.elm.get("big_game_hunter").asDouble();
   }

   public Optional<Double> biggerBox() {
      return this.elm.get("bigger_box").asDouble();
   }

   public Optional<Double> blazing() {
      return this.elm.get("blazing").asDouble();
   }

   public Optional<Double> blazingFortune() {
      return this.elm.get("blazing_fortune").asDouble();
   }

   public Optional<Double> blazingResistance() {
      return this.elm.get("blazing_resistance").asDouble();
   }

   public Optional<Double> boneFont() {
      return this.elm.get("bone_font").asDouble();
   }

   public Optional<Double> bookWisdom() {
      return this.elm.get("book_wisdom").asDouble();
   }

   public Optional<Double> breeze() {
      return this.elm.get("breeze").asDouble();
   }

   public Optional<Double> bucketLover() {
      return this.elm.get("bucket_lover").asDouble();
   }

   public Optional<Double> catacombBox() {
      return this.elm.get("catacomb_box").asDouble();
   }

   public Optional<Double> catacombsGraduate() {
      return this.elm.get("catacombs_graduate").asDouble();
   }

   public Optional<Double> cavernWisdom() {
      return this.elm.get("cavern_wisdom").asDouble();
   }

   public Optional<Double> charmed() {
      return this.elm.get("charmed").asDouble();
   }

   public Optional<Double> cheapstake() {
      return this.elm.get("cheapstake").asDouble();
   }

   public Optional<Double> chop() {
      return this.elm.get("chop").asDouble();
   }

   public Optional<Double> cloakImprovement() {
      return this.elm.get("cloak_improvement").asDouble();
   }

   public Optional<Double> combo() {
      return this.elm.get("combo").asDouble();
   }

   public Optional<Double> cookieEater() {
      return this.elm.get("cookie_eater").asDouble();
   }

   public Optional<Double> crimsonSerendipity() {
      return this.elm.get("crimson_serendipity").asDouble();
   }

   public Optional<Double> cropBug() {
      return this.elm.get("crop_bug").asDouble();
   }

   public Optional<Double> crystalSerendipity() {
      return this.elm.get("crystal_serendipity").asDouble();
   }

   public Optional<Double> deadeye() {
      return this.elm.get("deadeye").asDouble();
   }

   public Optional<Double> decentKarma() {
      return this.elm.get("decent_karma").asDouble();
   }

   public Optional<Double> deepDiving() {
      return this.elm.get("deep_diving").asDouble();
   }

   public Optional<Double> deepTechnique() {
      return this.elm.get("deep_technique").asDouble();
   }

   public Optional<Double> diamondFrog() {
      return this.elm.get("diamond_frog").asDouble();
   }

   public Optional<Double> dominance() {
      return this.elm.get("dominance").asDouble();
   }

   public Optional<Double> doubleHook() {
      return this.elm.get("double_hook").asDouble();
   }

   public Optional<Double> dragonEssence() {
      return this.elm.get("dragon_essence").asDouble();
   }

   public Optional<Double> dragonShortbowImprovement() {
      return this.elm.get("dragon_shortbow_improvement").asDouble();
   }

   public Optional<Double> dwarvenSerendipity() {
      return this.elm.get("dwarven_serendipity").asDouble();
   }

   public Optional<Double> earthElemental() {
      return this.elm.get("earth_elemental").asDouble();
   }

   public Optional<Double> echoOfAtomized() {
      return this.elm.get("echo_of_atomized").asDouble();
   }

   public Optional<Double> echoOfBoxes() {
      return this.elm.get("echo_of_boxes").asDouble();
   }

   public Optional<Double> echoOfEchoes() {
      return this.elm.get("echo_of_echoes").asDouble();
   }

   public Optional<Double> echoOfElemental() {
      return this.elm.get("echo_of_elemental").asDouble();
   }

   public Optional<Double> echoOfEssence() {
      return this.elm.get("echo_of_essence").asDouble();
   }

   public Optional<Double> echoOfHunter() {
      return this.elm.get("echo_of_hunter").asDouble();
   }

   public Optional<Double> echoOfResistance() {
      return this.elm.get("echo_of_resistance").asDouble();
   }

   public Optional<Double> echoOfRuler() {
      return this.elm.get("echo_of_ruler").asDouble();
   }

   public Optional<Double> echoOfSharpening() {
      return this.elm.get("echo_of_sharpening").asDouble();
   }

   public Optional<Double> echoOfWisdom() {
      return this.elm.get("echo_of_wisdom").asDouble();
   }

   public Optional<Double> eelastic() {
      return this.elm.get("eelastic").asDouble();
   }

   public Optional<Double> elite() {
      return this.elm.get("elite").asDouble();
   }

   public Optional<Double> ender() {
      return this.elm.get("ender").asDouble();
   }

   public Optional<Double> enderResistance() {
      return this.elm.get("ender_resistance").asDouble();
   }

   public Optional<Double> excellentKarma() {
      return this.elm.get("excellent_karma").asDouble();
   }

   public Optional<Double> experience() {
      return this.elm.get("experience").asDouble();
   }

   public Optional<Double> extremePressure() {
      return this.elm.get("extreme_pressure").asDouble();
   }

   public Optional<Double> faker() {
      return this.elm.get("faker").asDouble();
   }

   public Optional<Double> fancyVisit() {
      return this.elm.get("fancy_visit").asDouble();
   }

   public Optional<Double> figCollector() {
      return this.elm.get("fig_collector").asDouble();
   }

   public Optional<Double> figSharpening() {
      return this.elm.get("fig_sharpening").asDouble();
   }

   public Optional<Double> fisherman() {
      return this.elm.get("fisherman").asDouble();
   }

   public Optional<Double> fishingExperience() {
      return this.elm.get("fishing_experience").asDouble();
   }

   public Optional<Double> fishingSpeed() {
      return this.elm.get("fishing_speed").asDouble();
   }

   public Optional<Double> fogElemental() {
      return this.elm.get("fog_elemental").asDouble();
   }

   public Optional<Double> foragingWisdom() {
      return this.elm.get("foraging_wisdom").asDouble();
   }

   public Optional<Double> forestElemental() {
      return this.elm.get("forest_elemental").asDouble();
   }

   public Optional<Double> forestEssence() {
      return this.elm.get("forest_essence").asDouble();
   }

   public Optional<Double> forestFishing() {
      return this.elm.get("forest_fishing").asDouble();
   }

   public Optional<Double> forestStrength() {
      return this.elm.get("forest_strength").asDouble();
   }

   public Optional<Double> forestTrap() {
      return this.elm.get("forest_trap").asDouble();
   }

   public Optional<Double> fortitude() {
      return this.elm.get("fortitude").asDouble();
   }

   public Optional<Double> freezingSpread() {
      return this.elm.get("freezing_spread").asDouble();
   }

   public Optional<Double> frogLegs() {
      return this.elm.get("frog_legs").asDouble();
   }

   public Optional<Double> frostElemental() {
      return this.elm.get("frost_elemental").asDouble();
   }

   public Optional<Double> fungyLuck() {
      return this.elm.get("fungy_luck").asDouble();
   }

   public Optional<Double> gardenWisdom() {
      return this.elm.get("garden_wisdom").asDouble();
   }

   public Optional<Double> goldBait() {
      return this.elm.get("gold_bait").asDouble();
   }

   public Optional<Double> goldenFrog() {
      return this.elm.get("golden_frog").asDouble();
   }

   public Optional<Double> goodKarma() {
      return this.elm.get("good_karma").asDouble();
   }

   public Optional<Double> greatKarma() {
      return this.elm.get("great_karma").asDouble();
   }

   public Optional<Double> groovyRadar() {
      return this.elm.get("groovy_radar").asDouble();
   }

   public Optional<Double> happyBox() {
      return this.elm.get("happy_box").asDouble();
   }

   public Optional<Double> humanoidRuler() {
      return this.elm.get("humanoid_ruler").asDouble();
   }

   public Optional<Double> huntWisdom() {
      return this.elm.get("hunt_wisdom").asDouble();
   }

   public Optional<Double> hunter() {
      return this.elm.get("hunter").asDouble();
   }

   public Optional<Double> hunterKarma() {
      return this.elm.get("hunter_karma").asDouble();
   }

   public Optional<Double> huntersFangs() {
      return this.elm.get("hunters_fangs").asDouble();
   }

   public Optional<Double> huntersGrasp() {
      return this.elm.get("hunters_grasp").asDouble();
   }

   public Optional<Double> huntersPressure() {
      return this.elm.get("hunters_pressure").asDouble();
   }

   public Optional<Double> huntersSuppress() {
      return this.elm.get("hunters_suppress").asDouble();
   }

   public Optional<Double> iceEssence() {
      return this.elm.get("ice_essence").asDouble();
   }

   public Optional<Double> ignition() {
      return this.elm.get("ignition").asDouble();
   }

   public Optional<Double> infection() {
      return this.elm.get("infection").asDouble();
   }

   public Optional<Double> infiltration() {
      return this.elm.get("infiltration").asDouble();
   }

   public Optional<Double> insectPower() {
      return this.elm.get("insect_power").asDouble();
   }

   public Optional<Double> katFavorite() {
      return this.elm.get("kat_favorite").asDouble();
   }

   public Optional<Double> kingOfGreed() {
      return this.elm.get("king_of_greed").asDouble();
   }

   public Optional<Double> kuudraBox() {
      return this.elm.get("kuudra_box").asDouble();
   }

   public Optional<Double> lifeRecovery() {
      return this.elm.get("life_recovery").asDouble();
   }

   public Optional<Double> lifeRegeneration() {
      return this.elm.get("life_regeneration").asDouble();
   }

   public Optional<Double> lifeline() {
      return this.elm.get("lifeline").asDouble();
   }

   public Optional<Double> lightElemental() {
      return this.elm.get("light_elemental").asDouble();
   }

   public Optional<Double> lightningElemental() {
      return this.elm.get("lightning_elemental").asDouble();
   }

   public Optional<Double> lilyPuncher() {
      return this.elm.get("lily_puncher").asDouble();
   }

   public Optional<Double> lilyTracker() {
      return this.elm.get("lily_tracker").asDouble();
   }

   public Optional<Double> lochHook() {
      return this.elm.get("loch_hook").asDouble();
   }

   public Optional<Double> lostAndFound() {
      return this.elm.get("lost_and_found").asDouble();
   }

   public Optional<Double> lotusTrophy() {
      return this.elm.get("lotus_trophy").asDouble();
   }

   public Optional<Double> luckyRod() {
      return this.elm.get("lucky_rod").asDouble();
   }

   public Optional<Double> lunarPower() {
      return this.elm.get("lunar_power").asDouble();
   }

   public Optional<Double> magicFind() {
      return this.elm.get("magic_find").asDouble();
   }

   public Optional<Double> magmaticRuler() {
      return this.elm.get("magmatic_ruler").asDouble();
   }

   public Optional<Double> manaRegeneration() {
      return this.elm.get("mana_regeneration").asDouble();
   }

   public Optional<Double> manaSteal() {
      return this.elm.get("mana_steal").asDouble();
   }

   public Optional<Double> mangroveCollector() {
      return this.elm.get("mangrove_collector").asDouble();
   }

   public Optional<Double> mangroveSharpening() {
      return this.elm.get("mangrove_sharpening").asDouble();
   }

   public Optional<Double> matriarchCubs() {
      return this.elm.get("matriarch_cubs").asDouble();
   }

   public Optional<Double> maximalTorment() {
      return this.elm.get("maximal_torment").asDouble();
   }

   public Optional<Double> mending() {
      return this.elm.get("mending").asDouble();
   }

   public Optional<Double> midasTouch() {
      return this.elm.get("midas_touch").asDouble();
   }

   public Optional<Double> moongladeMastery() {
      return this.elm.get("moonglade_mastery").asDouble();
   }

   public Optional<Double> moongladeSerendipity() {
      return this.elm.get("moonglade_serendipity").asDouble();
   }

   public Optional<Double> mossyBox() {
      return this.elm.get("mossy_box").asDouble();
   }

   public Optional<Double> mountainClimber() {
      return this.elm.get("mountain_climber").asDouble();
   }

   public Optional<Double> mythologicalFortune() {
      return this.elm.get("mythological_fortune").asDouble();
   }

   public Optional<Double> mythologicalResistance() {
      return this.elm.get("mythological_resistance").asDouble();
   }

   public Optional<Double> natureElemental() {
      return this.elm.get("nature_elemental").asDouble();
   }

   public Optional<Double> nocturnalAnimal() {
      return this.elm.get("nocturnal_animal").asDouble();
   }

   public Optional<Double> owlFriend() {
      return this.elm.get("owl_friend").asDouble();
   }

   public Optional<Double> payback() {
      return this.elm.get("payback").asDouble();
   }

   public Optional<Double> pestLuck() {
      return this.elm.get("pest_luck").asDouble();
   }

   public Optional<Double> petWisdom() {
      return this.elm.get("pet_wisdom").asDouble();
   }

   public Optional<Double> pity() {
      return this.elm.get("pity").asDouble();
   }

   public Optional<Double> prettyClothes() {
      return this.elm.get("pretty_clothes").asDouble();
   }

   public Optional<Double> pureReptile() {
      return this.elm.get("pure_reptile").asDouble();
   }

   public Optional<Double> quartzSpeed() {
      return this.elm.get("quartz_speed").asDouble();
   }

   public Optional<Double> rabbitCrew() {
      return this.elm.get("rabbit_crew").asDouble();
   }

   public Optional<Double> rareBird() {
      return this.elm.get("rare_bird").asDouble();
   }

   public Optional<Double> reborn() {
      return this.elm.get("reborn").asDouble();
   }

   public Optional<Double> rottenPickaxe() {
      return this.elm.get("rotten_pickaxe").asDouble();
   }

   public Optional<Double> sackSize() {
      return this.elm.get("sack_size").asDouble();
   }

   public Optional<Double> shadowElemental() {
      return this.elm.get("shadow_elemental").asDouble();
   }

   public Optional<Double> shell() {
      return this.elm.get("shell").asDouble();
   }

   public Optional<Double> skeletalRuler() {
      return this.elm.get("skeletal_ruler").asDouble();
   }

   public Optional<Double> snowElemental() {
      return this.elm.get("snow_elemental").asDouble();
   }

   public Optional<Double> solarPower() {
      return this.elm.get("solar_power").asDouble();
   }

   public Optional<Double> speed() {
      return this.elm.get("speed").asDouble();
   }

   public Optional<Double> spiderEssence() {
      return this.elm.get("spider_essence").asDouble();
   }

   public Optional<Double> spiritAxe() {
      return this.elm.get("spirit_axe").asDouble();
   }

   public Optional<Double> starBait() {
      return this.elm.get("star_bait").asDouble();
   }

   public Optional<Double> starborn() {
      return this.elm.get("starborn").asDouble();
   }

   public Optional<Double> stoneElemental() {
      return this.elm.get("stone_elemental").asDouble();
   }

   public Optional<Double> stormElemental() {
      return this.elm.get("storm_elemental").asDouble();
   }

   public Optional<Double> strongArms() {
      return this.elm.get("strong_arms").asDouble();
   }

   public Optional<Double> strongLegs() {
      return this.elm.get("strong_legs").asDouble();
   }

   public Optional<Double> torrentElemental() {
      return this.elm.get("torrent_elemental").asDouble();
   }

   public Optional<Double> treeLurker() {
      return this.elm.get("tree_lurker").asDouble();
   }

   public Optional<Double> trophyHunter() {
      return this.elm.get("trophy_hunter").asDouble();
   }

   public Optional<Double> tuningBox() {
      return this.elm.get("tuning_box").asDouble();
   }

   public Optional<Double> ultimateDna() {
      return this.elm.get("ultimate_dna").asDouble();
   }

   public Optional<Double> undead() {
      return this.elm.get("undead").asDouble();
   }

   public Optional<Double> undeadEssence() {
      return this.elm.get("undead_essence").asDouble();
   }

   public Optional<Double> undeadResistance() {
      return this.elm.get("undead_resistance").asDouble();
   }

   public Optional<Double> unityIsStrength() {
      return this.elm.get("unity_is_strength").asDouble();
   }

   public Optional<Double> unlimitedEnergy() {
      return this.elm.get("unlimited_energy").asDouble();
   }

   public Optional<Double> unlimitedPower() {
      return this.elm.get("unlimited_power").asDouble();
   }

   public Optional<Double> veil() {
      return this.elm.get("veil").asDouble();
   }

   public Optional<Double> veteran() {
      return this.elm.get("veteran").asDouble();
   }

   public Optional<Double> visitorBait() {
      return this.elm.get("visitor_bait").asDouble();
   }

   public Optional<Double> warrior() {
      return this.elm.get("warrior").asDouble();
   }

   public Optional<Double> wartEater() {
      return this.elm.get("wart_eater").asDouble();
   }

   public Optional<Double> waterElemental() {
      return this.elm.get("water_elemental").asDouble();
   }

   public Optional<Double> whyNotMore() {
      return this.elm.get("why_not_more").asDouble();
   }

   public Optional<Double> windElemental() {
      return this.elm.get("wind_elemental").asDouble();
   }

   public Optional<Double> wingsOfDestiny() {
      return this.elm.get("wings_of_destiny").asDouble();
   }

   public Optional<Double> winterSerendipity() {
      return this.elm.get("winter_serendipity").asDouble();
   }

   public Optional<Double> witherEssence() {
      return this.elm.get("wither_essence").asDouble();
   }

   public Optional<Double> woodElemental() {
      return this.elm.get("wood_elemental").asDouble();
   }

   public Optional<Double> yogMembrane() {
      return this.elm.get("yog_membrane").asDouble();
   }

   public Optional<Double> yummy() {
      return this.elm.get("yummy").asDouble();
   }
}
