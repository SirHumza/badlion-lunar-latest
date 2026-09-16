package com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Employees() {
   @NotNull
   private final BetterJson elm;

   public Employees(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> rabbitBro() {
      return this.elm.get("rabbit_bro").asDouble();
   }

   public Optional<Double> rabbitCousin() {
      return this.elm.get("rabbit_cousin").asDouble();
   }

   public Optional<Double> rabbitDog() {
      return this.elm.get("rabbit_dog").asDouble();
   }

   public Optional<Double> rabbitFather() {
      return this.elm.get("rabbit_father").asDouble();
   }

   public Optional<Double> rabbitGrandma() {
      return this.elm.get("rabbit_grandma").asDouble();
   }

   public Optional<Double> rabbitSis() {
      return this.elm.get("rabbit_sis").asDouble();
   }

   public Optional<Double> rabbitUncle() {
      return this.elm.get("rabbit_uncle").asDouble();
   }
}
