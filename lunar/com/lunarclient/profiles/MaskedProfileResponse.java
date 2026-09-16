package com.lunarclient.profiles;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.Profile;
import java.util.Optional;

public record MaskedProfileResponse() {
   private final BetterJson elm;

   public MaskedProfileResponse(BetterJson var1) {
      this.elm = var1;
   }

   public Optional<Boolean> success() {
      return this.elm.get("success").asBool();
   }

   public Profile profile() {
      return new Profile(this.elm.get("profile"));
   }
}
