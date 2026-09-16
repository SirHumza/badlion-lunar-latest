package com.lunarclient.apollo.common.button;

import com.lunarclient.apollo.common.button.action.ApolloButtonAction;
import com.lunarclient.apollo.common.button.content.ApolloButtonContent;
import com.lunarclient.apollo.common.location.HudPosition;
import java.awt.Color;
import lombok.Generated;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.NonExtendable
public abstract class ApolloButton {
   @NotNull
   String id;
   @NotNull
   HudPosition position;
   @NotNull
   ApolloButtonSize size;
   @NotNull
   ApolloButtonShape shape;
   @NotNull
   ApolloButtonContent content;
   @Nullable
   ApolloButtonTooltip tooltip;
   @Nullable
   ApolloButtonAction onClick;
   @Nullable
   Color hoveredBackgroundColor;
   @Nullable
   Color hoveredBorderColor;

   public abstract Color getBackgroundColor();

   public abstract Color getBorderColor();

   @Generated
   private static ApolloButtonTooltip $default$tooltip() {
      return null;
   }

   @Generated
   private static ApolloButtonAction $default$onClick() {
      return null;
   }

   @Generated
   private static Color $default$hoveredBackgroundColor() {
      return null;
   }

   @Generated
   private static Color $default$hoveredBorderColor() {
      return null;
   }

