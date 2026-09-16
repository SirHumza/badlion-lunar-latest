package com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record LastReset() {
   @NotNull
   private final BetterJson elm;

   public LastReset(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> foraging() {
      return this.elm.get("foraging").asDouble();
   }

   public Optional<Double> mining() {
      return this.elm.get("mining").asDouble();
   }
}
