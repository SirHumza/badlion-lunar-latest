package org.fusesource.jansi;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;
import org.fusesource.jansi.internal.CLibrary;
import org.fusesource.jansi.internal.JansiLoader;

public class AnsiMain {
   public static void main(String... var0) {
      System.out.println("Jansi " + getJansiVersion());
      System.out.println();
      System.out.println("library.jansi.path= " + System.getProperty("library.jansi.path", ""));
      System.out.println("library.jansi.version= " + System.getProperty("library.jansi.version", ""));
      JansiLoader.initialize();
      System.out.println("Jansi native library loaded from " + JansiLoader.getNativeLibraryPath());
      if (JansiLoader.getNativeLibrarySourceUrl() != null) {
         System.out.println("   which was auto-extracted from " + JansiLoader.getNativeLibrarySourceUrl());
      }

      System.out.println();
      System.out
         .println(
            "os.name= " + System.getProperty("os.name") + ", os.version= " + System.getProperty("os.version") + ", os.arch= " + System.getProperty("os.arch")
         );
      System.out.println("file.encoding= " + System.getProperty("file.encoding"));
      System.out
         .println(
            "java.version= "
               + System.getProperty("java.version")
               + ", java.vendor= "
               + System.getProperty("java.vendor")
               + ", java.home= "
               + System.getProperty("java.home")
         );
      System.out.println();
      System.out.println("jansi.mode= " + System.getProperty("jansi.mode", ""));
      System.out.println("jansi.out.mode= " + System.getProperty("jansi.out.mode", ""));
      System.out.println("jansi.err.mode= " + System.getProperty("jansi.err.mode", ""));
      System.out.println("jansi.colors= " + System.getProperty("jansi.colors", ""));
      System.out.println("jansi.out.colors= " + System.getProperty("jansi.out.colors", ""));
      System.out.println("jansi.err.colors= " + System.getProperty("jansi.err.colors", ""));
      System.out.println("jansi.passthrough= " + AnsiConsole.getBoolean("jansi.passthrough"));
      System.out.println("jansi.strip= " + AnsiConsole.getBoolean("jansi.strip"));
      System.out.println("jansi.force= " + AnsiConsole.getBoolean("jansi.force"));
      System.out.println("jansi.noreset= " + AnsiConsole.getBoolean("jansi.noreset"));
      System.out.println(Ansi.DISABLE + "= " + AnsiConsole.getBoolean(Ansi.DISABLE));
      System.out.println();
      System.out.println("IS_WINDOWS: " + AnsiConsole.IS_WINDOWS);
      if (AnsiConsole.IS_WINDOWS) {
         System.out.println("IS_CONEMU: " + AnsiConsole.IS_CONEMU);
         System.out.println("IS_CYGWIN: " + AnsiConsole.IS_CYGWIN);
         System.out.println("IS_MSYSTEM: " + AnsiConsole.IS_MSYSTEM);
      }

      System.out.println();
      diagnoseTty(false);
      diagnoseTty(true);
      AnsiConsole.systemInstall();
      System.out.println();
      System.out.println("Resulting Jansi modes for stout/stderr streams:");
      System.out.println("  - System.out: " + AnsiConsole.out().toString());
      System.out.println("  - System.err: " + AnsiConsole.err().toString());
      System.out.println("Processor types description:");

      for (AnsiType var4 : AnsiType.values()) {
         System.out.println("  - " + var4 + ": " + var4.getDescription());
      }

      System.out.println("Colors support description:");

      for (AnsiColors var22 : AnsiColors.values()) {
         System.out.println("  - " + var22 + ": " + var22.getDescription());
      }

      System.out.println("Modes description:");

      for (AnsiMode var23 : AnsiMode.values()) {
         System.out.println("  - " + var23 + ": " + var23.getDescription());
      }

      try {
         System.out.println();
         testAnsi(false);
         testAnsi(true);
         if (var0.length == 0) {
            printJansiLogoDemo();
            return;
         }

         System.out.println();
         if (var0.length == 1) {
            File var11 = new File(var0[0]);
            if (var11.exists()) {
               System.out.println(Ansi.ansi().bold().a("\"" + var0[0] + "\" content:").reset());
               writeFileContent(var11);
               return;
            }
         }

         System.out.println(Ansi.ansi().bold().a("original args:").reset());
         int var12 = 1;

         for (String var5 : var0) {
            AnsiConsole.system_out.print(var12++ + ": ");
            AnsiConsole.system_out.println(var5);
         }

         System.out.println(Ansi.ansi().bold().a("Jansi filtered args:").reset());
         var12 = 1;

         for (String var26 : var0) {
            System.out.print(var12++ + ": ");
            System.out.println(var26);
         }
      } finally {
         AnsiConsole.systemUninstall();
      }
   }

