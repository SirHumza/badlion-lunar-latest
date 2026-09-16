package com.moonsworth.lunar.v1_12.forge.mixin;

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
import net.minecraft.network.play.client.CPacketCustomPayload;
import net.minecraft.network.play.server.SPacketJoinGame;
import net.minecraft.world.WorldSettings;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = NetHandlerPlayClient.class, priority = 100)
public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO implements INetHandlerPlayClient {
   @Shadow
   public Minecraft client;
   @Shadow
   public WorldClient world;
   @Shadow
   public int currentServerMaxPlayers;
   @Final
   @Shadow
   public NetworkManager netManager;

   @Overwrite
   public void handleJoinGame(SPacketJoinGame var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.client);
      this.client.playerController = new PlayerControllerMP(this.client, (NetHandlerPlayClient)this);
      this.world = new WorldClient(
         (NetHandlerPlayClient)this,
         new WorldSettings(0L, var1.getGameType(), false, var1.isHardcoreMode(), var1.getWorldType()),
         var1.getDimension(),
         var1.getDifficulty(),
         this.client.profiler
      );
      this.client.gameSettings.difficulty = var1.getDifficulty();
      this.client.loadWorld(this.world);
      this.client.player.dimension = var1.getDimension();
      this.client.displayGuiScreen(new GuiDownloadTerrain());
      this.client.player.setEntityId(var1.getPlayerId());
      this.currentServerMaxPlayers = var1.getMaxPlayers();
      this.client.player.setReducedDebug(var1.isReducedDebugInfo());
      this.client.playerController.setGameType(var1.getGameType());
      this.client.gameSettings.sendSettingsToServer();
      this.netManager
         .sendPacket(new CPacketCustomPayload("MC|Brand", new PacketBuffer(Unpooled.buffer()).writeString(ClientBrandRetriever.getClientModName())));
   }
}
