package com.moonsworth.lunar.v1_12.forge.mixin;

import net.minecraft.client.gui.ServerListEntryNormal;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ServerListEntryNormal.class)
public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   @Redirect(
      method = "drawEntry",
      at = @At(value = "INVOKE", target = "Lnet/minecraftforge/fml/client/FMLClientHandler;fixDescription(Ljava/lang/String;)Ljava/lang/String;")
   )
   public String ichor$drawEntry(FMLClientHandler var1, String var2) {
      return var2;
   }

   @Redirect(
      method = "drawEntry",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraftforge/fml/client/FMLClientHandler;enhanceServerListEntry(Lnet/minecraft/client/gui/ServerListEntryNormal;Lnet/minecraft/client/multiplayer/ServerData;IIIII)Ljava/lang/String;"
      )
   )
   public String ichor$enhanceServerList(FMLClientHandler var1, ServerListEntryNormal var2, ServerData var3, int var4, int var5, int var6, int var7, int var8) {
      return null;
   }
}
