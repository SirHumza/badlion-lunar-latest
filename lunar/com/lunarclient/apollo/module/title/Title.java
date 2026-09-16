package com.lunarclient.apollo.module.title;

import com.moonsworth.lunar.lib.adventure.text.Component;
import java.time.Duration;
import lombok.Generated;
import org.jetbrains.annotations.Range;

public final class Title {
   TitleType type;
   Component message;
   @Range(from = 0L, to = 2147483647L) float scale;
   Duration displayTime;
   Duration fadeInTime;
   Duration fadeOutTime;
   @Range(from = 0L, to = 2147483647L) float interpolationScale;
   @Range(from = 0L, to = 2147483647L) float interpolationRate;

   @Generated
   Title(TitleType var1, Component var2, float var3, Duration var4, Duration var5, Duration var6, float var7, float var8) {
      this.type = var1;
      this.message = var2;
      this.scale = var3;
      this.displayTime = var4;
      this.fadeInTime = var5;
      this.fadeOutTime = var6;
      this.interpolationScale = var7;
      this.interpolationRate = var8;
   }

   @Generated
   public static Title.TitleBuilder builder() {
      return new Title.TitleBuilder();
   }

   @Generated
   public TitleType getType() {
      return this.type;
   }

   @Generated
   public Component getMessage() {
      return this.message;
   }

   @Generated
   public float getScale() {
      return this.scale;
   }

   @Generated
   public Duration getDisplayTime() {
      return this.displayTime;
   }

   @Generated
   public Duration getFadeInTime() {
      return this.fadeInTime;
   }

   @Generated
   public Duration getFadeOutTime() {
      return this.fadeOutTime;
   }

   @Generated
   public float getInterpolationScale() {
      return this.interpolationScale;
   }

   @Generated
   public float getInterpolationRate() {
      return this.interpolationRate;
   }

   @Generated
   public static class TitleBuilder {
      @Generated
      private TitleType type;
      @Generated
      private Component message;
      @Generated
      private float scale;
      @Generated
      private Duration displayTime;
      @Generated
      private Duration fadeInTime;
      @Generated
      private Duration fadeOutTime;
      @Generated
      private float interpolationScale;
      @Generated
      private float interpolationRate;

      @Generated
      TitleBuilder() {
      }

      @Generated
      public Title.TitleBuilder type(TitleType var1) {
         this.type = var1;
         return this;
      }

      @Generated
      public Title.TitleBuilder message(Component var1) {
         this.message = var1;
         return this;
      }

      @Generated
      public Title.TitleBuilder scale(float var1) {
         this.scale = var1;
         return this;
      }

      @Generated
      public Title.TitleBuilder displayTime(Duration var1) {
         this.displayTime = var1;
         return this;
      }

      @Generated
      public Title.TitleBuilder fadeInTime(Duration var1) {
         this.fadeInTime = var1;
         return this;
      }

      @Generated
      public Title.TitleBuilder fadeOutTime(Duration var1) {
         this.fadeOutTime = var1;
         return this;
      }

      @Generated
      public Title.TitleBuilder interpolationScale(float var1) {
         this.interpolationScale = var1;
         return this;
      }

      @Generated
      public Title.TitleBuilder interpolationRate(float var1) {
         this.interpolationRate = var1;
         return this;
      }

      @Generated
      public Title build() {
         return new Title(
            this.type, this.message, this.scale, this.displayTime, this.fadeInTime, this.fadeOutTime, this.interpolationScale, this.interpolationRate
         );
      }

      @Generated
      @Override
      public String toString() {
         return "Title.TitleBuilder(type="
            + this.type
            + ", message="
            + this.message
            + ", scale="
            + this.scale
            + ", displayTime="
            + this.displayTime
            + ", fadeInTime="
            + this.fadeInTime
            + ", fadeOutTime="
            + this.fadeOutTime
            + ", interpolationScale="
            + this.interpolationScale
            + ", interpolationRate="
            + this.interpolationRate
            + ")";
      }
   }
}
