package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record FairySoul() {
   @NotNull
   private final BetterJson elm;

   public FairySoul(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> fairyExchanges() {
      return this.elm.get("fairy_exchanges").asDouble();
   }

   public Optional<Double> totalCollected() {
      return this.elm.get("total_collected").asDouble();
   }

   public Optional<Double> unspentSouls() {
      return this.elm.get("unspent_souls").asDouble();
   }
}
