package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.network.NetworkManager_v1_12;
import net.minecraft.network.NetworkManager_v1_7;
import net.minecraft.network.NetworkManager_v1_8;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.PacketThreadUtil;
import net.minecraft.network.Packet_v1_7;
import net.minecraft.network.Packet_v1_8;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.client.CPacketResourcePackStatus;
import net.minecraft.network.play.client.CPacketResourcePackStatus.Action;
import net.minecraft.network.play.server.SPacketCustomPayload;
import net.minecraft.network.play.server.SPacketEntityHeadLook;
import net.minecraft.network.play.server.SPacketEntityMetadata;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketJoinGame;
import net.minecraft.network.play.server.SPacketResourcePackSend;
import net.minecraft.network.play.server.SPacketSetSlot;
import net.minecraft.network.play.server.SPacketSpawnMob;
import net.minecraft.network.play.server.SPacketSpawnPlayer;
import net.minecraft.network.play.server.SPacketTimeUpdate;
import net.minecraft.network.play.server.SPacketWindowItems;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.IThreadListener;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(NetHandlerPlayClient.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   INetHandlerPlayClient {
   @Shadow
   public Minecraft client;
   @Shadow
   public WorldClient world;
   @Shadow
   public List playerInfoList$v1_7;
   @Shadow
   public Map playerInfoMap;
   @Final
   @Shadow
   public NetworkManager_v1_12 netManager$v1_12;
   @Final
   @Shadow
   public NetworkManager_v1_8 netManager$v1_8;
   @Final
   @Shadow
   public NetworkManager_v1_7 netManager$v1_7;

   @Shadow
   public abstract Collection<NetworkPlayerInfo> getPlayerInfoMap$v1_8();

   @Shadow
   public abstract void sendPacket$v1_12(Packet_v1_8<?> var1);

   @Shadow
   public abstract void addToSendQueue$v1_7(Packet_v1_7 var1);

   @Shadow
   public abstract void addToSendQueue$v1_8(Packet_v1_8 var1);

   @Inject(method = "handleCustomPayload(Lnet/minecraft/network/play/server/SPacketCustomPayload;)V", at = @At("HEAD"), cancellable = true)
   private void impl$handleCustomPayload$HEAD(SPacketCustomPayload var1, CallbackInfo var2) {
      if (!var1.channel.startsWith("MC|")) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            PacketThreadUtil.checkThreadAndEnqueue((Packet_v1_8)var1, this, (IThreadListener)this.client);
         }

         byte[] var3;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            PacketBuffer var4 = var1.getBufferData$v1_8();
            var3 = new byte[var4.readableBytes()];
            var4.readBytes(var3);
         } else {
            var3 = var1.data$v1_7;
         }

         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var1.channel, var3
               )
            );
         if (var5 != null && var5.isCancelled()) {
            var2.cancel();
         }
      }
   }

   @Inject(method = "handleCustomPayload(Lnet/minecraft/network/play/server/SPacketCustomPayload;)V", at = @At("RETURN"))
   private void impl$handleCustomPayload$RETURN(SPacketCustomPayload var1, CallbackInfo var2) {
      if (var1.channel.startsWith("MC|")) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.class, () -> new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1.channel));
      }
   }

   @Inject(method = "handleJoinGame(Lnet/minecraft/network/play/server/SPacketJoinGame;)V", at = @At("RETURN"))
   private void impl$handleJoinGame(SPacketJoinGame var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.class,
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI::new
         );
   }

   @Inject(method = "handleSpawnPlayer", at = @At("RETURN"))
   private void lunar$handleSpawnPlayer(SPacketSpawnPlayer var1, CallbackInfo var2) {
      Entity var3 = this.world.getEntityByID(var1.entityId);
      if (var3 != null) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
               () -> new OCOHORHCROHICRRIHCIHHRRCIHICRI(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var3,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)this.world
               )
            );
      }
   }

   @Inject(method = "handleSpawnMob", at = @At("RETURN"))
   private void lunar$handleSpawnMob(SPacketSpawnMob var1, CallbackInfo var2) {
      Entity var3 = this.world.getEntityByID(var1.entityId);
      if (var3 != null) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
               () -> new OCOHORHCROHICRRIHCIHHRRCIHICRI(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var3,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)this.world
               )
            );
      }
   }

   @Inject(method = "handleEntityMetadata", at = @At("RETURN"))
   private void lunar$handleEntityMetadata(SPacketEntityMetadata var1, CallbackInfo var2) {
      Entity var3 = this.world.getEntityByID(var1.entityId);
      if (var3 != null) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
               () -> new OCOHORHCROHICRRIHCIHHRRCIHICRI(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var3,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)this.world
               )
            );
      }
   }

   @Inject(method = "handleEntityStatus(Lnet/minecraft/network/play/server/SPacketEntityStatus;)V", at = @At("TAIL"), locals = LocalCapture.CAPTURE_FAILHARD)
   private void lunar$handleEntityStatus(SPacketEntityStatus var1, CallbackInfo var2, Entity var3) {
      byte var4 = var1.logicOpcode;
      if (var3 != null && var4 != 21 && var4 != 35) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var3, var1.logicOpcode
               )
            );
      }
   }

   @Inject(
      method = "handleEntityStatus(Lnet/minecraft/network/play/server/SPacketEntityStatus;)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/particle/ParticleManager;emitParticleAtEntity$v1_12(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;I)V"
      )
   )
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   private void lunar$handleEntityTotem(SPacketEntityStatus var1, CallbackInfo var2, @Local Entity var3) {
      if (var3 != Minecraft.getMinecraft().player$v1_8) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               OHHRIOHROOIHOROCIRHCHORIHRRRRI.class,
               () -> new OHHRIOHROOIHOROCIRHCHORIHRRRRI(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var3
               )
            );
      }
   }

   public void bridge$addToSendQueue(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.sendPacket$v1_12((Packet_v1_8<?>)var1);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.addToSendQueue$v1_8((Packet_v1_8)var1);
      } else {
         this.addToSendQueue$v1_7((Packet_v1_7)var1);
      }
   }

   public String bridge$getRegisterPacketName() {
      return "REGISTER";
   }

   public String bridge$getLCChannelName() {
      return "Lunar-Client";
   }

   public void bridge$quit() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.netManager$v1_12.closeChannel((ITextComponent)(new TextComponentString("Quitting")));
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.netManager$v1_8.closeChannel((ITextComponent)(new TextComponentString("Quitting")));
      } else {
         this.netManager$v1_7.closeChannel((IChatComponent)(new TextComponentString("Quitting")));
      }
   }

   public void bridge$transferQuit() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         if (this.netManager$v1_12.channel.isOpen()) {
            this.netManager$v1_12.channel.close().awaitUninterruptibly(2000L);
            this.netManager$v1_12.terminationReason = (ITextComponent)(new TextComponentString("Quitting"));
         }
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         if (this.netManager$v1_8.channel.isOpen()) {
            this.netManager$v1_8.channel.close().awaitUninterruptibly(2000L);
            this.netManager$v1_8.terminationReason = (ITextComponent)(new TextComponentString("Quitting"));
         }
      } else if (this.netManager$v1_7.channel.isOpen()) {
         this.netManager$v1_7.channel.close().awaitUninterruptibly(2000L);
         this.netManager$v1_7.terminationReason = (IChatComponent)(new TextComponentString("Quitting"));
      }
   }

   @Overwrite
   public void handleTimeUpdate(SPacketTimeUpdate var1) {
      if (this.client.world != null) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            PacketThreadUtil.checkThreadAndEnqueue((Packet_v1_8)var1, this, (IThreadListener)this.client);
         }

         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR(
                  var1.worldTime, var1.totalWorldTime
               )
            );
         if (var2 == null || !var2.isCancelled()) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               this.client.world.setTotalWorldTime$v1_8(var1.totalWorldTime);
            } else {
               this.client.world.func_82738_a$v1_7(var1.totalWorldTime);
            }

            this.client.world.setWorldTime(var1.worldTime);
         }
      }
   }

   @Inject(method = "cleanup", at = @At("HEAD"))
   private void lunar$cleanup(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.HRHIOHRHORHOCIICRCHICCOIROORHC();
   }

   @Inject(method = {"onDisconnect$v1_7", "onDisconnect$v1_8"}, at = @At("HEAD"))
   private void lunar$onDisconnect(CallbackInfo var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH::HRHIOHRHORHOCIICRCHICCOIROORHC
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "handleResourcePack$v1_8", at = @At("HEAD"), cancellable = true)
   public void impl$handleResourcePack(SPacketResourcePackSend var1, CallbackInfo var2) {
      String var3 = var1.getURL();

      try {
         URI var4 = new URI(var3);
         String var5 = var4.getScheme();
         boolean var6 = "level".equals(var5);
         if (!"http".equals(var5) && !"https".equals(var5) && !var6) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               this.netManager$v1_12.sendPacket(new CPacketResourcePackStatus(Action.FAILED_DOWNLOAD));
            } else {
               this.netManager$v1_8.sendPacket(new CPacketResourcePackStatus(var1.getHash(), Action.FAILED_DOWNLOAD));
            }

            throw new URISyntaxException(var3, "Wrong protocol");
         } else {
            var3 = URLDecoder.decode(var3.substring("level://".length()), StandardCharsets.UTF_8);
            if (var6 && (var3.contains("..") || !var3.endsWith("/resources.zip"))) {
               System.out.println("Malicious server tried to access " + var3);
               EntityPlayerSP var7 = Minecraft.getMinecraft().player$v1_8;
               if (var7 != null) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
                     ITextComponent var8 = (ITextComponent)(
                        new TextComponentString(
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RED
                              + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BOLD
                                 .toString()
                              + "[WARNING] The current server has attempted to be malicious but we have stopped them."
                        )
                     );
                     Minecraft.getMinecraft().addScheduledTask$v1_8(() -> var7.sendMessage$v1_12(var8));
                  } else {
                     ITextComponent var11 = (ITextComponent)(
                        new TextComponentString(
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RED
                              + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BOLD
                                 .toString()
                              + "[WARNING] The current server has attempted to be malicious but we have stopped them."
                        )
                     );
                     Minecraft.getMinecraft().addScheduledTask$v1_8(() -> var7.addChatMessage$v1_8(var11));
                  }
               }

               throw new URISyntaxException(var3, "Invalid levelstorage resourcepack path");
            }
         }
      } catch (URISyntaxException var9) {
         var2.cancel();
         var2.cancel();
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getNetworkManager() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.netManager$v1_12;
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.netManager$v1_8
            : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.netManager$v1_7;
      }
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getPlayerInfoMap() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? new ArrayList<>(this.getPlayerInfoMap$v1_8()) : this.playerInfoList$v1_7;
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getSortedPlayerInfoMap() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return GuiPlayerTabOverlay.ENTRY_ORDERING.sortedCopy(this.getPlayerInfoMap$v1_8());
      } else {
         throw new UnsupportedOperationException();
      }
   }

   @Inject(method = "handleWindowItems", at = @At("HEAD"), cancellable = true)
   public void impl$handleWindowItems(SPacketWindowItems var1, CallbackInfo var2) {
      Object var3;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var3 = this.client.player$v1_8;
      } else {
         var3 = this.client.thePlayer$v1_7;
      }

      if (var3 == null) {
         var2.cancel();
      }
   }

   @Inject(method = "handleSetSlot", at = @At("HEAD"), cancellable = true)
   public void impl$handleSetSlot(SPacketSetSlot var1, CallbackInfo var2) {
      Object var3;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var3 = this.client.player$v1_8;
      } else {
         var3 = this.client.thePlayer$v1_7;
      }

      if (var3 == null) {
         var2.cancel();
      }
   }

   @Inject(method = "handleEntityHeadLook", at = @At("HEAD"), cancellable = true)
   private void lunar$handleEntityHeadLook(SPacketEntityHeadLook var1, CallbackInfo var2) {
      if (this.world == null) {
         var2.cancel();
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getPlayerInfo(
      UUID var1
   ) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH)this.playerInfoMap
         .get(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = {"handleJoinGame", "handleRespawn"}, at = @At("HEAD"))
   private void lunar$captureSpectatedEntity$v1_8(CallbackInfo var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$setSpectatedEntity(null);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(
      method = "handleCamera$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;setRenderViewEntity$v1_8(Lnet/minecraft/entity/Entity;)V")
   )
   private boolean lunar$captureSpectatedEntity$v1_8(Minecraft var1, Entity var2) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$setSpectatedEntity(
            var2 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
               ? null
               : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2
         );
      return true;
   }

   public String bridge$getServerBrand() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.client.player$v1_8.serverBrand$v1_8 : "";
   }
}
