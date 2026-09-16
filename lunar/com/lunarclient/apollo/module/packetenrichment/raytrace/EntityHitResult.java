package com.lunarclient.apollo.module.packetenrichment.raytrace;

import com.lunarclient.apollo.common.ApolloEntity;
import com.lunarclient.apollo.common.location.ApolloLocation;
import lombok.Generated;

public class EntityHitResult extends RayTraceResult {
   ApolloLocation hitLocation;
   ApolloEntity entityId;

   @Generated
   EntityHitResult(ApolloLocation var1, ApolloEntity var2) {
      this.hitLocation = var1;
      this.entityId = var2;
   }

   @Generated
   public static EntityHitResult.EntityHitResultBuilder builder() {
      return new EntityHitResult.EntityHitResultBuilder();
   }

   @Generated
   public ApolloLocation getHitLocation() {
      return this.hitLocation;
   }

   @Generated
   public ApolloEntity getEntityId() {
      return this.entityId;
   }

   @Generated
   public static class EntityHitResultBuilder {
      @Generated
      private ApolloLocation hitLocation;
      @Generated
      private ApolloEntity entityId;

      @Generated
      EntityHitResultBuilder() {
      }

      @Generated
      public EntityHitResult.EntityHitResultBuilder hitLocation(ApolloLocation var1) {
         this.hitLocation = var1;
         return this;
      }

      @Generated
      public EntityHitResult.EntityHitResultBuilder entityId(ApolloEntity var1) {
         this.entityId = var1;
         return this;
      }

      @Generated
      public EntityHitResult build() {
         return new EntityHitResult(this.hitLocation, this.entityId);
      }

      @Generated
      @Override
      public String toString() {
         return "EntityHitResult.EntityHitResultBuilder(hitLocation=" + this.hitLocation + ", entityId=" + this.entityId + ")";
      }
   }
}
