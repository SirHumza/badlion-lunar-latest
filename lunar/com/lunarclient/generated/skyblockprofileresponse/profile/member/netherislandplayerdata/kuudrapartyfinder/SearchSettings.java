package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.kuudrapartyfinder;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record SearchSettings() {
   @NotNull
   private final BetterJson elm;

   public SearchSettings(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> combatLevel() {
      return this.elm.get("combat_level").asString();
   }

   public Optional<String> search() {
      return this.elm.get("search").asString();
   }

   public Optional<String> sort() {
      return this.elm.get("sort").asString();
   }

   public Optional<String> tier() {
      return this.elm.get("tier").asString();
   }
}
