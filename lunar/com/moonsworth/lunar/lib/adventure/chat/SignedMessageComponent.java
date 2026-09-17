package com.moonsworth.lunar.lib.adventure.chat;

import com.moonsworth.lunar.lib.adventure.identity.Identity;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.security.SecureRandom;
import java.time.Instant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class SignedMessageImpl implements SignedMessage {
   static final SecureRandom RANDOM = new SecureRandom();
   private final Instant instant = Instant.now();
   private final long salt = RANDOM.nextLong();
   private final String message;
   private final Component unsignedContent;

   SignedMessageImpl(String var1, Component var2) {
      this.message = var1;
      this.unsignedContent = var2;
   }

   @NotNull
   @Override
   public Instant timestamp() {
      return this.instant;
   }

   @Override
   public long salt() {
      return this.salt;
   }

   @Override
   public SignedMessage.Signature signature() {
      return null;
   }

   @Nullable
   @Override
   public Component unsignedContent() {
      return this.unsignedContent;
   }

   @NotNull
   @Override
   public String message() {
      return this.message;
   }

   @NotNull
   @Override
   public Identity identity() {
      return Identity.nil();
   }

   static final class SignatureImpl implements SignedMessage.Signature {
      final byte[] signature;

      SignatureImpl(byte[] var1) {
         this.signature = var1;
      }

      @Override
      public byte[] bytes() {
         return this.signature;
      }
   }
}
