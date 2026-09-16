package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TranslationArgumentImpl implements TranslationArgument {
   private static final Component TRUE = Component.text("true");
   private static final Component FALSE = Component.text("false");
   private final Object value;

   TranslationArgumentImpl(Object var1) {
      this.value = var1;
   }

   @NotNull
   @Override
   public Object value() {
      return this.value;
   }

   @NotNull
   @Override
   public Component asComponent() {
      if (this.value instanceof Component) {
         return (Component)this.value;
      } else if (this.value instanceof Boolean) {
         return (Boolean)this.value ? TRUE : FALSE;
      } else {
         return Component.text(String.valueOf(this.value));
      }
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         TranslationArgumentImpl var2 = (TranslationArgumentImpl)var1;
         return Objects.equals(this.value, var2.value);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.value);
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
