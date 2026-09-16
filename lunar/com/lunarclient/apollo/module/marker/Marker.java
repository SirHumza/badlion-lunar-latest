package com.lunarclient.apollo.module.marker;

import com.lunarclient.apollo.common.location.ApolloLocation;
import com.lunarclient.apollo.module.marker.display.MarkerFlag;
import com.lunarclient.apollo.module.marker.target.MarkerTarget;
import java.awt.Color;
import java.time.Duration;
import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Marker {
   @NotNull
   String id;
   @NotNull
   ApolloLocation location;
   @NotNull
   UUID ownerId;
   @NotNull
   String ownerName;
   @NotNull
   MarkerFlag flag;
   @Nullable
   Color color;
   @NotNull
   MarkerTarget target;
   @Nullable
   Duration duration;
   boolean inGameNotification;
   boolean chatNotify;
   boolean middleClickRemove;
   @Nullable
   MarkerStyle style;

   @Generated
   private static Color $default$color() {
      return null;
   }

   @Generated
   private static Duration $default$duration() {
      return null;
   }

   @Generated
   private static boolean $default$inGameNotification() {
      return false;
   }

   @Generated
   private static boolean $default$chatNotify() {
      return false;
   }

   @Generated
   private static boolean $default$middleClickRemove() {
      return true;
   }

   @Generated
   private static MarkerStyle $default$style() {
      return null;
   }

   @Generated
   Marker(
      @NotNull String var1,
      @NotNull ApolloLocation var2,
      @NotNull UUID var3,
      @NotNull String var4,
      @NotNull MarkerFlag var5,
      @Nullable Color var6,
      @NotNull MarkerTarget var7,
      @Nullable Duration var8,
      boolean var9,
      boolean var10,
      boolean var11,
      @Nullable MarkerStyle var12
   ) {
      if (var1 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("location is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("ownerId is marked non-null but is null");
      }

      if (var4 == null) {
         throw new NullPointerException("ownerName is marked non-null but is null");
      }

      if (var5 == null) {
         throw new NullPointerException("flag is marked non-null but is null");
      }

      if (var7 == null) {
         throw new NullPointerException("target is marked non-null but is null");
      }

      this.id = var1;
      this.location = var2;
      this.ownerId = var3;
      this.ownerName = var4;
      this.flag = var5;
      this.color = var6;
      this.target = var7;
      this.duration = var8;
      this.inGameNotification = var9;
      this.chatNotify = var10;
      this.middleClickRemove = var11;
      this.style = var12;
   }

   @Generated
   public static Marker.MarkerBuilder builder() {
      return new Marker.MarkerBuilder();
   }

   @NotNull
   @Generated
   public String getId() {
      return this.id;
   }

   @NotNull
   @Generated
   public ApolloLocation getLocation() {
      return this.location;
   }

   @NotNull
   @Generated
   public UUID getOwnerId() {
      return this.ownerId;
   }

   @NotNull
   @Generated
   public String getOwnerName() {
      return this.ownerName;
   }

   @NotNull
   @Generated
   public MarkerFlag getFlag() {
      return this.flag;
   }

   @Nullable
   @Generated
   public Color getColor() {
      return this.color;
   }

   @NotNull
   @Generated
   public MarkerTarget getTarget() {
      return this.target;
   }

   @Nullable
   @Generated
   public Duration getDuration() {
      return this.duration;
   }

   @Generated
   public boolean isInGameNotification() {
      return this.inGameNotification;
   }

   @Generated
   public boolean isChatNotify() {
      return this.chatNotify;
   }

   @Generated
   public boolean isMiddleClickRemove() {
      return this.middleClickRemove;
   }

   @Nullable
   @Generated
   public MarkerStyle getStyle() {
      return this.style;
   }

   @Generated
   public static class MarkerBuilder {
      @Generated
      private String id;
      @Generated
      private ApolloLocation location;
      @Generated
      private UUID ownerId;
      @Generated
      private String ownerName;
      @Generated
      private MarkerFlag flag;
      @Generated
      private boolean color$set;
      @Generated
      private Color color$value;
      @Generated
      private MarkerTarget target;
      @Generated
      private boolean duration$set;
      @Generated
      private Duration duration$value;
      @Generated
      private boolean inGameNotification$set;
      @Generated
      private boolean inGameNotification$value;
      @Generated
      private boolean chatNotify$set;
      @Generated
      private boolean chatNotify$value;
      @Generated
      private boolean middleClickRemove$set;
      @Generated
      private boolean middleClickRemove$value;
      @Generated
      private boolean style$set;
      @Generated
      private MarkerStyle style$value;

      @Generated
      MarkerBuilder() {
      }

      @Generated
      public Marker.MarkerBuilder id(@NotNull String var1) {
         if (var1 == null) {
            throw new NullPointerException("id is marked non-null but is null");
         }

         this.id = var1;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder location(@NotNull ApolloLocation var1) {
         if (var1 == null) {
            throw new NullPointerException("location is marked non-null but is null");
         }

         this.location = var1;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder ownerId(@NotNull UUID var1) {
         if (var1 == null) {
            throw new NullPointerException("ownerId is marked non-null but is null");
         }

         this.ownerId = var1;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder ownerName(@NotNull String var1) {
         if (var1 == null) {
            throw new NullPointerException("ownerName is marked non-null but is null");
         }

         this.ownerName = var1;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder flag(@NotNull MarkerFlag var1) {
         if (var1 == null) {
            throw new NullPointerException("flag is marked non-null but is null");
         }

         this.flag = var1;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder color(@Nullable Color var1) {
         this.color$value = var1;
         this.color$set = true;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder target(@NotNull MarkerTarget var1) {
         if (var1 == null) {
            throw new NullPointerException("target is marked non-null but is null");
         }

         this.target = var1;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder duration(@Nullable Duration var1) {
         this.duration$value = var1;
         this.duration$set = true;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder inGameNotification(boolean var1) {
         this.inGameNotification$value = var1;
         this.inGameNotification$set = true;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder chatNotify(boolean var1) {
         this.chatNotify$value = var1;
         this.chatNotify$set = true;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder middleClickRemove(boolean var1) {
         this.middleClickRemove$value = var1;
         this.middleClickRemove$set = true;
         return this;
      }

      @Generated
      public Marker.MarkerBuilder style(@Nullable MarkerStyle var1) {
         this.style$value = var1;
         this.style$set = true;
         return this;
      }

      @Generated
      public Marker build() {
         Color var1 = this.color$value;
         if (!this.color$set) {
            var1 = Marker.$default$color();
         }

         Duration var2 = this.duration$value;
         if (!this.duration$set) {
            var2 = Marker.$default$duration();
         }

         boolean var3 = this.inGameNotification$value;
         if (!this.inGameNotification$set) {
            var3 = Marker.$default$inGameNotification();
         }

         boolean var4 = this.chatNotify$value;
         if (!this.chatNotify$set) {
            var4 = Marker.$default$chatNotify();
         }

         boolean var5 = this.middleClickRemove$value;
         if (!this.middleClickRemove$set) {
            var5 = Marker.$default$middleClickRemove();
         }

         MarkerStyle var6 = this.style$value;
         if (!this.style$set) {
            var6 = Marker.$default$style();
         }

         return new Marker(this.id, this.location, this.ownerId, this.ownerName, this.flag, var1, this.target, var2, var3, var4, var5, var6);
      }

      @Generated
      @Override
      public String toString() {
         return "Marker.MarkerBuilder(id="
            + this.id
            + ", location="
            + this.location
            + ", ownerId="
            + this.ownerId
            + ", ownerName="
            + this.ownerName
            + ", flag="
            + this.flag
            + ", color$value="
            + this.color$value
            + ", target="
            + this.target
            + ", duration$value="
            + this.duration$value
            + ", inGameNotification$value="
            + this.inGameNotification$value
            + ", chatNotify$value="
            + this.chatNotify$value
            + ", middleClickRemove$value="
            + this.middleClickRemove$value
            + ", style$value="
            + this.style$value
            + ")";
      }
   }
}
