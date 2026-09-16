package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ItemFood.class)
public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public boolean alwaysEdible;
   @Shadow
   public int potionId$v1_7;
   @Shadow
   public PotionEffect potionId$v1_12;

   @Shadow
   public abstract int getHealAmount(ItemStack var1);

   @Shadow
   public abstract float getSaturationModifier(ItemStack var1);

   public int bridge$getHealing(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return this.getHealAmount((ItemStack)var1);
   }

   public float bridge$getSaturation(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return this.getHealAmount((ItemStack)var1) * this.getSaturationModifier((ItemStack)var1) * 2.0F;
   }

   public boolean bridge$canEatWhenFull() {
      return this.alwaysEdible;
   }

   public boolean bridge$givesBadEffect() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.potionId$v1_12 != null && this.potionId$v1_12.potion$v1_12 != null && this.potionId$v1_12.potion$v1_12.isBadEffect;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCICHHOCCHOROIORCOHOHIRRHCIIOR()
         .OHIIIOHIRIRCCRRIOIICCHHIORRHOH(this.potionId$v1_7);
      return var1 != null && var1.bridge$isBadEffect();
   }
}
