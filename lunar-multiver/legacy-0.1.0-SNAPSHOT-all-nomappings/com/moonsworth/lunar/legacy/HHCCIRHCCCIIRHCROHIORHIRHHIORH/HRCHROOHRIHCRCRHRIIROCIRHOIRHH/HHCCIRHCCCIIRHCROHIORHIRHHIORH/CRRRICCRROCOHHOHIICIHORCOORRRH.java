package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(EntityHorse.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH extends EntityAnimal implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Unique
   private static final String[] VARIANT_NAMES = new String[]{"White", "Creamy", "Chestnut", "Brown", "Black", "Gray", "Dark Brown"};
   @Final
   @Shadow
   public static IAttribute horseJumpStrength$v1_7;

   @Shadow
   public abstract int getHorseVariant();

   @Shadow
   public abstract boolean isChested$v1_7();

   public String bridge$getVariant() {
      return VARIANT_NAMES[(this.getHorseVariant() & 0xFF) % 7];
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   public float bridge$getJumpHeight() {
      double var1 = this.getEntityAttribute(horseJumpStrength$v1_7).getBaseValue();
      return (float)(-0.1817584952 * var1 * var1 * var1 + 3.689713992 * var1 * var1 + 2.128599134 * var1 - 0.343930367);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   public double bridge$getJumpHeightRaw() {
      return this.getEntityAttribute(horseJumpStrength$v1_7).getBaseValue();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   public float bridge$getSpeed() {
      return (float)(this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getBaseValue() * 42.16);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   public double bridge$getSpeedRaw() {
      return this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getBaseValue();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   public boolean bridge$hasChest() {
      return this.isChested$v1_7();
   }
}
