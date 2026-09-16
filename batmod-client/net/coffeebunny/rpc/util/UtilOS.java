package net.coffeebunny.rpc.util;

public class UtilOS {
   public static boolean isMac() {
      return getOS().toLowerCase().startsWith("mac");
   }

   public static boolean isWindows() {
      return getOS().toLowerCase().startsWith("win");
   }

   public static String getOS() {
      return System.getProperty("os.name").toLowerCase();
   }
}
