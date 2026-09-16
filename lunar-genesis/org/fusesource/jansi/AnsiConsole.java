package org.fusesource.jansi;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Locale;
import org.fusesource.jansi.internal.CLibrary;
import org.fusesource.jansi.internal.Kernel32;
import org.fusesource.jansi.io.AnsiOutputStream;
import org.fusesource.jansi.io.AnsiProcessor;
import org.fusesource.jansi.io.FastBufferedOutputStream;
import org.fusesource.jansi.io.WindowsAnsiProcessor;

public class AnsiConsole {
   public static final String JANSI_MODE = "jansi.mode";
   public static final String JANSI_OUT_MODE = "jansi.out.mode";
   public static final String JANSI_ERR_MODE = "jansi.err.mode";
   public static final String JANSI_MODE_STRIP = "strip";
   public static final String JANSI_MODE_FORCE = "force";
   public static final String JANSI_MODE_DEFAULT = "default";
   public static final String JANSI_COLORS = "jansi.colors";
   public static final String JANSI_OUT_COLORS = "jansi.out.colors";
   public static final String JANSI_ERR_COLORS = "jansi.err.colors";
   public static final String JANSI_COLORS_16 = "16";
   public static final String JANSI_COLORS_256 = "256";
   public static final String JANSI_COLORS_TRUECOLOR = "truecolor";
   @Deprecated
   public static final String JANSI_PASSTHROUGH = "jansi.passthrough";
   @Deprecated
   public static final String JANSI_STRIP = "jansi.strip";
   @Deprecated
   public static final String JANSI_FORCE = "jansi.force";
   @Deprecated
   public static final String JANSI_EAGER = "jansi.eager";
   public static final String JANSI_NORESET = "jansi.noreset";
   @Deprecated
   public static PrintStream system_out = System.out;
   @Deprecated
   public static PrintStream out;
   @Deprecated
   public static PrintStream system_err = System.err;
   @Deprecated
   public static PrintStream err;
   static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase(Locale.ENGLISH).contains("win");
   static final boolean IS_CYGWIN = IS_WINDOWS && System.getenv("PWD") != null && System.getenv("PWD").startsWith("/");
   static final boolean IS_MSYSTEM = IS_WINDOWS
      && System.getenv("MSYSTEM") != null
      && (System.getenv("MSYSTEM").startsWith("MINGW") || System.getenv("MSYSTEM").equals("MSYS"));
   static final boolean IS_CONEMU = IS_WINDOWS && System.getenv("ConEmuPID") != null;
   static final int ENABLE_VIRTUAL_TERMINAL_PROCESSING = 4;
   static int STDOUT_FILENO = 1;
   static int STDERR_FILENO = 2;
   private static boolean initialized;
   private static int installed;
   private static int virtualProcessing;

   public static int getTerminalWidth() {
      int var0 = out().getTerminalWidth();
      if (var0 <= 0) {
         var0 = err().getTerminalWidth();
      }

      return var0;
   }

   private AnsiConsole() {
   }

