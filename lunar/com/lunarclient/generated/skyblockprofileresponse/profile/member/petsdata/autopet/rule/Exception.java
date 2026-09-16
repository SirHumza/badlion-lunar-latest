package com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.autopet.rule;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Exception() {
   @NotNull
   private final BetterJson elm;

   public Exception(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.autopet.rule.exception.Data data() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.autopet.rule.exception.Data(this.elm.get("data"));
   }

   public Optional<String> id() {
      return this.elm.get("id").asString();
   }
}
