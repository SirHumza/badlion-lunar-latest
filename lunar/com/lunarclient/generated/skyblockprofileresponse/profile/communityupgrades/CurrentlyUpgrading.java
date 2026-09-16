package com.lunarclient.generated.skyblockprofileresponse.profile.communityupgrades;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record CurrentlyUpgrading() {
   @NotNull
   private final BetterJson elm;

   public CurrentlyUpgrading(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> newTier() {
      return this.elm.get("new_tier").asDouble();
   }

   public Optional<Double> startMs() {
      return this.elm.get("start_ms").asDouble();
   }

   public Optional<String> upgrade() {
      return this.elm.get("upgrade").asString();
   }

   public Optional<String> whoStarted() {
      return this.elm.get("who_started").asString();
   }
}
