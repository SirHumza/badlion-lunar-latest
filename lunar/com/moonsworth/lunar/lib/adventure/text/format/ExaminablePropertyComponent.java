package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ShadowColorImpl implements ShadowColor, Examinable {
   static final int NONE_VALUE = 0;
   static final ShadowColorImpl NONE = new ShadowColorImpl(0);
   private final int value;

   ShadowColorImpl(int var1) {
      this.value = var1;
   }

   @Override
   public int value() {
      return this.value;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (!(var1 instanceof ShadowColorImpl)) {
         return false;
      }

      ShadowColorImpl var2 = (ShadowColorImpl)var1;
      return this.value == var2.value;
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.value);
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("value", this.value));
   }
}
