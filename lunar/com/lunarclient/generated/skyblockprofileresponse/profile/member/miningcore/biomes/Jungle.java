package com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.biomes;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Jungle() {
   @NotNull
   private final BetterJson elm;

   public Jungle(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> jungleTempleChestUses() {
      return this.elm.get("jungle_temple_chest_uses").asDouble();
   }

   public Optional<Boolean> jungleTempleOpen() {
      return this.elm.get("jungle_temple_open").asBool();
   }
}
