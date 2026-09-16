package com.lunarclient.adventure.utils;

import com.lunarclient.adventure.examiner.CompactStringExaminer;
import com.lunarclient.adventure.examiner.TerminalStringExaminer;
import java.util.function.Function;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.NotNull;

public class AdventureUtils {
   public static final boolean IS_RUNNING_TEST = isRunningTest();
   public static final Function<String, String> DEFAULT_ESCAPER = var0 -> var0.replace("\"", "\\\"")
      .replace("\\", "\\\\")
      .replace("\b", "\\b")
      .replace("\f", "\\f")
      .replace("\n", "\\n")
      .replace("\r", "\\r")
      .replace("\t", "\\t");
   private static final CompactStringExaminer COMPACT_STRING_EXAMINER;
   private static final TerminalStringExaminer TERMINAL_STRING_EXAMINER;

   @NotNull
   public static String toCompactString(@NotNull Examinable var0) {
      return var0.examine(COMPACT_STRING_EXAMINER);
   }

   @NotNull
   public static String toTerminalString(@NotNull Examinable var0) {
      return var0.examine(TERMINAL_STRING_EXAMINER);
   }

   private static boolean isRunningTest() {
      for (StackTraceElement var3 : Thread.currentThread().getStackTrace()) {
         if (var3.getClassName().startsWith("org.junit.")) {
            return true;
         }
      }

      return false;
   }

   static {
      if (System.getenv("COLORTERM") == null && System.getenv("TERM") == null) {
         System.setProperty("net.kyori.ansi.colorLevel", "truecolor");
      }

      COMPACT_STRING_EXAMINER = new CompactStringExaminer();
      TERMINAL_STRING_EXAMINER = new TerminalStringExaminer();
   }
}