   private static String getJansiVersion() {
      Package var0 = AnsiMain.class.getPackage();
      return var0 == null ? null : var0.getImplementationVersion();
   }

   private static void diagnoseTty(boolean var0) {
      int var1 = var0 ? CLibrary.STDERR_FILENO : CLibrary.STDOUT_FILENO;
      int var2 = CLibrary.isatty(var1);
      System.out
         .println(
            "isatty(STD"
               + (var0 ? "ERR" : "OUT")
               + "_FILENO): "
               + var2
               + ", System."
               + (var0 ? "err" : "out")
               + " "
               + (var2 == 0 ? "is *NOT*" : "is")
               + " a terminal"
         );
   }

   private static void testAnsi(boolean var0) {
      PrintStream var1 = var0 ? System.err : System.out;
      var1.print("test on System." + (var0 ? "err" : "out") + ":");

      for (Ansi.Color var5 : Ansi.Color.values()) {
         var1.print(" " + Ansi.ansi().fg(var5) + var5 + Ansi.ansi().reset());
      }

      var1.println();
      var1.print("            bright:");

      for (Ansi.Color var25 : Ansi.Color.values()) {
         var1.print(" " + Ansi.ansi().fgBright(var25) + var25 + Ansi.ansi().reset());
      }

      var1.println();
      var1.print("              bold:");

      for (Ansi.Color var26 : Ansi.Color.values()) {
         var1.print(" " + Ansi.ansi().bold().fg(var26) + var26 + Ansi.ansi().reset());
      }

      var1.println();
      var1.print("             faint:");

      for (Ansi.Color var27 : Ansi.Color.values()) {
         var1.print(" " + Ansi.ansi().a(Ansi.Attribute.INTENSITY_FAINT).fg(var27) + var27 + Ansi.ansi().reset());
      }

      var1.println();
      var1.print("        bold+faint:");

      for (Ansi.Color var28 : Ansi.Color.values()) {
         var1.print(" " + Ansi.ansi().bold().a(Ansi.Attribute.INTENSITY_FAINT).fg(var28) + var28 + Ansi.ansi().reset());
      }

      var1.println();
      Ansi var11 = Ansi.ansi();
      var11.a("        256 colors: ");

      for (int var17 = 0; var17 < 216; var17++) {
         if (var17 > 0 && var17 % 36 == 0) {
            var11.reset();
            var11.newline();
            var11.a("                    ");
         } else if (var17 > 0 && var17 % 6 == 0) {
            var11.reset();
            var11.a("  ");
         }

         int var23 = var17 % 6;
         int var29 = var17 / 6 % 6;
         int var6 = var17 / 36;
         var11.bg(16 + var23 + var6 * 6 + var29 * 36).a(' ');
      }

      var11.reset();
      var1.println(var11);
      var11 = Ansi.ansi();
      var11.a("         truecolor: ");

      for (int var18 = 0; var18 < 256; var18++) {
         if (var18 > 0 && var18 % 48 == 0) {
            var11.reset();
            var11.newline();
            var11.a("                    ");
         }

         int var24 = 255 - var18;
         int var30 = var18 * 2 > 255 ? 255 - 2 * var18 : 2 * var18;
         int var31 = var18;
         var11.bgRgb(var24, var30, var31).fgRgb(255 - var24, 255 - var30, 255 - var31).a((char)(var18 % 2 == 0 ? '/' : '\\'));
      }

      var11.reset();
      var1.println(var11);
   }

   private static String getPomPropertiesVersion(String var0) {
      InputStream var1 = AnsiMain.class.getResourceAsStream("/META-INF/maven/" + var0 + "/pom.properties");
      if (var1 == null) {
         return null;
      }

      try {
         Properties var2 = new Properties();
         var2.load(var1);
         return var2.getProperty("version");
      } finally {
         closeQuietly(var1);
      }
   }

   private static void printJansiLogoDemo() {
      BufferedReader var0 = new BufferedReader(new InputStreamReader(AnsiMain.class.getResourceAsStream("jansi.txt"), "UTF-8"));

      String var1;
      try {
         while ((var1 = var0.readLine()) != null) {
            System.out.println(var1);
         }
      } finally {
         closeQuietly(var0);
      }
   }

   private static void writeFileContent(File var0) {
      FileInputStream var1 = new FileInputStream(var0);

      try {
         byte[] var2 = new byte[1024];
         int var3 = 0;

         while ((var3 = var1.read(var2)) >= 0) {
            System.out.write(var2, 0, var3);
         }
      } finally {
         closeQuietly(var1);
      }
   }

   private static void closeQuietly(Closeable var0) {
      try {
         var0.close();
      } catch (IOException var2) {
         var2.printStackTrace(System.err);
      }
   }
}
