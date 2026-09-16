package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModDamageTint {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("damage-tint", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> VIGNETTE_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("damage-tint", "vignette-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 0, 0)))
         .notifyClient())
      .build();
   public static final NumberOption<Float> VIGNETTE_INTENSITY = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Intensity of the tint."))
            .node("damage-tint", "vignette-intensity"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(1.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Integer> SHOW_VIGNETTE_BELOW = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Show the tint when you have less than this amount of health as a percentage."))
            .node("damage-tint", "show-vignette-below"))
         .type(TypeToken.get(Integer.class)))
      .min(0)
      .max(100)
      .defaultValue(100)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> HEARTBEAT_AUDIO = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Plays a heartbeat, becoming faster the lower your health."))
                  .node("damage-tint", "heartbeat-audio"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> HEARTBEAT_AUDIO_VOLUME = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("damage-tint", "heartbeat-audio-volume"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(1.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();

   private ModDamageTint() {
   }
}
