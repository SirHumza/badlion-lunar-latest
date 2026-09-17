package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   EXPLOSION_NORMAL("explode", 0, true),
   EXPLOSION_LARGE("largeexplode", 1, true),
   EXPLOSION_HUGE("hugeexplosion", 2, true),
   FIREWORKS_SPARK("fireworksSpark", 3, false),
   WATER_BUBBLE("bubble", 4, false),
   WATER_SPLASH("splash", 5, false),
   WATER_WAKE("wake", 6, false),
   SUSPENDED("suspended", 7, false),
   SUSPENDED_DEPTH("depthsuspend", 8, false),
   CRIT("crit", 9, false),
   CRIT_MAGIC("magicCrit", 10, false),
   SMOKE_NORMAL("smoke", 11, false),
   SMOKE_LARGE("largesmoke", 12, false),
   SPELL("spell", 13, false),
   SPELL_INSTANT("instantSpell", 14, false),
   SPELL_MOB("mobSpell", 15, false),
   SPELL_MOB_AMBIENT("mobSpellAmbient", 16, false),
   SPELL_WITCH("witchMagic", 17, false),
   DRIP_WATER("dripWater", 18, false),
   DRIP_LAVA("dripLava", 19, false),
   VILLAGER_ANGRY("angryVillager", 20, false),
   VILLAGER_HAPPY("happyVillager", 21, false),
   TOWN_AURA("townaura", 22, false),
   NOTE("note", 23, false),
   PORTAL("portal", 24, false),
   ENCHANTMENT_TABLE("enchantmenttable", 25, false),
   FLAME("flame", 26, false),
   LAVA("lava", 27, false),
   FOOTSTEP("footstep", 28, false),
   CLOUD("cloud", 29, false),
   REDSTONE("reddust", 30, false),
   SNOWBALL("snowballpoof", 31, false),
   SNOW_SHOVEL("snowshovel", 32, false),
   SLIME("slime", 33, false),
   HEART("heart", 34, false),
   BARRIER("barrier", 35, false),
   ITEM_CRACK("iconcrack_", 36, false, 2),
   BLOCK_CRACK("blockcrack_", 37, false, 1),
   BLOCK_DUST("blockdust_", 38, false, 1),
   WATER_DROP("droplet", 39, false),
   ITEM_TAKE("take", 40, false),
   MOB_APPEARANCE("mobappearance", 41, true),
   DRAGON_BREATH("dragonbreath", 42, false),
   END_ROD("endRod", 43, false),
   DAMAGE_INDICATOR("damageIndicator", 44, true),
   SWEEP_ATTACK("sweepAttack", 45, true),
   FALLING_DUST("fallingdust", 46, false, 1),
   TOTEM("totem", 47, false),
   SPIT("spit", 48, true);

   private final String name;
   private final int id;
   private final boolean ignoreRange;
   private final int argumentCount;
   private static final Map<Integer, IRCIIHHICIHRCOCRROCOICRIHHCCHH> ID_MAP = new HashMap<>();
   private static final Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH> NAME_MAP = new HashMap<>();

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, int var4, boolean var5, int var6) {
      this.name = var3;
      this.id = var4;
      this.ignoreRange = var5;
      this.argumentCount = var6;
   }

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, int var4, boolean var5) {
      this(var3, var4, var5, 0);
   }

   public String getParticleName() {
      return this.name;
   }

   public int getParticleID() {
      return this.id;
   }

   public int getArgumentCount() {
      return this.argumentCount;
   }

   public boolean shouldIgnoreRange() {
      return this.ignoreRange;
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH getParticleFromId(int var0) {
      return ID_MAP.get(var0);
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH getParticleFromName(String var0) {
      if (var0.equalsIgnoreCase("BLOCK_DUST")) {
         return BLOCK_DUST;
      }

      if (var0.equalsIgnoreCase("ICON_CRACK")) {
         return ITEM_CRACK;
      }

      if (var0.equalsIgnoreCase("BLOCK_CRACK")) {
         return BLOCK_CRACK;
      }

      if (var0.contains("_") && !var0.endsWith("_")) {
         var0 = var0.substring(0, var0.indexOf(95) + 1);
      }

      return NAME_MAP.get(var0.toLowerCase(Locale.ROOT));
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH asModernParticle() {
      switch (this) {
         case EXPLOSION_NORMAL:
         case EXPLOSION_LARGE:
         case EXPLOSION_HUGE:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.EXPLOSION;
         case FIREWORKS_SPARK:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.FIREWORK;
         case WATER_BUBBLE:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.BUBBLE;
         case WATER_SPLASH:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.SPLASH;
         case WATER_WAKE:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.FISHING;
         case SUSPENDED:
         case SUSPENDED_DEPTH:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.UNDERWATER;
         case CRIT:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRIT;
         case CRIT_MAGIC:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.ENCHANTED_HIT;
         case SMOKE_NORMAL:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.SMOKE;
         case SMOKE_LARGE:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.LARGE_SMOKE;
         case SPELL:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.EFFECT;
         case SPELL_INSTANT:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.INSTANT_EFFECT;
         case SPELL_MOB:
         case MOB_APPEARANCE:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.ENTITY_EFFECT;
         case SPELL_MOB_AMBIENT:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.AMBIENT_ENTITY_EFFECT;
         case SPELL_WITCH:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.WITCH;
         case DRIP_WATER:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.DRIPPING_WATER;
         case DRIP_LAVA:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.DRIPPING_LAVA;
         case VILLAGER_ANGRY:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.ANGRY_VILLAGER;
         case VILLAGER_HAPPY:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.HAPPY_VILLAGER;
         case TOWN_AURA:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.MYCELIUM;
         case NOTE:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.NOTE;
         case PORTAL:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.PORTAL;
         case ENCHANTMENT_TABLE:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.ENCHANT;
         case FLAME:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.FLAME;
         case LAVA:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.LAVA;
         case BLOCK_CRACK:
         case BLOCK_DUST:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.BLOCK;
         case FOOTSTEP:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.FOOTSTEP;
         case CLOUD:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOUD;
         case REDSTONE:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.DUST;
         case SNOWBALL:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.ITEM_SNOWBALL;
         case SNOW_SHOVEL:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.POOF;
         case SLIME:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.ITEM_SLIME;
         case HEART:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.HEART;
         case BARRIER:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.BARRIER;
         case ITEM_CRACK:
         case ITEM_TAKE:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.ITEM;
         case WATER_DROP:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.FALLING_WATER;
         case SPIT:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.SPIT;
         case TOTEM:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.TOTEM_OF_UNDYING;
         case END_ROD:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.END_ROD;
         case FALLING_DUST:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.FALLING_DUST;
         case SWEEP_ATTACK:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.SWEEP_ATTACK;
         case DRAGON_BREATH:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.DRAGON_BREATH;
         case DAMAGE_INDICATOR:
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.DAMAGE_INDICATOR;
         default:
            throw new NullPointerException("Cannot convert legacy particle type to modern particle type: " + this.name());
      }
   }

   static {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : values()) {
         ID_MAP.put(var3.getParticleID(), var3);
         NAME_MAP.put(var3.getParticleName().toLowerCase(Locale.ROOT), var3);
      }
   }
}
