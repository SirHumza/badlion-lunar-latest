package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ItemData() {
   @NotNull
   private final BetterJson elm;

   public ItemData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> favoriteArrow() {
      return this.elm.get("favorite_arrow").asString();
   }

   public Optional<Double> soulflow() {
      return this.elm.get("soulflow").asDouble();
   }

   public Optional<Boolean> teleporterPillConsumed() {
      return this.elm.get("teleporter_pill_consumed").asBool();
   }
}
