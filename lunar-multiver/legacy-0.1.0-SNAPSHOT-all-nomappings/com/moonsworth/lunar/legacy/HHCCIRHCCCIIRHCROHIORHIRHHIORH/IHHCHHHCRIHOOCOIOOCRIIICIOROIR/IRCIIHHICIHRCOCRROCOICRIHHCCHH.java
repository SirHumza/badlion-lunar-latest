package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.potion.Potion;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Potion.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public boolean isBadEffect;
   @Final
   @Shadow
   public int id$v1_7;

   @Shadow
   public abstract boolean hasStatusIcon();

   @Shadow
   public abstract int getStatusIconIndex();

   public boolean bridge$isBadEffect() {
      return this.isBadEffect;
   }

   public boolean bridge$hasStatusIcon() {
      return this.hasStatusIcon();
   }

   public int bridge$getStatusIconIndex() {
      return this.getStatusIconIndex();
   }

   public int bridge$getID() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? Potion.getIdFromPotion$v1_12((Potion)this) : this.id$v1_7;
   }
}
