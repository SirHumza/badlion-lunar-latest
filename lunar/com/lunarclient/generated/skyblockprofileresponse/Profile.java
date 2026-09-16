package com.lunarclient.generated.skyblockprofileresponse;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeMap;
import com.lunarclient.generated.skyblockprofileresponse.profile.Banking;
import com.lunarclient.generated.skyblockprofileresponse.profile.CommunityUpgrades;
import com.lunarclient.generated.skyblockprofileresponse.profile.Member;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Profile() {
   @NotNull
   private final BetterJson elm;

   public Profile(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Banking banking() {
      return new Banking(this.elm.get("banking"));
   }

   public CommunityUpgrades communityUpgrades() {
      return new CommunityUpgrades(this.elm.get("community_upgrades"));
   }

   public Optional<Double> createdAt() {
      return this.elm.get("created_at").asDouble();
   }

   public Optional<String> cuteName() {
      return this.elm.get("cute_name").asString();
   }

   public Optional<String> gameMode() {
      return this.elm.get("game_mode").asString();
   }

   public SafeMap<Member> members() {
      return this.elm.get("members").asMap(Member::new);
   }

   public Optional<String> profileId() {
      return this.elm.get("profile_id").asString();
   }

   public Optional<Boolean> selected() {
      return this.elm.get("selected").asBool();
   }
}
