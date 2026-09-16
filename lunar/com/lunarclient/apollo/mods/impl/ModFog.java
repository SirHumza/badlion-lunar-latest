package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModFog {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("fog", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> WATER_FOG_DENSITY = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("fog", "water-fog-density"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(1.8F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> RENDER_DISTANCE_FOG_DENSITY = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("fog", "render-distance-fog-density"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(1.95F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> ATMOSPHERIC_FOG_DENSITY = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("fog", "atmospheric-fog-density"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(1.95F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> DIMENSION_FOG_DENSITY = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("fog", "dimension-fog-density"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(1.95F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> RENDER_DISTANCE_FOG_COLOR_TOGGLE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("fog", "render-distance-fog-color-toggle"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> RENDER_DISTANCE_FOG_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("fog", "render-distance-fog-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(192, 216, 255, 0)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ATMOSPHERIC_FOG_COLOR_TOGGLE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("fog", "atmospheric-fog-color-toggle"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> ATMOSPHERIC_FOG_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("fog", "atmospheric-fog-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(192, 208, 255, 0)))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DIMENSION_FOG_COLOR_TOGGLE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("fog", "dimension-fog-color-toggle"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> DIMENSION_FOG_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("fog", "dimension-fog-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(192, 208, 255, 0)))
         .notifyClient())
      .build();

   private ModFog() {
   }
}
