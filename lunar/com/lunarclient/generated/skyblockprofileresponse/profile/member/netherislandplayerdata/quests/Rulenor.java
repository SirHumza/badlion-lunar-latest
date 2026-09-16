package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Rulenor() {
   @NotNull
   private final BetterJson elm;

   public Rulenor(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> lastPayment() {
      return this.elm.get("last_payment").asDouble();
   }

   public Optional<Boolean> talkedTo() {
      return this.elm.get("talked_to").asBool();
   }
}
