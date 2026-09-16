package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.races;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record DungeonHub() {
   @NotNull
   private final BetterJson elm;

   public DungeonHub(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> crystalCoreAnythingNoReturnBestTime() {
      return this.elm.get("crystal_core_anything_no_return_best_time").asDouble();
   }

   public Optional<Double> crystalCoreAnythingWithReturnBestTime() {
      return this.elm.get("crystal_core_anything_with_return_best_time").asDouble();
   }

   public Optional<Double> crystalCoreNoAbilitiesNoReturnBestTime() {
      return this.elm.get("crystal_core_no_abilities_no_return_best_time").asDouble();
   }

   public Optional<Double> crystalCoreNoAbilitiesWithReturnBestTime() {
      return this.elm.get("crystal_core_no_abilities_with_return_best_time").asDouble();
   }

   public Optional<Double> crystalCoreNoPearlsNoReturnBestTime() {
      return this.elm.get("crystal_core_no_pearls_no_return_best_time").asDouble();
   }

   public Optional<Double> crystalCoreNoPearlsWithReturnBestTime() {
      return this.elm.get("crystal_core_no_pearls_with_return_best_time").asDouble();
   }

   public Optional<Double> crystalCoreNothingNoReturnBestTime() {
      return this.elm.get("crystal_core_nothing_no_return_best_time").asDouble();
   }

   public Optional<Double> crystalCoreNothingWithReturnBestTime() {
      return this.elm.get("crystal_core_nothing_with_return_best_time").asDouble();
   }

   public Optional<Double> giantMushroomAnythingNoReturnBestTime() {
      return this.elm.get("giant_mushroom_anything_no_return_best_time").asDouble();
   }

   public Optional<Double> giantMushroomAnythingWithReturnBestTime() {
      return this.elm.get("giant_mushroom_anything_with_return_best_time").asDouble();
   }

   public Optional<Double> giantMushroomNoAbilitiesNoReturnBestTime() {
      return this.elm.get("giant_mushroom_no_abilities_no_return_best_time").asDouble();
   }

   public Optional<Double> giantMushroomNoAbilitiesWithReturnBestTime() {
      return this.elm.get("giant_mushroom_no_abilities_with_return_best_time").asDouble();
   }

   public Optional<Double> giantMushroomNoPearlsNoReturnBestTime() {
      return this.elm.get("giant_mushroom_no_pearls_no_return_best_time").asDouble();
   }

   public Optional<Double> giantMushroomNoPearlsWithReturnBestTime() {
      return this.elm.get("giant_mushroom_no_pearls_with_return_best_time").asDouble();
   }

   public Optional<Double> giantMushroomNothingNoReturnBestTime() {
      return this.elm.get("giant_mushroom_nothing_no_return_best_time").asDouble();
   }

   public Optional<Double> giantMushroomNothingWithReturnBestTime() {
      return this.elm.get("giant_mushroom_nothing_with_return_best_time").asDouble();
   }

   public Optional<Double> precursorRuinsAnythingNoReturnBestTime() {
      return this.elm.get("precursor_ruins_anything_no_return_best_time").asDouble();
   }

   public Optional<Double> precursorRuinsAnythingWithReturnBestTime() {
      return this.elm.get("precursor_ruins_anything_with_return_best_time").asDouble();
   }

   public Optional<Double> precursorRuinsNoAbilitiesNoReturnBestTime() {
      return this.elm.get("precursor_ruins_no_abilities_no_return_best_time").asDouble();
   }

   public Optional<Double> precursorRuinsNoAbilitiesWithReturnBestTime() {
      return this.elm.get("precursor_ruins_no_abilities_with_return_best_time").asDouble();
   }

   public Optional<Double> precursorRuinsNoPearlsNoReturnBestTime() {
      return this.elm.get("precursor_ruins_no_pearls_no_return_best_time").asDouble();
   }

   public Optional<Double> precursorRuinsNoPearlsWithReturnBestTime() {
      return this.elm.get("precursor_ruins_no_pearls_with_return_best_time").asDouble();
   }

   public Optional<Double> precursorRuinsNothingNoReturnBestTime() {
      return this.elm.get("precursor_ruins_nothing_no_return_best_time").asDouble();
   }

   public Optional<Double> precursorRuinsNothingWithReturnBestTime() {
      return this.elm.get("precursor_ruins_nothing_with_return_best_time").asDouble();
   }
}
