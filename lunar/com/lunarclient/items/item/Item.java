package com.lunarclient.items.item;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.lunarclient.items.item.catacombs_requirements.CatacombsRequirement;
import com.lunarclient.items.item.dungeon_item_conversion_cost.DungeonItemConversionCost;
import com.lunarclient.items.item.gemstone_slots.GemstoneSlot;
import com.lunarclient.items.item.museum_data.MuseumData;
import com.lunarclient.items.item.prestige.Prestige;
import com.lunarclient.items.item.recipes.Recipe;
import com.lunarclient.items.item.requirements.Requirement;
import com.lunarclient.items.item.salvages.Salvage;
import com.lunarclient.items.item.skin.Skin;
import com.lunarclient.items.item.upgrade_costs.UpgradeCost;
import com.lunarclient.typeadapters.BooleanAdapter;
import com.lunarclient.typeadapters.IntegerAdapter;
import java.util.Map;

public record Item() {
   @SerializedName("material")
   private final String material;
   @SerializedName("durability")
   @JsonAdapter(IntegerAdapter.class)
   private final int durability;
   @SerializedName("skin")
   private final Skin skin;
   @SerializedName("name")
   private final String name;
   @SerializedName("category")
   private final String category;
   @SerializedName("tier")
   private final String tier;
   @SerializedName("description")
   private final String description;
   @SerializedName("npc_sell_price")
   private final double npcSellPrice;
   @SerializedName("id")
   private final String id;
   @SerializedName("stats")
   private final Map<String, Double> stats;
   @SerializedName("rarity_salvageable")
   private final boolean raritySalvageable;
   @SerializedName("salvages")
   private final Salvage[] salvages;
   @SerializedName("salvage")
   private final Salvage salvage;
   @SerializedName("dungeon_item_conversion_cost")
   private final DungeonItemConversionCost dungeonItemConversionCost;
   @SerializedName("upgrade_costs")
   private final UpgradeCost[][] upgradeCosts;
   @SerializedName("requirements")
   private final Requirement[] requirements;
   @SerializedName("color")
   private final String color;
   @SerializedName("soulbound")
   private final String soulbound;
   @SerializedName("has_uuid")
   @JsonAdapter(BooleanAdapter.class)
   private final boolean hasUuid;
   @SerializedName("gemstone_slots")
   private final GemstoneSlot[] gemstoneSlots;
   @SerializedName("glowing")
   private final boolean glowing;
   @SerializedName("unstackable")
   private final boolean unstackable;
   @SerializedName("can_auction")
   private final boolean canAuction;
   @SerializedName("can_trade")
   private final boolean canTrade;
   @SerializedName("generator")
   private final String generator;
   @SerializedName("generator_tier")
   private final int generatorTier;
   @SerializedName("catacombs_requirements")
   private final CatacombsRequirement[] catacombsRequirements;
   @SerializedName("museum")
   private final boolean museum;
   @SerializedName("museum_data")
   private final MuseumData museumData;
   @SerializedName("furniture")
   private final String furniture;
   @SerializedName("crystal")
   private final String crystal;
   @SerializedName("tiered_stats")
   private final Map<String, Double[]> tieredStats;
   @SerializedName("gear_score")
   private final int gearScore;
   @SerializedName("ability_damage_scaling")
   private final double abilityDamageScaling;
   @SerializedName("dungeon_item")
   private final boolean dungeonItem;
   @SerializedName("item_specific")
   private final Map<String, Object> itemSpecific;
   @SerializedName("can_place")
   private final boolean canPlace;
   @SerializedName("can_interact")
   private final boolean canInteract;
   @SerializedName("can_interact_right_click")
   private final boolean canInteractRightClick;
   @SerializedName("prestige")
   private final Prestige prestige;
   @SerializedName("serializable")
   private final boolean serializable;
   @SerializedName("salvageable_from_recipe")
   private final boolean salvageableFromRecipe;
   @SerializedName("item_model")
   private final String itemModel;
   @SerializedName("rift_transferrable")
   private final boolean riftTransferrable;
   @SerializedName("can_have_booster")
   private final boolean canHaveBooster;
   @SerializedName("can_recombobulate")
   private final boolean canRecombobulate;
   @SerializedName("origin")
   private final String origin;
   @SerializedName("enchantments")
   private final Map<String, Integer> enchantments;
   @SerializedName("motes_sell_price")
   private final double motesSellPrice;
   @SerializedName("lose_motes_value_on_transfer")
   private final boolean loseMotesValueOnTransfer;
   @SerializedName("sword_type")
   private final String swordType;
   @SerializedName("double_tap_to_drop")
   private final boolean doubleTapToDrop;
   @SerializedName("is_upgradeable_without_soulbinding")
   private final boolean isUpgradeableWithoutSoulbinding;
   @SerializedName("can_have_power_scroll")
   private final boolean canHavePowerScroll;
   @SerializedName("can_interact_entity")
   private final boolean canInteractEntity;
   @SerializedName("can_burn_in_furnace")
   private final boolean canBurnInFurnace;
   @SerializedName("private_island")
   private final String privateIsland;
   @SerializedName("can_have_attributes")
   private final boolean canHaveAttributes;
   @SerializedName("cannot_reforge")
   private final boolean cannotReforge;
   @SerializedName("recipes")
   private final Recipe[] recipes;
   @SerializedName("hide_from_viewrecipe_command")
   private final boolean hideFromViewrecipeCommand;

