package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.FarmingToolkit;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record GardenPlayerData() {
   @NotNull
   private final BetterJson elm;

   public GardenPlayerData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> analyzedGreenhouseCrops() {
      return this.elm.get("analyzed_greenhouse_crops").asListOpt(BetterJson::asString);
   }

   public Optional<Double> copper() {
      return this.elm.get("copper").asDouble();
   }

   public List<String> discoveredGreenhouseCrops() {
      return this.elm.get("discovered_greenhouse_crops").asListOpt(BetterJson::asString);
   }

   public FarmingToolkit farmingToolkit() {
      return new FarmingToolkit(this.elm.get("farming_toolkit"));
   }

   public Optional<Double> larvaConsumed() {
      return this.elm.get("larva_consumed").asDouble();
   }
}
