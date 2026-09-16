package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

public final class ModTimeChanger {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("time-changer", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> TIME_CHANGER_TIME = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("time-changer", "time-changer-time"))
         .type(TypeToken.get(Integer.class)))
      .min(0)
      .max(24000)
      .defaultValue(12000)
      .notifyClient()
      .build();
   public static final NumberOption<Integer> HORIZON_YLEVEL = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("time-changer", "horizon-y-level"))
         .type(TypeToken.get(Integer.class)))
      .min(0)
      .max(63)
      .defaultValue(63)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> USE_REAL_TIME = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("time-changer", "use-real-time"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> TIME_PASSAGE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("time-changer", "time-passage"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> SPEED = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("time-changer", "speed"))
         .type(TypeToken.get(Integer.class)))
      .min(0)
      .max(20)
      .defaultValue(1)
      .notifyClient()
      .build();

   private ModTimeChanger() {
   }
}
