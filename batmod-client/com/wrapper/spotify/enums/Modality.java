package com.wrapper.spotify.enums;

import java.util.HashMap;
import java.util.Map;

public enum Modality {
   MAJOR(1),
   MINOR(0);

   private static Map<Integer, Modality> map = new HashMap<>();
   public final int mode;

   Modality(int mode) {
      this.mode = mode;
   }

   public static Modality keyOf(int mode) {
      return map.get(mode);
   }

   public int getType() {
      return this.mode;
   }

   static {
      for (Modality modality : values()) {
         map.put(modality.mode, modality);
      }
   }
}
