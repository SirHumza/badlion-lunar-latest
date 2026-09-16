package com.lunarclient.generated.skyblockprofileresponse.profile.banking;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Transaction() {
   @NotNull
   private final BetterJson elm;

   public Transaction(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> action() {
      return this.elm.get("action").asString();
   }

   public Optional<Double> amount() {
      return this.elm.get("amount").asDouble();
   }

   public Optional<String> initiatorName() {
      return this.elm.get("initiator_name").asString();
   }

   public Optional<Double> timestamp() {
      return this.elm.get("timestamp").asDouble();
   }
}
