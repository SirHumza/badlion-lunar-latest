package com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree.nodes.Foraging;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree.nodes.Mining;
import org.jetbrains.annotations.NotNull;

public record Nodes() {
   @NotNull
   private final BetterJson elm;

   public Nodes(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Foraging foraging() {
      return new Foraging(this.elm.get("foraging"));
   }

   public Mining mining() {
      return new Mining(this.elm.get("mining"));
   }
}
