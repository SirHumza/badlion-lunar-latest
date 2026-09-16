package com.moonsworth.lunar.lib.adventure.chat;

import com.moonsworth.lunar.lib.adventure.identity.Identified;
import com.moonsworth.lunar.lib.adventure.identity.Identity;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import java.time.Instant;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.NonExtendable
public interface SignedMessage extends Identified, Examinable {
   @Contract(value = "_ -> new", pure = true)
   @NotNull
   static SignedMessage.Signature signature(byte[] var0) {
      return new SignedMessageImpl.SignatureImpl(var0);
   }

   @Contract(value = "_, _ -> new", pure = true)
   @NotNull
   static SignedMessage system(@NotNull String var0, @Nullable ComponentLike var1) {
      return new SignedMessageImpl(var0, ComponentLike.unbox(var1));
   }

   @Contract(pure = true)
   @NotNull
   Instant timestamp();

   @Contract(pure = true)
   long salt();

   @Contract(pure = true)
   @Nullable
   SignedMessage.Signature signature();

   @Contract(pure = true)
   @Nullable
   Component unsignedContent();

   @Contract(pure = true)
   @NotNull
   String message();

   @Contract(pure = true)
   default boolean isSystem() {
      return this.identity() == Identity.nil();
   }

   @Contract(pure = true)
   default boolean canDelete() {
      return this.signature() != null;
   }

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("timestamp", this.timestamp()),
         ExaminableProperty.of("salt", this.salt()),
         ExaminableProperty.of("signature", this.signature()),
         ExaminableProperty.of("unsignedContent", this.unsignedContent()),
         ExaminableProperty.of("message", this.message())
      );
   }

   @ApiStatus.NonExtendable
   interface Signature extends Examinable {
      @Contract(pure = true)
      byte[] bytes();

      @NotNull
      @Override
      default Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(ExaminableProperty.of("bytes", this.bytes()));
      }
   }
}
