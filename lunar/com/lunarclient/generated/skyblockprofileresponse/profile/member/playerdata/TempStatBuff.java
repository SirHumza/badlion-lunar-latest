package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record TempStatBuff() {
   @NotNull
   private final BetterJson elm;

   public TempStatBuff(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> amount() {
      return this.elm.get("amount").asDouble();
   }

   public Optional<Double> expireAt() {
      return this.elm.get("expire_at").asDouble();
   }

   public Optional<String> key() {
      return this.elm.get("key").asString();
   }

   public Optional<Double> stat() {
      return this.elm.get("stat").asDouble();
   }

   public Optional<String> statId() {
      return this.elm.get("stat_id").asString();
   }
}
