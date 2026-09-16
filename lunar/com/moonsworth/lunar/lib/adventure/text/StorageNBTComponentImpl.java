package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class StorageNBTComponentImpl extends NBTComponentImpl<StorageNBTComponent, StorageNBTComponent.Builder> implements StorageNBTComponent {
   private final Key storage;

   @NotNull
   static StorageNBTComponent create(
      @NotNull List<? extends ComponentLike> var0, @NotNull Style var1, String var2, boolean var3, @Nullable ComponentLike var4, @NotNull Key var5
   ) {
      return new StorageNBTComponentImpl(
         ComponentLike.asComponents(var0, IS_NOT_EMPTY),
         Objects.requireNonNull(var1, "style"),
         Objects.requireNonNull(var2, "nbtPath"),
         var3,
         ComponentLike.unbox(var4),
         Objects.requireNonNull(var5, "storage")
      );
   }

   StorageNBTComponentImpl(@NotNull List<Component> var1, @NotNull Style var2, String var3, boolean var4, @Nullable Component var5, Key var6) {
      super(var1, var2, var3, var4, var5);
      this.storage = var6;
   }

   @NotNull
   public StorageNBTComponent nbtPath(@NotNull String var1) {
      return Objects.equals(this.nbtPath, var1) ? this : create(this.children, this.style, var1, this.interpret, this.separator, this.storage);
   }

   @NotNull
   public StorageNBTComponent interpret(boolean var1) {
      return this.interpret == var1 ? this : create(this.children, this.style, this.nbtPath, var1, this.separator, this.storage);
   }

   @Nullable
   @Override
   public Component separator() {
      return this.separator;
   }

   @NotNull
   public StorageNBTComponent separator(@Nullable ComponentLike var1) {
      return create(this.children, this.style, this.nbtPath, this.interpret, var1, this.storage);
   }

   @NotNull
   @Override
   public Key storage() {
      return this.storage;
   }

   @NotNull
   @Override
   public StorageNBTComponent storage(@NotNull Key var1) {
      return Objects.equals(this.storage, var1) ? this : create(this.children, this.style, this.nbtPath, this.interpret, this.separator, var1);
   }

   @NotNull
   public StorageNBTComponent children(@NotNull List<? extends ComponentLike> var1) {
      return create(var1, this.style, this.nbtPath, this.interpret, this.separator, this.storage);
   }

   @NotNull
   public StorageNBTComponent style(@NotNull Style var1) {
      return create(this.children, var1, this.nbtPath, this.interpret, this.separator, this.storage);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof StorageNBTComponent)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      StorageNBTComponentImpl var2 = (StorageNBTComponentImpl)var1;
      return Objects.equals(this.storage, var2.storage());
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      return 31 * var1 + this.storage.hashCode();
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   public StorageNBTComponent.@NotNull Builder toBuilder() {
      return new StorageNBTComponentImpl.BuilderImpl(this);
   }

   static class BuilderImpl extends AbstractNBTComponentBuilder<StorageNBTComponent, StorageNBTComponent.Builder> implements StorageNBTComponent.Builder {
      @Nullable
      private Key storage;

      BuilderImpl() {
      }

      BuilderImpl(@NotNull StorageNBTComponent var1) {
         super(var1);
         this.storage = var1.storage();
      }

      @Override
      public StorageNBTComponent.@NotNull Builder storage(@NotNull Key var1) {
         this.storage = Objects.requireNonNull(var1, "storage");
         return this;
      }

      @NotNull
      public StorageNBTComponent build() {
         if (this.nbtPath == null) {
            throw new IllegalStateException("nbt path must be set");
         } else if (this.storage == null) {
            throw new IllegalStateException("storage must be set");
         } else {
            return StorageNBTComponentImpl.create(this.children, this.buildStyle(), this.nbtPath, this.interpret, this.separator, this.storage);
         }
      }
   }
}
