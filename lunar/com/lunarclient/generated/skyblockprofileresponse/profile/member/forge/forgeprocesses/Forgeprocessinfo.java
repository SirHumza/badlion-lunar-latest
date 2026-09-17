package com.lunarclient.generated.skyblockprofileresponse.profile.member.forge.forgeprocesses;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.forge.forgeprocesses.forgeprocess.ForgeProcessInfo;
import org.jetbrains.annotations.NotNull;

public record ForgeProcess() {
   @NotNull
   private final BetterJson elm;

   public ForgeProcess(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public ForgeProcessInfo _1() {
      return new ForgeProcessInfo(this.elm.get("1"));
   }

   public ForgeProcessInfo _2() {
      return new ForgeProcessInfo(this.elm.get("2"));
   }

   public ForgeProcessInfo _3() {
      return new ForgeProcessInfo(this.elm.get("3"));
   }

   public ForgeProcessInfo _4() {
      return new ForgeProcessInfo(this.elm.get("4"));
   }

   public ForgeProcessInfo _5() {
      return new ForgeProcessInfo(this.elm.get("5"));
   }

   public ForgeProcessInfo _6() {
      return new ForgeProcessInfo(this.elm.get("6"));
   }

   public ForgeProcessInfo _7() {
      return new ForgeProcessInfo(this.elm.get("7"));
   }
}
