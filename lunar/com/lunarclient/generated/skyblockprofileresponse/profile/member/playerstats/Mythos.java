package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.mythos.BurrowStats;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Mythos() {
   @NotNull
   private final BetterJson elm;

   public Mythos(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public BurrowStats burrowsChainsComplete() {
      return new BurrowStats(this.elm.get("burrows_chains_complete"));
   }

   public BurrowStats burrowsDugCombat() {
      return new BurrowStats(this.elm.get("burrows_dug_combat"));
   }

   public BurrowStats burrowsDugNext() {
      return new BurrowStats(this.elm.get("burrows_dug_next"));
   }

   public BurrowStats burrowsDugTreasure() {
      return new BurrowStats(this.elm.get("burrows_dug_treasure"));
   }

   public Optional<Double> kills() {
      return this.elm.get("kills").asDouble();
   }
}
