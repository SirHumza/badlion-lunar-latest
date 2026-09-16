package com.moonsworth.lunar.v1_8.forge.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import io.netty.buffer.Unpooled;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.PacketThreadUtil;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.server.S01PacketJoinGame;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.WorldSettings;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = NetHandlerPlayClient.class, priority = 100)
public abstract class IIHRRHORCRCROCHHOHORCHCROCIHRO implements INetHandlerPlayClient {
   @Shadow
   public Minecraft gameController;
   @Shadow
   public WorldClient clientWorldController;
   @Shadow
   public int currentServerMaxPlayers;
   @Final
   @Shadow
   public NetworkManager netManager;

   @Overwrite
   public void handleJoinGame(S01PacketJoinGame var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.gameController);
      this.gameController.playerController = new PlayerControllerMP(this.gameController, (NetHandlerPlayClient)this);
      this.clientWorldController = new WorldClient(
         (NetHandlerPlayClient)this,
         new WorldSettings(0L, var1.getGameType(), false, var1.isHardcoreMode(), var1.getWorldType()),
         var1.getDimension(),
         var1.getDifficulty(),
         this.gameController.mcProfiler
      );
      this.gameController.gameSettings.difficulty = var1.getDifficulty();
      this.gameController.loadWorld(this.clientWorldController);
      this.gameController.thePlayer.dimension = var1.getDimension();
      this.gameController.displayGuiScreen(new GuiDownloadTerrain((NetHandlerPlayClient)this));
      this.gameController.thePlayer.setEntityId(var1.getEntityId());
      this.currentServerMaxPlayers = var1.getMaxPlayers();
      this.gameController.thePlayer.setReducedDebug(var1.isReducedDebugInfo());
      this.gameController.playerController.setGameType(var1.getGameType());
      this.gameController.gameSettings.sendSettingsToServer();
      this.netManager
         .sendPacket(new C17PacketCustomPayload("MC|Brand", new PacketBuffer(Unpooled.buffer()).writeString(ClientBrandRetriever.getClientModName())));
   }

   @Inject(
      method = "handleUpdateTileEntity",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/network/play/server/S35PacketUpdateTileEntity;getTileEntityType()I"),
      cancellable = true
   )
   private void lunar$stopBadPackets(S35PacketUpdateTileEntity var1, CallbackInfo var2, @Local TileEntity var3) {
      if (var3 == null) {
         var2.cancel();
      }
   }
}
