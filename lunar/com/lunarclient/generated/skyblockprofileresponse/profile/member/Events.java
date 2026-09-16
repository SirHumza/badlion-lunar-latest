package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.events.Easter;
import org.jetbrains.annotations.NotNull;

public record Events() {
   @NotNull
   private final BetterJson elm;

   public Events(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Easter easter() {
      return new Easter(this.elm.get("easter"));
   }
}
