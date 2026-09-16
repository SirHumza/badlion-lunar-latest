package com.moonsworth.lunar.client.util;

import java.io.File;
import java.io.IOException;
import lombok.Generated;

public final class ROOCOCCCIRHHHIRIOIHHHHRHIICHHR {
   public static boolean RORCHCIIICOHIRROOORHOCCCCIOCCI(File var0) {
      if (var0.exists() && var0.isDirectory()) {
         String var1 = var0.getAbsolutePath();
         String var2 = null;
         if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isWindows()) {
            var2 = "explorer.exe";
         } else if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isMacos()) {
            var2 = "open";
         } else if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isLinux()) {
            var2 = "xdg-open";
         }

         if (var2 != null) {
            try {
               new ProcessBuilder(var2, var1).start();
               return true;
            } catch (IOException var4) {
               var4.printStackTrace();
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Generated
   private ROOCOCCCIRHHHIRIOIHHHHRHIICHHR() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
