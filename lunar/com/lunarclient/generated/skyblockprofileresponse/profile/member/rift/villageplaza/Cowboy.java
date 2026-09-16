package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Cowboy() {
   @NotNull
   private final BetterJson elm;

   public Cowboy(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> exportedCarrots() {
      return this.elm.get("exported_carrots").asDouble();
   }

   public Optional<Double> hayEaten() {
      return this.elm.get("hay_eaten").asDouble();
   }

   public Optional<String> rabbitName() {
      return this.elm.get("rabbit_name").asString();
   }

   public Optional<Double> stage() {
      return this.elm.get("stage").asDouble();
   }
}
