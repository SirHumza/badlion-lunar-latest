package com.lunarclient.generated.skyblockprofileresponse.profile.member.experimentation;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Pairings() {
   @NotNull
   private final BetterJson elm;

   public Pairings(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> bestScore0() {
      return this.elm.get("best_score_0").asDouble();
   }

   public Optional<Double> bestScore1() {
      return this.elm.get("best_score_1").asDouble();
   }

   public Optional<Double> bestScore2() {
      return this.elm.get("best_score_2").asDouble();
   }

   public Optional<Double> bestScore3() {
      return this.elm.get("best_score_3").asDouble();
   }

   public Optional<Double> bestScore4() {
      return this.elm.get("best_score_4").asDouble();
   }

   public Optional<Double> bestScore5() {
      return this.elm.get("best_score_5").asDouble();
   }

   public Optional<Double> bonusClicks() {
      return this.elm.get("bonus_clicks").asDouble();
   }

   public Optional<Boolean> claimed() {
      return this.elm.get("claimed").asBool();
   }

   public Optional<Double> claims0() {
      return this.elm.get("claims_0").asDouble();
   }

   public Optional<Double> claims1() {
      return this.elm.get("claims_1").asDouble();
   }

   public Optional<Double> claims2() {
      return this.elm.get("claims_2").asDouble();
   }

   public Optional<Double> claims3() {
      return this.elm.get("claims_3").asDouble();
   }

   public Optional<Double> claims4() {
      return this.elm.get("claims_4").asDouble();
   }

   public Optional<Double> claims5() {
      return this.elm.get("claims_5").asDouble();
   }

   public Optional<Double> lastAttempt() {
      return this.elm.get("last_attempt").asDouble();
   }

   public Optional<Double> lastClaimed() {
      return this.elm.get("last_claimed").asDouble();
   }
}
