package io.sigpipe.jbsdiff.ui;

import java.io.File;

public class CLI {
   public static void main(String[] var0) {
      if (var0.length < 4) {
         System.out.println("Not enough parameters!");
         printUsage();
      }

      String var1 = System.getProperty("jbsdiff.compressor", "bzip2");
      var1 = var1.toLowerCase();

      try {
         String var2 = var0[0].toLowerCase();
         File var3 = new File(var0[1]);
         File var4 = new File(var0[2]);
         File var5 = new File(var0[3]);
         if (var2.equals("diff")) {
            FileUI.diff(var3, var4, var5, var1);
         } else if (var2.equals("patch")) {
            FileUI.patch(var3, var4, var5);
         } else {
            printUsage();
         }
      } catch (Exception var6) {
         var6.printStackTrace();
         System.exit(1);
      }
   }

   public static void printUsage() {
      String var0 = String.format(
         "Usage: command <oldfile> <newfile> <patchfile>%n%nCommands:%n    diff%n    patch%n%nUse the jbsdiff.compressor property to select a different compression scheme:%n    java -Djbsdiff.compressor=gz -jar jbsdiff-*.jar diff a.bin b.bin patch.gz%n%nSupported compression schemes: bzip2 (default), gz, pack200, xz.%n%nThe compression algorithm used will be detected automatically during %npatch operations.  NOTE: algorithms other than bzip2 are incompatible %nwith the reference implementation of bsdiff!"
      );
      System.out.println(var0);
      System.exit(1);
   }
}