   @Generated
   protected ApolloButton(ApolloButton.ApolloButtonBuilder<?, ?> var1) {
      this.id = var1.id;
      if (this.id == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      this.position = var1.position;
      if (this.position == null) {
         throw new NullPointerException("position is marked non-null but is null");
      }

      this.size = var1.size;
      if (this.size == null) {
         throw new NullPointerException("size is marked non-null but is null");
      }

      this.shape = var1.shape;
      if (this.shape == null) {
         throw new NullPointerException("shape is marked non-null but is null");
      }

      this.content = var1.content;
      if (this.content == null) {
         throw new NullPointerException("content is marked non-null but is null");
      }

      if (var1.tooltip$set) {
         this.tooltip = var1.tooltip$value;
      } else {
         this.tooltip = $default$tooltip();
      }

      if (var1.onClick$set) {
         this.onClick = var1.onClick$value;
      } else {
         this.onClick = $default$onClick();
      }

      if (var1.hoveredBackgroundColor$set) {
         this.hoveredBackgroundColor = var1.hoveredBackgroundColor$value;
      } else {
         this.hoveredBackgroundColor = $default$hoveredBackgroundColor();
      }

      if (var1.hoveredBorderColor$set) {
         this.hoveredBorderColor = var1.hoveredBorderColor$value;
      } else {
         this.hoveredBorderColor = $default$hoveredBorderColor();
      }
   }

   @NotNull
   @Generated
   public String getId() {
      return this.id;
   }

   @NotNull
   @Generated
   public HudPosition getPosition() {
      return this.position;
   }

   @NotNull
   @Generated
   public ApolloButtonSize getSize() {
      return this.size;
   }

   @NotNull
   @Generated
   public ApolloButtonShape getShape() {
      return this.shape;
   }

   @NotNull
   @Generated
   public ApolloButtonContent getContent() {
      return this.content;
   }

   @Nullable
   @Generated
   public ApolloButtonTooltip getTooltip() {
      return this.tooltip;
   }

   @Nullable
   @Generated
   public ApolloButtonAction getOnClick() {
      return this.onClick;
   }

   @Nullable
   @Generated
   public Color getHoveredBackgroundColor() {
      return this.hoveredBackgroundColor;
   }

   @Nullable
   @Generated
   public Color getHoveredBorderColor() {
      return this.hoveredBorderColor;
   }

   @Generated
   public abstract static class ApolloButtonBuilder<C extends ApolloButton, B extends ApolloButton.ApolloButtonBuilder<C, B>> {
      @Generated
      private String id;
      @Generated
      private HudPosition position;
      @Generated
      private ApolloButtonSize size;
      @Generated
      private ApolloButtonShape shape;
      @Generated
      private ApolloButtonContent content;
      @Generated
      private boolean tooltip$set;
      @Generated
      private ApolloButtonTooltip tooltip$value;
      @Generated
      private boolean onClick$set;
      @Generated
      private ApolloButtonAction onClick$value;
      @Generated
      private boolean hoveredBackgroundColor$set;
      @Generated
      private Color hoveredBackgroundColor$value;
      @Generated
      private boolean hoveredBorderColor$set;
      @Generated
      private Color hoveredBorderColor$value;

      @Generated
      protected B $fillValuesFrom(C var1) {
         $fillValuesFromInstanceIntoBuilder(var1, this);
         return this.self();
      }

      @Generated
      private static void $fillValuesFromInstanceIntoBuilder(ApolloButton var0, ApolloButton.ApolloButtonBuilder<?, ?> var1) {
         var1.id(var0.id);
         var1.position(var0.position);
         var1.size(var0.size);
         var1.shape(var0.shape);
         var1.content(var0.content);
         var1.tooltip(var0.tooltip);
         var1.onClick(var0.onClick);
         var1.hoveredBackgroundColor(var0.hoveredBackgroundColor);
         var1.hoveredBorderColor(var0.hoveredBorderColor);
      }

      @Generated
      public B id(@NotNull String var1) {
         if (var1 == null) {
            throw new NullPointerException("id is marked non-null but is null");
         }

         this.id = var1;
         return this.self();
      }

      @Generated
      public B position(@NotNull HudPosition var1) {
         if (var1 == null) {
            throw new NullPointerException("position is marked non-null but is null");
         }

         this.position = var1;
         return this.self();
      }

      @Generated
      public B size(@NotNull ApolloButtonSize var1) {
         if (var1 == null) {
            throw new NullPointerException("size is marked non-null but is null");
         }

         this.size = var1;
         return this.self();
      }

      @Generated
      public B shape(@NotNull ApolloButtonShape var1) {
         if (var1 == null) {
            throw new NullPointerException("shape is marked non-null but is null");
         }

         this.shape = var1;
         return this.self();
      }

      @Generated
      public B content(@NotNull ApolloButtonContent var1) {
         if (var1 == null) {
            throw new NullPointerException("content is marked non-null but is null");
         }

         this.content = var1;
         return this.self();
      }

      @Generated
      public B tooltip(@Nullable ApolloButtonTooltip var1) {
         this.tooltip$value = var1;
         this.tooltip$set = true;
         return this.self();
      }

      @Generated
      public B onClick(@Nullable ApolloButtonAction var1) {
         this.onClick$value = var1;
         this.onClick$set = true;
         return this.self();
      }

      @Generated
      public B hoveredBackgroundColor(@Nullable Color var1) {
         this.hoveredBackgroundColor$value = var1;
         this.hoveredBackgroundColor$set = true;
         return this.self();
      }

      @Generated
      public B hoveredBorderColor(@Nullable Color var1) {
         this.hoveredBorderColor$value = var1;
         this.hoveredBorderColor$set = true;
         return this.self();
      }

      @Generated
      protected abstract B self();

      @Generated
      public abstract C build();

      @Generated
      @Override
      public String toString() {
         return "ApolloButton.ApolloButtonBuilder(id="
            + this.id
            + ", position="
            + this.position
            + ", size="
            + this.size
            + ", shape="
            + this.shape
            + ", content="
            + this.content
            + ", tooltip$value="
            + this.tooltip$value
            + ", onClick$value="
            + this.onClick$value
            + ", hoveredBackgroundColor$value="
            + this.hoveredBackgroundColor$value
            + ", hoveredBorderColor$value="
            + this.hoveredBorderColor$value
            + ")";
      }
   }
}
