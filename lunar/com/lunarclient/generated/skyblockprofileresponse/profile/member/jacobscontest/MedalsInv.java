package com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record MedalsInv() {
   @NotNull
   private final BetterJson elm;

   public MedalsInv(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> bronze() {
      return this.elm.get("bronze").asDouble();
   }

   public Optional<Double> gold() {
      return this.elm.get("gold").asDouble();
   }

   public Optional<Double> silver() {
      return this.elm.get("silver").asDouble();
   }
}
