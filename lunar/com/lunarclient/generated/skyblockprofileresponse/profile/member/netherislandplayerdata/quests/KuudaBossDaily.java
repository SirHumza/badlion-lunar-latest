package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record KuudaBossDaily() {
   @NotNull
   private final BetterJson elm;

   public KuudaBossDaily(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> burning() {
      return this.elm.get("BURNING").asBool();
   }

   public Optional<Boolean> fiery() {
      return this.elm.get("FIERY").asBool();
   }

   public Optional<Boolean> hot() {
      return this.elm.get("HOT").asBool();
   }

   public Optional<Boolean> infernal() {
      return this.elm.get("INFERNAL").asBool();
   }

   public Optional<Boolean> none() {
      return this.elm.get("NONE").asBool();
   }
}
