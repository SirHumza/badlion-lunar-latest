package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record WitherCage() {
   @NotNull
   private final BetterJson elm;

   public WitherCage(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> killedEyes() {
      return this.elm.get("killed_eyes").asListOpt(BetterJson::asString);
   }
}
