package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.lunarclient.apollo.common.ApolloEntity;
import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.common.location.ApolloLocation;
import com.lunarclient.apollo.module.combat.CombatModule;
import com.lunarclient.apollo.module.packetenrichment.PacketEnrichmentModule;
import com.lunarclient.apollo.module.packetenrichment.raytrace.BlockHitResult;
import com.lunarclient.apollo.module.packetenrichment.raytrace.Direction;
import com.lunarclient.apollo.module.packetenrichment.raytrace.EntityHitResult;
import com.lunarclient.apollo.module.packetenrichment.raytrace.MissResult;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Session;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import org.joml.Vector3i;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerControllerMP.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public Minecraft mc;
   @Shadow
   public GameType currentGameType$v1_12;
   @Shadow
   public net.minecraft.world.WorldSettings.GameType currentGameType$v1_7;
   @Shadow
   public int currentPlayerItem;
   @Shadow
   public boolean isHittingBlock;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapOperation(
      method = "onPlayerDamageBlock$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/PlayerControllerMP;isHittingPosition$v1_8(Lnet/minecraft/util/math/BlockPos;)Z")
   )
   private boolean apollo$restartDigWhenNotHitting$v1_8(PlayerControllerMP var1, BlockPos var2, Operation<Boolean> var3) {
      return !this.isHittingBlock && this.apollo$isDigAndUseAllowed() ? false : (Boolean)var3.call(new Object[]{var1, var2});
   }

   @Unique
   private boolean apollo$isDigAndUseAllowed() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CombatModule.class)
         .filter(var0 -> (Boolean)var0.getOptions().get(CombatModule.ALLOW_DIG_AND_USE))
         .isPresent();
   }

   @Inject(method = "attackEntity", at = @At("HEAD"))
   private void lunar$attackEntity(EntityPlayer var1, Entity var2, CallbackInfo var3) {
      com.moonsworth.lunar.client.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOCIIROIRCOHIRHHHROHCOOHIICIHI(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
         )
         .ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI());
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "onPlayerDamageBlock$v1_8",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/PlayerControllerMP;onPlayerDestroyBlock$v1_12(Lnet/minecraft/util/math/BlockPos;)Z"
      )
   )
   private void lunar$onBlockDestroy$v1_12(BlockPos var1, EnumFacing var2, CallbackInfoReturnable<Boolean> var3, @Local Block var4) {
      this.lunar$onBlockDestroy(var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "onPlayerDamageBlock$v1_8",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/PlayerControllerMP;onPlayerDestroyBlock(Lnet/minecraft/util/BlockPos;Lnet/minecraft/util/EnumFacing;)Z"
      )
   )
   private void lunar$onBlockDestroy(BlockPos var1, EnumFacing var2, CallbackInfoReturnable<Boolean> var3, @Local Block var4) {
      this.lunar$onBlockDestroy(var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "onPlayerDamageBlock$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/PlayerControllerMP;onPlayerDestroyBlock$v1_7(IIII)Z")
   )
   private void lunar$onBlockDestroy(int var1, int var2, int var3, int var4, CallbackInfo var5, @Local Block var6) {
      this.lunar$onBlockDestroy(var6);
   }

   @Unique
   private void lunar$onBlockDestroy(Block var1) {
      StatBase var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? StatList.getBlockStats$v1_12(var1)
         : StatList.mineBlockStatArray$v1_7[Block.getIdFromBlock(var1)];
      if (var2 != null) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
            .bridge$getStatsCounter()
            .bridge$increment(
               IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH(),
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2,
               1
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "onPlayerRightClick$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$onRightClickBlock$v1_7(
      EntityPlayer var1, World var2, ItemStack var3, int var4, int var5, int var6, int var7, Vec3d var8, CallbackInfoReturnable<Boolean> var9
   ) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (RORCHCIIICOHIRROOORHOCCCCIOCCI)(new Vector3i(var4, var5, var6)),
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.getBlock$v1_7(
                  var4, var5, var6
               )
            )
         );
      if (var10 != null && var10.isCancelled()) {
         var9.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "onPlayerRightClick$v1_8", at = @At("HEAD"), cancellable = true)
   private void lunar$onRightClickBlock$v1_8(
      EntityPlayerSP var1, WorldClient var2, ItemStack var3, BlockPos var4, EnumFacing var5, Vec3d var6, CallbackInfoReturnable<Boolean> var7
   ) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (RORCHCIIICOHIRROOORHOCCCCIOCCI)var4,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.getBlockState$v1_8(var4)
                  .getBlock()
            )
         );
      if (var8 != null && var8.isCancelled()) {
         var7.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "processRightClickBlock$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$onRightClickBlock$v1_12(
      EntityPlayerSP var1, WorldClient var2, BlockPos var3, EnumFacing var4, Vec3d var5, EnumHand var6, CallbackInfoReturnable<EnumActionResult> var7
   ) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (RORCHCIIICOHIRROOORHOCCCCIOCCI)var3,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.getBlockState$v1_8(var3)
                  .getBlock()
            )
         );
      if (var8 != null && var8.isCancelled()) {
         var7.setReturnValue(EnumActionResult.FAIL);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapOperation(
      method = "createPlayer$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;getSession()Lnet/minecraft/util/Session;")
   )
   private Session lunar$rewindSetSession(Minecraft var1, Operation<Session> var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var3.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var3.HOROHROIORRIRIIIOOCCIROCRCROHI()
            .HOCCHIRHIIOOOIHIHHICHRIRIHHHRO()
            .OHCCRHHHRCHCCIIRRICHCIICIRHCRC();
         if (var4 != null) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = var4.HOCHIRHHHIIIIRRORHOOIRRORROHCI();
            return new Session(var5.getPlayerName(), var5.HRCOHIRCHCRIRORHCHICOHRHOHHRCC().toString(), "", "mojang");
         }
      }

      return (Session)var2.call(new Object[]{var1});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "interactWithEntitySendPacket$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$onRightClickEntity$v1_7(EntityPlayer var1, Entity var2, CallbackInfoReturnable<Boolean> var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2
            )
         );
      if (var4 != null && var4.isCancelled()) {
         var3.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "interactWithEntity$v1_12(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;",
      at = @At("HEAD"),
      cancellable = true
   )
   private void lunar$onRightClickEntity$v1_12(EntityPlayer var1, Entity var2, EnumHand var3, CallbackInfoReturnable<EnumActionResult> var4) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2
            )
         );
      if (var5 != null && var5.isCancelled()) {
         var4.setReturnValue(EnumActionResult.PASS);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "interactWithEntity$v1_12(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/RayTraceResult;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;",
      at = @At("HEAD"),
      cancellable = true
   )
   private void lunar$onRightClickEntity$v1_12(
      EntityPlayer var1, Entity var2, RayTraceResult var3, EnumHand var4, CallbackInfoReturnable<EnumActionResult> var5
   ) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2
            )
         );
      if (var6 != null && var6.isCancelled()) {
         var5.setReturnValue(EnumActionResult.PASS);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "onPlayerDestroyBlock$v1_7", at = @At("HEAD"))
   private void lunar$onBlockBreak$getBlock$v1_7(
      int var1,
      int var2,
      int var3,
      int var4,
      CallbackInfoReturnable<Boolean> var5,
      @Share("blockState") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var6
   ) {
      var6.set(new com.moonsworth.lunar.legacy.wrapper.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.mc.world.getBlock$v1_7(var1, var2, var3)));
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "onPlayerDestroyBlock$v1_7", at = @At("RETURN"))
   private void lunar$onBlockBreak$v1_7(
      int var1,
      int var2,
      int var3,
      int var4,
      CallbackInfoReturnable<Boolean> var5,
      @Share("blockState") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var6
   ) {
      if ((Boolean)var5.getReturnValue()) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var6.get())
                     .bridge$getBlock(),
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var6.get(),
                  (RORCHCIIICOHIRROOORHOCCCCIOCCI)(new Vector3i(var1, var2, var3))
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "onPlayerDestroyBlock$v1_8", at = @At("HEAD"))
   private void lunar$onBlockBreak$getBlock$v1_8(
      BlockPos var1,
      EnumFacing var2,
      CallbackInfoReturnable<Boolean> var3,
      @Share("blockState") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var4
   ) {
      var4.set(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.mc
            .world
            .getBlockState$v1_8(var1)
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "onPlayerDestroyBlock$v1_8", at = @At("RETURN"))
   private void lunar$onBlockBreak$v1_8(
      BlockPos var1,
      EnumFacing var2,
      CallbackInfoReturnable<Boolean> var3,
      @Share("blockState") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var4
   ) {
      if ((Boolean)var3.getReturnValue()) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.get())
                     .bridge$getBlock(),
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.get(),
                  (RORCHCIIICOHIRROOORHOCCCCIOCCI)var1
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "onPlayerDestroyBlock$v1_12", at = @At("HEAD"))
   private void lunar$onBlockBreak$getBlock$v1_12(
      BlockPos var1,
      CallbackInfoReturnable<Boolean> var2,
      @Share("blockState") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var3
   ) {
      var3.set(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.mc
            .world
            .getBlockState$v1_8(var1)
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "onPlayerDestroyBlock$v1_12", at = @At("RETURN"))
   private void lunar$onBlockBreak$v1_12(
      BlockPos var1,
      CallbackInfoReturnable<Boolean> var2,
      @Share("blockState") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var3
   ) {
      if ((Boolean)var2.getReturnValue()) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.get())
                     .bridge$getBlock(),
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.get(),
                  (RORCHCIIICOHIRROOORHOCCCCIOCCI)var1
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "setGameType$v1_7", at = @At("HEAD"))
   private void lunar$onGameTypeChange(net.minecraft.world.WorldSettings.GameType var1, CallbackInfo var2) {
      if (this.currentGameType$v1_7 != null && this.currentGameType$v1_7.id != -1 && this.currentGameType$v1_7 != var1) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.getByID(
                     this.currentGameType$v1_7.id
                  ),
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.getByID(var1.id)
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "setGameType$v1_12", at = @At("HEAD"))
   private void lunar$onGameTypeChange(GameType var1, CallbackInfo var2) {
      if (this.currentGameType$v1_12 != null && this.currentGameType$v1_12.id != -1 && this.currentGameType$v1_12 != var1) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.getByID(
                     this.currentGameType$v1_12.id
                  ),
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.getByID(var1.id)
               )
            );
      }
   }

   @Inject(method = "attackEntity", at = @At("HEAD"))
   private void lunar$clickMouse$eventPreAttackEntityClient(EntityPlayer var1, Entity var2, CallbackInfo var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            HICRRICCHCCROOHHCHOCOCCHOIHHOC.class,
            () -> {
               Minecraft var1x = Minecraft.getMinecraft();
               Vec3d var2x;
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                  var2x = var1x.renderViewEntity$v1_8.getPositionEyes$v1_8(var1x.timer.renderPartialTicks);
               } else {
                  var2x = var1x.renderViewEntity$v1_7
                     .getPosition$v1_7(var1x.timer.renderPartialTicks)
                     .addVector$v1_7(0.0, var1x.renderViewEntity$v1_7.getEyeHeight(), 0.0);
               }

               return new HICRRICCHCCROOHHCHOCOCCHOIHHOC(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2,
                  var2x.distanceTo(var1x.objectMouseOver.hitVec),
                  (CRHROHHHCIHHCOHCOORCRIHHIICROR)var1x.objectMouseOver.hitVec
               );
            }
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "sendUseItem$v1_7",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/NetHandlerPlayClient;addToSendQueue$v1_7(Lnet/minecraft/network/Packet_v1_7;)V",
         ordinal = 0,
         shift = Shift.BEFORE
      )
   )
   private void apollo$sendRayTraceAirClick$v1_7(EntityPlayer var1, World var2, ItemStack var3, CallbackInfoReturnable<Boolean> var4) {
      this.apollo$forwardRayTracePosition(var1, var3, var2);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "onPlayerRightClick$v1_7",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/NetHandlerPlayClient;addToSendQueue$v1_7(Lnet/minecraft/network/Packet_v1_7;)V",
         ordinal = 0,
         shift = Shift.BEFORE
      )
   )
   private void apollo$forwardRayTracePosition$v1_7(
      EntityPlayer var1, World var2, ItemStack var3, int var4, int var5, int var6, int var7, Vec3d var8, CallbackInfoReturnable<Boolean> var9
   ) {
      this.apollo$forwardRayTracePosition(var1, var3, var2);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "onPlayerRightClick$v1_8",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/NetHandlerPlayClient;addToSendQueue$v1_8(Lnet/minecraft/network/Packet_v1_8;)V",
         ordinal = 0,
         shift = Shift.BEFORE
      )
   )
   private void apollo$forwardRayTracePosition$v1_8(
      EntityPlayerSP var1, WorldClient var2, ItemStack var3, BlockPos var4, EnumFacing var5, Vec3d var6, CallbackInfoReturnable<Boolean> var7
   ) {
      this.apollo$forwardRayTracePosition(var1, var3, var2);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "sendUseItem$v1_7",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/NetHandlerPlayClient;addToSendQueue$v1_8(Lnet/minecraft/network/Packet_v1_8;)V",
         ordinal = 0,
         shift = Shift.BEFORE
      )
   )
   private void apollo$sendRayTraceAirClick$v1_8(EntityPlayer var1, World var2, ItemStack var3, CallbackInfoReturnable<Boolean> var4) {
      this.apollo$forwardRayTracePosition(var1, var3, var2);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Unique
   private void apollo$forwardRayTracePosition(EntityPlayer var1, ItemStack var2, World var3) {
      if (var2 != null) {
         if (var2.getItem() instanceof ItemBucket var4) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
               .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(PacketEnrichmentModule.class)
               .filter(var0 -> (Boolean)var0.getOptions().get(PacketEnrichmentModule.PLAYER_USE_ITEM_BUCKET_PACKET))
               .ifPresent(var4x -> {
                  RayTraceResult var5 = var4.getMovingObjectPositionFromPlayer$v1_7(var3, var1, var4.containedBlock == Blocks.AIR);
                  ((IRRCCOICORICIHCHRHIHIHROIRHOCR)var4x).RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.apollo$createRayTraceResult(var5));
               });
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Unique
   private com.lunarclient.apollo.module.packetenrichment.raytrace.RayTraceResult apollo$createRayTraceResult(RayTraceResult var1) {
      if (var1 == null) {
         return new MissResult();
      }

      Type var2 = var1.typeOfHit;
      Vec3d var3 = var1.hitVec;
      String var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().getWorld();
      ApolloLocation var5 = ApolloLocation.builder().world(var4).x(var3.x).y(var3.y).z(var3.z).build();
      switch (var2) {
         case BLOCK:
            ApolloBlockLocation var7;
            int var9;
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               BlockPos var8 = var1.blockPos$v1_8;
               var7 = ApolloBlockLocation.builder().world(var4).x(var8.x$v1_8).y(var8.y$v1_8).z(var8.z$v1_8).build();
               var9 = var1.sideHit$v1_8.getIndex$v1_8();
            } else {
               var7 = ApolloBlockLocation.builder().world(var4).x(var1.blockX$v1_7).y(var1.blockY$v1_7).z(var1.blockZ$v1_7).build();
               var9 = var1.sideHit$v1_7;
            }

            return BlockHitResult.builder().hitLocation(var5).blockLocation(var7).direction(Direction.values()[var9]).build();
         case ENTITY:
            Entity var6 = var1.entityHit;
            return EntityHitResult.builder().hitLocation(var5).entityId(new ApolloEntity(var6.entityId, var6.getUniqueID())).build();
         default:
            return new MissResult();
      }
   }
}
