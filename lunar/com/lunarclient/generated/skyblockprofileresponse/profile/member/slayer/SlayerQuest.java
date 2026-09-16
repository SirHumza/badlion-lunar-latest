package com.lunarclient.generated.skyblockprofileresponse.profile.member.slayer;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.slayer.slayerquest.RecentMobKill;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record SlayerQuest() {
   @NotNull
   private final BetterJson elm;

   public SlayerQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> cocooned() {
      return this.elm.get("cocooned").asBool();
   }

   public Optional<Double> combatXp() {
      return this.elm.get("combat_xp").asDouble();
   }

   public Optional<Double> completionState() {
      return this.elm.get("completion_state").asDouble();
   }

   public Optional<Double> killTimestamp() {
      return this.elm.get("kill_timestamp").asDouble();
   }

   public Optional<String> lastKilledMobIsland() {
      return this.elm.get("last_killed_mob_island").asString();
   }

   public SafeList<RecentMobKill> recentMobKills() {
      return this.elm.get("recent_mob_kills").asList(RecentMobKill::new);
   }

   public Optional<Boolean> solo() {
      return this.elm.get("solo").asBool();
   }

   public Optional<Double> spawnTimestamp() {
      return this.elm.get("spawn_timestamp").asDouble();
   }

   public Optional<Double> startTimestamp() {
      return this.elm.get("start_timestamp").asDouble();
   }

   public Optional<Double> tier() {
      return this.elm.get("tier").asDouble();
   }

   public Optional<String> type() {
      return this.elm.get("type").asString();
   }

   public Optional<Boolean> usedArmor() {
      return this.elm.get("used_armor").asBool();
   }

   public Optional<Double> xpOnLastFollowerSpawn() {
      return this.elm.get("xp_on_last_follower_spawn").asDouble();
   }
}
