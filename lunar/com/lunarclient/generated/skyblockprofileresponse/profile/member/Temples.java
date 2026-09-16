package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record Temples() {
   @NotNull
   private final BetterJson elm;

   public Temples(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> unlockedTemples() {
      return this.elm.get("unlocked_temples").asListOpt(BetterJson::asString);
   }
}
