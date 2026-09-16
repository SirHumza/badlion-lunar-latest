package com.lunarclient.generated.skyblockprofileresponse.profile.member.slayer.slayerbosses.slayerstats;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ClaimedLevels() {
   @NotNull
   private final BetterJson elm;

   public ClaimedLevels(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> level1() {
      return this.elm.get("level_1").asBool();
   }

   public Optional<Boolean> level2() {
      return this.elm.get("level_2").asBool();
   }

   public Optional<Boolean> level3() {
      return this.elm.get("level_3").asBool();
   }

   public Optional<Boolean> level4() {
      return this.elm.get("level_4").asBool();
   }

   public Optional<Boolean> level5() {
      return this.elm.get("level_5").asBool();
   }

   public Optional<Boolean> level6() {
      return this.elm.get("level_6").asBool();
   }

   public Optional<Boolean> level7() {
      return this.elm.get("level_7").asBool();
   }

   public Optional<Boolean> level7Special() {
      return this.elm.get("level_7_special").asBool();
   }

   public Optional<Boolean> level8() {
      return this.elm.get("level_8").asBool();
   }

   public Optional<Boolean> level8Special() {
      return this.elm.get("level_8_special").asBool();
   }

   public Optional<Boolean> level9() {
      return this.elm.get("level_9").asBool();
   }

   public Optional<Boolean> level9Special() {
      return this.elm.get("level_9_special").asBool();
   }
}
