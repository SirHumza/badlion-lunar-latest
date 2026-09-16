package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.starlyn.PersonalBests;
import org.jetbrains.annotations.NotNull;

public record Starlyn() {
   @NotNull
   private final BetterJson elm;

   public Starlyn(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public PersonalBests personalBests() {
      return new PersonalBests(this.elm.get("personal_bests"));
   }
}
