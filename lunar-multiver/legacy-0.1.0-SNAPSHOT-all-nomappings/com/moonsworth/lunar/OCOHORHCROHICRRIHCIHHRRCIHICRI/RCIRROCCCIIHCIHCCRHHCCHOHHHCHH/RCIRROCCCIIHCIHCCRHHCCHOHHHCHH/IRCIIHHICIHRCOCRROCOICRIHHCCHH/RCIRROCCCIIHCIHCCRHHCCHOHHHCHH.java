package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityFireworkOverlayFX;
import net.minecraft.client.particle.EntityFireworkSparkFX;
import net.minecraft.client.particle.EntityFireworkStarterFX;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntityFX.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   public boolean bridge$isFirework() {
      EntityFX var1 = (EntityFX)this;
      return var1 instanceof EntityFireworkStarterFX || var1 instanceof EntityFireworkOverlayFX || var1 instanceof EntityFireworkSparkFX;
   }
}
