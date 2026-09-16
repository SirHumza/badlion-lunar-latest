package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ToolKit() {
   @NotNull
   private final BetterJson elm;

   public ToolKit(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> data() {
      return this.elm.get("data").asString();
   }

   public Optional<Double> type() {
      return this.elm.get("type").asDouble();
   }
}
