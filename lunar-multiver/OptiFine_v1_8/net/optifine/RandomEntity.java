package net.optifine;

import java.util.UUID;

public class RandomEntity implements IRandomEntity {
   private pk entity;

   @Override
   public int getId() {
      UUID uuid = this.entity.aK();
      long uuidLow = uuid.getLeastSignificantBits();
      return (int)(uuidLow & 2147483647L);
   }

   @Override
   public cj getSpawnPosition() {
      return this.entity.H().spawnPosition;
   }

   @Override
   public ady getSpawnBiome() {
      return this.entity.H().spawnBiome;
   }

   @Override
   public String getName() {
      return this.entity.l_() ? this.entity.aM() : null;
   }

   @Override
   public int getHealth() {
      if (!(this.entity instanceof ps)) {
         return 0;
      }

      ps el = (ps)this.entity;
      return (int)el.bn();
   }

   @Override
   public int getMaxHealth() {
      if (!(this.entity instanceof ps)) {
         return 0;
      }

      ps el = (ps)this.entity;
      return (int)el.bu();
   }

   public pk getEntity() {
      return this.entity;
   }

   public void setEntity(pk entity) {
      this.entity = entity;
   }
}
