package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldType;
import net.minecraft.world.storage.WorldInfo;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(World.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH, IBlockAccess {
   @Final
   @Shadow
   public boolean isRemote;
   @Shadow
   public WorldInfo worldInfo;
   @Shadow
   public Set<ChunkPos> activeChunkSet$v1_8;
   @Final
   @Shadow
   public Profiler profiler;
   @Final
   @Shadow
   public List<EntityPlayer> playerEntities$v1_8;
   @Shadow
   public int ambientTickCountdown$v1_7;
   @Final
   @Shadow
   public Random rand;
   @Shadow
   public Set activeChunkSet$v1_7;
   @Shadow
   public List playerEntities$v1_7;
   @Final
   @Shadow
   public List<Entity> loadedEntityList$v1_8;
   @Shadow
   public List loadedEntityList$v1_7;
   @Unique
   private int lunar$playerChunkX;
   @Unique
   private int lunar$playerChunkZ;

   @Shadow
   public abstract void onEntityAdded(Entity var1);

   @Shadow
   public abstract boolean checkLight$v1_8(BlockPos var1);

   @Shadow
   public abstract boolean updateAllLightTypes$v1_7(int var1, int var2, int var3);

   @ModifyReturnValue(method = "getHorizon", at = @At("RETURN"))
   private double lunar$getHorizon(double var1) {
      if (!this.isRemote) {
         return var1;
      }

      IIHRRHORCRCROCHHOHORCHCROCIHRO var3 = (IIHRRHORCRCROCHHOHORCHCROCIHRO)HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIHRRHORCRCROCHHOHORCHCROCIHRO.class, () -> {
            IIHRRHORCRCROCHHOHORCHCROCIHRO var2 = new IIHRRHORCRCROCHHOHORCHCROCIHRO();
            var2.setValue(var1);
            return var2;
         });
      return var3 != null && this.worldInfo.getTerrainType() != WorldType.FLAT ? var3.getValue() : var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(method = "markBlocksDirtyVertical", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/WorldProvider;hasSkyLight$v1_12()Z"))
   private boolean lunar$markBlocksDirtyVertical$v1_12(WorldProvider var1) {
      return this.isRemote
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .HHCRORCOROHHHRRIICHHROOOCHHIIH()
               .RCHCOORHCOOIIRRCRCRHHCIIICIOCC()
         ? false
         : var1.hasSkyLight$v1_12();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Redirect(method = "markBlocksDirtyVertical", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/WorldProvider;getHasNoSky$v1_8()Z"))
   private boolean lunar$markBlocksDirtyVertical$v1_8(WorldProvider var1) {
      return var1.getHasNoSky$v1_8()
         || this.isRemote
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .HHCRORCOROHHHRRIICHHROOOCHHIIH()
               .RCHCOORHCOOIIRRCRCRHHCIIICIOCC();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "markBlocksDirtyVertical", at = @At(value = "FIELD", target = "Lnet/minecraft/world/WorldProvider;nether:Z"))
   public boolean lunar$markBlocksDirtyVertical$getHasNoSky(WorldProvider var1) {
      return var1.nether
         || this.isRemote
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .HHCRORCOROHHHRRIICHHROOOCHHIIH()
               .RCHCOORHCOOIIRRCRCRHHCIIICIOCC();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "checkLight$v1_8", at = @At("HEAD"), cancellable = true)
   private void lunar$checkLight$v1_8(BlockPos var1, CallbackInfoReturnable<Boolean> var2) {
      if (this.isRemote
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HHCRORCOROHHHRRIICHHROOOCHHIIH()
            .RCHCOORHCOOIIRRCRCRHHCIIICIOCC()) {
         var2.setReturnValue(true);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "updateAllLightTypes$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$checkLight$v1_7(int var1, int var2, int var3, CallbackInfoReturnable<Boolean> var4) {
      if (this.isRemote
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HHCRORCOROHHHRRIICHHROOOCHHIIH()
            .RCHCOORHCOOIIRRCRCRHHCIIICIOCC()) {
         var4.setReturnValue(true);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "checkLightFor$v1_8", at = @At("HEAD"), cancellable = true)
   private void lunar$checkLightFor$v1_8(EnumSkyBlock var1, BlockPos var2, CallbackInfoReturnable<Boolean> var3) {
      if (this.isRemote
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HHCRORCOROHHHRRIICHHROOOCHHIIH()
            .RCHCOORHCOOIIRRCRCRHHCIIICIOCC()) {
         var3.setReturnValue(true);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "updateLightByType$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$checkLightFor$v1_7(EnumSkyBlock var1, int var2, int var3, int var4, CallbackInfoReturnable<Boolean> var5) {
      if (this.isRemote
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HHCRORCOROHHHRRIICHHROOOCHHIIH()
            .RCHCOORHCOOIIRRCRCRHHCIIICIOCC()) {
         var5.setReturnValue(true);
      }
   }

   @Inject(
      method = {
            "getCollisionBoxes$v1_12(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;",
            "getCollidingBoundingBoxes$v1_8",
            "getCollidingBoundingBoxes$v1_7"
      },
      at = @At("RETURN")
   )
   private void lunar$collisionsEvent(Entity var1, AxisAlignedBB var2, CallbackInfoReturnable<List<AxisAlignedBB>> var3) {
      if (this.isRemote) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  (CRRRICCRROCOHHOHIICIHORCOORRRH)var1,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2,
                  (List)var3.getReturnValue()
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = {"getCollisionBoxes$v1_8", "func_147461_a$v1_7"}, at = @At("RETURN"))
   private void lunar$collisionBoxesEvent(AxisAlignedBB var1, CallbackInfoReturnable<List<AxisAlignedBB>> var2) {
      if (this.isRemote) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  null,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
                  (List)var2.getReturnValue()
               )
            );
      }
   }

   @Unique
   private void lunar$entityJoinWorldEvent(Entity var1, CallbackInfoReturnable<Boolean> var2) {
      if (this.isRemote) {
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class, () -> new OOROOCCIRCCRHOIOIORIHCHHOOCCOR((CRRRICCRROCOHHOHIICIHORCOORRRH)var1, this)
            );
         if (var3 != null && var3.isCancelled() && !var1.forceSpawn && !(var1 instanceof EntityPlayer)) {
            var2.setReturnValue(false);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "spawnEntity$v1_12",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getChunk$v1_12(II)Lnet/minecraft/world/chunk/Chunk;", shift = Shift.BEFORE),
      cancellable = true
   )
   private void lunar$entityJoinWorldEvent$v1_12(Entity var1, CallbackInfoReturnable<Boolean> var2) {
      this.lunar$entityJoinWorldEvent(var1, var2);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(
      method = "spawnEntityInWorld$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getChunkFromChunkCoords$v1_7(II)Lnet/minecraft/world/chunk/Chunk;", shift = Shift.BEFORE),
      cancellable = true
   )
   private void lunar$entityJoinWorldEvent$v1_7(Entity var1, CallbackInfoReturnable<Boolean> var2) {
      this.lunar$entityJoinWorldEvent(var1, var2);
   }

   @Unique
   private void lunar$entityJoinWorldEvent(Collection<Entity> var1, CallbackInfo var2) {
      if (this.isRemote) {
         for (Entity var4 : var1) {
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR var5 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class, () -> new OOROOCCIRCCRHOIOIORIHCHHOOCCOR((CRRRICCRROCOHHOHIICIHORCOORRRH)var4, this)
               );
            if (var5 != null && !var5.isCancelled()) {
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                  this.loadedEntityList$v1_8.add(var4);
               } else {
                  this.loadedEntityList$v1_7.add(var4);
               }

               this.onEntityAdded(var4);
            }
         }

         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "loadEntities$v1_8", at = @At("HEAD"), cancellable = true)
   private void lunar$entityJoinWorldEvent$v1_8(Collection<Entity> var1, CallbackInfo var2) {
      this.lunar$entityJoinWorldEvent(var1, var2);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "addLoadedEntities$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$entityJoinWorldEvent$v1_7(List<Entity> var1, CallbackInfo var2) {
      this.lunar$entityJoinWorldEvent(var1, var2);
   }

   @Inject(
      method = "joinEntityInSurroundings",
      at = @At(value = "FIELD", target = "Lnet/minecraft/world/World;loadedEntityList:Ljava/util/List;", opcode = 180, ordinal = 1),
      cancellable = true
   )
   private void lunar$entityJoinWorldEvent(Entity var1, CallbackInfo var2) {
      if (this.isRemote) {
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class, () -> new OOROOCCIRCCRHOIOIORIHCHHOOCCOR((CRRRICCRROCOHHOHIICIHORCOORRRH)var1, this)
            );
         if (var3 != null && var3.isCancelled()) {
            var2.cancel();
         }
      }
   }

   @Inject(method = "removeEntity", at = @At("TAIL"))
   private void lunar$entityRemoveEvents(Entity var1, CallbackInfo var2) {
      if (this.isRemote) {
         if (var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
            )
          {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR.class, () -> new CIOHHCORHRCCRICCCORIHCRHCCCRRR(var3));
         } else if (var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH var4
            )
          {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
                  () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     var4
                  )
               );
         } else {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IIRHCHHOICHRICOOCRORCCIOOIHOIR.class, () -> new IIRHCHHOICHRICOOCRORCCIOOIHOIR((CRRRICCRROCOHHOHIICIHORCOORRRH)var1)
               );
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "setActivePlayerChunksAndCheckLight$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$fasterChunksCalculation(CallbackInfo var1) {
      if (this.isRemote) {
         var1.cancel();
         Minecraft var2 = Minecraft.getMinecraft();
         Object var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var2.player$v1_8 : var2.thePlayer$v1_7;
         Set var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.activeChunkSet$v1_8 : this.activeChunkSet$v1_7;
         int var5 = MathHelper.floor_double$v1_7(((EntityPlayerSP)var3).posX / 16.0);
         int var6 = MathHelper.floor_double$v1_7(((EntityPlayerSP)var3).posZ / 16.0);
         if (var5 != this.lunar$playerChunkX || var6 != this.lunar$playerChunkZ) {
            this.lunar$playerChunkX = var5;
            this.lunar$playerChunkZ = var6;
            var4.clear();
            int var7 = var2.gameSettings.renderDistanceChunks;
            this.profiler.startSection("buildList");
            int var8 = MathHelper.floor_double$v1_7(((EntityPlayerSP)var3).posX / 16.0);
            int var9 = MathHelper.floor_double$v1_7(((EntityPlayerSP)var3).posZ / 16.0);

            for (int var10 = -var7; var10 <= var7; var10++) {
               for (int var11 = -var7; var11 <= var7; var11++) {
                  var4.add(new ChunkPos(var10 + var8, var11 + var9));
               }
            }

            this.profiler.endSection();
         }

         if (this.ambientTickCountdown$v1_7 > 0) {
            this.ambientTickCountdown$v1_7--;
         }

         this.profiler.startSection("playerCheckLight");
         List var13 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.playerEntities$v1_8 : this.playerEntities$v1_7;
         if (!var13.isEmpty()) {
            int var14 = this.rand.nextInt(var13.size());
            EntityPlayer var15 = (EntityPlayer)var13.get(var14);
            int var16 = MathHelper.floor_double$v1_7(var15.posX) + this.rand.nextInt(11) - 5;
            int var17 = MathHelper.floor_double$v1_7(var15.posY) + this.rand.nextInt(11) - 5;
            int var12 = MathHelper.floor_double$v1_7(var15.posZ) + this.rand.nextInt(11) - 5;
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               this.checkLight$v1_8(new BlockPos(var16, var17, var12));
            } else {
               this.updateAllLightTypes$v1_7(var16, var17, var12);
            }
         }

         this.profiler.endSection();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "spawnParticle$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$onSpawnParticle$v1_7(String var1, double var2, double var4, double var6, double var8, double var10, double var12, CallbackInfo var14) {
      if (this.isRemote) {
         IHIRRIIORRHORHRORIHOROIRCORCOO var15 = (IHIRRIIORRHORHRORIHOROIRCORCOO)HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IHIRRIIORRHORHRORIHOROIRCORCOO.class,
               () -> {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var13 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getParticleFromName(
                     var1
                  );
                  if (var13 == null) {
                     if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR) {
                        throw new EnumConstantNotPresentException(
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
                           var1
                        );
                     } else {
                        return null;
                     }
                  } else {
                     float var14x = 0.0F;
                     float var15x = 0.0F;
                     float var16 = 0.0F;
                     if (var13
                        == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRIT
                        )
                      {
                        var14x = 0.9F;
                        var15x = 0.9F;
                        var16 = 0.9F;
                     } else if (var13
                        == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRIT_MAGIC
                        )
                      {
                        var14x = 0.3F;
                        var15x = 0.71999997F;
                        var16 = 0.9F;
                     } else if (var13
                        == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FALLING_DUST
                        )
                      {
                        var14x = (float)var8;
                        var15x = (float)var10;
                        var16 = (float)var12;
                     }

                     return new IHIRRIIORRHORHRORIHOROIRCORCOO(
                        var13.asModernParticle(), var2, var4, var6, (float)var8, (float)var10, (float)var12, var14x, var15x, var16, 0.0F
                     );
                  }
               }
            );
         if (var15 != null && var15.isCancelled()) {
            var14.cancel();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "spawnParticle$v1_8(IZDDDDDD[I)V", at = @At("HEAD"), cancellable = true)
   private void lunar$onSpawnParticle$v1_8(
      int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int[] var15, CallbackInfo var16
   ) {
      if (this.isRemote) {
         IHIRRIIORRHORHRORIHOROIRCORCOO var17 = (IHIRRIIORRHORHRORIHOROIRCORCOO)HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IHIRRIIORRHORHRORIHOROIRCORCOO.class,
               () -> {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var13x = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getParticleFromId(
                     var1
                  );
                  if (var13x == null) {
                     if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR) {
                        throw new EnumConstantNotPresentException(
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
                           String.valueOf(var1)
                        );
                     } else {
                        return null;
                     }
                  } else {
                     float var14 = 0.0F;
                     float var15x = 0.0F;
                     float var16x = 0.0F;
                     if (var13x
                        == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRIT
                        )
                      {
                        var14 = 0.9F;
                        var15x = 0.9F;
                        var16x = 0.9F;
                     } else if (var13x
                        == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRIT_MAGIC
                        )
                      {
                        var14 = 0.3F;
                        var15x = 0.71999997F;
                        var16x = 0.9F;
                     } else if (var13x
                        == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FALLING_DUST
                        )
                      {
                        var14 = (float)var9;
                        var15x = (float)var11;
                        var16x = (float)var13;
                     }

                     return new IHIRRIIORRHORHRORIHOROIRCORCOO(
                        var13x.asModernParticle(), var3, var5, var7, (float)var9, (float)var11, (float)var13, var14, var15x, var16x, 0.0F
                     );
                  }
               }
            );
         if (var17 != null && var17.isCancelled()) {
            var16.cancel();
         }
      }
   }

   @Inject(method = "getRainStrength", at = @At("TAIL"), cancellable = true)
   private void lunar$getRainStrength(float var1, CallbackInfoReturnable<Float> var2) {
      if (this.bridge$isRemote()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .HOORCICIRRCCORHCIHROHRIRIHCOHI();
            if (var3.isEnabled()
               && var3.CCHOOOIRHRRCCRRCCCIORIIOOCCHOI().get()
                  == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RAIN
               )
             {
               var2.setReturnValue(var3.ICOCOHRRCCOIHOIHICIROHHOIIORHH());
            }
         }
      }
   }
}
