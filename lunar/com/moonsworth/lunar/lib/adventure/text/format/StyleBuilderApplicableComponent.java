package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.util.HSVLike;
import com.moonsworth.lunar.lib.adventure.util.RGBLike;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public interface TextColor extends StyleBuilderApplicable, TextFormat, RGBLike, Comparable<TextColor>, Examinable {
   char HEX_CHARACTER = '#';
   String HEX_PREFIX = "#";

   @NotNull
   static TextColor color(int var0) {
      int var1 = var0 & 16777215;
      NamedTextColor var2 = NamedTextColor.namedColor(var1);
      return var2 != null ? var2 : new TextColorImpl(var1);
   }

   @NotNull
   static TextColor color(@NotNull RGBLike var0) {
      return var0 instanceof TextColor ? (TextColor)var0 : color(var0.red(), var0.green(), var0.blue());
   }

   @NotNull
   static TextColor color(@NotNull HSVLike var0) {
      float var1 = var0.s();
      float var2 = var0.v();
      if (var1 == 0.0F) {
         return color(var2, var2, var2);
      } else {
         float var3 = var0.h() * 6.0F;
         int var4 = (int)Math.floor(var3);
         float var5 = var3 - var4;
         float var6 = var2 * (1.0F - var1);
         float var7 = var2 * (1.0F - var1 * var5);
         float var8 = var2 * (1.0F - var1 * (1.0F - var5));
         if (var4 == 0) {
            return color(var2, var8, var6);
         } else if (var4 == 1) {
            return color(var7, var2, var6);
         } else if (var4 == 2) {
            return color(var6, var2, var8);
         } else if (var4 == 3) {
            return color(var6, var7, var2);
         } else {
            return var4 == 4 ? color(var8, var6, var2) : color(var2, var6, var7);
         }
      }
   }

   @NotNull
   static TextColor color(@Range(from = 0L, to = 255L) int var0, @Range(from = 0L, to = 255L) int var1, @Range(from = 0L, to = 255L) int var2) {
      return color((var0 & 0xFF) << 16 | (var1 & 0xFF) << 8 | var2 & 0xFF);
   }

   @NotNull
   static TextColor color(float var0, float var1, float var2) {
      return color((int)(var0 * 255.0F), (int)(var1 * 255.0F), (int)(var2 * 255.0F));
   }

   @Nullable
   static TextColor fromHexString(@NotNull String var0) {
      if (var0.startsWith("#")) {
         try {
            int var1 = Integer.parseInt(var0.substring(1), 16);
            return color(var1);
         } catch (NumberFormatException var2) {
            return null;
         }
      } else {
         return null;
      }
   }

   @Nullable
   static TextColor fromCSSHexString(@NotNull String var0) {
      if (var0.startsWith("#")) {
         String var1 = var0.substring(1);
         if (var1.length() != 3 && var1.length() != 6) {
            return null;
         }

         int var2;
         try {
            var2 = Integer.parseInt(var1, 16);
         } catch (NumberFormatException var6) {
            return null;
         }

         if (var1.length() == 6) {
            return color(var2);
         }

         int var3 = (var2 & 3840) >> 8 | (var2 & 3840) >> 4;
         int var4 = (var2 & 240) >> 4 | var2 & 240;
         int var5 = (var2 & 15) << 4 | var2 & 15;
         return color(var3, var4, var5);
      } else {
         return null;
      }
   }

   int value();

   @NotNull
   default String asHexString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("#");
      String var2 = Integer.toHexString(this.value());

      for (int var3 = 0; var3 < 6 - var2.length(); var3++) {
         var1.append('0');
      }

      var1.append(var2);
      return var1.toString().toUpperCase(Locale.ROOT);
   }

   @Override
   default @Range(from = 0L, to = 255L) int red() {
      return this.value() >> 16 & 0xFF;
   }

   @Override
   default @Range(from = 0L, to = 255L) int green() {
      return this.value() >> 8 & 0xFF;
   }

   @Override
   default @Range(from = 0L, to = 255L) int blue() {
      return this.value() & 0xFF;
   }

   @NotNull
   static TextColor lerp(float var0, @NotNull RGBLike var1, @NotNull RGBLike var2) {
      float var3 = Math.min(1.0F, Math.max(0.0F, var0));
      int var4 = var1.red();
      int var5 = var2.red();
      int var6 = var1.green();
      int var7 = var2.green();
      int var8 = var1.blue();
      int var9 = var2.blue();
      return color(Math.round(var4 + var3 * (var5 - var4)), Math.round(var6 + var3 * (var7 - var6)), Math.round(var8 + var3 * (var9 - var8)));
   }

   @NotNull
   static <C extends TextColor> C nearestColorTo(@NotNull List<C> var0, @NotNull TextColor var1) {
      Objects.requireNonNull(var1, "color");
      float var2 = Float.MAX_VALUE;
      TextColor var3 = (TextColor)var0.get(0);
      int var4 = 0;

      for (int var5 = var0.size(); var4 < var5; var4++) {
         TextColor var6 = (TextColor)var0.get(var4);
         float var7 = TextColorImpl.distance(var1.asHSV(), var6.asHSV());
         if (var7 < var2) {
            var3 = var6;
            var2 = var7;
         }

         if (var7 == 0.0F) {
            break;
         }
      }

      return (C)var3;
   }

   @Override
   default void styleApply(Style.@NotNull Builder var1) {
      var1.color(this);
   }

   default int compareTo(TextColor var1) {
      return Integer.compare(this.value(), var1.value());
   }

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("value", this.asHexString()));
   }
}
