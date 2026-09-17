package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree.Experience;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree.LastReset;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree.Nodes;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree.SelectedAbility;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.skilltree.TokensSpent;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record SkillTree() {
   @NotNull
   private final BetterJson elm;

   public SkillTree(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Experience experience() {
      return new Experience(this.elm.get("experience"));
   }

   public LastReset lastReset() {
      return new LastReset(this.elm.get("last_reset"));
   }

   public Nodes nodes() {
      return new Nodes(this.elm.get("nodes"));
   }

   public Optional<Boolean> refundAbilityFree() {
      return this.elm.get("refund_ability_free").asBool();
   }

   public SelectedAbility selectedAbility() {
      return new SelectedAbility(this.elm.get("selected_ability"));
   }

   public TokensSpent tokensSpent() {
      return new TokensSpent(this.elm.get("tokens_spent"));
   }
}
