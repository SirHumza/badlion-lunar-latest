package org.slf4j.helpers;

import java.io.PrintStream;

public class Reporter {
   static final String SLF4J_DEBUG_PREFIX = "SLF4J(D): ";
   static final String SLF4J_INFO_PREFIX = "SLF4J(I): ";
   static final String SLF4J_WARN_PREFIX = "SLF4J(W): ";
   static final String SLF4J_ERROR_PREFIX = "SLF4J(E): ";
   public static final String SLF4J_INTERNAL_REPORT_STREAM_KEY = "slf4j.internal.report.stream";
   private static final String[] SYSOUT_KEYS = new String[]{"System.out", "stdout", "sysout"};
   public static final String SLF4J_INTERNAL_VERBOSITY_KEY = "slf4j.internal.verbosity";
   private static final Reporter.TargetChoice TARGET_CHOICE = getTargetChoice();
   private static final Reporter.Level INTERNAL_VERBOSITY = initVerbosity();

   private static Reporter.TargetChoice getTargetChoice() {
      String var0 = System.getProperty("slf4j.internal.report.stream");
      if (var0 != null && !var0.isEmpty()) {
         for (String var4 : SYSOUT_KEYS) {
            if (var4.equalsIgnoreCase(var0)) {
               return Reporter.TargetChoice.Stdout;
            }
         }

         return Reporter.TargetChoice.Stderr;
      } else {
         return Reporter.TargetChoice.Stderr;
      }
   }

   private static Reporter.Level initVerbosity() {
      String var0 = System.getProperty("slf4j.internal.verbosity");
      if (var0 == null || var0.isEmpty()) {
         return Reporter.Level.INFO;
      } else if (var0.equalsIgnoreCase("DEBUG")) {
         return Reporter.Level.DEBUG;
      } else if (var0.equalsIgnoreCase("ERROR")) {
         return Reporter.Level.ERROR;
      } else {
         return var0.equalsIgnoreCase("WARN") ? Reporter.Level.WARN : Reporter.Level.INFO;
      }
   }

   static boolean isEnabledFor(Reporter.Level var0) {
      return var0.levelInt >= INTERNAL_VERBOSITY.levelInt;
   }

   private static PrintStream getTarget() {
      switch (TARGET_CHOICE) {
         case Stderr:
         default:
            return System.err;
         case Stdout:
            return System.out;
      }
   }

   public static void debug(String var0) {
      if (isEnabledFor(Reporter.Level.DEBUG)) {
         getTarget().println("SLF4J(D): " + var0);
      }
   }

   public static void info(String var0) {
      if (isEnabledFor(Reporter.Level.INFO)) {
         getTarget().println("SLF4J(I): " + var0);
      }
   }

   public static final void warn(String var0) {
      if (isEnabledFor(Reporter.Level.WARN)) {
         getTarget().println("SLF4J(W): " + var0);
      }
   }

   public static final void error(String var0, Throwable var1) {
      getTarget().println("SLF4J(E): " + var0);
      getTarget().println("SLF4J(E): Reported exception:");
      var1.printStackTrace(getTarget());
   }

   public static final void error(String var0) {
      getTarget().println("SLF4J(E): " + var0);
   }

   private enum Level {
      DEBUG(0),
      INFO(1),
      WARN(2),
      ERROR(3);

      int levelInt;

      Level(int var3) {
         this.levelInt = var3;
      }

      private int getLevelInt() {
         return this.levelInt;
      }
   }

   private enum TargetChoice {
      Stderr,
      Stdout;
   }
}
