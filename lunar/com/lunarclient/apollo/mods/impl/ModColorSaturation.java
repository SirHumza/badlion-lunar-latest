package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

public final class ModColorSaturation {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("color-saturation", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> COLOR_SATURATION_HUE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("color-saturation", "color-saturation-hue"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(10.0F)
      .defaultValue(0.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> COLOR_SATURATION_SATURATION = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("color-saturation", "color-saturation-saturation"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(10.0F)
      .defaultValue(5.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> COLOR_SATURATION_BRIGHTNESS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("color-saturation", "color-saturation-brightness"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(10.0F)
      .defaultValue(5.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> COLOR_SATURATION_CONTRAST = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("color-saturation", "color-saturation-contrast"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(10.0F)
      .defaultValue(5.0F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> GRAYSCALE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("color-saturation", "grayscale"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   private ModColorSaturation() {
   }
}
