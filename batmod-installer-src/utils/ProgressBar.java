package com.batmod.installer.utils;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class ProgressBar {
   public static void Logger(String var0) {
      Desktop var1 = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
      if (var1 != null && var1.isSupported(Action.BROWSE)) {
         try {
            var1.browse(new URI(var0));
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }
   }
}
