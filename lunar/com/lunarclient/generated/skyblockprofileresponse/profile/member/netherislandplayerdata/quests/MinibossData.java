package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record MinibossData() {
   @NotNull
   private final BetterJson elm;

   public MinibossData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> ashfang() {
      return this.elm.get("ASHFANG").asBool();
   }

   public Optional<Boolean> barbarianDukeX() {
      return this.elm.get("BARBARIAN_DUKE_X").asBool();
   }

   public Optional<Boolean> bladesoul() {
      return this.elm.get("BLADESOUL").asBool();
   }

   public Optional<Boolean> mageOutlaw() {
      return this.elm.get("MAGE_OUTLAW").asBool();
   }

   public Optional<Boolean> magmaBoss() {
      return this.elm.get("MAGMA_BOSS").asBool();
   }
}
