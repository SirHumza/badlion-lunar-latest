package com.lunarclient.apollo.module.marker.target;

import lombok.Generated;

public class EntityMarkerTarget extends MarkerTarget {
   String entityType;

   @Generated
   EntityMarkerTarget(String var1) {
      this.entityType = var1;
   }

   @Generated
   public static EntityMarkerTarget.EntityMarkerTargetBuilder builder() {
      return new EntityMarkerTarget.EntityMarkerTargetBuilder();
   }

   @Generated
   public String getEntityType() {
      return this.entityType;
   }

   @Generated
   public static class EntityMarkerTargetBuilder {
      @Generated
      private String entityType;

      @Generated
      EntityMarkerTargetBuilder() {
      }

      @Generated
      public EntityMarkerTarget.EntityMarkerTargetBuilder entityType(String var1) {
         this.entityType = var1;
         return this;
      }

      @Generated
      public EntityMarkerTarget build() {
         return new EntityMarkerTarget(this.entityType);
      }

      @Generated
      @Override
      public String toString() {
         return "EntityMarkerTarget.EntityMarkerTargetBuilder(entityType=" + this.entityType + ")";
      }
   }
}
