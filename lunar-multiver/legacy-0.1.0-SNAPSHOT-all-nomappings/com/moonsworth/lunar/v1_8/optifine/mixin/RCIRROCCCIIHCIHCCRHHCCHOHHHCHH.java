package com.moonsworth.lunar.v1_8.optifine.mixin;

import com.moonsworth.lunar.v1_8.optifine.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.tileentity.TileEntitySign;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiEditSign.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public TileEntitySign tileSign;

   @Inject(method = "initGui", at = @At("HEAD"))
   public void impl$initGui(CallbackInfo var1) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.currentlyEditedSign = this.tileSign;
   }

   @Inject(method = "onGuiClosed", at = @At("HEAD"))
   public void impl$onGuiClosed(CallbackInfo var1) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.currentlyEditedSign = null;
   }
}
