package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

public final class ModWaypoints {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("waypoints", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ADD_WAYPOINTS_FROM_CHAT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Allows you to click coordinates in chat and create a new waypoint from them"))
                  .node("waypoints", "add-waypoints-from-chat"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> CONFIRM_DELETE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Ask for confirmation before deleting a waypoint through the UI"))
                  .node("waypoints", "confirm-delete"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DEATH_WAYPOINT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Automatically create a waypoint when you die"))
                  .node("waypoints", "death-waypoint"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> LIMIT_DEATH_WAYPOINTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Limit the amount of waypoints that can be created, removing the oldest one when going over the limit"))
                  .node("waypoints", "limit-death-waypoints"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> MAX_DEATH_WAYPOINTS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Maximum amount of Death Waypoints you will see at one time"))
            .node("waypoints", "max-death-waypoints"))
         .type(TypeToken.get(Integer.class)))
      .min(1)
      .max(20)
      .defaultValue(3)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> WAYPOINT_BEAMS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Enables beams for waypoints in the world"))
                  .node("waypoints", "waypoint-beams"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> BOX_BORDER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Adds a box around the waypoint label in the world"))
                  .node("waypoints", "box-border"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> TEXT_SHADOW = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Adds a shadow to text"))
                  .node("waypoints", "text-shadow"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> BOX_PADDING = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Increase the size of the labels box"))
            .node("waypoints", "box-padding"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(8.0F)
      .defaultValue(4.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> SHOW_ICONS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Show simpler text icons above each waypoint"))
                  .node("waypoints", "show-icons"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> LABEL_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Scale the box containing the waypoints name in the world"))
            .node("waypoints", "label-scale"))
         .type(TypeToken.get(Float.class)))
      .min(0.1F)
      .max(2.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> ICON_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Scale the box containing the waypoints icon in the world"))
            .node("waypoints", "icon-scale"))
         .type(TypeToken.get(Float.class)))
      .min(0.1F)
      .max(3.0F)
      .defaultValue(1.5F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> HIGHLIGHT_WAYPOINT_BLOCK = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Show an outline around the block the waypoint is positioned on"))
                  .node("waypoints", "highlight-waypoint-block"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final NumberOption<Float> HIGHLIGHT_WAYPOINT_BLOCK_LINE_WIDTH = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("The width of the outline around the block being highlighted"))
            .node("waypoints", "highlight-waypoint-block-line-width"))
         .type(TypeToken.get(Float.class)))
      .min(1.5F)
      .max(7.5F)
      .defaultValue(4.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> WAYPOINT_SHOW_DISTANCE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Show the distance of a waypoint in the world"))
                  .node("waypoints", "waypoint-show-distance"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ONLY_SHOW_WHEN_LOOKING_NEAR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Waypoints will only be displayed when your camera is facing towards their general direction"))
                  .node("waypoints", "only-show-when-looking-near"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> ADD_FROM_CHAT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .comment("Adds a waypoint if coordinates are clicked in chat."))
               .node("waypoints", "add-from-chat"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();

   private ModWaypoints() {
   }
}
