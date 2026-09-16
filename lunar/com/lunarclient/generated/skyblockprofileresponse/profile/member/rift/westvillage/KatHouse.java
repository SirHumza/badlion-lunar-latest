package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record KatHouse() {
   @NotNull
   private final BetterJson elm;

   public KatHouse(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> binCollectedMosquito() {
      return this.elm.get("bin_collected_mosquito").asDouble();
   }

   public Optional<Double> binCollectedSilverfish() {
      return this.elm.get("bin_collected_silverfish").asDouble();
   }

   public Optional<Double> binCollectedSpider() {
      return this.elm.get("bin_collected_spider").asDouble();
   }
}
