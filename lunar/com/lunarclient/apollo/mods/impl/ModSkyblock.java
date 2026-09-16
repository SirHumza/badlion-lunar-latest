package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModSkyblock {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> SKYBLOCK_ALERT_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("skyblock", "skyblock-alert-scale"))
         .type(TypeToken.get(Float.class)))
      .min(0.2F)
      .max(2.5F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> MIDDLE_CLICK_ARMOR_FIX = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Fixes being unable to use the \"Pick Block\" keybind on items when it is bound to a mouse button."))
                  .node("skyblock", "middle-click-armor-fix"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SKYBLOCK_AUTOCOMPLETE_WARPS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Adds tab completion to the /warp command."))
                  .node("skyblock", "skyblock-autocomplete-warps"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_HEARTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-hide-hearts"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_ABSORB = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-hide-absorb"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ONLY_MOVERS_ON_SKYBLOCK = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Hides the hud previews in the edit hud layout menu if you're not currently on SkyBlock."))
                  .node("skyblock", "only-movers-on-skyblock"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> SKYBLOCK_SUBJECT_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-subject-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 170, 0)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> SKYBLOCK_SEPARATOR_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-separator-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 255)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> SKYBLOCK_VALUE_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-value-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(170, 170, 170)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> FIX_LAVA_BOBBER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Fixes your fishing bobber sinking in lava."))
                  .node("skyblock", "fix-lava-bobber"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SKYBLOCK_USE_TICK_TIMERS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-use-tick-timers"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final NumberOption<Float> SKYBLOCK_LINE_THICKNESS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Provides a general line thickness option that applies to most features with box/line rendering."))
            .node("skyblock", "skyblock-line-thickness"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(10.0F)
      .defaultValue(4.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> CUSTOM_CHIME_VOLUME_ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "custom-chime-volume-enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> CUSTOM_CHIME_VOLUME = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("skyblock", "custom-chime-volume"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(1.0F)
      .defaultValue(0.5F)
      .notifyClient()
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> AUTO_COPY_RARE_DROPS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Automatically copies rare drops and pet drops to the clipboard."))
                  .node("skyblock", "auto-copy-rare-drops"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKY_BLOCK_MIDDLE_CLICK_ITEMS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Replaces left clicks in menus with a middle click. Hold control to override."))
                  .node("skyblock", "sky-block-middle-click-items"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKY_BLOCK_CREATION_DATE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Shows the creation date of the item in the lore."))
                  .node("skyblock", "sky-block-creation-date"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKY_BLOCK_ITEM_ID = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Shows the item's SkyBlock ID in the lore."))
                  .node("skyblock", "sky-block-item-id"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_EX_COOPS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Hides ex-coop members in the collection menu."))
                  .node("skyblock", "skyblock-hide-ex-coops"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_MAGIC_SOUP_MESSAGES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-hide-magic-soup-messages"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_PLAYERS_NEAR_NPCS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Hides other players near important NPCs."))
                  .node("skyblock", "skyblock-hide-players-near-n-p-cs"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_OTHERS_GIFTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-hide-others-gifts"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_ADBLOCK = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Hides spambots that send malicious websites in chat."))
                  .node("skyblock", "skyblock-adblock"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_HUNGER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-hide-hunger"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_ARMOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-hide-armor"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> GRIFFIN_BURROW_ESTIMATES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Provides QOL for the Diana mayor that helps the user quickly locate burrows."))
                  .node("skyblock", "griffin-burrow-estimates"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Color> BURROW_ESTIMATE_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-estimate-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 0)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> BURROW_ESTIMATE_LINE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-estimate-line"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> BURROW_ESTIMATE_BEAM = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-estimate-beam"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> BURROW_ESTIMATES_PRIORITIZE_PLAYER_WAYPOINTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-estimates-prioritize-player-waypoints"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> BURROW_WARP_TO_NEAREST_ALERT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-warp-to-nearest-alert"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Color> BURROW_MOB_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-mob-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 0, 0)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Color> BURROW_TREASURE_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-treasure-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 255, 0)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Color> BURROW_START_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-start-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 255, 0)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Color> BURROW_UNKNOWN_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-unknown-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 255, 0)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> BURROW_BEAM = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "burrow-beam"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> HIGHLIGHT_GLOWING_MUSHROOMS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "highlight-glowing-mushrooms"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKY_BLOCK_WISHING_COMPASS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "sky-block-wishing-compass"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKY_BLOCK_FINISHED_COMMISSIONS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "sky-block-finished-commissions"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKY_BLOCK_METAL_DETECTOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "sky-block-metal-detector"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKY_BLOCK_METAL_DETECTOR_LINE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "sky-block-metal-detector-line"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> REPLACE_LAVA_WITH_WATER_CRIMSON = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Changes the texture of lava to water in the Crimson Isles and Kuudra."))
                  .node("skyblock", "replace-lava-with-water-crimson"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> REPLACE_LAVA_WITH_WATER_EVERYWHERE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Changes the texture of lava to water everywhere in SkyBlock."))
                  .node("skyblock", "replace-lava-with-water-everywhere"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_FISHING_HIDE_PLAYERS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Hides players and fishing rods near your bobber while you are fishing."))
                  .node("skyblock", "skyblock-fishing-hide-players"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_FISHING_HOTSPOT_LOCATOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Shows which hotspot the Hotspot Radar item is pointing to."))
                  .node("skyblock", "skyblock-fishing-hotspot-locator"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SLAYER_BOSS_TIMER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Provides a chat message on boss kill that tells you how long it took to kill!"))
                  .node("skyblock", "slayer-boss-timer"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SLAYER_MINI_BOSS_ALERT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "slayer-mini-boss-alert"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> INACTIVE_EFFIGY_WAYPOINTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Used in Stillgore of the Rift, this feature tells you where to go to refresh the duration of inactive Effigies."))
                  .node("skyblock", "inactive-effigy-waypoints"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> VAMPIRE_STEAK_DISPLAY = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Highlights a boss when it can be 1 tapped using steak stake."))
                  .node("skyblock", "vampire-steak-display"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> VAMPIRE_ICHOR_DISPLAY = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Highlights blood ichors present during T5 Bloodfiends"))
                  .node("skyblock", "vampire-ichor-display"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> GRAVITY_WELL_WAYPOINTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Shows the positions where you can trap the gray blazes."))
                  .node("skyblock", "gravity-well-waypoints"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SHOW_KUUDRA_HEALTH = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "show-kuudra-health"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> HIGHLIGHT_END_NODES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "highlight-end-nodes"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SHOW_GIANT_HPAT_FEET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Makes Giant HP more visible by showing their HP at their feet."))
                  .node("skyblock", "show-giant-h-p-at-feet"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SHOW_PROFESSOR_GUARDIAN_HP = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Makes Professor's Guardians HP more visible."))
                  .node("skyblock", "show-professor-guardian-h-p"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_DUNGEON_QUALITY = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-dungeon-quality"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_SECRETS_COLLECTED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-secrets-collected"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_NON_STARRED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-hide-non-starred"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_TERMINAL_SPLIT_TIMERS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Shows how long it takes to do each terminal stage in chat (and also Simon Says)!"))
                  .node("skyblock", "skyblock-terminal-split-timers"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> ENABLE_DUNGEON_ROUTES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "enable-dungeon-routes"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> DEFAULT_SECRET_ROUTES_ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "default-secret-routes-enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_NAMES_AT_START = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-names-at-start"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Color> SECRET_ROUTES_NAME_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-name-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 0, 0)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_DISABLE_HELP_TEXT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-disable-help-text"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_ALLOW_PEARLING = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-allow-pearling"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_DISABLE_SUPERBOOM = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-disable-superboom"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_DISABLE_BLOCK = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-disable-block"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_DISABLE_LEVER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-disable-lever"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_DISABLE_ETHERWARP = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-disable-etherwarp"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_DISABLE_SECRET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-disable-secret"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_DISABLE_MISC = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-disable-misc"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SECRET_ROUTES_DISABLE_PEARLS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "secret-routes-disable-pearls"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> HIDE_MIDAS_STAFF = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "hide-midas-staff"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> HIDE_FALLING_BLOCKS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "hide-falling-blocks"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SB_MENU_CLICK_TO_COMMAND = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Routes menu clicks to /sbmenu command in order to prevent sticky item."))
                  .node("skyblock", "sb-menu-click-to-command"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_BOW_REEQUIP = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-bow-reequip"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> SKYBLOCK_HIDE_RANDOM_BOSSBARS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("skyblock", "skyblock-hide-random-bossbars"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> TALLER_CROPS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Changes crop hitboxes with their 1.12+ variant. Only enabled on Hypixel or singleplayer."))
                  .node("skyblock", "taller-crops"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> DUNGEON_SECRETS_COLLECTED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("skyblock", "dungeon-secrets-collected"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();

   private ModSkyblock() {
   }
}
