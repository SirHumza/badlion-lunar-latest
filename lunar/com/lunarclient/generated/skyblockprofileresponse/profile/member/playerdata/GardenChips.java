package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record GardenChips() {
   @NotNull
   private final BetterJson elm;

   public GardenChips(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> cropshot() {
      return this.elm.get("cropshot").asDouble();
   }

   public Optional<Double> evergreen() {
      return this.elm.get("evergreen").asDouble();
   }

   public Optional<Double> hypercharge() {
      return this.elm.get("hypercharge").asDouble();
   }

   public Optional<Double> mechamind() {
      return this.elm.get("mechamind").asDouble();
   }

   public Optional<Double> overdrive() {
      return this.elm.get("overdrive").asDouble();
   }

   public Optional<Double> quickdraw() {
      return this.elm.get("quickdraw").asDouble();
   }

   public Optional<Double> rarefinder() {
      return this.elm.get("rarefinder").asDouble();
   }

   public Optional<Double> sowledge() {
      return this.elm.get("sowledge").asDouble();
   }

   public Optional<Double> synthesis() {
      return this.elm.get("synthesis").asDouble();
   }

   public Optional<Double> verminVaporizer() {
      return this.elm.get("vermin_vaporizer").asDouble();
   }
}
