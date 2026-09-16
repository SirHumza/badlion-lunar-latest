package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeontypes.Catacombs;
import org.jetbrains.annotations.NotNull;

public record DungeonTypes() {
   @NotNull
   private final BetterJson elm;

   public DungeonTypes(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Catacombs catacombs() {
      return new Catacombs(this.elm.get("catacombs"));
   }

   public Catacombs masterCatacombs() {
      return new Catacombs(this.elm.get("master_catacombs"));
   }
}
