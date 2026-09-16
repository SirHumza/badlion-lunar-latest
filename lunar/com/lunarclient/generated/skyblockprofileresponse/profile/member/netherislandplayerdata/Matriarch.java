package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Matriarch() {
   @NotNull
   private final BetterJson elm;

   public Matriarch(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> lastAttempt() {
      return this.elm.get("last_attempt").asDouble();
   }

   public Optional<Double> pearlsCollected() {
      return this.elm.get("pearls_collected").asDouble();
   }

   public List<Double> recentRefreshes() {
      return this.elm.get("recent_refreshes").asListOpt(BetterJson::asDouble);
   }
}
