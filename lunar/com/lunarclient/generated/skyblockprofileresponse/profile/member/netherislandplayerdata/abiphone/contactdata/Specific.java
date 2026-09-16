package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.abiphone.contactdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Specific() {
   @NotNull
   private final BetterJson elm;

   public Specific(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> colorIndexGiven() {
      return this.elm.get("color_index_given").asDouble();
   }

   public Optional<Boolean> gaveSavingGrace() {
      return this.elm.get("gave_saving_grace").asBool();
   }

   public Optional<Double> lastMistake() {
      return this.elm.get("last_mistake").asDouble();
   }

   public Optional<Double> lastRewardYear() {
      return this.elm.get("last_reward_year").asDouble();
   }

   public Optional<Boolean> unlockedTargetPracticeIv() {
      return this.elm.get("unlocked_target_practice_iv").asBool();
   }
}
