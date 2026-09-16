package com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.autopet.rule.exception;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Data() {
   @NotNull
   private final BetterJson elm;

   public Data(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> event() {
      return this.elm.get("event").asString();
   }

   public Optional<String> island() {
      return this.elm.get("island").asString();
   }

   public Optional<String> pet() {
      return this.elm.get("pet").asString();
   }
}
