package com.lunarclient.apollo.module.stopwatch;

import com.lunarclient.apollo.common.location.HudPosition;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.awt.Color;
import java.time.Duration;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class Timer {
   String id;
   String name;
   Duration duration;
   boolean loop;
   boolean preventModification;
   boolean hideWhenStopped;
   @Nullable
   String displayFormat;
   @Nullable
   Component titleText;
   boolean inGameNotification;
   @Nullable
   Color textColor;
   @Nullable
   HudPosition hudPosition;

   @Generated
   Timer(
      String var1,
      String var2,
      Duration var3,
      boolean var4,
      boolean var5,
      boolean var6,
      @Nullable String var7,
      @Nullable Component var8,
      boolean var9,
      @Nullable Color var10,
      @Nullable HudPosition var11
   ) {
      this.id = var1;
      this.name = var2;
      this.duration = var3;
      this.loop = var4;
      this.preventModification = var5;
      this.hideWhenStopped = var6;
      this.displayFormat = var7;
      this.titleText = var8;
      this.inGameNotification = var9;
      this.textColor = var10;
      this.hudPosition = var11;
   }

   @Generated
   public static Timer.TimerBuilder builder() {
      return new Timer.TimerBuilder();
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
   public Duration getDuration() {
      return this.duration;
   }

   @Generated
   public boolean isLoop() {
      return this.loop;
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
   public Component getTitleText() {
      return this.titleText;
   }

   @Generated
   public boolean isInGameNotification() {
      return this.inGameNotification;
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
   public static class TimerBuilder {
      @Generated
      private String id;
      @Generated
      private String name;
      @Generated
      private Duration duration;
      @Generated
      private boolean loop;
      @Generated
      private boolean preventModification;
      @Generated
      private boolean hideWhenStopped;
      @Generated
      private String displayFormat;
      @Generated
      private Component titleText;
      @Generated
      private boolean inGameNotification;
      @Generated
      private Color textColor;
      @Generated
      private HudPosition hudPosition;

      @Generated
      TimerBuilder() {
      }

      @Generated
      public Timer.TimerBuilder id(String var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder name(String var1) {
         this.name = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder duration(Duration var1) {
         this.duration = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder loop(boolean var1) {
         this.loop = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder preventModification(boolean var1) {
         this.preventModification = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder hideWhenStopped(boolean var1) {
         this.hideWhenStopped = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder displayFormat(@Nullable String var1) {
         this.displayFormat = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder titleText(@Nullable Component var1) {
         this.titleText = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder inGameNotification(boolean var1) {
         this.inGameNotification = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder textColor(@Nullable Color var1) {
         this.textColor = var1;
         return this;
      }

      @Generated
      public Timer.TimerBuilder hudPosition(@Nullable HudPosition var1) {
         this.hudPosition = var1;
         return this;
      }

      @Generated
      public Timer build() {
         return new Timer(
            this.id,
            this.name,
            this.duration,
            this.loop,
            this.preventModification,
            this.hideWhenStopped,
            this.displayFormat,
            this.titleText,
            this.inGameNotification,
            this.textColor,
            this.hudPosition
         );
      }

      @Generated
      @Override
      public String toString() {
         return "Timer.TimerBuilder(id="
            + this.id
            + ", name="
            + this.name
            + ", duration="
            + this.duration
            + ", loop="
            + this.loop
            + ", preventModification="
            + this.preventModification
            + ", hideWhenStopped="
            + this.hideWhenStopped
            + ", displayFormat="
            + this.displayFormat
            + ", titleText="
            + this.titleText
            + ", inGameNotification="
            + this.inGameNotification
            + ", textColor="
            + this.textColor
            + ", hudPosition="
            + this.hudPosition
            + ")";
      }
   }
}
