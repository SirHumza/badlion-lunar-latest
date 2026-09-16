package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record WinterPlayerData() {
   @NotNull
   private final BetterJson elm;

   public WinterPlayerData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> refinedJyrreUses() {
      return this.elm.get("refined_jyrre_uses").asDouble();
   }
}
