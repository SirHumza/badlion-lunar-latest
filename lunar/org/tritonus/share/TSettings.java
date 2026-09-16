package org.tritonus.share;

public class TSettings {
   public static boolean SHOW_ACCESS_CONTROL_EXCEPTIONS = false;
   private static final String PROPERTY_PREFIX = "tritonus.";
   public static boolean AlsaUsePlughw = getBooleanProperty("AlsaUsePlughw");

   private static boolean getBooleanProperty(String var0) {
      String var1 = "tritonus." + var0;
      String var2 = System.getProperty(var1, "false");
      return var2.equalsIgnoreCase("true");
   }
}
