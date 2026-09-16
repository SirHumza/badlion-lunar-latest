package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.endisland;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.endisland.dragonfight.DragonFightStats;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.endisland.dragonfight.MostDamage;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record DragonFight() {
   @NotNull
   private final BetterJson elm;

   public DragonFight(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public DragonFightStats amountSummoned() {
      return new DragonFightStats(this.elm.get("amount_summoned"));
   }

   public Optional<Double> enderCrystalsDestroyed() {
      return this.elm.get("ender_crystals_destroyed").asDouble();
   }

   public DragonFightStats fastestKill() {
      return new DragonFightStats(this.elm.get("fastest_kill"));
   }

   public DragonFightStats highestRank() {
      return new DragonFightStats(this.elm.get("highest_rank"));
   }

   public MostDamage mostDamage() {
      return new MostDamage(this.elm.get("most_damage"));
   }

   public DragonFightStats summoningEyesContributed() {
      return new DragonFightStats(this.elm.get("summoning_eyes_contributed"));
   }
}
