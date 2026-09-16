package com.lunarclient.generated.skyblockprofileresponse.profile.member.shards.traps;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ActiveTrap() {
   @NotNull
   private final BetterJson elm;

   public ActiveTrap(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> captureTime() {
      return this.elm.get("capture_time").asDouble();
   }

   public Optional<Boolean> captured() {
      return this.elm.get("captured").asBool();
   }

   public Optional<Boolean> huntingToolkit() {
      return this.elm.get("hunting_toolkit").asBool();
   }

   public Optional<Double> huntingToolkitIndex() {
      return this.elm.get("hunting_toolkit_index").asDouble();
   }

   public Optional<String> location() {
      return this.elm.get("location").asString();
   }

   public Optional<String> mode() {
      return this.elm.get("mode").asString();
   }

   public Optional<Boolean> museum() {
      return this.elm.get("museum").asBool();
   }

   public Optional<Double> placedAt() {
      return this.elm.get("placed_at").asDouble();
   }

   public Optional<String> shard() {
      return this.elm.get("shard").asString();
   }

   public Optional<String> trapItem() {
      return this.elm.get("trap_item").asString();
   }

   public Optional<String> uuid() {
      return this.elm.get("uuid").asString();
   }
}
