package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.glaciteplayerdata.CorpsesLooted;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record GlacitePlayerData() {
   @NotNull
   private final BetterJson elm;

   public GlacitePlayerData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public CorpsesLooted corpsesLooted() {
      return new CorpsesLooted(this.elm.get("corpses_looted"));
   }

   public Optional<Double> fossilDust() {
      return this.elm.get("fossil_dust").asDouble();
   }

   public List<String> fossilsDonated() {
      return this.elm.get("fossils_donated").asListOpt(BetterJson::asString);
   }

   public Optional<Double> mineshaftsEntered() {
      return this.elm.get("mineshafts_entered").asDouble();
   }
}
