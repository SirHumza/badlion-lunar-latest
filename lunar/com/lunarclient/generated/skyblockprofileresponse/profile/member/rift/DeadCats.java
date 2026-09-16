package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.deadcats.Montezuma;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record DeadCats() {
   @NotNull
   private final BetterJson elm;

   public DeadCats(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> foundCats() {
      return this.elm.get("found_cats").asListOpt(BetterJson::asString);
   }

   public Montezuma montezuma() {
      return new Montezuma(this.elm.get("montezuma"));
   }

   public Optional<Boolean> pickedUpDetector() {
      return this.elm.get("picked_up_detector").asBool();
   }

   public Optional<Boolean> talkedToJacquelle() {
      return this.elm.get("talked_to_jacquelle").asBool();
   }

   public Optional<Boolean> unlockedPet() {
      return this.elm.get("unlocked_pet").asBool();
   }
}
