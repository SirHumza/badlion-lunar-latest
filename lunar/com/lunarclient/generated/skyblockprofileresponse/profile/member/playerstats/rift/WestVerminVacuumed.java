package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.rift;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record WestVerminVacuumed() {
   @NotNull
   private final BetterJson elm;

   public WestVerminVacuumed(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> mosquito() {
      return this.elm.get("mosquito").asDouble();
   }

   public Optional<Double> silverfish() {
      return this.elm.get("silverfish").asDouble();
   }

   public Optional<Double> spider() {
      return this.elm.get("spider").asDouble();
   }

   public Optional<Double> total() {
      return this.elm.get("total").asDouble();
   }
}
