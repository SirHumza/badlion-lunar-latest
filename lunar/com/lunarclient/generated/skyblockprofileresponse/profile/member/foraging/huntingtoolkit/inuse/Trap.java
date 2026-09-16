package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.huntingtoolkit.inuse;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Trap() {
   @NotNull
   private final BetterJson elm;

   public Trap(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> _0() {
      return this.elm.get("0").asBool();
   }

   public Optional<Boolean> _1() {
      return this.elm.get("1").asBool();
   }

   public Optional<Boolean> _2() {
      return this.elm.get("2").asBool();
   }

   public Optional<Boolean> _3() {
      return this.elm.get("3").asBool();
   }

   public Optional<Boolean> _4() {
      return this.elm.get("4").asBool();
   }
}
