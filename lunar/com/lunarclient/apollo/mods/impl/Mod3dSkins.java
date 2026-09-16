package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

public final class Mod3dSkins {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> RENDER_DISTANCE_LOD = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("3d-skins", "render-distance-lod"))
         .type(TypeToken.get(Integer.class)))
      .min(5)
      .max(40)
      .defaultValue(14)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> SHOW_OTHERS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "show-others"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ENABLE_HAT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "enable-hat"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ENABLE_JACKET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "enable-jacket"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ENABLE_LEFT_SLEEVE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "enable-left-sleeve"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ENABLE_RIGHT_SLEEVE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "enable-right-sleeve"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ENABLE_LEFT_PANTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "enable-left-pants"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ENABLE_RIGHT_PANTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "enable-right-pants"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final NumberOption<Float> BASE_VOXEL_SIZE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("3d-skins", "base-voxel-size"))
         .type(TypeToken.get(Float.class)))
      .min(1.001F)
      .max(1.4F)
      .defaultValue(1.15F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> BODY_VOXEL_WIDTH_SIZE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("3d-skins", "body-voxel-width-size"))
         .type(TypeToken.get(Float.class)))
      .min(1.001F)
      .max(1.4F)
      .defaultValue(1.05F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> HEAD_VOXEL_SIZE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("3d-skins", "head-voxel-size"))
         .type(TypeToken.get(Float.class)))
      .min(1.001F)
      .max(1.25F)
      .defaultValue(1.18F)
      .notifyClient()
      .build();
   public static final NumberOption<Float> FIRST_PERSON_VOXEL_SIZE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("3d-skins", "first-person-voxel-size"))
         .type(TypeToken.get(Float.class)))
      .min(1.001F)
      .max(1.3F)
      .defaultValue(1.1F)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> ENABLE_SKULLS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "enable-skulls"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ENABLE_SKULLS_ITEMS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("3d-skins", "enable-skulls-items"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final NumberOption<Float> SKULL_VOXEL_SIZE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("3d-skins", "skull-voxel-size"))
         .type(TypeToken.get(Float.class)))
      .min(1.001F)
      .max(1.2F)
      .defaultValue(1.1F)
      .notifyClient()
      .build();

   private Mod3dSkins() {
   }
}
