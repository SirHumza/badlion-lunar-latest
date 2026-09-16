package com.moonsworth.lunar.lib.adventure.util;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

final class HSVLikeImpl implements HSVLike {
   private final float h;
   private final float s;
   private final float v;

   HSVLikeImpl(float var1, float var2, float var3) {
      requireInsideRange(var1, "h");
      requireInsideRange(var2, "s");
      requireInsideRange(var3, "v");
      this.h = var1;
      this.s = var2;
      this.v = var3;
   }

   @Override
   public float h() {
      return this.h;
   }

   @Override
   public float s() {
      return this.s;
   }

   @Override
   public float v() {
      return this.v;
   }

   private static void requireInsideRange(float var0, String var1) {
      if (var0 < 0.0F || 1.0F < var0) {
         throw new IllegalArgumentException(var1 + " (" + var0 + ") is not inside the required range: [0,1]");
      }
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof HSVLikeImpl)) {
         return false;
      }

      HSVLikeImpl var2 = (HSVLikeImpl)var1;
      return ShadyPines.equals(var2.h, this.h) && ShadyPines.equals(var2.s, this.s) && ShadyPines.equals(var2.v, this.v);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.h, this.s, this.v);
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }
}
