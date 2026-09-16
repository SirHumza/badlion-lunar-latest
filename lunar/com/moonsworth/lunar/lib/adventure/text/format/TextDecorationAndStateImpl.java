package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TextDecorationAndStateImpl implements TextDecorationAndState {
   private final TextDecoration decoration;
   private final TextDecoration.State state;

   TextDecorationAndStateImpl(TextDecoration var1, TextDecoration.State var2) {
      this.decoration = var1;
      this.state = Objects.requireNonNull(var2, "state");
   }

   @NotNull
   @Override
   public TextDecoration decoration() {
      return this.decoration;
   }

   @Override
   public TextDecoration.@NotNull State state() {
      return this.state;
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         TextDecorationAndStateImpl var2 = (TextDecorationAndStateImpl)var1;
         return this.decoration == var2.decoration && this.state == var2.state;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.decoration.hashCode();
      return 31 * var1 + this.state.hashCode();
   }
}
