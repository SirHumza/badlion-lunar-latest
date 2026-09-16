package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.access.Pass;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Access() {
   @NotNull
   private final BetterJson elm;

   public Access(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> chargeTrackTimestamp() {
      return this.elm.get("charge_track_timestamp").asDouble();
   }

   public Optional<Boolean> consumedPrism() {
      return this.elm.get("consumed_prism").asBool();
   }

   public Optional<Double> lastFree() {
      return this.elm.get("last_free").asDouble();
   }

   public Pass pass() {
      return new Pass(this.elm.get("pass"));
   }
}
