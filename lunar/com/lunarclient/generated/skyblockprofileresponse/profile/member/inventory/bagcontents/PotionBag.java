package com.lunarclient.generated.skyblockprofileresponse.profile.member.inventory.bagcontents;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PotionBag() {
   @NotNull
   private final BetterJson elm;

   public PotionBag(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> data() {
      return this.elm.get("data").asString();
   }

   public Optional<Double> type() {
      return this.elm.get("type").asDouble();
   }
}
