package com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.biomes.Dwarven;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.biomes.Goblin;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.biomes.Jungle;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.biomes.Precursor;
import org.jetbrains.annotations.NotNull;

public record Biomes() {
   @NotNull
   private final BetterJson elm;

   public Biomes(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Dwarven dwarven() {
      return new Dwarven(this.elm.get("dwarven"));
   }

   public Goblin goblin() {
      return new Goblin(this.elm.get("goblin"));
   }

   public Jungle jungle() {
      return new Jungle(this.elm.get("jungle"));
   }

   public Precursor precursor() {
      return new Precursor(this.elm.get("precursor"));
   }
}
