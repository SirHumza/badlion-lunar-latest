package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza;

import com.lunarclient.BetterJson;
import org.jetbrains.annotations.NotNull;

public record BarterBank() {
   @NotNull
   private final BetterJson elm;

   public BarterBank(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }
}
