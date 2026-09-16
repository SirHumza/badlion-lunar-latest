package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.DailyRuns;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.DungeonHubRaceSettings;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.DungeonJournal;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.DungeonTypes;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.PlayerClasses;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.Treasures;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Dungeons() {
   @NotNull
   private final BetterJson elm;

   public Dungeons(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public DailyRuns dailyRuns() {
      return new DailyRuns(this.elm.get("daily_runs"));
   }

   public DungeonHubRaceSettings dungeonHubRaceSettings() {
      return new DungeonHubRaceSettings(this.elm.get("dungeon_hub_race_settings"));
   }

   public DungeonJournal dungeonJournal() {
      return new DungeonJournal(this.elm.get("dungeon_journal"));
   }

   public DungeonTypes dungeonTypes() {
      return new DungeonTypes(this.elm.get("dungeon_types"));
   }

   public List<String> dungeonsBlahBlah() {
      return this.elm.get("dungeons_blah_blah").asListOpt(BetterJson::asString);
   }

   public Optional<String> lastDungeonRun() {
      return this.elm.get("last_dungeon_run").asString();
   }

   public PlayerClasses playerClasses() {
      return new PlayerClasses(this.elm.get("player_classes"));
   }

   public Optional<Double> secrets() {
      return this.elm.get("secrets").asDouble();
   }

   public Optional<String> selectedDungeonClass() {
      return this.elm.get("selected_dungeon_class").asString();
   }

   public Treasures treasures() {
      return new Treasures(this.elm.get("treasures"));
   }
}
