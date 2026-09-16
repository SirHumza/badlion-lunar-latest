package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.deadcats.montezuma;

import com.lunarclient.BetterJson;
import org.jetbrains.annotations.NotNull;

public record Extra() {
   @NotNull
   private final BetterJson elm;

   public Extra(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }
}
