package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record SirihQuest() {
   @NotNull
   private final BetterJson elm;

   public SirihQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> dialogueIndex() {
      return this.elm.get("dialogue_index").asDouble();
   }

   public Optional<Double> lastGive() {
      return this.elm.get("last_give").asDouble();
   }

   public Optional<Double> sulphurGiven() {
      return this.elm.get("sulphur_given").asDouble();
   }
}
