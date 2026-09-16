package com.moonsworth.lunar.lib.adventure.resource;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import java.util.Objects;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ResourcePackRequest extends ResourcePackRequestLike, Examinable {
   @NotNull
   static ResourcePackRequest addingRequest(@NotNull ResourcePackInfoLike var0, @NotNull ResourcePackInfoLike... var1) {
      return resourcePackRequest().packs(var0, var1).replace(false).build();
   }

   @NotNull
   static ResourcePackRequest.Builder resourcePackRequest() {
      return new ResourcePackRequestImpl.BuilderImpl();
   }

   @NotNull
   static ResourcePackRequest.Builder resourcePackRequest(@NotNull ResourcePackRequest var0) {
      return new ResourcePackRequestImpl.BuilderImpl(Objects.requireNonNull(var0, "existing"));
   }

   @NotNull
   List<ResourcePackInfo> packs();

   @NotNull
   ResourcePackRequest packs(@NotNull Iterable<? extends ResourcePackInfoLike> var1);

   @NotNull
   ResourcePackCallback callback();

   @NotNull
   ResourcePackRequest callback(@NotNull ResourcePackCallback var1);

   boolean replace();

   @NotNull
   ResourcePackRequest replace(boolean var1);

   boolean required();

   @Nullable
   Component prompt();

   @NotNull
   @Override
   default ResourcePackRequest asResourcePackRequest() {
      return this;
   }

   interface Builder extends AbstractBuilder<ResourcePackRequest>, ResourcePackRequestLike {
      @Contract("_, _ -> this")
      @NotNull
      ResourcePackRequest.Builder packs(@NotNull ResourcePackInfoLike var1, @NotNull ResourcePackInfoLike... var2);

      @Contract("_ -> this")
      @NotNull
      ResourcePackRequest.Builder packs(@NotNull Iterable<? extends ResourcePackInfoLike> var1);

      @Contract("_ -> this")
      @NotNull
      ResourcePackRequest.Builder callback(@NotNull ResourcePackCallback var1);

      @Contract("_ -> this")
      @NotNull
      ResourcePackRequest.Builder replace(boolean var1);

      @Contract("_ -> this")
      @NotNull
      ResourcePackRequest.Builder required(boolean var1);

      @Contract("_ -> this")
      @NotNull
      ResourcePackRequest.Builder prompt(@Nullable Component var1);

      @NotNull
      @Override
      default ResourcePackRequest asResourcePackRequest() {
         return this.build();
      }
   }
}
