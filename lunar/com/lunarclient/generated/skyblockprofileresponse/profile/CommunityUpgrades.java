package com.lunarclient.generated.skyblockprofileresponse.profile;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.communityupgrades.CurrentlyUpgrading;
import com.lunarclient.generated.skyblockprofileresponse.profile.communityupgrades.UpgradeState;
import org.jetbrains.annotations.NotNull;

public record CommunityUpgrades() {
   @NotNull
   private final BetterJson elm;

   public CommunityUpgrades(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public CurrentlyUpgrading currentlyUpgrading() {
      return new CurrentlyUpgrading(this.elm.get("currently_upgrading"));
   }

   public SafeList<UpgradeState> upgradeStates() {
      return this.elm.get("upgrade_states").asList(UpgradeState::new);
   }
}
