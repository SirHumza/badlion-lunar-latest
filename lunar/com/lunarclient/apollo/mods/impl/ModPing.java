package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModPing {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> UPDATE_INTERVAL_SEC = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("How often ping is measured. If you have trouble connecting to a server, try increasing this."))
            .node("ping", "update-interval-sec"))
         .type(TypeToken.get(Integer.class)))
      .min(1)
      .max(120)
      .defaultValue(5)
      .notifyClient()
      .build();
   public static final NumberOption<Integer> AVERAGE_SAMPLES = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("How many updates to average together (one update happens per the 'update interval' setting)"))
            .node("ping", "average-samples"))
         .type(TypeToken.get(Integer.class)))
      .min(2)
      .max(20)
      .defaultValue(3)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> PING_SPIKE_DETECTION = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "ping-spike-detection"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> MEDIUM_SPIKE_THRESHOLD = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("ping", "medium-spike-threshold"))
         .type(TypeToken.get(Integer.class)))
      .min(1)
      .max(200)
      .defaultValue(20)
      .notifyClient()
      .build();
   public static final SimpleOption<Color> MEDIUM_SPIKE_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "medium-spike-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 145, 0)))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> LARGE_SPIKE_THRESHOLD = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("ping", "large-spike-threshold"))
         .type(TypeToken.get(Integer.class)))
      .min(1)
      .max(200)
      .defaultValue(50)
      .notifyClient()
      .build();
   public static final SimpleOption<Color> LARGE_SPIKE_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "large-spike-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 0, 0)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PING_SHOW_MS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "ping-show-ms"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_PING_PREFIX = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "show-ping-prefix"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> PING_PREFIX_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "ping-prefix-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 255)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DYNAMIC_PING_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "dynamic-ping-color"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 85)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> LOW_PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "low-ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(85, 255, 85)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> MEDIUM_PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "medium-ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 85)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> HIGH_PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "high-ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 85, 85)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> EXTREME_PING_NUMBER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("ping", "extreme-ping-number-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(170, 0, 0)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> ENABLE_PING_NAMETAG = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("ping", "enable-ping-nametag"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> PING_ABOVE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("ping", "ping-above"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();
   @Deprecated
   public static final NumberOption<Float> SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("ping", "scale"))
         .type(TypeToken.get(Float.class)))
      .min(0.5F)
      .max(1.5F)
      .notifyClient()
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> TEXT_SHADOW = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("ping", "text-shadow"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> BACKGROUND = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("ping", "background"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> STATIC_BACKGROUND_WIDTH = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .comment("If this is disabled the background will change size with the text."))
               .node("ping", "static-background-width"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();
   @Deprecated
   public static final NumberOption<Integer> BACKGROUND_WIDTH = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("ping", "background-width"))
         .type(TypeToken.get(Integer.class)))
      .min(40)
      .max(62)
      .notifyClient()
      .build();
   @Deprecated
   public static final NumberOption<Integer> BACKGROUND_HEIGHT = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("ping", "background-height"))
         .type(TypeToken.get(Integer.class)))
      .min(10)
      .max(22)
      .notifyClient()
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> BRACKETS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("ping", "brackets"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> BORDER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("ping", "border"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();
   @Deprecated
   public static final NumberOption<Float> BORDER_THICKNESS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("ping", "border-thickness"))
         .type(TypeToken.get(Float.class)))
      .min(0.5F)
      .max(3.0F)
      .notifyClient()
      .build();
   @Deprecated
   public static final SimpleOption<Color> TEXT_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("ping", "text-color"))
            .type(TypeToken.get(Color.class)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Color> BACKGROUND_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("ping", "background-color"))
            .type(TypeToken.get(Color.class)))
         .notifyClient())
      .build();
   @Deprecated
   public static final SimpleOption<Color> BORDER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("ping", "border-color"))
            .type(TypeToken.get(Color.class)))
         .notifyClient())
      .build();

   private ModPing() {
   }
}
