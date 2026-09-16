package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Seraphine() {
   @NotNull
   private final BetterJson elm;

   public Seraphine(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> stepIndex() {
      return this.elm.get("step_index").asDouble();
   }
}
