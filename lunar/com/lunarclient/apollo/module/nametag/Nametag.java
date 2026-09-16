package com.lunarclient.apollo.module.nametag;

import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import lombok.Generated;

public final class Nametag {
   List<Component> lines;
   NametagVisibilityOverride visibilityOverride;

   @Generated
   private static NametagVisibilityOverride $default$visibilityOverride() {
      return NametagVisibilityOverride.NONE;
   }

   @Generated
   Nametag(List<Component> var1, NametagVisibilityOverride var2) {
      this.lines = var1;
      this.visibilityOverride = var2;
   }

   @Generated
   public static Nametag.NametagBuilder builder() {
      return new Nametag.NametagBuilder();
   }

   @Generated
   public List<Component> getLines() {
      return this.lines;
   }

   @Generated
   public NametagVisibilityOverride getVisibilityOverride() {
      return this.visibilityOverride;
   }

   @Generated
   public static class NametagBuilder {
      @Generated
      private List<Component> lines;
      @Generated
      private boolean visibilityOverride$set;
      @Generated
      private NametagVisibilityOverride visibilityOverride$value;

      @Generated
      NametagBuilder() {
      }

      @Generated
      public Nametag.NametagBuilder lines(List<Component> var1) {
         this.lines = var1;
         return this;
      }

      @Generated
      public Nametag.NametagBuilder visibilityOverride(NametagVisibilityOverride var1) {
         this.visibilityOverride$value = var1;
         this.visibilityOverride$set = true;
         return this;
      }

      @Generated
      public Nametag build() {
         NametagVisibilityOverride var1 = this.visibilityOverride$value;
         if (!this.visibilityOverride$set) {
            var1 = Nametag.$default$visibilityOverride();
         }

         return new Nametag(this.lines, var1);
      }

      @Generated
      @Override
      public String toString() {
         return "Nametag.NametagBuilder(lines=" + this.lines + ", visibilityOverride$value=" + this.visibilityOverride$value + ")";
      }
   }
}
