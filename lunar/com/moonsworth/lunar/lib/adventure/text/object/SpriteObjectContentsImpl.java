package com.moonsworth.lunar.lib.adventure.text.object;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class SpriteObjectContentsImpl implements SpriteObjectContents {
   private final Key atlas;
   private final Key sprite;

   SpriteObjectContentsImpl(@NotNull Key var1, @NotNull Key var2) {
      this.atlas = var1;
      this.sprite = var2;
   }

   @NotNull
   @Override
   public Key atlas() {
      return this.atlas;
   }

   @NotNull
   @Override
   public Key sprite() {
      return this.sprite;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof SpriteObjectContents)) {
         return false;
      }

      SpriteObjectContentsImpl var2 = (SpriteObjectContentsImpl)var1;
      return Objects.equals(this.atlas, var2.atlas()) && Objects.equals(this.sprite, var2.sprite());
   }

   @Override
   public int hashCode() {
      int var1 = this.atlas.hashCode();
      return 31 * var1 + this.sprite.hashCode();
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }
}
