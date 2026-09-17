package com.moonsworth.lunar.lib.adventure.text.serializer.legacy;

import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LegacyFormat implements Examinable {
   static final LegacyFormat RESET = new LegacyFormat(true);
   @Nullable
   private final NamedTextColor color;
   @Nullable
   private final TextDecoration decoration;
   private final boolean reset;

   LegacyFormat(@Nullable NamedTextColor var1) {
      this.color = var1;
      this.decoration = null;
      this.reset = false;
   }

   LegacyFormat(@Nullable TextDecoration var1) {
      this.color = null;
      this.decoration = var1;
      this.reset = false;
   }

   private LegacyFormat(boolean var1) {
      this.color = null;
      this.decoration = null;
      this.reset = var1;
   }

   @Nullable
   public TextColor color() {
      return this.color;
   }

   @Nullable
   public TextDecoration decoration() {
      return this.decoration;
   }

   public boolean reset() {
      return this.reset;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         LegacyFormat var2 = (LegacyFormat)var1;
         return this.color == var2.color && this.decoration == var2.decoration && this.reset == var2.reset;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = Objects.hashCode(this.color);
      var1 = 31 * var1 + Objects.hashCode(this.decoration);
      return 31 * var1 + Boolean.hashCode(this.reset);
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("color", this.color), ExaminableProperty.of("decoration", this.decoration), ExaminableProperty.of("reset", this.reset)
      );
   }
}
