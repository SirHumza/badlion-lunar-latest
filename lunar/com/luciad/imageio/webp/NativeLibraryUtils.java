package com.luciad.imageio.webp;

class NativeLibraryUtils {
   public static void loadLibrary() {
      String var0 = System.getenv("PROCESSOR_ARCHITECTURE");
      if (var0 == null) {
         var0 = System.getProperty("os.arch");
      }

      String var1 = var0.contains("64") ? "64" : "32";

      try {
         System.loadLibrary("webp-imageio" + var1);
      } catch (UnsatisfiedLinkError var3) {
         var3.printStackTrace();
      }
   }
}
