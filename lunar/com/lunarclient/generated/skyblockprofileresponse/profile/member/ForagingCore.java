package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ForagingCore() {
   @NotNull
   private final BetterJson elm;

   public ForagingCore(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> currentDailyEffect() {
      return this.elm.get("current_daily_effect").asString();
   }

   public Optional<Double> currentDailyEffectLastChanged() {
      return this.elm.get("current_daily_effect_last_changed").asDouble();
   }

   public Optional<Double> dailyGifts() {
      return this.elm.get("daily_gifts").asDouble();
   }

   public List<String> dailyLogCut() {
      return this.elm.get("daily_log_cut").asListOpt(BetterJson::asString);
   }

   public Optional<Double> dailyLogCutDay() {
      return this.elm.get("daily_log_cut_day").asDouble();
   }

   public Optional<Double> dailyTreesCut() {
      return this.elm.get("daily_trees_cut").asDouble();
   }

   public Optional<Double> dailyTreesCutDay() {
      return this.elm.get("daily_trees_cut_day").asDouble();
   }

   public Optional<Double> forestsWhispers() {
      return this.elm.get("forests_whispers").asDouble();
   }

   public Optional<Double> forestsWhispersSpent() {
      return this.elm.get("forests_whispers_spent").asDouble();
   }
}
