package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.kuudrapartyfinder;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record GroupBuilder() {
   @NotNull
   private final BetterJson elm;

   public GroupBuilder(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> combatLevelRequired() {
      return this.elm.get("combat_level_required").asDouble();
   }

   public Optional<String> note() {
      return this.elm.get("note").asString();
   }

   public Optional<String> tier() {
      return this.elm.get("tier").asString();
   }
}
