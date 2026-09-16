package com.lunarclient.generated.skyblockprofileresponse.profile.member.glaciteplayerdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record CorpsesLooted() {
   @NotNull
   private final BetterJson elm;

   public CorpsesLooted(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> lapis() {
      return this.elm.get("lapis").asDouble();
   }

   public Optional<Double> tungsten() {
      return this.elm.get("tungsten").asDouble();
   }

   public Optional<Double> umber() {
      return this.elm.get("umber").asDouble();
   }

   public Optional<Double> vanguard() {
      return this.elm.get("vanguard").asDouble();
   }
}
