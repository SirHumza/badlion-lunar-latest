package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.attributes.Stacks;
import org.jetbrains.annotations.NotNull;

public record Attributes() {
   @NotNull
   private final BetterJson elm;

   public Attributes(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Stacks stacks() {
      return new Stacks(this.elm.get("stacks"));
   }
}
