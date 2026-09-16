package com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.biomes;

import com.lunarclient.BetterJson;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record Dwarven() {
   @NotNull
   private final BetterJson elm;

   public Dwarven(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> statuesPlaced() {
      return this.elm.get("statues_placed").asListOpt(BetterJson::asString);
   }
}
