package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class VirtualComponentImpl<C> extends TextComponentImpl implements VirtualComponent {
   private final Class<C> contextType;
   private final VirtualComponentRenderer<C> renderer;

   static <C> VirtualComponent createVirtual(@NotNull Class<C> var0, @NotNull VirtualComponentRenderer<C> var1) {
      return createVirtual(var0, var1, Collections.emptyList(), Style.empty());
   }

   static <C> VirtualComponent createVirtual(@NotNull Class<C> var0, @NotNull VirtualComponentRenderer<C> var1, List<? extends ComponentLike> var2, Style var3) {
      List var4 = ComponentLike.asComponents(var2, IS_NOT_EMPTY);
      return new VirtualComponentImpl(var4, var3, "", var0, var1);
   }

   private VirtualComponentImpl(
      @NotNull List<Component> var1, @NotNull Style var2, @NotNull String var3, @NotNull Class<C> var4, @NotNull VirtualComponentRenderer<C> var5
   ) {
      super(var1, var2, var3);
      this.contextType = var4;
      this.renderer = var5;
   }

   VirtualComponent create0(@NotNull List<? extends ComponentLike> var1, @NotNull Style var2, @NotNull String var3) {
      return new VirtualComponentImpl<>(ComponentLike.asComponents(var1, IS_NOT_EMPTY), var2, var3, this.contextType, this.renderer);
   }

   @NotNull
   @Override
   public Class<C> contextType() {
      return this.contextType;
   }

   @NotNull
   @Override
   public VirtualComponentRenderer<C> renderer() {
      return this.renderer;
   }

   @NotNull
   @Override
   public String content() {
      return this.renderer.fallbackString();
   }

   @NotNull
   @Override
   public TextComponent.Builder toBuilder() {
      return new VirtualComponentImpl.BuilderImpl<>(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof VirtualComponentImpl)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      VirtualComponentImpl var2 = (VirtualComponentImpl)var1;
      return Objects.equals(this.contextType, var2.contextType) && Objects.equals(this.renderer, var2.renderer);
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.contextType.hashCode();
      return 31 * var1 + this.renderer.hashCode();
   }

   static final class BuilderImpl<C> extends TextComponentImpl.BuilderImpl {
      private final Class<C> contextType;
      private final VirtualComponentRenderer<C> renderer;

      BuilderImpl(VirtualComponentImpl<C> var1) {
         super(var1);
         this.contextType = var1.contextType();
         this.renderer = var1.renderer();
      }

      @NotNull
      @Override
      public TextComponent build() {
         return VirtualComponentImpl.createVirtual(this.contextType, this.renderer, this.children, this.buildStyle());
      }
   }
}
