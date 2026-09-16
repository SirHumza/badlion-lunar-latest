package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.mythos;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record BurrowStats() {
   @NotNull
   private final BetterJson elm;

   public BurrowStats(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> _null() {
      return this.elm.get("null").asDouble();
   }

   public Optional<Double> common() {
      return this.elm.get("COMMON").asDouble();
   }

   public Optional<Double> epic() {
      return this.elm.get("EPIC").asDouble();
   }

   public Optional<Double> legendary() {
      return this.elm.get("LEGENDARY").asDouble();
   }

   public Optional<Double> mythic() {
      return this.elm.get("MYTHIC").asDouble();
   }

   public Optional<Double> none() {
      return this.elm.get("none").asDouble();
   }

   public Optional<Double> rare() {
      return this.elm.get("RARE").asDouble();
   }

   public Optional<Double> total() {
      return this.elm.get("total").asDouble();
   }

   public Optional<Double> uncommon() {
      return this.elm.get("UNCOMMON").asDouble();
   }
}
