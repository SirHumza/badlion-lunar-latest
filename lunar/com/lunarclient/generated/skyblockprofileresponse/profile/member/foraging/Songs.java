package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.songs.Harp;
import org.jetbrains.annotations.NotNull;

public record Songs() {
   @NotNull
   private final BetterJson elm;

   public Songs(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Harp harp() {
      return new Harp(this.elm.get("harp"));
   }
}
