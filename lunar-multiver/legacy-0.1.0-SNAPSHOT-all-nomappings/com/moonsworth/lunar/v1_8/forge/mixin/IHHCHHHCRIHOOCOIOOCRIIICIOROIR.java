package com.moonsworth.lunar.v1_8.forge.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.S01PacketJoinGame;
import net.minecraft.network.play.server.S05PacketSpawnPosition;
import net.minecraft.network.play.server.S09PacketHeldItemChange;
import net.minecraft.network.play.server.S1DPacketEntityEffect;
import net.minecraft.network.play.server.S39PacketPlayerAbilities;
import net.minecraft.network.play.server.S3FPacketCustomPayload;
import net.minecraft.network.play.server.S41PacketServerDifficulty;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.ServerScoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.WorldInfo;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ServerConfigurationManager.class)
public abstract class IHHCHHHCRIHOOCOIOOCRIIICIOROIR {
   @Final
   @Shadow
   public MinecraftServer mcServer;
   @Final
   @Shadow
   public static Logger logger;

   @Shadow
   public abstract NBTTagCompound readPlayerDataFromFile(EntityPlayerMP var1);

   @Shadow
   public abstract void setPlayerGameTypeBasedOnOther(EntityPlayerMP var1, EntityPlayerMP var2, World var3);

   @Shadow
   public abstract void sendScoreboard(ServerScoreboard var1, EntityPlayerMP var2);

   @Shadow
   public abstract void sendChatMsg(IChatComponent var1);

   @Shadow
   public abstract void playerLoggedIn(EntityPlayerMP var1);

   @Shadow
   public abstract void updateTimeAndWeatherForPlayer(EntityPlayerMP var1, WorldServer var2);

   @Shadow
   public abstract MinecraftServer getServerInstance();

   @Shadow
   public abstract int getMaxPlayers();

   @Overwrite
   public void initializeConnectionToPlayer(NetworkManager var1, EntityPlayerMP var2, NetHandlerPlayServer var3) {
      GameProfile var4 = var2.getGameProfile();
      PlayerProfileCache var5 = this.mcServer.getPlayerProfileCache();
      GameProfile var6 = var5.getProfileByUUID(var4.getId());
      String var7 = var6 == null ? var4.getName() : var6.getName();
      var5.addEntry(var4);
      NBTTagCompound var8 = this.readPlayerDataFromFile(var2);
      var2.setWorld(this.mcServer.worldServerForDimension(var2.dimension));
      var2.theItemInWorldManager.setWorld((WorldServer)var2.worldObj);
      String var9 = "local";
      if (var1.getRemoteAddress() != null) {
         var9 = var1.getRemoteAddress().toString();
      }

      logger.info(
         var2.getName() + "[" + var9 + "] logged in with entity id " + var2.getEntityId() + " at (" + var2.posX + ", " + var2.posY + ", " + var2.posZ + ")"
      );
      WorldServer var10 = this.mcServer.worldServerForDimension(var2.dimension);
      WorldInfo var11 = var10.getWorldInfo();
      BlockPos var12 = var10.getSpawnPoint();
      this.setPlayerGameTypeBasedOnOther(var2, (EntityPlayerMP)null, var10);
      NetHandlerPlayServer var13 = new NetHandlerPlayServer(this.mcServer, var1, var2);
      var13.sendPacket(
         new S01PacketJoinGame(
            var2.getEntityId(),
            var2.theItemInWorldManager.getGameType(),
            var11.isHardcoreModeEnabled(),
            var10.provider.getDimensionId(),
            var10.getDifficulty(),
            this.getMaxPlayers(),
            var11.getTerrainType(),
            var10.getGameRules().getBoolean("reducedDebugInfo")
         )
      );
      var13.sendPacket(new S3FPacketCustomPayload("MC|Brand", new PacketBuffer(Unpooled.buffer()).writeString(this.getServerInstance().getServerModName())));
      this.lunar$registerBukkitApiChannel(var1, var2, var13);
      var13.sendPacket(new S41PacketServerDifficulty(var11.getDifficulty(), var11.isDifficultyLocked()));
      var13.sendPacket(new S05PacketSpawnPosition(var12));
      var13.sendPacket(new S39PacketPlayerAbilities(var2.capabilities));
      var13.sendPacket(new S09PacketHeldItemChange(var2.inventory.currentItem));
      var2.getStatFile().func_150877_d();
      var2.getStatFile().sendAchievements(var2);
      this.sendScoreboard((ServerScoreboard)var10.getScoreboard(), var2);
      this.mcServer.refreshStatusNextTick();
      ChatComponentTranslation var14;
      if (!var2.getName().equalsIgnoreCase(var7)) {
         var14 = new ChatComponentTranslation("multiplayer.player.joined.renamed", new Object[]{var2.getDisplayName(), var7});
      } else {
         var14 = new ChatComponentTranslation("multiplayer.player.joined", new Object[]{var2.getDisplayName()});
      }

      var14.getChatStyle().setColor(EnumChatFormatting.YELLOW);
      this.sendChatMsg(var14);
      this.playerLoggedIn(var2);
      var13.setPlayerLocation(var2.posX, var2.posY, var2.posZ, var2.rotationYaw, var2.rotationPitch);
      this.updateTimeAndWeatherForPlayer(var2, var10);
      if (this.mcServer.getResourcePackUrl().length() > 0) {
         var2.loadResourcePack(this.mcServer.getResourcePackUrl(), this.mcServer.getResourcePackHash());
      }

      for (PotionEffect var16 : var2.getActivePotionEffects()) {
         var13.sendPacket(new S1DPacketEntityEffect(var2.getEntityId(), var16));
      }

      var2.addSelfToInternalCraftingInventory();
      if (var8 != null && var8.hasKey("Riding", 10)) {
         Entity var17 = EntityList.createEntityFromNBT(var8.getCompoundTag("Riding"), var10);
         if (var17 != null) {
            var17.forceSpawn = true;
            var10.spawnEntityInWorld(var17);
            var2.mountEntity(var17);
            var17.forceSpawn = false;
         }
      }
   }

   private void lunar$registerBukkitApiChannel(NetworkManager var1, EntityPlayerMP var2, @Local NetHandlerPlayServer var3) {
      var3.sendPacket(new S3FPacketCustomPayload("REGISTER", new PacketBuffer(Unpooled.buffer()).writeString("lunarclient:pm")));
   }
}
