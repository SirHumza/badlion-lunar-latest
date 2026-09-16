package org.slf4j;

import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.Reporter;
import org.slf4j.spi.SLF4JServiceProvider;

public class MarkerFactory {
   static IMarkerFactory MARKER_FACTORY;

   private MarkerFactory() {
   }

   public static Marker getMarker(String var0) {
      return MARKER_FACTORY.getMarker(var0);
   }

   public static Marker getDetachedMarker(String var0) {
      return MARKER_FACTORY.getDetachedMarker(var0);
   }

   public static IMarkerFactory getIMarkerFactory() {
      return MARKER_FACTORY;
   }

   static {
      SLF4JServiceProvider var0 = LoggerFactory.getProvider();
      if (var0 != null) {
         MARKER_FACTORY = var0.getMarkerFactory();
      } else {
         Reporter.error("Failed to find provider");
         Reporter.error("Defaulting to BasicMarkerFactory.");
         MARKER_FACTORY = new BasicMarkerFactory();
      }
   }
}
