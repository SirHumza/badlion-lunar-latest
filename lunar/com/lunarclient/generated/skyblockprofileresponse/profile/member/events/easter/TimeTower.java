package com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record TimeTower() {
   @NotNull
   private final BetterJson elm;

   public TimeTower(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> activationTime() {
      return this.elm.get("activation_time").asDouble();
   }

   public Optional<Double> charges() {
      return this.elm.get("charges").asDouble();
   }

   public Optional<Double> lastChargeTime() {
      return this.elm.get("last_charge_time").asDouble();
   }

   public Optional<Double> level() {
      return this.elm.get("level").asDouble();
   }
}
