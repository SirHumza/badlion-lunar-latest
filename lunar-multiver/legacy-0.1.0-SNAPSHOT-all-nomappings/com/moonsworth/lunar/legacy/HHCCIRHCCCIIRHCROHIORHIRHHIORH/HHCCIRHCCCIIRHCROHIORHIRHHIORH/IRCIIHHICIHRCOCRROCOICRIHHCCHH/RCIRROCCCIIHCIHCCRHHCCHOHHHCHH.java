package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.legacy.wrapper.util.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockDaylightDetector;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockStone.EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockProperties;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(BlockStateBase.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   IBlockState {
   @Unique
   private final AtomicReference<Object> lunar$axeBlocks = new AtomicReference<>();

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBlock() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlock();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$clip(
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, RORCHCIIICOHIRROOORHOCCCCIOCCI var2, CRHROHHHCIHHCOHCOORCRIHHIICROR var3, CRHROHHHCIHHCOHCOORCRIHHIICROR var4
   ) {
      return ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getBlock())
         .bridge$clip(var1, var2, var3, var4);
   }

   public double bridge$getCollisionHeight(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         return this.getBlock().maxY$v1_7;
      }

      AxisAlignedBB var3 = ((IBlockProperties)this).getCollisionBoundingBox((IBlockAccess)var1, (BlockPos)var2);
      return var3 == null ? 0.0 : var3.maxY;
   }

   public double bridge$getCollisionShapeMaxY(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, RORCHCIIICOHIRROOORHOCCCCIOCCI var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         this.getBlock().setBlockBoundsBasedOnState$v1_8((IBlockAccess)var1, (BlockPos)var2);
         AxisAlignedBB var4 = this.getBlock().getCollisionBoundingBox$v1_8((World)var1, (BlockPos)var2, this);
         return var4 == null ? 0.0 : var4.maxY - var2.bridge$getY();
      } else {
         AxisAlignedBB var3 = ((IBlockProperties)this).getCollisionBoundingBox((IBlockAccess)var1, (BlockPos)var2);
         return var3 == null ? 0.0 : var3.maxY;
      }
   }

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI bridge$getFacingValue() {
      return (OHHRIOHROOIHOROCIRHCHORIHRRRRI)this.getValue(BlockDirectional.FACING$v1_8);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBedPartValue() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getValue(
         BlockBed.PART$v1_8
      );
   }

   public int bridge$getMapColor(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2,
      int var3,
      int var4
   ) {
      Chunk var5 = (Chunk)var1;
      BlockPos var6 = new BlockPos((var1.bridge$getX() << 4) + var2, var3, (var1.bridge$getZ() << 4) + var4);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         int var10 = Minecraft.getMinecraft().blockColors$v1_12.getColor(this, (World)var1.bridge$getWorld(), var6);
         if (var10 != -1) {
            return var10;
         }

         IBlockProperties var11 = (IBlockProperties)this;
         return var11.getMapColor((World)var1.bridge$getWorld(), var6).colorValue;
      } else if (this.getBlock() instanceof BlockGrass var7) {
         return 0xFF000000 | var7.colorMultiplier$v1_8(var5.world, var6);
      } else {
         return this.getBlock() instanceof BlockLeaves var8
            ? 0xFF000000 | var8.colorMultiplier$v1_8(var5.world, var6)
            : this.getBlock().getMapColor$v1_8(this).getMapColor$v1_8(2);
      }
   }

   public boolean bridge$isFluid() {
      return this.getBlock() == Blocks.WATER$v1_8 || this.getBlock() == Blocks.LAVA$v1_8;
   }

   public boolean bridge$isSolid() {
      return this.getBlock().material.isSolid();
   }

   public boolean bridge$isPathfindable(
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      return CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this, var3);
   }

   public int bridge$getBites() {
      return (Integer)this.getValue(BlockCake.BITES$v1_8);
   }

   public int bridge$getLayersValue() {
      return (Integer)this.getValue(BlockSnow.LAYERS$v1_8);
   }

   public boolean bridge$getOpenValue() {
      return (Boolean)this.getValue(BlockTrapDoor.OPEN$v1_8);
   }

   public float bridge$getHardness(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, RORCHCIIICOHIRROOORHOCCCCIOCCI var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         return this.getBlock().getBlockHardness$v1_7((World)var1, var2.bridge$getX(), var2.bridge$getY(), var2.bridge$getZ());
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1
            ? this.getBlock().getBlockHardness$v1_8((World)var1, (BlockPos)var2)
            : this.getBlock().getBlockHardness$v1_12(this, (World)var1, (BlockPos)var2);
      }
   }

   public boolean bridge$breaksWithPickaxe() {
      ItemTool var1 = (ItemTool)Items.WOODEN_PICKAXE;
      ItemStack var2 = new ItemStack(var1);
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1
         ? var1.getStrVsBlock$v1_7(var2, this.getBlock()) != 1.0F
         : var1.getDestroySpeed$v1_12(var2, this) != 1.0F;
   }

   public boolean bridge$breaksWithAxe() {
      ItemTool var1 = (ItemTool)Items.WOODEN_AXE;
      ItemStack var2 = new ItemStack(var1);
      boolean var3;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         var3 = var1.getStrVsBlock$v1_7(var2, this.getBlock()) != 1.0F;
      } else {
         var3 = var1.getDestroySpeed$v1_12(var2, this) != 1.0F;
      }

      boolean var4 = this.getLunar$axeBlocks().contains(this.getBlock());
      return var3 || var4;
   }

   public boolean bridge$breaksWithShovel() {
      ItemTool var1 = (ItemTool)Items.WOODEN_SHOVEL;
      ItemStack var2 = new ItemStack(var1);
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1
         ? var1.getStrVsBlock$v1_7(var2, this.getBlock()) != 1.0F
         : var1.getDestroySpeed$v1_12(var2, this) != 1.0F;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getRenderShape() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         return this.getBlock().getRenderType$v1_7() == -1
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INVISIBLE
            : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MODEL;
      }

      return switch (this.getBlock().getRenderType$v1_12(this)) {
         case INVISIBLE -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INVISIBLE;
         case ENTITYBLOCK_ANIMATED -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ENTITYBLOCK_ANIMATED;
         case LIQUID, MODEL -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MODEL;
         default -> throw new IncompatibleClassChangeError();
      };
   }

   public boolean bridge$isCollisionShapeFullBlock(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1 ? this.getBlock().isFullBlock$v1_7() : this.getBlock().isFullBlock$v1_12(this);
   }

   public boolean bridge$isCollisionFaceFull(
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      Block var4 = this.getBlock();
      AxisAlignedBB var5;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var5 = var4.getCollisionBoundingBox$v1_12(this, (World)var1, (BlockPos)var2);
      } else {
         var5 = var4.getCollisionBoundingBox$v1_8((World)var1, new BlockPos(0, 0, 0), this);
      }

      if (var5 == null) {
         return false;
      } else if (var3
         == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOWN
         )
       {
         return var5.minY == 0.0 && var5.minZ <= 0.0 && var5.maxZ >= 1.0 && var5.minX <= 0.0 && var5.maxX >= 1.0;
      } else if (var3
         == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.UP
         )
       {
         return var5.maxY == 1.0 && var5.minZ <= 0.0 && var5.maxZ >= 1.0 && var5.minX <= 0.0 && var5.maxX >= 1.0;
      } else if (var3
         == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.NORTH
         )
       {
         return var5.minZ == 0.0 && var5.minY <= 0.0 && var5.maxY >= 1.0 && var5.minX <= 0.0 && var5.maxX >= 1.0;
      } else if (var3
         == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SOUTH
         )
       {
         return var5.maxZ == 1.0 && var5.minY <= 0.0 && var5.maxY >= 1.0 && var5.minX <= 0.0 && var5.maxX >= 1.0;
      } else if (var3
         == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.WEST
         )
       {
         return var5.minX == 0.0 && var5.minY <= 0.0 && var5.maxY >= 1.0 && var5.minZ <= 0.0 && var5.maxZ >= 1.0;
      } else {
         return var3
               != com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.EAST
            ? false
            : var5.maxX == 1.0 && var5.minY <= 0.0 && var5.maxY >= 1.0 && var5.minZ <= 0.0 && var5.maxZ >= 1.0;
      }
   }

   public boolean bridge$isViewBlocking(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH var2) {
      return this.getBlock().material.isOpaque();
   }

   public boolean bridge$isOcclusionFaceFull(
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? this.getBlock().getBlockFaceShape$v1_12((IBlockAccess)var1, this, (BlockPos)var2, EnumFacing.byIndex$v1_12(var3.getId())) == BlockFaceShape.SOLID
         : this.getBlock().isVisuallyOpaque$v1_8();
   }

   public boolean bridge$isSmoothDiorite() {
      return this.getBlock() instanceof BlockStone && this.getValue(BlockStone.VARIANT$v1_8) == EnumType.DIORITE_SMOOTH;
   }

   public boolean bridge$isFlowerPot() {
      return this.getBlock() == Blocks.FLOWER_POT;
   }

   public boolean bridge$isSign() {
      return this.getBlock() instanceof BlockSign;
   }

   public boolean bridge$isCubeBlock() {
      Block var1 = this.getBlock();
      if (!(var1 instanceof BlockSlab) && !(var1 instanceof BlockStairs) && !(var1 instanceof BlockChest) && !(var1 instanceof BlockDaylightDetector)) {
         Material var2 = var1.material;
         return Material.GRASS == var2
            || Material.GROUND == var2
            || Material.WOOD == var2 && this.lunar$isOpaqueCube(var1)
            || Material.ROCK == var2
            || Material.IRON == var2 && this.lunar$isOpaqueCube(var1)
            || Material.ANVIL == var2
            || Material.LEAVES == var2
            || Material.SPONGE == var2
            || Material.CLOTH == var2 && !(var1 instanceof BlockBed)
            || Material.SAND == var2
            || Material.GLASS == var2 && !(var1 instanceof BlockPane)
            || Material.TNT == var2
            || Material.ICE == var2
            || Material.PACKED_ICE == var2
            || Material.CRAFTED_SNOW == var2
            || Material.CACTUS == var2
            || Material.CLAY == var2
            || Material.GOURD == var2
            || Material.REDSTONE_LIGHT == var2;
      } else {
         return true;
      }
   }

   @Unique
   private boolean lunar$isOpaqueCube(Block var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? var1.isOpaqueCube$v1_12(var1.getDefaultState$v1_8()) : var1.isOpaqueCube$v1_7();
   }

   public ImmutableMap<String, Comparable<?>> bridge$getStringProperties() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.getProperties$v1_12()
            .entrySet()
            .stream()
            .collect(ImmutableMap.toImmutableMap(var0 -> ((IProperty)var0.getKey()).getName(), Entry::getValue));
      }

      Builder var1 = ImmutableMap.builder();
      this.getProperties$v1_8().forEach((var1x, var2) -> var1.put(var1x.getName(), var2));
      return var1.build();
   }

   public boolean bridge$hasBlockEntity() {
      return this.getBlock().hasTileEntity();
   }

   @Generated
   public Set<Block> getLunar$axeBlocks() {
      Object var1 = this.lunar$axeBlocks.get();
      if (var1 == null) {
         synchronized (this.lunar$axeBlocks) {
            var1 = this.lunar$axeBlocks.get();
            if (var1 == null) {
               Set var3 = Set.of(
                  Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER
               );
               var1 = var3 == null ? this.lunar$axeBlocks : var3;
               this.lunar$axeBlocks.set(var1);
            }
         }
      }

      return (Set<Block>)(var1 == this.lunar$axeBlocks ? null : var1);
   }
}
