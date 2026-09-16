package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeontypes;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeontypes.catacombs.BestRuns;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeontypes.catacombs.FloorStatNumber;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Catacombs() {
   @NotNull
   private final BetterJson elm;

   public Catacombs(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public BestRuns bestRuns() {
      return new BestRuns(this.elm.get("best_runs"));
   }

   public FloorStatNumber bestScore() {
      return new FloorStatNumber(this.elm.get("best_score"));
   }

   public Optional<Double> experience() {
      return this.elm.get("experience").asDouble();
   }

   public FloorStatNumber fastestTime() {
      return new FloorStatNumber(this.elm.get("fastest_time"));
   }

   public FloorStatNumber fastestTimeS() {
      return new FloorStatNumber(this.elm.get("fastest_time_s"));
   }

   public FloorStatNumber fastestTimeSPlus() {
      return new FloorStatNumber(this.elm.get("fastest_time_s_plus"));
   }

   public Optional<Double> highestTierCompleted() {
      return this.elm.get("highest_tier_completed").asDouble();
   }

   public FloorStatNumber milestoneCompletions() {
      return new FloorStatNumber(this.elm.get("milestone_completions"));
   }

   public FloorStatNumber mobsKilled() {
      return new FloorStatNumber(this.elm.get("mobs_killed"));
   }

   public FloorStatNumber mostDamageArcher() {
      return new FloorStatNumber(this.elm.get("most_damage_archer"));
   }

   public FloorStatNumber mostDamageBerserk() {
      return new FloorStatNumber(this.elm.get("most_damage_berserk"));
   }

   public FloorStatNumber mostDamageHealer() {
      return new FloorStatNumber(this.elm.get("most_damage_healer"));
   }

   public FloorStatNumber mostDamageMage() {
      return new FloorStatNumber(this.elm.get("most_damage_mage"));
   }

   public FloorStatNumber mostDamageTank() {
      return new FloorStatNumber(this.elm.get("most_damage_tank"));
   }

   public FloorStatNumber mostHealing() {
      return new FloorStatNumber(this.elm.get("most_healing"));
   }

   public FloorStatNumber mostMobsKilled() {
      return new FloorStatNumber(this.elm.get("most_mobs_killed"));
   }

   public FloorStatNumber tierCompletions() {
      return new FloorStatNumber(this.elm.get("tier_completions"));
   }

   public FloorStatNumber timesPlayed() {
      return new FloorStatNumber(this.elm.get("times_played"));
   }

   public FloorStatNumber watcherKills() {
      return new FloorStatNumber(this.elm.get("watcher_kills"));
   }
}
