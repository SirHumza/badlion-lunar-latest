package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModHorseStats {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("horse-stats", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> TEXT_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("horse-stats", "text-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(64, 64, 64)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> SPEED_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("horse-stats", "speed-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(45, 104, 207)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> JUMP_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("horse-stats", "jump-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(18, 175, 13)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> HEALTH_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("horse-stats", "health-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(207, 45, 45)))
         .notifyClient())
      .build();

   private ModHorseStats() {
   }
}
