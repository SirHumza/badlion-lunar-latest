package com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record RabbitHitmen() {
   @NotNull
   private final BetterJson elm;

   public RabbitHitmen(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> eggSlotCooldownMark() {
      return this.elm.get("egg_slot_cooldown_mark").asDouble();
   }

   public Optional<Double> eggSlotCooldownSum() {
      return this.elm.get("egg_slot_cooldown_sum").asDouble();
   }

   public Optional<Double> missedUncollectedEggs() {
      return this.elm.get("missed_uncollected_eggs").asDouble();
   }

   public Optional<Double> rabbitHitmenSlots() {
      return this.elm.get("rabbit_hitmen_slots").asDouble();
   }
}
