package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats;

import com.lunarclient.BetterJson;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public record Spooky() {
   @NotNull
   private final BetterJson elm;

   public Spooky(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Map<String, Double> batsSpawned() {
      return this.elm.get("bats_spawned").asMapOpt(BetterJson::asDouble);
   }
}