   public Item(
      String var1,
      int var2,
      Skin var3,
      String var4,
      String var5,
      String var6,
      String var7,
      double var8,
      String var10,
      Map<String, Double> var11,
      boolean var12,
      Salvage[] var13,
      Salvage var14,
      DungeonItemConversionCost var15,
      UpgradeCost[][] var16,
      Requirement[] var17,
      String var18,
      String var19,
      boolean var20,
      GemstoneSlot[] var21,
      boolean var22,
      boolean var23,
      boolean var24,
      boolean var25,
      String var26,
      int var27,
      CatacombsRequirement[] var28,
      boolean var29,
      MuseumData var30,
      String var31,
      String var32,
      Map<String, Double[]> var33,
      int var34,
      double var35,
      boolean var37,
      Map<String, Object> var38,
      boolean var39,
      boolean var40,
      boolean var41,
      Prestige var42,
      boolean var43,
      boolean var44,
      String var45,
      boolean var46,
      boolean var47,
      boolean var48,
      String var49,
      Map<String, Integer> var50,
      double var51,
      boolean var53,
      String var54,
      boolean var55,
      boolean var56,
      boolean var57,
      boolean var58,
      boolean var59,
      String var60,
      boolean var61,
      boolean var62,
      Recipe[] var63,
      boolean var64
   ) {
      this.material = var1;
      this.durability = var2;
      this.skin = var3;
      this.name = var4;
      this.category = var5;
      this.tier = var6;
      this.description = var7;
      this.npcSellPrice = var8;
      this.id = var10;
      this.stats = var11;
      this.raritySalvageable = var12;
      this.salvages = var13;
      this.salvage = var14;
      this.dungeonItemConversionCost = var15;
      this.upgradeCosts = var16;
      this.requirements = var17;
      this.color = var18;
      this.soulbound = var19;
      this.hasUuid = var20;
      this.gemstoneSlots = var21;
      this.glowing = var22;
      this.unstackable = var23;
      this.canAuction = var24;
      this.canTrade = var25;
      this.generator = var26;
      this.generatorTier = var27;
      this.catacombsRequirements = var28;
      this.museum = var29;
      this.museumData = var30;
      this.furniture = var31;
      this.crystal = var32;
      this.tieredStats = var33;
      this.gearScore = var34;
      this.abilityDamageScaling = var35;
      this.dungeonItem = var37;
      this.itemSpecific = var38;
      this.canPlace = var39;
      this.canInteract = var40;
      this.canInteractRightClick = var41;
      this.prestige = var42;
      this.serializable = var43;
      this.salvageableFromRecipe = var44;
      this.itemModel = var45;
      this.riftTransferrable = var46;
      this.canHaveBooster = var47;
      this.canRecombobulate = var48;
      this.origin = var49;
      this.enchantments = var50;
      this.motesSellPrice = var51;
      this.loseMotesValueOnTransfer = var53;
      this.swordType = var54;
      this.doubleTapToDrop = var55;
      this.isUpgradeableWithoutSoulbinding = var56;
      this.canHavePowerScroll = var57;
      this.canInteractEntity = var58;
      this.canBurnInFurnace = var59;
      this.privateIsland = var60;
      this.canHaveAttributes = var61;
      this.cannotReforge = var62;
      this.recipes = var63;
      this.hideFromViewrecipeCommand = var64;
   }
}
