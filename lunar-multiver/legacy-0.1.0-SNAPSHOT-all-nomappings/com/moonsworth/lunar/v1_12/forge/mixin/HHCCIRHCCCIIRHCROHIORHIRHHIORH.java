package com.moonsworth.lunar.v1_12.forge.mixin;

import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.network.ServerStatusResponse;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FMLClientHandler.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Shadow
   public Map<ServerStatusResponse, JsonObject> extraServerListData;

   @Shadow
   public abstract void setupServerList();

   @Inject(method = "bindServerListData", at = @At("HEAD"))
   public void ichor$initExtraServerListData(ServerData var1, ServerStatusResponse var2, CallbackInfo var3) {
      if (this.extraServerListData == null) {
         this.setupServerList();
      }
   }

   @Inject(method = "beginMinecraftLoading", at = @At("HEAD"))
   private void initForgeBridge(Minecraft var1, List<IResourcePack> var2, IReloadableResourceManager var3, MetadataSerializer var4, CallbackInfo var5) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         new com.moonsworth.lunar.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
      );
   }
}
