package com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Contest() {
   @NotNull
   private final BetterJson elm;

   public Contest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> claimedMedal() {
      return this.elm.get("claimed_medal").asString();
   }

   public Optional<Double> claimedParticipants() {
      return this.elm.get("claimed_participants").asDouble();
   }

   public Optional<Double> claimedPosition() {
      return this.elm.get("claimed_position").asDouble();
   }

   public Optional<Boolean> claimedRewards() {
      return this.elm.get("claimed_rewards").asBool();
   }

   public Optional<Double> collected() {
      return this.elm.get("collected").asDouble();
   }
}
