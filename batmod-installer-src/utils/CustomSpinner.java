package com.batmod.installer.utils;

import java.io.File;

public enum CustomSpinner {
   Logger(
      "Linux", System.getProperty("user.home") + "/.minecraft"
   ),
   Button("Solaris"),
   CustomSpinner("Windows", System.getenv("APPDATA") + "\\.minecraft"),
   ButtonAction(
      "macOS", System.getProperty("user.home") + "/Library/Application Support/minecraft"
   ),
   Spinner("Unknown");

   private final String Checkbox;
   private final String ProgressBar;

   CustomSpinner(String var3) {
      this(var3, "");
   }

   CustomSpinner(String var3, String var4) {
      this.Checkbox = var3;
      this.ProgressBar = var4.replace("/", File.separator);
   }

   public String Logger() {
      return this.Checkbox;
   }

   public String Button() {
      return this.ProgressBar;
   }

   public static CustomSpinner CustomSpinner() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")
         ? CustomSpinner
         : (
            var0.contains("mac")
               ? ButtonAction
               : (
                  var0.contains("solaris")
                     ? Button
                     : (
                        var0.contains("sunos")
                           ? Button
                           : (
                              var0.contains("linux")
                                 ? Logger
                                 : (
                                    var0.contains("unix")
                                       ? Logger
                                       : Spinner
                                 )
                           )
                     )
               )
         );
   }
}
