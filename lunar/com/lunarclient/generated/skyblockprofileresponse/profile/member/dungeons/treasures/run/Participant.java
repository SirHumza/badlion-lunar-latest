package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.treasures.run;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Participant() {
   @NotNull
   private final BetterJson elm;

   public Participant(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> classMilestone() {
      return this.elm.get("class_milestone").asDouble();
   }

   public Optional<String> displayName() {
      return this.elm.get("display_name").asString();
   }

   public Optional<String> playerUuid() {
      return this.elm.get("player_uuid").asString();
   }
}
