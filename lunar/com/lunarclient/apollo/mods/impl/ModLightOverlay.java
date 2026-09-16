package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModLightOverlay {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("light-overlay", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> RENDER_RANGE_LIMIT = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("The rendering limit (in chunks) for light overlay values. Higher values might lower your FPS."))
            .node("light-overlay", "render-range-limit"))
         .type(TypeToken.get(Integer.class)))
      .min(1)
      .max(12)
      .defaultValue(2)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> FAST_UPDATES = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment(
                        "With this option on, the overlay updates aren't deferred, and happen as fast as possible.This looks nicer (less \"pop in\"), but turning this option on comes at a potential performance cost."
                     ))
                  .node("light-overlay", "fast-updates"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> CULLING = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment(
                        "Reduce the amount of overlays that are rendered, increasing performance, especially at higher rendering ranges.This comes at the expense of overlays at the edges of the screen sometimes popping in and out as you look around.It's highly recommended that this option is kept on, especially if using higher rendering ranges."
                     ))
                  .node("light-overlay", "culling"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> INCLUDE_SKY_LIGHT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment(
                        "With this option on, the real, effective light value is displayed. With this option off, only the block light is used, completely ignoring the sky/day light."
                     ))
                  .node("light-overlay", "include-sky-light"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_UNSPAWNABLE_LIGHT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Only show on blocks which have light levels that hostile mobs can spawn on"))
                  .node("light-overlay", "hide-unspawnable-light"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> CUSTOM_LIGHT_THRESHOLD = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment(
                        "Set a custom threshold for Light Check. This overrides the vanilla hostile mob spawning value, and shows the light overlay on all blocks on which the light level falls below this threshold"
                     ))
                  .node("light-overlay", "custom-light-threshold"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> THRESHOLD = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("light-overlay", "threshold"))
         .type(TypeToken.get(Integer.class)))
      .min(0)
      .max(15)
      .defaultValue(15)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> SHOW_LIGHT_VALUE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Show a number for the light value of each block.Turning this option on might lower your FPS."))
                  .node("light-overlay", "show-light-value"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> CROSS_THICKNESS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("light-overlay", "cross-thickness"))
         .type(TypeToken.get(Float.class)))
      .min(0.5F)
      .max(10.0F)
      .defaultValue(2.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Color> TEXT_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("light-overlay", "text-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 255)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> BRIGHT_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Color where hostile mobs can't spawn"))
                  .node("light-overlay", "bright-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 255, 0)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> DARK_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Color where hostile mobs can spawn"))
                  .node("light-overlay", "dark-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 0, 0)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> LIGHT_OVERLAY_DYNAMIC_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment(
                        "When this is off, the color is picked based on the light level allowing hostile mobs to spawn. When this is on, the color is interpolated smoothly."
                     ))
                  .node("light-overlay", "light-overlay-dynamic-color"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   private ModLightOverlay() {
   }
}
