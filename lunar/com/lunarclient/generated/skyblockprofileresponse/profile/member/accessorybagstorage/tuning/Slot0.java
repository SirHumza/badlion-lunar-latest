package com.lunarclient.generated.skyblockprofileresponse.profile.member.accessorybagstorage.tuning;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Slot0() {
   @NotNull
   private final BetterJson elm;

   public Slot0(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> attackSpeed() {
      return this.elm.get("attack_speed").asDouble();
   }

   public Optional<Double> criticalChance() {
      return this.elm.get("critical_chance").asDouble();
   }

   public Optional<Double> criticalDamage() {
      return this.elm.get("critical_damage").asDouble();
   }

   public Optional<Double> defense() {
      return this.elm.get("defense").asDouble();
   }

   public Optional<Double> health() {
      return this.elm.get("health").asDouble();
   }

   public Optional<Double> intelligence() {
      return this.elm.get("intelligence").asDouble();
   }

   public Optional<Double> strength() {
      return this.elm.get("strength").asDouble();
   }

   public Optional<Double> walkSpeed() {
      return this.elm.get("walk_speed").asDouble();
   }
}
