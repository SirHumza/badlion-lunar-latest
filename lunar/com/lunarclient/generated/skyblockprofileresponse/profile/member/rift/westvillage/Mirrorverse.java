package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Mirrorverse() {
   @NotNull
   private final BetterJson elm;

   public Mirrorverse(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> claimedChestItems() {
      return this.elm.get("claimed_chest_items").asListOpt(BetterJson::asString);
   }

   public Optional<Boolean> claimedReward() {
      return this.elm.get("claimed_reward").asBool();
   }

   public Optional<Boolean> upsideDownHard() {
      return this.elm.get("upside_down_hard").asBool();
   }

   public List<String> visitedRooms() {
      return this.elm.get("visited_rooms").asListOpt(BetterJson::asString);
   }
}
