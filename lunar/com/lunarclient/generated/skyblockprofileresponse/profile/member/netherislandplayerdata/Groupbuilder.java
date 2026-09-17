package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.kuudrapartyfinder.GroupBuilder;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.kuudrapartyfinder.SearchSettings;
import org.jetbrains.annotations.NotNull;

public record KuudraPartyFinder() {
   @NotNull
   private final BetterJson elm;

   public KuudraPartyFinder(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public GroupBuilder groupBuilder() {
      return new GroupBuilder(this.elm.get("group_builder"));
   }

   public SearchSettings searchSettings() {
      return new SearchSettings(this.elm.get("search_settings"));
   }
}
