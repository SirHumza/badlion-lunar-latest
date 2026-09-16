package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModHypixelMod {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> REMOVE_GUILD_ON_TAB = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "remove-guild-on-tab"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> REMOVE_GUILD_MOTD = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "remove-guild-motd"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHORT_CHANNEL_NAMES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "short-channel-names"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> AUTO_FRIEND = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "auto-friend"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> AUTO_TIP = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "auto-tip"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> AUTO_GG = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "auto-g-g"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ANTI_GG = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "anti-g-g"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> AUTO_WHO = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "auto-who"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> LEVEL_HEAD = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "level-head"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HYPIXEL_AUTOCOMPLETE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hypixel-autocomplete"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> LEVEL_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "level-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 85)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> LEVEL_HEAD_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "level-head-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(85, 255, 255)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> LEVEL_ABOVE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "level-above"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> USE_BEDWARS_LEVELS_FORMAT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "use-bedwars-levels-format"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_PRIVATE_MESSAGES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-private-messages"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_TEAM_CHAT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-team-chat"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_PARTY_CHAT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-party-chat"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_GUILD_CHAT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-guild-chat"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_SHOUT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-shout"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_SPECTATOR_CHAT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-spectator-chat"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> REMOVE_LOBBY_STATUSES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "remove-lobby-statuses"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_JOIN_MESSAGES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-join-messages"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_LEAVE_MESSAGES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-leave-messages"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_SOUL_WELL_ANNOUNCEMENTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-soul-well-announcements"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_MYSTERY_BOX_ANNOUNCEMENTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("hypixel-mod", "hide-mystery-box-announcements"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   private ModHypixelMod() {
   }
}
