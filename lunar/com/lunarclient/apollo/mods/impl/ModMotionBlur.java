package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

public final class ModMotionBlur {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("motion-blur", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> VALUE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("motion-blur", "value"))
         .type(TypeToken.get(Integer.class)))
      .min(1)
      .max(10)
      .defaultValue(5)
      .notifyClient()
      .build();
   @Deprecated
   public static final SimpleOption<Boolean> OLD_BLUR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
               .node("motion-blur", "old-blur"))
            .type(TypeToken.get(Boolean.class)))
         .notifyClient())
      .build();

   private ModMotionBlur() {
   }
}
