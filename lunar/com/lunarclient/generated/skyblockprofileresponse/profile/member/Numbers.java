package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.experimentation.Numbers;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.experimentation.Pairings;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.experimentation.Simon;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Experimentation() {
   @NotNull
   private final BetterJson elm;

   public Experimentation(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> chargeTrackTimestamp() {
      return this.elm.get("charge_track_timestamp").asDouble();
   }

   public Optional<Boolean> claimedRetroactiveRng() {
      return this.elm.get("claimed_retroactive_rng").asBool();
   }

   public Optional<Double> claimsResets() {
      return this.elm.get("claims_resets").asDouble();
   }

   public Optional<Double> claimsResetsTimestamp() {
      return this.elm.get("claims_resets_timestamp").asDouble();
   }

   public Numbers numbers() {
      return new Numbers(this.elm.get("numbers"));
   }

   public Pairings pairings() {
      return new Pairings(this.elm.get("pairings"));
   }

   public Optional<Double> serumsDrank() {
      return this.elm.get("serums_drank").asDouble();
   }

   public Simon simon() {
      return new Simon(this.elm.get("simon"));
   }
}
