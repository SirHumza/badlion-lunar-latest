package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.questdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record QuestInfo() {
   @NotNull
   private final BetterJson elm;

   public QuestInfo(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> claimedRewards() {
      return this.elm.get("claimed_rewards").asBool();
   }

   public Optional<Double> completedAt() {
      return this.elm.get("completed_at").asDouble();
   }

   public Optional<Double> progress() {
      return this.elm.get("progress").asDouble();
   }

   public Optional<String> status() {
      return this.elm.get("status").asString();
   }
}
