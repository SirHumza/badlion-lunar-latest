package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class KeybindComponentImpl extends AbstractComponent implements KeybindComponent {
   private final String keybind;

   static KeybindComponent create(@NotNull List<? extends ComponentLike> var0, @NotNull Style var1, @NotNull String var2) {
      return new KeybindComponentImpl(
         ComponentLike.asComponents(var0, IS_NOT_EMPTY), Objects.requireNonNull(var1, "style"), Objects.requireNonNull(var2, "keybind")
      );
   }

   KeybindComponentImpl(@NotNull List<Component> var1, @NotNull Style var2, @NotNull String var3) {
      super(var1, var2);
      this.keybind = var3;
   }

   @NotNull
   @Override
   public String keybind() {
      return this.keybind;
   }

   @NotNull
   @Override
   public KeybindComponent keybind(@NotNull String var1) {
      return Objects.equals(this.keybind, var1) ? this : create(this.children, this.style, var1);
   }

   @NotNull
   public KeybindComponent children(@NotNull List<? extends ComponentLike> var1) {
      return create(var1, this.style, this.keybind);
   }

   @NotNull
   public KeybindComponent style(@NotNull Style var1) {
      return create(this.children, var1, this.keybind);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof KeybindComponent)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      KeybindComponent var2 = (KeybindComponent)var1;
      return Objects.equals(this.keybind, var2.keybind());
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      return 31 * var1 + this.keybind.hashCode();
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @NotNull
   public KeybindComponent.Builder toBuilder() {
      return new KeybindComponentImpl.BuilderImpl(this);
   }

   static final class BuilderImpl extends AbstractComponentBuilder<KeybindComponent, KeybindComponent.Builder> implements KeybindComponent.Builder {
      @Nullable
      private String keybind;

      BuilderImpl() {
      }

      BuilderImpl(@NotNull KeybindComponent var1) {
         super(var1);
         this.keybind = var1.keybind();
      }

      @NotNull
      @Override
      public KeybindComponent.Builder keybind(@NotNull String var1) {
         this.keybind = Objects.requireNonNull(var1, "keybind");
         return this;
      }

      @NotNull
      public KeybindComponent build() {
         if (this.keybind == null) {
            throw new IllegalStateException("keybind must be set");
         } else {
            return KeybindComponentImpl.create(this.children, this.buildStyle(), this.keybind);
         }
      }
   }
}
