package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(EntityOtherPlayerMP.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends AbstractClientPlayer implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Inject(method = "attackEntityFrom", at = @At("HEAD"))
   private void lunar$attackEntityFrom(DamageSource var1, float var2, CallbackInfoReturnable<Boolean> var3) {
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI var4 = (HICHRCOHCCRHOHCICOOCHOIHCCHIRI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            HICHRCOHCCRHOHCICOOCHOIHCCHIRI.class,
            () -> new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
               this, (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1, var2
            )
         );
      if (var4 != null && var4.isCancelled()) {
         var3.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(
      method = "onUpdate",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getItem()Lnet/minecraft/item/Item;"),
      locals = LocalCapture.CAPTURE_FAILHARD,
      cancellable = true
   )
   private void bridge$fixNullItems(CallbackInfo var1, double var2, double var4, float var6, ItemStack var7) {
      if (var7.getItem() == null) {
         var1.cancel();
      }
   }
}
