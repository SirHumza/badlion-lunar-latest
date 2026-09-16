package com.lunarclient.generated;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.Profile;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record SkyblockProfileResponse() {
   @NotNull
   private final BetterJson elm;

   public SkyblockProfileResponse(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public SafeList<Profile> profiles() {
      return this.elm.get("profiles").asList(Profile::new);
   }

   public Optional<Boolean> success() {
      return this.elm.get("success").asBool();
   }
}
