package com.lunarclient.generated.skyblockprofileresponse.profile.member.experimentation;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Numbers() {
   @NotNull
   private final BetterJson elm;

   public Numbers(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> attempts1() {
      return this.elm.get("attempts_1").asDouble();
   }

   public Optional<Double> attempts2() {
      return this.elm.get("attempts_2").asDouble();
   }

   public Optional<Double> attempts3() {
      return this.elm.get("attempts_3").asDouble();
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

   public Optional<Double> bonusClicks() {
      return this.elm.get("bonus_clicks").asDouble();
   }

   public Optional<Boolean> claimed() {
      return this.elm.get("claimed").asBool();
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

   public Optional<Double> lastAttempt() {
      return this.elm.get("last_attempt").asDouble();
   }

   public Optional<Double> lastClaimed() {
      return this.elm.get("last_claimed").asDouble();
   }
}
