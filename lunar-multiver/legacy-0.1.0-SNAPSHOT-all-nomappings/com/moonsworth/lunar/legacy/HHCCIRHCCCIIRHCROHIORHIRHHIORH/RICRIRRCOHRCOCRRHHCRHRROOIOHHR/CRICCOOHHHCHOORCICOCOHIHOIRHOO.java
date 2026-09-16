package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import net.minecraft.util.MovementInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(MovementInput.class)
public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public float moveStrafe;
   @Shadow
   public float moveForward;
   @Shadow
   public boolean sneak;
   @Shadow
   public boolean jump;

   public float bridge$getStrafeSpeed() {
      return this.moveStrafe;
   }

   public float bridge$getForwardSpeed() {
      return this.moveForward;
   }

   public boolean bridge$isSneaking() {
      return this.sneak;
   }

   public boolean bridge$isJumping() {
      return this.jump;
   }

   public void bridge$setMoveStrafe(float var1) {
      this.moveStrafe = var1;
   }

   public void bridge$setMoveForward(float var1) {
      this.moveForward = var1;
   }

   public void bridge$setJump(boolean var1) {
      this.jump = var1;
   }

   public void bridge$setSneak(boolean var1) {
      this.sneak = var1;
   }
}
