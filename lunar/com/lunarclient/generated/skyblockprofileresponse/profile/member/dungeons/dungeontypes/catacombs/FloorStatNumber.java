package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeontypes.catacombs;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record FloorStatNumber() {
   @NotNull
   private final BetterJson elm;

   public FloorStatNumber(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> _0() {
      return this.elm.get("0").asDouble();
   }

   public Optional<Double> _1() {
      return this.elm.get("1").asDouble();
   }

   public Optional<Double> _2() {
      return this.elm.get("2").asDouble();
   }

   public Optional<Double> _3() {
      return this.elm.get("3").asDouble();
   }

   public Optional<Double> _4() {
      return this.elm.get("4").asDouble();
   }

   public Optional<Double> _5() {
      return this.elm.get("5").asDouble();
   }

   public Optional<Double> _6() {
      return this.elm.get("6").asDouble();
   }

   public Optional<Double> _7() {
      return this.elm.get("7").asDouble();
   }

   public Optional<Double> best() {
      return this.elm.get("best").asDouble();
   }

   public Optional<Double> total() {
      return this.elm.get("total").asDouble();
   }
}
