package com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerdata.pausedeffect.Modifier;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PausedEffect() {
   @NotNull
   private final BetterJson elm;

   public PausedEffect(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> effect() {
      return this.elm.get("effect").asString();
   }

   public Optional<Double> flags() {
      return this.elm.get("flags").asDouble();
   }

   public Optional<Boolean> infinite() {
      return this.elm.get("infinite").asBool();
   }

   public Optional<Double> level() {
      return this.elm.get("level").asDouble();
   }

   public SafeList<Modifier> modifiers() {
      return this.elm.get("modifiers").asList(Modifier::new);
   }

   public Optional<Double> ticksRemaining() {
      return this.elm.get("ticks_remaining").asDouble();
   }
}
