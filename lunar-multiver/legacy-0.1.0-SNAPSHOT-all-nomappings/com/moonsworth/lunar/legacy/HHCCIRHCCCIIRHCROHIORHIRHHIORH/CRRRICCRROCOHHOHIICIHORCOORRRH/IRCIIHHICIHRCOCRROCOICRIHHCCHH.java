package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Timer.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements HCHRIROHHHCORIOCROOCHRCIOROOCI {
   @Shadow
   public long lastSyncSysClock;
   @Shadow
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   public double lastHRTime$v1_7;

   public void bridge$setLastMS(long var1) {
      this.lastSyncSysClock = var1;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         this.lastHRTime$v1_7 = var1 / 1000.0;
      }
   }
}
