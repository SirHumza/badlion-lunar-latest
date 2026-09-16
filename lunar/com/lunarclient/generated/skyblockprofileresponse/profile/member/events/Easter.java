package com.lunarclient.generated.skyblockprofileresponse.profile.member.events;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter.Employees;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter.RabbitHitmen;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter.Rabbits;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter.Shop;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter.TimeTower;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Easter() {
   @NotNull
   private final BetterJson elm;

   public Easter(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> chocolate() {
      return this.elm.get("chocolate").asDouble();
   }

   public Optional<Double> chocolateLevel() {
      return this.elm.get("chocolate_level").asDouble();
   }

   public Optional<Double> chocolateMultiplierUpgrades() {
      return this.elm.get("chocolate_multiplier_upgrades").asDouble();
   }

   public Optional<Double> chocolateSincePrestige() {
      return this.elm.get("chocolate_since_prestige").asDouble();
   }

   public Optional<Double> clickUpgrades() {
      return this.elm.get("click_upgrades").asDouble();
   }

   public Optional<Double> elDoradoProgress() {
      return this.elm.get("el_dorado_progress").asDouble();
   }

   public Employees employees() {
      return new Employees(this.elm.get("employees"));
   }

   public Optional<Double> goldenClickAmount() {
      return this.elm.get("golden_click_amount").asDouble();
   }

   public Optional<Double> goldenClickYear() {
      return this.elm.get("golden_click_year").asDouble();
   }

   public Optional<Double> lastViewedChocolateFactory() {
      return this.elm.get("last_viewed_chocolate_factory").asDouble();
   }

   public Optional<Double> rabbitBarnCapacityLevel() {
      return this.elm.get("rabbit_barn_capacity_level").asDouble();
   }

   public Optional<String> rabbitFilter() {
      return this.elm.get("rabbit_filter").asString();
   }

   public RabbitHitmen rabbitHitmen() {
      return new RabbitHitmen(this.elm.get("rabbit_hitmen"));
   }

   public Optional<String> rabbitHotspotFiler() {
      return this.elm.get("rabbit_hotspot_filer").asString();
   }

   public Optional<Double> rabbitRarityUpgrades() {
      return this.elm.get("rabbit_rarity_upgrades").asDouble();
   }

   public Optional<String> rabbitSort() {
      return this.elm.get("rabbit_sort").asString();
   }

   public Rabbits rabbits() {
      return new Rabbits(this.elm.get("rabbits"));
   }

   public Optional<Double> refinedDarkCacaoTruffles() {
      return this.elm.get("refined_dark_cacao_truffles").asDouble();
   }

   public Shop shop() {
      return new Shop(this.elm.get("shop"));
   }

   public Optional<Double> supremeChocolateBars() {
      return this.elm.get("supreme_chocolate_bars").asDouble();
   }

   public TimeTower timeTower() {
      return new TimeTower(this.elm.get("time_tower"));
   }

   public Optional<Double> totalChocolate() {
      return this.elm.get("total_chocolate").asDouble();
   }
}
