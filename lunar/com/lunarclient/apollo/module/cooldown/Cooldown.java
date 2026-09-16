package com.lunarclient.apollo.module.cooldown;

import com.lunarclient.apollo.common.icon.Icon;
import java.time.Duration;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class Cooldown {
   String name;
   Duration duration;
   Icon icon;
   @Nullable
   CooldownStyle style;

   @Generated
   Cooldown(String var1, Duration var2, Icon var3, @Nullable CooldownStyle var4) {
      this.name = var1;
      this.duration = var2;
      this.icon = var3;
      this.style = var4;
   }

   @Generated
   public static Cooldown.CooldownBuilder builder() {
      return new Cooldown.CooldownBuilder();
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
   public Icon getIcon() {
      return this.icon;
   }

   @Nullable
   @Generated
   public CooldownStyle getStyle() {
      return this.style;
   }

   @Generated
   public static class CooldownBuilder {
      @Generated
      private String name;
      @Generated
      private Duration duration;
      @Generated
      private Icon icon;
      @Generated
      private CooldownStyle style;

      @Generated
      CooldownBuilder() {
      }

      @Generated
      public Cooldown.CooldownBuilder name(String var1) {
         this.name = var1;
         return this;
      }

      @Generated
      public Cooldown.CooldownBuilder duration(Duration var1) {
         this.duration = var1;
         return this;
      }

      @Generated
      public Cooldown.CooldownBuilder icon(Icon var1) {
         this.icon = var1;
         return this;
      }

      @Generated
      public Cooldown.CooldownBuilder style(@Nullable CooldownStyle var1) {
         this.style = var1;
         return this;
      }

      @Generated
      public Cooldown build() {
         return new Cooldown(this.name, this.duration, this.icon, this.style);
      }

      @Generated
      @Override
      public String toString() {
         return "Cooldown.CooldownBuilder(name=" + this.name + ", duration=" + this.duration + ", icon=" + this.icon + ", style=" + this.style + ")";
      }
   }
}
