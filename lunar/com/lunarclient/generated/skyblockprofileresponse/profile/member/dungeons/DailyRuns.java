package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record DailyRuns() {
   @NotNull
   private final BetterJson elm;

   public DailyRuns(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> completedRunsCount() {
      return this.elm.get("completed_runs_count").asDouble();
   }

   public Optional<Double> currentDayStamp() {
      return this.elm.get("current_day_stamp").asDouble();
   }
}
