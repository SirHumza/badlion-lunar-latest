package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PabloQuest() {
   @NotNull
   private final BetterJson elm;

   public PabloQuest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> pabloActive() {
      return this.elm.get("pablo_active").asBool();
   }

   public Optional<String> pabloItem() {
      return this.elm.get("pablo_item").asString();
   }

   public Optional<Double> pabloLastGive() {
      return this.elm.get("pablo_last_give").asDouble();
   }
}
