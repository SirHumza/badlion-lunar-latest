package com.lunarclient.apollo.module.hologram;

import com.lunarclient.apollo.common.location.ApolloLocation;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import lombok.Generated;

public final class Hologram {
   String id;
   ApolloLocation location;
   List<Component> lines;
   boolean showThroughWalls;
   boolean showShadow;
   boolean showBackground;

   @Generated
   Hologram(String var1, ApolloLocation var2, List<Component> var3, boolean var4, boolean var5, boolean var6) {
      this.id = var1;
      this.location = var2;
      this.lines = var3;
      this.showThroughWalls = var4;
      this.showShadow = var5;
      this.showBackground = var6;
   }

   @Generated
   public static Hologram.HologramBuilder builder() {
      return new Hologram.HologramBuilder();
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public ApolloLocation getLocation() {
      return this.location;
   }

   @Generated
   public List<Component> getLines() {
      return this.lines;
   }

   @Generated
   public boolean isShowThroughWalls() {
      return this.showThroughWalls;
   }

   @Generated
   public boolean isShowShadow() {
      return this.showShadow;
   }

   @Generated
   public boolean isShowBackground() {
      return this.showBackground;
   }

   @Generated
   public static class HologramBuilder {
      @Generated
      private String id;
      @Generated
      private ApolloLocation location;
      @Generated
      private List<Component> lines;
      @Generated
      private boolean showThroughWalls;
      @Generated
      private boolean showShadow;
      @Generated
      private boolean showBackground;

      @Generated
      HologramBuilder() {
      }

      @Generated
      public Hologram.HologramBuilder id(String var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public Hologram.HologramBuilder location(ApolloLocation var1) {
         this.location = var1;
         return this;
      }

      @Generated
      public Hologram.HologramBuilder lines(List<Component> var1) {
         this.lines = var1;
         return this;
      }

      @Generated
      public Hologram.HologramBuilder showThroughWalls(boolean var1) {
         this.showThroughWalls = var1;
         return this;
      }

      @Generated
      public Hologram.HologramBuilder showShadow(boolean var1) {
         this.showShadow = var1;
         return this;
      }

      @Generated
      public Hologram.HologramBuilder showBackground(boolean var1) {
         this.showBackground = var1;
         return this;
      }

      @Generated
      public Hologram build() {
         return new Hologram(this.id, this.location, this.lines, this.showThroughWalls, this.showShadow, this.showBackground);
      }

      @Generated
      @Override
      public String toString() {
         return "Hologram.HologramBuilder(id="
            + this.id
            + ", location="
            + this.location
            + ", lines="
            + this.lines
            + ", showThroughWalls="
            + this.showThroughWalls
            + ", showShadow="
            + this.showShadow
            + ", showBackground="
            + this.showBackground
            + ")";
      }
   }
}
