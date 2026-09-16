package org.spongepowered.asm.launch.platform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class CommandLineOptions {
   private List<String> configs = new ArrayList<>();

   private CommandLineOptions() {
   }

   public List<String> getConfigs() {
      return Collections.unmodifiableList(this.configs);
   }

   private void parseArgs(List<String> var1) {
      boolean var2 = false;

      for (String var4 : var1) {
         if (var2) {
            this.configs.add(var4);
         }

         var2 = "--mixin".equals(var4) || "--mixin.config".equals(var4);
      }
   }

   public static CommandLineOptions defaultArgs() {
      return ofArgs(null);
   }

   public static CommandLineOptions ofArgs(List<String> var0) {
      CommandLineOptions var1 = new CommandLineOptions();
      if (var0 == null) {
         String var2 = System.getProperty("sun.java.command");
         if (var2 != null) {
            var0 = Arrays.asList(var2.split(" "));
         }
      }

      if (var0 != null) {
         var1.parseArgs(var0);
      }

      return var1;
   }

   public static CommandLineOptions of(List<String> var0) {
      CommandLineOptions var1 = new CommandLineOptions();
      var1.configs.addAll(var0);
      return var1;
   }
}
