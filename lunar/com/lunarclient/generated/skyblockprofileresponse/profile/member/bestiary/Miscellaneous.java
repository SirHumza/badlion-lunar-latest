package com.lunarclient.generated.skyblockprofileresponse.profile.member.bestiary;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Miscellaneous() {
   @NotNull
   private final BetterJson elm;

   public Miscellaneous(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> maxKillsVisible() {
      return this.elm.get("max_kills_visible").asBool();
   }

   public Optional<Boolean> milestonesNotifications() {
      return this.elm.get("milestones_notifications").asBool();
   }
}
