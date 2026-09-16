package com.moonsworth.lunar.lib.adventure.resource;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.util.MonkeyBars;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ResourcePackRequestImpl implements ResourcePackRequest {
   private final List<ResourcePackInfo> packs;
   private final ResourcePackCallback cb;
   private final boolean replace;
   private final boolean required;
   @Nullable
   private final Component prompt;

   ResourcePackRequestImpl(List<ResourcePackInfo> var1, ResourcePackCallback var2, boolean var3, boolean var4, @Nullable Component var5) {
      this.packs = var1;
      this.cb = var2;
      this.replace = var3;
      this.required = var4;
      this.prompt = var5;
   }

   @NotNull
   @Override
   public List<ResourcePackInfo> packs() {
      return this.packs;
   }

   @NotNull
   @Override
   public ResourcePackRequest packs(@NotNull Iterable<? extends ResourcePackInfoLike> var1) {
      return this.packs.equals(var1)
         ? this
         : new ResourcePackRequestImpl(
            MonkeyBars.toUnmodifiableList(ResourcePackInfoLike::asResourcePackInfo, var1), this.cb, this.replace, this.required, this.prompt
         );
   }

   @NotNull
   @Override
   public ResourcePackCallback callback() {
      return this.cb;
   }

   @NotNull
   @Override
   public ResourcePackRequest callback(@NotNull ResourcePackCallback var1) {
      return var1 == this.cb ? this : new ResourcePackRequestImpl(this.packs, Objects.requireNonNull(var1, "cb"), this.replace, this.required, this.prompt);
   }

   @Override
   public boolean replace() {
      return this.replace;
   }

   @Override
   public boolean required() {
      return this.required;
   }

   @Nullable
   @Override
   public Component prompt() {
      return this.prompt;
   }

   @NotNull
   @Override
   public ResourcePackRequest replace(boolean var1) {
      return var1 == this.replace ? this : new ResourcePackRequestImpl(this.packs, this.cb, var1, this.required, this.prompt);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ResourcePackRequestImpl var2 = (ResourcePackRequestImpl)var1;
         return this.replace == var2.replace
            && Objects.equals(this.packs, var2.packs)
            && Objects.equals(this.cb, var2.cb)
            && this.required == var2.required
            && Objects.equals(this.prompt, var2.prompt);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.packs, this.cb, this.replace, this.required, this.prompt);
   }

   @NotNull
   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("packs", this.packs),
         ExaminableProperty.of("callback", this.cb),
         ExaminableProperty.of("replace", this.replace),
         ExaminableProperty.of("required", this.required),
         ExaminableProperty.of("prompt", this.prompt)
      );
   }

   static final class BuilderImpl implements ResourcePackRequest.Builder {
      private List<ResourcePackInfo> packs;
      private ResourcePackCallback cb;
      private boolean replace;
      private boolean required;
      @Nullable
      private Component prompt;

      BuilderImpl() {
         this.packs = Collections.emptyList();
         this.cb = ResourcePackCallback.noOp();
         this.replace = false;
      }

      BuilderImpl(@NotNull ResourcePackRequest var1) {
         this.packs = var1.packs();
         this.cb = var1.callback();
         this.replace = var1.replace();
         this.required = var1.required();
         this.prompt = var1.prompt();
      }

      @NotNull
      @Override
      public ResourcePackRequest.Builder packs(@NotNull ResourcePackInfoLike var1, @NotNull ResourcePackInfoLike... var2) {
         this.packs = MonkeyBars.nonEmptyArrayToList(ResourcePackInfoLike::asResourcePackInfo, var1, var2);
         return this;
      }

      @NotNull
      @Override
      public ResourcePackRequest.Builder packs(@NotNull Iterable<? extends ResourcePackInfoLike> var1) {
         this.packs = MonkeyBars.toUnmodifiableList(ResourcePackInfoLike::asResourcePackInfo, var1);
         return this;
      }

      @NotNull
      @Override
      public ResourcePackRequest.Builder callback(@NotNull ResourcePackCallback var1) {
         this.cb = Objects.requireNonNull(var1, "cb");
         return this;
      }

      @NotNull
      @Override
      public ResourcePackRequest.Builder replace(boolean var1) {
         this.replace = var1;
         return this;
      }

      @NotNull
      @Override
      public ResourcePackRequest.Builder required(boolean var1) {
         this.required = var1;
         return this;
      }

      @NotNull
      @Override
      public ResourcePackRequest.Builder prompt(@Nullable Component var1) {
         this.prompt = var1;
         return this;
      }

      @NotNull
      public ResourcePackRequest build() {
         return new ResourcePackRequestImpl(this.packs, this.cb, this.replace, this.required, this.prompt);
      }
   }
}
