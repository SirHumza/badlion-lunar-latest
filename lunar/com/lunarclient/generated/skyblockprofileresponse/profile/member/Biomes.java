package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.Biomes;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.Crystals;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.Nodes;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record MiningCore() {
   @NotNull
   private final BetterJson elm;

   public MiningCore(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Biomes biomes() {
      return new Biomes(this.elm.get("biomes"));
   }

   public Crystals crystals() {
      return new Crystals(this.elm.get("crystals"));
   }

   public Optional<String> currentDailyEffect() {
      return this.elm.get("current_daily_effect").asString();
   }

   public Optional<Double> currentDailyEffectLastChanged() {
      return this.elm.get("current_daily_effect_last_changed").asDouble();
   }

   public Optional<Double> dailyOresMined() {
      return this.elm.get("daily_ores_mined").asDouble();
   }

   public Optional<Double> dailyOresMinedDay() {
      return this.elm.get("daily_ores_mined_day").asDouble();
   }

   public Optional<Double> dailyOresMinedDayGemstone() {
      return this.elm.get("daily_ores_mined_day_gemstone").asDouble();
   }

   public Optional<Double> dailyOresMinedDayGlacite() {
      return this.elm.get("daily_ores_mined_day_glacite").asDouble();
   }

   public Optional<Double> dailyOresMinedDayMithrilOre() {
      return this.elm.get("daily_ores_mined_day_mithril_ore").asDouble();
   }

   public Optional<Double> dailyOresMinedGemstone() {
      return this.elm.get("daily_ores_mined_gemstone").asDouble();
   }

   public Optional<Double> dailyOresMinedGlacite() {
      return this.elm.get("daily_ores_mined_glacite").asDouble();
   }

   public Optional<Double> dailyOresMinedMithrilOre() {
      return this.elm.get("daily_ores_mined_mithril_ore").asDouble();
   }

   public Optional<Double> experience() {
      return this.elm.get("experience").asDouble();
   }

   public Optional<Double> greaterMinesLastAccess() {
      return this.elm.get("greater_mines_last_access").asDouble();
   }

   public Optional<Boolean> hotmMigratorTreeResetSendMessage() {
      return this.elm.get("hotm_migrator_tree_reset_send_message").asBool();
   }

   public Optional<Double> lastReset() {
      return this.elm.get("last_reset").asDouble();
   }

   public Nodes nodes() {
      return new Nodes(this.elm.get("nodes"));
   }

   public Optional<Double> powderGemstone() {
      return this.elm.get("powder_gemstone").asDouble();
   }

   public Optional<Double> powderGemstoneTotal() {
      return this.elm.get("powder_gemstone_total").asDouble();
   }

   public Optional<Double> powderGlacite() {
      return this.elm.get("powder_glacite").asDouble();
   }

   public Optional<Double> powderGlaciteTotal() {
      return this.elm.get("powder_glacite_total").asDouble();
   }

   public Optional<Double> powderMithril() {
      return this.elm.get("powder_mithril").asDouble();
   }

   public Optional<Double> powderMithrilTotal() {
      return this.elm.get("powder_mithril_total").asDouble();
   }

   public Optional<Double> powderSpentGemstone() {
      return this.elm.get("powder_spent_gemstone").asDouble();
   }

   public Optional<Double> powderSpentGlacite() {
      return this.elm.get("powder_spent_glacite").asDouble();
   }

   public Optional<Double> powderSpentMithril() {
      return this.elm.get("powder_spent_mithril").asDouble();
   }

   public Optional<Boolean> receivedFreeTier() {
      return this.elm.get("received_free_tier").asBool();
   }

   public Optional<Boolean> retroactiveTier2Token() {
      return this.elm.get("retroactive_tier2_token").asBool();
   }

   public Optional<String> selectedPickaxeAbility() {
      return this.elm.get("selected_pickaxe_ability").asString();
   }

   public Optional<Boolean> stashIfFullNotification() {
      return this.elm.get("stash_if_full_notification").asBool();
   }

   public Optional<Double> tokens() {
      return this.elm.get("tokens").asDouble();
   }

   public Optional<Double> tokensSpent() {
      return this.elm.get("tokens_spent").asDouble();
   }
}
