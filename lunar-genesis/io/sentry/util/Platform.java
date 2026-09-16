package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class Platform {
   static boolean isAndroid;
   static boolean isJavaNinePlus;

   public static boolean isAndroid() {
      return isAndroid;
   }

   public static boolean isJvm() {
      return !isAndroid;
   }

   public static boolean isJavaNinePlus() {
      return isJavaNinePlus;
   }

   static {
      try {
         isAndroid = "The Android Project".equals(System.getProperty("java.vendor"));
      } catch (Throwable var4) {
         isAndroid = false;
      }

      try {
         String var0 = System.getProperty("java.specification.version");
         if (var0 != null) {
            double var1 = Double.valueOf(var0);
            isJavaNinePlus = var1 >= 9.0;
         } else {
            isJavaNinePlus = false;
         }
      } catch (Throwable var3) {
         isJavaNinePlus = false;
      }
   }
}
