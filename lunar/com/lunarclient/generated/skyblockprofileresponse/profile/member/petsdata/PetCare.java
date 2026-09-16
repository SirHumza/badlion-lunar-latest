package com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PetCare() {
   @NotNull
   private final BetterJson elm;

   public PetCare(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> coinsSpent() {
      return this.elm.get("coins_spent").asDouble();
   }

   public List<String> petTypesSacrificed() {
      return this.elm.get("pet_types_sacrificed").asListOpt(BetterJson::asString);
   }
}
