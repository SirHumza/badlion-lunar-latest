package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class SelectorComponentImpl extends AbstractComponent implements SelectorComponent {
   private final String pattern;
   @Nullable
   private final Component separator;

   static SelectorComponent create(@NotNull List<? extends ComponentLike> var0, @NotNull Style var1, @NotNull String var2, @Nullable ComponentLike var3) {
      return new SelectorComponentImpl(
         ComponentLike.asComponents(var0, IS_NOT_EMPTY),
         Objects.requireNonNull(var1, "style"),
         Objects.requireNonNull(var2, "pattern"),
         ComponentLike.unbox(var3)
      );
   }

   SelectorComponentImpl(@NotNull List<Component> var1, @NotNull Style var2, @NotNull String var3, @Nullable Component var4) {
      super(var1, var2);
      this.pattern = var3;
      this.separator = var4;
   }

   @NotNull
   @Override
   public String pattern() {
      return this.pattern;
   }

   @NotNull
   @Override
   public SelectorComponent pattern(@NotNull String var1) {
      return Objects.equals(this.pattern, var1) ? this : create(this.children, this.style, var1, this.separator);
   }

   @Nullable
   @Override
   public Component separator() {
      return this.separator;
   }

   @NotNull
   @Override
   public SelectorComponent separator(@Nullable ComponentLike var1) {
      return create(this.children, this.style, this.pattern, var1);
   }

   @NotNull
   public SelectorComponent children(@NotNull List<? extends ComponentLike> var1) {
      return create(var1, this.style, this.pattern, this.separator);
   }

   @NotNull
   public SelectorComponent style(@NotNull Style var1) {
      return create(this.children, var1, this.pattern, this.separator);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof SelectorComponent)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      SelectorComponent var2 = (SelectorComponent)var1;
      return Objects.equals(this.pattern, var2.pattern()) && Objects.equals(this.separator, var2.separator());
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.pattern.hashCode();
      return 31 * var1 + Objects.hashCode(this.separator);
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @NotNull
   public SelectorComponent.Builder toBuilder() {
      return new SelectorComponentImpl.BuilderImpl(this);
   }

   static final class BuilderImpl extends AbstractComponentBuilder<SelectorComponent, SelectorComponent.Builder> implements SelectorComponent.Builder {
      @Nullable
      private String pattern;
      @Nullable
      private Component separator;

      BuilderImpl() {
      }

      BuilderImpl(@NotNull SelectorComponent var1) {
         super(var1);
         this.pattern = var1.pattern();
         this.separator = var1.separator();
      }

      @NotNull
      @Override
      public SelectorComponent.Builder pattern(@NotNull String var1) {
         this.pattern = Objects.requireNonNull(var1, "pattern");
         return this;
      }

      @NotNull
      @Override
      public SelectorComponent.Builder separator(@Nullable ComponentLike var1) {
         this.separator = ComponentLike.unbox(var1);
         return this;
      }

      @NotNull
      public SelectorComponent build() {
         if (this.pattern == null) {
            throw new IllegalStateException("pattern must be set");
         } else {
            return SelectorComponentImpl.create(this.children, this.buildStyle(), this.pattern, this.separator);
         }
      }
   }
}
