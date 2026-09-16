package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import net.minecraft.entity.player.PlayerCapabilities;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(PlayerCapabilities.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Shadow
   public boolean isFlying;
   @Shadow
   public boolean isCreativeMode;
   @Shadow
   public float flySpeed;
   @Shadow
   public boolean allowFlying;

   @Shadow
   public abstract float getWalkSpeed();

   public boolean bridge$isFlying() {
      return this.isFlying;
   }

   public boolean bridge$isCreativeMode() {
      return this.isCreativeMode;
   }

   public float bridge$getFlySpeed() {
      return this.flySpeed;
   }

   public void bridge$setFlySpeed(float var1) {
      this.flySpeed = var1;
   }

   public float bridge$getWalkSpeed() {
      return this.getWalkSpeed();
   }

   public boolean bridge$isAllowFlying() {
      return this.allowFlying;
   }

   public void bridge$setFlying(boolean var1) {
      this.isFlying = var1;
   }
}
