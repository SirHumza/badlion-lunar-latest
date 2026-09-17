package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage.crazykloon.SelectedColors;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record CrazyKloon() {
   @NotNull
   private final BetterJson elm;

   public CrazyKloon(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> hackedTerminals() {
      return this.elm.get("hacked_terminals").asListOpt(BetterJson::asString);
   }

   public Optional<Boolean> questComplete() {
      return this.elm.get("quest_complete").asBool();
   }

   public SelectedColors selectedColors() {
      return new SelectedColors(this.elm.get("selected_colors"));
   }

   public Optional<Boolean> talked() {
      return this.elm.get("talked").asBool();
   }
}
