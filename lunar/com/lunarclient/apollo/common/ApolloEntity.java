package com.lunarclient.apollo.common;

import java.util.UUID;
import lombok.Generated;

public final class ApolloEntity {
   private final int entityId;
   private final UUID entityUuid;

   @Generated
   public ApolloEntity(int var1, UUID var2) {
      this.entityId = var1;
      this.entityUuid = var2;
   }

   @Generated
   public int getEntityId() {
      return this.entityId;
   }

   @Generated
   public UUID getEntityUuid() {
      return this.entityUuid;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ApolloEntity)) {
         return false;
      }

      ApolloEntity var2 = (ApolloEntity)var1;
      if (this.getEntityId() != var2.getEntityId()) {
         return false;
      }

      UUID var3 = this.getEntityUuid();
      UUID var4 = var2.getEntityUuid();
      return var3 == null ? var4 == null : var3.equals(var4);
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.getEntityId();
      UUID var3 = this.getEntityUuid();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ApolloEntity(entityId=" + this.getEntityId() + ", entityUuid=" + this.getEntityUuid() + ")";
   }
}
