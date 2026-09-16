package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.leveling.Completions;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Leveling() {
   @NotNull
   private final BetterJson elm;

   public Leveling(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> bopBonus() {
      return this.elm.get("bop_bonus").asString();
   }

   public Optional<Boolean> categoryExpanded() {
      return this.elm.get("category_expanded").asBool();
   }

   public Optional<Boolean> claimedTalisman() {
      return this.elm.get("claimed_talisman").asBool();
   }

   public List<String> completed() {
      return this.elm.get("completed").asListOpt(BetterJson::asString);
   }

   public List<String> completedTasks() {
      return this.elm.get("completed_tasks").asListOpt(BetterJson::asString);
   }

   public Completions completions() {
      return new Completions(this.elm.get("completions"));
   }

   public List<String> emblemUnlocks() {
      return this.elm.get("emblem_unlocks").asListOpt(BetterJson::asString);
   }

   public Optional<Double> experience() {
      return this.elm.get("experience").asDouble();
   }

   public Optional<Double> fishingFestivalSharksKilled() {
      return this.elm.get("fishing_festival_sharks_killed").asDouble();
   }

   public Optional<String> guideSort() {
      return this.elm.get("guide_sort").asString();
   }

   public Optional<Double> highestPetScore() {
      return this.elm.get("highest_pet_score").asDouble();
   }

   public List<String> lastViewedTasks() {
      return this.elm.get("last_viewed_tasks").asListOpt(BetterJson::asString);
   }

   public Optional<Boolean> migrated() {
      return this.elm.get("migrated").asBool();
   }

   public Optional<Boolean> migratedCompletions() {
      return this.elm.get("migrated_completions").asBool();
   }

   public Optional<Boolean> migratedCompletions2() {
      return this.elm.get("migrated_completions_2").asBool();
   }

   public Optional<Double> miningFiestaOresMined() {
      return this.elm.get("mining_fiesta_ores_mined").asDouble();
   }

   public Optional<String> selectedSymbol() {
      return this.elm.get("selected_symbol").asString();
   }

   public Optional<String> taskSort() {
      return this.elm.get("task_sort").asString();
   }
}
