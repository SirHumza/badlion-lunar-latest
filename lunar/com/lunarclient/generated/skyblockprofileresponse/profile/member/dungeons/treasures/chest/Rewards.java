package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.treasures.chest;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Rewards() {
   @NotNull
   private final BetterJson elm;

   public Rewards(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> rewards() {
      return this.elm.get("rewards").asListOpt(BetterJson::asString);
   }

   public Optional<String> rngMeterReward() {
      return this.elm.get("rng_meter_reward").asString();
   }

   public Optional<Boolean> rolledRngMeterRandomly() {
      return this.elm.get("rolled_rng_meter_randomly").asBool();
   }
}
