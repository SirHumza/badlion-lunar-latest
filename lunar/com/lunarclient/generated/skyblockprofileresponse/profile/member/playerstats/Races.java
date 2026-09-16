package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.races.DungeonHub;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Races() {
   @NotNull
   private final BetterJson elm;

   public Races(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> chickenRaceBestTime2() {
      return this.elm.get("chicken_race_best_time_2").asDouble();
   }

   public DungeonHub dungeonHub() {
      return new DungeonHub(this.elm.get("dungeon_hub"));
   }

   public Optional<Double> endRaceBestTime() {
      return this.elm.get("end_race_best_time").asDouble();
   }

   public Optional<Double> foragingRaceBestTime() {
      return this.elm.get("foraging_race_best_time").asDouble();
   }

   public Optional<Double> riftRaceBestTime() {
      return this.elm.get("rift_race_best_time").asDouble();
   }
}
