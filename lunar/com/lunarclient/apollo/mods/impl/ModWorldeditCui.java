package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModWorldeditCui {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("worldedit-cui", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> POSITION_ONE_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("worldedit-cui", "position-one-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 0, 255)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> POSITION_TWO_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("worldedit-cui", "position-two-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 0, 0)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> OUTLINE_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("worldedit-cui", "outline-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(0, 255, 0)))
         .notifyClient())
      .build();

   private ModWorldeditCui() {
   }
}
