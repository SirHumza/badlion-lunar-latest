package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

public final class ModZoom {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("zoom", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> TOGGLE_KEY_ZOOM = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Quickly pressing and releasing the key will toggle zoom"))
                  .node("zoom", "toggle-key-zoom"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SMOOTH_CAMERA = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("When zoomed in the camera movement will move smoothly (cinematic camera)"))
                  .node("zoom", "smooth-camera"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> SMOOTH_ZOOM = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Add a transition when zooming in and out."))
                  .node("zoom", "smooth-zoom"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> VARIABLE_ZOOM = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Adjust the zoom depth using Mouse Scroll Wheel"))
                  .node("zoom", "variable-zoom"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Float> ZOOM_SCROLL_SPEED = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
            .node("zoom", "zoom-scroll-speed"))
         .type(TypeToken.get(Float.class)))
      .min(0.25F)
      .max(5.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();
   public static final NumberOption<Integer> ZOOM_DIVISOR = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Change the initial zoom depth."))
            .node("zoom", "zoom-divisor"))
         .type(TypeToken.get(Integer.class)))
      .min(2)
      .max(10)
      .defaultValue(4)
      .notifyClient()
      .build();
   public static final NumberOption<Float> CAMERA_SENSITIVITY = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Change the camera sensitivity when zoomed in."))
            .node("zoom", "camera-sensitivity"))
         .type(TypeToken.get(Float.class)))
      .min(0.1F)
      .max(2.0F)
      .defaultValue(1.0F)
      .notifyClient()
      .build();

   private ModZoom() {
   }
}
