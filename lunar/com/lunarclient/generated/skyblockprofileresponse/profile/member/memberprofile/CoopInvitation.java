package com.lunarclient.generated.skyblockprofileresponse.profile.member.memberprofile;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record CoopInvitation() {
   @NotNull
   private final BetterJson elm;

   public CoopInvitation(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> confirmed() {
      return this.elm.get("confirmed").asBool();
   }

   public Optional<Double> confirmedTimestamp() {
      return this.elm.get("confirmed_timestamp").asDouble();
   }

   public Optional<String> invitedBy() {
      return this.elm.get("invited_by").asString();
   }

   public Optional<Double> timestamp() {
      return this.elm.get("timestamp").asDouble();
   }
}
