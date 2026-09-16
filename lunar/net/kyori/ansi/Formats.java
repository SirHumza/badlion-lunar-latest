package net.kyori.ansi;

import java.util.function.Consumer;

final class Formats {
   private Formats() {
   }

   static String reset() {
      return "0";
   }

   static String bold(boolean var0) {
      return var0 ? "1" : "22";
   }

   static String italics(boolean var0) {
      return var0 ? "3" : "23";
   }

   static String underlined(boolean var0) {
      return var0 ? "4" : "24";
   }

   static String strikethrough(boolean var0) {
      return var0 ? "9" : "29";
   }

   static String obfuscated(boolean var0) {
      return var0 ? "8" : "28";
   }

   static void emit(String var0, StringBuilder var1) {
      var1.append("\u001b[").append(var0).append('m');
   }

   static void emit(Consumer<StringBuilder> var0, StringBuilder var1) {
      var1.append("\u001b[");
      var0.accept(var1);
      var1.append("m");
   }
}
