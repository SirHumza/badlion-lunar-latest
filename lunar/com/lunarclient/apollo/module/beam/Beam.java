package com.lunarclient.apollo.module.beam;

import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import java.awt.Color;
import lombok.Generated;

public final class Beam {
   String id;
   Color color;
   ApolloBlockLocation location;

   @Generated
   Beam(String var1, Color var2, ApolloBlockLocation var3) {
      this.id = var1;
      this.color = var2;
      this.location = var3;
   }

   @Generated
   public static Beam.BeamBuilder builder() {
      return new Beam.BeamBuilder();
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public Color getColor() {
      return this.color;
   }

   @Generated
   public ApolloBlockLocation getLocation() {
      return this.location;
   }

   @Generated
   public static class BeamBuilder {
      @Generated
      private String id;
      @Generated
      private Color color;
      @Generated
      private ApolloBlockLocation location;

      @Generated
      BeamBuilder() {
      }

      @Generated
      public Beam.BeamBuilder id(String var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public Beam.BeamBuilder color(Color var1) {
         this.color = var1;
         return this;
      }

      @Generated
      public Beam.BeamBuilder location(ApolloBlockLocation var1) {
         this.location = var1;
         return this;
      }

      @Generated
      public Beam build() {
         return new Beam(this.id, this.color, this.location);
      }

      @Generated
      @Override
      public String toString() {
         return "Beam.BeamBuilder(id=" + this.id + ", color=" + this.color + ", location=" + this.location + ")";
      }
   }
}
