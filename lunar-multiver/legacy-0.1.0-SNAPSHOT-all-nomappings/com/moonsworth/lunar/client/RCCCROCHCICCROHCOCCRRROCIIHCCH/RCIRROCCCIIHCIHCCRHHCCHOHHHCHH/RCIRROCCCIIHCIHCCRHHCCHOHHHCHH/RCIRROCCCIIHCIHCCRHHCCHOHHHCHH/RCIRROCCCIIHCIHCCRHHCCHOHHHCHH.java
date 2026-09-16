package com.moonsworth.lunar.client.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatFileWriter;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntityClientPlayerMP.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends EntityPlayer {
   @Final
   @Shadow
   public StatFileWriter field_146108_bO;

   @Overwrite
   public void addStat(StatBase var1, int var2) {
      if (var1 != null) {
         this.field_146108_bO.func_150871_b(this, var1, var2);
      }
   }
}
