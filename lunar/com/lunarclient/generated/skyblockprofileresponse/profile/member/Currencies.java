package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.Essence;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Currencies() {
   @NotNull
   private final BetterJson elm;

   public Currencies(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> coinPurse() {
      return this.elm.get("coin_purse").asDouble();
   }

   public Essence essence() {
      return new Essence(this.elm.get("essence"));
   }

   public Optional<Double> motesPurse() {
      return this.elm.get("motes_purse").asDouble();
   }
}
