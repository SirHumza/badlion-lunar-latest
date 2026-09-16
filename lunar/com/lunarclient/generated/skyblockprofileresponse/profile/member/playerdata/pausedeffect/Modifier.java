package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata.pausedeffect;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Modifier() {
   @NotNull
   private final BetterJson elm;

   public Modifier(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> amp() {
      return this.elm.get("amp").asDouble();
   }

   public Optional<String> key() {
      return this.elm.get("key").asString();
   }
}
