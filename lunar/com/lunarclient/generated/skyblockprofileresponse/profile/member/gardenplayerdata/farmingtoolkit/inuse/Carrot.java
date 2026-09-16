package com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Carrot() {
   @NotNull
   private final BetterJson elm;

   public Carrot(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> _0() {
      return this.elm.get("0").asBool();
   }
}
