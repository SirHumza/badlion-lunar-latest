package com.lunarclient.apollo.module.notification;

import com.moonsworth.lunar.lib.adventure.text.Component;
import java.time.Duration;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class Notification {
   @Deprecated
   String title;
   @Deprecated
   String description;
   Component titleComponent;
   Component descriptionComponent;
   @Nullable
   String resourceLocation;
   Duration displayTime;

   @Generated
   Notification(String var1, String var2, Component var3, Component var4, @Nullable String var5, Duration var6) {
      this.title = var1;
      this.description = var2;
      this.titleComponent = var3;
      this.descriptionComponent = var4;
      this.resourceLocation = var5;
      this.displayTime = var6;
   }

   @Generated
   public static Notification.NotificationBuilder builder() {
      return new Notification.NotificationBuilder();
   }

   @Deprecated
   @Generated
   public String getTitle() {
      return this.title;
   }

   @Deprecated
   @Generated
   public String getDescription() {
      return this.description;
   }

   @Generated
   public Component getTitleComponent() {
      return this.titleComponent;
   }

   @Generated
   public Component getDescriptionComponent() {
      return this.descriptionComponent;
   }

   @Nullable
   @Generated
   public String getResourceLocation() {
      return this.resourceLocation;
   }

   @Generated
   public Duration getDisplayTime() {
      return this.displayTime;
   }

   @Generated
   public static class NotificationBuilder {
      @Generated
      private String title;
      @Generated
      private String description;
      @Generated
      private Component titleComponent;
      @Generated
      private Component descriptionComponent;
      @Generated
      private String resourceLocation;
      @Generated
      private Duration displayTime;

      @Generated
      NotificationBuilder() {
      }

      @Deprecated
      @Generated
      public Notification.NotificationBuilder title(String var1) {
         this.title = var1;
         return this;
      }

      @Deprecated
      @Generated
      public Notification.NotificationBuilder description(String var1) {
         this.description = var1;
         return this;
      }

      @Generated
      public Notification.NotificationBuilder titleComponent(Component var1) {
         this.titleComponent = var1;
         return this;
      }

      @Generated
      public Notification.NotificationBuilder descriptionComponent(Component var1) {
         this.descriptionComponent = var1;
         return this;
      }

      @Generated
      public Notification.NotificationBuilder resourceLocation(@Nullable String var1) {
         this.resourceLocation = var1;
         return this;
      }

      @Generated
      public Notification.NotificationBuilder displayTime(Duration var1) {
         this.displayTime = var1;
         return this;
      }

      @Generated
      public Notification build() {
         return new Notification(this.title, this.description, this.titleComponent, this.descriptionComponent, this.resourceLocation, this.displayTime);
      }

      @Generated
      @Override
      public String toString() {
         return "Notification.NotificationBuilder(title="
            + this.title
            + ", description="
            + this.description
            + ", titleComponent="
            + this.titleComponent
            + ", descriptionComponent="
            + this.descriptionComponent
            + ", resourceLocation="
            + this.resourceLocation
            + ", displayTime="
            + this.displayTime
            + ")";
      }
   }
}
