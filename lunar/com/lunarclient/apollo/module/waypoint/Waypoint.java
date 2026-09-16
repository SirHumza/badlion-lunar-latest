package com.lunarclient.apollo.module.waypoint;

import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import java.awt.Color;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class Waypoint {
   String name;
   ApolloBlockLocation location;
   Color color;
   boolean preventRemoval;
   boolean hidden;
   boolean showBeam;
   boolean highlightBlock;
   float highlightBlockLineWidth;
   @Nullable
   WaypointTextStyle textStyle;

   @Generated
   private static boolean $default$showBeam() {
      return true;
   }

   @Generated
   private static boolean $default$highlightBlock() {
      return true;
   }

   @Generated
   private static float $default$highlightBlockLineWidth() {
      return 0.0F;
   }

   @Generated
   private static WaypointTextStyle $default$textStyle() {
      return null;
   }

   @Generated
   Waypoint(
      String var1, ApolloBlockLocation var2, Color var3, boolean var4, boolean var5, boolean var6, boolean var7, float var8, @Nullable WaypointTextStyle var9
   ) {
      this.name = var1;
      this.location = var2;
      this.color = var3;
      this.preventRemoval = var4;
      this.hidden = var5;
      this.showBeam = var6;
      this.highlightBlock = var7;
      this.highlightBlockLineWidth = var8;
      this.textStyle = var9;
   }

   @Generated
   public static Waypoint.WaypointBuilder builder() {
      return new Waypoint.WaypointBuilder();
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public ApolloBlockLocation getLocation() {
      return this.location;
   }

   @Generated
   public Color getColor() {
      return this.color;
   }

   @Generated
   public boolean isPreventRemoval() {
      return this.preventRemoval;
   }

   @Generated
   public boolean isHidden() {
      return this.hidden;
   }

   @Generated
   public boolean isShowBeam() {
      return this.showBeam;
   }

   @Generated
   public boolean isHighlightBlock() {
      return this.highlightBlock;
   }

   @Generated
   public float getHighlightBlockLineWidth() {
      return this.highlightBlockLineWidth;
   }

   @Nullable
   @Generated
   public WaypointTextStyle getTextStyle() {
      return this.textStyle;
   }

   @Generated
   public static class WaypointBuilder {
      @Generated
      private String name;
      @Generated
      private ApolloBlockLocation location;
      @Generated
      private Color color;
      @Generated
      private boolean preventRemoval;
      @Generated
      private boolean hidden;
      @Generated
      private boolean showBeam$set;
      @Generated
      private boolean showBeam$value;
      @Generated
      private boolean highlightBlock$set;
      @Generated
      private boolean highlightBlock$value;
      @Generated
      private boolean highlightBlockLineWidth$set;
      @Generated
      private float highlightBlockLineWidth$value;
      @Generated
      private boolean textStyle$set;
      @Generated
      private WaypointTextStyle textStyle$value;

      @Generated
      WaypointBuilder() {
      }

      @Generated
      public Waypoint.WaypointBuilder name(String var1) {
         this.name = var1;
         return this;
      }

      @Generated
      public Waypoint.WaypointBuilder location(ApolloBlockLocation var1) {
         this.location = var1;
         return this;
      }

      @Generated
      public Waypoint.WaypointBuilder color(Color var1) {
         this.color = var1;
         return this;
      }

      @Generated
      public Waypoint.WaypointBuilder preventRemoval(boolean var1) {
         this.preventRemoval = var1;
         return this;
      }

      @Generated
      public Waypoint.WaypointBuilder hidden(boolean var1) {
         this.hidden = var1;
         return this;
      }

      @Generated
      public Waypoint.WaypointBuilder showBeam(boolean var1) {
         this.showBeam$value = var1;
         this.showBeam$set = true;
         return this;
      }

      @Generated
      public Waypoint.WaypointBuilder highlightBlock(boolean var1) {
         this.highlightBlock$value = var1;
         this.highlightBlock$set = true;
         return this;
      }

      @Generated
      public Waypoint.WaypointBuilder highlightBlockLineWidth(float var1) {
         this.highlightBlockLineWidth$value = var1;
         this.highlightBlockLineWidth$set = true;
         return this;
      }

      @Generated
      public Waypoint.WaypointBuilder textStyle(@Nullable WaypointTextStyle var1) {
         this.textStyle$value = var1;
         this.textStyle$set = true;
         return this;
      }

      @Generated
      public Waypoint build() {
         boolean var1 = this.showBeam$value;
         if (!this.showBeam$set) {
            var1 = Waypoint.$default$showBeam();
         }

         boolean var2 = this.highlightBlock$value;
         if (!this.highlightBlock$set) {
            var2 = Waypoint.$default$highlightBlock();
         }

         float var3 = this.highlightBlockLineWidth$value;
         if (!this.highlightBlockLineWidth$set) {
            var3 = Waypoint.$default$highlightBlockLineWidth();
         }

         WaypointTextStyle var4 = this.textStyle$value;
         if (!this.textStyle$set) {
            var4 = Waypoint.$default$textStyle();
         }

         return new Waypoint(this.name, this.location, this.color, this.preventRemoval, this.hidden, var1, var2, var3, var4);
      }

      @Generated
      @Override
      public String toString() {
         return "Waypoint.WaypointBuilder(name="
            + this.name
            + ", location="
            + this.location
            + ", color="
            + this.color
            + ", preventRemoval="
            + this.preventRemoval
            + ", hidden="
            + this.hidden
            + ", showBeam$value="
            + this.showBeam$value
            + ", highlightBlock$value="
            + this.highlightBlock$value
            + ", highlightBlockLineWidth$value="
            + this.highlightBlockLineWidth$value
            + ", textStyle$value="
            + this.textStyle$value
            + ")";
      }
   }
}
