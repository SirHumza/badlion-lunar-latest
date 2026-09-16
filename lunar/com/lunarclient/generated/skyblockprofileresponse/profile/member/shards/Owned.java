package com.lunarclient.generated.skyblockprofileresponse.profile.member.shards;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Owned() {
   @NotNull
   private final BetterJson elm;

   public Owned(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> amountOwned() {
      return this.elm.get("amount_owned").asDouble();
   }

   public Optional<Double> captured() {
      return this.elm.get("captured").asDouble();
   }

   public Optional<String> type() {
      return this.elm.get("type").asString();
   }
}
