package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Glyphs() {
   @NotNull
   private final BetterJson elm;

   public Glyphs(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> claimedBracelet() {
      return this.elm.get("claimed_bracelet").asBool();
   }

   public Optional<Boolean> claimedWand() {
      return this.elm.get("claimed_wand").asBool();
   }

   public Optional<Boolean> completed() {
      return this.elm.get("completed").asBool();
   }

   public Optional<Double> currentGlyph() {
      return this.elm.get("current_glyph").asDouble();
   }

   public Optional<Boolean> currentGlyphCompleted() {
      return this.elm.get("current_glyph_completed").asBool();
   }

   public Optional<Boolean> currentGlyphDelivered() {
      return this.elm.get("current_glyph_delivered").asBool();
   }
}
