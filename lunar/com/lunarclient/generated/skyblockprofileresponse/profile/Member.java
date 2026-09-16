package com.lunarclient.generated.skyblockprofileresponse.profile;

import com.google.gson.JsonElement;
import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.AccessoryBagStorage;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Attributes;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Bestiary;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Currencies;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Dungeons;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Events;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Experimentation;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.FairySoul;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Foraging;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.ForagingCore;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Forge;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.GardenPlayerData;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.GlacitePlayerData;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Inventory;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.ItemData;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.JacobsContest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Leveling;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.MemberProfile;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.MiningCore;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.NetherIslandPlayerData;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.PetsData;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.PlayerData;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.PlayerStats;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Quests;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Rift;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Shards;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.SharedInventory;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.SkillTree;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Slayer;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.Temples;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.TrophyFish;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.WinterPlayerData;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Member() {
   @NotNull
   private final BetterJson elm;

   public Member(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public AccessoryBagStorage accessoryBagStorage() {
      return new AccessoryBagStorage(this.elm.get("accessory_bag_storage"));
   }

   public Attributes attributes() {
      return new Attributes(this.elm.get("attributes"));
   }

   public Bestiary bestiary() {
      return new Bestiary(this.elm.get("bestiary"));
   }

   public Map<String, Double> collection() {
      return this.elm.get("collection").asMapOpt(BetterJson::asDouble);
   }

   public Currencies currencies() {
      return new Currencies(this.elm.get("currencies"));
   }

   public Dungeons dungeons() {
      return new Dungeons(this.elm.get("dungeons"));
   }

   public Events events() {
      return new Events(this.elm.get("events"));
   }

   public Experimentation experimentation() {
      return new Experimentation(this.elm.get("experimentation"));
   }

   public FairySoul fairySoul() {
      return new FairySoul(this.elm.get("fairy_soul"));
   }

   public Foraging foraging() {
      return new Foraging(this.elm.get("foraging"));
   }

   public ForagingCore foragingCore() {
      return new ForagingCore(this.elm.get("foraging_core"));
   }

   public Forge forge() {
      return new Forge(this.elm.get("forge"));
   }

   public GardenPlayerData gardenPlayerData() {
      return new GardenPlayerData(this.elm.get("garden_player_data"));
   }

   public GlacitePlayerData glacitePlayerData() {
      return new GlacitePlayerData(this.elm.get("glacite_player_data"));
   }

   public Inventory inventory() {
      return new Inventory(this.elm.get("inventory"));
   }

   public ItemData itemData() {
      return new ItemData(this.elm.get("item_data"));
   }

   public JacobsContest jacobsContest() {
      return new JacobsContest(this.elm.get("jacobs_contest"));
   }

   public Leveling leveling() {
      return new Leveling(this.elm.get("leveling"));
   }

   public MiningCore miningCore() {
      return new MiningCore(this.elm.get("mining_core"));
   }

   public NetherIslandPlayerData netherIslandPlayerData() {
      return new NetherIslandPlayerData(this.elm.get("nether_island_player_data"));
   }

   public Map<String, JsonElement> objectives() {
      return this.elm.get("objectives").asMapOpt(BetterJson::asJsonElement);
   }

   public PetsData petsData() {
      return new PetsData(this.elm.get("pets_data"));
   }

   public PlayerData playerData() {
      return new PlayerData(this.elm.get("player_data"));
   }

   public Optional<String> playerId() {
      return this.elm.get("player_id").asString();
   }

   public PlayerStats playerStats() {
      return new PlayerStats(this.elm.get("player_stats"));
   }

   public MemberProfile profile() {
      return new MemberProfile(this.elm.get("profile"));
   }

   public Quests quests() {
      return new Quests(this.elm.get("quests"));
   }

   public Rift rift() {
      return new Rift(this.elm.get("rift"));
   }

   public Shards shards() {
      return new Shards(this.elm.get("shards"));
   }

   public SharedInventory sharedInventory() {
      return new SharedInventory(this.elm.get("shared_inventory"));
   }

   public SkillTree skillTree() {
      return new SkillTree(this.elm.get("skill_tree"));
   }

   public Slayer slayer() {
      return new Slayer(this.elm.get("slayer"));
   }

   public Map<String, JsonElement> stats() {
      return this.elm.get("stats").asMapOpt(BetterJson::asJsonElement);
   }

   public Temples temples() {
      return new Temples(this.elm.get("temples"));
   }

   public TrophyFish trophyFish() {
      return new TrophyFish(this.elm.get("trophy_fish"));
   }

   public WinterPlayerData winterPlayerData() {
      return new WinterPlayerData(this.elm.get("winter_player_data"));
   }
}
