package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

@Deprecated
public final class ModUhcOverlay {
   @Deprecated
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("uhc-overlay", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   @Deprecated
   public static final NumberOption<Float> GOLD_INGOT_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("uhc-overlay", "gold-ingot-scale"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(5.0F)
      .notifyClient()
      .build();
   @Deprecated
   public static final NumberOption<Float> GOLD_NUGGET_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("uhc-overlay", "gold-nugget-scale"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(5.0F)
      .notifyClient()
      .build();
   @Deprecated
   public static final NumberOption<Float> GOLD_ORE_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("uhc-overlay", "gold-ore-scale"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(5.0F)
      .notifyClient()
      .build();
   @Deprecated
   public static final NumberOption<Float> GOLD_APPLE_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("uhc-overlay", "gold-apple-scale"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(5.0F)
      .notifyClient()
      .build();
   @Deprecated
   public static final NumberOption<Float> SKULL_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("uhc-overlay", "skull-scale"))
         .type(TypeToken.get(Float.class)))
      .min(1.0F)
      .max(5.0F)
      .notifyClient()
      .build();

   private ModUhcOverlay() {
   }
}
