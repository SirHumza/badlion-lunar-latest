package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record NpcPath() {
   @NotNull
   private final BetterJson elm;

   public NpcPath(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> npcId() {
      return this.elm.get("npc_id").asString();
   }

   public Optional<String> pathId() {
      return this.elm.get("path_id").asString();
   }

   public Optional<Double> pathIndex() {
      return this.elm.get("path_index").asDouble();
   }

   public Optional<String> skin() {
      return this.elm.get("skin").asString();
   }
}
