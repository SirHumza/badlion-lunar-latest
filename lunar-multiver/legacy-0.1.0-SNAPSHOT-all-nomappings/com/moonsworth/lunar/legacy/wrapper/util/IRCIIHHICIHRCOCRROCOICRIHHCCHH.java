package com.moonsworth.lunar.legacy.wrapper.util;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Block IOHHIIIHRHCCHRIICCHIOHOOIOICCH;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Block var1) {
      this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH = var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBlock() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$clip(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2,
      CRHROHHHCIHHCOHCOORCRIHHIICROR var3,
      CRHROHHHCIHHCOHCOORCRIHHIICROR var4
   ) {
      return ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH)
         .bridge$clip(var1, var2, var3, var4);
   }

   public double bridge$getCollisionHeight(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.maxY$v1_7;
   }

   public double bridge$getCollisionShapeMaxY(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2
   ) {
      int var3 = var2.bridge$getX();
      int var4 = var2.bridge$getY();
      int var5 = var2.bridge$getZ();
      this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.setBlockBoundsBasedOnState$v1_7((World)var1, var3, var4, var5);
      AxisAlignedBB var6 = this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.getCollisionBoundingBoxFromPool$v1_7((World)var1, var3, var4, var5);
      return var6 == null ? 0.0 : var6.maxY - var4;
   }

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI bridge$getFacingValue() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBedPartValue() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public boolean bridge$isFluid() {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH == Blocks.water$v1_7 || this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH == Blocks.lava$v1_7;
   }

   public boolean bridge$isSolid() {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.material.isSolid();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getRenderShape() {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.getRenderType$v1_7() == -1
         ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INVISIBLE
         : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MODEL;
   }

   public int bridge$getMapColor(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2,
      int var3,
      int var4
   ) {
      Chunk var5 = (Chunk)var1;
      int var6 = (var1.bridge$getX() << 4) + var2;
      int var7 = (var1.bridge$getZ() << 4) + var4;
      if (this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH instanceof BlockGrass var8) {
         return 0xFF000000 | var8.colorMultiplier$v1_7(var5.world, var6, var3, var7);
      } else {
         return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH instanceof BlockLeaves var9
            ? 0xFF000000 | var9.colorMultiplier$v1_7(var5.world, var6, var3, var7)
            : this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.getMapColor$v1_7(var5.getBlockMetadata$v1_7(var2, var3, var4)).colorValue;
      }
   }

   public float bridge$getHardness(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2
   ) {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public boolean bridge$breaksWithPickaxe() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public boolean bridge$breaksWithAxe() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public boolean bridge$breaksWithShovel() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public int bridge$getBites() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public int bridge$getLayersValue() {
      return 5;
   }

   public boolean bridge$getOpenValue() {
      return false;
   }

   public boolean bridge$isPathfindable(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      return CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this, var3);
   }

   public boolean bridge$isCollisionShapeFullBlock(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.isFullBlock$v1_7();
   }

   public boolean bridge$isCollisionFaceFull(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      AxisAlignedBB var4 = this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH
         .getCollisionBoundingBoxFromPool$v1_7((World)var1, var2.bridge$getX(), var2.bridge$getY(), var2.bridge$getZ());
      if (var4 == null) {
         return false;
      } else {
         var4 = var4.getOffsetBoundingBox$v1_7(-var2.bridge$getX(), -var2.bridge$getY(), -var2.bridge$getZ());
         if (var3
            == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOWN
            )
          {
            return var4.minY == 0.0 && var4.minZ <= 0.0 && var4.maxZ >= 1.0 && var4.minX <= 0.0 && var4.maxX >= 1.0;
         } else if (var3
            == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.UP
            )
          {
            return var4.maxY == 1.0 && var4.minZ <= 0.0 && var4.maxZ >= 1.0 && var4.minX <= 0.0 && var4.maxX >= 1.0;
         } else if (var3
            == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.NORTH
            )
          {
            return var4.minZ == 0.0 && var4.minY <= 0.0 && var4.maxY >= 1.0 && var4.minX <= 0.0 && var4.maxX >= 1.0;
         } else if (var3
            == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SOUTH
            )
          {
            return var4.maxZ == 1.0 && var4.minY <= 0.0 && var4.maxY >= 1.0 && var4.minX <= 0.0 && var4.maxX >= 1.0;
         } else if (var3
            == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.WEST
            )
          {
            return var4.minX == 0.0 && var4.minY <= 0.0 && var4.maxY >= 1.0 && var4.minZ <= 0.0 && var4.maxZ >= 1.0;
         } else {
            return var3
                  != com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.EAST
               ? false
               : var4.maxX == 1.0 && var4.minY <= 0.0 && var4.maxY >= 1.0 && var4.minZ <= 0.0 && var4.maxZ >= 1.0;
         }
      }
   }

   public boolean bridge$isViewBlocking(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.material.isOpaque();
   }

   public boolean bridge$isOcclusionFaceFull(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.isOpaqueCube$v1_7();
   }

   public boolean bridge$isSmoothDiorite() {
      throw new IllegalStateException("Not implemented");
   }

   public boolean bridge$isCubeBlock() {
      if (!(this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH instanceof BlockSlab)
         && !(this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH instanceof BlockStairs)
         && !(this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH instanceof BlockChest)) {
         Material var1 = this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.material;
         return Material.GRASS == var1
            || Material.GROUND == var1
            || Material.WOOD == var1 && this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.isOpaqueCube$v1_7()
            || Material.ROCK == var1
            || Material.IRON == var1 && this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.isOpaqueCube$v1_7()
            || Material.ANVIL == var1
            || Material.LEAVES == var1
            || Material.SPONGE == var1
            || Material.CLOTH == var1 && !(this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH instanceof BlockBed)
            || Material.SAND == var1
            || Material.GLASS == var1 && !(this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH instanceof BlockPane)
            || Material.TNT == var1
            || Material.ICE == var1
            || Material.PACKED_ICE == var1
            || Material.CRAFTED_SNOW == var1
            || Material.CACTUS == var1
            || Material.CLAY == var1
            || Material.GOURD == var1
            || Material.REDSTONE_LIGHT == var1;
      } else {
         return true;
      }
   }

   public boolean bridge$hasBlockEntity() {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH.hasTileEntity();
   }

   public boolean bridge$isFlowerPot() {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH == Blocks.FLOWER_POT;
   }

   public boolean bridge$isSign() {
      return this.IOHHIIIHRHCCHRIICCHIOHOOIOICCH instanceof BlockSign;
   }
}
