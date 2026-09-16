package com.wrapper.spotify.enums;

import java.util.HashMap;
import java.util.Map;

public enum AlbumType {
   ALBUM("album"),
   APPEARS_ON("appears_on"),
   COMPILATION("compilation"),
   SINGLE("single");

   private static Map<String, AlbumType> map = new HashMap<>();
   public final String type;

   AlbumType(String type) {
      this.type = type;
   }

   public static AlbumType keyOf(String type) {
      return map.get(type);
   }

   public String getType() {
      return this.type;
   }

   static {
      for (AlbumType albumType : values()) {
         map.put(albumType.type, albumType);
      }
   }
}
