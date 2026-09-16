package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Gifts() {
   @NotNull
   private final BetterJson elm;

   public Gifts(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> totalGiven() {
      return this.elm.get("total_given").asDouble();
   }

   public Optional<Double> totalReceived() {
      return this.elm.get("total_received").asDouble();
   }
}
