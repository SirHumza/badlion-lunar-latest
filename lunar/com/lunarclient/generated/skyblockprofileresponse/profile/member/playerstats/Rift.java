package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.rift.ShenItemBought;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.rift.WestVerminVacuumed;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Rift() {
   @NotNull
   private final BetterJson elm;

   public Rift(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> castleEffigyBroken() {
      return this.elm.get("castle_effigy_broken").asDouble();
   }

   public Optional<Double> castleSentToPrison() {
      return this.elm.get("castle_sent_to_prison").asDouble();
   }

   public Optional<Double> colosseumBacteDefeated() {
      return this.elm.get("colosseum_bacte_defeated").asDouble();
   }

   public Optional<Double> colosseumBlasterShots() {
      return this.elm.get("colosseum_blaster_shots").asDouble();
   }

   public Optional<Double> colosseumGlobowlsAtTentacle() {
      return this.elm.get("colosseum_globowls_at_tentacle").asDouble();
   }

   public Optional<Double> dreadfarmAgaricusHarvested() {
      return this.elm.get("dreadfarm_agaricus_harvested").asDouble();
   }

   public Optional<Double> dreadfarmBeanBulbCollected() {
      return this.elm.get("dreadfarm_bean_bulb_collected").asDouble();
   }

   public Optional<Double> dreadfarmCaducousHarvested() {
      return this.elm.get("dreadfarm_caducous_harvested").asDouble();
   }

   public Optional<Double> dreadfarmChickenKilled() {
      return this.elm.get("dreadfarm_chicken_killed").asDouble();
   }

   public Optional<Double> dreadfarmRiftwartsHarvested() {
      return this.elm.get("dreadfarm_riftwarts_harvested").asDouble();
   }

   public Optional<Double> dreadfarmWiltedHarvested() {
      return this.elm.get("dreadfarm_wilted_harvested").asDouble();
   }

   public Optional<Double> lagoonLeechSupremeKilled() {
      return this.elm.get("lagoon_leech_supreme_killed").asDouble();
   }

   public Optional<Double> lagoonLilPadsSold() {
      return this.elm.get("lagoon_lil_pads_sold").asDouble();
   }

   public Optional<Double> lagoonMushroomPoppedOut() {
      return this.elm.get("lagoon_mushroom_popped_out").asDouble();
   }

   public Optional<Double> lagoonRocksGameComplete() {
      return this.elm.get("lagoon_rocks_game_complete").asDouble();
   }

   public Optional<Double> lifetimeMotesEarned() {
      return this.elm.get("lifetime_motes_earned").asDouble();
   }

   public Optional<Double> livingCaveSnakeCollected() {
      return this.elm.get("living_cave_snake_collected").asDouble();
   }

   public Optional<Double> livingMetalPieceMaxed() {
      return this.elm.get("living_metal_piece_maxed").asDouble();
   }

   public Optional<Double> livingMetalSpawneggUsed() {
      return this.elm.get("living_metal_spawnegg_used").asDouble();
   }

   public Optional<Double> motesOrbPickup() {
      return this.elm.get("motes_orb_pickup").asDouble();
   }

   public Optional<Double> odonataRepeatableCompleted() {
      return this.elm.get("odonata_repeatable_completed").asDouble();
   }

   public Optional<Double> passConsumed() {
      return this.elm.get("pass_consumed").asDouble();
   }

   public Optional<Double> plazaHayDeaths() {
      return this.elm.get("plaza_hay_deaths").asDouble();
   }

   public Optional<Double> plazaHorsezookaShot() {
      return this.elm.get("plaza_horsezooka_shot").asDouble();
   }

   public Optional<Double> plazaPillarDeaths() {
      return this.elm.get("plaza_pillar_deaths").asDouble();
   }

   public Optional<Double> plazaRedLightDeaths() {
      return this.elm.get("plaza_red_light_deaths").asDouble();
   }

   public Optional<Double> poppedBalloons() {
      return this.elm.get("popped_balloons").asDouble();
   }

   public ShenItemBought shenItemBought() {
      return new ShenItemBought(this.elm.get("shen_item_bought"));
   }

   public Optional<Double> visits() {
      return this.elm.get("visits").asDouble();
   }

   public Optional<Double> westCakePartEaten() {
      return this.elm.get("west_cake_part_eaten").asDouble();
   }

   public Optional<Double> westHotDogsGiven() {
      return this.elm.get("west_hot_dogs_given").asDouble();
   }

   public WestVerminVacuumed westVerminVacuumed() {
      return new WestVerminVacuumed(this.elm.get("west_vermin_vacuumed"));
   }

   public Optional<Double> woodsLarvaKilled() {
      return this.elm.get("woods_larva_killed").asDouble();
   }

   public Optional<Double> woodsOdonataBottled() {
      return this.elm.get("woods_odonata_bottled").asDouble();
   }
}
