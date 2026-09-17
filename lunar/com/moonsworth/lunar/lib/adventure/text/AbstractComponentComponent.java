package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TranslatableComponentImpl extends AbstractComponent implements TranslatableComponent {
   private final String key;
   @Nullable
   private final String fallback;
   private final List<TranslationArgument> args;

   static TranslatableComponent create(
      @NotNull List<Component> var0, @NotNull Style var1, @NotNull String var2, @Nullable String var3, @NotNull ComponentLike[] var4
   ) {
      Objects.requireNonNull(var4, "args");
      return create(var0, var1, var2, var3, Arrays.asList(var4));
   }

   static TranslatableComponent create(
      @NotNull List<? extends ComponentLike> var0,
      @NotNull Style var1,
      @NotNull String var2,
      @Nullable String var3,
      @NotNull List<? extends ComponentLike> var4
   ) {
      return new TranslatableComponentImpl(
         ComponentLike.asComponents(var0, IS_NOT_EMPTY), Objects.requireNonNull(var1, "style"), Objects.requireNonNull(var2, "key"), var3, asArguments(var4)
      );
   }

   TranslatableComponentImpl(
      @NotNull List<Component> var1, @NotNull Style var2, @NotNull String var3, @Nullable String var4, @NotNull List<TranslationArgument> var5
   ) {
      super(var1, var2);
      this.key = var3;
      this.fallback = var4;
      this.args = var5;
   }

   @NotNull
   @Override
   public String key() {
      return this.key;
   }

   @NotNull
   @Override
   public TranslatableComponent key(@NotNull String var1) {
      return Objects.equals(this.key, var1) ? this : create(this.children, this.style, var1, this.fallback, this.args);
   }

   @Deprecated
   @NotNull
   @Override
   public List<Component> args() {
      return ComponentLike.asComponents(this.args);
   }

   @NotNull
   @Override
   public List<TranslationArgument> arguments() {
      return this.args;
   }

   @NotNull
   @Override
   public TranslatableComponent arguments(@NotNull ComponentLike... var1) {
      return create(this.children, this.style, this.key, this.fallback, var1);
   }

   @NotNull
   @Override
   public TranslatableComponent arguments(@NotNull List<? extends ComponentLike> var1) {
      return create(this.children, this.style, this.key, this.fallback, var1);
   }

   @Nullable
   @Override
   public String fallback() {
      return this.fallback;
   }

   @NotNull
   @Override
   public TranslatableComponent fallback(@Nullable String var1) {
      return create(this.children, this.style, this.key, var1, this.args);
   }

   @NotNull
   public TranslatableComponent children(@NotNull List<? extends ComponentLike> var1) {
      return create(var1, this.style, this.key, this.fallback, this.args);
   }

   @NotNull
   public TranslatableComponent style(@NotNull Style var1) {
      return create(this.children, var1, this.key, this.fallback, this.args);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof TranslatableComponent)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      TranslatableComponent var2 = (TranslatableComponent)var1;
      return Objects.equals(this.key, var2.key()) && Objects.equals(this.fallback, var2.fallback()) && Objects.equals(this.args, var2.arguments());
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.key.hashCode();
      var1 = 31 * var1 + Objects.hashCode(this.fallback);
      return 31 * var1 + this.args.hashCode();
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @NotNull
   public TranslatableComponent.Builder toBuilder() {
      return new TranslatableComponentImpl.BuilderImpl(this);
   }

   static List<TranslationArgument> asArguments(@NotNull List<? extends ComponentLike> var0) {
      if (var0.isEmpty()) {
         return Collections.emptyList();
      }

      ArrayList var1 = new ArrayList(var0.size());

      for (int var2 = 0; var2 < var0.size(); var2++) {
         ComponentLike var3 = (ComponentLike)var0.get(var2);
         if (var3 == null) {
            throw new NullPointerException("likes[" + var2 + "]");
         }

         if (var3 instanceof TranslationArgument) {
            var1.add((TranslationArgument)var3);
         } else if (var3 instanceof TranslationArgumentLike) {
            var1.add(Objects.requireNonNull(((TranslationArgumentLike)var3).asTranslationArgument(), "likes[" + var2 + "].asTranslationArgument()"));
         } else {
            var1.add(TranslationArgument.component(var3));
         }
      }

      return Collections.unmodifiableList(var1);
   }

   static final class BuilderImpl
      extends AbstractComponentBuilder<TranslatableComponent, TranslatableComponent.Builder>
      implements TranslatableComponent.Builder {
      @Nullable
      private String key;
      @Nullable
      private String fallback;
      private List<TranslationArgument> args = Collections.emptyList();

      BuilderImpl() {
      }

      BuilderImpl(@NotNull TranslatableComponent var1) {
         super(var1);
         this.key = var1.key();
         this.args = var1.arguments();
         this.fallback = var1.fallback();
      }

      @NotNull
      @Override
      public TranslatableComponent.Builder key(@NotNull String var1) {
         this.key = var1;
         return this;
      }

      @NotNull
      @Override
      public TranslatableComponent.Builder arguments(@NotNull ComponentLike... var1) {
         Objects.requireNonNull(var1, "args");
         return var1.length == 0 ? this.arguments(Collections.emptyList()) : this.arguments(Arrays.asList(var1));
      }

      @NotNull
      @Override
      public TranslatableComponent.Builder arguments(@NotNull List<? extends ComponentLike> var1) {
         this.args = TranslatableComponentImpl.asArguments(Objects.requireNonNull(var1, "args"));
         return this;
      }

      @NotNull
      @Override
      public TranslatableComponent.Builder fallback(@Nullable String var1) {
         this.fallback = var1;
         return this;
      }

      @NotNull
      public TranslatableComponent build() {
         if (this.key == null) {
            throw new IllegalStateException("key must be set");
         } else {
            return TranslatableComponentImpl.create(this.children, this.buildStyle(), this.key, this.fallback, this.args);
         }
      }
   }
}
