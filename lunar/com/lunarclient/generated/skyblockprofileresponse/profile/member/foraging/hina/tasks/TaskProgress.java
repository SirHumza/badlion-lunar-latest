package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.hina.tasks;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record TaskProgress() {
   @NotNull
   private final BetterJson elm;

   public TaskProgress(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> agathaContestPoints() {
      return this.elm.get("AGATHA_CONTEST_POINTS").asDouble();
   }

   public Optional<Double> catchAzure5() {
      return this.elm.get("CATCH_AZURE_5").asDouble();
   }

   public Optional<Double> catchCod5() {
      return this.elm.get("CATCH_COD_5").asDouble();
   }

   public Optional<Double> catchCoralot5() {
      return this.elm.get("CATCH_CORALOT_5").asDouble();
   }

   public Optional<Double> catchDreadwing3() {
      return this.elm.get("CATCH_DREADWING_3").asDouble();
   }

   public Optional<Double> catchHideonleaf5() {
      return this.elm.get("CATCH_HIDEONLEAF_5").asDouble();
   }

   public Optional<Double> catchInvisibug1() {
      return this.elm.get("CATCH_INVISIBUG_1").asDouble();
   }

   public Optional<Double> catchJoydive10() {
      return this.elm.get("CATCH_JOYDIVE_10").asDouble();
   }

   public Optional<Double> catchLumisquid10() {
      return this.elm.get("CATCH_LUMISQUID_10").asDouble();
   }

   public Optional<Double> catchMossybit5() {
      return this.elm.get("CATCH_MOSSYBIT_5").asDouble();
   }

   public Optional<Double> catchMudworm1() {
      return this.elm.get("CATCH_MUDWORM_1").asDouble();
   }

   public Optional<Double> catchSalmon5() {
      return this.elm.get("CATCH_SALMON_5").asDouble();
   }

   public Optional<Double> catchShellwise10() {
      return this.elm.get("CATCH_SHELLWISE_10").asDouble();
   }

   public Optional<Double> catchSpike10() {
      return this.elm.get("CATCH_SPIKE_10").asDouble();
   }

   public Optional<Double> catchStriderSurfer10() {
      return this.elm.get("CATCH_STRIDER_SURFER_10").asDouble();
   }

   public Optional<Double> catchVerdant5() {
      return this.elm.get("CATCH_VERDANT_5").asDouble();
   }

   public Optional<Double> collect50Berries() {
      return this.elm.get("COLLECT_50_BERRIES").asDouble();
   }

   public Optional<Double> collect50SeaLumies() {
      return this.elm.get("COLLECT_50_SEA_LUMIES").asDouble();
   }

   public Optional<Double> figGifts() {
      return this.elm.get("FIG_GIFTS").asDouble();
   }

   public Optional<Double> fuse5ElementalShards() {
      return this.elm.get("FUSE_5_ELEMENTAL_SHARDS").asDouble();
   }

   public Optional<Double> kill25Drowned() {
      return this.elm.get("KILL_25_DROWNED").asDouble();
   }

   public Optional<Double> killChillshots10() {
      return this.elm.get("KILL_CHILLSHOTS_10").asDouble();
   }

   public Optional<Double> mangroveGifts() {
      return this.elm.get("MANGROVE_GIFTS").asDouble();
   }

   public Optional<Double> obtainShardWithLushlilacBonbon() {
      return this.elm.get("OBTAIN_SHARD_WITH_LUSHLILAC_BONBON").asDouble();
   }

   public Optional<Double> reachSweep() {
      return this.elm.get("REACH_SWEEP").asDouble();
   }

   public Optional<Double> shardFromHuntrap() {
      return this.elm.get("SHARD_FROM_HUNTRAP").asDouble();
   }
}
