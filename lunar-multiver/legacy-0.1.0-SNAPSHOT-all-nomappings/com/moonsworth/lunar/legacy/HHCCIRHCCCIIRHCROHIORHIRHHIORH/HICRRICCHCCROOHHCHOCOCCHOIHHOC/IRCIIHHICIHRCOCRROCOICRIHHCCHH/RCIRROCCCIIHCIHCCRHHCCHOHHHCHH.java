package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.base.Predicate;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;
import org.joml.Vector3i;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Chunk.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public int x;
   @Final
   @Shadow
   public int z;
   @Final
   @Shadow
   public World world;
   @Shadow
   public boolean loaded;

   @Shadow
   public abstract Biome getBiome$v1_12(BlockPos var1, BiomeProvider var2);

   @Shadow
   public abstract int getHeightValue(int var1, int var2);

   @Shadow
   public abstract boolean isLoaded$v1_8();

   @Shadow
   public abstract IBlockState getBlockState$v1_8(BlockPos var1);

   @Shadow
   public abstract Block getBlock$v1_7(int var1, int var2, int var3);

   @Shadow
   public abstract void getEntitiesWithinAABBForEntity$v1_8(Entity var1, AxisAlignedBB var2, List<Entity> var3, Predicate<? super Entity> var4);

   @Shadow
   public abstract int getSavedLightValue$v1_7(EnumSkyBlock var1, int var2, int var3, int var4);

   @Shadow
   public abstract int getLightFor$v1_8(EnumSkyBlock var1, BlockPos var2);

   public List<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getEntities(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      java.util.function.Predicate<? super CRRRICCRROCOHHOHIICIHORCOORRRH> var2
   ) {
      ArrayList var3 = new ArrayList();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.getEntitiesWithinAABBForEntity$v1_8(null, (AxisAlignedBB)var1, var3, var1x -> var2.test((CRRRICCRROCOHHOHIICIHORCOORRRH)var1x));
      }

      return var3;
   }

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH bridge$getWorld() {
      return (HRCHROOHRIHCRCRHRIIROCIRHOIRHH)this.world;
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getBiome(
      Vector3i var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2
   ) {
      BlockPos var3 = new BlockPos(var1.x(), var1.y(), var1.z());
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getBiome$v1_12(
         var3, (BiomeProvider)var2
      );
   }

   public int bridge$getX() {
      return this.x;
   }

   public int bridge$getZ() {
      return this.z;
   }

   public int bridge$getHeightmapHeight(int var1, int var2) {
      return this.getHeightValue(var1 & 15, var2 & 15);
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
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlockState$v1_8(
            (BlockPos)var1
         );
      }

      int var2 = var1.bridge$getY();
      return var2 >= 0 && var2 <= 255
         ? new com.moonsworth.lunar.legacy.wrapper.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.getBlock$v1_7(var1.bridge$getX() & 15, var2, var1.bridge$getZ() & 15)
         )
         : new com.moonsworth.lunar.legacy.wrapper.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH(Blocks.AIR);
   }

   public int bridge$getSkyLight(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getLightFor$v1_8(EnumSkyBlock.SKY$v1_8, (BlockPos)var1)
         : this.getSavedLightValue$v1_7(EnumSkyBlock.Sky$v1_7, var1.bridge$getX() & 15, Math.min(var1.bridge$getY(), 255), var1.bridge$getZ() & 15);
   }

   public int bridge$getBlockLight(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getLightFor$v1_8(EnumSkyBlock.BLOCK$v1_8, (BlockPos)var1)
         : this.getSavedLightValue$v1_7(EnumSkyBlock.Block$v1_7, var1.bridge$getX() & 15, Math.min(var1.bridge$getY(), 255), var1.bridge$getZ() & 15);
   }

   public boolean bridge$isLoaded() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? this.loaded : this.isLoaded$v1_8();
   }

   public void bridge$setLoaded(boolean var1) {
   }
}
