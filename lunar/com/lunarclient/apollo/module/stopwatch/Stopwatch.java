package com.lunarclient.apollo.module.stopwatch;

import com.lunarclient.apollo.common.location.HudPosition;
import java.awt.Color;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class Stopwatch {
   String id;
   String name;
   boolean resetOnStart;
   boolean preventModification;
   boolean hideWhenStopped;
   @Nullable
   String displayFormat;
   @Nullable
   Color textColor;
   @Nullable
   HudPosition hudPosition;

   @Generated
   Stopwatch(String var1, String var2, boolean var3, boolean var4, boolean var5, @Nullable String var6, @Nullable Color var7, @Nullable HudPosition var8) {
      this.id = var1;
      this.name = var2;
      this.resetOnStart = var3;
      this.preventModification = var4;
      this.hideWhenStopped = var5;
      this.displayFormat = var6;
      this.textColor = var7;
      this.hudPosition = var8;
   }

   @Generated
   public static Stopwatch.StopwatchBuilder builder() {
      return new Stopwatch.StopwatchBuilder();
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public boolean isResetOnStart() {
      return this.resetOnStart;
   }

   @Generated
   public boolean isPreventModification() {
      return this.preventModification;
   }

   @Generated
   public boolean isHideWhenStopped() {
      return this.hideWhenStopped;
   }

   @Nullable
   @Generated
   public String getDisplayFormat() {
      return this.displayFormat;
   }

   @Nullable
   @Generated
   public Color getTextColor() {
      return this.textColor;
   }

   @Nullable
   @Generated
   public HudPosition getHudPosition() {
      return this.hudPosition;
   }

   @Generated
   public static class StopwatchBuilder {
      @Generated
      private String id;
      @Generated
      private String name;
      @Generated
      private boolean resetOnStart;
      @Generated
      private boolean preventModification;
      @Generated
      private boolean hideWhenStopped;
      @Generated
      private String displayFormat;
      @Generated
      private Color textColor;
      @Generated
      private HudPosition hudPosition;

      @Generated
      StopwatchBuilder() {
      }

      @Generated
      public Stopwatch.StopwatchBuilder id(String var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public Stopwatch.StopwatchBuilder name(String var1) {
         this.name = var1;
         return this;
      }

      @Generated
      public Stopwatch.StopwatchBuilder resetOnStart(boolean var1) {
         this.resetOnStart = var1;
         return this;
      }

      @Generated
      public Stopwatch.StopwatchBuilder preventModification(boolean var1) {
         this.preventModification = var1;
         return this;
      }

      @Generated
      public Stopwatch.StopwatchBuilder hideWhenStopped(boolean var1) {
         this.hideWhenStopped = var1;
         return this;
      }

      @Generated
      public Stopwatch.StopwatchBuilder displayFormat(@Nullable String var1) {
         this.displayFormat = var1;
         return this;
      }

      @Generated
      public Stopwatch.StopwatchBuilder textColor(@Nullable Color var1) {
         this.textColor = var1;
         return this;
      }

      @Generated
      public Stopwatch.StopwatchBuilder hudPosition(@Nullable HudPosition var1) {
         this.hudPosition = var1;
         return this;
      }

      @Generated
      public Stopwatch build() {
         return new Stopwatch(
            this.id, this.name, this.resetOnStart, this.preventModification, this.hideWhenStopped, this.displayFormat, this.textColor, this.hudPosition
         );
      }

      @Generated
      @Override
      public String toString() {
         return "Stopwatch.StopwatchBuilder(id="
            + this.id
            + ", name="
            + this.name
            + ", resetOnStart="
            + this.resetOnStart
            + ", preventModification="
            + this.preventModification
            + ", hideWhenStopped="
            + this.hideWhenStopped
            + ", displayFormat="
            + this.displayFormat
            + ", textColor="
            + this.textColor
            + ", hudPosition="
            + this.hudPosition
            + ")";
      }
   }
}
