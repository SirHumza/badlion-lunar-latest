package com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record TokensSpent() {
   @NotNull
   private final BetterJson elm;

   public TokensSpent(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> forest() {
      return this.elm.get("forest").asDouble();
   }

   public Optional<Double> mountain() {
      return this.elm.get("mountain").asDouble();
   }
}
