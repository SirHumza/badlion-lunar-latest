package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.hina;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.hina.tasks.TaskProgress;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Tasks() {
   @NotNull
   private final BetterJson elm;

   public Tasks(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> claimedRewards() {
      return this.elm.get("claimed_rewards").asListOpt(BetterJson::asString);
   }

   public List<String> completedTasks() {
      return this.elm.get("completed_tasks").asListOpt(BetterJson::asString);
   }

   public TaskProgress taskProgress() {
      return new TaskProgress(this.elm.get("task_progress"));
   }

   public Optional<Double> tierClaimed() {
      return this.elm.get("tier_claimed").asDouble();
   }
}
