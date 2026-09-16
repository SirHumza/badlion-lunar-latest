package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.shards.Owned;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.shards.Traps;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Shards() {
   @NotNull
   private final BetterJson elm;

   public Shards(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> fused() {
      return this.elm.get("fused").asDouble();
   }

   public Optional<String> fusionResultSort() {
      return this.elm.get("fusion_result_sort").asString();
   }

   public Optional<String> fusionSort() {
      return this.elm.get("fusion_sort").asString();
   }

   public SafeList<Owned> owned() {
      return this.elm.get("owned").asList(Owned::new);
   }

   public Optional<String> shardSort() {
      return this.elm.get("shard_sort").asString();
   }

   public Traps traps() {
      return new Traps(this.elm.get("traps"));
   }
}
