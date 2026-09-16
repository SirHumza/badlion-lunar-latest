package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.util.HSVLike;
import org.jetbrains.annotations.Debug;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Debug.Renderer(text = "asHexString()")
final class TextColorImpl implements TextColor {
   private final int value;

   TextColorImpl(int var1) {
      this.value = var1;
   }

   @Override
   public int value() {
      return this.value;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof TextColorImpl)) {
         return false;
      }

      TextColorImpl var2 = (TextColorImpl)var1;
      return this.value == var2.value;
   }

   @Override
   public int hashCode() {
      return this.value;
   }

   @Override
   public String toString() {
      return this.asHexString();
   }

   static float distance(@NotNull HSVLike var0, @NotNull HSVLike var1) {
      float var2 = 3.0F * Math.min(Math.abs(var0.h() - var1.h()), 1.0F - Math.abs(var0.h() - var1.h()));
      float var3 = var0.s() - var1.s();
      float var4 = var0.v() - var1.v();
      return var2 * var2 + var3 * var3 + var4 * var4;
   }
}
