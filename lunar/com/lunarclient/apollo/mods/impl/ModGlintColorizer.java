package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModGlintColorizer {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("glint-colorizer", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_GLINT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("glint-colorizer", "show-glint"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> USE_LUNAR_EQUATION = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Use a custom blending algorithm which supports darker colours"))
                  .node("glint-colorizer", "use-lunar-equation"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> OVERRIDE_ITEM_GLINT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Recolor the glints of items"))
                  .node("glint-colorizer", "override-item-glint"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> ITEM_GLINT_LUNAR_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("glint-colorizer", "item-glint-lunar-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(100, 25, 255, 204)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> ITEM_GLINT_VANILLA_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("glint-colorizer", "item-glint-vanilla-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(128, 64, 204)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> OVERRIDE_ARMOR_GLINT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Recolor the glints of worn armor"))
                  .node("glint-colorizer", "override-armor-glint"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> ARMOR_GLINT_LUNAR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("glint-colorizer", "armor-glint-lunar"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(100, 25, 255, 204)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> ARMOR_GLINT_VANILLA = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("glint-colorizer", "armor-glint-vanilla"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(128, 64, 204)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> GLINT_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("glint-colorizer", "glint-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(128, 64, 204)))
         .notifyClient())
      .build();

   private ModGlintColorizer() {
   }
}
