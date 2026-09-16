package com.moonsworth.lunar.lib.adventure.chat;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ChatTypeImpl implements ChatType {
   private final Key key;

   ChatTypeImpl(@NotNull Key var1) {
      this.key = var1;
   }

   @NotNull
   @Override
   public Key key() {
      return this.key;
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   static final class BoundImpl implements ChatType.Bound {
      private final ChatType chatType;
      private final Component name;
      @Nullable
      private final Component target;

      BoundImpl(ChatType var1, Component var2, @Nullable Component var3) {
         this.chatType = var1;
         this.name = var2;
         this.target = var3;
      }

      @NotNull
      @Override
      public ChatType type() {
         return this.chatType;
      }

      @NotNull
      @Override
      public Component name() {
         return this.name;
      }

      @Nullable
      @Override
      public Component target() {
         return this.target;
      }

      @Override
      public String toString() {
         return Internals.toString(this);
      }
   }
}
