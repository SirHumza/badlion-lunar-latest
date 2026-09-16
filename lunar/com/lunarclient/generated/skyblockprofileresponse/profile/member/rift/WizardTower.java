package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record WizardTower() {
   @NotNull
   private final BetterJson elm;

   public WizardTower(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> crumbsLaidOut() {
      return this.elm.get("crumbs_laid_out").asDouble();
   }

   public Optional<Double> wizardQuestStep() {
      return this.elm.get("wizard_quest_step").asDouble();
   }
}
