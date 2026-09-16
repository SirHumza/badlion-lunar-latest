package com.wrapper.spotify.enums;

import java.util.HashMap;
import java.util.Map;

public enum ReleaseDatePrecision {
   DAY("day"),
   MONTH("month"),
   YEAR("year");

   private static Map<String, ReleaseDatePrecision> map = new HashMap<>();
   public final String precision;

   ReleaseDatePrecision(String precision) {
      this.precision = precision;
   }

   public static ReleaseDatePrecision keyOf(String precision) {
      return map.get(precision);
   }

   public String getPrecision() {
      return this.precision;
   }

   static {
      for (ReleaseDatePrecision releaseDatePrecision : values()) {
         map.put(releaseDatePrecision.precision, releaseDatePrecision);
      }
   }
}
