package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Dreadfarm() {
   @NotNull
   private final BetterJson elm;

   public Dreadfarm(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<Double> caducousFeederUses() {
      return this.elm.get("caducous_feeder_uses").asListOpt(BetterJson::asDouble);
   }

   public Optional<Double> shaniaStage() {
      return this.elm.get("shania_stage").asDouble();
   }
}
