package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ScoreComponentImpl extends AbstractComponent implements ScoreComponent {
   private final String name;
   private final String objective;
   @Deprecated
   @Nullable
   private final String value;

   static ScoreComponent create(
      @NotNull List<? extends ComponentLike> var0, @NotNull Style var1, @NotNull String var2, @NotNull String var3, @Nullable String var4
   ) {
      return new ScoreComponentImpl(
         ComponentLike.asComponents(var0, IS_NOT_EMPTY),
         Objects.requireNonNull(var1, "style"),
         Objects.requireNonNull(var2, "name"),
         Objects.requireNonNull(var3, "objective"),
         var4
      );
   }

   ScoreComponentImpl(@NotNull List<Component> var1, @NotNull Style var2, @NotNull String var3, @NotNull String var4, @Nullable String var5) {
      super(var1, var2);
      this.name = var3;
      this.objective = var4;
      this.value = var5;
   }

   @NotNull
   @Override
   public String name() {
      return this.name;
   }

   @NotNull
   @Override
   public ScoreComponent name(@NotNull String var1) {
      return Objects.equals(this.name, var1) ? this : create(this.children, this.style, var1, this.objective, this.value);
   }

   @NotNull
   @Override
   public String objective() {
      return this.objective;
   }

   @NotNull
   @Override
   public ScoreComponent objective(@NotNull String var1) {
      return Objects.equals(this.objective, var1) ? this : create(this.children, this.style, this.name, var1, this.value);
   }

   @Deprecated
   @Nullable
   @Override
   public String value() {
      return this.value;
   }

   @Deprecated
   @NotNull
   @Override
   public ScoreComponent value(@Nullable String var1) {
      return Objects.equals(this.value, var1) ? this : create(this.children, this.style, this.name, this.objective, var1);
   }

   @NotNull
   public ScoreComponent children(@NotNull List<? extends ComponentLike> var1) {
      return create(var1, this.style, this.name, this.objective, this.value);
   }

   @NotNull
   public ScoreComponent style(@NotNull Style var1) {
      return create(this.children, var1, this.name, this.objective, this.value);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof ScoreComponent)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      ScoreComponent var2 = (ScoreComponent)var1;
      return Objects.equals(this.name, var2.name()) && Objects.equals(this.objective, var2.objective()) && Objects.equals(this.value, var2.value());
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.name.hashCode();
      var1 = 31 * var1 + this.objective.hashCode();
      return 31 * var1 + Objects.hashCode(this.value);
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @NotNull
   public ScoreComponent.Builder toBuilder() {
      return new ScoreComponentImpl.BuilderImpl(this);
   }

   static final class BuilderImpl extends AbstractComponentBuilder<ScoreComponent, ScoreComponent.Builder> implements ScoreComponent.Builder {
      @Nullable
      private String name;
      @Nullable
      private String objective;
      @Nullable
      private String value;

      BuilderImpl() {
      }

      BuilderImpl(@NotNull ScoreComponent var1) {
         super(var1);
         this.name = var1.name();
         this.objective = var1.objective();
         this.value = var1.value();
      }

      @NotNull
      @Override
      public ScoreComponent.Builder name(@NotNull String var1) {
         this.name = Objects.requireNonNull(var1, "name");
         return this;
      }

      @NotNull
      @Override
      public ScoreComponent.Builder objective(@NotNull String var1) {
         this.objective = Objects.requireNonNull(var1, "objective");
         return this;
      }

      @Deprecated
      @NotNull
      @Override
      public ScoreComponent.Builder value(@Nullable String var1) {
         this.value = var1;
         return this;
      }

      @NotNull
      public ScoreComponent build() {
         if (this.name == null) {
            throw new IllegalStateException("name must be set");
         } else if (this.objective == null) {
            throw new IllegalStateException("objective must be set");
         } else {
            return ScoreComponentImpl.create(this.children, this.buildStyle(), this.name, this.objective, this.value);
         }
      }
   }
}
