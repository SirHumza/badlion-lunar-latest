package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModMinimap {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("minimap", "scale"))
         .type(TypeToken.get(Float.class)))
      .min(0.25F)
      .max(5.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Integer> MAP_WIDTH = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("minimap", "map-width"))
         .type(TypeToken.get(Integer.class)))
      .min(1)
      .max(16)
      .defaultValue(8)
      .notifyClient()
      .build();
   public static final NumberOption<Integer> MAP_HEIGHT = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("minimap", "map-height"))
         .type(TypeToken.get(Integer.class)))
      .min(1)
      .max(16)
      .defaultValue(8)
      .notifyClient()
      .build();
   public static final NumberOption<Float> MAP_ZOOM = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("minimap", "map-zoom"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(2.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> ROTATE_WITH_PLAYER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "rotate-with-player"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> FIT_TEXT_TO_WIDTH = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("With this enabled, the info text is scaled down to the width of the minimap"))
                  .node("minimap", "fit-text-to-width"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> BORDER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "border"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> BORDER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "border-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 159)))
         .notifyClient())
      .build();
   public static final NumberOption<Float> BORDER_THICKNESS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("minimap", "border-thickness"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(5.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> COMPASS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "compass"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COMPASS_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "compass-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 255)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> COMPASS_SHADOW = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "compass-shadow"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> PLAYER_MARKER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "player-marker-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 255)))
         .notifyClient())
      .build();
   public static final NumberOption<Float> PLAYER_MARKER_SIZE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("minimap", "player-marker-size"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(10.0F)
      .defaultValue(5.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> ENTITY_MARKER_OPACITY = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("minimap", "entity-marker-opacity"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(1.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> ENTITY_MARKER_SIZE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("minimap", "entity-marker-size"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(10.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> ENTITY_MARKER_SHADOW = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "entity-marker-shadow"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_COORDINATES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "show-coordinates"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_BIOME = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "show-biome"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PRESET_BIOME_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "preset-biome-color"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_CLOCK = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "show-clock"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_AM_PM = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "show-am-pm"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> MILITARY_TIME = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "military-time"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_DISTANT_WAYPOINTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("minimap", "show-distant-waypoints"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();

   private ModMinimap() {
   }
}
