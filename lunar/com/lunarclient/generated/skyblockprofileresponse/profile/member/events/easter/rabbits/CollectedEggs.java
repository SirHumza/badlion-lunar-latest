package com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter.rabbits;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record CollectedEggs() {
   @NotNull
   private final BetterJson elm;

   public CollectedEggs(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> breakfast() {
      return this.elm.get("breakfast").asDouble();
   }

   public Optional<Double> brunch() {
      return this.elm.get("brunch").asDouble();
   }

   public Optional<Double> dejeuner() {
      return this.elm.get("dejeuner").asDouble();
   }

   public Optional<Double> dinner() {
      return this.elm.get("dinner").asDouble();
   }

   public Optional<Double> lunch() {
      return this.elm.get("lunch").asDouble();
   }

   public Optional<Double> supper() {
      return this.elm.get("supper").asDouble();
   }
}
