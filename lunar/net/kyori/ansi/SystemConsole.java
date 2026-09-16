package net.kyori.ansi;

final class SystemConsole {
   private SystemConsole() {
   }

   static boolean isTerminal() {
      return System.console() != null;
   }
}
