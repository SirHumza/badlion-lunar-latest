package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.access;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Pass() {
   @NotNull
   private final BetterJson elm;

   public Pass(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> fromRefund() {
      return this.elm.get("from_refund").asBool();
   }

   public Optional<Double> issuedAt() {
      return this.elm.get("issued_at").asDouble();
   }

   public Optional<Double> riftServerJoins() {
      return this.elm.get("rift_server_joins").asDouble();
   }

   public Optional<Boolean> usedPrism() {
      return this.elm.get("used_prism").asBool();
   }
}
