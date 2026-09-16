package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ShredderRod() {
   @NotNull
   private final BetterJson elm;

   public ShredderRod(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> bait() {
      return this.elm.get("bait").asDouble();
   }

   public Optional<Double> fished() {
      return this.elm.get("fished").asDouble();
   }
}
