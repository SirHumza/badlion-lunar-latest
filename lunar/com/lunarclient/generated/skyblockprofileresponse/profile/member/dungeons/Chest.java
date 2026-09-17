package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.treasures.Chest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.treasures.Run;
import org.jetbrains.annotations.NotNull;

public record Treasures() {
   @NotNull
   private final BetterJson elm;

   public Treasures(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public SafeList<Chest> chests() {
      return this.elm.get("chests").asList(Chest::new);
   }

   public SafeList<Run> runs() {
      return this.elm.get("runs").asList(Run::new);
   }
}
