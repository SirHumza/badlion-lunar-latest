package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Enigma() {
   @NotNull
   private final BetterJson elm;

   public Enigma(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> boughtCloak() {
      return this.elm.get("bought_cloak").asBool();
   }

   public Optional<Double> claimedBonusIndex() {
      return this.elm.get("claimed_bonus_index").asDouble();
   }

   public List<String> foundSouls() {
      return this.elm.get("found_souls").asListOpt(BetterJson::asString);
   }
}
