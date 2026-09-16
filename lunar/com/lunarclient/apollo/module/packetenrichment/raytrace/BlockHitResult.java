package com.lunarclient.apollo.module.packetenrichment.raytrace;

import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.common.location.ApolloLocation;
import lombok.Generated;

public class BlockHitResult extends RayTraceResult {
   ApolloLocation hitLocation;
   ApolloBlockLocation blockLocation;
   Direction direction;

   @Generated
   BlockHitResult(ApolloLocation var1, ApolloBlockLocation var2, Direction var3) {
      this.hitLocation = var1;
      this.blockLocation = var2;
      this.direction = var3;
   }

   @Generated
   public static BlockHitResult.BlockHitResultBuilder builder() {
      return new BlockHitResult.BlockHitResultBuilder();
   }

   @Generated
   public ApolloLocation getHitLocation() {
      return this.hitLocation;
   }

   @Generated
   public ApolloBlockLocation getBlockLocation() {
      return this.blockLocation;
   }

   @Generated
   public Direction getDirection() {
      return this.direction;
   }

   @Generated
   public static class BlockHitResultBuilder {
      @Generated
      private ApolloLocation hitLocation;
      @Generated
      private ApolloBlockLocation blockLocation;
      @Generated
      private Direction direction;

      @Generated
      BlockHitResultBuilder() {
      }

      @Generated
      public BlockHitResult.BlockHitResultBuilder hitLocation(ApolloLocation var1) {
         this.hitLocation = var1;
         return this;
      }

      @Generated
      public BlockHitResult.BlockHitResultBuilder blockLocation(ApolloBlockLocation var1) {
         this.blockLocation = var1;
         return this;
      }

      @Generated
      public BlockHitResult.BlockHitResultBuilder direction(Direction var1) {
         this.direction = var1;
         return this;
      }

      @Generated
      public BlockHitResult build() {
         return new BlockHitResult(this.hitLocation, this.blockLocation, this.direction);
      }

      @Generated
      @Override
      public String toString() {
         return "BlockHitResult.BlockHitResultBuilder(hitLocation="
            + this.hitLocation
            + ", blockLocation="
            + this.blockLocation
            + ", direction="
            + this.direction
            + ")";
      }
   }
}
