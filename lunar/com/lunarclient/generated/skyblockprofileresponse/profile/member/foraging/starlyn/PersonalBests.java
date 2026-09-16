package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.starlyn;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PersonalBests() {
   @NotNull
   private final BetterJson elm;

   public PersonalBests(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> agatha() {
      return this.elm.get("agatha").asDouble();
   }

   public Optional<Double> figLog() {
      return this.elm.get("FIG_LOG").asDouble();
   }

   public Optional<Double> mangroveLog() {
      return this.elm.get("MANGROVE_LOG").asDouble();
   }
}
