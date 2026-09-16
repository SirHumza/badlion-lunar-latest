package com.lunarclient.apollo.module.chat;

import com.lunarclient.apollo.common.button.ApolloButton;
import com.lunarclient.apollo.common.button.ApolloButtonSize;
import java.awt.Color;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public final class ChatButton extends ApolloButton {
   public static final float BOX_WIDTH = 320.0F;
   public static final float BOX_HEIGHT = 20.0F;
   public static final int MAX_BUTTONS = 25;
   public static final ApolloButtonSize SIZE_SMALL = ApolloButtonSize.of(56.0F, 16.0F);
   public static final ApolloButtonSize SIZE_MEDIUM = ApolloButtonSize.of(96.0F, 16.0F);
   public static final ApolloButtonSize SIZE_ICON = ApolloButtonSize.of(16.0F);
   public static final Color DEFAULT_BACKGROUND_COLOR = new Color(0, 0, 0, 128);
   public static final Color DEFAULT_BORDER_COLOR = new Color(0, 0, 0, 128);
   @NotNull
   Color backgroundColor;
   @NotNull
   Color borderColor;

   @Generated
   private static Color $default$backgroundColor() {
      return DEFAULT_BACKGROUND_COLOR;
   }

   @Generated
   private static Color $default$borderColor() {
      return DEFAULT_BORDER_COLOR;
   }

   @Generated
   protected ChatButton(ChatButton.ChatButtonBuilder<?, ?> var1) {
      super(var1);
      if (var1.backgroundColor$set) {
         this.backgroundColor = var1.backgroundColor$value;
      } else {
         this.backgroundColor = $default$backgroundColor();
      }

      if (this.backgroundColor == null) {
         throw new NullPointerException("backgroundColor is marked non-null but is null");
      }

      if (var1.borderColor$set) {
         this.borderColor = var1.borderColor$value;
      } else {
         this.borderColor = $default$borderColor();
      }

      if (this.borderColor == null) {
         throw new NullPointerException("borderColor is marked non-null but is null");
      }
   }

   @Generated
   public static ChatButton.ChatButtonBuilder<?, ?> builder() {
      return new ChatButton.ChatButtonBuilderImpl();
   }

   @Generated
   public ChatButton.ChatButtonBuilder<?, ?> toBuilder() {
      return new ChatButton.ChatButtonBuilderImpl().$fillValuesFrom(this);
   }

   @NotNull
   @Generated
   @Override
   public Color getBackgroundColor() {
      return this.backgroundColor;
   }

   @NotNull
   @Generated
   @Override
   public Color getBorderColor() {
      return this.borderColor;
   }

   @Generated
   public abstract static class ChatButtonBuilder<C extends ChatButton, B extends ChatButton.ChatButtonBuilder<C, B>>
      extends ApolloButton.ApolloButtonBuilder<C, B> {
      @Generated
      private boolean backgroundColor$set;
      @Generated
      private Color backgroundColor$value;
      @Generated
      private boolean borderColor$set;
      @Generated
      private Color borderColor$value;

      @Generated
      protected B $fillValuesFrom(C var1) {
         super.$fillValuesFrom((C)var1);
         $fillValuesFromInstanceIntoBuilder(var1, this);
         return this.self();
      }

      @Generated
      private static void $fillValuesFromInstanceIntoBuilder(ChatButton var0, ChatButton.ChatButtonBuilder<?, ?> var1) {
         var1.backgroundColor(var0.backgroundColor);
         var1.borderColor(var0.borderColor);
      }

      @Generated
      public B backgroundColor(@NotNull Color var1) {
         if (var1 == null) {
            throw new NullPointerException("backgroundColor is marked non-null but is null");
         }

         this.backgroundColor$value = var1;
         this.backgroundColor$set = true;
         return this.self();
      }

      @Generated
      public B borderColor(@NotNull Color var1) {
         if (var1 == null) {
            throw new NullPointerException("borderColor is marked non-null but is null");
         }

         this.borderColor$value = var1;
         this.borderColor$set = true;
         return this.self();
      }

      @Generated
      protected abstract B self();

      @Generated
      public abstract C build();

      @Generated
      @Override
      public String toString() {
         return "ChatButton.ChatButtonBuilder(super="
            + super.toString()
            + ", backgroundColor$value="
            + this.backgroundColor$value
            + ", borderColor$value="
            + this.borderColor$value
            + ")";
      }
   }

   @Generated
   private static final class ChatButtonBuilderImpl extends ChatButton.ChatButtonBuilder<ChatButton, ChatButton.ChatButtonBuilderImpl> {
      @Generated
      private ChatButtonBuilderImpl() {
      }

      @Generated
      protected ChatButton.ChatButtonBuilderImpl self() {
         return this;
      }

      @Generated
      @Override
      public ChatButton build() {
         return new ChatButton(this);
      }
   }
}
