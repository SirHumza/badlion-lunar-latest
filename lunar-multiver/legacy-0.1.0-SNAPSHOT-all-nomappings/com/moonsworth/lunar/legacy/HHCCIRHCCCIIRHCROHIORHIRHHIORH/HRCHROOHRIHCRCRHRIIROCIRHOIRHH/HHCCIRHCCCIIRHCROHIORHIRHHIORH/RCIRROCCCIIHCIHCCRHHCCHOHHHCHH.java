package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.AbstractChestHorse;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.inventory.ContainerHorseChest;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
@Mixin(AbstractHorse.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends EntityAnimal
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public ContainerHorseChest horseChest;

   public float bridge$getJumpHeight() {
      double var1 = this.getEntityAttribute(AbstractHorse.JUMP_STRENGTH).getBaseValue();
      return (float)(-0.1817584952 * var1 * var1 * var1 + 3.689713992 * var1 * var1 + 2.128599134 * var1 - 0.343930367);
   }

   public double bridge$getJumpHeightRaw() {
      return this.getEntityAttribute(AbstractHorse.JUMP_STRENGTH).getBaseValue();
   }

   public float bridge$getSpeed() {
      return (float)(this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getBaseValue() * 42.16);
   }

   public double bridge$getSpeedRaw() {
      return this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getBaseValue();
   }

   public boolean bridge$hasChest() {
      return this instanceof AbstractChestHorse var1 ? var1.hasChest() : false;
   }
}
