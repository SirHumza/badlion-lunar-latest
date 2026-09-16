package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.rift;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ShenItemBought() {
   @NotNull
   private final BetterJson elm;

   public ShenItemBought(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> ancientElevator() {
      return this.elm.get("ANCIENT_ELEVATOR").asDouble();
   }

   public Optional<Double> deadCatFood() {
      return this.elm.get("DEAD_CAT_FOOD").asDouble();
   }

   public Optional<Double> flexHelmet() {
      return this.elm.get("FLEX_HELMET").asDouble();
   }

   public Optional<Double> placeableFairySoulRift() {
      return this.elm.get("PLACEABLE_FAIRY_SOUL_RIFT").asDouble();
   }

   public Optional<Double> punchcardArtifact() {
      return this.elm.get("PUNCHCARD_ARTIFACT").asDouble();
   }

   public Optional<Double> riftPrism() {
      return this.elm.get("RIFT_PRISM").asDouble();
   }

   public Optional<Double> total() {
      return this.elm.get("total").asDouble();
   }
}
