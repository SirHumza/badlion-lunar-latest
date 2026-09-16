package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModTab {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> TOGGLE_KEY_TAB = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Quickly pressing and releasing the key will toggle tab"))
                  .node("tab", "toggle-key-tab"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DISABLE_HEADER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "disable-header"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DISPLAY_PLAYER_HEAD = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "display-player-head"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DISABLE_FOOTER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "disable-footer"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_NPC = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Hide Hypixel NPC on tab"))
                  .node("tab", "hide-n-p-c"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_LUNAR_ICONS_ON_RIGHT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "show-lunar-icons-on-right"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> HEADER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "header-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 128)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> FOOTER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "footer-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 128)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> BACKGROUND_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "background-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 128)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PING_ROW = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "ping-row"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> ROWS_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "rows-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 32)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIGHLIGHT_OWN_NAME = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "highlight-own-name"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> NAME_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "name-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 0, 0)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> NAME_SHADOW = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "name-shadow"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> MOVE_SELF_TO_TOP = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "move-self-to-top"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_PING = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "hide-ping"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_PING_IF_OVER_500 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "hide-ping-if-over500"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DISPLAY_PING_AS_NUMBER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "display-ping-as-number"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PING_NUMBER_SHADOW = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "ping-number-shadow"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DYNAMIC_PING_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "dynamic-ping-color"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> LOW_PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "low-ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(85, 255, 85)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> MEDIUM_PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "medium-ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 85)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> HIGH_PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "high-ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 85, 85)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> EXTREME_PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "extreme-ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(170, 0, 0)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tab", "ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 85)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> TAB_LOGO = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .comment("An option to toggle LC logos in player list tab overlay."))
               .node("tab", "tab-logo"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();

   private ModTab() {
   }
}
