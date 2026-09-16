package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import net.minecraft.world.storage.WorldInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(WorldInfo.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Shadow
   public int spawnX;
   @Shadow
   public int spawnY;
   @Shadow
   public int spawnZ;
   @Shadow
   public long totalTime;

   @Shadow
   public abstract boolean isRaining();

   public int bridge$getSpawnX() {
      return this.spawnX;
   }

   public int bridge$getSpawnY() {
      return this.spawnY;
   }

   public int bridge$getSpawnZ() {
      return this.spawnZ;
   }

   public long bridge$getGameTime() {
      return this.totalTime;
   }

   public boolean bridge$isRaining() {
      return this.isRaining();
   }
}
