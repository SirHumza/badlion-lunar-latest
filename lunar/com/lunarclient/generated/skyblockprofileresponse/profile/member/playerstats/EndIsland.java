package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.endisland.DragonFight;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record EndIsland() {
   @NotNull
   private final BetterJson elm;

   public EndIsland(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public DragonFight dragonFight() {
      return new DragonFight(this.elm.get("dragon_fight"));
   }

   public Optional<Double> specialZealotLootCollected() {
      return this.elm.get("special_zealot_loot_collected").asDouble();
   }

   public Optional<Double> summoningEyesCollected() {
      return this.elm.get("summoning_eyes_collected").asDouble();
   }
}
