package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.accessorybagstorage.Tuning;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record AccessoryBagStorage() {
   @NotNull
   private final BetterJson elm;

   public AccessoryBagStorage(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> bagUpgradesPurchased() {
      return this.elm.get("bag_upgrades_purchased").asDouble();
   }

   public Optional<Double> highestMagicalPower() {
      return this.elm.get("highest_magical_power").asDouble();
   }

   public Optional<String> selectedPower() {
      return this.elm.get("selected_power").asString();
   }

   public Tuning tuning() {
      return new Tuning(this.elm.get("tuning"));
   }

   public List<String> unlockedPowers() {
      return this.elm.get("unlocked_powers").asListOpt(BetterJson::asString);
   }
}
