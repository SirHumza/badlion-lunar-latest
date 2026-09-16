package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.treasures;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.treasures.chest.Rewards;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Chest() {
   @NotNull
   private final BetterJson elm;

   public Chest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> chestId() {
      return this.elm.get("chest_id").asString();
   }

   public Optional<String> chestType() {
      return this.elm.get("chest_type").asString();
   }

   public Optional<Boolean> isAttributeRerolled() {
      return this.elm.get("is_attribute_rerolled").asBool();
   }

   public Optional<Boolean> isOpened() {
      return this.elm.get("is_opened").asBool();
   }

   public Optional<Boolean> isRerolled() {
      return this.elm.get("is_rerolled").asBool();
   }

   public Optional<String> lootTableId() {
      return this.elm.get("loot_table_id").asString();
   }

   public Optional<Boolean> paid() {
      return this.elm.get("paid").asBool();
   }

   public Optional<Double> percentageCompleted() {
      return this.elm.get("percentage_completed").asDouble();
   }

   public Optional<Double> quality() {
      return this.elm.get("quality").asDouble();
   }

   public Optional<Double> rerolls() {
      return this.elm.get("rerolls").asDouble();
   }

   public Rewards rewards() {
      return new Rewards(this.elm.get("rewards"));
   }

   public Optional<String> runId() {
      return this.elm.get("run_id").asString();
   }

   public Optional<String> runTier() {
      return this.elm.get("run_tier").asString();
   }

   public Optional<Double> secondarySlots() {
      return this.elm.get("secondary_slots").asDouble();
   }

   public Optional<Boolean> shinyEligible() {
      return this.elm.get("shiny_eligible").asBool();
   }

   public Optional<String> treasureType() {
      return this.elm.get("treasure_type").asString();
   }

   public Optional<String> type() {
      return this.elm.get("type").asString();
   }
}
