package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntityDataManager.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public abstract <T> void set$v1_12(DataParameter<T> var1, Object var2);

   @Shadow
   public abstract void updateObject$v1_7(int var1, Object var2);

   @Shadow
   public abstract void updateObject$v1_8(int var1, Object var2);

   public void bridge$updateObject(int var1, Object var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         if (var1 == 10) {
            this.set$v1_12(EntityPlayer.PLAYER_MODEL_FLAG$v1_12, var2);
         }
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.updateObject$v1_8(var1, var2);
      } else {
         this.updateObject$v1_7(var1, var2);
      }
   }
}
