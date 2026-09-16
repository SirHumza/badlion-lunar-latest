package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import io.netty.channel.ChannelFuture;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ThreadLanServerPing;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(IntegratedServer.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends MinecraftServer
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public ThreadLanServerPing lanServerPing;
   @Shadow
   public boolean isPublic;
   @Final
   @Shadow
   public Minecraft mc;

   @Shadow
   public abstract void setGameType$v1_12(GameType var1);

   @Shadow
   public abstract void setGameType$v1_7(net.minecraft.world.WorldSettings.GameType var1);

   public boolean bridge$isReady() {
      return this.serverIsInRunLoop();
   }

   public int bridge$getPublishedPort() {
      return this.lanServerPing != null ? Integer.parseInt(this.lanServerPing.address) : -1;
   }

   public void bridge$publishWorldToLan(CRRRICCRROCOHHOHIICIHORCOORRRH var1, boolean var2, int var3) {
      try {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.getNetworkSystem().addEndpoint$v1_12(null, var3);
         } else {
            this.getNetworkSystem().addLanEndpoint$v1_7(null, var3);
         }

         LOGGER.info("Started on {}", var3);
         this.isPublic = true;
         this.lanServerPing = new ThreadLanServerPing(this.getMOTD(), var3 + "");
         this.lanServerPing.start();
         this.bridge$updateLanWorld(var1, var2);
      } catch (IOException var5) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Could not host server", new Object[0]
         );
      }
   }

   public void bridge$updateLanWorld(CRRRICCRROCOHHOHIICIHORCOORRRH var1, boolean var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.setGameType$v1_12(GameType.getByID(var1.getId()));
      } else {
         this.setGameType$v1_7(net.minecraft.world.WorldSettings.GameType.getByID(var1.getId()));
      }

      this.bridge$setAllowCheats(var2);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.mc.player$v1_8.setPermissionLevel$v1_12(var2 ? 4 : 0);
      }
   }

   public void bridge$closeLanServer(int var1) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
      if (var2 != null) {
         List var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.playerList.playerEntityList$v1_8 : this.playerList.playerEntityList$v1_7;

         for (int var4 = var3.size() - 1; var4 >= 0; var4--) {
            EntityPlayerMP var5 = (EntityPlayerMP)var3.get(var4);
            if (!var5.getUniqueID().equals(var2.bridge$getUniqueID())) {
               String var6 = "World has been closed";
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
                  var5.connection.disconnect$v1_12((ITextComponent)(new TextComponentString(var6)));
               } else {
                  var5.connection.kickPlayerFromServer$v1_7(var6);
               }
            }
         }

         List var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.networkSystem.endpoints$v1_8 : this.networkSystem.endpoints$v1_7;

         for (int var11 = var10.size() - 1; var11 >= 0; var11--) {
            Object var12 = var10.get(var11);
            if (var12 instanceof ChannelFuture var7 && var7.channel().localAddress() instanceof InetSocketAddress var8 && var8.getPort() == var1) {
               var7.channel().close().syncUninterruptibly();
               var10.remove(var12);
            }
         }

         if (this.lanServerPing != null) {
            this.lanServerPing.interrupt();
            this.lanServerPing = null;
         }
      }
   }

   public void bridge$setAllowCheats(boolean var1) {
      this.playerList.setCommandsAllowedForAll(var1);
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getGameType() {
      WorldInfo var1 = this.getEntityWorld().getWorldInfo();
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? CRRRICCRROCOHHOHIICIHORCOORRRH.getByID(var1.getGameType$v1_12().getID())
         : CRRRICCRROCOHHOHIICIHORCOORRRH.getByID(var1.getGameType$v1_7().getID());
   }

   public boolean bridge$isAllowCheats() {
      return this.getEntityWorld().getWorldInfo().areCommandsAllowed();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getDifficulty() {
      World var1 = this.getEntityWorld();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.byId(
            var1.getWorldInfo().getDifficulty$v1_8().getId$v1_12()
         );
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.byId(
               var1.getWorldInfo().getDifficulty$v1_8().getDifficultyId$v1_7()
            )
            : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.byId(
               var1.difficultySetting$v1_7.getDifficultyId$v1_7()
            );
      }
   }

   public void bridge$setDifficulty(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      EnumDifficulty var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? EnumDifficulty.byId$v1_12(var1.id)
         : EnumDifficulty.getDifficultyEnum$v1_7(var1.id);
      this.setDifficultyForAllWorlds(var2);
      WorldClient var3 = this.mc.world;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var3.getWorldInfo().setDifficulty$v1_8(var2);
      } else {
         var3.difficultySetting$v1_7 = var2;
      }
   }

   public List<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> bridge$getPlayers() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.playerList.playerEntityList$v1_8 : this.playerList.playerEntityList$v1_7;
   }

   public void bridge$haltServer() {
   }

   public File bridge$getWorldDirectory() {
      return this.anvilFile;
   }
}
