package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModTierTagger {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> MC_TIERS_FORMAT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "mc-tiers-format"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SUFFIX = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "suffix"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SEPARATE_NAMETAG = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "separate-nametag"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_GM_ICONS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "show-gm-icons"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_REGION = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "show-region"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SHOW_RETIRED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "show-retired"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_HT1 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-h-t1"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(255, 207, 74)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_MT1 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-m-t1"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(234, 193, 79)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_LT1 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-l-t1"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(213, 179, 85)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_HT2 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-h-t2"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(164, 179, 199)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_MT2 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-m-t2"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(150, 160, 174)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_LT2 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-l-t2"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(136, 141, 149)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_HT3 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-h-t3"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(221, 136, 73)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_MT3 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-m-t3"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(200, 120, 60)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_LT3 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-l-t3"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(179, 104, 48)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_HT4 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-h-t4"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(101, 91, 121)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_MT4 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-m-t4"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(101, 91, 121)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_LT4 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-l-t4"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(101, 91, 121)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_HT5 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-h-t5"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(101, 91, 121)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_MT5 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-m-t5"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(101, 91, 121)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> COLOR_LT5 = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("tier-tagger", "color-l-t5"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(101, 91, 121)))
         .notifyClient())
      .build();

   private ModTierTagger() {
   }
}
