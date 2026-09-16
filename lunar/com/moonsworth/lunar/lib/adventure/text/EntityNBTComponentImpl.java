package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class EntityNBTComponentImpl extends NBTComponentImpl<EntityNBTComponent, EntityNBTComponent.Builder> implements EntityNBTComponent {
   private final String selector;

   static EntityNBTComponent create(
      @NotNull List<? extends ComponentLike> var0, @NotNull Style var1, String var2, boolean var3, @Nullable ComponentLike var4, String var5
   ) {
      return new EntityNBTComponentImpl(
         ComponentLike.asComponents(var0, IS_NOT_EMPTY),
         Objects.requireNonNull(var1, "style"),
         Objects.requireNonNull(var2, "nbtPath"),
         var3,
         ComponentLike.unbox(var4),
         Objects.requireNonNull(var5, "selector")
      );
   }

   EntityNBTComponentImpl(@NotNull List<Component> var1, @NotNull Style var2, String var3, boolean var4, @Nullable Component var5, String var6) {
      super(var1, var2, var3, var4, var5);
      this.selector = var6;
   }

   @NotNull
   public EntityNBTComponent nbtPath(@NotNull String var1) {
      return Objects.equals(this.nbtPath, var1) ? this : create(this.children, this.style, var1, this.interpret, this.separator, this.selector);
   }

   @NotNull
   public EntityNBTComponent interpret(boolean var1) {
      return this.interpret == var1 ? this : create(this.children, this.style, this.nbtPath, var1, this.separator, this.selector);
   }

   @Nullable
   @Override
   public Component separator() {
      return this.separator;
   }

   @NotNull
   public EntityNBTComponent separator(@Nullable ComponentLike var1) {
      return create(this.children, this.style, this.nbtPath, this.interpret, var1, this.selector);
   }

   @NotNull
   @Override
   public String selector() {
      return this.selector;
   }

   @NotNull
   @Override
   public EntityNBTComponent selector(@NotNull String var1) {
      return Objects.equals(this.selector, var1) ? this : create(this.children, this.style, this.nbtPath, this.interpret, this.separator, var1);
   }

   @NotNull
   public EntityNBTComponent children(@NotNull List<? extends ComponentLike> var1) {
      return create(var1, this.style, this.nbtPath, this.interpret, this.separator, this.selector);
   }

   @NotNull
   public EntityNBTComponent style(@NotNull Style var1) {
      return create(this.children, var1, this.nbtPath, this.interpret, this.separator, this.selector);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof EntityNBTComponent)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      EntityNBTComponentImpl var2 = (EntityNBTComponentImpl)var1;
      return Objects.equals(this.selector, var2.selector());
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      return 31 * var1 + this.selector.hashCode();
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   public EntityNBTComponent.@NotNull Builder toBuilder() {
      return new EntityNBTComponentImpl.BuilderImpl(this);
   }

   static final class BuilderImpl extends AbstractNBTComponentBuilder<EntityNBTComponent, EntityNBTComponent.Builder> implements EntityNBTComponent.Builder {
      @Nullable
      private String selector;

      BuilderImpl() {
      }

      BuilderImpl(@NotNull EntityNBTComponent var1) {
         super(var1);
         this.selector = var1.selector();
      }

      @Override
      public EntityNBTComponent.@NotNull Builder selector(@NotNull String var1) {
         this.selector = Objects.requireNonNull(var1, "selector");
         return this;
      }

      @NotNull
      public EntityNBTComponent build() {
         if (this.nbtPath == null) {
            throw new IllegalStateException("nbt path must be set");
         } else if (this.selector == null) {
            throw new IllegalStateException("selector must be set");
         } else {
            return EntityNBTComponentImpl.create(this.children, this.buildStyle(), this.nbtPath, this.interpret, this.separator, this.selector);
         }
      }
   }
}
