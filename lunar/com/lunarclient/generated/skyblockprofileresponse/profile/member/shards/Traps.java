package com.lunarclient.generated.skyblockprofileresponse.profile.member.shards;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.shards.traps.ActiveTrap;
import org.jetbrains.annotations.NotNull;

public record Traps() {
   @NotNull
   private final BetterJson elm;

   public Traps(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public SafeList<ActiveTrap> activeTraps() {
      return this.elm.get("active_traps").asList(ActiveTrap::new);
   }
}
