package com.wrapper.spotify.enums;

import java.util.HashMap;
import java.util.Map;

public enum ProductType {
   BASIC_DESKTOP("basic-desktop"),
   DAYPASS("daypass"),
   FREE("free"),
   OPEN("open"),
   PREMIUM("premium");

   private static Map<String, ProductType> map = new HashMap<>();
   public final String type;

   ProductType(String type) {
      this.type = type;
   }

   public static ProductType keyOf(String type) {
      return map.get(type);
   }

   public String getType() {
      return this.type;
   }

   static {
      for (ProductType productType : values()) {
         map.put(productType.type, productType);
      }
   }
}
