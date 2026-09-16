package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModScoreboard {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("scoreboard", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final NumberOption<Float> SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("scoreboard", "scale"))
         .type(TypeToken.get(Float.class)))
      .min(0.25F)
      .max(5.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> NUMBERS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("scoreboard", "numbers"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> HIDE_SCOREBOARD = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("scoreboard", "hide-scoreboard"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> TEXT_SHADOW = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Adds a shadow to text"))
                  .node("scoreboard", "text-shadow"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> BORDER_THICKNESS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("scoreboard", "border-thickness"))
         .type(TypeToken.get(Float.class)))
      .min(0.5F)
      .max(3.0F)
      .defaultValue(0.5F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> BORDER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("scoreboard", "border"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DISPLAY_TOGGLE_MESSAGE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("scoreboard", "display-toggle-message"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> BACKGROUND_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("scoreboard", "background-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 80)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> HEADER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("scoreboard", "header-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 80)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> BORDER_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("scoreboard", "border-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 0, 159)))
         .notifyClient())
      .build();

   private ModScoreboard() {
   }
}
