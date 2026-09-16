package com.lunarclient.generated.skyblockprofileresponse.profile.member.slayer.slayerbosses;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.slayer.slayerbosses.slayerstats.ClaimedLevels;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record SlayerStats() {
   @NotNull
   private final BetterJson elm;

   public SlayerStats(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> bossAttemptsTier0() {
      return this.elm.get("boss_attempts_tier_0").asDouble();
   }

   public Optional<Double> bossAttemptsTier1() {
      return this.elm.get("boss_attempts_tier_1").asDouble();
   }

   public Optional<Double> bossAttemptsTier2() {
      return this.elm.get("boss_attempts_tier_2").asDouble();
   }

   public Optional<Double> bossAttemptsTier3() {
      return this.elm.get("boss_attempts_tier_3").asDouble();
   }

   public Optional<Double> bossAttemptsTier4() {
      return this.elm.get("boss_attempts_tier_4").asDouble();
   }

   public Optional<Double> bossKillsTier0() {
      return this.elm.get("boss_kills_tier_0").asDouble();
   }

   public Optional<Double> bossKillsTier1() {
      return this.elm.get("boss_kills_tier_1").asDouble();
   }

   public Optional<Double> bossKillsTier2() {
      return this.elm.get("boss_kills_tier_2").asDouble();
   }

   public Optional<Double> bossKillsTier3() {
      return this.elm.get("boss_kills_tier_3").asDouble();
   }

   public Optional<Double> bossKillsTier4() {
      return this.elm.get("boss_kills_tier_4").asDouble();
   }

   public ClaimedLevels claimedLevels() {
      return new ClaimedLevels(this.elm.get("claimed_levels"));
   }

   public Optional<Double> xp() {
      return this.elm.get("xp").asDouble();
   }
}
