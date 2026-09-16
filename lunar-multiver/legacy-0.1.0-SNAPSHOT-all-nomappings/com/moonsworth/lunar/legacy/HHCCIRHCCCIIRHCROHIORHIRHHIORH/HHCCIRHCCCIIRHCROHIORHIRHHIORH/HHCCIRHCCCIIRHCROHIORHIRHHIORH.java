package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBanner;
import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Block.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public Material material;
   @Shadow
   public boolean hasTileEntity;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Final
   @Shadow
   public BlockStateContainer blockState$v1_8;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public abstract Item getItem$v1_7(World var1, int var2, int var3, int var4);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1, max = 4)
   @Shadow
   public abstract Item getItem$v1_8(World var1, BlockPos var2);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Shadow
   public abstract ItemStack getItem$v1_12(World var1, BlockPos var2, IBlockState var3);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public abstract int getDamageValue$v1_7(World var1, int var2, int var3, int var4);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Shadow
   public abstract int getDamageValue$v1_8(World var1, BlockPos var2);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Shadow
   public abstract boolean isFlowerPot$v1_7();

   @Shadow
   public abstract String getLocalizedName();

   @Shadow
   public abstract RayTraceResult collisionRayTrace$v1_7(World var1, int var2, int var3, int var4, Vec3d var5, Vec3d var6);

   @Shadow
   public abstract RayTraceResult collisionRayTrace$v1_12(IBlockState var1, World var2, BlockPos var3, Vec3d var4, Vec3d var5);

   @Shadow
   public abstract RayTraceResult collisionRayTrace$v1_8(World var1, BlockPos var2, Vec3d var3, Vec3d var4);

   @Shadow
   public abstract AxisAlignedBB getSelectedBoundingBoxFromPool$v1_7(World var1, int var2, int var3, int var4);

   @Shadow
   public abstract AxisAlignedBB getSelectedBoundingBox$v1_8(World var1, BlockPos var2);

   @Shadow
   public abstract AxisAlignedBB getSelectedBoundingBox$v1_12(IBlockState var1, World var2, BlockPos var3);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Shadow
   public abstract int damageDropped$v1_8(IBlockState var1);

   @Shadow
   public abstract IBlockState getDefaultState$v1_8();

   @Shadow
   public abstract Material getMaterial$v1_7();

   @Shadow
   public abstract Material getMaterial$v1_12(IBlockState var1);

   @Shadow
   public abstract void setBlockBoundsBasedOnState$v1_8(IBlockAccess var1, BlockPos var2);

   @Shadow
   public abstract void setBlockBoundsBasedOnState$v1_7(IBlockAccess var1, int var2, int var3, int var4);

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getValidStates() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return (List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>)this.blockState$v1_8
            .validStates;
      } else {
         throw new RuntimeException("bridge$blockstate not supported on this version!");
      }
   }

   public boolean bridge$isSkull() {
      return (Block)this instanceof BlockSkull;
   }

   public boolean bridge$isFoliage() {
      Block var1 = (Block)this;
      return var1 instanceof BlockDoublePlant || var1 instanceof BlockTallGrass;
   }

   public boolean bridge$isFlower() {
      Block var1 = (Block)this;
      return var1 instanceof BlockFlower;
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getStack(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1 && this.isFlowerPot$v1_7()) {
         return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)(new ItemStack(Items.FLOWER_POT));
      }

      WorldClient var2 = Minecraft.getMinecraft().world;
      if (this.hasTileEntity && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         BlockPos var7 = (BlockPos)var1;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            ItemStack var11 = this.getItem$v1_12(var2, var7, var2.getBlockState$v1_8(var7));
            TileEntity var13 = var2.getTileEntity$v1_8(var7);
            return var13 == null
               ? (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var11
               : (IIRHCHHOICHRICOOCRORCCIOOIHOIR)Minecraft.getMinecraft().storeTEInStack$v1_12(var11, var13);
         } else {
            Item var10 = this.getItem$v1_8(var2, var7);
            TileEntity var12 = var2.getTileEntity$v1_8(var7);
            int var14 = this.getDamageValue$v1_8(var2, var7);
            return var12 == null
               ? (IIRHCHHOICHRICOOCRORCCIOOIHOIR)(new ItemStack(var10, 1, var14))
               : (IIRHCHHOICHRICOOCRORCCIOOIHOIR)Minecraft.getMinecraft().pickBlockWithNBT$v1_8(var10, var14, var12);
         }
      } else {
         ItemStack var3;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            BlockPos var4 = (BlockPos)var1;
            var3 = this.getItem$v1_12(var2, var4, var2.getBlockState$v1_8(var4));
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            BlockPos var8 = (BlockPos)var1;
            var3 = new ItemStack(this.getItem$v1_8(var2, var8));
            if (var3.getItem() != null) {
               var3.setItemDamage$v1_8(this.getDamageValue$v1_8(var2, var8));
            }
         } else {
            int var9 = var1.bridge$getX();
            int var5 = var1.bridge$getY();
            int var6 = var1.bridge$getZ();
            var3 = new ItemStack(this.getItem$v1_7(var2, var9, var5, var6));
            if (var3.getItem() != null) {
               var3.setMetadata$v1_7(this.getDamageValue$v1_7(var2, var9, var5, var6));
            }
         }

         return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var3;
      }
   }

   public boolean bridge$isWater() {
      return this.material == Material.WATER;
   }

   public boolean bridge$isAir() {
      return this.material == Material.AIR;
   }

   public boolean bridge$isFire() {
      return this.material == Material.FIRE;
   }

   public boolean bridge$isSign() {
      return (Block)this instanceof BlockSign;
   }

   public boolean bridge$isPressurePlate() {
      return (Block)this instanceof BlockBasePressurePlate;
   }

   public boolean bridge$isCarpet() {
      return (Block)this instanceof BlockCarpet;
   }

   public boolean bridge$isSmallPot() {
      return (Block)this instanceof BlockFlowerPot;
   }

   public boolean bridge$isBanner() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? (Block)this instanceof BlockBanner : false;
   }

   public boolean bridge$isHandOpenableTrapDoor() {
      Block var2 = (Block)this;
      return var2 instanceof BlockTrapDoor var1 ? var1.material != Material.IRON : false;
   }

   public boolean bridge$isFenceGate() {
      return (Block)this instanceof BlockFenceGate;
   }

   public boolean bridge$isFlippedLever(int var1, int var2, int var3) {
      Block var4 = (Block)this;
      if (var4 instanceof BlockLever var5) {
         WorldClient var6 = Minecraft.getMinecraft().world;
         if (var6 == null) {
            return false;
         } else {
            return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
               ? (Boolean)var6.getBlockState$v1_8(new BlockPos(var1, var2, var3)).getValue(BlockLever.POWERED$v1_8)
               : var5.isProvidingWeakPower$v1_7(var6, var1, var2, var3, 0) == 15;
         }
      } else {
         return false;
      }
   }

   public boolean bridge$isDepressedPlate(int var1, int var2, int var3) {
      Block var4 = (Block)this;
      if (var4 instanceof BlockBasePressurePlate var5) {
         WorldClient var6 = Minecraft.getMinecraft().world;
         if (var6 == null) {
            return false;
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1) {
            return var5.isProvidingWeakPower$v1_7(var6, var1, var2, var3, 0) == 15;
         }

         if (var4 instanceof BlockPressurePlate) {
            return (Boolean)var6.getBlockState$v1_8(new BlockPos(var1, var2, var3)).getValue(BlockPressurePlate.POWERED$v1_8);
         }

         if (var4 instanceof BlockPressurePlateWeighted) {
            return (Integer)var6.getBlockState$v1_8(new BlockPos(var1, var2, var3)).getValue(BlockPressurePlateWeighted.POWER$v1_8) != 0;
         }
      }

      return false;
   }

   public boolean bridge$isCauldron() {
      return (Block)this instanceof BlockCauldron;
   }

   public boolean bridge$isCake() {
      return (Block)this instanceof BlockCake;
   }

   public boolean bridge$isAnyChest() {
      return (Block)this instanceof BlockChest;
   }

   public boolean bridge$isMushroom() {
      return (Block)this instanceof BlockMushroom;
   }

   public boolean bridge$isFlowerPot() {
      return (Block)this instanceof BlockFlowerPot;
   }

   public Component bridge$getName() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
         this.getLocalizedName()
      );
   }

   public boolean bridge$isExcludedFromMinimap() {
      Block var1 = (Block)this;
      return var1 == Blocks.TALLGRASS;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$clip(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2,
      CRHROHHHCIHHCOHCOORCRIHHIICROR var3,
      CRHROHHHCIHHCOHCOORCRIHHIICROR var4
   ) {
      RayTraceResult var5;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var5 = this.collisionRayTrace$v1_12((IBlockState)var1.OCOHORHCROHICRRIHCIHHRRCIHICRI(var2), (World)var1, (BlockPos)var2, (Vec3d)var3, (Vec3d)var4);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var5 = this.collisionRayTrace$v1_8((World)var1, (BlockPos)var2, (Vec3d)var3, (Vec3d)var4);
      } else {
         var5 = this.collisionRayTrace$v1_7((World)var1, var2.bridge$getX(), var2.bridge$getY(), var2.bridge$getZ(), (Vec3d)var3, (Vec3d)var4);
      }

      return var5 != null && var5.typeOfHit != Type.MISS
         ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (CRHROHHHCIHHCOHCOORCRIHHIICROR)var5.hitVec,
            var2,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.byId(
               IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var5.sideHit$v1_8.index : var5.sideHit$v1_7
            )
         )
         : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICHIIOOHCICHRIIORICRROOICOIRRO();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getAABB(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2
   ) {
      int var3 = var2.bridge$getX();
      int var4 = var2.bridge$getY();
      int var5 = var2.bridge$getZ();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         this.setBlockBoundsBasedOnState$v1_7((World)var1, var3, var4, var5);
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getSelectedBoundingBoxFromPool$v1_7(
               (World)var1, var3, var4, var5
            )
            .offset(-var3, -var4, -var5);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         this.setBlockBoundsBasedOnState$v1_8((World)var1, (BlockPos)var2);
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getSelectedBoundingBox$v1_8(
               (World)var1, (BlockPos)var2
            )
            .offset(-var3, -var4, -var5);
      } else {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getSelectedBoundingBox$v1_12(
               (IBlockState)var1.OCOHORHCROHICRRIHCIHHRRCIHICRI(var2), (World)var1, (BlockPos)var2
            )
            .offset(-var3, -var4, -var5);
      }
   }

   public boolean bridge$hasCollision(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         int var6 = var2.bridge$getX();
         int var7 = var2.bridge$getY();
         int var5 = var2.bridge$getZ();
         return ((Block)var1.bridge$getBlockAt(var6, var7, var5)).getCollisionBoundingBoxFromPool$v1_7((World)var1, var6, var7, var5) != null;
      } else {
         IBlockState var3 = (IBlockState)var1.OCOHORHCROHICRRIHCIHHRRCIHICRI(var2);
         Block var4 = (Block)var1.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var2);
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
            ? var4.getCollisionBoundingBox$v1_12(var3, (World)var1, (BlockPos)var2) != null
            : var4.getCollisionBoundingBox$v1_8((World)var1, (BlockPos)var2, var3) != null;
      }
   }

   public boolean bridge$entityCanStandOn(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var3
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         int var8 = var2.bridge$getX();
         int var9 = var2.bridge$getY();
         int var6 = var2.bridge$getZ();
         Block var7 = (Block)var1.bridge$getBlockAt(var8, var9, var6);
         return var7.isOpaqueCube$v1_7() && var7.fullBlock;
      } else {
         IBlockState var4 = (IBlockState)var1.OCOHORHCROHICRRIHCIHHRRCIHICRI(var2);
         Block var5 = var4.getBlock();
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var5.isTopSolid$v1_12(var4) : var5.isOpaqueCube$v1_7() && var5.fullBlock;
      }
   }

   public int bridge$getDamageValue(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      RORCHCIIICOHIRROOORHOCCCCIOCCI var2
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0
         ? this.getDamageValue$v1_7((World)var1, var2.bridge$getX(), var2.bridge$getY(), var2.bridge$getZ())
         : this.damageDropped$v1_8(((World)var1).getBlockState$v1_8((BlockPos)var2));
   }

   public int bridge$getPreFlatteningID() {
      return Block.getIdFromBlock((Block)this);
   }

   public String bridge$getRegistryName() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         String var2 = Block.blockRegistry$v1_7.getNameForObject((Block)this);
         return var2 != null ? var2 : Item.itemRegistry$v1_7.getNameForObject(Item.getItemFromBlock((Block)this));
      } else {
         ResourceLocation var1 = (ResourceLocation)Block.REGISTRY$v1_8.getNameForObject((Block)this);
         return var1 != null ? var1.toString() : ((ResourceLocation)Item.REGISTRY$v1_8.getNameForObject(Item.getItemFromBlock((Block)this))).toString();
      }
   }

   public float bridge$getDestroySpeed() {
      Object var1;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         var1 = Minecraft.getMinecraft().thePlayer$v1_7;
      } else {
         var1 = Minecraft.getMinecraft().player$v1_8;
      }

      float var2 = this.calculateSpeedFactor((EntityPlayer)var1);
      Block var3 = (Block)this;
      float var4 = 0.0F;
      boolean var5 = false;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         var4 = var3.getBlockHardness$v1_7(null, 0, 0, 0);
         var5 = var1.canHarvestBlock$v1_7(var3);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         var4 = var3.getBlockHardness$v1_8(null, null);
         var5 = var1.canHarvestBlock$v1_7(var3);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         var4 = var3.getBlockHardness$v1_12(null, null, null);
         var5 = var1.canHarvestBlock$v1_12(var3.getDefaultState$v1_8());
      }

      float var6 = (float)(var4 * (var5 ? 1.5 : 5.0));
      return var6 / var2;
   }

   private float calculateSpeedFactor(EntityPlayer var1) {
      Block var2 = (Block)this;
      ItemStack var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? var1.getHeldItem$v1_12(EnumHand.MAIN_HAND) : var1.getCurrentEquippedItem$v1_7();
      float var4 = 1.0F;
      if (var3 != null) {
         var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? var3.getDestroySpeed$v1_12(var2.getDefaultState$v1_8()) : var3.getStrVsBlock$v1_7(var2);
      }

      if (var4 > 1.0F) {
         int var5 = EnchantmentHelper.getEfficiencyModifier(var1);
         if (var5 > 0 && var3 != null) {
            var4 += var5 * var5 + 1;
         }
      }

      if (var1.isPotionActive(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? MobEffects.HASTE : Potion.digSpeed$v1_7)) {
         PotionEffect var6 = var1.getActivePotionEffect(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? MobEffects.HASTE : Potion.digSpeed$v1_7);
         var4 *= 1.0F + (var6.getAmplifier() + 1) * 0.2F;
      }

      if (var1.isPotionActive(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? MobEffects.MINING_FATIGUE : Potion.digSlowdown$v1_7)) {
         var4 *= switch (var1.getActivePotionEffect(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? MobEffects.MINING_FATIGUE : Potion.digSlowdown$v1_7)
            .getAmplifier()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (var1.isInsideOfMaterial(Material.WATER) && !EnchantmentHelper.getAquaAffinityModifier(var1)) {
         var4 /= 5.0F;
      }

      if (!var1.onGround) {
         var4 /= 5.0F;
      }

      return var4;
   }

   public boolean bridge$breaksByPickaxe() {
      ItemTool var1 = (ItemTool)Items.WOODEN_PICKAXE;
      ItemStack var2 = new ItemStack(var1);
      return (
            IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5
               ? var1.getDestroySpeed$v1_12(var2, this.getDefaultState$v1_8())
               : var1.getStrVsBlock$v1_7(var2, (Block)this)
         )
         != 1.0F;
   }

   public boolean bridge$breaksByAxe() {
      ItemTool var1 = (ItemTool)Items.WOODEN_AXE;
      ItemStack var2 = new ItemStack(var1);
      return (
               IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5
                  ? var1.getDestroySpeed$v1_12(var2, this.getDefaultState$v1_8())
                  : var1.getStrVsBlock$v1_7(var2, (Block)this)
            )
            != 1.0F
         && this.bridge$getDestroySpeed() > 0.0F;
   }

   public boolean bridge$breaksByShovel() {
      ItemTool var1 = (ItemTool)Items.WOODEN_SHOVEL;
      ItemStack var2 = new ItemStack(var1);
      return (
            IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5
               ? var1.getDestroySpeed$v1_12(var2, this.getDefaultState$v1_8())
               : var1.getStrVsBlock$v1_7(var2, (Block)this)
         )
         != 1.0F;
   }

   public boolean bridge$breaksByHoe() {
      return false;
   }

   public boolean bridge$breaksByShears() {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = this;
      boolean var2 = (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? this.getMaterial$v1_12(null) : this.getMaterial$v1_7()) == Material.LEAVES;
      return var2
         || var1 == Blocks.WEB
         || var1 instanceof BlockDoublePlant
         || var1 instanceof BlockBush && !(var1 instanceof BlockFlower) && var1 != Blocks.SAPLING
         || var1 == Blocks.VINE
         || var1 == Blocks.TRIPWIRE
         || var1 == Blocks.WOOL;
   }

   public boolean bridge$isCubeBlock() {
      return ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0
               ? new com.moonsworth.lunar.legacy.wrapper.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH((Block)this)
               : this.getDefaultState$v1_8()
         ))
         .bridge$isCubeBlock();
   }

   public boolean bridge$isSpawner() {
      return this == Blocks.MOB_SPAWNER;
   }

   public boolean bridge$isGlass() {
      return this == Blocks.GLASS || this == Blocks.STAINED_GLASS;
   }
}
