package com.lunarclient.apollo.module.cooldown;

import java.awt.Color;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class CooldownStyle {
   @Nullable
   Color circleStartColor;
   @Nullable
   Color circleEndColor;
   @Nullable
   Color circleEdgeColor;
   @Nullable
   Color textColor;

   @Generated
   CooldownStyle(@Nullable Color var1, @Nullable Color var2, @Nullable Color var3, @Nullable Color var4) {
      this.circleStartColor = var1;
      this.circleEndColor = var2;
      this.circleEdgeColor = var3;
      this.textColor = var4;
   }

   @Generated
   public static CooldownStyle.CooldownStyleBuilder builder() {
      return new CooldownStyle.CooldownStyleBuilder();
   }

   @Nullable
   @Generated
   public Color getCircleStartColor() {
      return this.circleStartColor;
   }

   @Nullable
   @Generated
   public Color getCircleEndColor() {
      return this.circleEndColor;
   }

   @Nullable
   @Generated
   public Color getCircleEdgeColor() {
      return this.circleEdgeColor;
   }

   @Nullable
   @Generated
   public Color getTextColor() {
      return this.textColor;
   }

   @Generated
   public static class CooldownStyleBuilder {
      @Generated
      private Color circleStartColor;
      @Generated
      private Color circleEndColor;
      @Generated
      private Color circleEdgeColor;
      @Generated
      private Color textColor;

      @Generated
      CooldownStyleBuilder() {
      }

      @Generated
      public CooldownStyle.CooldownStyleBuilder circleStartColor(@Nullable Color var1) {
         this.circleStartColor = var1;
         return this;
      }

      @Generated
      public CooldownStyle.CooldownStyleBuilder circleEndColor(@Nullable Color var1) {
         this.circleEndColor = var1;
         return this;
      }

      @Generated
      public CooldownStyle.CooldownStyleBuilder circleEdgeColor(@Nullable Color var1) {
         this.circleEdgeColor = var1;
         return this;
      }

      @Generated
      public CooldownStyle.CooldownStyleBuilder textColor(@Nullable Color var1) {
         this.textColor = var1;
         return this;
      }

      @Generated
      public CooldownStyle build() {
         return new CooldownStyle(this.circleStartColor, this.circleEndColor, this.circleEdgeColor, this.textColor);
      }

      @Generated
      @Override
      public String toString() {
         return "CooldownStyle.CooldownStyleBuilder(circleStartColor="
            + this.circleStartColor
            + ", circleEndColor="
            + this.circleEndColor
            + ", circleEdgeColor="
            + this.circleEdgeColor
            + ", textColor="
            + this.textColor
            + ")";
      }
   }
}
