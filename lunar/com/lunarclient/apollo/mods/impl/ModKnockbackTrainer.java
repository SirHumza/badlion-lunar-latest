package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

public final class ModKnockbackTrainer {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("knockback-trainer", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> TARGET_TICKS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("knockback-trainer", "target-ticks"))
         .type(TypeToken.get(Integer.class)))
      .min(0)
      .max(6)
      .defaultValue(0)
      .notifyClient()
      .build();
   public static final NumberOption<Integer> WINDOW_TICKS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("knockback-trainer", "window-ticks"))
         .type(TypeToken.get(Integer.class)))
      .min(0)
      .max(10)
      .defaultValue(5)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> FALLING_HIT_SOUND = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("knockback-trainer", "falling-hit-sound"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final NumberOption<Float> FALLING_HIT_SOUND_VOLUME = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("knockback-trainer", "falling-hit-sound-volume"))
         .type(TypeToken.get(Float.class)))
      .min(0.0F)
      .max(1.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();

   private ModKnockbackTrainer() {
   }
}
