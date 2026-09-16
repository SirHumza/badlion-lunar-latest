package net.kyori.examination.string;

import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;

final class Strings {
   private Strings() {
   }

   @NotNull
   static String withSuffix(String var0, char var1) {
      return var0 + var1;
   }

   @NotNull
   static String wrapIn(String var0, char var1) {
      return var1 + var0 + var1;
   }

   static int maxLength(Stream<String> var0) {
      return var0.mapToInt(String::length).max().orElse(0);
   }

   @NotNull
   static String repeat(@NotNull String var0, int var1) {
      if (var1 == 0) {
         return "";
      }

      if (var1 == 1) {
         return var0;
      }

      StringBuilder var2 = new StringBuilder(var0.length() * var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.append(var0);
      }

      return var2.toString();
   }

   @NotNull
   static String padEnd(@NotNull String var0, int var1, char var2) {
      return var0.length() >= var1 ? var0 : String.format("%-" + var1 + "s", var2);
   }
}
