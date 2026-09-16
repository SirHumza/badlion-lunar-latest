package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import java.util.Objects;
import net.minecraft.util.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(DamageSource.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   @Shadow
   public String damageType;

   public boolean bridge$isGeneric() {
      return this == DamageSource.GENERIC;
   }

   public boolean bridge$isPlayerAttack() {
      return Objects.equals(this.damageType, "player");
   }
}
