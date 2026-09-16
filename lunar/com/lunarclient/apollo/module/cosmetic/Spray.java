package com.lunarclient.apollo.module.cosmetic;

import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.module.packetenrichment.raytrace.Direction;
import java.time.Duration;
import lombok.Generated;
import org.jetbrains.annotations.Range;

public final class Spray {
   @Range(from = 1L, to = 2147483647L) int sprayId;
   ApolloBlockLocation location;
   Direction facing;
   float rotation;
   Duration duration;

   @Generated
   private static float $default$rotation() {
      return 0.0F;
   }

   @Generated
   private static Duration $default$duration() {
      return Duration.ofSeconds(30L);
   }

   @Generated
   Spray(int var1, ApolloBlockLocation var2, Direction var3, float var4, Duration var5) {
      this.sprayId = var1;
      this.location = var2;
      this.facing = var3;
      this.rotation = var4;
      this.duration = var5;
   }

   @Generated
   public static Spray.SprayBuilder builder() {
      return new Spray.SprayBuilder();
   }

   @Generated
   public int getSprayId() {
      return this.sprayId;
   }

   @Generated
   public ApolloBlockLocation getLocation() {
      return this.location;
   }

   @Generated
   public Direction getFacing() {
      return this.facing;
   }

   @Generated
   public float getRotation() {
      return this.rotation;
   }

   @Generated
   public Duration getDuration() {
      return this.duration;
   }

   @Generated
   public static class SprayBuilder {
      @Generated
      private int sprayId;
      @Generated
      private ApolloBlockLocation location;
      @Generated
      private Direction facing;
      @Generated
      private boolean rotation$set;
      @Generated
      private float rotation$value;
      @Generated
      private boolean duration$set;
      @Generated
      private Duration duration$value;

      @Generated
      SprayBuilder() {
      }

      @Generated
      public Spray.SprayBuilder sprayId(int var1) {
         this.sprayId = var1;
         return this;
      }

      @Generated
      public Spray.SprayBuilder location(ApolloBlockLocation var1) {
         this.location = var1;
         return this;
      }

      @Generated
      public Spray.SprayBuilder facing(Direction var1) {
         this.facing = var1;
         return this;
      }

      @Generated
      public Spray.SprayBuilder rotation(float var1) {
         this.rotation$value = var1;
         this.rotation$set = true;
         return this;
      }

      @Generated
      public Spray.SprayBuilder duration(Duration var1) {
         this.duration$value = var1;
         this.duration$set = true;
         return this;
      }

      @Generated
      public Spray build() {
         float var1 = this.rotation$value;
         if (!this.rotation$set) {
            var1 = Spray.$default$rotation();
         }

         Duration var2 = this.duration$value;
         if (!this.duration$set) {
            var2 = Spray.$default$duration();
         }

         return new Spray(this.sprayId, this.location, this.facing, var1, var2);
      }

      @Generated
      @Override
      public String toString() {
         return "Spray.SprayBuilder(sprayId="
            + this.sprayId
            + ", location="
            + this.location
            + ", facing="
            + this.facing
            + ", rotation$value="
            + this.rotation$value
            + ", duration$value="
            + this.duration$value
            + ")";
      }
   }
}
