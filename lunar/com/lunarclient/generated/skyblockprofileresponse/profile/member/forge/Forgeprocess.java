package com.lunarclient.generated.skyblockprofileresponse.profile.member.forge;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.forge.forgeprocesses.ForgeProcess;
import org.jetbrains.annotations.NotNull;

public record ForgeProcesses() {
   @NotNull
   private final BetterJson elm;

   public ForgeProcesses(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public ForgeProcess forge1() {
      return new ForgeProcess(this.elm.get("forge_1"));
   }
}
