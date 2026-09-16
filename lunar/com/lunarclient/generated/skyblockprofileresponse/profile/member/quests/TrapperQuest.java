package com.lunarclient.generated.skyblockprofileresponse.profile.member.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record TrapperQuest() {
   @NotNull
   private final BetterJson elm;

   public TrapperQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> lastTaskTime() {
      return this.elm.get("last_task_time").asDouble();
   }

   public Optional<Double> peltCount() {
      return this.elm.get("pelt_count").asDouble();
   }
}
