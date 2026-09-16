package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.util.ARGBLike;
import com.moonsworth.lunar.lib.adventure.util.RGBLike;
import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public interface ShadowColor extends StyleBuilderApplicable, ARGBLike {
   @NotNull
   static ShadowColor lerp(float var0, @NotNull ARGBLike var1, @NotNull ARGBLike var2) {
      float var3 = Math.min(1.0F, Math.max(0.0F, var0));
      int var4 = var1.red();
      int var5 = var2.red();
      int var6 = var1.green();
      int var7 = var2.green();
      int var8 = var1.blue();
      int var9 = var2.blue();
      int var10 = var1.alpha();
      int var11 = var2.alpha();
      return shadowColor(
         Math.round(var4 + var3 * (var5 - var4)),
         Math.round(var6 + var3 * (var7 - var6)),
         Math.round(var8 + var3 * (var9 - var8)),
         Math.round(var10 + var3 * (var11 - var10))
      );
   }

   @NotNull
   static ShadowColor none() {
      return ShadowColorImpl.NONE;
   }

   @Contract(pure = true)
   @NotNull
   static ShadowColor shadowColor(int var0) {
      return var0 == 0 ? none() : new ShadowColorImpl(var0);
   }

   @Contract(pure = true)
   @NotNull
   static ShadowColor shadowColor(
      @Range(from = 0L, to = 255L) int var0,
      @Range(from = 0L, to = 255L) int var1,
      @Range(from = 0L, to = 255L) int var2,
      @Range(from = 0L, to = 255L) int var3
   ) {
      int var4 = (var3 & 0xFF) << 24 | (var0 & 0xFF) << 16 | (var1 & 0xFF) << 8 | var2 & 0xFF;
      return var4 == 0 ? none() : new ShadowColorImpl(var4);
   }

   @Contract(pure = true)
   @NotNull
   static ShadowColor shadowColor(@NotNull RGBLike var0, @Range(from = 0L, to = 255L) int var1) {
      return shadowColor(var0.red(), var0.green(), var0.blue(), var1);
   }

   @NotNull
   static ShadowColor shadowColor(@NotNull ARGBLike var0) {
      return var0 instanceof ShadowColor ? (ShadowColor)var0 : shadowColor(var0.red(), var0.green(), var0.blue(), var0.alpha());
   }

   @Contract(pure = true)
   @Nullable
   static ShadowColor fromHexString(@Pattern("#[0-9a-fA-F]{8}") @NotNull String var0) {
      if (var0.length() != 9) {
         return null;
      }

      if (!var0.startsWith("#")) {
         return null;
      }

      try {
         int var1 = Integer.parseInt(var0.substring(1, 3), 16);
         int var2 = Integer.parseInt(var0.substring(3, 5), 16);
         int var3 = Integer.parseInt(var0.substring(5, 7), 16);
         int var4 = Integer.parseInt(var0.substring(7, 9), 16);
         return new ShadowColorImpl(var4 << 24 | var1 << 16 | var2 << 8 | var3);
      } catch (NumberFormatException var5) {
         return null;
      }
   }

   @NotNull
   default String asHexString() {
      int var1 = this.value();
      int var2 = var1 >> 24 & 0xFF;
      int var3 = var1 >> 16 & 0xFF;
      int var4 = var1 >> 8 & 0xFF;
      int var5 = var1 & 0xFF;
      return String.format("#%02X%02X%02X%02X", var3, var4, var5, var2);
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

   @Override
   default @Range(from = 0L, to = 255L) int alpha() {
      return this.value() >> 24 & 0xFF;
   }

   int value();

   @Override
   default void styleApply(Style.@NotNull Builder var1) {
      var1.shadowColor(this);
   }
}
