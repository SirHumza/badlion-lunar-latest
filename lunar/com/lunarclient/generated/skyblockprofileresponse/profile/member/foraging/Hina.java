package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.hina.Tasks;
import org.jetbrains.annotations.NotNull;

public record Hina() {
   @NotNull
   private final BetterJson elm;

   public Hina(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Tasks tasks() {
      return new Tasks(this.elm.get("tasks"));
   }
}
