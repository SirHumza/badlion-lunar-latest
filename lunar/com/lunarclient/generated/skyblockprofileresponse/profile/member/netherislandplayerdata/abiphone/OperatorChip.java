package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.abiphone;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record OperatorChip() {
   @NotNull
   private final BetterJson elm;

   public OperatorChip(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> repairedIndex() {
      return this.elm.get("repaired_index").asDouble();
   }
}
