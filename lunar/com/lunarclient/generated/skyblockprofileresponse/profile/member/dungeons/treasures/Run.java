package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.treasures;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.treasures.run.Participant;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Run() {
   @NotNull
   private final BetterJson elm;

   public Run(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> completionTs() {
      return this.elm.get("completion_ts").asDouble();
   }

   public Optional<Double> dungeonTier() {
      return this.elm.get("dungeon_tier").asDouble();
   }

   public Optional<String> dungeonType() {
      return this.elm.get("dungeon_type").asString();
   }

   public SafeList<Participant> participants() {
      return this.elm.get("participants").asList(Participant::new);
   }

   public Optional<String> runId() {
      return this.elm.get("run_id").asString();
   }

   public Optional<String> tierId() {
      return this.elm.get("tier_id").asString();
   }

   public Optional<String> type() {
      return this.elm.get("type").asString();
   }
}
