package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Dojo() {
   @NotNull
   private final BetterJson elm;

   public Dojo(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> dojoPointsArcher() {
      return this.elm.get("dojo_points_archer").asDouble();
   }

   public Optional<Double> dojoPointsFireball() {
      return this.elm.get("dojo_points_fireball").asDouble();
   }

   public Optional<Double> dojoPointsLockHead() {
      return this.elm.get("dojo_points_lock_head").asDouble();
   }

   public Optional<Double> dojoPointsMobKb() {
      return this.elm.get("dojo_points_mob_kb").asDouble();
   }

   public Optional<Double> dojoPointsSnake() {
      return this.elm.get("dojo_points_snake").asDouble();
   }

   public Optional<Double> dojoPointsSwordSwap() {
      return this.elm.get("dojo_points_sword_swap").asDouble();
   }

   public Optional<Double> dojoPointsWallJump() {
      return this.elm.get("dojo_points_wall_jump").asDouble();
   }

   public Optional<Double> dojoTimeArcher() {
      return this.elm.get("dojo_time_archer").asDouble();
   }

   public Optional<Double> dojoTimeFireball() {
      return this.elm.get("dojo_time_fireball").asDouble();
   }

   public Optional<Double> dojoTimeLockHead() {
      return this.elm.get("dojo_time_lock_head").asDouble();
   }

   public Optional<Double> dojoTimeMobKb() {
      return this.elm.get("dojo_time_mob_kb").asDouble();
   }

   public Optional<Double> dojoTimeSnake() {
      return this.elm.get("dojo_time_snake").asDouble();
   }

   public Optional<Double> dojoTimeSwordSwap() {
      return this.elm.get("dojo_time_sword_swap").asDouble();
   }

   public Optional<Double> dojoTimeWallJump() {
      return this.elm.get("dojo_time_wall_jump").asDouble();
   }
}
