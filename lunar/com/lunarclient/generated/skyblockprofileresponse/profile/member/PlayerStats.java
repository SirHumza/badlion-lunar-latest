package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.google.gson.JsonObject;
import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.Auctions;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.EndIsland;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.Gifts;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.ItemsFished;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.Mythos;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.Pets;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.Races;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.ShredderRod;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.Spooky;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.Winter;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PlayerStats() {
   @NotNull
   private final BetterJson elm;

   public PlayerStats(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Auctions auctions() {
      return new Auctions(this.elm.get("auctions"));
   }

   public Optional<JsonObject> candyCollected() {
      return this.elm.get("candy_collected").asJsonObject();
   }

   public Optional<Double> cropsMined() {
      return this.elm.get("crops_mined").asDouble();
   }

   public Map<String, Double> deaths() {
      return this.elm.get("deaths").asMapOpt(BetterJson::asDouble);
   }

   public EndIsland endIsland() {
      return new EndIsland(this.elm.get("end_island"));
   }

   public Gifts gifts() {
      return new Gifts(this.elm.get("gifts"));
   }

   public Optional<Double> glowingMushroomsBroken() {
      return this.elm.get("glowing_mushrooms_broken").asDouble();
   }

   public Optional<Double> highestCriticalDamage() {
      return this.elm.get("highest_critical_damage").asDouble();
   }

   public Optional<Double> highestDamage() {
      return this.elm.get("highest_damage").asDouble();
   }

   public ItemsFished itemsFished() {
      return new ItemsFished(this.elm.get("items_fished"));
   }

   public Map<String, Double> kills() {
      return this.elm.get("kills").asMapOpt(BetterJson::asDouble);
   }

   public Mythos mythos() {
      return new Mythos(this.elm.get("mythos"));
   }

   public Pets pets() {
      return new Pets(this.elm.get("pets"));
   }

   public Races races() {
      return new Races(this.elm.get("races"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.Rift rift() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.playerstats.Rift(this.elm.get("rift"));
   }

   public Optional<Double> seaCreatureKills() {
      return this.elm.get("sea_creature_kills").asDouble();
   }

   public Optional<Double> shardCombatHunts() {
      return this.elm.get("shard_combat_hunts").asDouble();
   }

   public Optional<Double> shardFishingHunts() {
      return this.elm.get("shard_fishing_hunts").asDouble();
   }

   public Optional<Double> shardForestHunts() {
      return this.elm.get("shard_forest_hunts").asDouble();
   }

   public Optional<Double> shardSaltHunts() {
      return this.elm.get("shard_salt_hunts").asDouble();
   }

   public Optional<Double> shardTrapHunts() {
      return this.elm.get("shard_trap_hunts").asDouble();
   }

   public ShredderRod shredderRod() {
      return new ShredderRod(this.elm.get("shredder_rod"));
   }

   public Spooky spooky() {
      return new Spooky(this.elm.get("spooky"));
   }

   public Optional<Double> uniqueShards() {
      return this.elm.get("unique_shards").asDouble();
   }

   public Winter winter() {
      return new Winter(this.elm.get("winter"));
   }
}
