package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModCps {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("cps", "scale"))
         .type(TypeToken.get(Float.class)))
      .min(0.25F)
      .max(5.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> RIGHT_CLICK = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "right-click"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> LINE_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "line-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(32, 32, 32)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_CPSTEXT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "show-c-p-s-text"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> REVERSE_TEXT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "reverse-text"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> IGNORE_CANCELLED_CLICKS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "ignore-cancelled-clicks"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> TEXT_SHADOW = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Adds a shadow to text"))
                  .node("cps", "text-shadow"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> BRACKETS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "brackets"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> BRACKET_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "bracket-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 255)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> BACKGROUND = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "background"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> STATIC_BACKGROUND_WIDTH = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("If this is disabled the background will change size with the text."))
                  .node("cps", "static-background-width"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> STATIC_BACKGROUND_HEIGHT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("If this is disabled the background will change size with the text."))
                  .node("cps", "static-background-height"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> BACKGROUND_WIDTH = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("cps", "background-width"))
         .type(TypeToken.get(Integer.class)))
      .min(40)
      .max(62)
      .defaultValue(56)
      .notifyClient()
      .build();
   public static final NumberOption<Integer> BACKGROUND_HEIGHT = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("cps", "background-height"))
         .type(TypeToken.get(Integer.class)))
      .min(10)
      .max(22)
      .defaultValue(18)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> BORDER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "border"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> BORDER_THICKNESS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("cps", "border-thickness"))
         .type(TypeToken.get(Float.class)))
      .min(0.5F)
      .max(3.0F)
      .defaultValue(0.5F)
      .notifyClient()
      .build();
   public static final SimpleOption<Color> BORDER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "border-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 159)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> BACKGROUND_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "background-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 111)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> TEXT_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("cps", "text-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 255, 255)))
         .notifyClient())
      .build();

   private ModCps() {
   }
}
