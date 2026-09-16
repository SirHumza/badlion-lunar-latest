package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.abiphone;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Games() {
   @NotNull
   private final BetterJson elm;

   public Games(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> snakeBestScore() {
      return this.elm.get("snake_best_score").asDouble();
   }

   public Optional<Double> ticTacToeDraws() {
      return this.elm.get("tic_tac_toe_draws").asDouble();
   }

   public Optional<Double> ticTacToeLosses() {
      return this.elm.get("tic_tac_toe_losses").asDouble();
   }
}
