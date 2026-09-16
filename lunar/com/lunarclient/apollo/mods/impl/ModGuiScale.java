package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

public final class ModGuiScale {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("gui-scale", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> HOTBAR_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("gui-scale", "hotbar-scale"))
         .type(TypeToken.get(Float.class)))
      .min(0.25F)
      .max(2.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Integer> INVENTORY_SCALE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("gui-scale", "inventory-scale"))
         .type(TypeToken.get(Integer.class)))
      .min(1)
      .max(5)
      .defaultValue(2)
      .notifyClient()
      .build();

   private ModGuiScale() {
   }
}