   private static AnsiPrintStream ansiStream(boolean var0) {
      FileDescriptor var1 = var0 ? FileDescriptor.out : FileDescriptor.err;
      FastBufferedOutputStream var2 = new FastBufferedOutputStream(new FileOutputStream(var1));
      String var3 = System.getProperty(var0 ? "sun.stdout.encoding" : "sun.stderr.encoding");
      final int var7 = var0 ? STDOUT_FILENO : STDERR_FILENO;

      boolean var5;
      boolean var6;
      try {
         var5 = CLibrary.isatty(var7) != 0;
         String var8 = System.getenv("TERM");
         String var9 = System.getenv("INSIDE_EMACS");
         if (var5 && "dumb".equals(var8) && var9 != null && !var9.contains("comint")) {
            var5 = false;
         }

         var6 = false;
      } catch (Throwable var24) {
         var5 = false;
         var6 = true;
      }

      boolean var4 = var5;
      AnsiType var10;
      AnsiOutputStream.IoRunnable var11;
      AnsiOutputStream.IoRunnable var12;
      AnsiOutputStream.WidthSupplier var25;
      AnsiProcessor var26;
      if (!var4) {
         var26 = null;
         var10 = var6 ? AnsiType.Unsupported : AnsiType.Redirected;
         var12 = null;
         var11 = null;
         var25 = new AnsiOutputStream.ZeroWidthSupplier();
      } else if (IS_WINDOWS) {
         final long var13 = Kernel32.GetStdHandle(var0 ? Kernel32.STD_OUTPUT_HANDLE : Kernel32.STD_ERROR_HANDLE);
         final int[] var15 = new int[1];
         boolean var16 = Kernel32.GetConsoleMode(var13, var15) != 0;
         if (var16 && Kernel32.SetConsoleMode(var13, var15[0] | 4) != 0) {
            Kernel32.SetConsoleMode(var13, var15[0]);
            var26 = null;
            var10 = AnsiType.VirtualTerminal;
            var11 = new AnsiOutputStream.IoRunnable() {
               @Override
               public void run() {
                  AnsiConsole.virtualProcessing++;
                  Kernel32.SetConsoleMode(var13, var15[0] | 4);
               }
            };
            var12 = new AnsiOutputStream.IoRunnable() {
               @Override
               public void run() {
                  if (--AnsiConsole.virtualProcessing == 0) {
                     Kernel32.SetConsoleMode(var13, var15[0]);
                  }
               }
            };
         } else if ((IS_CONEMU || IS_CYGWIN || IS_MSYSTEM) && !var16) {
            var26 = null;
            var10 = AnsiType.Native;
            var12 = null;
            var11 = null;
         } else {
            AnsiProcessor var17;
            AnsiType var18;
            try {
               var17 = new WindowsAnsiProcessor(var2, var13);
               var18 = AnsiType.Emulation;
            } catch (Throwable var23) {
               var17 = new AnsiProcessor(var2);
               var18 = AnsiType.Unsupported;
            }

            var26 = var17;
            var10 = var18;
            var12 = null;
            var11 = null;
         }

         var25 = new AnsiOutputStream.WidthSupplier() {
            @Override
            public int getTerminalWidth() {
               Kernel32.CONSOLE_SCREEN_BUFFER_INFO var1x = new Kernel32.CONSOLE_SCREEN_BUFFER_INFO();
               Kernel32.GetConsoleScreenBufferInfo(var13, var1x);
               return var1x.windowWidth();
            }
         };
      } else {
         var26 = null;
         var10 = AnsiType.Native;
         var12 = null;
         var11 = null;
         var25 = new AnsiOutputStream.WidthSupplier() {
            @Override
            public int getTerminalWidth() {
               CLibrary.WinSize var1 = new CLibrary.WinSize();
               CLibrary.ioctl(var7, CLibrary.TIOCGWINSZ, var1);
               return var1.ws_col;
            }
         };
      }

      String var14 = System.getProperty(var0 ? "jansi.out.mode" : "jansi.err.mode", System.getProperty("jansi.mode"));
      AnsiMode var27;
      if ("force".equals(var14)) {
         var27 = AnsiMode.Force;
      } else if ("strip".equals(var14)) {
         var27 = AnsiMode.Strip;
      } else if (var14 != null) {
         var27 = var4 ? AnsiMode.Default : AnsiMode.Strip;
      } else if (getBoolean("jansi.passthrough")) {
         var27 = AnsiMode.Force;
      } else if (getBoolean("jansi.strip")) {
         var27 = AnsiMode.Strip;
      } else if (getBoolean("jansi.force")) {
         var27 = AnsiMode.Force;
      } else {
         var27 = var4 ? AnsiMode.Default : AnsiMode.Strip;
      }

      String var31 = System.getProperty(var0 ? "jansi.out.colors" : "jansi.err.colors", System.getProperty("jansi.colors"));
      AnsiColors var28;
      if ("truecolor".equals(var31)) {
         var28 = AnsiColors.TrueColor;
      } else if ("256".equals(var31)) {
         var28 = AnsiColors.Colors256;
      } else if (var31 != null) {
         var28 = AnsiColors.Colors16;
      } else {
         String var29;
         if ((var29 = System.getenv("COLORTERM")) == null || !var29.contains("truecolor") && !var29.contains("24bit")) {
            String var30;
            if ((var30 = System.getenv("TERM")) != null && var30.contains("-direct")) {
               var28 = AnsiColors.TrueColor;
            } else if (var30 != null && var30.contains("-256color")) {
               var28 = AnsiColors.Colors256;
            } else {
               var28 = AnsiColors.Colors16;
            }
         } else {
            var28 = AnsiColors.TrueColor;
         }
      }

      boolean var19 = var10 != AnsiType.Unsupported && !getBoolean("jansi.noreset");
      Charset var20 = Charset.defaultCharset();
      if (var3 != null) {
         try {
            var20 = Charset.forName(var3);
         } catch (UnsupportedCharsetException var22) {
         }
      }

      return newPrintStream(new AnsiOutputStream(var2, var25, var27, var26, var10, var28, var20, var11, var12, var19), var20.name());
   }

   private static AnsiPrintStream newPrintStream(AnsiOutputStream var0, String var1) {
      if (var1 != null) {
         try {
            return new AnsiPrintStream(var0, true, var1);
         } catch (UnsupportedEncodingException var3) {
         }
      }

      return new AnsiPrintStream(var0, true);
   }

   static boolean getBoolean(String var0) {
      boolean var1 = false;

      try {
         String var2 = System.getProperty(var0);
         var1 = var2.isEmpty() || Boolean.parseBoolean(var2);
      } catch (IllegalArgumentException var3) {
      } catch (NullPointerException var4) {
      }

      return var1;
   }

   public static AnsiPrintStream out() {
      initStreams();
      return (AnsiPrintStream)out;
   }

   public static PrintStream sysOut() {
      return system_out;
   }

   public static AnsiPrintStream err() {
      initStreams();
      return (AnsiPrintStream)err;
   }

   public static PrintStream sysErr() {
      return system_err;
   }

   public static synchronized void systemInstall() {
      installed++;
      if (installed == 1) {
         initStreams();

         try {
            ((AnsiPrintStream)out).install();
            ((AnsiPrintStream)err).install();
         } catch (IOException var1) {
            throw new IOError(var1);
         }

         System.setOut(out);
         System.setErr(err);
      }
   }

   public static synchronized boolean isInstalled() {
      return installed > 0;
   }

   public static synchronized void systemUninstall() {
      installed--;
      if (installed == 0) {
         try {
            ((AnsiPrintStream)out).uninstall();
            ((AnsiPrintStream)err).uninstall();
         } catch (IOException var1) {
            throw new IOError(var1);
         }

         initialized = false;
         System.setOut(system_out);
         System.setErr(system_err);
      }
   }

   static synchronized void initStreams() {
      if (!initialized) {
         out = ansiStream(true);
         err = ansiStream(false);
         initialized = true;
      }
   }

   static {
      if (getBoolean("jansi.eager")) {
         initStreams();
      }
   }
}
