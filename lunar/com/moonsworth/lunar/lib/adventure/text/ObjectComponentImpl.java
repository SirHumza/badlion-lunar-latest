package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.object.ObjectContents;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ObjectComponentImpl extends AbstractComponent implements ObjectComponent {
   private final ObjectContents contents;

   private ObjectComponentImpl(@NotNull List<Component> var1, @NotNull Style var2, @NotNull ObjectContents var3) {
      super(var1, var2);
      this.contents = var3;
   }

   @NotNull
   @Override
   public ObjectContents contents() {
      return this.contents;
   }

   @NotNull
   @Override
   public ObjectComponent contents(@NotNull ObjectContents var1) {
      return create(this.children, this.style, var1);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof ObjectComponent)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      ObjectComponentImpl var2 = (ObjectComponentImpl)var1;
      return Objects.equals(this.contents, var2.contents());
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      return 31 * var1 + this.contents.hashCode();
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @NotNull
   public ObjectComponent.Builder toBuilder() {
      return new ObjectComponentImpl.BuilderImpl(this);
   }

   @NotNull
   static ObjectComponentImpl create(@NotNull List<? extends ComponentLike> var0, @NotNull Style var1, @NotNull ObjectContents var2) {
      return new ObjectComponentImpl(
         ComponentLike.asComponents(var0, IS_NOT_EMPTY), Objects.requireNonNull(var1, "style"), Objects.requireNonNull(var2, "contents")
      );
   }

   @NotNull
   public ObjectComponent children(@NotNull List<? extends ComponentLike> var1) {
      return create(var1, this.style, this.contents);
   }

   @NotNull
   public ObjectComponent style(@NotNull Style var1) {
      return create(this.children, var1, this.contents);
   }

   static final class BuilderImpl extends AbstractComponentBuilder<ObjectComponent, ObjectComponent.Builder> implements ObjectComponent.Builder {
      private ObjectContents objectContents;

      BuilderImpl() {
      }

      BuilderImpl(@NotNull ObjectComponent var1) {
         super(var1);
         this.objectContents = var1.contents();
      }

      @NotNull
      @Override
      public ObjectComponent.Builder contents(@NotNull ObjectContents var1) {
         this.objectContents = Objects.requireNonNull(var1, "contents");
         return this;
      }

      @NotNull
      public ObjectComponent build() {
         if (this.objectContents == null) {
            throw new IllegalStateException("contents must be set");
         } else {
            return ObjectComponentImpl.create(this.children, this.buildStyle(), this.objectContents);
         }
      }
   }
}
