package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeontypes.catacombs.bestruns;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record RunInfo() {
   @NotNull
   private final BetterJson elm;

   public RunInfo(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> allyHealing() {
      return this.elm.get("ally_healing").asDouble();
   }

   public Optional<Double> damageDealt() {
      return this.elm.get("damage_dealt").asDouble();
   }

   public Optional<Double> damageMitigated() {
      return this.elm.get("damage_mitigated").asDouble();
   }

   public Optional<Double> deaths() {
      return this.elm.get("deaths").asDouble();
   }

   public Optional<String> dungeonClass() {
      return this.elm.get("dungeon_class").asString();
   }

   public Optional<Double> elapsedTime() {
      return this.elm.get("elapsed_time").asDouble();
   }

   public Optional<Double> mobsKilled() {
      return this.elm.get("mobs_killed").asDouble();
   }

   public Optional<Double> scoreBonus() {
      return this.elm.get("score_bonus").asDouble();
   }

   public Optional<Double> scoreExploration() {
      return this.elm.get("score_exploration").asDouble();
   }

   public Optional<Double> scoreSkill() {
      return this.elm.get("score_skill").asDouble();
   }

   public Optional<Double> scoreSpeed() {
      return this.elm.get("score_speed").asDouble();
   }

   public Optional<Double> secretsFound() {
      return this.elm.get("secrets_found").asDouble();
   }

   public List<String> teammates() {
      return this.elm.get("teammates").asListOpt(BetterJson::asString);
   }

   public Optional<Double> timestamp() {
      return this.elm.get("timestamp").asDouble();
   }
}
