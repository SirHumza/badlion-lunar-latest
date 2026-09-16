package com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record SelectedAbility() {
   @NotNull
   private final BetterJson elm;

   public SelectedAbility(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> foraging() {
      return this.elm.get("foraging").asString();
   }

   public Optional<String> mining() {
      return this.elm.get("mining").asString();
   }
}
