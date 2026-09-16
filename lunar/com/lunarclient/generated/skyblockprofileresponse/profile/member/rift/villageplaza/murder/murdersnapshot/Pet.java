package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.murder.murdersnapshot;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Pet() {
   @NotNull
   private final BetterJson elm;

   public Pet(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> exp() {
      return this.elm.get("exp").asDouble();
   }

   public Optional<String> tier() {
      return this.elm.get("tier").asString();
   }

   public Optional<String> type() {
      return this.elm.get("type").asString();
   }
}
