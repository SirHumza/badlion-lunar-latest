package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHRIICOIOORCHCOIICOOIHIRHHICRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketThreadUtil;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.server.SPacketAnimation;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.network.play.server.SPacketCloseWindow;
import net.minecraft.network.play.server.SPacketCollectItem;
import net.minecraft.network.play.server.SPacketConfirmTransaction;
import net.minecraft.network.play.server.SPacketDisconnect;
import net.minecraft.network.play.server.SPacketEntity;
import net.minecraft.network.play.server.SPacketEntityHeadLook;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketMaps;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.network.play.server.SPacketSetSlot;
import net.minecraft.network.play.server.SPacketSpawnObject;
import net.minecraft.network.play.server.SPacketTeams;
import net.minecraft.network.play.server.SPacketTitle;
import net.minecraft.network.play.server.SPacketUpdateBossInfo;
import net.minecraft.network.play.server.SPacketWindowItems;
import net.minecraft.network.play.server.SPacketPlayerListItem.AddPlayerData;
import net.minecraft.network.play.server.SPacketTitle.Type;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.util.IThreadListener;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NetHandlerPlayClient.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   INetHandlerPlayClient {
   @Shadow
   public WorldClient world;
   @Shadow
   public Minecraft client;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "handleCloseWindow",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
         shift = Shift.AFTER
      ),
      cancellable = true
   )
   @Dynamic
   private void lunar$dontCloseChat(SPacketCloseWindow var1, CallbackInfo var2) {
      if ((Boolean)com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
            .HCCOCCORORORICHCRIOOCROOCHHRCC()
            .get()
         && Minecraft.getMinecraft().currentScreen instanceof GuiChat) {
         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "handleCloseWindow", at = @At("HEAD"), cancellable = true)
   private void lunar$dontCloseChat$v1_7(SPacketCloseWindow var1, CallbackInfo var2) {
      if ((Boolean)com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
            .HCCOCCORORORICHCRIOOCROOCHHRCC()
            .get()
         && Minecraft.getMinecraft().currentScreen instanceof GuiChat) {
         var2.cancel();
      }
   }

   @Inject(method = "handleDisconnect", at = @At("HEAD"))
   private void lunar$onKickedEvent(SPacketDisconnect var1, CallbackInfo var2) {
      String var3;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var3 = var1.reason$v1_8.getUnformattedText();
      } else {
         var3 = var1.reason$v1_7.getUnformattedText();
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.class, () -> new OCOHORHCROHICRRIHCIHHRRCIHICRI(var3))
         );
   }

   @Inject(method = "handleSpawnObject", at = @At("RETURN"))
   private void lunar$onProjectileLaunchEvent(SPacketSpawnObject var1, CallbackInfo var2) {
      Entity var3 = this.world.getEntityByID(var1.entityId);
      if (var3 instanceof IProjectile) {
         Entity var5 = this.world.getEntityByID(var1.data);
         if (var5 == null) {
            var5 = this.world.getEntityByID(var1.data - 1);
         }

         Entity var6 = var5;
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH)var3,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var6
               )
            );
      } else if (var3 instanceof EntityFishHook var4) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH)var3,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var4.angler
               )
            );
      }
   }

   @Inject(method = "handleSpawnObject", at = @At("HEAD"), cancellable = true)
   private void lunar$skipIfWorldUnloaded(SPacketSpawnObject var1, CallbackInfo var2) {
      if (this.world == null) {
         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(
      method = "handleEntityEquipment",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;setCurrentItemOrArmor$v1_7(ILnet/minecraft/item/ItemStack;)V")
   )
   @Dynamic
   private boolean lunar$keepWithinBounds(Entity var1, int var2, ItemStack var3) {
      ItemStack[] var4 = var1.getInventory$v1_7();
      if (var2 < 0 || var4 == null) {
         return false;
      } else {
         return var1 instanceof EntityOtherPlayerMP ? var2 < var4.length + 1 : var2 < var4.length;
      }
   }

   @WrapOperation(
      method = "handleStatistics",
      at = {
            @At(
               value = "INVOKE",
               target = "Lnet/minecraft/stats/StatisticsManager;func_150873_a(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/stats/StatBase;I)V"
            ),
            @At(
               value = "INVOKE",
               target = "Lnet/minecraft/stats/StatisticsManager;unlockAchievement$v1_8(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/stats/StatBase;I)V"
            )
      },
      require = 1
   )
   @Dynamic
   private void lunar$useCustomSetValue(StatisticsManager var1, EntityPlayer var2, StatBase var3, int var4, Operation<Void> var5) {
      ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1)
         .bridge$setValueFromPacket(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var2,
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3,
            var4
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "handleCollectItem",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;removeEntityFromWorld(I)Lnet/minecraft/entity/Entity;")
   )
   private void lunar$onItemPickup(SPacketCollectItem var1, CallbackInfo var2, @Local EntityLivingBase var3, @Local Entity var4) {
      if (var3 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() && var4 instanceof EntityItem var5) {
         ItemStack var6 = var5.getItem$v1_12();
         Item var7 = var6.getItem();
         if (var7 != Items.AIR$v1_12) {
            StatBase var8 = StatList.getObjectsPickedUpStats$v1_12(var7);
            if (var8 != null) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
                  .bridge$getStatsCounter()
                  .bridge$increment(
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH(),
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var8,
                     var1.getAmount$v1_12()
                  );
            }
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapMethod(method = "handleTitle$v1_8")
   private void lunar$onTitle(SPacketTitle var1, Operation<Void> var2) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.getMessage();
      Type var4 = var1.getType();
      if (var3 != null && (var4 == Type.TITLE || var4 == Type.SUBTITLE)) {
         PacketThreadUtil.checkThreadAndEnqueue(var1, this, (IThreadListener)this.client);
         RIROICHCRROROHCCROOCCCCOCHCCRI var5 = (RIROICHCRROROHCCROOCCCCOCHCCRI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               RIROICHCRROROHCCROOCCCCOCHCCRI.class,
               () -> new RIROICHCRROROHCCROOCCCCOCHCCRI(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(var3),
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SERVER,
                  var4 == Type.SUBTITLE
               )
            );
         if (var5 != null && var5.isCancelled()) {
            return;
         }
      }

      var2.call(new Object[]{var1});
   }

   @Inject(
      method = "handleCollectItem",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;removeEntityFromWorld(I)Lnet/minecraft/entity/Entity;")
   )
   private void lunar$onItemPickup$event(SPacketCollectItem var1, CallbackInfo var2) {
      int var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? var1.func_149354_c$v1_7() : var1.getCollectedItemEntityID$v1_8();
      if (this.world.getEntityByID(var3) instanceof EntityItem var5) {
         ItemStack var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1 ? var5.getEntityItem$v1_7() : var5.getItem$v1_12();
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var6,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var5
               )
            );
      }
   }

   @Inject(method = "handleTeams", at = @At("TAIL"))
   private void lunar$onUpdateScoreboard(SPacketTeams var1, CallbackInfo var2) {
      int var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? var1.func_149307_h$v1_7() : var1.getAction$v1_8();
      if (var3 == 2) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IOIICIRIICICIIOORHCIIIIRRIHRHI.class,
               () -> new IOIICIRIICICIIOORHCIIIIRRIHRHI(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH)this.world.getScoreboard()
               )
            );
         ScorePlayerTeam var4 = this.world.getScoreboard().getTeam(var1.name);
         if (var4 != null) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               for (String var6 : var4.membershipSet$v1_8) {
                  if (this.world.getPlayerEntityByName(var6) instanceof IRRCCOICORICIHCHRHIHIHROIRHOCR var7) {
                     var7.lunar$onNameTagUpdate();
                  }
               }
            } else {
               for (Object var11 : var4.membershipSet$v1_7) {
                  if (var11 instanceof String var12 && this.world.getPlayerEntityByName(var12) instanceof IRRCCOICORICIHCHRHIHIHROIRHOCR var13) {
                     var13.lunar$onNameTagUpdate();
                  }
               }
            }
         }
      }
   }

   @Redirect(
      method = "handleSetSlot",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/InventoryPlayer;setItemStack(Lnet/minecraft/item/ItemStack;)V")
   )
   private void lunar$onSetItemStack(InventoryPlayer var1, ItemStack var2, SPacketSetSlot var3) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var4 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1.getItemStack();
      var1.setItemStack(var2);
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.class, () -> new CRICCOOHHHCHOORCICOCOHIHOIRHOO(var3.slot, var4, (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var3.item)
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(
      method = "handleSetSlot",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/InventoryPlayer;setInventorySlotContents(ILnet/minecraft/item/ItemStack;)V")
   )
   private void lunar$onSetInventorySlot(InventoryPlayer var1, int var2, ItemStack var3, SPacketSetSlot var4) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1.getStackInSlot(var2);
      var1.setInventorySlotContents(var2, var3);
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.class, () -> new CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4.slot, var5, (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var4.item)
         );
   }

   @Redirect(
      method = "handleSetSlot",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/inventory/Container;putStackInSlot(ILnet/minecraft/item/ItemStack;)V")
   )
   private void lunar$onSetContainerSlot(Container var1, int var2, ItemStack var3, SPacketSetSlot var4) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1.getSlot(var2).getStack();
      var1.putStackInSlot(var2, var3);
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.class, () -> new CRICCOOHHHCHOORCICOCOHIHOIRHOO(var4.slot, var5, (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var4.item)
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "handlePlayerPosLook", at = @At("HEAD"))
   private void lunar$onTeleportPlayer$pre$v1_7(SPacketPlayerPosLook var1, CallbackInfo var2) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
                  () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var1.x, var1.y, var1.z, var1.yaw, var1.pitch
                  )
               )
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "handlePlayerPosLook",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/PacketThreadUtil;checkThreadAndEnqueue(Lnet/minecraft/network/Packet;Lnet/minecraft/network/INetHandler;Lnet/minecraft/util/IThreadListener;)V",
         shift = Shift.AFTER
      )
   )
   @Dynamic
   private void lunar$onTeleportPlayer$pre$v1_8(SPacketPlayerPosLook var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1.x, var1.y, var1.z, var1.yaw, var1.pitch
            )
         );
   }

   @Inject(method = "handlePlayerPosLook", at = @At("TAIL"))
   private void lunar$onTeleportPlayer$post(SPacketPlayerPosLook var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> {
               Object var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? Minecraft.getMinecraft().thePlayer$v1_7 : Minecraft.getMinecraft().player$v1_8;
               return new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  ((EntityPlayerSP)var0).posX,
                  ((EntityPlayerSP)var0).posY,
                  ((EntityPlayerSP)var0).posZ,
                  ((EntityPlayerSP)var0).rotationYaw,
                  ((EntityPlayerSP)var0).rotationPitch
               );
            }
         );
   }

   @Inject(method = "handlePlayerListItem", at = @At("RETURN"))
   private void lunar$eventUpdateTabList(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHRIICOIOORCHCOIICOOIHIRHHICRI.class, HHRIICOIOORCHCOIICOOIHIRHHICRI::new);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "handlePlayerListItem", at = @At(value = "INVOKE", target = "Ljava/util/Map;put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"))
   private void lunar$syncPlayerInfo(SPacketPlayerListItem var1, CallbackInfo var2, @Local NetworkPlayerInfo var3, @Local AddPlayerData var4) {
      if (this.world.getPlayerEntityByUUID(var3.gameProfile.getId()) instanceof AbstractClientPlayer var5) {
         var5.playerInfo$v1_8 = var3;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "handleUpdateBossInfo$v1_12", at = @At("RETURN"))
   private void lunar$eventUpdateBossInfo$v1_12(SPacketUpdateBossInfo var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IHIRRIIORRHORHRORIHOROIRCORCOO.class,
            () -> new IHIRRIIORRHORHRORIHOROIRCORCOO(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.name
               )
            )
         );
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

   @Inject(method = "handleMaps", at = @At("RETURN"))
   private void lunar$mapUpdateEvent(SPacketMaps var1, CallbackInfo var2) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)ItemMap.loadMapData(
         var1.getMapId(), this.world
      );
      if (var3 != null) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class,
               () -> {
                  List var2x = var3.bridge$getMapDecorations().values().stream().toList();
                  return new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                     var1.getMapId(), var3, true, var2x
                  );
               }
            );
      }
   }

   @Inject(method = "handleEntityMovement", at = @At("TAIL"))
   private void lunar$onEntityMovement(SPacketEntity var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            CIOHHCORHRCCRICCCORIHCRHCCCRRR.class,
            () -> {
               Entity var2x = this.world.getEntityByID(var1.entityId);
               return new CIOHHCORHRCCRICCCORIHCRHCCCRRR(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2x, var1.rotating
               );
            }
         );
   }

   @Inject(method = "handleEntityVelocity", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;setVelocity(DDD)V", shift = Shift.AFTER))
   private void lunar$handleEntityVelocity(SPacketEntityVelocity var1, CallbackInfo var2, @Local Entity var3) {
      if (var3 instanceof EntityPlayerSP) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IIHRRHORCRCROCHHOHORCHCROCIHRO.class,
               () -> new IIHRRHORCRCROCHHOHORCHCROCIHRO(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "handleConfirmTransaction", at = @At("RETURN"))
   private void lunar$handleConfirmTransaction(SPacketConfirmTransaction var1, CallbackInfo var2) {
      if (!com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHHHHCRRIRRCHHICHOHHIRCIOORRH
         .RRRCHORHHHIHOCIOCRICCOIOOHHCOO()
         .CHIOCRCHIHICOHCOHCHIRORRIOCIRH()) {
         if (!var1.func_148888_e$v1_7()) {
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR.class,
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR::new
               );
         }
      }
   }

   @Inject(method = "handleChat", at = @At("RETURN"))
   private void lunar$handleChat(SPacketChat var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
            () -> {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1x = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION
                     >= 1
                  ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.getChatComponent$v1_8()
                  : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.chatComponent$v1_7;
               Component var2x = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
                  var1x
               );
               int var3;
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
                  var3 = var1.getType$v1_12().ordinal();
               } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                  var3 = var1.type$v1_8;
               } else {
                  var3 = var1.isChat$v1_7 ? 0 : 1;
               }

               return new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var2x, var3
               );
            }
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @WrapOperation(
      method = "handleStatistics",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/network/NetHandlerPlayClient;hasStatistics:Z", opcode = 180)
   )
   @Dynamic
   private boolean lunar$rewindForceAchievementsToDisplay(NetHandlerPlayClient var1, Operation<Boolean> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? true
         : (Boolean)var2.call(new Object[]{var1});
   }

   @Inject(
      method = "handleAnimation",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;getEntityByID(I)Lnet/minecraft/entity/Entity;", shift = Shift.AFTER),
      cancellable = true
   )
   private void lunar$cancelParticles(SPacketAnimation var1, CallbackInfo var2) {
      if ((var1.type == 4 || var1.type == 5)
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RHRIRRCRRHCCRROCOIHRROORORIIIH()
            .IROCIRHCHORHRIIOCRIROIHCHRHCHC()) {
         var2.cancel();
      }
   }
}
