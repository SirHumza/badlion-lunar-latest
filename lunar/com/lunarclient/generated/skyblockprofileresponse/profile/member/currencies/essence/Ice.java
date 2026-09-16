package com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.essence;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Ice() {
   @NotNull
   private final BetterJson elm;

   public Ice(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> current() {
      return this.elm.get("current").asDouble();
   }
}
