package com.lunarclient.apollo.module.border;

import com.lunarclient.apollo.common.cuboid.Cuboid2D;
import java.awt.Color;
import lombok.Generated;
import org.jetbrains.annotations.Range;

public final class Border {
   String id;
   String world;
   boolean cancelEntry;
   boolean cancelExit;
   boolean canShrinkOrExpand;
   Color color;
   Cuboid2D bounds;
   @Range(from = 0L, to = 2147483647L) int durationTicks;

   @Generated
   Border(String var1, String var2, boolean var3, boolean var4, boolean var5, Color var6, Cuboid2D var7, int var8) {
      this.id = var1;
      this.world = var2;
      this.cancelEntry = var3;
      this.cancelExit = var4;
      this.canShrinkOrExpand = var5;
      this.color = var6;
      this.bounds = var7;
      this.durationTicks = var8;
   }

   @Generated
   public static Border.BorderBuilder builder() {
      return new Border.BorderBuilder();
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public String getWorld() {
      return this.world;
   }

   @Generated
   public boolean isCancelEntry() {
      return this.cancelEntry;
   }

   @Generated
   public boolean isCancelExit() {
      return this.cancelExit;
   }

   @Generated
   public boolean isCanShrinkOrExpand() {
      return this.canShrinkOrExpand;
   }

   @Generated
   public Color getColor() {
      return this.color;
   }

   @Generated
   public Cuboid2D getBounds() {
      return this.bounds;
   }

   @Generated
   public int getDurationTicks() {
      return this.durationTicks;
   }

   @Generated
   public static class BorderBuilder {
      @Generated
      private String id;
      @Generated
      private String world;
      @Generated
      private boolean cancelEntry;
      @Generated
      private boolean cancelExit;
      @Generated
      private boolean canShrinkOrExpand;
      @Generated
      private Color color;
      @Generated
      private Cuboid2D bounds;
      @Generated
      private int durationTicks;

      @Generated
      BorderBuilder() {
      }

      @Generated
      public Border.BorderBuilder id(String var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public Border.BorderBuilder world(String var1) {
         this.world = var1;
         return this;
      }

      @Generated
      public Border.BorderBuilder cancelEntry(boolean var1) {
         this.cancelEntry = var1;
         return this;
      }

      @Generated
      public Border.BorderBuilder cancelExit(boolean var1) {
         this.cancelExit = var1;
         return this;
      }

      @Generated
      public Border.BorderBuilder canShrinkOrExpand(boolean var1) {
         this.canShrinkOrExpand = var1;
         return this;
      }

      @Generated
      public Border.BorderBuilder color(Color var1) {
         this.color = var1;
         return this;
      }

      @Generated
      public Border.BorderBuilder bounds(Cuboid2D var1) {
         this.bounds = var1;
         return this;
      }

      @Generated
      public Border.BorderBuilder durationTicks(int var1) {
         this.durationTicks = var1;
         return this;
      }

      @Generated
      public Border build() {
         return new Border(this.id, this.world, this.cancelEntry, this.cancelExit, this.canShrinkOrExpand, this.color, this.bounds, this.durationTicks);
      }

      @Generated
      @Override
      public String toString() {
         return "Border.BorderBuilder(id="
            + this.id
            + ", world="
            + this.world
            + ", cancelEntry="
            + this.cancelEntry
            + ", cancelExit="
            + this.cancelExit
            + ", canShrinkOrExpand="
            + this.canShrinkOrExpand
            + ", color="
            + this.color
            + ", bounds="
            + this.bounds
            + ", durationTicks="
            + this.durationTicks
            + ")";
      }
   }
}
