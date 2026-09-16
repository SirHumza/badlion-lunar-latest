package com.lunarclient.apollo.module.inventory;

import com.lunarclient.apollo.common.button.ApolloButton;
import com.lunarclient.apollo.common.button.ApolloButtonSize;
import java.awt.Color;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public final class InventoryButton extends ApolloButton {
   public static final float BOX_WIDTH = 92.0F;
   public static final float BOX_HEIGHT = 166.0F;
   public static final int MAX_BUTTONS_PER_BOX = 25;
   public static final Color DEFAULT_BACKGROUND_COLOR = new Color(255, 255, 255, 40);
   public static final Color DEFAULT_BORDER_COLOR = new Color(37, 37, 37, 128);
   public static final ApolloButtonSize SIZE_SMALL = ApolloButtonSize.of(26.0F);
   public static final ApolloButtonSize SIZE_MEDIUM = ApolloButtonSize.of(40.0F);
   public static final ApolloButtonSize SIZE_LARGE = ApolloButtonSize.of(84.0F);
   public static final ApolloButtonSize SIZE_WIDE = ApolloButtonSize.of(80.0F, 26.0F);
   @NotNull
   InventoryType inventoryType;
   @NotNull
   InventoryButtonBox box;
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
   protected InventoryButton(InventoryButton.InventoryButtonBuilder<?, ?> var1) {
      super(var1);
      this.inventoryType = var1.inventoryType;
      if (this.inventoryType == null) {
         throw new NullPointerException("inventoryType is marked non-null but is null");
      }

      this.box = var1.box;
      if (this.box == null) {
         throw new NullPointerException("box is marked non-null but is null");
      }

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
   public static InventoryButton.InventoryButtonBuilder<?, ?> builder() {
      return new InventoryButton.InventoryButtonBuilderImpl();
   }

   @Generated
   public InventoryButton.InventoryButtonBuilder<?, ?> toBuilder() {
      return new InventoryButton.InventoryButtonBuilderImpl().$fillValuesFrom(this);
   }

   @NotNull
   @Generated
   public InventoryType getInventoryType() {
      return this.inventoryType;
   }

   @NotNull
   @Generated
   public InventoryButtonBox getBox() {
      return this.box;
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
   public abstract static class InventoryButtonBuilder<C extends InventoryButton, B extends InventoryButton.InventoryButtonBuilder<C, B>>
      extends ApolloButton.ApolloButtonBuilder<C, B> {
      @Generated
      private InventoryType inventoryType;
      @Generated
      private InventoryButtonBox box;
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
      private static void $fillValuesFromInstanceIntoBuilder(InventoryButton var0, InventoryButton.InventoryButtonBuilder<?, ?> var1) {
         var1.inventoryType(var0.inventoryType);
         var1.box(var0.box);
         var1.backgroundColor(var0.backgroundColor);
         var1.borderColor(var0.borderColor);
      }

      @Generated
      public B inventoryType(@NotNull InventoryType var1) {
         if (var1 == null) {
            throw new NullPointerException("inventoryType is marked non-null but is null");
         }

         this.inventoryType = var1;
         return this.self();
      }

      @Generated
      public B box(@NotNull InventoryButtonBox var1) {
         if (var1 == null) {
            throw new NullPointerException("box is marked non-null but is null");
         }

         this.box = var1;
         return this.self();
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
         return "InventoryButton.InventoryButtonBuilder(super="
            + super.toString()
            + ", inventoryType="
            + this.inventoryType
            + ", box="
            + this.box
            + ", backgroundColor$value="
            + this.backgroundColor$value
            + ", borderColor$value="
            + this.borderColor$value
            + ")";
      }
   }

   @Generated
   private static final class InventoryButtonBuilderImpl
      extends InventoryButton.InventoryButtonBuilder<InventoryButton, InventoryButton.InventoryButtonBuilderImpl> {
      @Generated
      private InventoryButtonBuilderImpl() {
      }

      @Generated
      protected InventoryButton.InventoryButtonBuilderImpl self() {
         return this;
      }

      @Generated
      @Override
      public InventoryButton build() {
         return new InventoryButton(this);
      }
   }
}
