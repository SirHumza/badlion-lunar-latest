package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.playerclasses;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PlayerClassInfo() {
   @NotNull
   private final BetterJson elm;

   public PlayerClassInfo(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> experience() {
      return this.elm.get("experience").asDouble();
   }
}
