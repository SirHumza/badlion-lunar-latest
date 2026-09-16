package com.wrapper.spotify.enums;

import java.util.HashMap;
import java.util.Map;

public enum ModelObjectType {
   ALBUM("album"),
   ARTIST("artist"),
   AUDIO_FEATURES("audio_features"),
   GENRE("genre"),
   PLAYLIST("playlist"),
   TRACK("track"),
   USER("user");

   private static Map<String, ModelObjectType> map = new HashMap<>();
   public final String type;

   ModelObjectType(String type) {
      this.type = type;
   }

   public static ModelObjectType keyOf(String type) {
      return map.get(type);
   }

   public String getType() {
      return this.type;
   }

   static {
      for (ModelObjectType modelObjectType : values()) {
         map.put(modelObjectType.type, modelObjectType);
      }
   }
}
