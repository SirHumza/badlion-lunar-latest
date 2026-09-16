package com.lunarclient.generated.skyblockprofileresponse.profile.communityupgrades;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record UpgradeState() {
   @NotNull
   private final BetterJson elm;

   public UpgradeState(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> claimedBy() {
      return this.elm.get("claimed_by").asString();
   }

   public Optional<String> startedBy() {
      return this.elm.get("started_by").asString();
   }

   public Optional<Double> startedMs() {
      return this.elm.get("started_ms").asDouble();
   }

   public Optional<Double> tier() {
      return this.elm.get("tier").asDouble();
   }

   public Optional<String> upgrade() {
      return this.elm.get("upgrade").asString();
   }
}
