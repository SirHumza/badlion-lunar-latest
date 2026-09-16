package com.moonsworth.lunar.lib.adventure.audience;

import com.moonsworth.lunar.lib.adventure.chat.ChatType;
import com.moonsworth.lunar.lib.adventure.chat.SignedMessage;
import com.moonsworth.lunar.lib.adventure.identity.Identified;
import com.moonsworth.lunar.lib.adventure.identity.Identity;
import com.moonsworth.lunar.lib.adventure.inventory.Book;
import com.moonsworth.lunar.lib.adventure.pointer.Pointer;
import com.moonsworth.lunar.lib.adventure.resource.ResourcePackInfoLike;
import com.moonsworth.lunar.lib.adventure.resource.ResourcePackRequest;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

final class EmptyAudience implements Audience {
   static final EmptyAudience INSTANCE = new EmptyAudience();

   @NotNull
   @Override
   public <T> Optional<T> get(@NotNull Pointer<T> var1) {
      return Optional.empty();
   }

   @Contract("_, null -> null; _, !null -> !null")
   @Nullable
   @Override
   public <T> T getOrDefault(@NotNull Pointer<T> var1, @Nullable T var2) {
      return (T)var2;
   }

   @Override
   public <T> @UnknownNullability T getOrDefaultFrom(@NotNull Pointer<T> var1, @NotNull Supplier<? extends T> var2) {
      return (T)var2.get();
   }

   @NotNull
   @Override
   public Audience filterAudience(@NotNull Predicate<? super Audience> var1) {
      return this;
   }

   @Override
   public void forEachAudience(@NotNull Consumer<? super Audience> var1) {
   }

   @Override
   public void sendMessage(@NotNull ComponentLike var1) {
   }

   @Override
   public void sendMessage(@NotNull Component var1) {
   }

   @Deprecated
   @Override
   public void sendMessage(@NotNull Identified var1, @NotNull Component var2, @NotNull MessageType var3) {
   }

   @Deprecated
   @Override
   public void sendMessage(@NotNull Identity var1, @NotNull Component var2, @NotNull MessageType var3) {
   }

   @Override
   public void sendMessage(@NotNull Component var1, ChatType.@NotNull Bound var2) {
   }

   @Override
   public void sendMessage(@NotNull SignedMessage var1, ChatType.@NotNull Bound var2) {
   }

   @Override
   public void deleteMessage(SignedMessage.@NotNull Signature var1) {
   }

   @Override
   public void sendActionBar(@NotNull ComponentLike var1) {
   }

   @Override
   public void sendPlayerListHeader(@NotNull ComponentLike var1) {
   }

   @Override
   public void sendPlayerListFooter(@NotNull ComponentLike var1) {
   }

   @Override
   public void sendPlayerListHeaderAndFooter(@NotNull ComponentLike var1, @NotNull ComponentLike var2) {
   }

   @Override
   public void openBook(Book.@NotNull Builder var1) {
   }

   @Override
   public void sendResourcePacks(@NotNull ResourcePackInfoLike var1, @NotNull ResourcePackInfoLike... var2) {
   }

   @Override
   public void removeResourcePacks(@NotNull ResourcePackRequest var1) {
   }

   @Override
   public void removeResourcePacks(@NotNull ResourcePackInfoLike var1, @NotNull ResourcePackInfoLike... var2) {
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1;
   }

   @Override
   public int hashCode() {
      return 0;
   }

   @Override
   public String toString() {
      return "EmptyAudience";
   }
}
