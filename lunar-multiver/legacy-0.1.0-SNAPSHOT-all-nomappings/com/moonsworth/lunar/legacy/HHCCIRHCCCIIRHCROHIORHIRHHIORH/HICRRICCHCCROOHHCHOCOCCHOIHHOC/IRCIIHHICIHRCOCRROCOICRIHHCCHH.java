package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC;

import com.google.common.base.Predicate;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.server.SPacketTeams;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ServerScoreboard;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;
import org.joml.Vector3i;
import org.joml.Vector3ic;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(World.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH, IBlockAccess {
   @Final
   @Shadow
   public boolean isRemote;
   @Shadow
   public WorldInfo worldInfo;
   @Final
   @Shadow
   public WorldProvider provider;
   @Shadow
   public List<Entity> loadedEntityList$v1_7;
   @Final
   @Shadow
   public List<Entity> loadedEntityList$v1_8;
   @Final
   @Shadow
   public ISaveHandler saveHandler;
   @Shadow
   public EnumDifficulty difficultySetting$v1_7;
   @Shadow
   public List loadedTileEntityList$v1_7;
   @Shadow
   public List<TileEntity> loadedTileEntityList$v1_8;
   @Shadow
   public IChunkProvider chunkProvider;
   @Unique
   private UUID bridge$uuid;

   @Shadow
   public abstract EntityPlayer getPlayerEntityByUUID(UUID var1);

   @Shadow
   public abstract void setWorldTime(long var1);

   @Shadow
   public abstract void playSound$v1_7(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10);

   @Shadow
   public abstract void playSound$v1_12(double var1, double var3, double var5, SoundEvent var7, SoundCategory var8, float var9, float var10, boolean var11);

   @Shadow
   public abstract Chunk getChunk$v1_12(BlockPos var1);

   @Shadow
   public abstract Chunk getChunkFromBlockCoords$v1_8(BlockPos var1);

   @Shadow
   public abstract Chunk getChunkFromBlockCoords$v1_7(int var1, int var2);

   @Shadow
   public abstract BiomeProvider getBiomeProvider$v1_12();

   @Shadow
   public abstract WorldChunkManager getWorldChunkManager$v1_7();

   @Shadow
   public abstract void spawnParticle$v1_7(String var1, double var2, double var4, double var6, double var8, double var10, double var12);

   @Shadow
   public abstract void spawnParticle$v1_8(
      EnumParticleTypes var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15
   );

   @Shadow
   public abstract void spawnParticle$v1_8(EnumParticleTypes var1, double var2, double var4, double var6, double var8, double var10, double var12, int... var14);

   @Shadow
   public abstract IBlockState getBlockState$v1_8(BlockPos var1);

   @Shadow
   public abstract Block getBlock$v1_7(int var1, int var2, int var3);

   @Shadow
   public abstract boolean isBlockLoaded$v1_8(BlockPos var1);

   @Shadow
   public abstract boolean blockExists$v1_7(int var1, int var2, int var3);

   @Shadow
   public abstract List<AxisAlignedBB> getCollidingBoundingBoxes$v1_7(Entity var1, AxisAlignedBB var2);

   @Shadow
   public abstract List<AxisAlignedBB> getCollidingBoundingBoxes$v1_8(Entity var1, AxisAlignedBB var2);

   @Shadow
   public abstract List<AxisAlignedBB> getCollisionBoxes$v1_12(Entity var1, AxisAlignedBB var2);

   @Shadow
   public abstract int getLightBrightnessForSkyBlocks$v1_7(int var1, int var2, int var3, int var4);

   @Shadow
   public abstract Chunk getChunkFromChunkCoords$v1_7(int var1, int var2);

   @Shadow
   public abstract Chunk getChunk$v1_12(int var1, int var2);

   @Shadow
   public abstract List<Entity> getEntitiesWithinAABB$v1_8(Class<? extends Entity> var1, AxisAlignedBB var2, Predicate<? super Entity> var3);

   @Shadow
   public abstract boolean isChunkLoaded$v1_8(int var1, int var2, boolean var3);

   @Shadow
   public abstract boolean chunkExists$v1_7(int var1, int var2);

   @Shadow
   public abstract Scoreboard getScoreboard();

   @Shadow
   public abstract TileEntity getTileEntity$v1_7(int var1, int var2, int var3);

   @Shadow
   public abstract TileEntity getTileEntity$v1_8(BlockPos var1);

   @Shadow
   public abstract Entity getEntityByID(int var1);

   @Shadow
   public abstract EntityPlayer getPlayerEntityByName(String var1);

   @Shadow
   public abstract boolean checkNoEntityCollision(AxisAlignedBB var1, Entity var2);

   @Shadow
   public abstract List<AxisAlignedBB> getCollisionBoxes$v1_8(AxisAlignedBB var1);

   @Shadow
   public abstract boolean checkBlockCollision(AxisAlignedBB var1);

   @Shadow
   public abstract long getWorldTime();

   @Shadow
   public abstract boolean isRaining();

   @Shadow
   public abstract List func_147461_a$v1_7(AxisAlignedBB var1);

   @Shadow
   public abstract boolean getCollisionBoxes$v1_12(Entity var1, AxisAlignedBB var2, boolean var3, List<AxisAlignedBB> var4);

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH> bridge$getPlayerByUniqueId(
      UUID var1
   ) {
      return Optional.ofNullable(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.getPlayerEntityByUUID(
            var1
         )
      );
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH> bridge$getPlayerByName(
      String var1
   ) {
      return Optional.ofNullable(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.getPlayerEntityByName(
            var1
         )
      );
   }

   public Optional<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getEntityById(int var1) {
      return Optional.ofNullable((CRRRICCRROCOHHOHIICIHORCOORRRH)this.getEntityByID(var1));
   }

   public void bridge$playSound(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.playSound$v1_12(
            var1, var3, var5, (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation(var7)), SoundCategory.NEUTRAL$v1_12, var8, var9, var10
         );
      } else {
         this.playSound$v1_7(var1, var3, var5, var7, var8, var9, var10);
      }
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH> bridge$getPlayerEntities() {
      ArrayList var1 = new ArrayList();

      for (Entity var3 : this.lunar$getLoadedEntityList()) {
         if (var3 instanceof EntityPlayer var4) {
            var1.add(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4
            );
         }
      }

      return var1;
   }

   public List<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getEntities() {
      ArrayList var1 = new ArrayList(this.lunar$getLoadedEntityList().size());

      for (Entity var3 : this.lunar$getLoadedEntityList()) {
         var1.add((CRRRICCRROCOHHOHIICIHORCOORRRH)var3);
      }

      return var1;
   }

   private List<Entity> lunar$getLoadedEntityList() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.loadedEntityList$v1_8 : this.loadedEntityList$v1_7;
   }

   public List<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getEntities(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      java.util.function.Predicate<? super CRRRICCRROCOHHOHIICIHORCOORRRH> var2
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getEntitiesWithinAABB$v1_8(Entity.class, (AxisAlignedBB)var1, var1x -> var2.test((CRRRICCRROCOHHOHIICIHORCOORRRH)var1x))
         : null;
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$getBlockEntities() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? this.loadedTileEntityList$v1_7 : this.loadedTileEntityList$v1_8;
   }

   public Collection<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$getBlockEntities(
      int var1, int var2
   ) {
      Chunk var3;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var3 = this.getChunk$v1_12(var1, var2);
      } else {
         var3 = this.getChunkFromChunkCoords$v1_7(var1, var2);
      }

      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var3.tileEntities$v1_8.values() : var3.chunkTileEntityMap$v1_7.values();
   }

   public boolean bridge$isRemote() {
      return this.isRemote;
   }

   public boolean bridge$isChunkLoaded(int var1, int var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.isChunkLoaded$v1_8(var1, var2, false) : this.chunkExists$v1_7(var1, var2);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getChunkFromBlockCoords(
      Vector3ic var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getChunk$v1_12(
            new BlockPos(var1.x(), var1.y(), var1.z())
         );
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getChunkFromBlockCoords$v1_8(
               new BlockPos(var1.x(), var1.y(), var1.z())
            )
            : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getChunkFromBlockCoords$v1_7(
               var1.x(), var1.z()
            );
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getChunk(
      int var1, int var2
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getChunk$v1_12(
            var1, var2
         )
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getChunkFromChunkCoords$v1_7(
            var1, var2
         );
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$getWorldChunkManager() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.getBiomeProvider$v1_12()
         : (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.getWorldChunkManager$v1_7();
   }

   public void bridge$setWorldTime(long var1) {
      this.setWorldTime(var1);
   }

   public long bridge$getWorldTime() {
      return this.getWorldTime();
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getWorldInfo() {
      return (RRCRRCORICCHOHHIRCHIROOHIIOHCO)this.worldInfo;
   }

   public int bridge$getDimensionId() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.provider.getDimensionType$v1_12().id : this.provider.dimensionId$v1_7;
   }

   public String bridge$getDimensionKey() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return switch (this.provider.getDimensionType$v1_12()) {
            case OVERWORLD -> "minecraft:overworld";
            case NETHER -> "minecraft:the_nether";
            case THE_END -> "minecraft:the_end";
            default -> throw new IncompatibleClassChangeError();
         };
      } else {
         return switch (this.provider.dimensionId$v1_7) {
            case -1 -> "minecraft:the_nether";
            case 0 -> "minecraft:overworld";
            case 1 -> "minecraft:the_end";
            default -> null;
         };
      }
   }

   public void bridge$spawnParticle(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      boolean var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      int... var15
   ) {
      if (var1.isAvailable()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            this.spawnParticle$v1_8(EnumParticleTypes.getParticleFromId(var1.getDataProvider().getId()), var2, var3, var5, var7, var9, var11, var13, var15);
         } else {
            this.spawnParticle$v1_7(var1.getDataProvider().getName(), var3, var5, var7, var9, var11, var13);
         }
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getBiome(
      int var1, int var2, int var3
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getBiome$v1_12(
            new BlockPos(var1, var2, var3)
         );
      } else {
         throw new RuntimeException("bridge$getBiome() Should be implemented in their own mixin for 1.7 & 1.8!");
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBlockState(
      int var1, int var2, int var3
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlockState$v1_8(
            new BlockPos(var1, var2, var3)
         )
         : new com.moonsworth.lunar.legacy.wrapper.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.getBlock$v1_7(var1, var2, var3));
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBlockState(
      double var1, double var3, double var5
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlockState$v1_8(
            new BlockPos(var1, var3, var5)
         )
         : new com.moonsworth.lunar.legacy.wrapper.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.getBlock$v1_7(MathHelper.floor_double$v1_7(var1), MathHelper.floor_double$v1_7(var3), MathHelper.floor_double$v1_7(var5))
         );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBlockAt(
      int var1, int var2, int var3
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlockState$v1_8(
               new BlockPos(var1, var2, var3)
            )
            .getBlock()
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlock$v1_7(
            var1, var2, var3
         );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBlockAt(
      double var1, double var3, double var5
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlockState$v1_8(
               new BlockPos(var1, var3, var5)
            )
            .getBlock()
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlock$v1_7(
            MathHelper.floor_double$v1_7(var1), MathHelper.floor_double$v1_7(var3), MathHelper.floor_double$v1_7(var5)
         );
   }

   public boolean bridge$isBlockLoaded(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.isBlockLoaded$v1_8((BlockPos)var1)
         : this.blockExists$v1_7(var1.bridge$getX(), var1.bridge$getY(), var1.bridge$getZ());
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getBlockCollisionBoxes(
      @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         ArrayList var3 = new ArrayList();
         this.getCollisionBoxes$v1_12((Entity)var1, (AxisAlignedBB)var2, false, var3);
         return var3;
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? this.getCollisionBoxes$v1_8((AxisAlignedBB)var2)
            : this.func_147461_a$v1_7((AxisAlignedBB)var2);
      }
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getCollisionBoxes(
      @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.getCollisionBoxes$v1_12((Entity)var1, (AxisAlignedBB)var2);
      } else if (var1 == null) {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? this.getCollisionBoxes$v1_8((AxisAlignedBB)var2)
            : this.func_147461_a$v1_7((AxisAlignedBB)var2);
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? this.getCollidingBoundingBoxes$v1_8((Entity)var1, (AxisAlignedBB)var2)
            : this.getCollidingBoundingBoxes$v1_7((Entity)var1, (AxisAlignedBB)var2);
      }
   }

   public int bridge$getPackedLight(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getCombinedLight$v1_8((BlockPos)var1, 0)
         : this.getLightBrightnessForSkyBlocks$v1_7(var1.bridge$getX(), var1.bridge$getY(), var1.bridge$getZ(), 0);
   }

   public boolean bridge$isInWater(double var1, double var3, double var5) {
      Block var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getBlockState$v1_8(new BlockPos(var1, var3, var5)).getBlock()
         : this.getBlock$v1_7(MathHelper.floor_double$v1_7(var1), MathHelper.floor_double$v1_7(var3), MathHelper.floor_double$v1_7(var5));
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? var7 == Blocks.WATER$v1_8 || var7 == Blocks.FLOWING_WATER$v1_8
         : var7 == Blocks.water$v1_7 || var7 == Blocks.flowing_water$v1_7;
   }

   public File bridge$getWorldDirectory() {
      return this.saveHandler.getWorldDirectory();
   }

   public UUID bridge$getWorldId() {
      if (this.bridge$uuid == null) {
         File var1 = new File(this.saveHandler.getWorldDirectory(), "uuid.txt");

         try {
            if (var1.exists()) {
               this.bridge$uuid = UUID.fromString(Files.readString(var1.toPath()));
            } else {
               this.bridge$uuid = UUID.randomUUID();
               Files.writeString(var1.toPath(), this.bridge$uuid.toString());
            }
         } catch (IOException var3) {
            throw new RuntimeException(var3);
         }
      }

      return this.bridge$uuid;
   }

   @Unique
   private void lunar$worldEffectEvent(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      int var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3,
      int var4
   ) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ORHIOICIOCRRHOOCOHRORIHICHRCRR.class, () -> new ORHIOICIOCRRHOOCOHRORIHICHRCRR(var1, var2, var3, var4))
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @Inject(method = "playAuxSFXAtEntity$v1_7", at = @At("HEAD"))
   private void lunar$worldEffectEvent$v1_7(EntityPlayer var1, int var2, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      this.lunar$worldEffectEvent(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1,
         var2,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)(new Vector3i(var3, var4, var5)),
         var6
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = {"playAuxSFXAtEntity$v1_8", "playEvent$v1_12(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V"},
      at = @At("HEAD")
   )
   private void lunar$worldEffectEvent$v1_8(EntityPlayer var1, int var2, BlockPos var3, int var4, CallbackInfo var5) {
      this.lunar$worldEffectEvent(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1,
         var2,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3,
         var4
      );
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getScoreboardPackets() {
      ArrayList var1 = new ArrayList();
      ServerScoreboard var2 = new ServerScoreboard(null);
      ((com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2)
         .bridge$setObjectiveDisplaySlots(this.getScoreboard().objectiveDisplaySlots);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         ((com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2)
            .bridge$setField96544c$v1_7(this.getScoreboard().field_96544_c$v1_7);
      } else {
         ((com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2)
            .bridge$setEntitiesScoreObjectives$v1_8(this.getScoreboard().entitiesScoreObjectives$v1_8);
      }

      for (ScorePlayerTeam var5 : IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0 ? this.getScoreboard().getTeams$v1_7() : this.getScoreboard().getTeams$v1_8()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1 || var5.color$v1_8 != null) {
            var1.add(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH)(new SPacketTeams(var5, 0))
            );
         }
      }

      for (ScoreObjective var6 : (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0
            ? this.getScoreboard().scoreObjectives$v1_7
            : this.getScoreboard().scoreObjectives$v1_8)
         .values()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
            var1.addAll(var2.func_96550_d$v1_7(var6));
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
            var1.addAll(var2.func_96550_d$v1_8(var6));
         } else {
            var1.addAll(var2.getCreatePackets$v1_12(var6));
         }
      }

      return var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getBlockEntity(
      RORCHCIIICOHIRROOORHOCCCCIOCCI var1
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getTileEntity$v1_7(
            var1.bridge$getX(), var1.bridge$getY(), var1.bridge$getZ()
         )
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getTileEntity$v1_8(
            (BlockPos)var1
         );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getScoreBoard() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH)this.getScoreboard();
   }

   public boolean bridge$noCollision(
      @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      return this.checkBlockCollision((AxisAlignedBB)var2) ? false : this.checkNoEntityCollision((AxisAlignedBB)var2, (Entity)var1);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getPathTypeFromState(
      RORCHCIIICOHIRROOORHOCCCCIOCCI var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.OCOHORHCROHICRRIHCIHHRRCIHICRI(
         var1
      );
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = var2.bridge$getBlock();
      Block var4 = (Block)var3;
      if (var3.bridge$isAir()) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OPEN;
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var4 != Blocks.CACTUS$v1_8 : var4 != Blocks.cactus$v1_7) {
         if (var4 == Blocks.COCOA) {
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.COCOA;
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? var4 != Blocks.LAVA$v1_8 && var4 != Blocks.FLOWING_LAVA$v1_8
            : var4 != Blocks.lava$v1_7 && var4 != Blocks.flowing_lava$v1_7) {
            if (var4 != Blocks.FIRE && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 || var4 != Blocks.MAGMA$v1_12)) {
               if (var4 == Blocks.WATERLILY || var4 instanceof BlockTrapDoor) {
                  return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRAPDOOR;
               }

               if (var4 instanceof BlockDoor) {
                  return var2.bridge$getOpenValue()
                     ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DOOR_OPEN
                     : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DOOR_CLOSED;
               }

               if (var4 instanceof BlockRailBase) {
                  return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RAIL;
               }

               if (var4 instanceof BlockLeaves) {
                  return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LEAVES;
               }

               if ((!(var4 instanceof BlockFenceGate) || var2.bridge$getOpenValue()) && !(var4 instanceof BlockFence) && !(var4 instanceof BlockWall)) {
                  if (!var2.bridge$isPathfindable(
                     this,
                     var1,
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.LAND
                  )) {
                     return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BLOCKED;
                  } else {
                     return (
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
                              ? var4 != Blocks.WATER$v1_8 && var4 != Blocks.FLOWING_WATER$v1_8
                              : var4 != Blocks.water$v1_7 && var4 != Blocks.flowing_water$v1_7
                        )
                        ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OPEN
                        : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WATER;
                  }
               } else {
                  return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FENCE;
               }
            } else {
               return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DAMAGE_FIRE;
            }
         } else {
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LAVA;
         }
      } else {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DAMAGE_OTHER;
      }
   }

   public boolean bridge$isRaining() {
      return this.worldInfo.isRaining();
   }

   public boolean bridge$isThundering() {
      return this.worldInfo.isThundering();
   }
}
