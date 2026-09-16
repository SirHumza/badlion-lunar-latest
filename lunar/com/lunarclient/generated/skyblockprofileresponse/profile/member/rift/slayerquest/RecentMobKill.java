package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.slayerquest;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record RecentMobKill() {
   @NotNull
   private final BetterJson elm;

   public RecentMobKill(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> timestamp() {
      return this.elm.get("timestamp").asDouble();
   }

   public Optional<Double> xp() {
      return this.elm.get("xp").asDouble();
   }
}
