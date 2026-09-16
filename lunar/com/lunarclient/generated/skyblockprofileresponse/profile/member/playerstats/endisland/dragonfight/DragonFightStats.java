package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.endisland.dragonfight;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record DragonFightStats() {
   @NotNull
   private final BetterJson elm;

   public DragonFightStats(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> best() {
      return this.elm.get("best").asDouble();
   }

   public Optional<Double> old() {
      return this.elm.get("old").asDouble();
   }

   public Optional<Double> protector() {
      return this.elm.get("protector").asDouble();
   }

   public Optional<Double> strong() {
      return this.elm.get("strong").asDouble();
   }

   public Optional<Double> superior() {
      return this.elm.get("superior").asDouble();
   }

   public Optional<Double> total() {
      return this.elm.get("total").asDouble();
   }

   public Optional<Double> unstable() {
      return this.elm.get("unstable").asDouble();
   }

   public Optional<Double> wise() {
      return this.elm.get("wise").asDouble();
   }

   public Optional<Double> young() {
      return this.elm.get("young").asDouble();
   }
}
