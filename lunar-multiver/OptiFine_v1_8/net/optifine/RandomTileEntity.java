package net.optifine;

import net.optifine.util.TileEntityUtils;

public class RandomTileEntity implements IRandomEntity {
   private akw tileEntity;

   @Override
   public int getId() {
      return Config.getRandom(this.tileEntity.v(), this.tileEntity.u());
   }

   @Override
   public cj getSpawnPosition() {
      return this.tileEntity.v();
   }

   @Override
   public String getName() {
      return TileEntityUtils.getTileEntityName(this.tileEntity);
   }

   @Override
   public ady getSpawnBiome() {
      return this.tileEntity.z().b(this.tileEntity.v());
   }

   @Override
   public int getHealth() {
      return -1;
   }

   @Override
   public int getMaxHealth() {
      return -1;
   }

   public akw getTileEntity() {
      return this.tileEntity;
   }

   public void setTileEntity(akw tileEntity) {
      this.tileEntity = tileEntity;
   }
}
