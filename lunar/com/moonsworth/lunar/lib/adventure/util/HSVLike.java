package com.moonsworth.lunar.lib.adventure.util;

import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

public interface HSVLike extends Examinable {
   @NotNull
   static HSVLike hsvLike(float var0, float var1, float var2) {
      return new HSVLikeImpl(var0, var1, var2);
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   @NotNull
   static HSVLike of(float var0, float var1, float var2) {
      return new HSVLikeImpl(var0, var1, var2);
   }

   @NotNull
   static HSVLike fromRGB(@Range(from = 0L, to = 255L) int var0, @Range(from = 0L, to = 255L) int var1, @Range(from = 0L, to = 255L) int var2) {
      float var3 = var0 / 255.0F;
      float var4 = var1 / 255.0F;
      float var5 = var2 / 255.0F;
      float var6 = Math.min(var3, Math.min(var4, var5));
      float var7 = Math.max(var3, Math.max(var4, var5));
      float var8 = var7 - var6;
      float var9;
      if (var7 != 0.0F) {
         var9 = var8 / var7;
      } else {
         var9 = 0.0F;
      }

      if (var9 == 0.0F) {
         return new HSVLikeImpl(0.0F, var9, var7);
      }

      float var10;
      if (var3 == var7) {
         var10 = (var4 - var5) / var8;
      } else if (var4 == var7) {
         var10 = 2.0F + (var5 - var3) / var8;
      } else {
         var10 = 4.0F + (var3 - var4) / var8;
      }

      var10 *= 60.0F;
      if (var10 < 0.0F) {
         var10 += 360.0F;
      }

      return new HSVLikeImpl(var10 / 360.0F, var9, var7);
   }

   float h();

   float s();

   float v();

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("h", this.h()), ExaminableProperty.of("s", this.s()), ExaminableProperty.of("v", this.v()));
   }
}
