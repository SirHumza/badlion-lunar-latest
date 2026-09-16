package com.lunarclient.generated.skyblockprofileresponse.profile.member.miningcore.biomes;

import com.lunarclient.BetterJson;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Precursor() {
   @NotNull
   private final BetterJson elm;

   public Precursor(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> claimingWithPrecursorApparatus() {
      return this.elm.get("claiming_with_precursor_apparatus").asBool();
   }

   public List<String> partsDelivered() {
      return this.elm.get("parts_delivered").asListOpt(BetterJson::asString);
   }

   public Optional<Boolean> professorBlindAsAMolePerk() {
      return this.elm.get("professor_blind_as_a_mole_perk").asBool();
   }

   public Optional<Boolean> talkedToProfessor() {
      return this.elm.get("talked_to_professor").asBool();
   }
}
