package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record DungeonHubRaceSettings() {
   @NotNull
   private final BetterJson elm;

   public DungeonHubRaceSettings(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> runback() {
      return this.elm.get("runback").asBool();
   }

   public Optional<String> selectedRace() {
      return this.elm.get("selected_race").asString();
   }

   public Optional<String> selectedSetting() {
      return this.elm.get("selected_setting").asString();
   }
}
