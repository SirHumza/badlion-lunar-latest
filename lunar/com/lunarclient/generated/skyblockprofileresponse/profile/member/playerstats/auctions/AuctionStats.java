package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.auctions;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record AuctionStats() {
   @NotNull
   private final BetterJson elm;

   public AuctionStats(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
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

   public Optional<Double> rare() {
      return this.elm.get("RARE").asDouble();
   }

   public Optional<Double> special() {
      return this.elm.get("SPECIAL").asDouble();
   }

   public Optional<Double> total() {
      return this.elm.get("total").asDouble();
   }

   public Optional<Double> ultimate() {
      return this.elm.get("ULTIMATE").asDouble();
   }

   public Optional<Double> uncommon() {
      return this.elm.get("UNCOMMON").asDouble();
   }
}
