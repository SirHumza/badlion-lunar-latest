package com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Shop() {
   @NotNull
   private final BetterJson elm;

   public Shop(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> chocolateSpent() {
      return this.elm.get("chocolate_spent").asDouble();
   }

   public Optional<Double> cocoaFortuneUpgrades() {
      return this.elm.get("cocoa_fortune_upgrades").asDouble();
   }

   public List<String> rabbits() {
      return this.elm.get("rabbits").asListOpt(BetterJson::asString);
   }

   public List<String> rabbitsPurchased() {
      return this.elm.get("rabbits_purchased").asListOpt(BetterJson::asString);
   }

   public Optional<Double> year() {
      return this.elm.get("year").asDouble();
   }
}
