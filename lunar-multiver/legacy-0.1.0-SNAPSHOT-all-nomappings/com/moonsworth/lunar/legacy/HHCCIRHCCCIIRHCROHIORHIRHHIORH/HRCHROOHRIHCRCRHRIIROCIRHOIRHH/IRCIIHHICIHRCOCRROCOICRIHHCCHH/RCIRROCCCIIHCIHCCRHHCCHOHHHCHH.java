package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntityCreeper.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends Entity
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public int fuseTime;
   @Shadow
   public int timeSinceIgnited;
   @Shadow
   public int lastActiveTime;

   public int bridge$getMaxSwell() {
      return this.fuseTime;
   }

   public int bridge$getSwell() {
      return this.timeSinceIgnited;
   }

   public void bridge$setSwell(int var1) {
      this.timeSinceIgnited = var1;
   }

   public void bridge$setOldSwell(int var1) {
      this.lastActiveTime = var1;
   }

   public void bridge$setPowered(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.dataManager.set$v1_12(EntityCreeper.POWERED$v1_12, var1);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.dataManager.updateObject$v1_8(17, Byte.valueOf((byte)(var1 ? 1 : 0)));
      } else {
         this.dataManager.updateObject$v1_7(17, Byte.valueOf((byte)(var1 ? 1 : 0)));
      }
   }

   public void bridge$setIgnited(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.dataManager.set$v1_12(EntityCreeper.IGNITED$v1_12, var1);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.dataManager.updateObject$v1_8(18, Byte.valueOf((byte)(var1 ? 1 : 0)));
      } else {
         this.dataManager.updateObject$v1_7(18, Byte.valueOf((byte)(var1 ? 1 : 0)));
      }
   }
}
