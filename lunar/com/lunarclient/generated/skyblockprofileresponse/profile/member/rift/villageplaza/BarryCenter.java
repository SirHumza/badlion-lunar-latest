package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record BarryCenter() {
   @NotNull
   private final BetterJson elm;

   public BarryCenter(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> convinced() {
      return this.elm.get("convinced").asListOpt(BetterJson::asString);
   }

   public Optional<String> engaged() {
      return this.elm.get("engaged").asString();
   }

   public Optional<Boolean> firstTalkToBarry() {
      return this.elm.get("first_talk_to_barry").asBool();
   }

   public Optional<Boolean> receivedReward() {
      return this.elm.get("received_reward").asBool();
   }

   public Optional<Boolean> talkedWithBarry() {
      return this.elm.get("talked_with_barry").asBool();
   }
}
