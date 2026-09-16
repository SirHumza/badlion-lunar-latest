package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PocketBlackHole() {
   @NotNull
   private final BetterJson elm;

   public PocketBlackHole(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> _0() {
      return this.elm.get("0").asBool();
   }
}
