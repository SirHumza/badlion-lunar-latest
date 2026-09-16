package com.lunarclient.generated.skyblockprofileresponse.profile.member.leveling;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Completions() {
   @NotNull
   private final BetterJson elm;

   public Completions(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> nucleusRuns() {
      return this.elm.get("NUCLEUS_RUNS").asDouble();
   }

   public Optional<Double> reaperPeppers() {
      return this.elm.get("REAPER_PEPPERS").asDouble();
   }

   public Optional<Double> refinedDarkCacaoTruffle() {
      return this.elm.get("REFINED_DARK_CACAO_TRUFFLE").asDouble();
   }
}
