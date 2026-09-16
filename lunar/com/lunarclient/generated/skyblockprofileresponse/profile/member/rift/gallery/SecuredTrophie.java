package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.gallery;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record SecuredTrophie() {
   @NotNull
   private final BetterJson elm;

   public SecuredTrophie(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> timestamp() {
      return this.elm.get("timestamp").asDouble();
   }

   public Optional<String> type() {
      return this.elm.get("type").asString();
   }

   public Optional<Double> visits() {
      return this.elm.get("visits").asDouble();
   }
}
