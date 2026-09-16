package com.moonsworth.lunar.legacy.optifine.mixin;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractClientPlayer.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public ResourceLocation locationOfCape;
   @Shadow
   public ResourceLocation locationCape$v1_7;

   @Shadow
   public abstract NetworkPlayerInfo getPlayerInfo$v1_8();

   @Inject(method = "setLocationOfCape", at = @At("HEAD"), cancellable = true, require = 1)
   private void lunar$setLocationOfCape(ResourceLocation var1, CallbackInfo var2) {
      var2.cancel();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(() -> this.bridge$setCapeLocation((RCIROOOOICRHCCRRCIORHHIRCOIIIC)var1));
      this.locationOfCape = var1;
   }

   public boolean bridge$isOptifineCape() {
      return this.locationOfCape != null;
   }

   @Nullable
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getCapeLocation() {
      if (this.locationOfCape != null) {
         return (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.locationOfCape;
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         && this.getPlayerInfo$v1_8() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
         )
       {
         return var1.bridge$getCapeLocation();
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.locationCape$v1_7 : null;
      }
   }
}
