package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage.crazykloon;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record SelectedColors() {
   @NotNull
   private final BetterJson elm;

   public SelectedColors(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> eight() {
      return this.elm.get("eight").asString();
   }

   public Optional<String> five() {
      return this.elm.get("five").asString();
   }

   public Optional<String> four() {
      return this.elm.get("four").asString();
   }

   public Optional<String> one() {
      return this.elm.get("one").asString();
   }

   public Optional<String> seven() {
      return this.elm.get("seven").asString();
   }

   public Optional<String> six() {
      return this.elm.get("six").asString();
   }

   public Optional<String> three() {
      return this.elm.get("three").asString();
   }

   public Optional<String> two() {
      return this.elm.get("two").asString();
   }
}
