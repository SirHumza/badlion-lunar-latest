package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.playerclasses.PlayerClassInfo;
import org.jetbrains.annotations.NotNull;

public record PlayerClasses() {
   @NotNull
   private final BetterJson elm;

   public PlayerClasses(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public PlayerClassInfo archer() {
      return new PlayerClassInfo(this.elm.get("archer"));
   }

   public PlayerClassInfo berserk() {
      return new PlayerClassInfo(this.elm.get("berserk"));
   }

   public PlayerClassInfo healer() {
      return new PlayerClassInfo(this.elm.get("healer"));
   }

   public PlayerClassInfo mage() {
      return new PlayerClassInfo(this.elm.get("mage"));
   }

   public PlayerClassInfo tank() {
      return new PlayerClassInfo(this.elm.get("tank"));
   }
}
