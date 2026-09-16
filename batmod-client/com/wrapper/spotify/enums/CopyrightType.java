package com.wrapper.spotify.enums;

import java.util.HashMap;
import java.util.Map;

public enum CopyrightType {
   C("C"),
   P("P");

   private static Map<String, CopyrightType> map = new HashMap<>();
   public final String type;

   CopyrightType(String type) {
      this.type = type;
   }

   public static CopyrightType keyOf(String type) {
      return map.get(type);
   }

   public String getType() {
      return this.type;
   }

   static {
      for (CopyrightType copyrightType : values()) {
         map.put(copyrightType.type, copyrightType);
      }
   }
}
